package o;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import o.C3348d;

/* renamed from: o.n  reason: case insensitive filesystem */
public final class C3614n implements C3348d {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final OkHttpClient f3372;

    public C3614n(Context context) {
        this(C3626z.m4084(context));
    }

    private C3614n(File file) {
        this(file, C3626z.m4090(file));
    }

    private C3614n(OkHttpClient okHttpClient) {
        this.f3372 = okHttpClient;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3348d.C0155 m3973(Uri uri, int i) {
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
        Response execute = this.f3372.newCall(url.build()).execute();
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3614n(java.io.File r5, long r6) {
        /*
            r4 = this;
            com.squareup.okhttp.OkHttpClient r0 = new com.squareup.okhttp.OkHttpClient
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.setConnectTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.setReadTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setWriteTimeout(r2, r1)
            r4.<init>((com.squareup.okhttp.OkHttpClient) r0)
            com.squareup.okhttp.OkHttpClient r0 = r4.f3372     // Catch:{ IOException -> 0x0025 }
            com.squareup.okhttp.Cache r1 = new com.squareup.okhttp.Cache     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r5, r6)     // Catch:{ IOException -> 0x0025 }
            r0.setCache(r1)     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3614n.<init>(java.io.File, long):void");
    }
}
