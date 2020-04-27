package o;

final class jS {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f2445;

    /* renamed from: ǃ  reason: contains not printable characters */
    final byte[] f2446;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f2447;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f2448;

    /* renamed from: ι  reason: contains not printable characters */
    int f2449;

    /* renamed from: І  reason: contains not printable characters */
    jS f2450;

    /* renamed from: і  reason: contains not printable characters */
    jS f2451;

    jS() {
        this.f2446 = new byte[8192];
        this.f2448 = true;
        this.f2445 = false;
    }

    jS(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f2446 = bArr;
        this.f2449 = i;
        this.f2447 = i2;
        this.f2445 = z;
        this.f2448 = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final jS m2986() {
        return new jS((byte[]) this.f2446.clone(), this.f2449, this.f2447, false, true);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final jS m2984() {
        jS jSVar = this.f2450;
        if (jSVar == this) {
            jSVar = null;
        }
        jS jSVar2 = this.f2451;
        jSVar2.f2450 = this.f2450;
        this.f2450.f2451 = jSVar2;
        this.f2450 = null;
        this.f2451 = null;
        return jSVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2985(jS jSVar, int i) {
        if (jSVar.f2448) {
            int i2 = jSVar.f2447;
            if (i2 + i > 8192) {
                if (!jSVar.f2445) {
                    int i3 = jSVar.f2449;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = jSVar.f2446;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        jSVar.f2447 -= jSVar.f2449;
                        jSVar.f2449 = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f2446, this.f2449, jSVar.f2446, jSVar.f2447, i);
            jSVar.f2447 += i;
            this.f2449 += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
