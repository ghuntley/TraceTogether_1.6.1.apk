package o;

/* renamed from: o.ǀǃ  reason: contains not printable characters */
public final class C0845 implements C0970 {

    /* renamed from: ı  reason: contains not printable characters */
    private Object f5538 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f5539 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C0970 f5540;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f5541 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    private int f5542 = 0;

    public C0845(C0970 r2) {
        this.f5540 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6316() {
        int i = this.f5542;
        if (i != 0) {
            if (i == 1) {
                this.f5540.onInserted(this.f5541, this.f5539);
            } else if (i == 2) {
                this.f5540.onRemoved(this.f5541, this.f5539);
            } else if (i == 3) {
                this.f5540.onChanged(this.f5541, this.f5539, this.f5538);
            }
            this.f5538 = null;
            this.f5542 = 0;
        }
    }

    public final void onInserted(int i, int i2) {
        int i3;
        if (this.f5542 == 1 && i >= (i3 = this.f5541)) {
            int i4 = this.f5539;
            if (i <= i3 + i4) {
                this.f5539 = i4 + i2;
                this.f5541 = Math.min(i, i3);
                return;
            }
        }
        m6316();
        this.f5541 = i;
        this.f5539 = i2;
        this.f5542 = 1;
    }

    public final void onRemoved(int i, int i2) {
        int i3;
        if (this.f5542 != 2 || (i3 = this.f5541) < i || i3 > i + i2) {
            m6316();
            this.f5541 = i;
            this.f5539 = i2;
            this.f5542 = 2;
            return;
        }
        this.f5539 += i2;
        this.f5541 = i;
    }

    public final void onMoved(int i, int i2) {
        m6316();
        this.f5540.onMoved(i, i2);
    }

    public final void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f5542 == 3) {
            int i4 = this.f5541;
            int i5 = this.f5539;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f5538 == obj) {
                this.f5541 = Math.min(i, i4);
                this.f5539 = Math.max(i5 + i4, i3) - this.f5541;
                return;
            }
        }
        m6316();
        this.f5541 = i;
        this.f5539 = i2;
        this.f5538 = obj;
        this.f5542 = 3;
    }
}
