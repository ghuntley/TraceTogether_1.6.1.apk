package zendesk.support.request;

import o.C3351dc;
import o.M;

public final class RequestModule_ProvidesHeadlessComponentListenerFactory implements M<HeadlessComponentListener> {
    private final C3351dc<AttachmentDownloaderComponent> attachmentDownloaderProvider;
    private final C3351dc<ComponentPersistence> persistenceProvider;
    private final C3351dc<ComponentUpdateActionHandlers> updatesComponentProvider;

    public RequestModule_ProvidesHeadlessComponentListenerFactory(C3351dc<ComponentPersistence> dcVar, C3351dc<AttachmentDownloaderComponent> dcVar2, C3351dc<ComponentUpdateActionHandlers> dcVar3) {
        this.persistenceProvider = dcVar;
        this.attachmentDownloaderProvider = dcVar2;
        this.updatesComponentProvider = dcVar3;
    }

    public final HeadlessComponentListener get() {
        HeadlessComponentListener providesHeadlessComponentListener = RequestModule.providesHeadlessComponentListener(this.persistenceProvider.get(), this.attachmentDownloaderProvider.get(), this.updatesComponentProvider.get());
        if (providesHeadlessComponentListener != null) {
            return providesHeadlessComponentListener;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<HeadlessComponentListener> create(C3351dc<ComponentPersistence> dcVar, C3351dc<AttachmentDownloaderComponent> dcVar2, C3351dc<ComponentUpdateActionHandlers> dcVar3) {
        return new RequestModule_ProvidesHeadlessComponentListenerFactory(dcVar, dcVar2, dcVar3);
    }
}
