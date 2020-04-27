package zendesk.support.request;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C;
import o.C2311;
import o.C3602mo;
import o.mF;
import o.nc;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.request.ActionCreateComment;

class ActionFactory {
    private final AuthenticationProvider authProvider;
    private final C3602mo belvedere;
    private final Executor executorService;
    private final Executor mainThreadExecutor;
    private final RequestProvider requestProvider;
    private final String sdkVersion;
    private final SupportSettingsProvider settingsProvider;
    private final SupportBlipsProvider supportBlipsProvider;
    private final SupportUiStorage supportUiStorage;
    private final UploadProvider uploadProvider;

    /* renamed from: zendesk  reason: collision with root package name */
    private final Zendesk f17596zendesk;

    ActionFactory(RequestProvider requestProvider2, UploadProvider uploadProvider2, SupportSettingsProvider supportSettingsProvider, C3602mo moVar, SupportUiStorage supportUiStorage2, Executor executor, String str, AuthenticationProvider authenticationProvider, Zendesk zendesk2, SupportBlipsProvider supportBlipsProvider2, Executor executor2) {
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
        this.settingsProvider = supportSettingsProvider;
        this.belvedere = moVar;
        this.supportUiStorage = supportUiStorage2;
        this.executorService = executor;
        this.mainThreadExecutor = executor2;
        this.sdkVersion = str;
        this.authProvider = authenticationProvider;
        this.f17596zendesk = zendesk2;
        this.supportBlipsProvider = supportBlipsProvider2;
    }

    /* access modifiers changed from: package-private */
    public nc skipAction() {
        return new nc("SKIP_ACTION");
    }

    /* access modifiers changed from: package-private */
    public nc startConfig(RequestUiConfig requestUiConfig) {
        return new nc("START_CONFIG", requestUiConfig);
    }

    /* access modifiers changed from: package-private */
    public nc installStartConfigAsync(RequestUiConfig requestUiConfig) {
        return AsyncMiddleware.createAction(new ActionInstallConfiguration(this.supportUiStorage, requestUiConfig, this.executorService, this.mainThreadExecutor, this, this.supportBlipsProvider));
    }

