package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.C0293;
import o.C0520;
import o.C0878;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: ı  reason: contains not printable characters */
    final SparseIntArray f267 = new SparseIntArray();

    /* renamed from: ǀ  reason: contains not printable characters */
    private int[] f268;

    /* renamed from: ǃ  reason: contains not printable characters */
    final SparseIntArray f269 = new SparseIntArray();

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean f270 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f271 = -1;

    /* renamed from: ɺ  reason: contains not printable characters */
    private View[] f272;

    /* renamed from: ɼ  reason: contains not printable characters */
    private C0022 f273 = new C0021();

    /* renamed from: Ι  reason: contains not printable characters */
    final Rect f274 = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$ɩ  reason: contains not printable characters */
    public static abstract class C0022 {

        /* renamed from: ı  reason: contains not printable characters */
        final SparseIntArray f277 = new SparseIntArray();

        /* renamed from: ǃ  reason: contains not printable characters */
        final SparseIntArray f278 = new SparseIntArray();

        /* renamed from: ǃ  reason: contains not printable characters */
        public static int m262(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public int m263(int i, int i2) {
            if (1 == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i3++;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = 1;
                }
            }
            if (i3 + 1 <= i2) {
                return i3;
            }
            return 0;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m227(m381(context, attributeSet, i, i2).f361);
    }

    public GridLayoutManager() {
        super(1);
        m227(3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m245(boolean z) {
        if (!z) {
            super.m295(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m233(RecyclerView.AUx aUx, RecyclerView.C0033 r4) {
        if (this.f290 == 0) {
            return this.f271;
        }
        if ((r4.f378 ? r4.f375 - r4.f374 : r4.f366) <= 0) {
            return 0;
        }
        return m228(aUx, r4, (r4.f378 ? r4.f375 - r4.f374 : r4.f366) - 1) + 1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m258(RecyclerView.AUx aUx, RecyclerView.C0033 r5) {
        if (this.f290 == 1) {
            return this.f271;
        }
        if ((r5.f378 ? r5.f375 - r5.f374 : r5.f366) <= 0) {
            return 0;
        }
        return m228(aUx, r5, (r5.f378 ? r5.f375 - r5.f374 : r5.f366) - 1) + 1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m243(RecyclerView.AUx aUx, RecyclerView.C0033 r9, View view, C0520 r11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof If)) {
            super.m437(view, r11);
            return;
        }
        If ifR = (If) layoutParams;
        int r8 = m228(aUx, r9, ifR.f388.getLayoutPosition());
        if (this.f290 == 0) {
            r11.m5023((Object) C0520.If.m5072(ifR.f275, ifR.f276, r8, 1, false, false));
            return;
        }
        r11.m5023((Object) C0520.If.m5072(r8, 1, ifR.f275, ifR.f276, false, false));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m256(RecyclerView.C0033 r1) {
        super.m310(r1);
        this.f270 = false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m236(int i, int i2) {
        this.f273.f277.clear();
        this.f273.f278.clear();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m248() {
        this.f273.f277.clear();
        this.f273.f278.clear();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m242(int i, int i2) {
        this.f273.f277.clear();
        this.f273.f278.clear();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m254(int i, int i2) {
        this.f273.f277.clear();
        this.f273.f278.clear();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m249(int i, int i2) {
        this.f273.f277.clear();
        this.f273.f278.clear();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final RecyclerView.C0038 m253() {
        if (this.f290 == 0) {
            return new If(-2, -1);
        }
        return new If(-1, -2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final RecyclerView.C0038 m235(Context context, AttributeSet attributeSet) {
        return new If(context, attributeSet);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final RecyclerView.C0038 m260(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new If((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new If(layoutParams);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m238(RecyclerView.C0038 r1) {
        return r1 instanceof If;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m237(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f268 == null) {
            super.m398(rect, i, i2);
        }
        int i5 = 0;
        int paddingLeft = (this.f349 != null ? this.f349.getPaddingLeft() : 0) + (this.f349 != null ? this.f349.getPaddingRight() : 0);
        int paddingTop = this.f349 != null ? this.f349.getPaddingTop() : 0;
        if (this.f349 != null) {
            i5 = this.f349.getPaddingBottom();
        }
        int i6 = paddingTop + i5;
        if (this.f290 == 1) {
            i4 = m380(i2, rect.height() + i6, C0293.m4182(this.f349));
            int[] iArr = this.f268;
            i3 = m380(i, iArr[iArr.length - 1] + paddingLeft, C0293.m4222(this.f349));
        } else {
            i3 = m380(i, rect.width() + paddingLeft, C0293.m4222(this.f349));
            int[] iArr2 = this.f268;
            i4 = m380(i2, iArr2[iArr2.length - 1] + i6, C0293.m4182(this.f349));
        }
        this.f349.setMeasuredDimension(i3, i4);
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m232(int i) {
        this.f268 = m225(this.f268, this.f271, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int[] m225(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: І  reason: contains not printable characters */
    private int m231(int i, int i2) {
        boolean z = true;
        if (this.f290 == 1) {
            if (C0293.m4156(this.f349) != 1) {
                z = false;
            }
            if (z) {
                int[] iArr = this.f268;
                int i3 = this.f271;
                return iArr[i3 - i] - iArr[(i3 - i) - i2];
            }
        }
        int[] iArr2 = this.f268;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m251(RecyclerView.AUx aUx, RecyclerView.C0033 r6, LinearLayoutManager.If ifR, int i) {
        super.m302(aUx, r6, ifR, i);
        m223();
        if ((r6.f378 ? r6.f375 - r6.f374 : r6.f366) > 0 && !r6.f378) {
            boolean z = i == 1;
            int r1 = m222(aUx, r6, ifR.f295);
            if (z) {
                while (r1 > 0 && ifR.f295 > 0) {
                    ifR.f295--;
                    r1 = m222(aUx, r6, ifR.f295);
                }
            } else {
                int i2 = (r6.f378 ? r6.f375 - r6.f374 : r6.f366) - 1;
                int i3 = ifR.f295;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    int r3 = m222(aUx, r6, i4);
                    if (r3 <= r1) {
                        break;
                    }
                    i3 = i4;
                    r1 = r3;
                }
                ifR.f295 = i3;
            }
        }
        View[] viewArr = this.f272;
        if (viewArr == null || viewArr.length != this.f271) {
            this.f272 = new View[this.f271];
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m257(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r5) {
        m223();
        View[] viewArr = this.f272;
        if (viewArr == null || viewArr.length != this.f271) {
            this.f272 = new View[this.f271];
        }
        return super.m314(i, aUx, r5);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m239(int i, RecyclerView.AUx aUx, RecyclerView.C0033 r5) {
        m223();
        View[] viewArr = this.f272;
        if (viewArr == null || viewArr.length != this.f271) {
            this.f272 = new View[this.f271];
        }
        return super.m289(i, aUx, r5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final View m252(RecyclerView.AUx aUx, RecyclerView.C0033 r9, int i, int i2, int i3) {
        m321();
        int r0 = this.f291.m6889();
        int r1 = this.f291.m6886();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View r5 = m432(i);
            int layoutPosition = ((RecyclerView.C0038) r5.getLayoutParams()).f388.getLayoutPosition();
            if (layoutPosition >= 0 && layoutPosition < i3 && m222(aUx, r9, layoutPosition) == 0) {
                if (((RecyclerView.C0038) r5.getLayoutParams()).f388.isRemoved()) {
                    if (view2 == null) {
                        view2 = r5;
                    }
                } else if (this.f291.m6897(r5) < r1 && this.f291.m6895(r5) >= r0) {
                    return r5;
                } else {
                    if (view == null) {
                        view = r5;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m244(RecyclerView.C0033 r7, LinearLayoutManager.Cif ifVar, RecyclerView.IF.C0027 r9) {
        boolean z;
        int i = this.f271;
        int i2 = 0;
        while (i2 < this.f271) {
            if (ifVar.f303 >= 0) {
                if (ifVar.f303 < (r7.f378 ? r7.f375 - r7.f374 : r7.f366)) {
                    z = true;
                    if (z && i > 0) {
                        r9.m471(ifVar.f303, Math.max(0, ifVar.f300));
                        i--;
                        ifVar.f303 += ifVar.f301;
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            z = false;
            if (z) {
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0093 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m255(androidx.recyclerview.widget.RecyclerView.AUx r18, androidx.recyclerview.widget.RecyclerView.C0033 r19, androidx.recyclerview.widget.LinearLayoutManager.Cif r20, androidx.recyclerview.widget.LinearLayoutManager.C0024 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            o.ȷΙ r5 = r0.f291
            int r5 = r5.m6899()
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 1
            r8 = 0
            if (r5 == r6) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            o.ǂ r10 = r0.f345
            if (r10 == 0) goto L_0x002e
            o.ǂ r10 = r0.f345
            o.ǂ$ǃ r11 = r10.f5664
            int r11 = r11.m6559()
            java.util.List<android.view.View> r10 = r10.f5662
            int r10 = r10.size()
            int r10 = r11 - r10
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r10 <= 0) goto L_0x0038
            int[] r10 = r0.f268
            int r11 = r0.f271
            r10 = r10[r11]
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            r17.m223()
        L_0x003e:
            int r11 = r3.f301
            if (r11 != r7) goto L_0x0044
            r11 = 1
            goto L_0x0045
        L_0x0044:
            r11 = 0
        L_0x0045:
            int r12 = r0.f271
            if (r11 != 0) goto L_0x0056
            int r12 = r3.f303
            int r12 = r0.m222((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r12)
            int r13 = r3.f303
            int r13 = r0.m224((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r13)
            int r12 = r12 + r13
        L_0x0056:
            r13 = r12
            r12 = 0
        L_0x0058:
            int r14 = r0.f271
            if (r12 >= r14) goto L_0x00be
            int r14 = r3.f303
            if (r14 < 0) goto L_0x0072
            int r14 = r3.f303
            boolean r15 = r2.f378
            if (r15 == 0) goto L_0x006c
            int r15 = r2.f375
            int r6 = r2.f374
            int r15 = r15 - r6
            goto L_0x006e
        L_0x006c:
            int r15 = r2.f366
        L_0x006e:
            if (r14 >= r15) goto L_0x0072
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 == 0) goto L_0x00be
            if (r13 <= 0) goto L_0x00be
            int r6 = r3.f303
            int r14 = r0.m224((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r6)
            int r15 = r0.f271
            if (r14 > r15) goto L_0x0093
            int r13 = r13 - r14
            if (r13 < 0) goto L_0x00be
            android.view.View r6 = r3.m327(r1)
            if (r6 == 0) goto L_0x00be
            android.view.View[] r14 = r0.f272
            r14[r12] = r6
            int r12 = r12 + 1
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0058
        L_0x0093:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Item at position "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = " requires "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " spans but GridLayoutManager has only "
            r2.append(r3)
            int r3 = r0.f271
            r2.append(r3)
            java.lang.String r3 = " spans."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00be:
            if (r12 != 0) goto L_0x00c3
            r4.f316 = r7
            return
        L_0x00c3:
            r6 = 0
            r0.m226((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r12, (boolean) r11)
            r1 = 0
            r2 = 0
        L_0x00c9:
            if (r1 >= r12) goto L_0x0123
            android.view.View[] r13 = r0.f272
            r13 = r13[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$con> r14 = r3.f305
            if (r14 != 0) goto L_0x00dd
            if (r11 == 0) goto L_0x00d9
            r0.m427((android.view.View) r13)
            goto L_0x00e6
        L_0x00d9:
            r0.m448((android.view.View) r13)
            goto L_0x00e6
        L_0x00dd:
            if (r11 == 0) goto L_0x00e3
            r0.m399((android.view.View) r13)
            goto L_0x00e6
        L_0x00e3:
            r0.m416((android.view.View) r13)
        L_0x00e6:
            android.graphics.Rect r14 = r0.f274
            androidx.recyclerview.widget.RecyclerView r15 = r0.f349
            if (r15 != 0) goto L_0x00f0
            r14.set(r8, r8, r8, r8)
            goto L_0x00f9
        L_0x00f0:
            androidx.recyclerview.widget.RecyclerView r15 = r0.f349
            android.graphics.Rect r15 = r15.getItemDecorInsetsForChild(r13)
            r14.set(r15)
        L_0x00f9:
            r0.m229((android.view.View) r13, (int) r5, (boolean) r8)
            o.ȷΙ r14 = r0.f291
            int r14 = r14.m6892((android.view.View) r13)
            if (r14 <= r2) goto L_0x0105
            r2 = r14
        L_0x0105:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$If r14 = (androidx.recyclerview.widget.GridLayoutManager.If) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            o.ȷΙ r8 = r0.f291
            int r8 = r8.m6898(r13)
            float r8 = (float) r8
            float r8 = r8 * r15
            int r13 = r14.f276
            float r13 = (float) r13
            float r8 = r8 / r13
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x011f
            r6 = r8
        L_0x011f:
            int r1 = r1 + 1
            r8 = 0
            goto L_0x00c9
        L_0x0123:
            if (r9 == 0) goto L_0x014e
            int r1 = r0.f271
            float r1 = (float) r1
            float r6 = r6 * r1
            int r1 = java.lang.Math.round(r6)
            int r1 = java.lang.Math.max(r1, r10)
            r0.m232(r1)
            r1 = 0
            r2 = 0
        L_0x0137:
            if (r1 >= r12) goto L_0x014e
            android.view.View[] r5 = r0.f272
            r5 = r5[r1]
            r6 = 1073741824(0x40000000, float:2.0)
            r0.m229((android.view.View) r5, (int) r6, (boolean) r7)
            o.ȷΙ r6 = r0.f291
            int r5 = r6.m6892((android.view.View) r5)
            if (r5 <= r2) goto L_0x014b
            r2 = r5
        L_0x014b:
            int r1 = r1 + 1
            goto L_0x0137
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r1 >= r12) goto L_0x01b1
            android.view.View[] r5 = r0.f272
            r5 = r5[r1]
            o.ȷΙ r6 = r0.f291
            int r6 = r6.m6892((android.view.View) r5)
            if (r6 == r2) goto L_0x01ab
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$If r6 = (androidx.recyclerview.widget.GridLayoutManager.If) r6
            android.graphics.Rect r8 = r6.f389
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r6.topMargin
            int r9 = r9 + r10
            int r10 = r6.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r6.leftMargin
            int r10 = r10 + r8
            int r8 = r6.rightMargin
            int r10 = r10 + r8
            int r8 = r6.f275
            int r11 = r6.f276
            int r8 = r0.m231(r8, r11)
            int r11 = r0.f290
            if (r11 != r7) goto L_0x0197
            int r6 = r6.width
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r6 = m385((int) r8, (int) r11, (int) r10, (int) r6, (boolean) r13)
            int r8 = r2 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01a7
        L_0x0197:
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r10 = r2 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r6 = r6.height
            int r8 = m385((int) r8, (int) r11, (int) r9, (int) r6, (boolean) r13)
            r6 = r10
        L_0x01a7:
            r0.m230(r5, r6, r8, r7)
            goto L_0x01ae
        L_0x01ab:
            r11 = 1073741824(0x40000000, float:2.0)
            r13 = 0
        L_0x01ae:
            int r1 = r1 + 1
            goto L_0x014f
        L_0x01b1:
            r13 = 0
            r4.f314 = r2
            int r1 = r0.f290
            r5 = -1
            if (r1 != r7) goto L_0x01ce
            int r1 = r3.f310
            if (r1 != r5) goto L_0x01c6
            int r8 = r3.f299
            int r1 = r8 - r2
            r2 = r8
            r3 = 0
            r8 = r1
            r1 = 0
            goto L_0x01e0
        L_0x01c6:
            int r8 = r3.f299
            int r1 = r8 + r2
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x01e0
        L_0x01ce:
            int r1 = r3.f310
            if (r1 != r5) goto L_0x01d9
            int r8 = r3.f299
            int r1 = r8 - r2
            r3 = r1
            r1 = r8
            goto L_0x01de
        L_0x01d9:
            int r8 = r3.f299
            int r1 = r8 + r2
            r3 = r8
        L_0x01de:
            r2 = 0
            r8 = 0
        L_0x01e0:
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = 0
        L_0x01e4:
            if (r1 >= r12) goto L_0x027c
            android.view.View[] r6 = r0.f272
            r6 = r6[r1]
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$If r9 = (androidx.recyclerview.widget.GridLayoutManager.If) r9
            int r10 = r0.f290
            if (r10 != r7) goto L_0x0240
            androidx.recyclerview.widget.RecyclerView r2 = r0.f349
            int r2 = o.C0293.m4156(r2)
            if (r2 != r7) goto L_0x01fe
            r2 = 1
            goto L_0x01ff
        L_0x01fe:
            r2 = 0
        L_0x01ff:
            if (r2 == 0) goto L_0x0220
            androidx.recyclerview.widget.RecyclerView r2 = r0.f349
            if (r2 == 0) goto L_0x020c
            androidx.recyclerview.widget.RecyclerView r2 = r0.f349
            int r2 = r2.getPaddingLeft()
            goto L_0x020d
        L_0x020c:
            r2 = 0
        L_0x020d:
            int[] r5 = r0.f268
            int r10 = r0.f271
            int r11 = r9.f275
            int r10 = r10 - r11
            r5 = r5[r10]
            int r2 = r2 + r5
            o.ȷΙ r5 = r0.f291
            int r5 = r5.m6898(r6)
            int r5 = r2 - r5
            goto L_0x025a
        L_0x0220:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f349
            if (r2 == 0) goto L_0x022b
            androidx.recyclerview.widget.RecyclerView r2 = r0.f349
            int r2 = r2.getPaddingLeft()
            goto L_0x022c
        L_0x022b:
            r2 = 0
        L_0x022c:
            int[] r5 = r0.f268
            int r10 = r9.f275
            r5 = r5[r10]
            int r2 = r2 + r5
            o.ȷΙ r5 = r0.f291
            int r5 = r5.m6898(r6)
            int r5 = r5 + r2
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x025a
        L_0x0240:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f349
            if (r3 == 0) goto L_0x024b
            androidx.recyclerview.widget.RecyclerView r3 = r0.f349
            int r8 = r3.getPaddingTop()
            goto L_0x024c
        L_0x024b:
            r8 = 0
        L_0x024c:
            int[] r3 = r0.f268
            int r10 = r9.f275
            r3 = r3[r10]
            int r8 = r8 + r3
            o.ȷΙ r3 = r0.f291
            int r3 = r3.m6898(r6)
            int r3 = r3 + r8
        L_0x025a:
            m386((android.view.View) r6, (int) r5, (int) r8, (int) r2, (int) r3)
            androidx.recyclerview.widget.RecyclerView$con r10 = r9.f388
            boolean r10 = r10.isRemoved()
            if (r10 != 0) goto L_0x026d
            androidx.recyclerview.widget.RecyclerView$con r9 = r9.f388
            boolean r9 = r9.isUpdated()
            if (r9 == 0) goto L_0x026f
        L_0x026d:
            r4.f317 = r7
        L_0x026f:
            boolean r9 = r4.f315
            boolean r6 = r6.hasFocusable()
            r6 = r6 | r9
            r4.f315 = r6
            int r1 = r1 + 1
            goto L_0x01e4
        L_0x027c:
            android.view.View[] r1 = r0.f272
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m255(androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ, androidx.recyclerview.widget.LinearLayoutManager$if, androidx.recyclerview.widget.LinearLayoutManager$ɩ):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m229(View view, int i, boolean z) {
        int i2;
        int i3;
        If ifR = (If) view.getLayoutParams();
        Rect rect = ifR.f389;
        int i4 = rect.top + rect.bottom + ifR.topMargin + ifR.bottomMargin;
        int i5 = rect.left + rect.right + ifR.leftMargin + ifR.rightMargin;
        int r1 = m231(ifR.f275, ifR.f276);
        if (this.f290 == 1) {
            i2 = m385(r1, i, i5, ifR.width, false);
            i3 = m385(this.f291.m6891(), this.f343, i4, ifR.height, true);
        } else {
            int r10 = m385(r1, i, i4, ifR.height, false);
            int r7 = m385(this.f291.m6891(), this.f346, i5, ifR.width, true);
            i3 = r10;
            i2 = r7;
        }
        m230(view, i2, i3, z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m230(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.C0038 r0 = (RecyclerView.C0038) view.getLayoutParams();
        if (z) {
            z2 = m450(view, i, i2, r0);
        } else {
            z2 = m441(view, i, i2, r0);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m226(RecyclerView.AUx aUx, RecyclerView.C0033 r6, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f272[i3];
            If ifR = (If) view.getLayoutParams();
            ifR.f276 = m224(aUx, r6, ((RecyclerView.C0038) view.getLayoutParams()).f388.getLayoutPosition());
            ifR.f275 = i4;
            i4 += ifR.f276;
            i3 += i2;
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private void m227(int i) {
        if (i != this.f271) {
            this.f270 = true;
            if (i > 0) {
                this.f271 = i;
                this.f273.f277.clear();
                if (this.f349 != null) {
                    this.f349.requestLayout();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r13 == (r2 > r8)) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0132, code lost:
        if (r13 == (r2 > r5)) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0185 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0186 A[RETURN] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View m241(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.AUx r25, androidx.recyclerview.widget.RecyclerView.C0033 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.m455((android.view.View) r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$If r5 = (androidx.recyclerview.widget.GridLayoutManager.If) r5
            int r6 = r5.f275
            int r7 = r5.f275
            int r5 = r5.f276
            int r7 = r7 + r5
            android.view.View r5 = super.m292((android.view.View) r23, (int) r24, (androidx.recyclerview.widget.RecyclerView.AUx) r25, (androidx.recyclerview.widget.RecyclerView.C0033) r26)
            if (r5 != 0) goto L_0x0022
            return r4
        L_0x0022:
            r5 = r24
            int r5 = r0.m305((int) r5)
            r9 = 1
            if (r5 != r9) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            boolean r10 = r0.f293
            if (r5 == r10) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            r10 = -1
            if (r5 == 0) goto L_0x0053
            o.ǂ r5 = r0.f345
            if (r5 == 0) goto L_0x004d
            o.ǂ r5 = r0.f345
            o.ǂ$ǃ r11 = r5.f5664
            int r11 = r11.m6559()
            java.util.List<android.view.View> r5 = r5.f5662
            int r5 = r5.size()
            int r5 = r11 - r5
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            int r5 = r5 - r9
            r11 = r5
            r5 = -1
            r12 = -1
            goto L_0x006b
        L_0x0053:
            o.ǂ r5 = r0.f345
            if (r5 == 0) goto L_0x0068
            o.ǂ r5 = r0.f345
            o.ǂ$ǃ r11 = r5.f5664
            int r11 = r11.m6559()
            java.util.List<android.view.View> r5 = r5.f5662
            int r5 = r5.size()
            int r5 = r11 - r5
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            r11 = 0
            r12 = 1
        L_0x006b:
            int r13 = r0.f290
            if (r13 != r9) goto L_0x007e
            androidx.recyclerview.widget.RecyclerView r13 = r0.f349
            int r13 = o.C0293.m4156(r13)
            if (r13 != r9) goto L_0x0079
            r13 = 1
            goto L_0x007a
        L_0x0079:
            r13 = 0
        L_0x007a:
            if (r13 == 0) goto L_0x007e
            r13 = 1
            goto L_0x007f
        L_0x007e:
            r13 = 0
        L_0x007f:
            int r14 = r0.m228((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r11)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x008a:
            if (r11 == r5) goto L_0x0183
            int r9 = r0.m228((androidx.recyclerview.widget.RecyclerView.AUx) r1, (androidx.recyclerview.widget.RecyclerView.C0033) r2, (int) r11)
            android.view.View r1 = r0.m432((int) r11)
            if (r1 == r3) goto L_0x0183
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x00b0
            if (r9 == r14) goto L_0x00b0
            if (r4 == 0) goto L_0x00a2
            goto L_0x0183
        L_0x00a2:
            r18 = r3
            r19 = r5
            r20 = r8
            r8 = r16
            r5 = r17
            r21 = 1
            goto L_0x016f
        L_0x00b0:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$If r9 = (androidx.recyclerview.widget.GridLayoutManager.If) r9
            int r2 = r9.f275
            r18 = r3
            int r3 = r9.f275
            r19 = r5
            int r5 = r9.f276
            int r3 = r3 + r5
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x00cc
            if (r2 != r6) goto L_0x00cc
            if (r3 != r7) goto L_0x00cc
            return r1
        L_0x00cc:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x00d4
            if (r4 == 0) goto L_0x00dc
        L_0x00d4:
            boolean r5 = r1.hasFocusable()
            if (r5 != 0) goto L_0x00e7
            if (r10 != 0) goto L_0x00e7
        L_0x00dc:
            r20 = r8
            r8 = r16
            r5 = r17
            r0 = 1
            r21 = 1
            goto L_0x0143
        L_0x00e7:
            int r5 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r5 = r20 - r5
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto L_0x0104
            if (r5 <= r15) goto L_0x00fa
            goto L_0x00dc
        L_0x00fa:
            if (r5 != r15) goto L_0x013a
            if (r2 <= r8) goto L_0x0100
            r5 = 1
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r13 != r5) goto L_0x013a
            goto L_0x00dc
        L_0x0104:
            if (r4 != 0) goto L_0x013a
            r20 = r8
            o.ɔı r8 = r0.f355
            boolean r8 = r8.m7498(r1)
            if (r8 == 0) goto L_0x011a
            o.ɔı r8 = r0.f347
            boolean r8 = r8.m7498(r1)
            if (r8 == 0) goto L_0x011a
            r8 = 1
            goto L_0x011b
        L_0x011a:
            r8 = 0
        L_0x011b:
            r21 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0135
            r8 = r16
            if (r5 <= r8) goto L_0x0129
            r5 = r17
        L_0x0127:
            r0 = 1
            goto L_0x0143
        L_0x0129:
            if (r5 != r8) goto L_0x0137
            r5 = r17
            if (r2 <= r5) goto L_0x0131
            r0 = 1
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r13 != r0) goto L_0x0142
            goto L_0x0127
        L_0x0135:
            r8 = r16
        L_0x0137:
            r5 = r17
            goto L_0x0142
        L_0x013a:
            r20 = r8
            r8 = r16
            r5 = r17
            r21 = 1
        L_0x0142:
            r0 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x016f
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x015e
            int r0 = r9.f275
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r4 = r1
            r15 = r3
            r17 = r5
            r16 = r8
            r8 = r0
            goto L_0x0175
        L_0x015e:
            int r0 = r9.f275
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r17 = r0
            r10 = r1
            r16 = r3
            goto L_0x0173
        L_0x016f:
            r17 = r5
            r16 = r8
        L_0x0173:
            r8 = r20
        L_0x0175:
            int r11 = r11 + r12
            r0 = r22
            r1 = r25
            r2 = r26
            r3 = r18
            r5 = r19
            r9 = 1
            goto L_0x008a
        L_0x0183:
            if (r4 == 0) goto L_0x0186
            return r4
        L_0x0186:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m241(android.view.View, int, androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ):android.view.View");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m246() {
        return this.f292 == null && !this.f270;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m234(RecyclerView.C0033 r1) {
        return super.m283(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m240(RecyclerView.C0033 r1) {
        return super.m290(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m247(RecyclerView.C0033 r1) {
        return super.m298(r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m259(RecyclerView.C0033 r1) {
        return super.m315(r1);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$ǃ  reason: contains not printable characters */
    public static final class C0021 extends C0022 {
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m261(int i, int i2) {
            return i % i2;
        }
    }

    public static class If extends RecyclerView.C0038 {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f275 = -1;

        /* renamed from: Ι  reason: contains not printable characters */
        int f276 = 0;

        public If(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public If(int i, int i2) {
            super(i, i2);
        }

        public If(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public If(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m250(RecyclerView.AUx aUx, RecyclerView.C0033 r8) {
        int i;
        if (r8.f378) {
            if (this.f345 != null) {
                C0878 r0 = this.f345;
                i = r0.f5664.m6559() - r0.f5662.size();
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                If ifR = (If) m432(i2).getLayoutParams();
                int layoutPosition = ifR.f388.getLayoutPosition();
                this.f267.put(layoutPosition, ifR.f276);
                this.f269.put(layoutPosition, ifR.f275);
            }
        }
        super.m301(aUx, r8);
        this.f267.clear();
        this.f269.clear();
    }

    /* renamed from: ł  reason: contains not printable characters */
    private void m223() {
        int i;
        int i2 = 0;
        if (this.f290 == 1) {
            i = this.f351 - (this.f349 != null ? this.f349.getPaddingRight() : 0);
            if (this.f349 != null) {
                i2 = this.f349.getPaddingLeft();
            }
        } else {
            i = this.f341 - (this.f349 != null ? this.f349.getPaddingBottom() : 0);
            if (this.f349 != null) {
                i2 = this.f349.getPaddingTop();
            }
        }
        this.f268 = m225(this.f268, this.f271, i - i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m228(RecyclerView.AUx aUx, RecyclerView.C0033 r2, int i) {
        if (!r2.f378) {
            return C0022.m262(i, this.f271);
        }
        int r1 = aUx.m365(i);
        if (r1 == -1) {
            return 0;
        }
        return C0022.m262(r1, this.f271);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m222(RecyclerView.AUx aUx, RecyclerView.C0033 r3, int i) {
        if (!r3.f378) {
            return this.f273.m263(i, this.f271);
        }
        int i2 = this.f269.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int r2 = aUx.m365(i);
        if (r2 == -1) {
            return 0;
        }
        return this.f273.m263(r2, this.f271);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m224(RecyclerView.AUx aUx, RecyclerView.C0033 r4, int i) {
        if (!r4.f378) {
            return 1;
        }
        int i2 = this.f267.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (aUx.m365(i) == -1) {
        }
        return 1;
    }
}
