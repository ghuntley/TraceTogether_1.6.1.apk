package o;

import java.util.Arrays;

/* renamed from: o.ղ  reason: contains not printable characters */
public final class C3134 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C3134 f14293 = new C3134(0, new int[0], new Object[0], false);

    /* renamed from: ı  reason: contains not printable characters */
    private int[] f14294;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f14295;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Object[] f14296;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f14297;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f14298;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3134 m15878() {
        return f14293;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C3134 m15881() {
        return new C3134();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C3134 m15882(C3134 r6, C3134 r7) {
        int i = r6.f14297 + r7.f14297;
        int[] copyOf = Arrays.copyOf(r6.f14294, i);
        System.arraycopy(r7.f14294, 0, copyOf, r6.f14297, r7.f14297);
        Object[] copyOf2 = Arrays.copyOf(r6.f14296, i);
        System.arraycopy(r7.f14296, 0, copyOf2, r6.f14297, r7.f14297);
        return new C3134(i, copyOf, copyOf2, true);
    }

    private C3134() {
        this(0, new int[8], new Object[8], true);
    }

    private C3134(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14295 = -1;
        this.f14297 = i;
        this.f14294 = iArr;
        this.f14296 = objArr;
        this.f14298 = z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15884(C2346 r6) {
        for (int i = 0; i < this.f14297; i++) {
            int i2 = this.f14294[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                r6.m12251(i3, ((Long) this.f14296[i]).longValue());
            } else if (i4 == 1) {
                r6.m12261(i3, ((Long) this.f14296[i]).longValue());
            } else if (i4 == 2) {
                r6.m12256(i3, (C1767) this.f14296[i]);
            } else if (i4 == 3) {
                r6.m12260(i3, 3);
                ((C3134) this.f14296[i]).m15884(r6);
                r6.m12260(i3, 4);
            } else if (i4 == 5) {
                r6.m12250(i3, ((Integer) this.f14296[i]).intValue());
            } else {
                throw new C2991("Protocol message tag had invalid wire type.");
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m15886() {
        int i;
        int i2 = this.f14295;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14297; i4++) {
            int i5 = this.f14294[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C2346.m12244(i6, ((Long) this.f14296[i4]).longValue());
            } else if (i7 == 1) {
                i = C2346.m12245(i6);
            } else if (i7 == 2) {
                i = C2346.m12246(i6, (C1767) this.f14296[i4]);
            } else if (i7 == 3) {
                i = (C2346.m12236(i6) << 1) + ((C3134) this.f14296[i4]).m15886();
            } else if (i7 == 5) {
                i = C2346.m12237(i6);
            } else {
                throw new IllegalStateException(new C2991("Protocol message tag had invalid wire type."));
            }
            i3 += i;
        }
        this.f14295 = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3134)) {
            return false;
        }
        C3134 r5 = (C3134) obj;
        return this.f14297 == r5.f14297 && Arrays.equals(this.f14294, r5.f14294) && Arrays.deepEquals(this.f14296, r5.f14296);
    }

    public final int hashCode() {
        return ((((this.f14297 + 527) * 31) + Arrays.hashCode(this.f14294)) * 31) + Arrays.deepHashCode(this.f14296);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15883(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f14297; i2++) {
            C3064.m15634(sb, i, String.valueOf(this.f14294[i2] >>> 3), this.f14296[i2]);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: Ι  reason: contains not printable characters */
    private o.C3134 m15879(o.C1841 r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.m10178()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.m15885((int) r0, (o.C1841) r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3134.m15879(o.Ιʬ):o.ղ");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15880(int i, Object obj) {
        int i2 = this.f14297;
        if (i2 == this.f14294.length) {
            int i3 = this.f14297 + (i2 < 4 ? 8 : i2 >> 1);
            this.f14294 = Arrays.copyOf(this.f14294, i3);
            this.f14296 = Arrays.copyOf(this.f14296, i3);
        }
        int[] iArr = this.f14294;
        int i4 = this.f14297;
        iArr[i4] = i;
        this.f14296[i4] = obj;
        this.f14297 = i4 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m15885(int i, C1841 r7) {
        if (this.f14298) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                m15880(i, Long.valueOf(r7.m10184()));
                return true;
            } else if (i3 == 1) {
                m15880(i, Long.valueOf(r7.m10180()));
                return true;
            } else if (i3 == 2) {
                m15880(i, r7.m10187());
                return true;
            } else if (i3 == 3) {
                C3134 r1 = new C3134();
                r1.m15879(r7);
                if (r7.f9437 == ((i2 << 3) | 4)) {
                    m15880(i, r1);
                    return true;
                }
                throw new C2991("Protocol message end-group tag did not match expected tag.");
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    m15880(i, Integer.valueOf(r7.m10181()));
                    return true;
                }
                throw new C2991("Protocol message tag had invalid wire type.");
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