    /* access modifiers changed from: package-private */
    public nc loadSettingsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadSettings(this, this.settingsProvider, this.authProvider));
    }

    /* access modifiers changed from: package-private */
    public nc loadSettings() {
        return new nc("LOAD_SETTINGS");
    }

    /* access modifiers changed from: package-private */
    public nc loadSettingsSuccess(StateSettings stateSettings) {
        return new nc("LOAD_SETTINGS_SUCCESS", stateSettings);
    }

    /* access modifiers changed from: package-private */
    public nc loadSettingsError(C c) {
        return new ErrorAction("LOAD_SETTINGS_ERROR", c);
    }

    /* access modifiers changed from: package-private */
    public nc initialLoadCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, true));
    }

    /* access modifiers changed from: package-private */
    public nc updateCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, false));
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsFromCacheAsync() {
        return AsyncMiddleware.createAction(new ActionLoadCachedComments(this, this.supportUiStorage, this.belvedere, this.executorService, this.sdkVersion));
    }

    /* access modifiers changed from: package-private */
    public nc loadComments(boolean z) {
        if (z) {
            return new nc("LOAD_COMMENT_INITIAL");
        }
        return new nc("LOAD_COMMENTS_UPDATE");
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsSuccess(boolean z, CommentsResponse commentsResponse, Map<Long, mF> map) {
        C2311 r0 = new C2311(commentsResponse, map);
        if (z) {
            return new nc("LOAD_COMMENTS_INITIAL_SUCCESS", r0);
        }
        return new nc("LOAD_COMMENTS_UPDATE_SUCCESS", r0);
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsFromCache() {
        return new nc("LOAD_COMMENTS_FROM_CACHE");
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsFromCacheSuccess(StateConversation stateConversation) {
        return new nc("LOAD_COMMENTS_FROM_CACHE_SUCCESS", stateConversation);
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsFromCacheError() {
        return new nc("LOAD_COMMENTS_FROM_CACHE_ERROR");
    }

    /* access modifiers changed from: package-private */
    public nc loadCommentsError(boolean z, C c) {
        if (z) {
            return new ErrorAction("LOAD_COMMENTS_INITIAL_ERROR", c);
        }
        return new ErrorAction("LOAD_COMMENTS_UPDATE_ERROR", c);
    }

    /* access modifiers changed from: package-private */
    public nc loadRequest() {
        return new nc("LOAD_REQUEST");
    }

    /* access modifiers changed from: package-private */
    public nc loadRequestSuccess(Request request) {
        return new nc("LOAD_REQUEST_SUCCESS", request);
    }

    /* access modifiers changed from: package-private */
    public nc loadRequestError(C c) {
        return new ErrorAction("LOAD_REQUEST_ERROR", c);
    }

    /* access modifiers changed from: package-private */
    public nc loadRequestAsync() {
        return AsyncMiddleware.createAction(new ActionLoadRequest(this, this.requestProvider));
    }

    /* access modifiers changed from: package-private */
    public nc createCommentAsync(String str, List<StateRequestAttachment> list) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, list), new StateMessage(str, list)));
    }

    /* access modifiers changed from: package-private */
    public nc resendCommentAsync(StateMessage stateMessage) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, stateMessage.getAttachments()), stateMessage));
    }

    /* access modifiers changed from: package-private */
    public nc updateNameEmailAsync(String str, String str2) {
        return AsyncMiddleware.createAction(new ActionUpdateNameEmail(str, str2, this.authProvider, this.f17596zendesk));
    }

    /* access modifiers changed from: package-private */
    public nc createComment(StateMessage stateMessage) {
        return new nc("CREATE_COMMENT", stateMessage);
    }

    /* access modifiers changed from: package-private */
    public nc createCommentSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new nc("CREATE_COMMENT_SUCCESS", createCommentResult);
    }

    /* access modifiers changed from: package-private */
    public nc createCommentError(C c, StateMessage stateMessage) {
        return new ErrorAction("CREATE_COMMENT_ERROR", c, stateMessage);
    }

    /* access modifiers changed from: package-private */
    public nc createRequestSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new nc("CREATE_REQUEST_SUCCESS", createCommentResult);
    }

    /* access modifiers changed from: package-private */
    public nc createRequestError(C c, StateMessage stateMessage) {
        return new ErrorAction("CREATE_REQUEST_ERROR", c, stateMessage);
    }

    /* access modifiers changed from: package-private */
    public nc deleteMessage(StateMessage stateMessage) {
        return new nc("DELETE_MESSAGE", stateMessage);
    }

    /* access modifiers changed from: package-private */
    public nc selectAttachment(List<mF> list) {
        return new nc("ATTACHMENTS_SELECTED", list);
    }

    /* access modifiers changed from: package-private */
    public nc deselectAttachment(List<mF> list) {
        return new nc("ATTACHMENTS_DESELECTED", list);
    }

    /* access modifiers changed from: package-private */
    public nc clearAttachments() {
        return new nc("CLEAR_ATTACHMENTS");
    }

    /* access modifiers changed from: package-private */
    public nc attachmentDownloaded(StateRequestAttachment stateRequestAttachment, mF mFVar) {
        return new nc("ATTACHMENT_DOWNLOADED", C2311.m12057(stateRequestAttachment, mFVar));
    }

    /* access modifiers changed from: package-private */
    public nc androidOnResume() {
        return new nc("ANDROID_ON_RESUME");
    }

    /* access modifiers changed from: package-private */
    public nc androidOnPause() {
        return new nc("ANDROID_ON_PAUSE");
    }

    /* access modifiers changed from: package-private */
    public nc showRetryDialog(List<StateMessage> list) {
        return new nc("SHOW_RETRY_DIALOG", list);
    }

    /* access modifiers changed from: package-private */
    public nc onDialogDismissed() {
        return new nc("DIALOG_DISMISSED");
    }

    /* access modifiers changed from: package-private */
    public nc requestClosed() {
        return new nc("REQUEST_CLOSED");
    }

    /* access modifiers changed from: package-private */
    public nc clearMessages() {
        return new nc("CLEAR_MESSAGES");
    }

    static class ErrorAction<E> extends nc<E> {
        private final C errorResponse;

        ErrorAction(String str, C c) {
            this(str, c, (Object) null);
        }

        ErrorAction(String str, C c, E e) {
            super(str, e);
            this.errorResponse = c;
        }

        public C getErrorResponse() {
            return this.errorResponse;
        }
    }
}
