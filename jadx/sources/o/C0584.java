package o;

/* renamed from: o.ſǀ  reason: contains not printable characters */
final class C0584 extends C0594 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f4498;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f4499;

    C0584(byte[] bArr, int i, int i2) {
        super(bArr);
        m4958(i, i + i2, bArr.length);
        this.f4498 = i;
        this.f4499 = i2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte m5208(int i) {
        int r0 = m4967();
        if (((r0 - (i + 1)) | i) >= 0) {
            return this.f4529[this.f4498 + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(r0);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final byte m5207(int i) {
        return this.f4529[this.f4498 + i];
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m5209() {
        return this.f4499;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m5210() {
        return this.f4498;
    }
}
