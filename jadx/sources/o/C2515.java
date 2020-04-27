package o;

import java.util.Arrays;
import o.C0987;

/* renamed from: o.ьǃ  reason: contains not printable characters */
public final class C2515 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2515 f11429 = new C2515(0, new int[0], new Object[0], false);

    /* renamed from: ı  reason: contains not printable characters */
    private int f11430;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f11431;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f11432;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Object[] f11433;

    /* renamed from: ι  reason: contains not printable characters */
    private int[] f11434;

    /* renamed from: ι  reason: contains not printable characters */
    public static C2515 m13355() {
        return f11429;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C2515 m13352() {
        return new C2515();
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C2515 m13353(C2515 r6, C2515 r7) {
        int i = r6.f11432 + r7.f11432;
        int[] copyOf = Arrays.copyOf(r6.f11434, i);
        System.arraycopy(r7.f11434, 0, copyOf, r6.f11432, r7.f11432);
        Object[] copyOf2 = Arrays.copyOf(r6.f11433, i);
        System.arraycopy(r7.f11433, 0, copyOf2, r6.f11432, r7.f11432);
        return new C2515(i, copyOf, copyOf2, true);
    }

    private C2515() {
        this(0, new int[8], new Object[8], true);
    }

    private C2515(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11430 = -1;
        this.f11432 = i;
        this.f11434 = iArr;
        this.f11433 = objArr;
        this.f11431 = z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13359() {
        this.f11431 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13361(C2867 r4) {
        if (r4.m14895() == C0987.If.f6018) {
            for (int i = this.f11432 - 1; i >= 0; i--) {
                r4.m14870(this.f11434[i] >>> 3, this.f11433[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f11432; i2++) {
            r4.m14870(this.f11434[i2] >>> 3, this.f11433[i2]);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13357(C2867 r4) {
        if (this.f11432 != 0) {
            if (r4.m14895() == C0987.If.f6027) {
                for (int i = 0; i < this.f11432; i++) {
                    m13354(this.f11434[i], this.f11433[i], r4);
                }
                return;
            }
            for (int i2 = this.f11432 - 1; i2 >= 0; i2--) {
                m13354(this.f11434[i2], this.f11433[i2], r4);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m13354(int i, Object obj, C2867 r4) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            r4.m14890(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            r4.m14874(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            r4.m14902(i2, (C0510) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                r4.m14889(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C1124.m7560());
        } else if (r4.m14895() == C0987.If.f6027) {
            r4.m14879(i2);
            ((C2515) obj).m13357(r4);
            r4.m14888(i2);
        } else {
            r4.m14888(i2);
            ((C2515) obj).m13357(r4);
            r4.m14879(i2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m13358() {
        int i = this.f11430;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11432; i3++) {
            i2 += C0692.m5659(this.f11434[i3] >>> 3, (C0510) this.f11433[i3]);
        }
        this.f11430 = i2;
        return i2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m13362() {
        int i;
        int i2 = this.f11430;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11432; i4++) {
            int i5 = this.f11434[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C0692.m5658(i6, ((Long) this.f11433[i4]).longValue());
            } else if (i7 == 1) {
                i = C0692.m5672(i6, ((Long) this.f11433[i4]).longValue());
            } else if (i7 == 2) {
                i = C0692.m5648(i6, (C0510) this.f11433[i4]);
            } else if (i7 == 3) {
                i = (C0692.m5647(i6) << 1) + ((C2515) this.f11433[i4]).m13362();
            } else if (i7 == 5) {
                i = C0692.m5679(i6, ((Integer) this.f11433[i4]).intValue());
            } else {
                throw new IllegalStateException(C1124.m7560());
            }
            i3 += i;
        }
        this.f11430 = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2515)) {
            return false;
        }
        C2515 r9 = (C2515) obj;
        int i = this.f11432;
        if (i == r9.f11432) {
            int[] iArr = this.f11434;
            int[] iArr2 = r9.f11434;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f11433;
                Object[] objArr2 = r9.f11433;
                int i3 = this.f11432;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f11432;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f11434;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f11433;
        int i7 = this.f11432;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m13356(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f11432; i2++) {
            C1751.m9825(sb, i, String.valueOf(this.f11434[i2] >>> 3), this.f11433[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13360(int i, Object obj) {
        if (this.f11431) {
            int i2 = this.f11432;
            if (i2 == this.f11434.length) {
                int i3 = this.f11432 + (i2 < 4 ? 8 : i2 >> 1);
                this.f11434 = Arrays.copyOf(this.f11434, i3);
                this.f11433 = Arrays.copyOf(this.f11433, i3);
            }
            int[] iArr = this.f11434;
            int i4 = this.f11432;
            iArr[i4] = i;
            this.f11433[i4] = obj;
            this.f11432 = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
