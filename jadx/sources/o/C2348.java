package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.C0666;
import o.C1429;
import o.C1483;
import o.C2118;
import o.C2438;

/* renamed from: o.Г  reason: contains not printable characters */
class C2348 extends C1058 implements C2438.C2439 {

    /* renamed from: ŀ  reason: contains not printable characters */
    final C2352 f10861 = new C2352();

    /* renamed from: ł  reason: contains not printable characters */
    int f10862;

    /* renamed from: ſ  reason: contains not printable characters */
    private Cif f10863;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f10864;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final SparseBooleanArray f10865 = new SparseBooleanArray();

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f10866;

    /* renamed from: ɨ  reason: contains not printable characters */
    C2351 f10867;

    /* renamed from: ɪ  reason: contains not printable characters */
    If f10868;

    /* renamed from: ɹ  reason: contains not printable characters */
    Drawable f10869;

    /* renamed from: ɾ  reason: contains not printable characters */
    boolean f10870;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int f10871;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f10872;

    /* renamed from: І  reason: contains not printable characters */
    boolean f10873;

    /* renamed from: г  reason: contains not printable characters */
    C2350 f10874;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C2349 f10875;

    /* renamed from: ӏ  reason: contains not printable characters */
    int f10876;

    public C2348(Context context) {
        super(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12293(Context context, C2328 r6) {
        super.m7315(context, r6);
        Resources resources = context.getResources();
        C1560 r0 = new C1560(context);
        if (!this.f10866) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 19 && ViewConfiguration.get(r0.f8311).hasPermanentMenuKey()) {
                z = false;
            }
            this.f10873 = z;
        }
        this.f10872 = r0.f8311.getResources().getDisplayMetrics().widthPixels / 2;
        this.f10876 = r0.m9186();
        int i = this.f10872;
        if (this.f10873) {
            if (this.f10875 == null) {
                this.f10875 = new C2349(this.f6332);
                if (this.f10864) {
                    this.f10875.setImageDrawable(this.f10869);
                    this.f10869 = null;
                    this.f10864 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10875.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f10875.getMeasuredWidth();
        } else {
            this.f10875 = null;
        }
        this.f10871 = i;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1429 m12290(ViewGroup viewGroup) {
        C1429 r0 = this.f6333;
        C1429 r2 = super.m7313(viewGroup);
        if (r0 != r2) {
            ((C2118) r2).setPresenter(this);
        }
        return r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final View m12289(C2459 r3, View view, ViewGroup viewGroup) {
        View actionView = r3.getActionView();
        if (actionView == null || r3.m12675()) {
            actionView = super.m7312(r3, view, viewGroup);
        }
        actionView.setVisibility(r3.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((C2118) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(C2118.m11280(layoutParams));
        }
        return actionView;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12294(C2459 r1, C1429.C1430 r2) {
        r2.m8662(r1);
        C0666 r22 = (C0666) r2;
        r22.setItemInvoker((C2118) this.f6333);
        if (this.f10863 == null) {
            this.f10863 = new Cif();
        }
        r22.setPopupCallback(this.f10863);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12295(boolean z) {
        ArrayList<C2459> arrayList;
        super.m7317(z);
        ((View) this.f6333).requestLayout();
        boolean z2 = false;
        if (this.f6336 != null) {
            C2328 r5 = this.f6336;
            r5.m12144();
            ArrayList<C2459> arrayList2 = r5.f10797;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C2438 r3 = arrayList2.get(i).f11194;
                if (r3 != null) {
                    r3.m12545(this);
                }
            }
        }
        if (this.f6336 != null) {
            C2328 r52 = this.f6336;
            r52.m12144();
            arrayList = r52.f10819;
        } else {
            arrayList = null;
        }
        if (this.f10873 && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f10875 == null) {
                this.f10875 = new C2349(this.f6332);
            }
            ViewGroup viewGroup = (ViewGroup) this.f10875.getParent();
            if (viewGroup != this.f6333) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10875);
                }
                ((C2118) this.f6333).addView(this.f10875, C2118.m11281());
            }
        } else {
            C2349 r53 = this.f10875;
            if (r53 != null && r53.getParent() == this.f6333) {
                ((ViewGroup) this.f6333).removeView(this.f10875);
            }
        }
        ((C2118) this.f6333).setOverflowReserved(this.f10873);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12284(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f10875) {
            return false;
        }
        return super.m7308(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12292(o.C1653 r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            o.Ј r2 = r0.f8653
            o.Ј r3 = r7.f6336
            if (r2 == r3) goto L_0x0014
            o.Ј r0 = r0.f8653
            o.ʕ r0 = (o.C1653) r0
            goto L_0x0009
        L_0x0014:
            android.view.MenuItem r0 = r0.getItem()
            o.ɭ r2 = r7.f6333
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003a
            int r3 = r2.getChildCount()
            r4 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x003a
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof o.C1429.C1430
            if (r6 == 0) goto L_0x0037
            r6 = r5
            o.ɭ$ɩ r6 = (o.C1429.C1430) r6
            o.с r6 = r6.m8663()
            if (r6 != r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            return r1
        L_0x003e:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.f10862 = r0
            int r0 = r8.size()
            r2 = 0
        L_0x004d:
            r3 = 1
            if (r2 >= r0) goto L_0x0065
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0065:
            o.Г$ɩ r0 = new o.Г$ɩ
            android.content.Context r2 = r7.f6335
            r0.<init>(r2, r8, r5)
            r7.f10867 = r0
            o.Г$ɩ r0 = r7.f10867
            r0.f12321 = r1
            o.ϲ r2 = r0.f12322
            if (r2 == 0) goto L_0x007b
            o.ϲ r0 = r0.f12322
            r0.m11483((boolean) r1)
        L_0x007b:
            o.Г$ɩ r0 = r7.f10867
            boolean r0 = r0.m14215()
            if (r0 == 0) goto L_0x0087
            super.m7314((o.C1653) r8)
            return r3
        L_0x0087:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2348.m12292(o.ʕ):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12296() {
        /*
            r5 = this;
            boolean r0 = r5.f10873
            r1 = 0
            if (r0 == 0) goto L_0x0059
            o.Г$If r0 = r5.f10868
            r2 = 1
            if (r0 == 0) goto L_0x001d
            o.ϲ r3 = r0.f12322
            if (r3 == 0) goto L_0x0018
            o.ϲ r0 = r0.f12322
            boolean r0 = r0.m11819()
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0059
            o.Ј r0 = r5.f6336
            if (r0 == 0) goto L_0x0059
            o.ɭ r0 = r5.f6333
            if (r0 == 0) goto L_0x0059
            o.Г$ǃ r0 = r5.f10874
            if (r0 != 0) goto L_0x0059
            o.Ј r0 = r5.f6336
            r0.m12144()
            java.util.ArrayList<o.с> r0 = r0.f10819
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            o.Г$If r0 = new o.Г$If
            android.content.Context r1 = r5.f6335
            o.Ј r3 = r5.f6336
            o.Г$ı r4 = r5.f10875
            r0.<init>(r1, r3, r4)
            o.Г$ǃ r1 = new o.Г$ǃ
            r1.<init>(r0)
            r5.f10874 = r1
            o.ɭ r0 = r5.f6333
            android.view.View r0 = (android.view.View) r0
            o.Г$ǃ r1 = r5.f10874
            r0.post(r1)
            r0 = 0
            super.m7314((o.C1653) r0)
            return r2
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2348.m12296():boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m12291() {
        if (this.f10874 == null || this.f6333 == null) {
            If ifR = this.f10868;
            if (ifR == null) {
                return false;
            }
            ifR.m14216();
            return true;
        }
        ((View) this.f6333).removeCallbacks(this.f10874);
        this.f10874 = null;
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12286() {
        If ifR = this.f10868;
        if (ifR != null) {
            if (ifR.f12322 != null && ifR.f12322.m11819()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011d  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12283() {
        /*
            r19 = this;
            r0 = r19
            o.Ј r1 = r0.f6336
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0013
            o.Ј r1 = r0.f6336
            java.util.ArrayList r1 = r1.m12145()
            int r4 = r1.size()
            goto L_0x0015
        L_0x0013:
            r1 = r2
            r4 = 0
        L_0x0015:
            int r5 = r0.f10876
            int r6 = r0.f10871
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            o.ɭ r8 = r0.f6333
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r12 = r5
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0026:
            r13 = 2
            r14 = 1
            if (r5 >= r4) goto L_0x005a
            java.lang.Object r15 = r1.get(r5)
            o.с r15 = (o.C2459) r15
            int r3 = r15.f11171
            r3 = r3 & r13
            if (r3 != r13) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            int r10 = r10 + 1
            goto L_0x004b
        L_0x003d:
            int r3 = r15.f11171
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            int r11 = r11 + 1
            goto L_0x004b
        L_0x004a:
            r9 = 1
        L_0x004b:
            boolean r3 = r0.f10870
            if (r3 == 0) goto L_0x0056
            boolean r3 = r15.isActionViewExpanded()
            if (r3 == 0) goto L_0x0056
            r12 = 0
        L_0x0056:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0026
        L_0x005a:
            boolean r3 = r0.f10873
            if (r3 == 0) goto L_0x0065
            if (r9 != 0) goto L_0x0063
            int r11 = r11 + r10
            if (r11 <= r12) goto L_0x0065
        L_0x0063:
            int r12 = r12 + -1
        L_0x0065:
            int r12 = r12 - r10
            android.util.SparseBooleanArray r3 = r0.f10865
            r3.clear()
            r5 = 0
            r9 = 0
        L_0x006d:
            if (r5 >= r4) goto L_0x0132
            java.lang.Object r10 = r1.get(r5)
            o.с r10 = (o.C2459) r10
            int r11 = r10.f11171
            r11 = r11 & r13
            if (r11 != r13) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r15 = 32
            if (r11 == 0) goto L_0x00a0
            android.view.View r11 = r0.m7312(r10, r2, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L_0x0090
            r9 = r11
        L_0x0090:
            int r11 = r10.getGroupId()
            if (r11 == 0) goto L_0x0099
            r3.put(r11, r14)
        L_0x0099:
            int r11 = r10.f11183
            r11 = r11 | r15
            r10.f11183 = r11
            goto L_0x012c
        L_0x00a0:
            int r11 = r10.f11171
            r11 = r11 & r14
            if (r11 != r14) goto L_0x00a7
            r11 = 1
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            if (r11 == 0) goto L_0x0126
            int r11 = r10.getGroupId()
            boolean r17 = r3.get(r11)
            if (r12 > 0) goto L_0x00b6
            if (r17 == 0) goto L_0x00bb
        L_0x00b6:
            if (r6 <= 0) goto L_0x00bb
            r18 = 1
            goto L_0x00bd
        L_0x00bb:
            r18 = 0
        L_0x00bd:
            if (r18 == 0) goto L_0x00d7
            android.view.View r13 = r0.m7312(r10, r2, r8)
            r13.measure(r7, r7)
            int r13 = r13.getMeasuredWidth()
            int r6 = r6 - r13
            if (r9 != 0) goto L_0x00ce
            r9 = r13
        L_0x00ce:
            int r13 = r6 + r9
            if (r13 <= 0) goto L_0x00d4
            r13 = 1
            goto L_0x00d5
        L_0x00d4:
            r13 = 0
        L_0x00d5:
            r18 = r18 & r13
        L_0x00d7:
            if (r18 == 0) goto L_0x00df
            if (r11 == 0) goto L_0x00df
            r3.put(r11, r14)
            goto L_0x010f
        L_0x00df:
            if (r17 == 0) goto L_0x010f
            r13 = 0
            r3.put(r11, r13)
            r16 = r12
            r12 = 0
        L_0x00e8:
            if (r12 >= r5) goto L_0x0111
            java.lang.Object r17 = r1.get(r12)
            r2 = r17
            o.с r2 = (o.C2459) r2
            int r13 = r2.getGroupId()
            if (r13 != r11) goto L_0x010a
            int r13 = r2.f11183
            r13 = r13 & r15
            if (r13 != r15) goto L_0x00ff
            r13 = 1
            goto L_0x0100
        L_0x00ff:
            r13 = 0
        L_0x0100:
            if (r13 == 0) goto L_0x0104
            int r16 = r16 + 1
        L_0x0104:
            int r13 = r2.f11183
            r13 = r13 & -33
            r2.f11183 = r13
        L_0x010a:
            int r12 = r12 + 1
            r2 = 0
            r13 = 0
            goto L_0x00e8
        L_0x010f:
            r16 = r12
        L_0x0111:
            if (r18 == 0) goto L_0x0115
            int r16 = r16 + -1
        L_0x0115:
            if (r18 == 0) goto L_0x011d
            int r2 = r10.f11183
            r2 = r2 | r15
            r10.f11183 = r2
            goto L_0x0123
        L_0x011d:
            int r2 = r10.f11183
            r2 = r2 & -33
            r10.f11183 = r2
        L_0x0123:
            r12 = r16
            goto L_0x012c
        L_0x0126:
            int r2 = r10.f11183
            r2 = r2 & -33
            r10.f11183 = r2
        L_0x012c:
            int r5 = r5 + 1
            r2 = 0
            r13 = 2
            goto L_0x006d
        L_0x0132:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2348.m12283():boolean");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m12288() {
        C2353 r0 = new C2353();
        r0.f10887 = this.f10862;
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12285(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof C2353) {
            C2353 r2 = (C2353) parcelable;
            if (r2.f10887 > 0 && (findItem = this.f6336.findItem(r2.f10887)) != null) {
                m7314((C1653) findItem.getSubMenu());
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12282(boolean z) {
        if (z) {
            super.m7314((C1653) null);
        } else if (this.f6336 != null) {
            this.f6336.m12133(false);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: o.Г$ι  reason: contains not printable characters */
    static class C2353 implements Parcelable {
        public static final Parcelable.Creator<C2353> CREATOR = new Parcelable.Creator<C2353>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C2353[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C2353(parcel);
            }
        };

        /* renamed from: Ι  reason: contains not printable characters */
        public int f10887;

        public final int describeContents() {
            return 0;
        }

        C2353() {
        }

        C2353(Parcel parcel) {
            this.f10887 = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10887);
        }
    }

    /* renamed from: o.Г$ı  reason: contains not printable characters */
    class C2349 extends C2147 implements C2118.If {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final float[] f10880 = new float[2];

        public final boolean a_() {
            return false;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m12299() {
            return false;
        }

        public C2349(Context context) {
            super(context, (AttributeSet) null, R.attr.f148402130968606);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C2110.m11263(this, getContentDescription());
            setOnTouchListener(new C0381(this, C2348.this) {
                /* renamed from: Ι  reason: contains not printable characters */
                public final C2257 m12301() {
                    if (C2348.this.f10868 == null) {
                        return null;
                    }
                    return C2348.this.f10868.m14220();
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final boolean m12302() {
                    C2348.this.m12296();
                    return true;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final boolean m12300() {
                    if (C2348.this.f10874 != null) {
                        return false;
                    }
                    C2348.this.m12291();
                    return true;
                }
            });
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C2348.this.m12296();
            return true;
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1266.m8151(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: o.Г$If */
    class If extends C2675 {
        public If(Context context, C2328 r4, View view) {
            super(context, r4, view, true);
            m14217();
            C2352 r2 = C2348.this.f10861;
            this.f12314 = r2;
            if (this.f12322 != null) {
                this.f12322.m8865((C1483.C1484) r2);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12297() {
            if (C2348.this.f6336 != null) {
                C2348.this.f6336.close();
            }
            C2348.this.f10868 = null;
            super.m14218();
        }
    }

    /* renamed from: o.Г$ɩ  reason: contains not printable characters */
    class C2351 extends C2675 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2351(Context context, C1653 r4, View view) {
            super(context, r4, view, false);
            boolean z = false;
            if (!((((C2459) r4.getItem()).f11183 & 32) == 32 ? true : z)) {
                this.f12318 = C2348.this.f10875 == null ? (View) C2348.this.f6333 : C2348.this.f10875;
            }
            C2352 r2 = C2348.this.f10861;
            this.f12314 = r2;
            if (this.f12322 != null) {
                this.f12322.m8865((C1483.C1484) r2);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12303() {
            C2348 r0 = C2348.this;
            r0.f10867 = null;
            r0.f10862 = 0;
            super.m14218();
        }
    }

    /* renamed from: o.Г$Ι  reason: contains not printable characters */
    class C2352 implements C1483.C1484 {
        C2352() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m12305(C2328 r4) {
            if (r4 == null) {
                return false;
            }
            C2348.this.f10862 = ((C1653) r4).getItem().getItemId();
            C1483.C1484 r1 = C2348.this.f6330;
            if (r1 != null) {
                return r1.m8877(r4);
            }
            return false;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m12304(C2328 r3, boolean z) {
            if (r3 instanceof C1653) {
                r3.m12158().m12133(false);
            }
            C1483.C1484 r0 = C2348.this.f6330;
            if (r0 != null) {
                r0.m8876(r3, z);
            }
        }
    }

    /* renamed from: o.Г$ǃ  reason: contains not printable characters */
    class C2350 implements Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private If f10883;

        public C2350(If ifR) {
            this.f10883 = ifR;
        }

        public final void run() {
            if (C2348.this.f6336 != null) {
                C2328 r0 = C2348.this.f6336;
                if (r0.f10804 != null) {
                    r0.f10804.m12161(r0);
                }
            }
            View view = (View) C2348.this.f6333;
            if (!(view == null || view.getWindowToken() == null || !this.f10883.m14215())) {
                C2348.this.f10868 = this.f10883;
            }
            C2348.this.f10874 = null;
        }
    }

    /* renamed from: o.Г$if  reason: invalid class name */
    class Cif extends C0666.C0667 {
        Cif() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2257 m12298() {
            if (C2348.this.f10867 != null) {
                return C2348.this.f10867.m14220();
            }
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m12287(C2459 r2) {
        return (r2.f11183 & 32) == 32;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12281(C2328 r2, boolean z) {
        m12291();
        C2351 r0 = this.f10867;
        if (r0 != null) {
            r0.m14216();
        }
        super.m7306(r2, z);
    }
}
