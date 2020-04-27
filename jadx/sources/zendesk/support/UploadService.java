package zendesk.support;

import o.C3552ku;
import o.C3562lb;
import o.kJ;
import o.kY;
import okhttp3.RequestBody;

interface UploadService {
    @kY(m3255 = "/api/mobile/uploads.json")
    C3552ku<UploadResponseWrapper> uploadAttachment(@C3562lb(m3552 = "filename") String str, @kJ RequestBody requestBody);
}
