package o;

import android.net.Uri;
import o.C3348d;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.Ҏı  reason: contains not printable characters */
public final class C2664 implements C3348d {

    /* renamed from: ı  reason: contains not printable characters */
    private final Call.Factory f12255;

    public C2664(OkHttpClient okHttpClient) {
        this.f12255 = okHttpClient;
        okHttpClient.cache();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3348d.C0155 m14139(Uri uri, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (C3505j.m2818(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!C3505j.m2819(i)) {
                builder.noCache();
            }
            if (!C3505j.m2817(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f12255.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new C3348d.C0155(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new C3348d.C0156(sb.toString(), i, code);
    }
}
