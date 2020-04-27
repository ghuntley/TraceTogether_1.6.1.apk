package zendesk.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import o.C;
import o.D;
import o.F;
import o.G;
import o.O;
import o.P;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

final class ZendeskRequestProvider implements RequestProvider {
    /* access modifiers changed from: private */
    public final AuthenticationProvider authenticationProvider;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final SupportSdkMetadata metadata;
    /* access modifiers changed from: private */
    public final ZendeskRequestService requestService;
    private final RequestSessionCache requestSessionCache;
    /* access modifiers changed from: private */
    public final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider2, RequestStorage requestStorage2, RequestSessionCache requestSessionCache2, ZendeskTracker zendeskTracker2, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider2;
        this.requestStorage = requestStorage2;
        this.requestSessionCache = requestSessionCache2;
        this.zendeskTracker = zendeskTracker2;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    public final void createRequest(final CreateRequest createRequest, final G<Request> g) {
        if (!(createRequest != null)) {
            F.m1358();
            if (g != null) {
                g.onError(new D("configuration is invalid: request null"));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), g);
            }
        });
    }

    /* access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List r5 = O.m1398((List<Type>[]) new List[]{createRequest.getTags(), supportSdkSettings.getContactZendeskTags()});
        if (O.m1394(r5)) {
            F.m1359();
            createRequest.setTags(r5);
        }
    }

    /* access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final G<Request> g) {
        AnonymousClass2 r0 = new ZendeskCallbackSuccess<Request>(g) {
            public void onSuccess(Request request) {
                if (request.getId() == null) {
                    onError(new D("The request was created, but the ID is unknown."));
                    return;
                }
                ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                G g = g;
                if (g != null) {
                    g.onSuccess(request);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS || identity == null || !(identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest((String) null, createRequest, r0);
            return;
        }
        this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, r0);
    }

    /* access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final G<List<Request>> g) {
        if (P.m1409(str)) {
            str = "new,open,pending,hold,solved,closed";
        }
        AnonymousClass3 r0 = new ZendeskCallbackSuccess<List<Request>>(g) {
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                G g = g;
                if (g != null) {
                    g.onSuccess(list);
                }
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData id : requestData) {
                arrayList.add(id.getId());
            }
            if (O.m1399(arrayList)) {
                F.m1361();
                if (g != null) {
                    g.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(P.m1410((List<String>) arrayList), str, "public_updated_at,last_commenting_agents,last_comment,first_comment", r0);
            return;
        }
        this.requestService.getAllRequests(str, "public_updated_at,last_commenting_agents,last_comment,first_comment", r0);
    }

    public final void getAllRequests(G<List<Request>> g) {
        getRequests((String) null, g);
    }

    public final void getRequests(final String str, final G<List<Request>> g) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), g);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g);
                }
            }
        });
    }

    public final void getComments(final String str, final G<CommentsResponse> g) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, g);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g);
                }
            }
        });
    }

    public final void getCommentsSince(String str, Date date, boolean z, G<CommentsResponse> g) {
        final String str2 = str;
        final Date date2 = date;
        final boolean z2 = z;
        final G<CommentsResponse> g2 = g;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str2, date2, z2, g2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final G<Comment> g) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(g) {
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() == null || request.getCommentCount() == null) {
                    F.m1361();
                } else {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                }
                G g = g;
                if (g != null) {
                    g.onSuccess(request.getLastComment());
                }
            }
        });
    }

    public final void addComment(String str, EndUserComment endUserComment, G<Comment> g) {
        final String str2 = str;
        final EndUserComment endUserComment2 = endUserComment;
        final G<Comment> g2 = g;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str2, endUserComment2, g2);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g2);
                }
            }
        });
    }

    public final void getRequest(final String str, final G<Request> g) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(g) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, "public_updated_at,last_commenting_agents,last_comment,first_comment", g);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g);
                }
            }
        });
    }

    public final void getUpdatesForDevice(final G<RequestUpdates> g) {
        if (!this.requestStorage.isRequestDataExpired()) {
            g.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new G<SupportSdkSettings>() {
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(g);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal((String) null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(g) {
                            public void onSuccess(List<Request> list) {
                                g.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }

                public void onError(C c) {
                    g.onError(c);
                }
            });
        }
    }

    public final void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    /* access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData next : list) {
            int unreadComments = next.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(next.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(G g) {
        F.m1359();
        if (g != null) {
            g.onError(new D("Access Denied"));
        }
    }
}
