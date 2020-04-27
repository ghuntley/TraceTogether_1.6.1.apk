package zendesk.support.request;

import o.C3351dc;
import o.C3602mo;
import o.M;
import zendesk.support.request.AttachmentDownloaderComponent;

public final class RequestModule_ProvidesAttachmentDownloaderFactory implements M<AttachmentDownloaderComponent.AttachmentDownloader> {
    private final C3351dc<AttachmentDownloadService> attachmentToDiskServiceProvider;
    private final C3351dc<C3602mo> belvedereProvider;

    public RequestModule_ProvidesAttachmentDownloaderFactory(C3351dc<C3602mo> dcVar, C3351dc<AttachmentDownloadService> dcVar2) {
        this.belvedereProvider = dcVar;
        this.attachmentToDiskServiceProvider = dcVar2;
    }

    public final AttachmentDownloaderComponent.AttachmentDownloader get() {
        AttachmentDownloaderComponent.AttachmentDownloader providesAttachmentDownloader = RequestModule.providesAttachmentDownloader(this.belvedereProvider.get(), this.attachmentToDiskServiceProvider.get());
        if (providesAttachmentDownloader != null) {
            return providesAttachmentDownloader;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AttachmentDownloaderComponent.AttachmentDownloader> create(C3351dc<C3602mo> dcVar, C3351dc<AttachmentDownloadService> dcVar2) {
        return new RequestModule_ProvidesAttachmentDownloaderFactory(dcVar, dcVar2);
    }
}
