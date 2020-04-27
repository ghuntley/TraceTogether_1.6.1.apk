package o;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import o.C1501;

@TargetApi(19)
/* renamed from: o.ƗΙ  reason: contains not printable characters */
public final class C0698 implements C0707, C0701 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Path f4873 = new Path();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Path f4874 = new Path();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Path f4875 = new Path();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1501 f4876;

    /* renamed from: Ι  reason: contains not printable characters */
    private final List<C0707> f4877 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f4878;

    public C0698(C1501 r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4878 = r3.f8008;
            this.f4876 = r3;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5748(java.util.ListIterator<o.C0550> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r3.previous()
            if (r0 != r2) goto L_0x0000
        L_0x000c:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r3.previous()
            o.łі r0 = (o.C0550) r0
            boolean r1 = r0 instanceof o.C0707
            if (r1 == 0) goto L_0x000c
            java.util.List<o.ƗӀ> r1 = r2.f4877
            o.ƗӀ r0 = (o.C0707) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000c
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0698.m5748(java.util.ListIterator):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5749(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < this.f4877.size(); i++) {
            this.f4877.get(i).m5136(list, list2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5746() {
        this.f4874.reset();
        if (this.f4876.f8007) {
            return this.f4874;
        }
        int i = AnonymousClass5.f4879[this.f4876.f8006.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f4877.size(); i2++) {
                this.f4874.addPath(this.f4877.get(i2).m5819());
            }
        } else if (i == 2) {
            m5745(Path.Op.UNION);
        } else if (i == 3) {
            m5745(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m5745(Path.Op.INTERSECT);
        } else if (i == 5) {
            m5745(Path.Op.XOR);
        }
        return this.f4874;
    }

    /* renamed from: o.ƗΙ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final /* synthetic */ int[] f4879 = new int[C1501.C1502.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.ɼι$ɩ[] r0 = o.C1501.C1502.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4879 = r0
                int[] r0 = f4879     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɼι$ɩ r1 = o.C1501.C1502.MERGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4879     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɼι$ɩ r1 = o.C1501.C1502.ADD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4879     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ɼι$ɩ r1 = o.C1501.C1502.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4879     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ɼι$ɩ r1 = o.C1501.C1502.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4879     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ɼι$ɩ r1 = o.C1501.C1502.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0698.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5747() {
        return this.f4878;
    }

    @TargetApi(19)
    /* renamed from: Ι  reason: contains not printable characters */
    private void m5745(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f4873.reset();
        this.f4875.reset();
        for (int size = this.f4877.size() - 1; size > 0; size--) {
            C0707 r1 = this.f4877.get(size);
            if (r1 instanceof C0592) {
                C0592 r12 = (C0592) r1;
                List<C0707> r2 = r12.m5238();
                for (int size2 = r2.size() - 1; size2 >= 0; size2--) {
                    Path r4 = r2.get(size2).m5819();
                    if (r12.f4513 != null) {
                        matrix2 = r12.f4513.m7509();
                    } else {
                        r12.f4509.reset();
                        matrix2 = r12.f4509;
                    }
                    r4.transform(matrix2);
                    this.f4873.addPath(r4);
                }
            } else {
                this.f4873.addPath(r1.m5819());
            }
        }
        C0707 r0 = this.f4877.get(0);
        if (r0 instanceof C0592) {
            C0592 r02 = (C0592) r0;
            List<C0707> r22 = r02.m5238();
            for (int i = 0; i < r22.size(); i++) {
                Path r3 = r22.get(i).m5819();
                if (r02.f4513 != null) {
                    matrix = r02.f4513.m7509();
                } else {
                    r02.f4509.reset();
                    matrix = r02.f4509;
                }
                r3.transform(matrix);
                this.f4875.addPath(r3);
            }
        } else {
            this.f4875.set(r0.m5819());
        }
        this.f4874.op(this.f4875, this.f4873, op);
    }
}
