package o;

import java.util.ArrayList;
import o.C1696;

/* renamed from: o.ʄ  reason: contains not printable characters */
public final class C1607 {

    /* renamed from: ı  reason: contains not printable characters */
    protected C1696 f8487;

    /* renamed from: Ɩ  reason: contains not printable characters */
    protected int f8488;

    /* renamed from: ǃ  reason: contains not printable characters */
    protected C1696 f8489;

    /* renamed from: ȷ  reason: contains not printable characters */
    private C1696 f8490;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C1696 f8491;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected C1696 f8492;

    /* renamed from: ɪ  reason: contains not printable characters */
    protected boolean f8493;

    /* renamed from: ɹ  reason: contains not printable characters */
    protected int f8494;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f8495;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f8496 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    protected C1696 f8497;

    /* renamed from: ι  reason: contains not printable characters */
    protected C1696 f8498;

    /* renamed from: І  reason: contains not printable characters */
    protected float f8499 = 0.0f;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f8500;

    /* renamed from: і  reason: contains not printable characters */
    protected ArrayList<C1696> f8501;

    /* renamed from: Ӏ  reason: contains not printable characters */
    protected boolean f8502;

    /* renamed from: ӏ  reason: contains not printable characters */
    boolean f8503;

    public C1607(C1696 r2, int i, boolean z) {
        this.f8497 = r2;
        this.f8495 = i;
        this.f8496 = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9330() {
        boolean z = true;
        int i = this.f8495 << 1;
        C1696 r4 = this.f8497;
        C1696 r5 = r4;
        boolean z2 = false;
        while (!z2) {
            this.f8494++;
            C1696 r8 = null;
            r4.f8841[this.f8495] = null;
            r4.f8848[this.f8495] = null;
            if (r4.f8850 != 8) {
                if (this.f8492 == null) {
                    this.f8492 = r4;
                }
                this.f8487 = r4;
                if (r4.f8818[this.f8495] == C1696.C1697.MATCH_CONSTRAINT && (r4.f8856[this.f8495] == 0 || r4.f8856[this.f8495] == 3 || r4.f8856[this.f8495] == 2)) {
                    this.f8488++;
                    float f = r4.f8825[this.f8495];
                    if (f > 0.0f) {
                        this.f8499 += r4.f8825[this.f8495];
                    }
                    int i2 = this.f8495;
                    if (r4.f8850 != 8 && r4.f8818[i2] == C1696.C1697.MATCH_CONSTRAINT && (r4.f8856[i2] == 0 || r4.f8856[i2] == 3)) {
                        if (f < 0.0f) {
                            this.f8502 = true;
                        } else {
                            this.f8500 = true;
                        }
                        if (this.f8501 == null) {
                            this.f8501 = new ArrayList<>();
                        }
                        this.f8501.add(r4);
                    }
                    if (this.f8490 == null) {
                        this.f8490 = r4;
                    }
                    C1696 r6 = this.f8491;
                    if (r6 != null) {
                        r6.f8848[this.f8495] = r4;
                    }
                    this.f8491 = r4;
                }
            }
            if (r5 != r4) {
                r5.f8841[this.f8495] = r4;
            }
            C1625 r52 = r4.f8826[i + 1].f8549;
            if (r52 != null) {
                C1696 r53 = r52.f8546;
                if (r53.f8826[i].f8549 != null && r53.f8826[i].f8549.f8546 == r4) {
                    r8 = r53;
                }
            }
            if (r8 != null) {
                r5 = r4;
                r4 = r8;
            } else {
                r5 = r4;
                z2 = true;
            }
        }
        this.f8489 = r4;
        if (this.f8495 != 0 || !this.f8496) {
            this.f8498 = this.f8497;
        } else {
            this.f8498 = this.f8489;
        }
        if (!this.f8500 || !this.f8502) {
            z = false;
        }
        this.f8493 = z;
    }
}
