package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import okhttp3.OkHttpClient;

public final class RequestModule_ProvidesAttachmentToDiskServiceFactory implements M<AttachmentDownloadService> {
    private final C3351dc<ExecutorService> executorProvider;
    private final C3351dc<OkHttpClient> okHttpClientProvider;

    public RequestModule_ProvidesAttachmentToDiskServiceFactory(C3351dc<OkHttpClient> dcVar, C3351dc<ExecutorService> dcVar2) {
        this.okHttpClientProvider = dcVar;
        this.executorProvider = dcVar2;
    }

    public final AttachmentDownloadService get() {
        AttachmentDownloadService providesAttachmentToDiskService = RequestModule.providesAttachmentToDiskService(this.okHttpClientProvider.get(), this.executorProvider.get());
        if (providesAttachmentToDiskService != null) {
            return providesAttachmentToDiskService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AttachmentDownloadService> create(C3351dc<OkHttpClient> dcVar, C3351dc<ExecutorService> dcVar2) {
        return new RequestModule_ProvidesAttachmentToDiskServiceFactory(dcVar, dcVar2);
    }
}
