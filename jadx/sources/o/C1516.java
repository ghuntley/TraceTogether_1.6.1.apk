package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import o.C0520;
import o.C0785;
import o.C0858;
import o.C1579;

/* renamed from: o.ɽǀ  reason: contains not printable characters */
public class C1516 extends LinearLayout {

    /* renamed from: ı  reason: contains not printable characters */
    final LinkedHashSet<Object> f8092;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1517 f8093;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f8094;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f8095;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Integer[] f8096;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f8097;

    /* renamed from: ι  reason: contains not printable characters */
    private final List<C1518> f8098;

    /* renamed from: І  reason: contains not printable characters */
    private final Cif f8099;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f8100;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Comparator<C1579> f8101;

    public C1516(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1516(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153342130969134);
    }

    public C1516(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8098 = new ArrayList();
        this.f8093 = new C1517(this, (byte) 0);
        this.f8099 = new Cif(this, (byte) 0);
        this.f8092 = new LinkedHashSet<>();
        this.f8101 = new Comparator<C1579>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                C1579 r3 = (C1579) obj;
                C1579 r4 = (C1579) obj2;
                int compareTo = Boolean.valueOf(r3.isChecked()).compareTo(Boolean.valueOf(r4.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(r3.isPressed()).compareTo(Boolean.valueOf(r4.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                return Integer.valueOf(C1516.this.indexOfChild(r3)).compareTo(Integer.valueOf(C1516.this.indexOfChild(r4)));
            }
        };
        this.f8097 = false;
        int[] iArr = C0858.Aux.f5579;
        C3160.m15978(context, attributeSet, i, R.style.f175142131952269);
        C3160.m15976(context, attributeSet, iArr, i, R.style.f175142131952269, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175142131952269);
        setSingleSelection(obtainStyledAttributes.getBoolean(2, false));
        this.f8094 = obtainStyledAttributes.getResourceId(0, -1);
        this.f8100 = obtainStyledAttributes.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        obtainStyledAttributes.recycle();
        C0293.m4203((View) this, 1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f8094;
        if (i != -1) {
            View findViewById = findViewById(i);
            if (findViewById instanceof C1579) {
                this.f8097 = true;
                ((C1579) findViewById).setChecked(true);
                this.f8097 = false;
            }
            m8968(i, true);
            this.f8094 = i;
            Iterator<Object> it = this.f8092.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C1579) {
            super.addView(view, i, layoutParams);
            C1579 r5 = (C1579) view;
            if (r5.getId() == -1) {
                r5.setId(C0293.m4193());
            }
            r5.setMaxLines(1);
            r5.setEllipsize(TextUtils.TruncateAt.END);
            r5.setCheckable(true);
            r5.f8411.add(this.f8093);
            r5.f8413 = this.f8099;
            if (r5.f8419 != null && !r5.f8419.f7833) {
                C1456 r7 = r5.f8419;
                r7.f7829 = true;
                r7.m8720();
            }
            if (r5.isChecked()) {
                m8968(r5.getId(), true);
                this.f8094 = r5.getId();
                Iterator<Object> it = this.f8092.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            C0785 r6 = r5.m9265();
            this.f8098.add(new C1518(r6.f5215, r6.f5222, r6.f5219, r6.f5224));
            C0293.m4151((View) r5, (C2449) new C2449() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m8969(View view, C0520 r12) {
                    int i;
                    super.m12579(view, r12);
                    C1516 r0 = C1516.this;
                    if (view instanceof C1579) {
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= r0.getChildCount()) {
                                break;
                            } else if (r0.getChildAt(i2) == view) {
                                i = i3;
                                break;
                            } else {
                                if (r0.getChildAt(i2) instanceof C1579) {
                                    if (r0.getChildAt(i2).getVisibility() != 8) {
                                        i3++;
                                    }
                                }
                                i2++;
                            }
                        }
                        r12.m5023((Object) C0520.If.m5072(0, 1, i, 1, false, ((C1579) view).isChecked()));
                    }
                    i = -1;
                    r12.m5023((Object) C0520.If.m5072(0, 1, i, 1, false, ((C1579) view).isChecked()));
                }
            });
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof C1579) {
            C1579 r0 = (C1579) view;
            r0.f8411.remove(this.f8093);
            r0.f8413 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f8098.remove(indexOfChild);
        }
        m8961();
        m8966();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m8961();
        m8966();
        super.onMeasure(i, i2);
    }

    public CharSequence getAccessibilityClassName() {
        return C1516.class.getName();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0520 r7 = C0520.m4998(accessibilityNodeInfo);
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= getChildCount()) {
                break;
            }
            if (getChildAt(i) instanceof C1579) {
                if (getChildAt(i).getVisibility() == 8) {
                    z = false;
                }
                if (z) {
                    i2++;
                }
            }
            i++;
        }
        r7.m5035((Object) C0520.C0521.m5076(1, i2, false, this.f8095 ? 1 : 2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private List<Integer> m8967() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            C1579 r2 = (C1579) getChildAt(i);
            if (r2.isChecked()) {
                arrayList.add(Integer.valueOf(r2.getId()));
            }
        }
        return arrayList;
    }

