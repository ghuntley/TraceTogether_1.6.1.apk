package zendesk.support.request;

import java.util.ArrayList;
import java.util.List;
import o.C;
import o.F;
import o.G;
import o.O;
import o.P;
import o.nk;
import o.no;
import zendesk.support.Comment;
import zendesk.support.CreateRequest;
import zendesk.support.EndUserComment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.AttachmentUploadService;

class ActionCreateComment implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory af;
    private G<AttachmentUploadService.AttachmentUploadResult> attachmentCallback;
    private final AttachmentUploadService attachmentUploader;
    /* access modifiers changed from: private */
    public final StateMessage message;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    ActionCreateComment(ActionFactory actionFactory, RequestProvider requestProvider2, AttachmentUploadService attachmentUploadService, StateMessage stateMessage) {
        this.af = actionFactory;
        this.requestProvider = requestProvider2;
        this.message = stateMessage;
        this.attachmentUploader = attachmentUploadService;
    }

    public void actionQueued(nk nkVar, no noVar) {
        List<StateRequestAttachment> attachments = this.message.getAttachments();
        String localId = StateConversation.fromState(noVar.m4002()).getLocalId();
        if (O.m1394(attachments)) {
            Object[] objArr = {Integer.valueOf(attachments.size()), Long.valueOf(this.message.getId())};
            F.m1359();
            this.attachmentUploader.start(localId);
        }
        nkVar.m3992(this.af.createComment(this.message.withPending()));
    }

    public void execute(nk nkVar, no noVar, AsyncMiddleware.Callback callback) {
        waitForAttachments(nkVar, noVar, callback);
    }

    private void waitForAttachments(nk nkVar, no noVar, AsyncMiddleware.Callback callback) {
        final StateConversation fromState = StateConversation.fromState(noVar.m4002());
        final StateConfig fromState2 = StateConfig.fromState(noVar.m4002());
        new Object[1][0] = Long.valueOf(this.message.getId());
        F.m1359();
        final nk nkVar2 = nkVar;
        final AsyncMiddleware.Callback callback2 = callback;
        this.attachmentCallback = new G<AttachmentUploadService.AttachmentUploadResult>() {
            public void onSuccess(AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
                new Object[1][0] = Long.valueOf(ActionCreateComment.this.message.getId());
                F.m1359();
                ActionCreateComment.this.createMessage(fromState, fromState2, nkVar2, callback2, attachmentUploadResult);
            }

            public void onError(C c) {
                Object[] objArr = {c.m1280(), Long.valueOf(ActionCreateComment.this.message.getId())};
                F.m1361();
                StateMessage withError = ActionCreateComment.this.message.withError(c);
                if (P.m1406(fromState.getRemoteId())) {
                    nkVar2.m3992(ActionCreateComment.this.af.createCommentError(c, withError));
                } else {
                    nkVar2.m3992(ActionCreateComment.this.af.createRequestError(c, withError));
                }
                callback2.done();
            }
        };
        this.attachmentUploader.setResultListener(this.attachmentCallback);
    }

    /* access modifiers changed from: private */
    public void createMessage(StateConversation stateConversation, StateConfig stateConfig, nk nkVar, AsyncMiddleware.Callback callback, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        if (P.m1406(stateConversation.getRemoteId())) {
            new Object[1][0] = Long.valueOf(this.message.getId());
            F.m1359();
            addComment(callback, nkVar, stateConversation, attachmentUploadResult);
            return;
        }
        new Object[1][0] = Long.valueOf(this.message.getId());
        F.m1359();
        createRequest(callback, nkVar, attachmentUploadResult, stateConfig);
    }

    private void addComment(AsyncMiddleware.Callback callback, nk nkVar, StateConversation stateConversation, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
        EndUserComment endUserComment = new EndUserComment();
        endUserComment.setValue(this.message.getBody());
        endUserComment.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        String remoteId = stateConversation.getRemoteId();
        final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult2 = attachmentUploadResult;
        final nk nkVar2 = nkVar;
        final String str = remoteId;
        final StateConversation stateConversation2 = stateConversation;
        final AsyncMiddleware.Callback callback2 = callback;
        this.requestProvider.addComment(remoteId, endUserComment, new G<Comment>() {
            public void onSuccess(Comment comment) {
                nkVar2.m3992(ActionCreateComment.this.af.createCommentSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult2.getRequestAttachments()).withDelivered(), str, comment.getId().longValue(), attachmentUploadResult2)));
                ActionCreateComment.this.requestProvider.markRequestAsRead(str, stateConversation2.getMessageIdMapper().getRemoteIds().size());
                callback2.done();
            }

            public void onError(C c) {
                Object[] objArr = {c.m1280(), Long.valueOf(ActionCreateComment.this.message.getId())};
                F.m1361();
                if (c.m1277() && c.m1276() == 422) {
                    Object[] objArr2 = {str, c.m1280(), Long.valueOf(ActionCreateComment.this.message.getId())};
                    F.m1361();
                    nkVar2.m3992(ActionCreateComment.this.af.requestClosed());
                }
                nkVar2.m3992(ActionCreateComment.this.af.createCommentError(c, ActionCreateComment.this.message.withError(c)));
                callback2.done();
            }
        });
    }

    private void createRequest(final AsyncMiddleware.Callback callback, final nk nkVar, final AttachmentUploadService.AttachmentUploadResult attachmentUploadResult, StateConfig stateConfig) {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setDescription(this.message.getBody());
        createRequest.setAttachments(getAttachmentToken(attachmentUploadResult.getRequestAttachments()));
        if (O.m1394(stateConfig.getTags())) {
            createRequest.setTags(stateConfig.getTags());
        }
        if (P.m1406(stateConfig.getSubject())) {
            createRequest.setSubject(stateConfig.getSubject());
        }
        if (stateConfig.getTicketForm() != null) {
            if (stateConfig.getTicketForm().getId() != -1) {
                createRequest.setTicketFormId(Long.valueOf(stateConfig.getTicketForm().getId()));
            }
            createRequest.setCustomFields(stateConfig.getTicketForm().getTicketFieldsForApi());
        }
        this.requestProvider.createRequest(createRequest, new G<Request>() {
            public void onSuccess(Request request) {
                nkVar.m3992(ActionCreateComment.this.af.createRequestSuccess(new CreateCommentResult(ActionCreateComment.this.message.withAttachments(attachmentUploadResult.getRequestAttachments()).withDelivered(), request.getId(), request.getLastComment().getId().longValue(), attachmentUploadResult)));
                callback.done();
                if (request.getId() != null) {
                    ActionCreateComment.this.requestProvider.markRequestAsRead(request.getId(), 1);
                }
            }

            public void onError(C c) {
                nkVar.m3992(ActionCreateComment.this.af.createRequestError(c, ActionCreateComment.this.message.withError(c)));
                callback.done();
            }
        });
    }

    private List<String> getAttachmentToken(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList();
        for (StateRequestAttachment token : list) {
            arrayList.add(token.getToken());
        }
        return arrayList;
    }

    static class CreateCommentResult {
        private final long commentRemoteId;
        private final AttachmentUploadService.AttachmentUploadResult localToRemoteAttachments;
        private final StateMessage message;
        private final String requestId;

        CreateCommentResult(StateMessage stateMessage, String str, long j, AttachmentUploadService.AttachmentUploadResult attachmentUploadResult) {
            this.message = stateMessage;
            this.requestId = str;
            this.commentRemoteId = j;
            this.localToRemoteAttachments = attachmentUploadResult;
        }

        /* access modifiers changed from: package-private */
        public StateMessage getMessage() {
            return this.message;
        }

        /* access modifiers changed from: package-private */
        public String getRequestId() {
            return this.requestId;
        }

        /* access modifiers changed from: package-private */
        public long getCommentRemoteId() {
            return this.commentRemoteId;
        }

        /* access modifiers changed from: package-private */
        public AttachmentUploadService.AttachmentUploadResult getLocalToRemoteAttachments() {
            return this.localToRemoteAttachments;
        }
    }
}
