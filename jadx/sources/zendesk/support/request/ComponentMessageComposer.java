package zendesk.support.request;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C1459;
import o.O;
import o.P;
import o.R;
import o.mF;
import o.nk;
import o.nl;
import o.nq;
import o.nt;
import zendesk.belvedere.ImageStream;
import zendesk.support.RequestStatus;
import zendesk.support.UiUtils;
import zendesk.support.request.ViewMessageComposer;

class ComponentMessageComposer implements nl<MessageComposerModel>, ViewMessageComposer.InputListener, ImageStream.Cif {
    private final ActionFactory actionFactory;
    private final C1459 activity;
    private final AttachmentHelper attachmentHelper = new AttachmentHelper(R.id.f164652131361948, R.id.f165842131362140);
    private final nk dispatcher;
    private final ImageStream imageStream;
    /* access modifiers changed from: private */
    public final ViewMessageComposer messageComposerView;
    private final MessageComposerSelector messageFieldSelector = new MessageComposerSelector();

    ComponentMessageComposer(C1459 r1, ImageStream imageStream2, ViewMessageComposer viewMessageComposer, nk nkVar, ActionFactory actionFactory2) {
        this.activity = r1;
        this.messageComposerView = viewMessageComposer;
        this.dispatcher = nkVar;
        this.actionFactory = actionFactory2;
        this.imageStream = imageStream2;
        viewMessageComposer.addListener(this);
        initImagePicker();
    }

    private void initImagePicker() {
        this.imageStream.f14757.add(new WeakReference(this));
        if (this.imageStream.f14758.get().f3070.hasFocus()) {
            this.messageComposerView.requestFocusForInput();
        }
        if (this.imageStream.f14759) {
            this.messageComposerView.post(new Runnable() {
                public void run() {
                    ComponentMessageComposer.this.onAddAttachmentsRequested();
                }
            });
        }
    }

    public void update(MessageComposerModel messageComposerModel) {
        this.attachmentHelper.updateMaxFileSize(messageComposerModel.getMaxFileSize());
        this.attachmentHelper.updateAttachments(messageComposerModel.getRequestAttachments(), messageComposerModel.getExtraAttachments());
        this.messageComposerView.setAttachmentsCount(messageComposerModel.getRequestAttachments().size());
        this.messageComposerView.enableSendButton(messageComposerModel.isSendButtonEnabled());
        this.messageComposerView.enableAttachmentsButton(messageComposerModel.isAttachmentsButtonEnabled());
        this.messageComposerView.hide(!messageComposerModel.isMessageComposerVisible());
        if (!messageComposerModel.isMessageComposerVisible()) {
            UiUtils.dismissKeyboard((View) this.messageComposerView);
        }
    }

    public nq<MessageComposerModel> getSelector() {
        return this.messageFieldSelector;
    }

    public void onAddAttachmentsRequested() {
        boolean z = true;
        if (!(this.imageStream.f14760 != null)) {
            this.attachmentHelper.showImagePicker(this.activity);
            return;
        }
        ImageStream imageStream2 = this.imageStream;
        if (imageStream2.f14760 == null) {
            z = false;
        }
        if (z) {
            imageStream2.f14760.dismiss();
        }
    }

    public void onSendMessageRequested(String str) {
        boolean z = true;
        if (this.imageStream.f14760 != null) {
            ImageStream imageStream2 = this.imageStream;
            if (imageStream2.f14760 == null) {
                z = false;
            }
            if (z) {
                imageStream2.f14760.dismiss();
            }
        }
        this.dispatcher.m3992(this.actionFactory.createCommentAsync(str, this.attachmentHelper.getSelectedAttachments()));
        this.dispatcher.m3992(this.actionFactory.clearAttachments());
        this.dispatcher.m3992(this.actionFactory.updateCommentsAsync());
    }

    public void onDismissed() {
        this.messageComposerView.requestFocusForInput();
    }

    public void onVisible() {
        this.messageComposerView.post(new Runnable() {
            public void run() {
                ComponentMessageComposer.this.messageComposerView.triggerStateUpdate();
            }
        });
    }

    public void onMediaSelected(List<mF> list) {
        this.dispatcher.m3992(this.actionFactory.selectAttachment(list));
        if (!(this.imageStream.f14760 != null)) {
            onAddAttachmentsRequested();
        }
    }

    public void onMediaDeselected(List<mF> list) {
        this.dispatcher.m3992(this.actionFactory.deselectAttachment(list));
        if (!(this.imageStream.f14760 != null)) {
            onAddAttachmentsRequested();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasUnsavedInput() {
        return P.m1406(this.messageComposerView.getMessage()) || O.m1394(this.attachmentHelper.getSelectedAttachments());
    }

    static class MessageComposerSelector implements nq<MessageComposerModel> {
        MessageComposerSelector() {
        }

        public MessageComposerModel selectData(nt ntVar) {
            StateAttachments fromState = StateAttachments.fromState(ntVar);
            StateConfig fromState2 = StateConfig.fromState(ntVar);
            StateConversation fromState3 = StateConversation.fromState(ntVar);
            return new MessageComposerModel(O.m1393(fromState.getSelectedAttachments()), new ArrayList(fromState.getAllSelectedAttachments()), fromState2.getSettings().getMaxAttachmentSize(), P.m1406(fromState3.getRemoteId()), fromState2.getSettings().isAttachmentsEnabled(), fromState3.getStatus() != RequestStatus.Closed);
        }
    }

    static class MessageComposerModel {
        private final boolean attachmentsButtonEnabled;
        private final List<StateRequestAttachment> extraAttachments;
        private final long maxFileSize;
        private final boolean messageComposerVisible;
        private final List<StateRequestAttachment> requestAttachments;
        private final boolean sendButtonEnabled;

        MessageComposerModel(List<StateRequestAttachment> list, List<StateRequestAttachment> list2, long j, boolean z, boolean z2, boolean z3) {
            this.requestAttachments = list;
            this.extraAttachments = list2;
            this.maxFileSize = j;
            this.sendButtonEnabled = z;
            this.attachmentsButtonEnabled = z2;
            this.messageComposerVisible = z3;
        }

        /* access modifiers changed from: package-private */
        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        /* access modifiers changed from: package-private */
        public List<StateRequestAttachment> getExtraAttachments() {
            return this.extraAttachments;
        }

        /* access modifiers changed from: package-private */
        public long getMaxFileSize() {
            return this.maxFileSize;
        }

        /* access modifiers changed from: package-private */
        public boolean isSendButtonEnabled() {
            return this.sendButtonEnabled;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachmentsButtonEnabled() {
            return this.attachmentsButtonEnabled;
        }

        /* access modifiers changed from: package-private */
        public boolean isMessageComposerVisible() {
            return this.messageComposerVisible;
        }
    }
}
