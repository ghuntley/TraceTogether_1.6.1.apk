package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import o.aE;

/* renamed from: o.ɪɨ  reason: contains not printable characters */
class C1354 implements C1075 {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f7508;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final File f7509;

    /* renamed from: ɩ  reason: contains not printable characters */
    private aE f7510;

    /* renamed from: o.ɪɨ$ı  reason: contains not printable characters */
    public class C1355 {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int f7515;

        /* renamed from: ι  reason: contains not printable characters */
        public final byte[] f7516;

        public C1355(byte[] bArr, int i) {
            this.f7516 = bArr;
            this.f7515 = i;
        }
    }

    public C1354(File file, int i) {
        this.f7509 = file;
        this.f7508 = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m8466(long j, String str) {
        m8461();
        m8459(j, str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C0754 m8462() {
        C1355 r0 = m8460();
        if (r0 == null) {
            return null;
        }
        return C0754.m6013(r0.f7516, 0, r0.f7515);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public byte[] m8463() {
        C1355 r0 = m8460();
        if (r0 == null) {
            return null;
        }
        return r0.f7516;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C1355 m8460() {
        if (!this.f7509.exists()) {
            return null;
        }
        m8461();
        aE aEVar = this.f7510;
        if (aEVar == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[aEVar.m1475()];
        try {
            this.f7510.m1478(new aE.C0109() {
                /* renamed from: ι  reason: contains not printable characters */
                public void m8467(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException unused) {
            C3263ac.m1563();
        }
        return new C1355(bArr, iArr[0]);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m8465() {
        C3285aw.m1667((Closeable) this.f7510);
        this.f7510 = null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8464() {
        m8465();
        this.f7509.delete();
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m8461() {
        if (this.f7510 == null) {
            try {
                this.f7510 = new aE(this.f7509);
            } catch (IOException unused) {
                C3263ac.m1563();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8459(long j, String str) {
        if (this.f7510 != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f7508 / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                String replaceAll = str.replaceAll("\r", " ").replaceAll("\n", " ");
                byte[] bytes = String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), replaceAll}).getBytes("UTF-8");
                this.f7510.m1477(bytes, bytes.length);
                while (!this.f7510.m1479() && this.f7510.m1475() > this.f7508) {
                    this.f7510.m1476();
                }
            } catch (IOException unused) {
                C3263ac.m1563();
            }
        }
    }
}
