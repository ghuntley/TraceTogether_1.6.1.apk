package zendesk.support.request;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.C3602mo;
import o.F;
import o.O;
import o.P;
import o.mF;
import o.nc;
import o.nk;
import o.no;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;

class ActionLoadCachedComments implements AsyncMiddleware.AsyncAction {
    private final ActionFactory af;
    private final C3602mo belvedere;
    private final Executor executorService;
    private final String sdkVersion;
    private final SupportUiStorage supportUiStorage;

    ActionLoadCachedComments(ActionFactory actionFactory, SupportUiStorage supportUiStorage2, C3602mo moVar, Executor executor, String str) {
        this.af = actionFactory;
        this.supportUiStorage = supportUiStorage2;
        this.belvedere = moVar;
        this.executorService = executor;
        this.sdkVersion = str;
    }

    public void actionQueued(nk nkVar, no noVar) {
        nkVar.m3992(this.af.loadCommentsFromCache());
    }

    public void execute(nk nkVar, no noVar, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(noVar.m4002());
        if (P.m1406(fromState.getLocalId())) {
            this.executorService.execute(new LoadComments(fromState.getLocalId(), nkVar, callback, this.supportUiStorage, this.af, this.belvedere, this.sdkVersion));
            return;
        }
        nkVar.m3992(this.af.skipAction());
        callback.done();
    }

    static class LoadComments implements Runnable {
        private final ActionFactory af;
        private final C3602mo belvedere;
        private final AsyncMiddleware.Callback callback;
        private final nk dispatcher;
        private final String id;
        private final String sdkVersion;
        private final SupportUiStorage supportUiStorage;

        LoadComments(String str, nk nkVar, AsyncMiddleware.Callback callback2, SupportUiStorage supportUiStorage2, ActionFactory actionFactory, C3602mo moVar, String str2) {
            this.id = str;
            this.dispatcher = nkVar;
            this.callback = callback2;
            this.supportUiStorage = supportUiStorage2;
            this.af = actionFactory;
            this.belvedere = moVar;
            this.sdkVersion = str2;
        }

        public void run() {
            nc ncVar;
            ComponentPersistence.RequestPersistenceModel requestPersistenceModel = (ComponentPersistence.RequestPersistenceModel) this.supportUiStorage.read(this.id, ComponentPersistence.RequestPersistenceModel.class);
            if (!(requestPersistenceModel == null || requestPersistenceModel.getConversation() == null)) {
                if (this.sdkVersion.equals(requestPersistenceModel.getVersion())) {
                    F.m1359();
                    ncVar = this.af.loadCommentsFromCacheSuccess(resolveAttachments(requestPersistenceModel.getConversation()));
                    this.dispatcher.m3992(ncVar);
                    this.callback.done();
                }
                Object[] objArr = {requestPersistenceModel.getVersion(), "2.2.1"};
            }
            F.m1359();
            ncVar = this.af.loadCommentsFromCacheError();
            this.dispatcher.m3992(ncVar);
            this.callback.done();
        }

        /* access modifiers changed from: package-private */
        public StateConversation resolveAttachments(StateConversation stateConversation) {
            ArrayList arrayList = new ArrayList(stateConversation.getMessages().size());
            for (StateMessage findLocalAttachmentForMessage : stateConversation.getMessages()) {
                arrayList.add(findLocalAttachmentForMessage(findLocalAttachmentForMessage, stateConversation.getAttachmentIdMapper(), this.belvedere, stateConversation.getLocalId()));
            }
            return stateConversation.newBuilder().setMessages(arrayList).build();
        }

        private StateMessage findLocalAttachmentForMessage(StateMessage stateMessage, StateIdMapper stateIdMapper, C3602mo moVar, String str) {
            List<StateRequestAttachment> attachments = stateMessage.getAttachments();
            if (!O.m1394(attachments)) {
                return stateMessage;
            }
            ArrayList arrayList = new ArrayList(stateMessage.getAttachments().size());
            for (StateRequestAttachment next : attachments) {
                if (stateIdMapper.hasRemoteId(Long.valueOf(next.getId()))) {
                    arrayList.add(updateAttachment(next, UtilsAttachment.getLocalFile(moVar, str, stateIdMapper.getRemoteId(Long.valueOf(next.getId())).longValue(), next.getName())));
                } else {
                    arrayList.add(next);
                }
            }
            return stateMessage.withAttachments(arrayList);
        }

        private StateRequestAttachment updateAttachment(StateRequestAttachment stateRequestAttachment, mF mFVar) {
            String str;
            File file = null;
            if (stateRequestAttachment.getSize() == mFVar.f3087.length()) {
                file = mFVar.f3087;
                str = mFVar.f3090.toString();
            } else {
                str = null;
            }
            return stateRequestAttachment.newBuilder().setLocalFile(file).setLocalUri(str).build();
        }
    }
}