    public void setSingleSelection(boolean z) {
        if (this.f8095 != z) {
            this.f8095 = z;
            this.f8097 = true;
            for (int i = 0; i < getChildCount(); i++) {
                C1579 r1 = (C1579) getChildAt(i);
                r1.setChecked(false);
                r1.getId();
                Iterator<Object> it = this.f8092.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            this.f8097 = false;
            this.f8094 = -1;
            Iterator<Object> it2 = this.f8092.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f8100 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8962(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C1579) getChildAt(i)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C2826.m14764(layoutParams, 0);
            C2826.m14765(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8961() {
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount2) {
                i = -1;
                break;
            }
            if (getChildAt(i).getVisibility() != 8) {
                break;
            }
            i++;
        }
        int childCount3 = getChildCount() - 1;
        while (true) {
            if (childCount3 < 0) {
                childCount3 = -1;
                break;
            }
            if (getChildAt(childCount3).getVisibility() != 8) {
                break;
            }
            childCount3--;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            C1579 r6 = (C1579) getChildAt(i2);
            if (r6.getVisibility() != 8) {
                C0785.If ifR = new C0785.If(r6.m9265());
                m8963(ifR, m8965(i2, i, childCount3));
                r6.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1518 m8965(int i, int i2, int i3) {
        int childCount = getChildCount();
        C1518 r1 = this.f8098.get(i);
        boolean z = true;
        if (childCount == 1) {
            return r1;
        }
        boolean z2 = getOrientation() == 0;
        if (i == i2) {
            if (!z2) {
                return new C1518(r1.f8110, C1518.f8106, r1.f8108, C1518.f8106);
            }
            if (C0293.m4156(this) != 1) {
                z = false;
            }
            if (z) {
                C0460 r6 = C1518.f8106;
                return new C1518(r6, r6, r1.f8108, r1.f8109);
            }
            C0460 r62 = r1.f8110;
            C0460 r7 = r1.f8107;
            C0460 r0 = C1518.f8106;
            return new C1518(r62, r7, r0, r0);
        } else if (i != i3) {
            return null;
        } else {
            if (!z2) {
                return new C1518(C1518.f8106, r1.f8107, C1518.f8106, r1.f8109);
            }
            if (C0293.m4156(this) != 1) {
                z = false;
            }
            if (z) {
                C0460 r63 = r1.f8110;
                C0460 r72 = r1.f8107;
                C0460 r02 = C1518.f8106;
                return new C1518(r63, r72, r02, r02);
            }
            C0460 r64 = C1518.f8106;
            return new C1518(r64, r64, r1.f8108, r1.f8109);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8968(int i, boolean z) {
        List<Integer> r0 = m8967();
        if (this.f8100 && r0.isEmpty()) {
            View findViewById = findViewById(i);
            if (findViewById instanceof C1579) {
                this.f8097 = true;
                ((C1579) findViewById).setChecked(true);
                this.f8097 = false;
            }
        } else if (z && this.f8095) {
            r0.remove(Integer.valueOf(i));
            for (Integer intValue : r0) {
                View findViewById2 = findViewById(intValue.intValue());
                if (findViewById2 instanceof C1579) {
                    this.f8097 = true;
                    ((C1579) findViewById2).setChecked(false);
                    this.f8097 = false;
                }
                Iterator<Object> it = this.f8092.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static LinearLayout.LayoutParams m8964(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f8096;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    /* renamed from: o.ɽǀ$ı  reason: contains not printable characters */
    class C1517 implements C1579.C1581 {
        private C1517() {
        }

        /* synthetic */ C1517(C1516 r1, byte b) {
            this();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m8971(C1579 r3, boolean z) {
            if (!C1516.this.f8097) {
                if (C1516.this.f8095) {
                    C1516.this.f8094 = z ? r3.getId() : -1;
                }
                C1516 r0 = C1516.this;
                r3.getId();
                Iterator<Object> it = r0.f8092.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                C1516.this.m8968(r3.getId(), z);
                C1516.this.invalidate();
            }
        }
    }

    /* renamed from: o.ɽǀ$if  reason: invalid class name */
    class Cif implements C1579.C1580 {
        private Cif() {
        }

        /* synthetic */ Cif(C1516 r1, byte b) {
            this();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m8970(C1579 r3) {
            C1516.this.m8968(r3.getId(), r3.isChecked());
            C1516.this.invalidate();
        }
    }

    /* renamed from: o.ɽǀ$ǃ  reason: contains not printable characters */
    static class C1518 {

        /* renamed from: ı  reason: contains not printable characters */
        static final C0460 f8106 = new C0531(0.0f);

        /* renamed from: ǃ  reason: contains not printable characters */
        C0460 f8107;

        /* renamed from: ɩ  reason: contains not printable characters */
        C0460 f8108;

        /* renamed from: Ι  reason: contains not printable characters */
        C0460 f8109;

        /* renamed from: ι  reason: contains not printable characters */
        C0460 f8110;

        C1518(C0460 r1, C0460 r2, C0460 r3, C0460 r4) {
            this.f8110 = r1;
            this.f8108 = r3;
            this.f8109 = r4;
            this.f8107 = r2;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f8101);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((C1579) getChildAt(i), Integer.valueOf(i));
        }
        this.f8096 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8966() {
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            if (getChildAt(i).getVisibility() != 8) {
                break;
            }
            i++;
        }
        if (i != -1) {
            for (int i2 = i + 1; i2 < getChildCount(); i2++) {
                C1579 r3 = (C1579) getChildAt(i2);
                int min = Math.min(r3.m9266(), ((C1579) getChildAt(i2 - 1)).m9266());
                LinearLayout.LayoutParams r5 = m8964(r3);
                if (getOrientation() == 0) {
                    C2826.m14764(r5, 0);
                    C2826.m14765(r5, -min);
                } else {
                    r5.bottomMargin = 0;
                    r5.topMargin = -min;
                }
                r3.setLayoutParams(r5);
            }
            m8962(i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m8963(C0785.If ifR, C1518 r2) {
        if (r2 == null) {
            ifR.f5228 = new C0531(0.0f);
            ifR.f5227 = new C0531(0.0f);
            ifR.f5235 = new C0531(0.0f);
            ifR.f5231 = new C0531(0.0f);
            return;
        }
        ifR.f5228 = r2.f8110;
        ifR.f5231 = r2.f8107;
        ifR.f5227 = r2.f8108;
        ifR.f5235 = r2.f8109;
    }
}
