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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import o.C0293;
import o.C0520;
import o.C0911;
import o.C0966;
import o.C0974;
import o.C1100;

public class StaggeredGridLayoutManager extends RecyclerView.IF implements RecyclerView.C3240AuX.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    C0966 f398;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private BitSet f399;

    /* renamed from: ǀ  reason: contains not printable characters */
    private int f400;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0046[] f401;

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean f402;

    /* renamed from: ɟ  reason: contains not printable characters */
    private boolean f403;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C0966 f404;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f405;

    /* renamed from: ɺ  reason: contains not printable characters */
    private C0044 f406;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f407;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f408;

    /* renamed from: ͻ  reason: contains not printable characters */
    private Cif f409;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f410;

    /* renamed from: ι  reason: contains not printable characters */
    private int f411;

    /* renamed from: ϲ  reason: contains not printable characters */
    private boolean f412;

    /* renamed from: ϳ  reason: contains not printable characters */
    private final Rect f413;

    /* renamed from: І  reason: contains not printable characters */
    private final C0911 f414;

    /* renamed from: Ј  reason: contains not printable characters */
    private int[] f415;

    /* renamed from: с  reason: contains not printable characters */
    private final If f416;

    /* renamed from: і  reason: contains not printable characters */
    private int f417;

    /* renamed from: ј  reason: contains not printable characters */
    private final Runnable f418;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f419;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f411 = -1;
        this.f410 = false;
        this.f419 = false;
        this.f408 = -1;
        this.f400 = RecyclerView.UNDEFINED_DURATION;
        this.f406 = new C0044();
        this.f407 = 2;
        this.f413 = new Rect();
        this.f416 = new If();
        this.f412 = true;
        this.f418 = new Runnable() {
            public final void run() {
                StaggeredGridLayoutManager.this.m582();
            }
        };
        RecyclerView.IF.C0026 r3 = m381(context, attributeSet, i, i2);
        int i3 = r3.f359;
        if (i3 == 0 || i3 == 1) {
            if (this.f409 == null) {
                super.m440((String) null);
            }
            if (i3 != this.f417) {
                this.f417 = i3;
                C0966 r4 = this.f398;
                this.f398 = this.f404;
                this.f404 = r4;
                if (this.f349 != null) {
                    this.f349.requestLayout();
                }
            }
            m514(r3.f361);
            m527(r3.f360);
            this.f414 = new C0911();
            this.f398 = C0966.m6885(this, this.f417);
            this.f404 = C0966.m6885(this, 1 - this.f417);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public StaggeredGridLayoutManager(int i) {
        this.f411 = -1;
        this.f410 = false;
        this.f419 = false;
        this.f408 = -1;
        this.f400 = RecyclerView.UNDEFINED_DURATION;
        this.f406 = new C0044();
        this.f407 = 2;
        this.f413 = new Rect();
        this.f416 = new If();
        this.f412 = true;
        this.f418 = new Runnable() {
            public final void run() {
                StaggeredGridLayoutManager.this.m582();
            }
        };
        this.f417 = 1;
        m514(i);
        this.f414 = new C0911();
        this.f398 = C0966.m6885(this, this.f417);
        this.f404 = C0966.m6885(this, 1 - this.f417);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m550() {
        return this.f407 != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final boolean m582() {
        int i;
        int layoutPosition;
        if (!(m421() == 0 || this.f407 == 0 || !this.f354)) {
            if (this.f419) {
                int r0 = m421();
                if (r0 == 0) {
                    i = 0;
                } else {
                    i = ((RecyclerView.C0038) m432(r0 - 1).getLayoutParams()).f388.getLayoutPosition();
                }
                if (m421() != 0) {
                    ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition();
                }
            } else {
                if (m421() == 0) {
                    layoutPosition = 0;
                } else {
                    layoutPosition = ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition();
                }
                int r3 = m421();
                if (r3 != 0) {
                    ((RecyclerView.C0038) m432(r3 - 1).getLayoutParams()).f388.getLayoutPosition();
                }
            }
            if (i == 0 && m530() != null) {
                C0044 r02 = this.f406;
                if (r02.f439 != null) {
                    Arrays.fill(r02.f439, -1);
                }
                r02.f438 = null;
                this.f340 = true;
                if (this.f349 != null) {
                    this.f349.requestLayout();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m583(int i) {
        if (i == 0) {
            m582();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m570(RecyclerView recyclerView, RecyclerView.AUx aUx) {
        super.m439(recyclerView, aUx);
        Runnable runnable = this.f418;
        if (this.f349 != null) {
            this.f349.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f411; i++) {
            C0046 r1 = this.f401[i];
            r1.f447.clear();
            r1.f449 = RecyclerView.UNDEFINED_DURATION;
            r1.f448 = RecyclerView.UNDEFINED_DURATION;
            r1.f446 = 0;
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r10 == r11) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r10 == r11) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: ɹ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m530() {
        /*
            r12 = this;
            int r0 = r12.m421()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f411
            r2.<init>(r3)
            int r3 = r12.f411
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f417
            r5 = -1
            if (r3 != r1) goto L_0x0027
            androidx.recyclerview.widget.RecyclerView r3 = r12.f349
            int r3 = o.C0293.m4156(r3)
            if (r3 != r1) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = -1
        L_0x0028:
            boolean r6 = r12.f419
            if (r6 == 0) goto L_0x002e
            r6 = -1
            goto L_0x0032
        L_0x002e:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x0032:
            if (r0 >= r6) goto L_0x0035
            r5 = 1
        L_0x0035:
            if (r0 == r6) goto L_0x00aa
            android.view.View r7 = r12.m432((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ɩ r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0047) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r9 = r8.f450
            int r9 = r9.f444
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x005b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r9 = r8.f450
            boolean r9 = r12.m535((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0046) r9)
            if (r9 == 0) goto L_0x0054
            return r7
        L_0x0054:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r9 = r8.f450
            int r9 = r9.f444
            r2.clear(r9)
        L_0x005b:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x0035
            android.view.View r9 = r12.m432((int) r0)
            boolean r10 = r12.f419
            if (r10 == 0) goto L_0x0078
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6895(r7)
            o.ȷΙ r11 = r12.f398
            int r11 = r11.m6895(r9)
            if (r10 >= r11) goto L_0x0075
            return r7
        L_0x0075:
            if (r10 != r11) goto L_0x008b
            goto L_0x0089
        L_0x0078:
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6897(r7)
            o.ȷΙ r11 = r12.f398
            int r11 = r11.m6897(r9)
            if (r10 <= r11) goto L_0x0087
            return r7
        L_0x0087:
            if (r10 != r11) goto L_0x008b
        L_0x0089:
            r10 = 1
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            if (r10 == 0) goto L_0x0035
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ɩ r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0047) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r8 = r8.f450
            int r8 = r8.f444
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r9 = r9.f450
            int r9 = r9.f444
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a1
            r8 = 1
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            if (r3 >= 0) goto L_0x00a6
            r9 = 1
            goto L_0x00a7
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            if (r8 == r9) goto L_0x0035
            return r7
        L_0x00aa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m530():android.view.View");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m535(C0046 r5) {
        int i;
        int i2;
        if (this.f419) {
            if (r5.f448 != Integer.MIN_VALUE) {
                i2 = r5.f448;
            } else {
                r5.m601();
                i2 = r5.f448;
            }
            if (i2 < this.f398.m6886()) {
                r5.f447.get(r5.f447.size() - 1).getLayoutParams();
                return true;
            }
        } else {
            if (r5.f449 != Integer.MIN_VALUE) {
                i = r5.f449;
            } else {
                r5.m598();
                i = r5.f449;
            }
            if (i > this.f398.m6889()) {
                r5.f447.get(0).getLayoutParams();
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m571(String str) {
        if (this.f409 == null) {
            super.m440(str);
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private void m532() {
        boolean z = false;
        if (this.f417 != 1) {
            if (C0293.m4156(this.f349) == 1) {
                if (!this.f410) {
                    z = true;
                }
                this.f419 = z;
            }
        }
        z = this.f410;
        this.f419 = z;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m569(RecyclerView.C0033 r1) {
        super.m438(r1);
        this.f408 = -1;
        this.f400 = RecyclerView.UNDEFINED_DURATION;
        this.f409 = null;
        this.f416.m584();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m560() {
        return this.f409 == null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m561(RecyclerView.C0033 r1) {
        return m518(r1);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int m518(RecyclerView.C0033 r8) {
        if (m421() == 0) {
            return 0;
        }
        return C1100.m7482(r8, this.f398, m512(!this.f412), m533(!this.f412), this, this.f412, this.f419);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m574(RecyclerView.C0033 r1) {
        return m518(r1);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final int m578(RecyclerView.C0033 r1) {
        return m541(r1);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int m541(RecyclerView.C0033 r7) {
        if (m421() == 0) {
            return 0;
        }
        return C1100.m7481(r7, this.f398, m512(!this.f412), m533(!this.f412), this, this.f412);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final int m580(RecyclerView.C0033 r1) {
        return m541(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m544(RecyclerView.C0033 r1) {
        return m529(r1);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private int m529(RecyclerView.C0033 r7) {
        if (m421() == 0) {
            return 0;
        }
        return C1100.m7480(r7, this.f398, m512(!this.f412), m533(!this.f412), this, this.f412);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m555(RecyclerView.C0033 r1) {
        return m529(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m525(View view, C0047 r9) {
        int i = 0;
        if (this.f417 == 1) {
            int r0 = m385(this.f405, this.f346, 0, r9.width, false);
            int i2 = this.f341;
            int i3 = this.f343;
            int paddingTop = this.f349 != null ? this.f349.getPaddingTop() : 0;
            if (this.f349 != null) {
                i = this.f349.getPaddingBottom();
            }
            m516(view, r0, m385(i2, i3, paddingTop + i, r9.height, true));
            return;
        }
        m516(view, m385(this.f351, this.f346, (this.f349 != null ? this.f349.getPaddingLeft() : 0) + (this.f349 != null ? this.f349.getPaddingRight() : 0), r9.width, true), m385(this.f405, this.f343, 0, r9.height, false));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m516(View view, int i, int i2) {
        Rect rect = this.f413;
        if (this.f349 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f349.getItemDecorInsetsForChild(view));
        }
        C0047 r0 = (C0047) view.getLayoutParams();
        int r6 = m510(i, r0.leftMargin + this.f413.left, r0.rightMargin + this.f413.right);
        int r7 = m510(i2, r0.topMargin + this.f413.top, r0.bottomMargin + this.f413.bottom);
        if (m441(view, r6, r7, (RecyclerView.C0038) r0)) {
            view.measure(r6, r7);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m510(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m558(Parcelable parcelable) {
        if (parcelable instanceof Cif) {
            this.f409 = (Cif) parcelable;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable m576() {
        /*
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r0 = r5.f409
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$if
            r1.<init>((androidx.recyclerview.widget.StaggeredGridLayoutManager.Cif) r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$if
            r0.<init>()
            boolean r1 = r5.f410
            r0.f437 = r1
            boolean r1 = r5.f402
            r0.f436 = r1
            boolean r1 = r5.f403
            r0.f435 = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r1 = r5.f406
            r2 = 0
            if (r1 == 0) goto L_0x0036
            int[] r1 = r1.f439
            if (r1 == 0) goto L_0x0036
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r1 = r5.f406
            int[] r1 = r1.f439
            r0.f432 = r1
            int[] r1 = r0.f432
            int r1 = r1.length
            r0.f430 = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r1 = r5.f406
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$ı$ı> r1 = r1.f438
            r0.f429 = r1
            goto L_0x0038
        L_0x0036:
            r0.f430 = r2
        L_0x0038:
            int r1 = r5.m421()
            r3 = -1
            if (r1 <= 0) goto L_0x00d0
            boolean r1 = r5.f402
            r4 = 1
            if (r1 == 0) goto L_0x005d
            int r1 = r5.m421()
            if (r1 != 0) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            int r1 = r1 - r4
            android.view.View r1 = r5.m432((int) r1)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r1 = r1.getLayoutPosition()
            goto L_0x0075
        L_0x005d:
            int r1 = r5.m421()
            if (r1 != 0) goto L_0x0065
        L_0x0063:
            r1 = 0
            goto L_0x0075
        L_0x0065:
            android.view.View r1 = r5.m432((int) r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r1 = r1.getLayoutPosition()
        L_0x0075:
            r0.f433 = r1
            boolean r1 = r5.f419
            if (r1 == 0) goto L_0x0080
            android.view.View r1 = r5.m533((boolean) r4)
            goto L_0x0084
        L_0x0080:
            android.view.View r1 = r5.m512((boolean) r4)
        L_0x0084:
            if (r1 != 0) goto L_0x0087
            goto L_0x0093
        L_0x0087:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            androidx.recyclerview.widget.RecyclerView$con r1 = r1.f388
            int r3 = r1.getLayoutPosition()
        L_0x0093:
            r0.f428 = r3
            int r1 = r5.f411
            r0.f431 = r1
            int[] r1 = new int[r1]
            r0.f434 = r1
        L_0x009d:
            int r1 = r5.f411
            if (r2 >= r1) goto L_0x00d6
            boolean r1 = r5.f402
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x00b8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r1 = r5.f401
            r1 = r1[r2]
            int r1 = r1.m594((int) r3)
            if (r1 == r3) goto L_0x00c9
            o.ȷΙ r3 = r5.f398
            int r3 = r3.m6886()
            goto L_0x00c8
        L_0x00b8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r1 = r5.f401
            r1 = r1[r2]
            int r1 = r1.m600(r3)
            if (r1 == r3) goto L_0x00c9
            o.ȷΙ r3 = r5.f398
            int r3 = r3.m6889()
        L_0x00c8:
            int r1 = r1 - r3
        L_0x00c9:
            int[] r3 = r0.f434
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00d0:
            r0.f433 = r3
            r0.f428 = r3
            r0.f431 = r2
        L_0x00d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m576():android.os.Parcelable");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m559(RecyclerView.AUx aUx, RecyclerView.C0033 r8, View view, C0520 r10) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0047)) {
            super.m437(view, r10);
            return;
        }
        C0047 r7 = (C0047) layoutParams;
        if (this.f417 == 0) {
            if (r7.f450 == null) {
                i2 = -1;
            } else {
                i2 = r7.f450.f444;
            }
            r10.m5023((Object) C0520.If.m5072(i2, 1, -1, -1, false, false));
            return;
        }
        if (r7.f450 == null) {
            i = -1;
        } else {
            i = r7.f450.f444;
        }
        r10.m5023((Object) C0520.If.m5072(-1, -1, i, 1, false, false));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m548(AccessibilityEvent accessibilityEvent) {
        super.m401(accessibilityEvent);
        if (m421() > 0) {
            View r1 = m512(false);
            View r0 = m533(false);
            if (r1 != null && r0 != null) {
                int layoutPosition = ((RecyclerView.C0038) r1.getLayoutParams()).f388.getLayoutPosition();
                int layoutPosition2 = ((RecyclerView.C0038) r0.getLayoutParams()).f388.getLayoutPosition();
                if (layoutPosition < layoutPosition2) {
                    accessibilityEvent.setFromIndex(layoutPosition);
                    accessibilityEvent.setToIndex(layoutPosition2);
                    return;
                }
                accessibilityEvent.setFromIndex(layoutPosition2);
                accessibilityEvent.setToIndex(layoutPosition);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m543(RecyclerView.AUx aUx, RecyclerView.C0033 r3) {
        if (this.f417 == 0) {
            return this.f411;
        }
        return super.m394(aUx, r3);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m573(RecyclerView.AUx aUx, RecyclerView.C0033 r4) {
        if (this.f417 == 1) {
            return this.f411;
        }
        return super.m443(aUx, r4);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private View m512(boolean z) {
        int r0 = this.f398.m6889();
        int r1 = this.f398.m6886();
        int r2 = m421();
        View view = null;
        for (int i = 0; i < r2; i++) {
            View r5 = m432(i);
            int r6 = this.f398.m6897(r5);
            if (this.f398.m6895(r5) > r0 && r6 < r1) {
                if (r6 >= r0 || !z) {
                    return r5;
                }
                if (view == null) {
                    view = r5;
                }
            }
        }
        return view;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private View m533(boolean z) {
        int r0 = this.f398.m6889();
        int r1 = this.f398.m6886();
        View view = null;
        for (int r2 = m421() - 1; r2 >= 0; r2--) {
            View r4 = m432(r2);
            int r5 = this.f398.m6897(r4);
            int r6 = this.f398.m6895(r4);
            if (r6 > r0 && r5 < r1) {
                if (r6 <= r1 || !z) {
                    return r4;
                }
                if (view == null) {
                    view = r4;
                }
            }
        }
        return view;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m520(RecyclerView.AUx aUx, RecyclerView.C0033 r4, boolean z) {
        int r0;
        int r1 = m542(RecyclerView.UNDEFINED_DURATION);
        if (r1 != Integer.MIN_VALUE && (r0 = this.f398.m6886() - r1) > 0) {
            int i = r0 - (-m511(-r0, aUx, r4));
            if (z && i > 0) {
                this.f398.m6893(i);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m537(RecyclerView.AUx aUx, RecyclerView.C0033 r4, boolean z) {
        int r1;
        int r12 = m522(Integer.MAX_VALUE);
        if (r12 != Integer.MAX_VALUE && (r1 = r12 - this.f398.m6889()) > 0) {
            int r13 = r1 - m511(r1, aUx, r4);
            if (z && r13 > 0) {
                this.f398.m6893(-r13);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m515(int r5, androidx.recyclerview.widget.RecyclerView.C0033 r6) {
        /*
            r4 = this;
            o.ǃɺ r0 = r4.f414
            r1 = 0
            r0.f5788 = r1
            r0.f5789 = r5
            androidx.recyclerview.widget.RecyclerView$AuX r0 = r4.f352
            r2 = 1
            if (r0 == 0) goto L_0x0016
            androidx.recyclerview.widget.RecyclerView$AuX r0 = r4.f352
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x0037
            int r6 = r6.f368
            r0 = -1
            if (r6 == r0) goto L_0x0037
            boolean r0 = r4.f419
            if (r6 >= r5) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r0 != r5) goto L_0x002e
            o.ȷΙ r5 = r4.f398
            int r5 = r5.m6891()
            goto L_0x0038
        L_0x002e:
            o.ȷΙ r5 = r4.f398
            int r5 = r5.m6891()
            r6 = r5
            r5 = 0
            goto L_0x0039
        L_0x0037:
            r5 = 0
        L_0x0038:
            r6 = 0
        L_0x0039:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f349
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.RecyclerView r0 = r4.f349
            boolean r0 = r0.mClipToPadding
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x005f
            o.ǃɺ r0 = r4.f414
            o.ȷΙ r3 = r4.f398
            int r3 = r3.m6889()
            int r3 = r3 - r6
            r0.f5793 = r3
            o.ǃɺ r6 = r4.f414
            o.ȷΙ r0 = r4.f398
            int r0 = r0.m6886()
            int r0 = r0 + r5
            r6.f5794 = r0
            goto L_0x006f
        L_0x005f:
            o.ǃɺ r0 = r4.f414
            o.ȷΙ r3 = r4.f398
            int r3 = r3.m6894()
            int r3 = r3 + r5
            r0.f5794 = r3
            o.ǃɺ r5 = r4.f414
            int r6 = -r6
            r5.f5793 = r6
        L_0x006f:
            o.ǃɺ r5 = r4.f414
            r5.f5787 = r1
            r5.f5791 = r2
            o.ȷΙ r6 = r4.f398
            int r6 = r6.m6888()
            if (r6 != 0) goto L_0x0086
            o.ȷΙ r6 = r4.f398
            int r6 = r6.m6894()
            if (r6 != 0) goto L_0x0086
            r1 = 1
        L_0x0086:
            r5.f5790 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m515(int, androidx.recyclerview.widget.RecyclerView$ȷ):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m534(int i) {
        C0911 r0 = this.f414;
        r0.f5786 = i;
        int i2 = 1;
        if (this.f419 != (i == -1)) {
            i2 = -1;
        }
        r0.f5792 = i2;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m552(int i) {
        super.m407(i);
        for (int i2 = 0; i2 < this.f411; i2++) {
            this.f401[i2].m604(i);
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m581(int i) {
        super.m456(i);
        for (int i2 = 0; i2 < this.f411; i2++) {
            this.f401[i2].m604(i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m557(int i, int i2) {
        m519(i, i2, 2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m546(int i, int i2) {
        m519(i, i2, 1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m562() {
        C0044 r0 = this.f406;
        if (r0.f439 != null) {
            Arrays.fill(r0.f439, -1);
        }
        r0.f438 = null;
        if (this.f349 != null) {
            this.f349.requestLayout();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m564(int i, int i2) {
        m519(i, i2, 8);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m567(int i, int i2) {
        m519(i, i2, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m519(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f419
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            int r0 = r7.m421()
            if (r0 != 0) goto L_0x000d
            goto L_0x0025
        L_0x000d:
            int r0 = r0 - r2
            android.view.View r0 = r7.m432((int) r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r0 = (androidx.recyclerview.widget.RecyclerView.C0038) r0
            androidx.recyclerview.widget.RecyclerView$con r0 = r0.f388
            int r0 = r0.getLayoutPosition()
            goto L_0x0037
        L_0x001f:
            int r0 = r7.m421()
            if (r0 != 0) goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0037
        L_0x0027:
            android.view.View r0 = r7.m432((int) r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r0 = (androidx.recyclerview.widget.RecyclerView.C0038) r0
            androidx.recyclerview.widget.RecyclerView$con r0 = r0.f388
            int r0 = r0.getLayoutPosition()
        L_0x0037:
            r3 = 8
            if (r10 != r3) goto L_0x0045
            if (r8 >= r9) goto L_0x0040
            int r4 = r9 + 1
            goto L_0x0047
        L_0x0040:
            int r4 = r8 + 1
            r5 = r4
            r4 = r9
            goto L_0x0049
        L_0x0045:
            int r4 = r8 + r9
        L_0x0047:
            r5 = r4
            r4 = r8
        L_0x0049:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r6 = r7.f406
            r6.m589(r4)
            if (r10 == r2) goto L_0x0067
            r6 = 2
            if (r10 == r6) goto L_0x0061
            if (r10 == r3) goto L_0x0056
            goto L_0x006c
        L_0x0056:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r10 = r7.f406
            r10.m592(r8, r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r8 = r7.f406
            r8.m590(r9, r2)
            goto L_0x006c
        L_0x0061:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r10 = r7.f406
            r10.m592(r8, r9)
            goto L_0x006c
        L_0x0067:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r10 = r7.f406
            r10.m590(r8, r9)
        L_0x006c:
            if (r5 > r0) goto L_0x006f
            return
        L_0x006f:
            boolean r8 = r7.f419
            if (r8 == 0) goto L_0x008b
            int r8 = r7.m421()
            if (r8 != 0) goto L_0x007a
            goto L_0x00a3
        L_0x007a:
            android.view.View r8 = r7.m432((int) r1)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r8 = (androidx.recyclerview.widget.RecyclerView.C0038) r8
            androidx.recyclerview.widget.RecyclerView$con r8 = r8.f388
            int r1 = r8.getLayoutPosition()
            goto L_0x00a3
        L_0x008b:
            int r8 = r7.m421()
            if (r8 != 0) goto L_0x0092
            goto L_0x00a3
        L_0x0092:
            int r8 = r8 - r2
            android.view.View r8 = r7.m432((int) r8)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r8 = (androidx.recyclerview.widget.RecyclerView.C0038) r8
            androidx.recyclerview.widget.RecyclerView$con r8 = r8.f388
            int r1 = r8.getLayoutPosition()
        L_0x00a3:
            if (r4 > r1) goto L_0x00ae
            androidx.recyclerview.widget.RecyclerView r8 = r7.f349
            if (r8 == 0) goto L_0x00ae
            androidx.recyclerview.widget.RecyclerView r8 = r7.f349
            r8.requestLayout()
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m519(int, int, int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m523(RecyclerView.AUx aUx, C0911 r13, RecyclerView.C0033 r14) {
        int i;
        int i2;
        int i3;
        C0046 r6;
        int i4;
        int i5;
        int i6;
        int i7;
        this.f399.set(0, this.f411, true);
        if (this.f414.f5790) {
            i = r13.f5786 == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else if (r13.f5786 == 1) {
            i = r13.f5794 + r13.f5788;
        } else {
            i = r13.f5793 - r13.f5788;
        }
        m540(r13.f5786, i);
        if (this.f419) {
            i2 = this.f398.m6886();
        } else {
            i2 = this.f398.m6889();
        }
        boolean z = false;
        while (r13.m6724(r14) && (this.f414.f5790 || !this.f399.isEmpty())) {
            View r4 = aUx.m361(r13.f5789);
            r13.f5789 += r13.f5792;
            C0047 r5 = (C0047) r4.getLayoutParams();
            int layoutPosition = r5.f388.getLayoutPosition();
            C0044 r8 = this.f406;
            int i8 = (r8.f439 == null || layoutPosition >= r8.f439.length) ? -1 : r8.f439[layoutPosition];
            if (i8 == -1) {
                r6 = m513(r13);
                C0044 r82 = this.f406;
                r82.m591(layoutPosition);
                r82.f439[layoutPosition] = r6.f444;
            } else {
                r6 = this.f401[i8];
            }
            r5.f450 = r6;
            if (r13.f5786 == 1) {
                m427(r4);
            } else {
                m448(r4);
            }
            m525(r4, r5);
            if (r13.f5786 == 1) {
                i5 = r6.m594(i2);
                i4 = this.f398.m6892(r4) + i5;
            } else {
                i4 = r6.m600(i2);
                i5 = i4 - this.f398.m6892(r4);
            }
            if (r13.f5786 == 1) {
                r5.f450.m597(r4);
            } else {
                r5.f450.m602(r4);
            }
            if (!(C0293.m4156(this.f349) == 1) || this.f417 != 1) {
                i6 = this.f404.m6889() + (r6.f444 * this.f405);
                i7 = this.f404.m6892(r4) + i6;
            } else {
                i7 = this.f404.m6886() - (((this.f411 - 1) - r6.f444) * this.f405);
                i6 = i7 - this.f404.m6892(r4);
            }
            if (this.f417 == 1) {
                m386(r4, i6, i5, i7, i4);
            } else {
                m386(r4, i5, i6, i4, i7);
            }
            m538(r6, this.f414.f5786, i);
            m517(aUx, this.f414);
            if (this.f414.f5787 && r4.hasFocusable()) {
                this.f399.set(r6.f444, false);
            }
            z = true;
        }
        if (!z) {
            m517(aUx, this.f414);
        }
        if (this.f414.f5786 == -1) {
            i3 = this.f398.m6889() - m522(this.f398.m6889());
        } else {
            i3 = m542(this.f398.m6886()) - this.f398.m6886();
        }
        if (i3 > 0) {
            return Math.min(r13.f5788, i3);
        }
        return 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m517(RecyclerView.AUx aUx, C0911 r4) {
        int i;
        int i2;
        if (r4.f5791 && !r4.f5790) {
            if (r4.f5788 == 0) {
                if (r4.f5786 == -1) {
                    m526(aUx, r4.f5794);
                } else {
                    m536(aUx, r4.f5793);
                }
            } else if (r4.f5786 == -1) {
                int r0 = r4.f5793 - m539(r4.f5793);
                if (r0 < 0) {
                    i2 = r4.f5794;
                } else {
                    i2 = r4.f5794 - Math.min(r0, r4.f5788);
                }
                m526(aUx, i2);
            } else {
                int r02 = m531(r4.f5794) - r4.f5794;
                if (r02 < 0) {
                    i = r4.f5793;
                } else {
                    i = Math.min(r02, r4.f5788) + r4.f5793;
                }
                m536(aUx, i);
            }
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m540(int i, int i2) {
        for (int i3 = 0; i3 < this.f411; i3++) {
            if (!this.f401[i3].f447.isEmpty()) {
                m538(this.f401[i3], i, i2);
            }
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private int m539(int i) {
        int r0 = this.f401[0].m600(i);
        for (int i2 = 1; i2 < this.f411; i2++) {
            int r2 = this.f401[i2].m600(i);
            if (r2 > r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private int m522(int i) {
        int r0 = this.f401[0].m600(i);
        for (int i2 = 1; i2 < this.f411; i2++) {
            int r2 = this.f401[i2].m600(i);
            if (r2 < r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private int m542(int i) {
        int r0 = this.f401[0].m594(i);
        for (int i2 = 1; i2 < this.f411; i2++) {
            int r2 = this.f401[i2].m594(i);
            if (r2 > r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private int m531(int i) {
        int r0 = this.f401[0].m594(i);
        for (int i2 = 1; i2 < this.f411; i2++) {
            int r2 = this.f401[i2].m594(i);
            if (r2 < r0) {
                r0 = r2;
            }
        }
        return r0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m536(RecyclerView.AUx aUx, int i) {
        while (m421() > 0) {
            View r0 = m432(0);
            if (this.f398.m6895(r0) <= i && this.f398.m6887(r0) <= i) {
                C0047 r1 = (C0047) r0.getLayoutParams();
                if (r1.f450.f447.size() != 1) {
                    r1.f450.m603();
                    m436(r0);
                    aUx.m366(r0);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m526(RecyclerView.AUx aUx, int i) {
        int r0 = m421() - 1;
        while (r0 >= 0) {
            View r2 = m432(r0);
            if (this.f398.m6897(r2) >= i && this.f398.m6890(r2) >= i) {
                C0047 r3 = (C0047) r2.getLayoutParams();
                if (r3.f450.f447.size() != 1) {
                    r3.f450.m596();
                    m436(r2);
                    aUx.m366(r2);
                    r0--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean m521(int i) {
        if (this.f417 == 0) {
            return (i == -1) != this.f419;
        }
        return ((i == -1) == this.f419) == (C0293.m4156(this.f349) == 1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C0046 m513(C0911 r8) {
        int i;
        int i2;
        int i3 = -1;
        if (m521(r8.f5786)) {
            i2 = this.f411 - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f411;
            i = 1;
        }
        C0046 r4 = null;
        if (r8.f5786 == 1) {
            int i4 = Integer.MAX_VALUE;
            int r2 = this.f398.m6889();
            while (i2 != i3) {
                C0046 r5 = this.f401[i2];
                int r6 = r5.m594(r2);
                if (r6 < i4) {
                    r4 = r5;
                    i4 = r6;
                }
                i2 += i;
            }
            return r4;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int r22 = this.f398.m6886();
        while (i2 != i3) {
            C0046 r52 = this.f401[i2];
            int r62 = r52.m600(r22);
            if (r62 > i5) {
                r4 = r52;
                i5 = r62;
            }
            i2 += i;
        }
        return r4;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m579() {
        return this.f417 == 1;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m553() {
        return this.f417 == 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m572(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r3) {
        return m511(i, aUx, r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m554(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r3) {
        return m511(i, aUx, r3);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private int m528(int i) {
        int i2;
        if (m421() == 0) {
            return this.f419 ? 1 : -1;
        }
        boolean z = false;
        if (m421() == 0) {
            i2 = 0;
        } else {
            i2 = ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition();
        }
        if (i < i2) {
            z = true;
        }
        return z != this.f419 ? -1 : 1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final PointF m575(int i) {
        int r4 = m528(i);
        PointF pointF = new PointF();
        if (r4 == 0) {
            return null;
        }
        if (this.f417 == 0) {
            pointF.x = (float) r4;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) r4;
        }
        return pointF;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m549(RecyclerView recyclerView, int i) {
        C0974 r0 = new C0974(recyclerView.getContext());
        r0.setTargetPosition(i);
        m403((RecyclerView.C3240AuX) r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m563(int i) {
        Cif ifVar = this.f409;
        if (!(ifVar == null || ifVar.f433 == i)) {
            Cif ifVar2 = this.f409;
            ifVar2.f434 = null;
            ifVar2.f431 = 0;
            ifVar2.f433 = -1;
            ifVar2.f428 = -1;
        }
        this.f408 = i;
        this.f400 = RecyclerView.UNDEFINED_DURATION;
        if (this.f349 != null) {
            this.f349.requestLayout();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m568(int i, int i2, RecyclerView.C0033 r7, RecyclerView.IF.C0027 r8) {
        int i3;
        int i4;
        if (this.f417 != 0) {
            i = i2;
        }
        if (m421() != 0 && i != 0) {
            m524(i, r7);
            int[] iArr = this.f415;
            if (iArr == null || iArr.length < this.f411) {
                this.f415 = new int[this.f411];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f411; i6++) {
                if (this.f414.f5792 == -1) {
                    i4 = this.f414.f5793;
                    i3 = this.f401[i6].m600(this.f414.f5793);
                } else {
                    i4 = this.f401[i6].m594(this.f414.f5794);
                    i3 = this.f414.f5794;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f415[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f415, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f414.m6724(r7); i8++) {
                r8.m471(this.f414.f5789, this.f415[i8]);
                this.f414.f5789 += this.f414.f5792;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m511(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r5) {
        if (m421() == 0 || i == 0) {
            return 0;
        }
        m524(i, r5);
        int r52 = m523(aUx, this.f414, r5);
        if (this.f414.f5788 >= r52) {
            i = i < 0 ? -r52 : r52;
        }
        this.f398.m6893(-i);
        this.f402 = this.f419;
        C0911 r53 = this.f414;
        r53.f5788 = 0;
        m517(aUx, r53);
        return i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final RecyclerView.C0038 m566() {
        if (this.f417 == 0) {
            return new C0047(-2, -1);
        }
        return new C0047(-1, -2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final RecyclerView.C0038 m545(Context context, AttributeSet attributeSet) {
        return new C0047(context, attributeSet);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final RecyclerView.C0038 m577(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0047((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0047(layoutParams);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m551(RecyclerView.C0038 r1) {
        return r1 instanceof C0047;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r9.f417 == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        if (r9.f417 == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        if ((o.C0293.m4156(r9.f349) == 1) != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if ((o.C0293.m4156(r9.f349) == 1) != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015c A[LOOP:3: B:103:0x015c->B:112:0x017c, LOOP_START, PHI: r3 
  PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:90:0x0132, B:112:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0134  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View m556(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.AUx r12, androidx.recyclerview.widget.RecyclerView.C0033 r13) {
        /*
            r9 = this;
            int r0 = r9.m421()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.m455((android.view.View) r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.m532()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 0
            r4 = 1
            if (r11 == r4) goto L_0x0057
            r5 = 2
            if (r11 == r5) goto L_0x0043
            r5 = 17
            if (r11 == r5) goto L_0x003e
            r5 = 33
            if (r11 == r5) goto L_0x0039
            r5 = 66
            if (r11 == r5) goto L_0x0034
            r5 = 130(0x82, float:1.82E-43)
            if (r11 == r5) goto L_0x002f
        L_0x002c:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x006b
        L_0x002f:
            int r11 = r9.f417
            if (r11 != r4) goto L_0x002c
            goto L_0x0047
        L_0x0034:
            int r11 = r9.f417
            if (r11 != 0) goto L_0x002c
            goto L_0x0047
        L_0x0039:
            int r11 = r9.f417
            if (r11 != r4) goto L_0x002c
            goto L_0x005b
        L_0x003e:
            int r11 = r9.f417
            if (r11 != 0) goto L_0x002c
            goto L_0x005b
        L_0x0043:
            int r11 = r9.f417
            if (r11 != r4) goto L_0x0049
        L_0x0047:
            r11 = 1
            goto L_0x006b
        L_0x0049:
            androidx.recyclerview.widget.RecyclerView r11 = r9.f349
            int r11 = o.C0293.m4156(r11)
            if (r11 != r4) goto L_0x0053
            r11 = 1
            goto L_0x0054
        L_0x0053:
            r11 = 0
        L_0x0054:
            if (r11 == 0) goto L_0x0047
            goto L_0x005b
        L_0x0057:
            int r11 = r9.f417
            if (r11 != r4) goto L_0x005d
        L_0x005b:
            r11 = -1
            goto L_0x006b
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView r11 = r9.f349
            int r11 = o.C0293.m4156(r11)
            if (r11 != r4) goto L_0x0067
            r11 = 1
            goto L_0x0068
        L_0x0067:
            r11 = 0
        L_0x0068:
            if (r11 == 0) goto L_0x005b
            goto L_0x0047
        L_0x006b:
            if (r11 != r0) goto L_0x006e
            return r1
        L_0x006e:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ɩ r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0047) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r0 = r0.f450
            if (r11 != r4) goto L_0x0092
            int r5 = r9.m421()
            if (r5 != 0) goto L_0x0080
        L_0x007e:
            r5 = 0
            goto L_0x00a9
        L_0x0080:
            int r5 = r5 - r4
            android.view.View r5 = r9.m432((int) r5)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r5 = (androidx.recyclerview.widget.RecyclerView.C0038) r5
            androidx.recyclerview.widget.RecyclerView$con r5 = r5.f388
            int r5 = r5.getLayoutPosition()
            goto L_0x00a9
        L_0x0092:
            int r5 = r9.m421()
            if (r5 != 0) goto L_0x0099
            goto L_0x007e
        L_0x0099:
            android.view.View r5 = r9.m432((int) r3)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r5 = (androidx.recyclerview.widget.RecyclerView.C0038) r5
            androidx.recyclerview.widget.RecyclerView$con r5 = r5.f388
            int r5 = r5.getLayoutPosition()
        L_0x00a9:
            r9.m515((int) r5, (androidx.recyclerview.widget.RecyclerView.C0033) r13)
            r9.m534((int) r11)
            o.ǃɺ r6 = r9.f414
            int r7 = r6.f5792
            int r7 = r7 + r5
            r6.f5789 = r7
            o.ǃɺ r6 = r9.f414
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            o.ȷΙ r8 = r9.f398
            int r8 = r8.m6891()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f5788 = r7
            o.ǃɺ r6 = r9.f414
            r6.f5787 = r4
            r6.f5791 = r3
            r9.m523(r12, r6, r13)
            boolean r12 = r9.f419
            r9.f402 = r12
            android.view.View r12 = r0.m595(r5, r11)
            if (r12 == 0) goto L_0x00dd
            if (r12 == r10) goto L_0x00dd
            return r12
        L_0x00dd:
            boolean r12 = r9.m521(r11)
            if (r12 == 0) goto L_0x00f8
            int r12 = r9.f411
            int r12 = r12 - r4
        L_0x00e6:
            if (r12 < 0) goto L_0x010d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r13 = r9.f401
            r13 = r13[r12]
            android.view.View r13 = r13.m595(r5, r11)
            if (r13 == 0) goto L_0x00f5
            if (r13 == r10) goto L_0x00f5
            return r13
        L_0x00f5:
            int r12 = r12 + -1
            goto L_0x00e6
        L_0x00f8:
            r12 = 0
        L_0x00f9:
            int r13 = r9.f411
            if (r12 >= r13) goto L_0x010d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r13 = r9.f401
            r13 = r13[r12]
            android.view.View r13 = r13.m595(r5, r11)
            if (r13 == 0) goto L_0x010a
            if (r13 == r10) goto L_0x010a
            return r13
        L_0x010a:
            int r12 = r12 + 1
            goto L_0x00f9
        L_0x010d:
            boolean r12 = r9.f410
            r12 = r12 ^ r4
            if (r11 != r2) goto L_0x0114
            r13 = 1
            goto L_0x0115
        L_0x0114:
            r13 = 0
        L_0x0115:
            if (r12 != r13) goto L_0x0119
            r12 = 1
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            if (r12 == 0) goto L_0x0121
            int r13 = r0.m599()
            goto L_0x0125
        L_0x0121:
            int r13 = r0.m605()
        L_0x0125:
            android.view.View r13 = r9.m411((int) r13)
            if (r13 == 0) goto L_0x012e
            if (r13 == r10) goto L_0x012e
            return r13
        L_0x012e:
            boolean r11 = r9.m521(r11)
            if (r11 == 0) goto L_0x015c
            int r11 = r9.f411
            int r11 = r11 - r4
        L_0x0137:
            if (r11 < 0) goto L_0x017f
            int r13 = r0.f444
            if (r11 == r13) goto L_0x0159
            if (r12 == 0) goto L_0x0148
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r13 = r9.f401
            r13 = r13[r11]
            int r13 = r13.m599()
            goto L_0x0150
        L_0x0148:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r13 = r9.f401
            r13 = r13[r11]
            int r13 = r13.m605()
        L_0x0150:
            android.view.View r13 = r9.m411((int) r13)
            if (r13 == 0) goto L_0x0159
            if (r13 == r10) goto L_0x0159
            return r13
        L_0x0159:
            int r11 = r11 + -1
            goto L_0x0137
        L_0x015c:
            int r11 = r9.f411
            if (r3 >= r11) goto L_0x017f
            if (r12 == 0) goto L_0x016b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r11 = r9.f401
            r11 = r11[r3]
            int r11 = r11.m599()
            goto L_0x0173
        L_0x016b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r11 = r9.f401
            r11 = r11[r3]
            int r11 = r11.m605()
        L_0x0173:
            android.view.View r11 = r9.m411((int) r11)
            if (r11 == 0) goto L_0x017c
            if (r11 == r10) goto L_0x017c
            return r11
        L_0x017c:
            int r3 = r3 + 1
            goto L_0x015c
        L_0x017f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m556(android.view.View, int, androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ):android.view.View");
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ɩ  reason: contains not printable characters */
    public static class C0047 extends RecyclerView.C0038 {

        /* renamed from: ǃ  reason: contains not printable characters */
        C0046 f450;

        public C0047(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0047(int i, int i2) {
            super(i, i2);
        }

        public C0047(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0047(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ  reason: contains not printable characters */
    class C0046 {

        /* renamed from: ı  reason: contains not printable characters */
        final int f444;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f446 = 0;

        /* renamed from: ɩ  reason: contains not printable characters */
        ArrayList<View> f447 = new ArrayList<>();

        /* renamed from: Ι  reason: contains not printable characters */
        int f448 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ι  reason: contains not printable characters */
        int f449 = RecyclerView.UNDEFINED_DURATION;

        C0046(int i) {
            this.f444 = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m600(int i) {
            int i2 = this.f449;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f447.size() == 0) {
                return i;
            }
            m598();
            return this.f449;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m598() {
            View view = this.f447.get(0);
            view.getLayoutParams();
            this.f449 = StaggeredGridLayoutManager.this.f398.m6897(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final int m594(int i) {
            int i2 = this.f448;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f447.size() == 0) {
                return i;
            }
            m601();
            return this.f448;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m601() {
            ArrayList<View> arrayList = this.f447;
            View view = arrayList.get(arrayList.size() - 1);
            view.getLayoutParams();
            this.f448 = StaggeredGridLayoutManager.this.f398.m6895(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m596() {
            int size = this.f447.size();
            View remove = this.f447.remove(size - 1);
            C0047 r2 = (C0047) remove.getLayoutParams();
            r2.f450 = null;
            if (r2.f388.isRemoved() || r2.f388.isUpdated()) {
                this.f446 -= StaggeredGridLayoutManager.this.f398.m6892(remove);
            }
            if (size == 1) {
                this.f449 = RecyclerView.UNDEFINED_DURATION;
            }
            this.f448 = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m603() {
            View remove = this.f447.remove(0);
            C0047 r1 = (C0047) remove.getLayoutParams();
            r1.f450 = null;
            if (this.f447.size() == 0) {
                this.f448 = RecyclerView.UNDEFINED_DURATION;
            }
            if (r1.f388.isRemoved() || r1.f388.isUpdated()) {
                this.f446 -= StaggeredGridLayoutManager.this.f398.m6892(remove);
            }
            this.f449 = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m604(int i) {
            int i2 = this.f449;
            if (i2 != Integer.MIN_VALUE) {
                this.f449 = i2 + i;
            }
            int i3 = this.f448;
            if (i3 != Integer.MIN_VALUE) {
                this.f448 = i3 + i;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m599() {
            if (StaggeredGridLayoutManager.this.f410) {
                return m593(this.f447.size() - 1, -1);
            }
            return m593(0, this.f447.size());
        }

        /* renamed from: І  reason: contains not printable characters */
        public final int m605() {
            if (StaggeredGridLayoutManager.this.f410) {
                return m593(0, this.f447.size());
            }
            return m593(this.f447.size() - 1, -1);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private int m593(int i, int i2) {
            int r0 = StaggeredGridLayoutManager.this.f398.m6889();
            int r1 = StaggeredGridLayoutManager.this.f398.m6886();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f447.get(i);
                int r6 = StaggeredGridLayoutManager.this.f398.m6897(view);
                int r7 = StaggeredGridLayoutManager.this.f398.m6895(view);
                boolean z = false;
                boolean z2 = r6 <= r1;
                if (r7 >= r0) {
                    z = true;
                }
                if (z2 && z && (r6 < r0 || r7 > r1)) {
                    return StaggeredGridLayoutManager.m392(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final View m595(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f447.size() - 1;
                while (size >= 0) {
                    View view2 = this.f447.get(size);
                    if ((StaggeredGridLayoutManager.this.f410 && StaggeredGridLayoutManager.m392(view2) >= i) || ((!StaggeredGridLayoutManager.this.f410 && StaggeredGridLayoutManager.m392(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f447.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f447.get(i3);
                    if ((StaggeredGridLayoutManager.this.f410 && StaggeredGridLayoutManager.m392(view3) <= i) || ((!StaggeredGridLayoutManager.this.f410 && StaggeredGridLayoutManager.m392(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m602(View view) {
            C0047 r0 = (C0047) view.getLayoutParams();
            r0.f450 = this;
            this.f447.add(0, view);
            this.f449 = RecyclerView.UNDEFINED_DURATION;
            if (this.f447.size() == 1) {
                this.f448 = RecyclerView.UNDEFINED_DURATION;
            }
            if (r0.f388.isRemoved() || r0.f388.isUpdated()) {
                this.f446 += StaggeredGridLayoutManager.this.f398.m6892(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m597(View view) {
            C0047 r0 = (C0047) view.getLayoutParams();
            r0.f450 = this;
            this.f447.add(view);
            this.f448 = RecyclerView.UNDEFINED_DURATION;
            if (this.f447.size() == 1) {
                this.f449 = RecyclerView.UNDEFINED_DURATION;
            }
            if (r0.f388.isRemoved() || r0.f388.isUpdated()) {
                this.f446 += StaggeredGridLayoutManager.this.f398.m6892(view);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ı  reason: contains not printable characters */
    static class C0044 {

        /* renamed from: ǃ  reason: contains not printable characters */
        List<C0045> f438;

        /* renamed from: Ι  reason: contains not printable characters */
        int[] f439;

        C0044() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final int m589(int i) {
            int[] iArr = this.f439;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int r0 = m587(i);
            if (r0 == -1) {
                int[] iArr2 = this.f439;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f439.length;
            }
            int i2 = r0 + 1;
            Arrays.fill(this.f439, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m591(int i) {
            int[] iArr = this.f439;
            if (iArr == null) {
                this.f439 = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f439, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length <<= 1;
                }
                this.f439 = new int[length];
                System.arraycopy(iArr, 0, this.f439, 0, iArr.length);
                int[] iArr2 = this.f439;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m592(int i, int i2) {
            int[] iArr = this.f439;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m591(i3);
                int[] iArr2 = this.f439;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f439;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m588(i, i2);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m588(int i, int i2) {
            List<C0045> list = this.f438;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0045 r2 = this.f438.get(size);
                    if (r2.f443 >= i) {
                        if (r2.f443 < i3) {
                            this.f438.remove(size);
                        } else {
                            r2.f443 -= i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m590(int i, int i2) {
            int[] iArr = this.f439;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m591(i3);
                int[] iArr2 = this.f439;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f439, i, i3, -1);
                m585(i, i2);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m585(int i, int i2) {
            List<C0045> list = this.f438;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0045 r1 = this.f438.get(size);
                    if (r1.f443 >= i) {
                        r1.f443 += i2;
                    }
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private int m587(int i) {
            if (this.f438 == null) {
                return -1;
            }
            C0045 r0 = m586(i);
            if (r0 != null) {
                this.f438.remove(r0);
            }
            int size = this.f438.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f438.get(i2).f443 >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f438.remove(i2);
            return this.f438.get(i2).f443;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private C0045 m586(int i) {
            List<C0045> list = this.f438;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0045 r2 = this.f438.get(size);
                if (r2.f443 == i) {
                    return r2;
                }
            }
            return null;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$ı$ı  reason: contains not printable characters */
        static class C0045 implements Parcelable {
            public static final Parcelable.Creator<C0045> CREATOR = new Parcelable.Creator<C0045>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new C0045[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new C0045(parcel);
                }
            };

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f440;

            /* renamed from: ɩ  reason: contains not printable characters */
            private int[] f441;

            /* renamed from: Ι  reason: contains not printable characters */
            private boolean f442;

            /* renamed from: ι  reason: contains not printable characters */
            int f443;

            public int describeContents() {
                return 0;
            }

            C0045(Parcel parcel) {
                this.f443 = parcel.readInt();
                this.f440 = parcel.readInt();
                this.f442 = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f441 = new int[readInt];
                    parcel.readIntArray(this.f441);
                }
            }

            C0045() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f443);
                parcel.writeInt(this.f440);
                parcel.writeInt(this.f442 ? 1 : 0);
                int[] iArr = this.f441;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f441);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.f443);
                sb.append(", mGapDir=");
                sb.append(this.f440);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f442);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f441));
                sb.append('}');
                return sb.toString();
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$if  reason: invalid class name */
    public static class Cif implements Parcelable {
        public static final Parcelable.Creator<Cif> CREATOR = new Parcelable.Creator<Cif>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Cif[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Cif(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        int f428;

        /* renamed from: Ɩ  reason: contains not printable characters */
        List<C0044.C0045> f429;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f430;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f431;

        /* renamed from: ɹ  reason: contains not printable characters */
        int[] f432;

        /* renamed from: Ι  reason: contains not printable characters */
        int f433;

        /* renamed from: ι  reason: contains not printable characters */
        int[] f434;

        /* renamed from: І  reason: contains not printable characters */
        boolean f435;

        /* renamed from: і  reason: contains not printable characters */
        boolean f436;

        /* renamed from: Ӏ  reason: contains not printable characters */
        boolean f437;

        public final int describeContents() {
            return 0;
        }

        public Cif() {
        }

        Cif(Parcel parcel) {
            this.f433 = parcel.readInt();
            this.f428 = parcel.readInt();
            this.f431 = parcel.readInt();
            int i = this.f431;
            if (i > 0) {
                this.f434 = new int[i];
                parcel.readIntArray(this.f434);
            }
            this.f430 = parcel.readInt();
            int i2 = this.f430;
            if (i2 > 0) {
                this.f432 = new int[i2];
                parcel.readIntArray(this.f432);
            }
            boolean z = false;
            this.f437 = parcel.readInt() == 1;
            this.f436 = parcel.readInt() == 1;
            this.f435 = parcel.readInt() == 1 ? true : z;
            this.f429 = parcel.readArrayList(C0044.C0045.class.getClassLoader());
        }

        public Cif(Cif ifVar) {
            this.f431 = ifVar.f431;
            this.f433 = ifVar.f433;
            this.f428 = ifVar.f428;
            this.f434 = ifVar.f434;
            this.f430 = ifVar.f430;
            this.f432 = ifVar.f432;
            this.f437 = ifVar.f437;
            this.f436 = ifVar.f436;
            this.f435 = ifVar.f435;
            this.f429 = ifVar.f429;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f433);
            parcel.writeInt(this.f428);
            parcel.writeInt(this.f431);
            if (this.f431 > 0) {
                parcel.writeIntArray(this.f434);
            }
            parcel.writeInt(this.f430);
            if (this.f430 > 0) {
                parcel.writeIntArray(this.f432);
            }
            parcel.writeInt(this.f437 ? 1 : 0);
            parcel.writeInt(this.f436 ? 1 : 0);
            parcel.writeInt(this.f435 ? 1 : 0);
            parcel.writeList(this.f429);
        }
    }

    class If {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f421;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f422;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f423;

        /* renamed from: ɹ  reason: contains not printable characters */
        int[] f424;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f425;

        /* renamed from: ι  reason: contains not printable characters */
        int f426;

        If() {
            m584();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m584() {
            this.f423 = -1;
            this.f426 = RecyclerView.UNDEFINED_DURATION;
            this.f422 = false;
            this.f425 = false;
            this.f421 = false;
            int[] iArr = this.f424;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m514(int i) {
        if (this.f409 == null) {
            super.m440((String) null);
        }
        if (i != this.f411) {
            C0044 r0 = this.f406;
            if (r0.f439 != null) {
                Arrays.fill(r0.f439, -1);
            }
            r0.f438 = null;
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
            this.f411 = i;
            this.f399 = new BitSet(this.f411);
            this.f401 = new C0046[this.f411];
            for (int i2 = 0; i2 < this.f411; i2++) {
                this.f401[i2] = new C0046(i2);
            }
            if (this.f349 != null) {
                this.f349.requestLayout();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m527(boolean z) {
        if (this.f409 == null) {
            super.m440((String) null);
        }
        Cif ifVar = this.f409;
        if (!(ifVar == null || ifVar.f437 == z)) {
            this.f409.f437 = z;
        }
        this.f410 = z;
        if (this.f349 != null) {
            this.f349.requestLayout();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m547(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        int paddingLeft = (this.f349 != null ? this.f349.getPaddingLeft() : 0) + (this.f349 != null ? this.f349.getPaddingRight() : 0);
        int paddingTop = this.f349 != null ? this.f349.getPaddingTop() : 0;
        if (this.f349 != null) {
            i5 = this.f349.getPaddingBottom();
        }
        int i6 = paddingTop + i5;
        if (this.f417 == 1) {
            i4 = m380(i2, rect.height() + i6, C0293.m4182(this.f349));
            i3 = m380(i, (this.f405 * this.f411) + paddingLeft, C0293.m4222(this.f349));
        } else {
            i3 = m380(i, rect.width() + paddingLeft, C0293.m4222(this.f349));
            i4 = m380(i2, (this.f405 * this.f411) + i6, C0293.m4182(this.f349));
        }
        this.f349.setMeasuredDimension(i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0299, code lost:
        if ((o.C0293.m4156(r12.f349) == 1) != r12.f403) goto L_0x029b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04ed A[LOOP:0: B:1:0x0003->B:273:0x04ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017e  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m565(androidx.recyclerview.widget.RecyclerView.AUx r13, androidx.recyclerview.widget.RecyclerView.C0033 r14) {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            r2 = 1
        L_0x0003:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r3 = r12.f416
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r4 = r12.f409
            r5 = -1
            if (r4 != 0) goto L_0x000e
            int r4 = r12.f408
            if (r4 == r5) goto L_0x0023
        L_0x000e:
            boolean r4 = r14.f378
            if (r4 == 0) goto L_0x0018
            int r4 = r14.f375
            int r6 = r14.f374
            int r4 = r4 - r6
            goto L_0x001a
        L_0x0018:
            int r4 = r14.f366
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            r12.m402((androidx.recyclerview.widget.RecyclerView.AUx) r13)
            r3.m584()
            return
        L_0x0023:
            boolean r4 = r3.f421
            if (r4 == 0) goto L_0x0032
            int r4 = r12.f408
            if (r4 != r5) goto L_0x0032
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r4 = r12.f409
            if (r4 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L_0x027e
            r3.m584()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            if (r8 == 0) goto L_0x00d4
            int r8 = r8.f431
            if (r8 <= 0) goto L_0x0096
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            int r8 = r8.f431
            int r9 = r12.f411
            if (r8 != r9) goto L_0x0086
            r8 = 0
        L_0x004c:
            int r9 = r12.f411
            if (r8 >= r9) goto L_0x0096
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r9 = r12.f401
            r9 = r9[r8]
            java.util.ArrayList<android.view.View> r10 = r9.f447
            r10.clear()
            r9.f449 = r7
            r9.f448 = r7
            r9.f446 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r9 = r12.f409
            int[] r9 = r9.f434
            r9 = r9[r8]
            if (r9 == r7) goto L_0x007b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r10 = r12.f409
            boolean r10 = r10.f436
            if (r10 == 0) goto L_0x0074
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6886()
            goto L_0x007a
        L_0x0074:
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6889()
        L_0x007a:
            int r9 = r9 + r10
        L_0x007b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r10 = r12.f401
            r10 = r10[r8]
            r10.f449 = r9
            r10.f448 = r9
            int r8 = r8 + 1
            goto L_0x004c
        L_0x0086:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            r8.f434 = r6
            r8.f431 = r0
            r8.f430 = r0
            r8.f432 = r6
            r8.f429 = r6
            int r9 = r8.f428
            r8.f433 = r9
        L_0x0096:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            boolean r8 = r8.f435
            r12.f403 = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            boolean r8 = r8.f437
            r12.m527((boolean) r8)
            r12.m532()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            int r8 = r8.f433
            if (r8 == r5) goto L_0x00b9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            int r8 = r8.f433
            r12.f408 = r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            boolean r8 = r8.f436
            r3.f422 = r8
            goto L_0x00bd
        L_0x00b9:
            boolean r8 = r12.f419
            r3.f422 = r8
        L_0x00bd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            int r8 = r8.f430
            if (r8 <= r1) goto L_0x00db
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r8 = r12.f406
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r9 = r12.f409
            int[] r9 = r9.f432
            r8.f439 = r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r8 = r12.f406
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r9 = r12.f409
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$ı$ı> r9 = r9.f429
            r8.f438 = r9
            goto L_0x00db
        L_0x00d4:
            r12.m532()
            boolean r8 = r12.f419
            r3.f422 = r8
        L_0x00db:
            boolean r8 = r14.f378
            if (r8 != 0) goto L_0x0219
            int r8 = r12.f408
            if (r8 != r5) goto L_0x00e5
            goto L_0x0219
        L_0x00e5:
            if (r8 < 0) goto L_0x0215
            boolean r9 = r14.f378
            if (r9 == 0) goto L_0x00f1
            int r9 = r14.f375
            int r10 = r14.f374
            int r9 = r9 - r10
            goto L_0x00f3
        L_0x00f1:
            int r9 = r14.f366
        L_0x00f3:
            if (r8 < r9) goto L_0x00f7
            goto L_0x0215
        L_0x00f7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            if (r8 == 0) goto L_0x010e
            int r8 = r8.f433
            if (r8 == r5) goto L_0x010e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            int r8 = r8.f431
            if (r8 > 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            r3.f426 = r7
            int r8 = r12.f408
            r3.f423 = r8
            goto L_0x0213
        L_0x010e:
            int r8 = r12.f408
            android.view.View r8 = r12.m411((int) r8)
            if (r8 == 0) goto L_0x01c9
            boolean r9 = r12.f419
            if (r9 == 0) goto L_0x0134
            int r9 = r12.m421()
            if (r9 != 0) goto L_0x0121
            goto L_0x013a
        L_0x0121:
            int r9 = r9 + -1
            android.view.View r9 = r12.m432((int) r9)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r9 = (androidx.recyclerview.widget.RecyclerView.C0038) r9
            androidx.recyclerview.widget.RecyclerView$con r9 = r9.f388
            int r9 = r9.getLayoutPosition()
            goto L_0x014c
        L_0x0134:
            int r9 = r12.m421()
            if (r9 != 0) goto L_0x013c
        L_0x013a:
            r9 = 0
            goto L_0x014c
        L_0x013c:
            android.view.View r9 = r12.m432((int) r0)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r9 = (androidx.recyclerview.widget.RecyclerView.C0038) r9
            androidx.recyclerview.widget.RecyclerView$con r9 = r9.f388
            int r9 = r9.getLayoutPosition()
        L_0x014c:
            r3.f423 = r9
            int r9 = r12.f400
            if (r9 == r7) goto L_0x017e
            boolean r9 = r3.f422
            if (r9 == 0) goto L_0x016a
            o.ȷΙ r9 = r12.f398
            int r9 = r9.m6886()
            int r10 = r12.f400
            int r9 = r9 - r10
            o.ȷΙ r10 = r12.f398
            int r8 = r10.m6895(r8)
            int r9 = r9 - r8
            r3.f426 = r9
            goto L_0x0213
        L_0x016a:
            o.ȷΙ r9 = r12.f398
            int r9 = r9.m6889()
            int r10 = r12.f400
            int r9 = r9 + r10
            o.ȷΙ r10 = r12.f398
            int r8 = r10.m6897(r8)
            int r9 = r9 - r8
            r3.f426 = r9
            goto L_0x0213
        L_0x017e:
            o.ȷΙ r9 = r12.f398
            int r9 = r9.m6892((android.view.View) r8)
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6891()
            if (r9 <= r10) goto L_0x01a1
            boolean r8 = r3.f422
            if (r8 == 0) goto L_0x0197
            o.ȷΙ r8 = r12.f398
            int r8 = r8.m6886()
            goto L_0x019d
        L_0x0197:
            o.ȷΙ r8 = r12.f398
            int r8 = r8.m6889()
        L_0x019d:
            r3.f426 = r8
            goto L_0x0213
        L_0x01a1:
            o.ȷΙ r9 = r12.f398
            int r9 = r9.m6897(r8)
            o.ȷΙ r10 = r12.f398
            int r10 = r10.m6889()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x01b4
            int r8 = -r9
            r3.f426 = r8
            goto L_0x0213
        L_0x01b4:
            o.ȷΙ r9 = r12.f398
            int r9 = r9.m6886()
            o.ȷΙ r10 = r12.f398
            int r8 = r10.m6895(r8)
            int r9 = r9 - r8
            if (r9 >= 0) goto L_0x01c6
            r3.f426 = r9
            goto L_0x0213
        L_0x01c6:
            r3.f426 = r7
            goto L_0x0213
        L_0x01c9:
            int r8 = r12.f408
            r3.f423 = r8
            int r8 = r12.f400
            if (r8 != r7) goto L_0x01f6
            int r8 = r3.f423
            int r8 = r12.m528(r8)
            if (r8 != r1) goto L_0x01db
            r8 = 1
            goto L_0x01dc
        L_0x01db:
            r8 = 0
        L_0x01dc:
            r3.f422 = r8
            boolean r8 = r3.f422
            if (r8 == 0) goto L_0x01eb
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r8 = r8.f398
            int r8 = r8.m6886()
            goto L_0x01f3
        L_0x01eb:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r8 = r8.f398
            int r8 = r8.m6889()
        L_0x01f3:
            r3.f426 = r8
            goto L_0x0211
        L_0x01f6:
            boolean r9 = r3.f422
            if (r9 == 0) goto L_0x0206
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r9 = r9.f398
            int r9 = r9.m6886()
            int r9 = r9 - r8
            r3.f426 = r9
            goto L_0x0211
        L_0x0206:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r9 = r9.f398
            int r9 = r9.m6889()
            int r9 = r9 + r8
            r3.f426 = r9
        L_0x0211:
            r3.f425 = r1
        L_0x0213:
            r8 = 1
            goto L_0x021a
        L_0x0215:
            r12.f408 = r5
            r12.f400 = r7
        L_0x0219:
            r8 = 0
        L_0x021a:
            if (r8 != 0) goto L_0x027c
            boolean r8 = r12.f402
            if (r8 == 0) goto L_0x024b
            boolean r8 = r14.f378
            if (r8 == 0) goto L_0x022a
            int r8 = r14.f375
            int r9 = r14.f374
            int r8 = r8 - r9
            goto L_0x022c
        L_0x022a:
            int r8 = r14.f366
        L_0x022c:
            int r9 = r12.m421()
            int r9 = r9 - r1
        L_0x0231:
            if (r9 < 0) goto L_0x0277
            android.view.View r10 = r12.m432((int) r9)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r10 = (androidx.recyclerview.widget.RecyclerView.C0038) r10
            androidx.recyclerview.widget.RecyclerView$con r10 = r10.f388
            int r10 = r10.getLayoutPosition()
            if (r10 < 0) goto L_0x0248
            if (r10 >= r8) goto L_0x0248
            goto L_0x0278
        L_0x0248:
            int r9 = r9 + -1
            goto L_0x0231
        L_0x024b:
            boolean r8 = r14.f378
            if (r8 == 0) goto L_0x0255
            int r8 = r14.f375
            int r9 = r14.f374
            int r8 = r8 - r9
            goto L_0x0257
        L_0x0255:
            int r8 = r14.f366
        L_0x0257:
            int r9 = r12.m421()
            r10 = 0
        L_0x025c:
            if (r10 >= r9) goto L_0x0277
            android.view.View r11 = r12.m432((int) r10)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ι r11 = (androidx.recyclerview.widget.RecyclerView.C0038) r11
            androidx.recyclerview.widget.RecyclerView$con r11 = r11.f388
            int r11 = r11.getLayoutPosition()
            if (r11 < 0) goto L_0x0274
            if (r11 >= r8) goto L_0x0274
            r10 = r11
            goto L_0x0278
        L_0x0274:
            int r10 = r10 + 1
            goto L_0x025c
        L_0x0277:
            r10 = 0
        L_0x0278:
            r3.f423 = r10
            r3.f426 = r7
        L_0x027c:
            r3.f421 = r1
        L_0x027e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r8 = r12.f409
            if (r8 != 0) goto L_0x02aa
            int r8 = r12.f408
            if (r8 != r5) goto L_0x02aa
            boolean r8 = r3.f422
            boolean r9 = r12.f402
            if (r8 != r9) goto L_0x029b
            androidx.recyclerview.widget.RecyclerView r8 = r12.f349
            int r8 = o.C0293.m4156(r8)
            if (r8 != r1) goto L_0x0296
            r8 = 1
            goto L_0x0297
        L_0x0296:
            r8 = 0
        L_0x0297:
            boolean r9 = r12.f403
            if (r8 == r9) goto L_0x02aa
        L_0x029b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ı r8 = r12.f406
            int[] r9 = r8.f439
            if (r9 == 0) goto L_0x02a6
            int[] r9 = r8.f439
            java.util.Arrays.fill(r9, r5)
        L_0x02a6:
            r8.f438 = r6
            r3.f425 = r1
        L_0x02aa:
            int r6 = r12.m421()
            if (r6 <= 0) goto L_0x037a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$if r6 = r12.f409
            if (r6 == 0) goto L_0x02b8
            int r6 = r6.f431
            if (r6 > 0) goto L_0x037a
        L_0x02b8:
            boolean r6 = r3.f425
            if (r6 == 0) goto L_0x02e1
            r4 = 0
        L_0x02bd:
            int r6 = r12.f411
            if (r4 >= r6) goto L_0x037a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r6 = r12.f401
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.f447
            r8.clear()
            r6.f449 = r7
            r6.f448 = r7
            r6.f446 = r0
            int r6 = r3.f426
            if (r6 == r7) goto L_0x02de
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r6 = r12.f401
            r6 = r6[r4]
            int r8 = r3.f426
            r6.f449 = r8
            r6.f448 = r8
        L_0x02de:
            int r4 = r4 + 1
            goto L_0x02bd
        L_0x02e1:
            if (r4 != 0) goto L_0x030b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r4 = r12.f416
            int[] r4 = r4.f424
            if (r4 != 0) goto L_0x02ea
            goto L_0x030b
        L_0x02ea:
            r4 = 0
        L_0x02eb:
            int r6 = r12.f411
            if (r4 >= r6) goto L_0x037a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r6 = r12.f401
            r6 = r6[r4]
            java.util.ArrayList<android.view.View> r8 = r6.f447
            r8.clear()
            r6.f449 = r7
            r6.f448 = r7
            r6.f446 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r8 = r12.f416
            int[] r8 = r8.f424
            r8 = r8[r4]
            r6.f449 = r8
            r6.f448 = r8
            int r4 = r4 + 1
            goto L_0x02eb
        L_0x030b:
            r4 = 0
        L_0x030c:
            int r6 = r12.f411
            if (r4 >= r6) goto L_0x0353
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r6 = r12.f401
            r6 = r6[r4]
            boolean r8 = r12.f419
            int r9 = r3.f426
            if (r8 == 0) goto L_0x031f
            int r10 = r6.m594((int) r7)
            goto L_0x0323
        L_0x031f:
            int r10 = r6.m600(r7)
        L_0x0323:
            java.util.ArrayList<android.view.View> r11 = r6.f447
            r11.clear()
            r6.f449 = r7
            r6.f448 = r7
            r6.f446 = r0
            if (r10 == r7) goto L_0x0350
            if (r8 == 0) goto L_0x033c
            androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r11 = r11.f398
            int r11 = r11.m6886()
            if (r10 < r11) goto L_0x0350
        L_0x033c:
            if (r8 != 0) goto L_0x0349
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            o.ȷΙ r8 = r8.f398
            int r8 = r8.m6889()
            if (r10 <= r8) goto L_0x0349
            goto L_0x0350
        L_0x0349:
            if (r9 == r7) goto L_0x034c
            int r10 = r10 + r9
        L_0x034c:
            r6.f448 = r10
            r6.f449 = r10
        L_0x0350:
            int r4 = r4 + 1
            goto L_0x030c
        L_0x0353:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r4 = r12.f416
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r6 = r12.f401
            int r8 = r6.length
            int[] r9 = r4.f424
            if (r9 == 0) goto L_0x0361
            int[] r9 = r4.f424
            int r9 = r9.length
            if (r9 >= r8) goto L_0x036a
        L_0x0361:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ[] r9 = r9.f401
            int r9 = r9.length
            int[] r9 = new int[r9]
            r4.f424 = r9
        L_0x036a:
            r9 = 0
        L_0x036b:
            if (r9 >= r8) goto L_0x037a
            int[] r10 = r4.f424
            r11 = r6[r9]
            int r11 = r11.m600(r7)
            r10[r9] = r11
            int r9 = r9 + 1
            goto L_0x036b
        L_0x037a:
            r12.m449((androidx.recyclerview.widget.RecyclerView.AUx) r13)
            o.ǃɺ r4 = r12.f414
            r4.f5791 = r0
            o.ȷΙ r4 = r12.f404
            int r4 = r4.m6891()
            int r6 = r12.f411
            int r6 = r4 / r6
            r12.f405 = r6
            o.ȷΙ r6 = r12.f404
            int r6 = r6.m6888()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r4 = r3.f423
            r12.m515((int) r4, (androidx.recyclerview.widget.RecyclerView.C0033) r14)
            boolean r4 = r3.f422
            if (r4 == 0) goto L_0x03bb
            r12.m534((int) r5)
            o.ǃɺ r4 = r12.f414
            r12.m523(r13, r4, r14)
            r12.m534((int) r1)
            o.ǃɺ r4 = r12.f414
            int r5 = r3.f423
            o.ǃɺ r6 = r12.f414
            int r6 = r6.f5792
            int r5 = r5 + r6
            r4.f5789 = r5
            o.ǃɺ r4 = r12.f414
            r12.m523(r13, r4, r14)
            goto L_0x03d6
        L_0x03bb:
            r12.m534((int) r1)
            o.ǃɺ r4 = r12.f414
            r12.m523(r13, r4, r14)
            r12.m534((int) r5)
            o.ǃɺ r4 = r12.f414
            int r5 = r3.f423
            o.ǃɺ r6 = r12.f414
            int r6 = r6.f5792
            int r5 = r5 + r6
            r4.f5789 = r5
            o.ǃɺ r4 = r12.f414
            r12.m523(r13, r4, r14)
        L_0x03d6:
            o.ȷΙ r4 = r12.f404
            int r4 = r4.m6888()
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 == r5) goto L_0x048b
            r4 = 0
            int r5 = r12.m421()
            r4 = 0
            r6 = 0
        L_0x03e7:
            if (r4 >= r5) goto L_0x0402
            android.view.View r8 = r12.m432((int) r4)
            o.ȷΙ r9 = r12.f404
            int r9 = r9.m6892((android.view.View) r8)
            float r9 = (float) r9
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x03ff
            r8.getLayoutParams()
            float r6 = java.lang.Math.max(r6, r9)
        L_0x03ff:
            int r4 = r4 + 1
            goto L_0x03e7
        L_0x0402:
            int r4 = r12.f405
            int r8 = r12.f411
            float r8 = (float) r8
            float r6 = r6 * r8
            int r6 = java.lang.Math.round(r6)
            o.ȷΙ r8 = r12.f404
            int r8 = r8.m6888()
            if (r8 != r7) goto L_0x041f
            o.ȷΙ r7 = r12.f404
            int r7 = r7.m6891()
            int r6 = java.lang.Math.min(r6, r7)
        L_0x041f:
            int r7 = r12.f411
            int r7 = r6 / r7
            r12.f405 = r7
            o.ȷΙ r7 = r12.f404
            int r7 = r7.m6888()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            int r6 = r12.f405
            if (r6 == r4) goto L_0x048b
            r6 = 0
        L_0x0433:
            if (r6 >= r5) goto L_0x048b
            android.view.View r7 = r12.m432((int) r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ɩ r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0047) r8
            androidx.recyclerview.widget.RecyclerView r9 = r12.f349
            int r9 = o.C0293.m4156(r9)
            if (r9 != r1) goto L_0x0449
            r9 = 1
            goto L_0x044a
        L_0x0449:
            r9 = 0
        L_0x044a:
            if (r9 == 0) goto L_0x046d
            int r9 = r12.f417
            if (r9 != r1) goto L_0x046d
            int r9 = r12.f411
            int r9 = r9 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r10 = r8.f450
            int r10 = r10.f444
            int r9 = r9 - r10
            int r9 = -r9
            int r10 = r12.f405
            int r9 = r9 * r10
            int r10 = r12.f411
            int r10 = r10 - r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r8 = r8.f450
            int r8 = r8.f444
            int r10 = r10 - r8
            int r8 = -r10
            int r8 = r8 * r4
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0488
        L_0x046d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r9 = r8.f450
            int r9 = r9.f444
            int r10 = r12.f405
            int r9 = r9 * r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$ǃ r8 = r8.f450
            int r8 = r8.f444
            int r8 = r8 * r4
            int r10 = r12.f417
            if (r10 != r1) goto L_0x0484
            int r9 = r9 - r8
            r7.offsetLeftAndRight(r9)
            goto L_0x0488
        L_0x0484:
            int r9 = r9 - r8
            r7.offsetTopAndBottom(r9)
        L_0x0488:
            int r6 = r6 + 1
            goto L_0x0433
        L_0x048b:
            int r4 = r12.m421()
            if (r4 <= 0) goto L_0x04a2
            boolean r4 = r12.f419
            if (r4 == 0) goto L_0x049c
            r12.m520((androidx.recyclerview.widget.RecyclerView.AUx) r13, (androidx.recyclerview.widget.RecyclerView.C0033) r14, (boolean) r1)
            r12.m537((androidx.recyclerview.widget.RecyclerView.AUx) r13, (androidx.recyclerview.widget.RecyclerView.C0033) r14, (boolean) r0)
            goto L_0x04a2
        L_0x049c:
            r12.m537((androidx.recyclerview.widget.RecyclerView.AUx) r13, (androidx.recyclerview.widget.RecyclerView.C0033) r14, (boolean) r1)
            r12.m520((androidx.recyclerview.widget.RecyclerView.AUx) r13, (androidx.recyclerview.widget.RecyclerView.C0033) r14, (boolean) r0)
        L_0x04a2:
            if (r2 == 0) goto L_0x04d0
            boolean r2 = r14.f378
            if (r2 != 0) goto L_0x04d0
            int r2 = r12.f407
            if (r2 == 0) goto L_0x04ba
            int r2 = r12.m421()
            if (r2 <= 0) goto L_0x04ba
            android.view.View r2 = r12.m530()
            if (r2 == 0) goto L_0x04ba
            r2 = 1
            goto L_0x04bb
        L_0x04ba:
            r2 = 0
        L_0x04bb:
            if (r2 == 0) goto L_0x04d0
            java.lang.Runnable r2 = r12.f418
            androidx.recyclerview.widget.RecyclerView r4 = r12.f349
            if (r4 == 0) goto L_0x04c8
            androidx.recyclerview.widget.RecyclerView r4 = r12.f349
            r4.removeCallbacks(r2)
        L_0x04c8:
            boolean r2 = r12.m582()
            if (r2 == 0) goto L_0x04d0
            r2 = 1
            goto L_0x04d1
        L_0x04d0:
            r2 = 0
        L_0x04d1:
            boolean r4 = r14.f378
            if (r4 == 0) goto L_0x04da
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r4 = r12.f416
            r4.m584()
        L_0x04da:
            boolean r3 = r3.f422
            r12.f402 = r3
            androidx.recyclerview.widget.RecyclerView r3 = r12.f349
            int r3 = o.C0293.m4156(r3)
            if (r3 != r1) goto L_0x04e8
            r3 = 1
            goto L_0x04e9
        L_0x04e8:
            r3 = 0
        L_0x04e9:
            r12.f403 = r3
            if (r2 == 0) goto L_0x04f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$If r2 = r12.f416
            r2.m584()
            r2 = 0
            goto L_0x0003
        L_0x04f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m565(androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m538(C0046 r5, int i, int i2) {
        int i3;
        int i4;
        int i5 = r5.f446;
        if (i == -1) {
            if (r5.f449 != Integer.MIN_VALUE) {
                i4 = r5.f449;
            } else {
                r5.m598();
                i4 = r5.f449;
            }
            if (i4 + i5 <= i2) {
                this.f399.set(r5.f444, false);
                return;
            }
            return;
        }
        if (r5.f448 != Integer.MIN_VALUE) {
            i3 = r5.f448;
        } else {
            r5.m601();
            i3 = r5.f448;
        }
        if (i3 - i5 >= i2) {
            this.f399.set(r5.f444, false);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m524(int i, RecyclerView.C0033 r6) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int r2 = m421();
            if (r2 != 0) {
                i3 = ((RecyclerView.C0038) m432(r2 - 1).getLayoutParams()).f388.getLayoutPosition();
            }
            i2 = 1;
        } else {
            i2 = -1;
            if (m421() != 0) {
                i3 = ((RecyclerView.C0038) m432(0).getLayoutParams()).f388.getLayoutPosition();
            }
        }
        this.f414.f5791 = true;
        m515(i3, r6);
        m534(i2);
        C0911 r62 = this.f414;
        r62.f5789 = i3 + r62.f5792;
        this.f414.f5788 = Math.abs(i);
    }
}
