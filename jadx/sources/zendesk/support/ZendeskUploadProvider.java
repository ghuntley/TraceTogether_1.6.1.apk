package zendesk.support;

import java.io.File;
import o.G;

class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    public void uploadAttachment(String str, File file, String str2, final G<UploadResponse> g) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(g) {
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                G g = g;
                if (g != null) {
                    g.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
