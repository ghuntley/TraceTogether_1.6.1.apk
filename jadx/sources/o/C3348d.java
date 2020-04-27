package o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.d  reason: case insensitive filesystem */
public interface C3348d {
    /* renamed from: ǃ  reason: contains not printable characters */
    C0155 m2051(Uri uri, int i);

    /* renamed from: o.d$ǃ  reason: contains not printable characters */
    public static class C0156 extends IOException {

        /* renamed from: ı  reason: contains not printable characters */
        final int f2026;

        /* renamed from: ǃ  reason: contains not printable characters */
        final boolean f2027;

        public C0156(String str, int i, int i2) {
            super(str);
            this.f2027 = C3505j.m2818(i);
            this.f2026 = i2;
        }
    }

    /* renamed from: o.d$ı  reason: contains not printable characters */
    public static class C0155 {

        /* renamed from: ı  reason: contains not printable characters */
        final long f2023;

        /* renamed from: ǃ  reason: contains not printable characters */
        final InputStream f2024;

        /* renamed from: ɩ  reason: contains not printable characters */
        final boolean f2025;

        public C0155(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f2024 = inputStream;
                this.f2025 = z;
                this.f2023 = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }
}
