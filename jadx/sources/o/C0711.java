package o;

/* renamed from: o.Ƙ  reason: contains not printable characters */
abstract class C0711 extends C0524<String> {

    /* renamed from: ı  reason: contains not printable characters */
    private int f4918;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f4919 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0579 f4920;

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean f4921;

    /* renamed from: ι  reason: contains not printable characters */
    final CharSequence f4922;

    protected C0711(C0669 r3, CharSequence charSequence) {
        this.f4920 = r3.f4766;
        this.f4921 = false;
        this.f4918 = r3.f4769;
        this.f4922 = charSequence;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m5822(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m5824(int i);

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ Object m5823() {
        int i;
        int i2 = this.f4919;
        while (true) {
            int i3 = this.f4919;
            if (i3 != -1) {
                int r1 = m5824(i3);
                if (r1 == -1) {
                    r1 = this.f4922.length();
                    this.f4919 = -1;
                } else {
                    this.f4919 = m5822(r1);
                }
                int i4 = this.f4919;
                if (i4 == i2) {
                    this.f4919 = i4 + 1;
                    if (this.f4919 > this.f4922.length()) {
                        this.f4919 = -1;
                    }
                } else {
                    while (i2 < r1 && this.f4920.m5202(this.f4922.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f4920.m5202(this.f4922.charAt(i - 1))) {
                        r1 = i - 1;
                    }
                    if (!this.f4921 || i2 != i) {
                        int i5 = this.f4918;
                    } else {
                        i2 = this.f4919;
                    }
                }
            } else {
                m5081();
                return null;
            }
        }
        int i52 = this.f4918;
        if (i52 == 1) {
            i = this.f4922.length();
            this.f4919 = -1;
            while (i > i2 && this.f4920.m5202(this.f4922.charAt(i - 1))) {
                i--;
            }
        } else {
            this.f4918 = i52 - 1;
        }
        return this.f4922.subSequence(i2, i).toString();
    }
}
