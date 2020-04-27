package zendesk.support.request;

import o.nu;

class HeadlessComponentListener {
    private final AttachmentDownloaderComponent attachment;
    private final ComponentPersistence persistence;
    private boolean registered = false;
    private final ComponentUpdateActionHandlers updateActionHandlersComponent;

    HeadlessComponentListener(ComponentPersistence componentPersistence, AttachmentDownloaderComponent attachmentDownloaderComponent, ComponentUpdateActionHandlers componentUpdateActionHandlers) {
        this.persistence = componentPersistence;
        this.attachment = attachmentDownloaderComponent;
        this.updateActionHandlersComponent = componentUpdateActionHandlers;
    }

    /* access modifiers changed from: package-private */
    public void startListening(nu nuVar) {
        if (!this.registered) {
            nuVar.m4031(this.persistence.getSelector(), this.persistence);
            nuVar.m4029(StateConversation.class, this.attachment);
            nuVar.m4029(StateConversation.class, this.updateActionHandlersComponent);
            this.registered = true;
        }
    }
}
