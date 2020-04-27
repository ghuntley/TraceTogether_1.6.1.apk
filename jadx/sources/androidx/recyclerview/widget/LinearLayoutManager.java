package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o.C0293;
import o.C0878;
import o.C0966;
import o.C0974;
import o.C1100;

public class LinearLayoutManager extends RecyclerView.IF implements RecyclerView.C3240AuX.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f279;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f280;

    /* renamed from: ǀ  reason: contains not printable characters */
    private boolean f281;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f282;

    /* renamed from: ɔ  reason: contains not printable characters */
    private final C0024 f283;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f284;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f285;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f286;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int[] f287;

    /* renamed from: ɾ  reason: contains not printable characters */
    final If f288;

    /* renamed from: Ι  reason: contains not printable characters */
    private Cif f289;

    /* renamed from: ι  reason: contains not printable characters */
    public int f290;

    /* renamed from: І  reason: contains not printable characters */
    C0966 f291;

    /* renamed from: і  reason: contains not printable characters */
    public C0023 f292;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f293;

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m287() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m302(RecyclerView.AUx aUx, RecyclerView.C0033 r2, If ifR, int i) {
    }

    public LinearLayoutManager(Context context) {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.f290 = 1;
        this.f284 = false;
        this.f293 = false;
        this.f279 = false;
        this.f281 = true;
        this.f285 = -1;
        this.f280 = RecyclerView.UNDEFINED_DURATION;
        this.f292 = null;
        this.f288 = new If();
        this.f283 = new C0024();
        this.f286 = 2;
        this.f287 = new int[2];
        m284(i);
        if (this.f292 == null) {
            super.m440((String) null);
        }
        if (this.f284) {
            this.f284 = false;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f290 = 1;
        this.f284 = false;
        this.f293 = false;
        this.f279 = false;
        this.f281 = true;
        this.f285 = -1;
        this.f280 = RecyclerView.UNDEFINED_DURATION;
        this.f292 = null;
        this.f288 = new If();
        this.f283 = new C0024();
        this.f286 = 2;
        this.f287 = new int[2];
        RecyclerView.IF.C0026 r3 = m381(context, attributeSet, i, i2);
        m284(r3.f359);
        boolean z = r3.f360;
        if (this.f292 == null) {
            super.m440((String) null);
        }
        if (z != this.f284) {
            this.f284 = z;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
        m295(r3.f358);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public RecyclerView.C0038 m307() {
        return new RecyclerView.C0038(-2, -2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m312(RecyclerView recyclerView, RecyclerView.AUx aUx) {
        super.m439(recyclerView, aUx);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m285(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        super.m401(accessibilityEvent);
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            if (this.f345 != null) {
                C0878 r02 = this.f345;
                i2 = r02.f5664.m6559() - r02.f5662.size();
            } else {
                i2 = 0;
            }
            View r03 = m268(0, i2, false);
            int i5 = -1;
            if (r03 == null) {
                i3 = -1;
            } else {
                i3 = ((RecyclerView.C0038) r03.getLayoutParams()).f388.getLayoutPosition();
            }
            accessibilityEvent.setFromIndex(i3);
            if (this.f345 != null) {
                C0878 r04 = this.f345;
                i4 = r04.f5664.m6559() - r04.f5662.size();
            } else {
                i4 = 0;
            }
            View r05 = m268(i4 - 1, -1, false);
            if (r05 != null) {
                i5 = ((RecyclerView.C0038) r05.getLayoutParams()).f388.getLayoutPosition();
            }
            accessibilityEvent.setToIndex(i5);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Parcelable m317() {
        int i;
        C0023 r0 = this.f292;
        if (r0 != null) {
            return new C0023(r0);
        }
        C0023 r02 = new C0023();
        int i2 = 0;
        if (this.f345 != null) {
            C0878 r1 = this.f345;
            i = r1.f5664.m6559() - r1.f5662.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            if (this.f289 == null) {
                this.f289 = new Cif();
            }
            boolean z = this.f282;
            boolean z2 = this.f293;
            boolean z3 = z ^ z2;
            r02.f313 = z3;
            if (z3) {
                if (!z2) {
                    if (this.f345 != null) {
                        C0878 r12 = this.f345;
                        i2 = r12.f5664.m6559() - r12.f5662.size();
                    }
                    i2--;
                }
                View r13 = m432(i2);
                r02.f312 = this.f291.m6886() - this.f291.m6895(r13);
                r02.f311 = ((RecyclerView.C0038) r13.getLayoutParams()).f388.getLayoutPosition();
            } else {
                if (z2) {
                    if (this.f345 != null) {
                        C0878 r14 = this.f345;
                        i2 = r14.f5664.m6559() - r14.f5662.size();
                    }
                    i2--;
                }
                View r15 = m432(i2);
                r02.f311 = ((RecyclerView.C0038) r15.getLayoutParams()).f388.getLayoutPosition();
                r02.f312 = this.f291.m6897(r15) - this.f291.m6889();
            }
        } else {
            r02.f311 = -1;
        }
        return r02;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m293(Parcelable parcelable) {
        if (parcelable instanceof C0023) {
            this.f292 = (C0023) parcelable;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m288() {
        return this.f290 == 0;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m319() {
        return this.f290 == 1;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final int m303() {
        return this.f290;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m284(int i) {
        if (i == 0 || i == 1) {
            if (this.f292 == null) {
                super.m440((String) null);
            }
            if (i != this.f290 || this.f291 == null) {
                this.f291 = C0966.m6885(this, i);
                this.f288.f296 = this.f291;
                this.f290 = i;
                if (this.f349 != null) {
                    this.f349.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m280() {
        boolean z = false;
        if (this.f290 != 1) {
            if (C0293.m4156(this.f349) == 1) {
                if (!this.f284) {
                    z = true;
                }
                this.f293 = z;
            }
        }
        z = this.f284;
        this.f293 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m286(RecyclerView recyclerView, int i) {
        C0974 r0 = new C0974(recyclerView.getContext());
        r0.setTargetPosition(i);
        m403((RecyclerView.C3240AuX) r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0377  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m301(androidx.recyclerview.widget.RecyclerView.AUx r18, androidx.recyclerview.widget.RecyclerView.C0033 r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r6.f292
            r9 = -1
            if (r0 != 0) goto L_0x000f
            int r0 = r6.f285
            if (r0 == r9) goto L_0x0021
        L_0x000f:
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x0019
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x001b
        L_0x0019:
            int r0 = r8.f366
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            r17.m402((androidx.recyclerview.widget.RecyclerView.AUx) r18)
            return
        L_0x0021:
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r6.f292
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0036
            int r0 = r0.f311
            if (r0 < 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r6.f292
            int r0 = r0.f311
            r6.f285 = r0
        L_0x0036:
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            if (r0 != 0) goto L_0x0041
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = new androidx.recyclerview.widget.LinearLayoutManager$if
            r0.<init>()
            r6.f289 = r0
        L_0x0041:
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r0.f306 = r11
            r17.m280()
            android.view.View r0 = r17.m431()
            androidx.recyclerview.widget.LinearLayoutManager$If r1 = r6.f288
            boolean r1 = r1.f297
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x008e
            int r1 = r6.f285
            if (r1 != r9) goto L_0x008e
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r1 = r6.f292
            if (r1 == 0) goto L_0x005d
            goto L_0x008e
        L_0x005d:
            if (r0 == 0) goto L_0x03a3
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6897(r0)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6886()
            if (r1 >= r2) goto L_0x007b
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6895(r0)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6889()
            if (r1 > r2) goto L_0x03a3
        L_0x007b:
            androidx.recyclerview.widget.LinearLayoutManager$If r1 = r6.f288
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r2 = (androidx.recyclerview.widget.RecyclerView.C0038) r2
            androidx.recyclerview.widget.RecyclerView$con r2 = r2.f388
            int r2 = r2.getLayoutPosition()
            r1.m323(r0, r2)
            goto L_0x03a3
        L_0x008e:
            androidx.recyclerview.widget.LinearLayoutManager$If r13 = r6.f288
            r13.f295 = r9
            r13.f298 = r12
            r13.f294 = r11
            r13.f297 = r11
            boolean r0 = r6.f293
            boolean r1 = r6.f279
            r0 = r0 ^ r1
            r13.f294 = r0
            boolean r0 = r8.f378
            if (r0 != 0) goto L_0x01ed
            int r0 = r6.f285
            if (r0 != r9) goto L_0x00a9
            goto L_0x01ed
        L_0x00a9:
            if (r0 < 0) goto L_0x01e9
            boolean r1 = r8.f378
            if (r1 == 0) goto L_0x00b5
            int r1 = r8.f375
            int r2 = r8.f374
            int r1 = r1 - r2
            goto L_0x00b7
        L_0x00b5:
            int r1 = r8.f366
        L_0x00b7:
            if (r0 < r1) goto L_0x00bb
            goto L_0x01e9
        L_0x00bb:
            int r0 = r6.f285
            r13.f295 = r0
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r6.f292
            if (r0 == 0) goto L_0x00f4
            int r0 = r0.f311
            if (r0 < 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00f4
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r6.f292
            boolean r0 = r0.f313
            r13.f294 = r0
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x00e5
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6886()
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r1 = r6.f292
            int r1 = r1.f312
            int r0 = r0 - r1
            r13.f298 = r0
            goto L_0x01e7
        L_0x00e5:
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6889()
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r1 = r6.f292
            int r1 = r1.f312
            int r0 = r0 + r1
            r13.f298 = r0
            goto L_0x01e7
        L_0x00f4:
            int r0 = r6.f280
            if (r0 != r12) goto L_0x01ca
            int r0 = r6.f285
            android.view.View r0 = r6.m411((int) r0)
            if (r0 == 0) goto L_0x017e
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6892((android.view.View) r0)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6891()
            if (r1 <= r2) goto L_0x0123
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x0119
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6886()
            goto L_0x011f
        L_0x0119:
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6889()
        L_0x011f:
            r13.f298 = r0
            goto L_0x01e7
        L_0x0123:
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6897(r0)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6889()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x013e
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6889()
            r13.f298 = r0
            r13.f294 = r11
            goto L_0x01e7
        L_0x013e:
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6886()
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6895(r0)
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0159
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6886()
            r13.f298 = r0
            r13.f294 = r10
            goto L_0x01e7
        L_0x0159:
            boolean r1 = r13.f294
            if (r1 == 0) goto L_0x0175
            o.ȷΙ r1 = r6.f291
            int r0 = r1.m6895(r0)
            o.ȷΙ r1 = r6.f291
            int r2 = r1.f5973
            if (r12 != r2) goto L_0x016b
            r1 = 0
            goto L_0x0173
        L_0x016b:
            int r2 = r1.m6891()
            int r1 = r1.f5973
            int r1 = r2 - r1
        L_0x0173:
            int r0 = r0 + r1
            goto L_0x017b
        L_0x0175:
            o.ȷΙ r1 = r6.f291
            int r0 = r1.m6897(r0)
        L_0x017b:
            r13.f298 = r0
            goto L_0x01e7
        L_0x017e:
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x0193
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r0 = r1 - r0
            goto L_0x0194
        L_0x0193:
            r0 = 0
        L_0x0194:
            if (r0 <= 0) goto L_0x01b6
            android.view.View r0 = r6.m432((int) r11)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r0 = (androidx.recyclerview.widget.RecyclerView.C0038) r0
            androidx.recyclerview.widget.RecyclerView$con r0 = r0.f388
            int r0 = r0.getLayoutPosition()
            int r1 = r6.f285
            if (r1 >= r0) goto L_0x01ac
            r0 = 1
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            boolean r1 = r6.f293
            if (r0 != r1) goto L_0x01b3
            r0 = 1
            goto L_0x01b4
        L_0x01b3:
            r0 = 0
        L_0x01b4:
            r13.f294 = r0
        L_0x01b6:
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x01c1
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6886()
            goto L_0x01c7
        L_0x01c1:
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6889()
        L_0x01c7:
            r13.f298 = r0
            goto L_0x01e7
        L_0x01ca:
            boolean r0 = r6.f293
            r13.f294 = r0
            if (r0 == 0) goto L_0x01dc
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6886()
            int r1 = r6.f280
            int r0 = r0 - r1
            r13.f298 = r0
            goto L_0x01e7
        L_0x01dc:
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6889()
            int r1 = r6.f280
            int r0 = r0 + r1
            r13.f298 = r0
        L_0x01e7:
            r0 = 1
            goto L_0x01ee
        L_0x01e9:
            r6.f285 = r9
            r6.f280 = r12
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            if (r0 != 0) goto L_0x039f
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x0205
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r0 = r1 - r0
            goto L_0x0206
        L_0x0205:
            r0 = 0
        L_0x0206:
            if (r0 == 0) goto L_0x0374
            android.view.View r0 = r17.m431()
            if (r0 == 0) goto L_0x024f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r2 = r1.f388
            boolean r2 = r2.isRemoved()
            if (r2 != 0) goto L_0x023a
            androidx.recyclerview.widget.RecyclerView$con r2 = r1.f388
            int r2 = r2.getLayoutPosition()
            if (r2 < 0) goto L_0x023a
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r1 = r1.getLayoutPosition()
            boolean r2 = r8.f378
            if (r2 == 0) goto L_0x0234
            int r2 = r8.f375
            int r3 = r8.f374
            int r2 = r2 - r3
            goto L_0x0236
        L_0x0234:
            int r2 = r8.f366
        L_0x0236:
            if (r1 >= r2) goto L_0x023a
            r1 = 1
            goto L_0x023b
        L_0x023a:
            r1 = 0
        L_0x023b:
            if (r1 == 0) goto L_0x024f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r1 = r1.getLayoutPosition()
            r13.m323(r0, r1)
        L_0x024c:
            r0 = 1
            goto L_0x0375
        L_0x024f:
            boolean r0 = r6.f282
            boolean r1 = r6.f279
            if (r0 != r1) goto L_0x0374
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r6.f293
            if (r0 == 0) goto L_0x028d
            r3 = 0
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x0273
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r1 = r1 - r0
            r4 = r1
            goto L_0x0274
        L_0x0273:
            r4 = 0
        L_0x0274:
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x027e
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x0280
        L_0x027e:
            int r0 = r8.f366
        L_0x0280:
            r5 = r0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.m306(r1, r2, r3, r4, r5)
            goto L_0x0322
        L_0x028d:
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x02a2
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r0 = r1 - r0
            goto L_0x02a3
        L_0x02a2:
            r0 = 0
        L_0x02a3:
            int r3 = r0 + -1
            r4 = -1
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x02b0
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x02b2
        L_0x02b0:
            int r0 = r8.f366
        L_0x02b2:
            r5 = r0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.m306(r1, r2, r3, r4, r5)
            goto L_0x0322
        L_0x02bf:
            boolean r0 = r6.f293
            if (r0 == 0) goto L_0x02f4
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x02d8
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r0 = r1 - r0
            goto L_0x02d9
        L_0x02d8:
            r0 = 0
        L_0x02d9:
            int r3 = r0 + -1
            r4 = -1
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x02e6
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x02e8
        L_0x02e6:
            int r0 = r8.f366
        L_0x02e8:
            r5 = r0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.m306(r1, r2, r3, r4, r5)
            goto L_0x0322
        L_0x02f4:
            r3 = 0
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x030a
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r1 = r1 - r0
            r4 = r1
            goto L_0x030b
        L_0x030a:
            r4 = 0
        L_0x030b:
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x0315
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x0317
        L_0x0315:
            int r0 = r8.f366
        L_0x0317:
            r5 = r0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.m306(r1, r2, r3, r4, r5)
        L_0x0322:
            if (r0 == 0) goto L_0x0374
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r1 = r1.getLayoutPosition()
            r13.m324(r0, r1)
            boolean r1 = r8.f378
            if (r1 != 0) goto L_0x024c
            boolean r1 = r17.m419()
            if (r1 == 0) goto L_0x024c
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6897(r0)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6886()
            if (r1 >= r2) goto L_0x035c
            o.ȷΙ r1 = r6.f291
            int r0 = r1.m6895(r0)
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6889()
            if (r0 >= r1) goto L_0x035a
            goto L_0x035c
        L_0x035a:
            r0 = 0
            goto L_0x035d
        L_0x035c:
            r0 = 1
        L_0x035d:
            if (r0 == 0) goto L_0x024c
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x036a
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6886()
            goto L_0x0370
        L_0x036a:
            o.ȷΙ r0 = r6.f291
            int r0 = r0.m6889()
        L_0x0370:
            r13.f298 = r0
            goto L_0x024c
        L_0x0374:
            r0 = 0
        L_0x0375:
            if (r0 != 0) goto L_0x039f
            boolean r0 = r13.f294
            if (r0 == 0) goto L_0x0382
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6886()
            goto L_0x0388
        L_0x0382:
            o.ȷΙ r0 = r13.f296
            int r0 = r0.m6889()
        L_0x0388:
            r13.f298 = r0
            boolean r0 = r6.f279
            if (r0 == 0) goto L_0x039c
            boolean r0 = r8.f378
            if (r0 == 0) goto L_0x0398
            int r0 = r8.f375
            int r1 = r8.f374
            int r0 = r0 - r1
            goto L_0x039a
        L_0x0398:
            int r0 = r8.f366
        L_0x039a:
            int r0 = r0 - r10
            goto L_0x039d
        L_0x039c:
            r0 = 0
        L_0x039d:
            r13.f295 = r0
        L_0x039f:
            androidx.recyclerview.widget.LinearLayoutManager$If r0 = r6.f288
            r0.f297 = r10
        L_0x03a3:
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            int r1 = r0.f308
            if (r1 < 0) goto L_0x03ab
            r1 = 1
            goto L_0x03ac
        L_0x03ab:
            r1 = -1
        L_0x03ac:
            r0.f310 = r1
            int[] r0 = r6.f287
            r0[r11] = r11
            r0[r10] = r11
            r6.m311((androidx.recyclerview.widget.RecyclerView.C0033) r8, (int[]) r0)
            int[] r0 = r6.f287
            r0 = r0[r11]
            int r0 = java.lang.Math.max(r11, r0)
            o.ȷΙ r1 = r6.f291
            int r1 = r1.m6889()
            int r0 = r0 + r1
            int[] r1 = r6.f287
            r1 = r1[r10]
            int r1 = java.lang.Math.max(r11, r1)
            o.ȷΙ r2 = r6.f291
            int r2 = r2.m6896()
            int r1 = r1 + r2
            boolean r2 = r8.f378
            if (r2 == 0) goto L_0x0410
            int r2 = r6.f285
            if (r2 == r9) goto L_0x0410
            int r3 = r6.f280
            if (r3 == r12) goto L_0x0410
            android.view.View r2 = r6.m411((int) r2)
            if (r2 == 0) goto L_0x0410
            boolean r3 = r6.f293
            if (r3 == 0) goto L_0x03fb
            o.ȷΙ r3 = r6.f291
            int r3 = r3.m6886()
            o.ȷΙ r4 = r6.f291
            int r2 = r4.m6895(r2)
            int r3 = r3 - r2
            int r2 = r6.f280
            goto L_0x040a
        L_0x03fb:
            o.ȷΙ r3 = r6.f291
            int r2 = r3.m6897(r2)
            o.ȷΙ r3 = r6.f291
            int r3 = r3.m6889()
            int r2 = r2 - r3
            int r3 = r6.f280
        L_0x040a:
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x040f
            int r0 = r0 + r3
            goto L_0x0410
        L_0x040f:
            int r1 = r1 - r3
        L_0x0410:
            androidx.recyclerview.widget.LinearLayoutManager$If r2 = r6.f288
            boolean r2 = r2.f294
            if (r2 == 0) goto L_0x041e
            boolean r2 = r6.f293
            if (r2 == 0) goto L_0x041c
        L_0x041a:
            r2 = 1
            goto L_0x0423
        L_0x041c:
            r2 = -1
            goto L_0x0423
        L_0x041e:
            boolean r2 = r6.f293
            if (r2 == 0) goto L_0x041a
            goto L_0x041c
        L_0x0423:
            androidx.recyclerview.widget.LinearLayoutManager$If r3 = r6.f288
            r6.m302(r7, r8, r3, r2)
            r17.m449((androidx.recyclerview.widget.RecyclerView.AUx) r18)
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            o.ȷΙ r3 = r6.f291
            int r3 = r3.m6888()
            if (r3 != 0) goto L_0x043f
            o.ȷΙ r3 = r6.f291
            int r3 = r3.m6894()
            if (r3 != 0) goto L_0x043f
            r3 = 1
            goto L_0x0440
        L_0x043f:
            r3 = 0
        L_0x0440:
            r2.f302 = r3
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            r2.f309 = r11
            androidx.recyclerview.widget.LinearLayoutManager$If r2 = r6.f288
            boolean r2 = r2.f294
            if (r2 == 0) goto L_0x04a7
            androidx.recyclerview.widget.LinearLayoutManager$If r2 = r6.f288
            int r3 = r2.f295
            int r2 = r2.f298
            r6.m281(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            r2.f304 = r0
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r2, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            int r0 = r0.f299
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            int r2 = r2.f303
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            if (r3 <= 0) goto L_0x046f
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            int r1 = r1 + r3
        L_0x046f:
            androidx.recyclerview.widget.LinearLayoutManager$If r3 = r6.f288
            int r4 = r3.f295
            int r3 = r3.f298
            r6.m279(r4, r3)
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            r3.f304 = r1
            int r1 = r3.f303
            androidx.recyclerview.widget.LinearLayoutManager$if r4 = r6.f289
            int r4 = r4.f301
            int r1 = r1 + r4
            r3.f303 = r1
            androidx.recyclerview.widget.LinearLayoutManager$if r1 = r6.f289
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r1 = r6.f289
            int r1 = r1.f299
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            if (r3 <= 0) goto L_0x0501
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            r6.m281(r2, r0)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r0.f304 = r3
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r0, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            int r0 = r0.f299
            goto L_0x0501
        L_0x04a7:
            androidx.recyclerview.widget.LinearLayoutManager$If r2 = r6.f288
            int r3 = r2.f295
            int r2 = r2.f298
            r6.m279(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            r2.f304 = r1
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r2, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r1 = r6.f289
            int r1 = r1.f299
            androidx.recyclerview.widget.LinearLayoutManager$if r2 = r6.f289
            int r2 = r2.f303
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            if (r3 <= 0) goto L_0x04ca
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            int r0 = r0 + r3
        L_0x04ca:
            androidx.recyclerview.widget.LinearLayoutManager$If r3 = r6.f288
            int r4 = r3.f295
            int r3 = r3.f298
            r6.m281(r4, r3)
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            r3.f304 = r0
            int r0 = r3.f303
            androidx.recyclerview.widget.LinearLayoutManager$if r4 = r6.f289
            int r4 = r4.f301
            int r0 = r0 + r4
            r3.f303 = r0
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r0, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            int r0 = r0.f299
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            if (r3 <= 0) goto L_0x0501
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            int r3 = r3.f307
            r6.m279(r2, r1)
            androidx.recyclerview.widget.LinearLayoutManager$if r1 = r6.f289
            r1.f304 = r3
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
            androidx.recyclerview.widget.LinearLayoutManager$if r1 = r6.f289
            int r1 = r1.f299
        L_0x0501:
            o.ǂ r2 = r6.f345
            if (r2 == 0) goto L_0x0516
            o.ǂ r2 = r6.f345
            o.ǂ$ǃ r3 = r2.f5664
            int r3 = r3.m6559()
            java.util.List<android.view.View> r2 = r2.f5662
            int r2 = r2.size()
            int r2 = r3 - r2
            goto L_0x0517
        L_0x0516:
            r2 = 0
        L_0x0517:
            if (r2 <= 0) goto L_0x0537
            boolean r2 = r6.f293
            boolean r3 = r6.f279
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x052b
            int r2 = r6.m267((int) r1, (androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r10)
            int r0 = r0 + r2
            int r1 = r1 + r2
            int r2 = r6.m278(r0, r7, r8, r11)
            goto L_0x0535
        L_0x052b:
            int r2 = r6.m278(r0, r7, r8, r10)
            int r0 = r0 + r2
            int r1 = r1 + r2
            int r2 = r6.m267((int) r1, (androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r11)
        L_0x0535:
            int r0 = r0 + r2
            int r1 = r1 + r2
        L_0x0537:
            boolean r2 = r8.f379
            if (r2 == 0) goto L_0x063c
            o.ǂ r2 = r6.f345
            if (r2 == 0) goto L_0x0550
            o.ǂ r2 = r6.f345
            o.ǂ$ǃ r3 = r2.f5664
            int r3 = r3.m6559()
            java.util.List<android.view.View> r2 = r2.f5662
            int r2 = r2.size()
            int r2 = r3 - r2
            goto L_0x0551
        L_0x0550:
            r2 = 0
        L_0x0551:
            if (r2 == 0) goto L_0x063c
            boolean r2 = r8.f378
            if (r2 != 0) goto L_0x063c
            boolean r2 = r17.m419()
            if (r2 != 0) goto L_0x055f
            goto L_0x063c
        L_0x055f:
            java.util.List<androidx.recyclerview.widget.RecyclerView$con> r2 = r7.f323
            int r3 = r2.size()
            android.view.View r4 = r6.m432((int) r11)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r4 = (androidx.recyclerview.widget.RecyclerView.C0038) r4
            androidx.recyclerview.widget.RecyclerView$con r4 = r4.f388
            int r4 = r4.getLayoutPosition()
            r5 = 0
            r13 = 0
            r14 = 0
        L_0x0578:
            if (r5 >= r3) goto L_0x05b1
            java.lang.Object r15 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView$con r15 = (androidx.recyclerview.widget.RecyclerView.con) r15
            boolean r16 = r15.isRemoved()
            if (r16 != 0) goto L_0x05ab
            int r12 = r15.getLayoutPosition()
            if (r12 >= r4) goto L_0x058e
            r12 = 1
            goto L_0x058f
        L_0x058e:
            r12 = 0
        L_0x058f:
            boolean r11 = r6.f293
            if (r12 == r11) goto L_0x0595
            r11 = -1
            goto L_0x0596
        L_0x0595:
            r11 = 1
        L_0x0596:
            if (r11 != r9) goto L_0x05a2
            o.ȷΙ r11 = r6.f291
            android.view.View r12 = r15.itemView
            int r11 = r11.m6892((android.view.View) r12)
            int r13 = r13 + r11
            goto L_0x05ab
        L_0x05a2:
            o.ȷΙ r11 = r6.f291
            android.view.View r12 = r15.itemView
            int r11 = r11.m6892((android.view.View) r12)
            int r14 = r14 + r11
        L_0x05ab:
            int r5 = r5 + 1
            r11 = 0
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0578
        L_0x05b1:
            androidx.recyclerview.widget.LinearLayoutManager$if r3 = r6.f289
            r3.f305 = r2
            r2 = 0
            if (r13 <= 0) goto L_0x05f7
            boolean r3 = r6.f293
            if (r3 == 0) goto L_0x05d4
            o.ǂ r3 = r6.f345
            if (r3 == 0) goto L_0x05d1
            o.ǂ r3 = r6.f345
            o.ǂ$ǃ r4 = r3.f5664
            int r4 = r4.m6559()
            java.util.List<android.view.View> r3 = r3.f5662
            int r3 = r3.size()
            int r11 = r4 - r3
            goto L_0x05d2
        L_0x05d1:
            r11 = 0
        L_0x05d2:
            int r11 = r11 - r10
            goto L_0x05d5
        L_0x05d4:
            r11 = 0
        L_0x05d5:
            android.view.View r3 = r6.m432((int) r11)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r3 = (androidx.recyclerview.widget.RecyclerView.C0038) r3
            androidx.recyclerview.widget.RecyclerView$con r3 = r3.f388
            int r3 = r3.getLayoutPosition()
            r6.m281(r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r0.f304 = r13
            r3 = 0
            r0.f307 = r3
            r0.m328(r2)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r0, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r3)
        L_0x05f7:
            if (r14 <= 0) goto L_0x0638
            boolean r0 = r6.f293
            if (r0 == 0) goto L_0x05ff
            r11 = 0
            goto L_0x0616
        L_0x05ff:
            o.ǂ r0 = r6.f345
            if (r0 == 0) goto L_0x0614
            o.ǂ r0 = r6.f345
            o.ǂ$ǃ r3 = r0.f5664
            int r3 = r3.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r11 = r3 - r0
            goto L_0x0615
        L_0x0614:
            r11 = 0
        L_0x0615:
            int r11 = r11 - r10
        L_0x0616:
            android.view.View r0 = r6.m432((int) r11)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r0 = (androidx.recyclerview.widget.RecyclerView.C0038) r0
            androidx.recyclerview.widget.RecyclerView$con r0 = r0.f388
            int r0 = r0.getLayoutPosition()
            r6.m279(r0, r1)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r0.f304 = r14
            r1 = 0
            r0.f307 = r1
            r0.m328(r2)
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r6.m274((androidx.recyclerview.widget.RecyclerView.AUx) r7, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r0, (androidx.recyclerview.widget.RecyclerView.C0033) r8, (boolean) r1)
        L_0x0638:
            androidx.recyclerview.widget.LinearLayoutManager$if r0 = r6.f289
            r0.f305 = r2
        L_0x063c:
            boolean r0 = r8.f378
            if (r0 != 0) goto L_0x0649
            o.ȷΙ r0 = r6.f291
            int r1 = r0.m6891()
            r0.f5973 = r1
            goto L_0x0656
        L_0x0649:
            androidx.recyclerview.widget.LinearLayoutManager$If r0 = r6.f288
            r0.f295 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f298 = r1
            r1 = 0
            r0.f294 = r1
            r0.f297 = r1
        L_0x0656:
            boolean r0 = r6.f279
            r6.f282 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m301(androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m310(RecyclerView.C0033 r3) {
        super.m438(r3);
        this.f292 = null;
        this.f285 = -1;
        this.f280 = RecyclerView.UNDEFINED_DURATION;
        If ifR = this.f288;
        ifR.f295 = -1;
        ifR.f298 = RecyclerView.UNDEFINED_DURATION;
        ifR.f294 = false;
        ifR.f297 = false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m267(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r4, boolean z) {
        int r42;
        int r0 = this.f291.m6886() - i;
        if (r0 <= 0) {
            return 0;
        }
        int i2 = -m269(-r0, aUx, r4);
        int i3 = i + i2;
        if (!z || (r42 = this.f291.m6886() - i3) <= 0) {
            return i2;
        }
        this.f291.m6893(r42);
        return r42 + i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m278(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r4, boolean z) {
        int r2;
        int r0 = i - this.f291.m6889();
        if (r0 <= 0) {
            return 0;
        }
        int i2 = -m269(r0, aUx, r4);
        int i3 = i + i2;
        if (!z || (r2 = i3 - this.f291.m6889()) <= 0) {
            return i2;
        }
        this.f291.m6893(-r2);
        return i2 - r2;
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m279(int i, int i2) {
        this.f289.f307 = this.f291.m6886() - i2;
        this.f289.f301 = this.f293 ? -1 : 1;
        Cif ifVar = this.f289;
        ifVar.f303 = i;
        ifVar.f310 = 1;
        ifVar.f299 = i2;
        ifVar.f300 = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m281(int i, int i2) {
        this.f289.f307 = i2 - this.f291.m6889();
        Cif ifVar = this.f289;
        ifVar.f303 = i;
        ifVar.f301 = this.f293 ? 1 : -1;
        Cif ifVar2 = this.f289;
        ifVar2.f310 = -1;
        ifVar2.f299 = i2;
        ifVar2.f300 = RecyclerView.UNDEFINED_DURATION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final void m321() {
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m299(int i) {
        this.f285 = i;
        this.f280 = RecyclerView.UNDEFINED_DURATION;
        C0023 r2 = this.f292;
        if (r2 != null) {
            r2.f311 = -1;
        }
        if (this.f349 != null) {
            this.f349.requestLayout();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m314(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r5) {
        if (this.f290 == 1) {
            return 0;
        }
        return m269(i, aUx, r5);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int m289(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r4) {
        if (this.f290 == 0) {
            return 0;
        }
        return m269(i, aUx, r4);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m298(RecyclerView.C0033 r1) {
        return m266(r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m315(RecyclerView.C0033 r1) {
        return m266(r1);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final int m318(RecyclerView.C0033 r1) {
        return m271(r1);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final int m320(RecyclerView.C0033 r1) {
        return m271(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public int m283(RecyclerView.C0033 r1) {
        return m282(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int m290(RecyclerView.C0033 r1) {
        return m282(r1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m276(int i, int i2, boolean z, RecyclerView.C0033 r9) {
        int i3;
        int i4 = 0;
        this.f289.f302 = this.f291.m6888() == 0 && this.f291.m6894() == 0;
        this.f289.f310 = i;
        int[] iArr = this.f287;
        iArr[0] = 0;
        iArr[1] = 0;
        m311(r9, iArr);
        int max = Math.max(0, this.f287[0]);
        int max2 = Math.max(0, this.f287[1]);
        boolean z2 = i == 1;
        this.f289.f304 = z2 ? max2 : max;
        Cif ifVar = this.f289;
        if (!z2) {
            max = max2;
        }
        ifVar.f309 = max;
        int i5 = -1;
        if (z2) {
            this.f289.f304 += this.f291.m6896();
            if (!this.f293) {
                if (this.f345 != null) {
                    C0878 r6 = this.f345;
                    i4 = r6.f5664.m6559() - r6.f5662.size();
                }
                i4--;
            }
            View r62 = m432(i4);
            Cif ifVar2 = this.f289;
            if (!this.f293) {
                i5 = 1;
            }
            ifVar2.f301 = i5;
            this.f289.f303 = ((RecyclerView.C0038) r62.getLayoutParams()).f388.getLayoutPosition() + this.f289.f301;
            this.f289.f299 = this.f291.m6895(r62);
            i3 = this.f291.m6895(r62) - this.f291.m6886();
        } else {
            if (this.f293) {
                if (this.f345 != null) {
                    C0878 r63 = this.f345;
                    i4 = r63.f5664.m6559() - r63.f5662.size();
                }
                i4--;
            }
            View r64 = m432(i4);
            this.f289.f304 += this.f291.m6889();
            Cif ifVar3 = this.f289;
            if (this.f293) {
                i5 = 1;
            }
            ifVar3.f301 = i5;
            this.f289.f303 = ((RecyclerView.C0038) r64.getLayoutParams()).f388.getLayoutPosition() + this.f289.f301;
            this.f289.f299 = this.f291.m6897(r64);
            i3 = (-this.f291.m6897(r64)) + this.f291.m6889();
        }
        Cif ifVar4 = this.f289;
        ifVar4.f307 = i2;
        if (z) {
            ifVar4.f307 -= i3;
        }
        this.f289.f300 = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m294(RecyclerView.C0033 r3, Cif ifVar, RecyclerView.IF.C0027 r5) {
        int i = ifVar.f303;
        if (i >= 0) {
            if (i < (r3.f378 ? r3.f375 - r3.f374 : r3.f366)) {
                r5.m471(i, Math.max(0, ifVar.f300));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m300(int r6, androidx.recyclerview.widget.RecyclerView.IF.C0027 r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r5.f292
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r0.f311
            if (r0 < 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r0 = r5.f292
            boolean r0 = r0.f313
            androidx.recyclerview.widget.LinearLayoutManager$ǃ r4 = r5.f292
            int r4 = r4.f311
            goto L_0x0028
        L_0x0019:
            r5.m280()
            boolean r0 = r5.f293
            int r4 = r5.f285
            if (r4 != r1) goto L_0x0028
            if (r0 == 0) goto L_0x0027
            int r4 = r6 + -1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            r0 = 0
        L_0x002d:
            int r2 = r5.f286
            if (r0 >= r2) goto L_0x003c
            if (r4 < 0) goto L_0x003c
            if (r4 >= r6) goto L_0x003c
            r7.m471(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x002d
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m300(int, androidx.recyclerview.widget.RecyclerView$IF$ǃ):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m308(int i, int i2, RecyclerView.C0033 r4, RecyclerView.IF.C0027 r5) {
        int i3;
        if (this.f290 != 0) {
            i = i2;
        }
        if (this.f345 != null) {
            C0878 r3 = this.f345;
            i3 = r3.f5664.m6559() - r3.f5662.size();
        } else {
            i3 = 0;
        }
        if (i3 != 0 && i != 0) {
            if (this.f289 == null) {
                this.f289 = new Cif();
            }
            m276(i > 0 ? 1 : -1, Math.abs(i), true, r4);
            m294(r4, this.f289, r5);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m313(String str) {
        if (this.f292 == null) {
            super.m440(str);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m277(RecyclerView.AUx aUx, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m414(i3, aUx);
                }
                return;
            }
            while (i > i2) {
                m414(i, aUx);
                i--;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m270(RecyclerView.AUx aUx, Cif ifVar) {
        int i;
        int i2;
        if (ifVar.f306 && !ifVar.f302) {
            int i3 = ifVar.f300;
            int i4 = ifVar.f309;
            if (ifVar.f310 == -1) {
                if (this.f345 != null) {
                    C0878 r7 = this.f345;
                    i2 = r7.f5664.m6559() - r7.f5662.size();
                } else {
                    i2 = 0;
                }
                if (i3 >= 0) {
                    int r2 = (this.f291.m6894() - i3) + i4;
                    if (this.f293) {
                        for (int i5 = 0; i5 < i2; i5++) {
                            View r1 = m432(i5);
                            if (this.f291.m6897(r1) < r2 || this.f291.m6890(r1) < r2) {
                                m277(aUx, 0, i5);
                                return;
                            }
                        }
                        return;
                    }
                    int i6 = i2 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View r12 = m432(i7);
                        if (this.f291.m6897(r12) < r2 || this.f291.m6890(r12) < r2) {
                            m277(aUx, i6, i7);
                            return;
                        }
                    }
                }
            } else if (i3 >= 0) {
                int i8 = i3 - i4;
                if (this.f345 != null) {
                    C0878 r72 = this.f345;
                    i = r72.f5664.m6559() - r72.f5662.size();
                } else {
                    i = 0;
                }
                if (this.f293) {
                    int i9 = i - 1;
                    for (int i10 = i9; i10 >= 0; i10--) {
                        View r22 = m432(i10);
                        if (this.f291.m6895(r22) > i8 || this.f291.m6887(r22) > i8) {
                            m277(aUx, i9, i10);
                            return;
                        }
                    }
                    return;
                }
                for (int i11 = 0; i11 < i; i11++) {
                    View r23 = m432(i11);
                    if (this.f291.m6895(r23) > i8 || this.f291.m6887(r23) > i8) {
                        m277(aUx, 0, i11);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c A[EDGE_INSN: B:44:0x008c->B:38:0x008c ?: BREAK  , SYNTHETIC] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m274(androidx.recyclerview.widget.RecyclerView.AUx r9, androidx.recyclerview.widget.LinearLayoutManager.Cif r10, androidx.recyclerview.widget.RecyclerView.C0033 r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.f307
            int r1 = r10.f300
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0016
            int r1 = r10.f307
            if (r1 >= 0) goto L_0x0013
            int r1 = r10.f300
            int r3 = r10.f307
            int r1 = r1 + r3
            r10.f300 = r1
        L_0x0013:
            r8.m270((androidx.recyclerview.widget.RecyclerView.AUx) r9, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r10)
        L_0x0016:
            int r1 = r10.f307
            int r3 = r10.f304
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$ɩ r3 = r8.f283
        L_0x001d:
            boolean r4 = r10.f302
            if (r4 != 0) goto L_0x0023
            if (r1 <= 0) goto L_0x008c
        L_0x0023:
            int r4 = r10.f303
            r5 = 0
            if (r4 < 0) goto L_0x003a
            int r4 = r10.f303
            boolean r6 = r11.f378
            if (r6 == 0) goto L_0x0034
            int r6 = r11.f375
            int r7 = r11.f374
            int r6 = r6 - r7
            goto L_0x0036
        L_0x0034:
            int r6 = r11.f366
        L_0x0036:
            if (r4 >= r6) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 == 0) goto L_0x008c
            r3.f314 = r5
            r3.f316 = r5
            r3.f317 = r5
            r3.f315 = r5
            r8.m309((androidx.recyclerview.widget.RecyclerView.AUx) r9, (androidx.recyclerview.widget.RecyclerView.C0033) r11, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r10, (androidx.recyclerview.widget.LinearLayoutManager.C0024) r3)
            boolean r4 = r3.f316
            if (r4 != 0) goto L_0x008c
            int r4 = r10.f299
            int r5 = r3.f314
            int r6 = r10.f310
            int r5 = r5 * r6
            int r4 = r4 + r5
            r10.f299 = r4
            boolean r4 = r3.f317
            if (r4 == 0) goto L_0x0063
            java.util.List<androidx.recyclerview.widget.RecyclerView$con> r4 = r10.f305
            if (r4 != 0) goto L_0x0063
            boolean r4 = r11.f378
            if (r4 != 0) goto L_0x006d
        L_0x0063:
            int r4 = r10.f307
            int r5 = r3.f314
            int r4 = r4 - r5
            r10.f307 = r4
            int r4 = r3.f314
            int r1 = r1 - r4
        L_0x006d:
            int r4 = r10.f300
            if (r4 == r2) goto L_0x0086
            int r4 = r10.f300
            int r5 = r3.f314
            int r4 = r4 + r5
            r10.f300 = r4
            int r4 = r10.f307
            if (r4 >= 0) goto L_0x0083
            int r4 = r10.f300
            int r5 = r10.f307
            int r4 = r4 + r5
            r10.f300 = r4
        L_0x0083:
            r8.m270((androidx.recyclerview.widget.RecyclerView.AUx) r9, (androidx.recyclerview.widget.LinearLayoutManager.Cif) r10)
        L_0x0086:
            if (r12 == 0) goto L_0x001d
            boolean r4 = r3.f315
            if (r4 == 0) goto L_0x001d
        L_0x008c:
            int r9 = r10.f307
            int r0 = r0 - r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m274(androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.LinearLayoutManager$if, androidx.recyclerview.widget.RecyclerView$ȷ, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m309(RecyclerView.AUx aUx, RecyclerView.C0033 r19, Cif ifVar, C0024 r21) {
        int i;
        int i2;
        int i3;
        Cif ifVar2 = ifVar;
        C0024 r3 = r21;
        View r2 = ifVar2.m327(aUx);
        if (r2 == null) {
            r3.f316 = true;
            return;
        }
        RecyclerView.C0038 r5 = (RecyclerView.C0038) r2.getLayoutParams();
        int i4 = 0;
        if (ifVar2.f305 == null) {
            if (this.f293 == (ifVar2.f310 == -1)) {
                m427(r2);
            } else {
                m448(r2);
            }
        } else {
            if (this.f293 == (ifVar2.f310 == -1)) {
                m399(r2);
            } else {
                m416(r2);
            }
        }
        RecyclerView.C0038 r6 = (RecyclerView.C0038) r2.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f349.getItemDecorInsetsForChild(r2);
        int i5 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0;
        int i6 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0;
        int r9 = RecyclerView.IF.m385(this.f351, this.f346, (this.f349 != null ? this.f349.getPaddingLeft() : 0) + (this.f349 != null ? this.f349.getPaddingRight() : 0) + r6.leftMargin + r6.rightMargin + i5, r6.width, m408());
        int r10 = RecyclerView.IF.m385(this.f341, this.f343, (this.f349 != null ? this.f349.getPaddingTop() : 0) + (this.f349 != null ? this.f349.getPaddingBottom() : 0) + r6.topMargin + r6.bottomMargin + i6, r6.height, m453());
        if (m441(r2, r9, r10, r6)) {
            r2.measure(r9, r10);
        }
        r3.f314 = this.f291.m6892(r2);
        if (this.f290 == 1) {
            if (C0293.m4156(this.f349) == 1) {
                int i7 = this.f351;
                if (this.f349 != null) {
                    i4 = this.f349.getPaddingRight();
                }
                i2 = i7 - i4;
                i4 = i2 - this.f291.m6898(r2);
            } else {
                if (this.f349 != null) {
                    i4 = this.f349.getPaddingLeft();
                }
                i2 = this.f291.m6898(r2) + i4;
            }
            if (ifVar2.f310 == -1) {
                i = ifVar2.f299;
                i3 = ifVar2.f299 - r3.f314;
            } else {
                int i8 = ifVar2.f299;
                i = ifVar2.f299 + r3.f314;
                i3 = i8;
            }
        } else {
            if (this.f349 != null) {
                i4 = this.f349.getPaddingTop();
            }
            int r62 = this.f291.m6898(r2) + i4;
            if (ifVar2.f310 == -1) {
                int i9 = ifVar2.f299;
                int i10 = i4;
                i4 = ifVar2.f299 - r3.f314;
                i3 = i10;
                int i11 = i9;
                i = r62;
                i2 = i11;
            } else {
                int i12 = ifVar2.f299;
                int i13 = r62;
                i2 = ifVar2.f299 + r3.f314;
                i3 = i4;
                i4 = i12;
                i = i13;
            }
        }
        m386(r2, i4, i3, i2, i);
        if (r5.f388.isRemoved() || r5.f388.isUpdated()) {
            r3.f317 = true;
        }
        r3.f315 = r2.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m305(int i) {
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f290 == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.f290 == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.f290 == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.f290 == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f290 == 1) {
                return 1;
            } else {
                if (C0293.m4156(this.f349) == 1) {
                    z = true;
                }
                return z ? -1 : 1;
            }
        } else if (this.f290 == 1) {
            return -1;
        } else {
            if (C0293.m4156(this.f349) == 1) {
                z = true;
            }
            return z ? 1 : -1;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private View m275(boolean z) {
        int i;
        int i2 = 0;
        if (this.f293) {
            if (this.f345 != null) {
                C0878 r0 = this.f345;
                i2 = r0.f5664.m6559() - r0.f5662.size();
            }
            return m268(i2 - 1, -1, z);
        }
        if (this.f345 != null) {
            C0878 r02 = this.f345;
            i = r02.f5664.m6559() - r02.f5662.size();
        } else {
            i = 0;
        }
        return m268(0, i, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private View m264(boolean z) {
        int i;
        int i2 = 0;
        if (this.f293) {
            if (this.f345 != null) {
                C0878 r0 = this.f345;
                i = r0.f5664.m6559() - r0.f5662.size();
            } else {
                i = 0;
            }
            return m268(0, i, z);
        }
        if (this.f345 != null) {
            C0878 r02 = this.f345;
            i2 = r02.f5664.m6559() - r02.f5662.size();
        }
        return m268(i2 - 1, -1, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public View m292(View view, int i, RecyclerView.AUx aUx, RecyclerView.C0033 r8) {
        int i2;
        int r5;
        View view2;
        View view3;
        m280();
        int i3 = 0;
        if (this.f345 != null) {
            C0878 r52 = this.f345;
            i2 = r52.f5664.m6559() - r52.f5662.size();
        } else {
            i2 = 0;
        }
        if (i2 == 0 || (r5 = m305(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        m276(r5, (int) (((float) this.f291.m6891()) * 0.33333334f), false, r8);
        Cif ifVar = this.f289;
        ifVar.f300 = RecyclerView.UNDEFINED_DURATION;
        ifVar.f306 = false;
        m274(aUx, ifVar, r8, true);
        if (r5 == -1) {
            if (this.f293) {
                view2 = m273();
            } else {
                view2 = m265();
            }
        } else if (this.f293) {
            view2 = m265();
        } else {
            view2 = m273();
        }
        if (r5 == -1) {
            if (this.f293) {
                if (this.f345 != null) {
                    C0878 r53 = this.f345;
                    i3 = r53.f5664.m6559() - r53.f5662.size();
                }
                i3--;
            }
            view3 = m432(i3);
        } else {
            if (!this.f293) {
                if (this.f345 != null) {
                    C0878 r54 = this.f345;
                    i3 = r54.f5664.m6559() - r54.f5662.size();
                }
                i3--;
            }
            view3 = m432(i3);
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m296() {
        return this.f292 == null && this.f282 == this.f279;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        int f299;

        /* renamed from: Ɩ  reason: contains not printable characters */
        int f300;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f301;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f302;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f303;

        /* renamed from: ɹ  reason: contains not printable characters */
        int f304 = 0;

        /* renamed from: ɾ  reason: contains not printable characters */
        List<RecyclerView.con> f305 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f306 = true;

        /* renamed from: ι  reason: contains not printable characters */
        int f307;

        /* renamed from: І  reason: contains not printable characters */
        int f308;

        /* renamed from: і  reason: contains not printable characters */
        int f309 = 0;

        /* renamed from: Ӏ  reason: contains not printable characters */
        int f310;

        Cif() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final View m327(RecyclerView.AUx aUx) {
            if (this.f305 != null) {
                return m325();
            }
            View r3 = aUx.m361(this.f303);
            this.f303 += this.f301;
            return r3;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private View m325() {
            int size = this.f305.size();
            int i = 0;
            while (i < size) {
                View view = this.f305.get(i).itemView;
                RecyclerView.C0038 r3 = (RecyclerView.C0038) view.getLayoutParams();
                if (r3.f388.isRemoved() || this.f303 != r3.f388.getLayoutPosition()) {
                    i++;
                } else {
                    m328(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m328(View view) {
            View r1 = m326(view);
            if (r1 == null) {
                this.f303 = -1;
            } else {
                this.f303 = ((RecyclerView.C0038) r1.getLayoutParams()).f388.getLayoutPosition();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        private View m326(View view) {
            int layoutPosition;
            int size = this.f305.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f305.get(i2).itemView;
                RecyclerView.C0038 r5 = (RecyclerView.C0038) view3.getLayoutParams();
                if (view3 != view && !r5.f388.isRemoved() && (layoutPosition = (r5.f388.getLayoutPosition() - this.f303) * this.f301) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    }
                    i = layoutPosition;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$ǃ  reason: contains not printable characters */
    public static class C0023 implements Parcelable {
        public static final Parcelable.Creator<C0023> CREATOR = new Parcelable.Creator<C0023>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0023[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0023(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        public int f311;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f312;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f313;

        public final int describeContents() {
            return 0;
        }

        public C0023() {
        }

        C0023(Parcel parcel) {
            this.f311 = parcel.readInt();
            this.f312 = parcel.readInt();
            this.f313 = parcel.readInt() != 1 ? false : true;
        }

        public C0023(C0023 r2) {
            this.f311 = r2.f311;
            this.f312 = r2.f312;
            this.f313 = r2.f313;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f311);
            parcel.writeInt(this.f312);
            parcel.writeInt(this.f313 ? 1 : 0);
        }
    }

    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f294 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f295 = -1;

        /* renamed from: ɩ  reason: contains not printable characters */
        C0966 f296;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f297 = false;

        /* renamed from: ι  reason: contains not printable characters */
        int f298 = RecyclerView.UNDEFINED_DURATION;

        If() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f295);
            sb.append(", mCoordinate=");
            sb.append(this.f298);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f294);
            sb.append(", mValid=");
            sb.append(this.f297);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m323(View view, int i) {
            C0966 r0 = this.f296;
            int r02 = Integer.MIN_VALUE == r0.f5973 ? 0 : r0.m6891() - r0.f5973;
            if (r02 >= 0) {
                m324(view, i);
                return;
            }
            this.f295 = i;
            if (this.f294) {
                int r6 = (this.f296.m6886() - r02) - this.f296.m6895(view);
                this.f298 = this.f296.m6886() - r6;
                if (r6 > 0) {
                    int r1 = this.f298 - this.f296.m6892(view);
                    int r03 = this.f296.m6889();
                    int min = r1 - (r03 + Math.min(this.f296.m6897(view) - r03, 0));
                    if (min < 0) {
                        this.f298 += Math.min(r6, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int r62 = this.f296.m6897(view);
            int r12 = r62 - this.f296.m6889();
            this.f298 = r62;
            if (r12 > 0) {
                int r5 = (this.f296.m6886() - Math.min(0, (this.f296.m6886() - r02) - this.f296.m6895(view))) - (r62 + this.f296.m6892(view));
                if (r5 < 0) {
                    this.f298 -= Math.min(r12, -r5);
                }
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m324(View view, int i) {
            if (this.f294) {
                int r4 = this.f296.m6895(view);
                C0966 r0 = this.f296;
                this.f298 = r4 + (Integer.MIN_VALUE == r0.f5973 ? 0 : r0.m6891() - r0.f5973);
            } else {
                this.f298 = this.f296.m6897(view);
            }
            this.f295 = i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$ɩ  reason: contains not printable characters */
    public static class C0024 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f314;

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean f315;

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean f316;

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f317;

        protected C0024() {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m295(boolean z) {
        if (this.f292 == null) {
            super.m440((String) null);
        }
        if (this.f279 != z) {
            this.f279 = z;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final View m291(int i) {
        int i2;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i2 = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        int layoutPosition = i - ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition();
        if (layoutPosition >= 0 && layoutPosition < i2) {
            View r02 = m432(layoutPosition);
            if (((RecyclerView.C0038) r02.getLayoutParams()).f388.getLayoutPosition() == i) {
                return r02;
            }
        }
        return super.m411(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m311(RecyclerView.C0033 r5, int[] iArr) {
        int i;
        int r52 = r5.f368 != -1 ? this.f291.m6891() : 0;
        if (this.f289.f310 == -1) {
            i = 0;
        } else {
            i = r52;
            r52 = 0;
        }
        iArr[0] = r52;
        iArr[1] = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final PointF m316(int i) {
        int i2;
        boolean z = false;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i2 = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = 1;
        if (i < ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition()) {
            z = true;
        }
        if (z != this.f293) {
            i3 = -1;
        }
        if (this.f290 == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int m266(RecyclerView.C0033 r9) {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        if (i == 0) {
            return 0;
        }
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        return C1100.m7482(r9, this.f291, m275(!this.f281), m264(!this.f281), this, this.f281, this.f293);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private int m271(RecyclerView.C0033 r8) {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        if (i == 0) {
            return 0;
        }
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        return C1100.m7481(r8, this.f291, m275(!this.f281), m264(!this.f281), this, this.f281);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int m282(RecyclerView.C0033 r8) {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        if (i == 0) {
            return 0;
        }
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        return C1100.m7480(r8, this.f291, m275(!this.f281), m264(!this.f281), this, this.f281);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m269(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r8) {
        int i2;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i2 = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i2 = 0;
        }
        if (i2 == 0 || i == 0) {
            return 0;
        }
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        this.f289.f306 = true;
        int i3 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m276(i3, abs, true, r8);
        int r2 = this.f289.f300 + m274(aUx, this.f289, r8, false);
        if (r2 < 0) {
            return 0;
        }
        if (abs > r2) {
            i = i3 * r2;
        }
        this.f291.m6893(-i);
        this.f289.f308 = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m322() {
        int i;
        boolean z;
        if (!(this.f343 == 1073741824 || this.f346 == 1073741824)) {
            if (this.f345 != null) {
                C0878 r0 = this.f345;
                i = r0.f5664.m6559() - r0.f5662.size();
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = m432(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public View m306(RecyclerView.AUx aUx, RecyclerView.C0033 r7, int i, int i2, int i3) {
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        int r6 = this.f291.m6889();
        int r72 = this.f291.m6886();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View r3 = m432(i);
            int layoutPosition = ((RecyclerView.C0038) r3.getLayoutParams()).f388.getLayoutPosition();
            if (layoutPosition >= 0 && layoutPosition < i3) {
                if (((RecyclerView.C0038) r3.getLayoutParams()).f388.isRemoved()) {
                    if (view2 == null) {
                        view2 = r3;
                    }
                } else if (this.f291.m6897(r3) < r72 && this.f291.m6895(r3) >= r6) {
                    return r3;
                } else {
                    if (view == null) {
                        view = r3;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private View m265() {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        return m272(0, i);
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    private View m273() {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        return m272(i - 1, -1);
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final int m297() {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        View r02 = m268(0, i, false);
        if (r02 == null) {
            return -1;
        }
        return ((RecyclerView.C0038) r02.getLayoutParams()).f388.getLayoutPosition();
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final int m304() {
        int i;
        if (this.f345 != null) {
            C0878 r0 = this.f345;
            i = r0.f5664.m6559() - r0.f5662.size();
        } else {
            i = 0;
        }
        View r02 = m268(i - 1, -1, false);
        if (r02 == null) {
            return -1;
        }
        return ((RecyclerView.C0038) r02.getLayoutParams()).f388.getLayoutPosition();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private View m268(int i, int i2, boolean z) {
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        int i3 = z ? 24579 : 320;
        if (this.f290 == 0) {
            return this.f355.m7499(i, i2, i3, 320);
        }
        return this.f347.m7499(i, i2, i3, 320);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private View m272(int i, int i2) {
        int i3;
        int i4;
        if (this.f289 == null) {
            this.f289 = new Cif();
        }
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return m432(i);
        }
        if (this.f291.m6897(m432(i)) < this.f291.m6889()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f290 == 0) {
            return this.f355.m7499(i, i2, i4, i3);
        }
        return this.f347.m7499(i, i2, i4, i3);
    }
}
