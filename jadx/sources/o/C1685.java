package o;

import java.util.List;
import java.util.Locale;

/* renamed from: o.ʟɹ  reason: contains not printable characters */
public final class C1685 {

    /* renamed from: ı  reason: contains not printable characters */
    final C0343 f8720;

    /* renamed from: ŀ  reason: contains not printable characters */
    final int f8721;

    /* renamed from: ł  reason: contains not printable characters */
    final C1435 f8722;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C1360 f8723;

    /* renamed from: Ɨ  reason: contains not printable characters */
    final boolean f8724;

    /* renamed from: ǃ  reason: contains not printable characters */
    final List<C1455> f8725;

    /* renamed from: ȷ  reason: contains not printable characters */
    final int f8726;

    /* renamed from: ɨ  reason: contains not printable characters */
    final int f8727;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long f8728;

    /* renamed from: ɪ  reason: contains not printable characters */
    final int f8729;

    /* renamed from: ɹ  reason: contains not printable characters */
    final int f8730;

    /* renamed from: ɾ  reason: contains not printable characters */
    final float f8731;

    /* renamed from: ɿ  reason: contains not printable characters */
    final List<C2463<Float>> f8732;

    /* renamed from: ʅ  reason: contains not printable characters */
    final C1686 f8733;

    /* renamed from: ʟ  reason: contains not printable characters */
    final C2724 f8734;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f8735;

    /* renamed from: ι  reason: contains not printable characters */
    public final If f8736;

    /* renamed from: І  reason: contains not printable characters */
    final String f8737;

    /* renamed from: г  reason: contains not printable characters */
    final C1282 f8738;

    /* renamed from: і  reason: contains not printable characters */
    final long f8739;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final List<C1463> f8740;

    /* renamed from: ӏ  reason: contains not printable characters */
    final float f8741;

    /* renamed from: o.ʟɹ$If */
    public enum If {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: o.ʟɹ$ǃ  reason: contains not printable characters */
    public enum C1686 {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public C1685(List<C1455> list, C0343 r5, String str, long j, If ifR, long j2, String str2, List<C1463> list2, C1360 r14, int i, int i2, int i3, float f, float f2, int i4, int i5, C1435 r22, C2724 r23, List<C2463<Float>> list3, C1686 r25, C1282 r26, boolean z) {
        this.f8725 = list;
        this.f8720 = r5;
        this.f8735 = str;
        this.f8728 = j;
        this.f8736 = ifR;
        this.f8739 = j2;
        this.f8737 = str2;
        this.f8740 = list2;
        this.f8723 = r14;
        this.f8730 = i;
        this.f8726 = i2;
        this.f8729 = i3;
        this.f8731 = f;
        this.f8741 = f2;
        this.f8727 = i4;
        this.f8721 = i5;
        this.f8722 = r22;
        this.f8734 = r23;
        this.f8732 = list3;
        this.f8733 = r25;
        this.f8738 = r26;
        this.f8724 = z;
    }

    public final String toString() {
        return m9582("");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m9582(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f8735);
        sb.append("\n");
        C0343 r2 = this.f8720;
        C1685 r22 = r2.f3735.m6119(this.f8739, null);
        if (r22 != null) {
            sb.append("\t\tParents: ");
            sb.append(r22.f8735);
            C0343 r3 = this.f8720;
            C1685 r23 = r3.f3735.m6119(r22.f8739, null);
            while (r23 != null) {
                sb.append("->");
                sb.append(r23.f8735);
                C0343 r32 = this.f8720;
                r23 = r32.f3735.m6119(r23.f8739, null);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f8740.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f8740.size());
            sb.append("\n");
        }
        if (!(this.f8730 == 0 || this.f8726 == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f8730), Integer.valueOf(this.f8726), Integer.valueOf(this.f8729)}));
        }
        if (!this.f8725.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (C1455 next : this.f8725) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
