package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C1578;
import o.C1685;

/* renamed from: o.ʏı  reason: contains not printable characters */
public final class C1646 extends C1578 {

    /* renamed from: ȷ  reason: contains not printable characters */
    private Paint f8622 = new Paint();

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0742<Float, Float> f8623;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final RectF f8624 = new RectF();

    /* renamed from: І  reason: contains not printable characters */
    private final RectF f8625 = new RectF();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final List<C1578> f8626 = new ArrayList();

    public C1646(C0379 r10, C1685 r11, List<C1685> list, C0343 r13) {
        super(r10, r11);
        C1578 r12;
        C1578 r6;
        C1282 r112 = r11.f8738;
        if (r112 != null) {
            this.f8623 = new C0965(r112.f7684);
            C0742<Float, Float> r113 = this.f8623;
            if (r113 != null) {
                this.f8389.add(r113);
            }
            this.f8623.f5002.add(this);
        } else {
            this.f8623 = null;
        }
        C0782 r114 = new C0782(r13.f3723.size());
        int size = list.size() - 1;
        C1578 r3 = null;
        while (true) {
            if (size >= 0) {
                C1685 r5 = list.get(size);
                switch (C1578.AnonymousClass5.f8408[r5.f8736.ordinal()]) {
                    case 1:
                        r6 = new C1694(r10, r5);
                        break;
                    case 2:
                        r6 = new C1646(r10, r5, r13.f3727.get(r5.f8737), r13);
                        break;
                    case 3:
                        r6 = new C1772(r10, r5);
                        break;
                    case 4:
                        r6 = new C1593(r10, r5);
                        break;
                    case 5:
                        r6 = new C1648(r10, r5);
                        break;
                    case 6:
                        r6 = new C1788(r10, r5);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(r5.f8736);
                        C2414.m12460(sb.toString());
                        r6 = null;
                        break;
                }
                if (r6 != null) {
                    r114.m6116(r6.f8400.f8728, r6);
                    if (r3 != null) {
                        r3.m9258(r6);
                        r3 = null;
                    } else {
                        this.f8626.add(0, r6);
                        int i = AnonymousClass3.f8627[r5.f8733.ordinal()];
                        if (i == 1 || i == 2) {
                            r3 = r6;
                        }
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < r114.m6121(); i2++) {
                    C1578 r102 = (C1578) r114.m6119(r114.m6114(i2), null);
                    if (!(r102 == null || (r12 = (C1578) r114.m6119(r102.f8400.f8739, null)) == null)) {
                        r102.m9251(r12);
                    }
                }
                return;
            }
        }
    }

    /* renamed from: o.ʏı$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f8627 = new int[C1685.C1686.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                o.ʟɹ$ǃ[] r0 = o.C1685.C1686.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8627 = r0
                int[] r0 = f8627     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ʟɹ$ǃ r1 = o.C1685.C1686.ADD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8627     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ʟɹ$ǃ r1 = o.C1685.C1686.INVERT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1646.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9476(Canvas canvas, Matrix matrix, int i) {
        C2921.m15081();
        this.f8624.set(0.0f, 0.0f, (float) this.f8400.f8727, (float) this.f8400.f8721);
        matrix.mapRect(this.f8624);
        boolean z = this.f8384.f3887 && this.f8626.size() > 1 && i != 255;
        if (z) {
            this.f8622.setAlpha(i);
            C2467.m12714(canvas, this.f8624, this.f8622);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f8626.size() - 1; size >= 0; size--) {
            if (!this.f8624.isEmpty() ? canvas.clipRect(this.f8624) : true) {
                this.f8626.get(size).m9255(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2921.m15080();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9479(RectF rectF, Matrix matrix, boolean z) {
        super.m9256(rectF, matrix, z);
        for (int size = this.f8626.size() - 1; size >= 0; size--) {
            this.f8625.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f8626.get(size).m9256(this.f8625, this.f8399, true);
            rectF.union(this.f8625);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9480(float f) {
        super.m9259(f);
        if (this.f8623 != null) {
            C0343 r4 = this.f8384.f3879;
            f = ((this.f8623.m5937().floatValue() * this.f8400.f8720.f3726) - this.f8400.f8720.f3725) / ((r4.f3730 - r4.f3725) + 0.01f);
        }
        if (this.f8623 == null) {
            C1685 r0 = this.f8400;
            float f2 = r0.f8741;
            C0343 r02 = r0.f8720;
            f -= f2 / (r02.f3730 - r02.f3725);
        }
        if (this.f8400.f8731 != 0.0f) {
            f /= this.f8400.f8731;
        }
        for (int size = this.f8626.size() - 1; size >= 0; size--) {
            this.f8626.get(size).m9259(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9477(C1695 r3, int i, List<C1695> list, C1695 r6) {
        for (int i2 = 0; i2 < this.f8626.size(); i2++) {
            this.f8626.get(i2).m9257(r3, i, list, r6);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m9478(T t, C2476<T> r3) {
        super.m9253(t, r3);
        if (t != C0349.f3767) {
            return;
        }
        if (r3 == null) {
            C0742<Float, Float> r2 = this.f8623;
            if (r2 != null) {
                r2.m5932((C2476<Float>) null);
                return;
            }
            return;
        }
        this.f8623 = new C1120(r3);
        this.f8623.f5002.add(this);
        C0742<Float, Float> r22 = this.f8623;
        if (r22 != null) {
            this.f8389.add(r22);
        }
    }
}
