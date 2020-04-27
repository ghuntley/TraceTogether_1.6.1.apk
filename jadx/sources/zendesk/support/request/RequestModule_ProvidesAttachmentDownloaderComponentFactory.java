package zendesk.support.request;

import o.C3351dc;
import o.M;
import o.nk;
import zendesk.support.request.AttachmentDownloaderComponent;

public final class RequestModule_ProvidesAttachmentDownloaderComponentFactory implements M<AttachmentDownloaderComponent> {
    private final C3351dc<ActionFactory> actionFactoryProvider;
    private final C3351dc<AttachmentDownloaderComponent.AttachmentDownloader> attachmentDownloaderProvider;
    private final C3351dc<nk> dispatcherProvider;

    public RequestModule_ProvidesAttachmentDownloaderComponentFactory(C3351dc<nk> dcVar, C3351dc<ActionFactory> dcVar2, C3351dc<AttachmentDownloaderComponent.AttachmentDownloader> dcVar3) {
        this.dispatcherProvider = dcVar;
        this.actionFactoryProvider = dcVar2;
        this.attachmentDownloaderProvider = dcVar3;
    }

    public final AttachmentDownloaderComponent get() {
        AttachmentDownloaderComponent providesAttachmentDownloaderComponent = RequestModule.providesAttachmentDownloaderComponent(this.dispatcherProvider.get(), this.actionFactoryProvider.get(), this.attachmentDownloaderProvider.get());
        if (providesAttachmentDownloaderComponent != null) {
            return providesAttachmentDownloaderComponent;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AttachmentDownloaderComponent> create(C3351dc<nk> dcVar, C3351dc<ActionFactory> dcVar2, C3351dc<AttachmentDownloaderComponent.AttachmentDownloader> dcVar3) {
        return new RequestModule_ProvidesAttachmentDownloaderComponentFactory(dcVar, dcVar2, dcVar3);
    }
}
