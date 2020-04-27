package o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: o.ƚӏ  reason: contains not printable characters */
final class C0754 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C0754 f5101 = new C0754(new byte[0]);

    /* renamed from: ı  reason: contains not printable characters */
    private volatile int f5102;

    /* renamed from: Ι  reason: contains not printable characters */
    private final byte[] f5103;

    private C0754(byte[] bArr) {
        this.f5102 = 0;
        this.f5103 = bArr;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final byte m6021(int i) {
        return this.f5103[i];
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m6024() {
        return this.f5103.length;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6018() {
        return this.f5103.length == 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0754 m6013(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C0754(bArr2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0754 m6010(byte[] bArr) {
        return m6013(bArr, 0, bArr.length);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0754 m6007(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C0754(bArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0754 m6012(ByteBuffer byteBuffer) {
        return m6007(byteBuffer, byteBuffer.remaining());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0754 m6014(String str, String str2) {
        return new C0754(str.getBytes(str2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0754 m6006(String str) {
        try {
            return new C0754(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0754 m6015(List<C0754> list) {
        if (list.size() == 0) {
            return f5101;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int i = 0;
        for (C0754 r3 : list) {
            i += r3.m6024();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C0754 next : list) {
            System.arraycopy(next.f5103, 0, bArr, i2, next.m6024());
            i2 += next.m6024();
        }
        return new C0754(bArr);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6016(byte[] bArr, int i) {
        byte[] bArr2 = this.f5103;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6023(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f5103, i, bArr, i2, i3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6020(ByteBuffer byteBuffer) {
        byte[] bArr = this.f5103;
        byteBuffer.put(bArr, 0, bArr.length);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final byte[] m6017() {
        byte[] bArr = this.f5103;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final ByteBuffer m6019() {
        return ByteBuffer.wrap(this.f5103).asReadOnlyBuffer();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m6025(String str) {
        return new String(this.f5103, str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m6022() {
        try {
            return new String(this.f5103, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0754)) {
            return false;
        }
        byte[] bArr = this.f5103;
        int length = bArr.length;
        byte[] bArr2 = ((C0754) obj).f5103;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f5102;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f5103) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f5102 = i;
        }
        return i;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final InputStream m6026() {
        return new ByteArrayInputStream(this.f5103);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0755 m6009(int i) {
        return new C0755(new ByteArrayOutputStream(i));
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static C0755 m6008() {
        return m6009(32);
    }

    /* renamed from: o.ƚӏ$ı  reason: contains not printable characters */
    static final class C0755 extends FilterOutputStream {

        /* renamed from: ı  reason: contains not printable characters */
        private final ByteArrayOutputStream f5104;

        private C0755(ByteArrayOutputStream byteArrayOutputStream) {
            super(byteArrayOutputStream);
            this.f5104 = byteArrayOutputStream;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0754 m6027() {
            return new C0754(this.f5104.toByteArray());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C0756 m6011(int i) {
        return new C0756(i);
    }

    /* renamed from: o.ƚӏ$ɩ  reason: contains not printable characters */
    static final class C0756 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0872 f5105;

        /* renamed from: Ι  reason: contains not printable characters */
        private final byte[] f5106;

        private C0756(int i) {
            this.f5106 = new byte[i];
            this.f5105 = C0872.m6475(this.f5106);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0754 m6029() {
            this.f5105.m6500();
            return new C0754(this.f5106);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0872 m6028() {
            return this.f5105;
        }
    }
}
