package zendesk.support.request;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import o.C;
import o.C3602mo;
import o.F;
import o.G;
import o.P;
import o.mF;
import o.nk;
import o.nl;
import okhttp3.ResponseBody;

class AttachmentDownloaderComponent implements nl<StateConversation> {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final AttachmentDownloader attachmentDownloader;
    /* access modifiers changed from: private */
    public final nk dispatcher;
    private final AttachmentDownloaderSelector selector = new AttachmentDownloaderSelector();

    AttachmentDownloaderComponent(nk nkVar, ActionFactory actionFactory2, AttachmentDownloader attachmentDownloader2) {
        this.dispatcher = nkVar;
        this.actionFactory = actionFactory2;
        this.attachmentDownloader = attachmentDownloader2;
    }

    public void update(StateConversation stateConversation) {
        for (AttachmentDownloader.Request next : this.selector.selectData(stateConversation)) {
            this.attachmentDownloader.download(next, new DownloadCallback(next.getRequestAttachment()));
        }
    }

    class DownloadCallback extends G<mF> {
        private final StateRequestAttachment requestAttachment;

        DownloadCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onSuccess(mF mFVar) {
            AttachmentDownloaderComponent.this.dispatcher.m3992(AttachmentDownloaderComponent.this.actionFactory.attachmentDownloaded(this.requestAttachment, mFVar));
        }

        public void onError(C c) {
            new Object[1][0] = c.m1280();
            F.m1359();
        }
    }

    static class AttachmentDownloaderSelector {
        AttachmentDownloaderSelector() {
        }

        public List<AttachmentDownloader.Request> selectData(StateConversation stateConversation) {
            StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
            String localId = stateConversation.getLocalId();
            List<StateMessage> messages = stateConversation.getMessages();
            LinkedList linkedList = new LinkedList();
            for (StateMessage attachments : messages) {
                for (StateRequestAttachment next : attachments.getAttachments()) {
                    long id = next.getId();
                    boolean z = next.getLocalFile() != null;
                    boolean hasRemoteId = attachmentIdMapper.hasRemoteId(Long.valueOf(id));
                    boolean r9 = P.m1406(next.getUrl());
                    if (!z && hasRemoteId && r9) {
                        linkedList.add(new AttachmentDownloader.Request(localId, attachmentIdMapper.getRemoteId(Long.valueOf(id)).longValue(), next));
                    }
                }
            }
            return linkedList;
        }
    }

    static class AttachmentDownloader {
        /* access modifiers changed from: private */
        public final AttachmentDownloadService attachmentIo;
        /* access modifiers changed from: private */
        public final C3602mo belvedere;
        /* access modifiers changed from: private */
        public final Set<String> downloadingHistory = new HashSet();

        AttachmentDownloader(C3602mo moVar, AttachmentDownloadService attachmentDownloadService) {
            this.belvedere = moVar;
            this.attachmentIo = attachmentDownloadService;
        }

        /* access modifiers changed from: package-private */
        public void download(Request request, G<mF> g) {
            StateRequestAttachment requestAttachment = request.getRequestAttachment();
            String url = requestAttachment.getUrl();
            if (!this.downloadingHistory.contains(url)) {
                this.downloadingHistory.add(url);
                this.attachmentIo.downloadAttachment(url, new HttpCallback(request, requestAttachment, g));
            }
        }

        /* access modifiers changed from: private */
        public void handleError(String str, C c, G g) {
            this.downloadingHistory.remove(str);
            if (g != null) {
                g.onError(c);
            }
        }

        class CacheCallback extends G<mF> {
            private final G<mF> callback;
            private final StateRequestAttachment requestAttachment;

            CacheCallback(StateRequestAttachment stateRequestAttachment, G<mF> g) {
                this.requestAttachment = stateRequestAttachment;
                this.callback = g;
            }

            public void onSuccess(mF mFVar) {
                this.callback.onSuccess(mFVar);
                AttachmentDownloader.this.downloadingHistory.remove(this.requestAttachment.getUrl());
            }

            public void onError(C c) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), c, this.callback);
            }
        }

        class HttpCallback extends G<ResponseBody> {
            private final G<mF> callback;
            private final Request request;
            private final StateRequestAttachment requestAttachment;

            HttpCallback(Request request2, StateRequestAttachment stateRequestAttachment, G<mF> g) {
                this.request = request2;
                this.requestAttachment = stateRequestAttachment;
                this.callback = g;
            }

            public void onSuccess(ResponseBody responseBody) {
                AttachmentDownloader.this.attachmentIo.storeAttachment(responseBody, UtilsAttachment.getLocalFile(AttachmentDownloader.this.belvedere, this.request.getRequestId(), this.request.getRemoteAttachmentId(), this.requestAttachment.getName()), new CacheCallback(this.requestAttachment, this.callback));
            }

            public void onError(C c) {
                AttachmentDownloader.this.handleError(this.requestAttachment.getUrl(), c, this.callback);
            }
        }

        static class Request {
            private final long remoteAttachmentId;
            private final StateRequestAttachment requestAttachment;
            private final String requestId;

            Request(String str, long j, StateRequestAttachment stateRequestAttachment) {
                this.requestId = str;
                this.remoteAttachmentId = j;
                this.requestAttachment = stateRequestAttachment;
            }

            /* access modifiers changed from: package-private */
            public String getRequestId() {
                return this.requestId;
            }

            /* access modifiers changed from: package-private */
            public long getRemoteAttachmentId() {
                return this.remoteAttachmentId;
            }

            /* access modifiers changed from: package-private */
            public StateRequestAttachment getRequestAttachment() {
                return this.requestAttachment;
            }
        }
    }
}
