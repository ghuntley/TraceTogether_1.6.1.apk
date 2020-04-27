package okhttp3.internal.http;

import o.jI;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final jI source;

    public RealResponseBody(String str, long j, jI jIVar) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = jIVar;
    }

    public final MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public final long contentLength() {
        return this.contentLength;
    }

    public final jI source() {
        return this.source;
    }
}
