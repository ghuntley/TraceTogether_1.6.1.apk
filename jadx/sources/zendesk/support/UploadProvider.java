package zendesk.support;

import java.io.File;
import o.G;

public interface UploadProvider {
    void uploadAttachment(String str, File file, String str2, G<UploadResponse> g);
}
