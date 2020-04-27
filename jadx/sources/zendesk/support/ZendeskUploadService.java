package zendesk.support;

import java.io.File;
import o.G;
import o.I;
import okhttp3.MediaType;
import okhttp3.RequestBody;

class ZendeskUploadService {
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService2) {
        this.uploadService = uploadService2;
    }

    /* access modifiers changed from: package-private */
    public void uploadAttachment(String str, File file, String str2, G<UploadResponseWrapper> g) {
        this.uploadService.uploadAttachment(str, RequestBody.create(MediaType.parse(str2), file)).m3316(new I(g));
    }
}
