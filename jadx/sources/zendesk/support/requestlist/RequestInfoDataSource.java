package zendesk.support.requestlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import o.C;
import o.C3101;
import o.C3623w;
import o.E;
import o.G;
import o.O;
import o.P;
import zendesk.support.Attachment;
import zendesk.support.Comment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.RequestUpdates;
import zendesk.support.SupportUiStorage;
import zendesk.support.User;
import zendesk.support.requestlist.RequestInfo;

public interface RequestInfoDataSource {
    void load(G<List<RequestInfo>> g);

    public static class Repository implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public static final Comparator<RequestInfo> REQUEST_INFO_COMPARATOR = new Comparator<RequestInfo>() {
            public final int compare(RequestInfo requestInfo, RequestInfo requestInfo2) {
                return -requestInfo.getLastUpdated().compareTo(requestInfo2.getLastUpdated());
            }
        };
        private final RequestInfoDataSource localDataSource;
        /* access modifiers changed from: private */
        public final Merger merger;
        /* access modifiers changed from: private */
        public final RequestInfoDataSource remoteDataSource;

        Repository(RequestInfoDataSource requestInfoDataSource, RequestInfoDataSource requestInfoDataSource2, Merger merger2) {
            this.localDataSource = requestInfoDataSource;
            this.remoteDataSource = requestInfoDataSource2;
            this.merger = merger2;
        }

        public void load(final G<List<RequestInfo>> g) {
            this.localDataSource.load(new G<List<RequestInfo>>() {
                public void onError(C c) {
                }

                public void onSuccess(final List<RequestInfo> list) {
                    Repository.this.remoteDataSource.load(new G<List<RequestInfo>>() {
                        public void onSuccess(List<RequestInfo> list) {
                            g.onSuccess(Repository.this.merger.merge((List<RequestInfo>) list, list));
                        }

                        public void onError(C c) {
                            g.onError(c);
                        }
                    });
                }
            });
        }

        static class Merger {
            Merger() {
            }

            /* access modifiers changed from: package-private */
            public List<RequestInfo> merge(List<RequestInfo> list, List<RequestInfo> list2) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (RequestInfo next : list) {
                    String remoteId = next.getRemoteId();
                    if (P.m1406(remoteId)) {
                        hashMap.put(remoteId, next);
                    } else {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (RequestInfo next2 : list2) {
                    String remoteId2 = next2.getRemoteId();
                    if (hashMap.containsKey(remoteId2)) {
                        arrayList2.add(merge((RequestInfo) hashMap.get(remoteId2), next2));
                        hashMap.remove(remoteId2);
                    } else {
                        arrayList2.add(next2);
                    }
                }
                arrayList2.addAll(hashMap.values());
                Collections.sort(arrayList2, Repository.REQUEST_INFO_COMPARATOR);
                return arrayList2;
            }

            private RequestInfo merge(RequestInfo requestInfo, RequestInfo requestInfo2) {
                Date lastUpdated = requestInfo.getLastUpdated();
                Date lastUpdated2 = requestInfo2.getLastUpdated();
                Date date = lastUpdated.after(lastUpdated2) ? lastUpdated : lastUpdated2;
                RequestInfo.MessageInfo lastMessageInfo = requestInfo.getLastMessageInfo();
                RequestInfo.MessageInfo lastMessageInfo2 = requestInfo2.getLastMessageInfo();
                return new RequestInfo(requestInfo.getLocalId(), requestInfo2.getRemoteId(), requestInfo2.getRequestStatus(), requestInfo2.isUnread(), date, requestInfo2.getAgentInfos(), requestInfo2.getFirstMessageInfo(), lastMessageInfo.getDate().after(lastMessageInfo2.getDate()) ? lastMessageInfo : lastMessageInfo2, requestInfo.getFailedMessageIds());
            }
        }
    }

    public static class Disk implements RequestInfoDataSource {
        private final Executor backgroundThreadExecutor;
        /* access modifiers changed from: private */
        public final String cacheKey;
        /* access modifiers changed from: private */
        public final Executor mainThreadExecutor;
        /* access modifiers changed from: private */
        public final SupportUiStorage supportUiStorage;

        public Disk(Executor executor, Executor executor2, SupportUiStorage supportUiStorage2, String str) {
            this.mainThreadExecutor = executor;
            this.backgroundThreadExecutor = executor2;
            this.supportUiStorage = supportUiStorage2;
            this.cacheKey = str;
        }

