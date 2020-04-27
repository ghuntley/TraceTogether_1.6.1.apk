package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C0742;
import o.C2864;

/* renamed from: o.ſΙ  reason: contains not printable characters */
public final class C0592 implements C0648, C0707, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Path f4507;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final String f4508;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Matrix f4509;

    /* renamed from: ɨ  reason: contains not printable characters */
    private List<C0707> f4510;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Paint f4511;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final List<C0550> f4512;

    /* renamed from: Ι  reason: contains not printable characters */
    C1109 f4513;

    /* renamed from: ι  reason: contains not printable characters */
    private RectF f4514;

    /* renamed from: І  reason: contains not printable characters */
    private final C0379 f4515;

    /* renamed from: і  reason: contains not printable characters */
    private final RectF f4516;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final boolean f4517;

    /* renamed from: ı  reason: contains not printable characters */
    private static List<C0550> m5229(C0379 r3, C1578 r4, List<C1455> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C0550 r2 = list.get(i).m8716(r3, r4);
            if (r2 != null) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C1360 m5230(List<C1455> list) {
        for (int i = 0; i < list.size(); i++) {
            C1455 r1 = list.get(i);
            if (r1 instanceof C1360) {
                return (C1360) r1;
            }
        }
        return null;
    }

    C0592(C0379 r2, C1578 r3, String str, boolean z, List<C0550> list, C1360 r7) {
        this.f4511 = new C0552();
        this.f4514 = new RectF();
        this.f4509 = new Matrix();
        this.f4507 = new Path();
        this.f4516 = new RectF();
        this.f4508 = str;
        this.f4515 = r2;
        this.f4517 = z;
        this.f4512 = list;
        if (r7 != null) {
            this.f4513 = new C1109(r7);
            this.f4513.m7510(r3);
            this.f4513.m7511(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C0550 r4 = list.get(size);
            if (r4 instanceof C0701) {
                arrayList.add((C0701) r4);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C0701) arrayList.get(size2)).m5805(list.listIterator(list.size()));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5231() {
        this.f4515.invalidateSelf();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5234() {
        return this.f4508;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5239(List<C0550> list, List<C0550> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f4512.size());
        arrayList.addAll(list);
        for (int size = this.f4512.size() - 1; size >= 0; size--) {
            C0550 r0 = this.f4512.get(size);
            r0.m5136(arrayList, this.f4512.subList(0, size));
            arrayList.add(r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final List<C0707> m5238() {
        if (this.f4510 == null) {
            this.f4510 = new ArrayList();
            for (int i = 0; i < this.f4512.size(); i++) {
                C0550 r1 = this.f4512.get(i);
                if (r1 instanceof C0707) {
                    this.f4510.add((C0707) r1);
                }
            }
        }
        return this.f4510;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5232() {
        this.f4509.reset();
        C1109 r0 = this.f4513;
        if (r0 != null) {
            this.f4509.set(r0.m7509());
        }
        this.f4507.reset();
        if (this.f4517) {
            return this.f4507;
        }
        for (int size = this.f4512.size() - 1; size >= 0; size--) {
            C0550 r1 = this.f4512.get(size);
            if (r1 instanceof C0707) {
                this.f4507.addPath(((C0707) r1).m5819(), this.f4509);
            }
        }
        return this.f4507;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5235(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (!this.f4517) {
            this.f4509.set(matrix);
            C1109 r7 = this.f4513;
            if (r7 != null) {
                this.f4509.preConcat(r7.m7509());
                i = (int) ((((((float) (this.f4513.f6577 == null ? 100 : this.f4513.f6577.m5937().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.f4515.f3887) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 < this.f4512.size()) {
                        if ((this.f4512.get(i2) instanceof C0648) && (i3 = i3 + 1) >= 2) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && i != 255) {
                    z2 = true;
                }
            }
            if (z2) {
                this.f4514.set(0.0f, 0.0f, 0.0f, 0.0f);
                m5236(this.f4514, this.f4509, true);
                this.f4511.setAlpha(i);
                C2467.m12714(canvas, this.f4514, this.f4511);
            }
            if (z2) {
                i = 255;
            }
            for (int size = this.f4512.size() - 1; size >= 0; size--) {
                C0550 r0 = this.f4512.get(size);
                if (r0 instanceof C0648) {
                    ((C0648) r0).m5437(canvas, this.f4509, i);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5236(RectF rectF, Matrix matrix, boolean z) {
        this.f4509.set(matrix);
        C1109 r5 = this.f4513;
        if (r5 != null) {
            this.f4509.preConcat(r5.m7509());
        }
        this.f4516.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f4512.size() - 1; size >= 0; size--) {
            C0550 r0 = this.f4512.get(size);
            if (r0 instanceof C0648) {
                ((C0648) r0).m5438(this.f4516, this.f4509, z);
                rectF.union(this.f4516);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5233(T t, C2476<T> r3) {
        C1109 r0 = this.f4513;
        if (r0 != null) {
            r0.m7508(t, r3);
        }
    }

    public C0592(C0379 r8, C1578 r9, C2864.If ifR) {
        this(r8, r9, ifR.f13335, ifR.f13334, m5229(r8, r9, ifR.f13336), m5230(ifR.f13336));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5237(C1695 r4, int i, List<C1695> list, C1695 r7) {
        if (r4.m9617(this.f4508, i)) {
            if (!"__container".equals(this.f4508)) {
                String str = this.f4508;
                C1695 r1 = new C1695(r7);
                r1.f8806.add(str);
                if (r4.m9618(this.f4508, i)) {
                    C1695 r72 = new C1695(r1);
                    r72.f8807 = this;
                    list.add(r72);
                }
                r7 = r1;
            }
            if (r4.m9615(this.f4508, i)) {
                int r5 = i + r4.m9616(this.f4508, i);
                for (int i2 = 0; i2 < this.f4512.size(); i2++) {
                    C0550 r12 = this.f4512.get(i2);
                    if (r12 instanceof C1214) {
                        ((C1214) r12).m7882(r4, r5, list, r7);
                    }
                }
            }
        }
    }
}
