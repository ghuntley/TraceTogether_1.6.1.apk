package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

/* renamed from: o.kc  reason: case insensitive filesystem */
public final class C3534kc implements Callable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Cif f2623;

    /* renamed from: o.kc$if  reason: invalid class name */
    public static final class Cif implements Closeable {

        /* renamed from: ɩ  reason: contains not printable characters */
        private volatile InputStream f2624;

        /* renamed from: Ι  reason: contains not printable characters */
        public C0329<Bitmap> f2625;

        /* renamed from: ι  reason: contains not printable characters */
        final URL f2626;

        /* renamed from: ι  reason: contains not printable characters */
        public static Cif m3259(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new Cif(new URL(str));
            } catch (MalformedURLException unused) {
                return null;
            }
        }

        private Cif(URL url) {
            this.f2626 = url;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final byte[] m3260() {
            URLConnection openConnection = this.f2626.openConnection();
            if (openConnection.getContentLength() <= 1048576) {
                InputStream inputStream = openConnection.getInputStream();
                try {
                    this.f2624 = inputStream;
                    byte[] r1 = C1837.m10166(C1837.m10165(inputStream, 1048577));
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (r1.length <= 1048576) {
                        return r1;
                    }
                    throw new IOException("Image exceeds max size of 1048576");
                } catch (Throwable th) {
                    C1810.m10008(th, th);
                }
            } else {
                throw new IOException("Content-Length exceeds max size of 1048576");
            }
            throw th;
        }

        public final void close() {
            try {
                C1809.m10007(this.f2624);
            } catch (NullPointerException unused) {
            }
        }
    }

    public C3534kc(Cif ifVar) {
        this.f2623 = ifVar;
    }

    public final Object call() {
        Cif ifVar = this.f2623;
        byte[] r1 = ifVar.m3260();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(r1, 0, r1.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        String valueOf = String.valueOf(ifVar.f2626);
        StringBuilder sb = new StringBuilder(valueOf.length() + 24);
        sb.append("Failed to decode image: ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }
}