        public void load(final G<List<RequestInfo>> g) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    final List list = (List) Disk.this.supportUiStorage.read(Disk.this.cacheKey, new C3101<List<RequestInfo>>() {
                    }.getType());
                    Disk.this.mainThreadExecutor.execute(new Runnable() {
                        public void run() {
                            g.onSuccess(O.m1403(list));
                        }
                    });
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void save(final List<RequestInfo> list, final G<List<RequestInfo>> g) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    Disk.this.supportUiStorage.write(Disk.this.cacheKey, list);
                    if (g != null) {
                        Disk.this.mainThreadExecutor.execute(new Runnable() {
                            public void run() {
                                g.onSuccess(list);
                            }
                        });
                    }
                }
            });
        }
    }

    public static class Network implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final RequestProvider requestProvider;

        Network(RequestProvider requestProvider2) {
            this.requestProvider = requestProvider2;
        }

        public void load(final G<List<RequestInfo>> g) {
            this.requestProvider.getAllRequests(new G<List<Request>>() {
                public void onSuccess(final List<Request> list) {
                    Network.this.requestProvider.getUpdatesForDevice(new G<RequestUpdates>() {
                        public void onSuccess(final RequestUpdates requestUpdates) {
                            g.onSuccess(O.m1392(list, new C3623w<Request, RequestInfo>() {
                                public RequestInfo apply(Request request) {
                                    return Network.this.map(request, requestUpdates.isRequestUnread(request.getId()));
                                }
                            }));
                        }

                        public void onError(C c) {
                            g.onError(c);
                        }
                    });
                }

                public void onError(C c) {
                    g.onError(c);
                }
            });
        }

        /* access modifiers changed from: private */
        public RequestInfo map(Request request, boolean z) {
            Comment firstComment = request.getFirstComment();
            Comment lastComment = request.getLastComment();
            return new RequestInfo("", request.getId(), request.getStatus(), z, request.getPublicUpdatedAt(), O.m1392(O.m1402(request.getLastCommentingAgents(), new C3623w<User, Boolean>() {
                public Boolean apply(User user) {
                    return Boolean.valueOf(user != null);
                }
            }), new C3623w<User, RequestInfo.AgentInfo>() {
                public RequestInfo.AgentInfo apply(User user) {
                    Attachment photo = user.getPhoto();
                    return new RequestInfo.AgentInfo(String.valueOf(user.getId()), user.getName(), photo != null ? photo.getContentUrl() : "");
                }
            }), new RequestInfo.MessageInfo(String.valueOf(firstComment.getId()), firstComment.getCreatedAt(), firstComment.getBody()), new RequestInfo.MessageInfo(String.valueOf(lastComment.getId()), lastComment.getCreatedAt(), lastComment.getBody()), new HashSet());
        }
    }

    public static class RemoteDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final Disk disk;
        private final Network network;

        RemoteDataSource(Network network2, Disk disk2) {
            this.network = network2;
            this.disk = disk2;
        }

        public void load(final G<List<RequestInfo>> g) {
            this.network.load(new G<List<RequestInfo>>() {
                public void onSuccess(List<RequestInfo> list) {
                    RemoteDataSource.this.disk.save(list, g);
                }

                public void onError(final C c) {
                    RemoteDataSource.this.disk.load(new G<List<RequestInfo>>() {
                        public void onSuccess(List<RequestInfo> list) {
                            g.onSuccess(list);
                            g.onError(c);
                        }

                        public void onError(C c) {
                            g.onError(c);
                        }
                    });
                }
            });
        }
    }

    public static class LocalDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final Disk disk;

        public LocalDataSource(Disk disk2) {
            this.disk = disk2;
        }

        public void load(G<List<RequestInfo>> g) {
            this.disk.load(g);
        }

        public void insert(final RequestInfo requestInfo, final G<List<RequestInfo>> g) {
            this.disk.load(new G<List<RequestInfo>>() {
                public void onSuccess(List<RequestInfo> list) {
                    List<Type> r3 = O.m1401(list, requestInfo, new E<RequestInfo, RequestInfo, Boolean>() {
                        public Boolean apply(RequestInfo requestInfo, RequestInfo requestInfo2) {
                            boolean equals = requestInfo2.getLocalId().equals(requestInfo.getLocalId());
                            boolean z = true;
                            boolean z2 = P.m1406(requestInfo2.getRemoteId()) && requestInfo2.getRemoteId().equals(requestInfo.getRemoteId());
                            if (!equals && !z2) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    Collections.sort(r3, Repository.REQUEST_INFO_COMPARATOR);
                    LocalDataSource.this.disk.save(r3, g);
                }

                public void onError(C c) {
                    G g = g;
                    if (g != null) {
                        g.onError(c);
                    }
                }
            });
        }

        public void remove(final String str, final G<List<RequestInfo>> g) {
            this.disk.load(new G<List<RequestInfo>>() {
                public void onSuccess(List<RequestInfo> list) {
                    LocalDataSource.this.disk.save(O.m1402(list, new C3623w<RequestInfo, Boolean>() {
                        public Boolean apply(RequestInfo requestInfo) {
                            return Boolean.valueOf(!str.equals(requestInfo.getLocalId()));
                        }
                    }), g);
                }

                public void onError(C c) {
                    G g = g;
                    if (g != null) {
                        g.onError(c);
                    }
                }
            });
        }
    }
}
