package o;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: o.ŀɺ  reason: contains not printable characters */
public abstract class C0510 implements Serializable, Iterable<Byte> {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0591 f4249 = (C0517.m4978() ? new C0615((C0538) null) : new C0547((C0538) null));

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0510 f4250 = new C0594(C0936.f5913);

    /* renamed from: ι  reason: contains not printable characters */
    private static final Comparator<C0510> f4251 = new C0532();

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f4252 = 0;

    C0510() {
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m4956(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract byte m4961(int i);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract byte m4963(int i);

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract int m4965(int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m4966(C0513 r1);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m4967();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract C0510 m4968(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m4969(Charset charset);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract boolean m4970();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0510 m4957(byte[] bArr, int i, int i2) {
        m4958(i, i + i2, bArr.length);
        return new C0594(f4249.m5228(bArr, i, i2));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C0510 m4955(byte[] bArr) {
        return new C0594(bArr);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0510 m4959(String str) {
        return new C0594(str.getBytes(C0936.f5914));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m4962() {
        return m4967() == 0 ? "" : m4969(C0936.f5914);
    }

    public final int hashCode() {
        int i = this.f4252;
        if (i == 0) {
            int r0 = m4967();
            i = m4965(r0, 0, r0);
            if (i == 0) {
                i = 1;
            }
            this.f4252 = i;
        }
        return i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C0551 m4960(int i) {
        return new C0551(i, (C0538) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m4964() {
        return this.f4252;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m4958(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(m4967());
        objArr[2] = m4967() <= 50 ? C2236.m11687(this) : String.valueOf(C2236.m11687(m4968(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public /* synthetic */ Iterator iterator() {
        return new C0538(this);
    }
}
