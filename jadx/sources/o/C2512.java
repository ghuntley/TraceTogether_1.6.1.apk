package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import o.C2597;
import o.C2724;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ь  reason: contains not printable characters */
public class C2512 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    private ArrayList<C2107> f11350 = new ArrayList<>(4);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f11351 = Integer.MAX_VALUE;

    /* renamed from: ǃ  reason: contains not printable characters */
    SparseArray<View> f11352 = new SparseArray<>();

    /* renamed from: ȷ  reason: contains not printable characters */
    private C2597 f11353 = null;

    /* renamed from: ɨ  reason: contains not printable characters */
    private HashMap<String, Integer> f11354 = new HashMap<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ArrayList<C1696> f11355 = new ArrayList<>(100);

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f11356 = -1;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f11357 = 7;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f11358 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    C1821 f11359 = new C1821();

    /* renamed from: ι  reason: contains not printable characters */
    private int f11360 = 0;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f11361 = true;

    /* renamed from: і  reason: contains not printable characters */
    private int f11362 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f11363 = Integer.MAX_VALUE;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f11364 = -1;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f11354 == null) {
                this.f11354 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f11354.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m13345(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f11354;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f11354.get(str);
    }

    public C2512(Context context) {
        super(context);
        m13344((AttributeSet) null);
    }

    public C2512(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13344(attributeSet);
    }

    public C2512(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13344(attributeSet);
    }

    public void setId(int i) {
        this.f11352.remove(getId());
        super.setId(i);
        this.f11352.put(getId(), this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m13344(AttributeSet attributeSet) {
        this.f11359.f8810 = this;
        this.f11352.put(getId(), this);
        this.f11353 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2724.C2725.f12613);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2724.C2725.f12677) {
                    this.f11360 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11360);
                } else if (index == C2724.C2725.f12650) {
                    this.f11362 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11362);
                } else if (index == C2724.C2725.f12638) {
                    this.f11351 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11351);
                } else if (index == C2724.C2725.f12671) {
                    this.f11363 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11363);
                } else if (index == C2724.C2725.f12669) {
                    this.f11357 = obtainStyledAttributes.getInt(index, this.f11357);
                } else if (index == C2724.C2725.f12715) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f11353 = new C2597();
                        C2597 r5 = this.f11353;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    C2597.C2598 r11 = new C2597.C2598((byte) 0);
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, C2724.C2725.f12702);
                                    C2597.m13771(r11, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        r11.f11770 = true;
                                    }
                                    r5.f11769.put(Integer.valueOf(r11.f11798), r11);
                                }
                            }
                        } catch (IOException | XmlPullParserException unused) {
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.f11353 = null;
                    }
                    this.f11364 = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f11359.f9286 = this.f11357;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        Object obj = view == this ? this.f11359 : view == null ? null : ((C2513) view.getLayoutParams()).f11409;
        if ((view instanceof C2376) && !(obj instanceof C2065)) {
            C2513 r0 = (C2513) view.getLayoutParams();
            r0.f11409 = new C2065();
            r0.f11426 = true;
            ((C2065) r0.f11409).m10989(r0.f11399);
        }
        if (view instanceof C2107) {
            C2107 r02 = (C2107) view;
            r02.m11257();
            ((C2513) view.getLayoutParams()).f11366 = true;
            if (!this.f11350.contains(r02)) {
                this.f11350.add(r02);
            }
        }
        this.f11352.put(view.getId(), view);
        this.f11361 = true;
    }

    public void onViewRemoved(View view) {
        C1696 r0;
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f11352.remove(view.getId());
        if (view == this) {
            r0 = this.f11359;
        } else {
            r0 = ((C2513) view.getLayoutParams()).f11409;
        }
        this.f11359.m11790(r0);
        this.f11350.remove(view);
        this.f11355.remove(r0);
        this.f11361 = true;
    }

    public void setMinWidth(int i) {
        if (i != this.f11360) {
            this.f11360 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f11362) {
            this.f11362 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f11351) {
            this.f11351 = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.f11363) {
            this.f11363 = i;
            requestLayout();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1696 m13342(int i) {
        if (i == 0) {
            return this.f11359;
        }
        View view = this.f11352.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f11359;
        }
        if (view == null) {
            return null;
        }
        return ((C2513) view.getLayoutParams()).f11409;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m13340(int i, int i2) {
        boolean z;
        int baseline;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C2513 r9 = (C2513) childAt.getLayoutParams();
                C1696 r10 = r9.f11409;
                if (!r9.f11426 && !r9.f11366) {
                    r10.f8850 = childAt.getVisibility();
                    int i8 = r9.width;
                    int i9 = r9.height;
                    boolean z2 = true;
                    if (r9.f11416 || r9.f11406 || (!r9.f11416 && r9.f11415 == 1) || r9.width == -1 || (!r9.f11406 && (r9.f11413 == 1 || r9.height == -1))) {
                        if (i8 == 0) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -2);
                            z = true;
                        } else if (i8 == -1) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -1);
                            z = false;
                        } else {
                            z = i8 == -2;
                            i3 = getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -2);
                        } else if (i9 == -1) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -1);
                            z2 = false;
                        } else {
                            if (i9 != -2) {
                                z2 = false;
                            }
                            i4 = getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    r10.m9645(i8);
                    r10.m9651(i9);
                    if (z) {
                        r10.f8843 = i8;
                    }
                    if (z2) {
                        r10.f8845 = i9;
                    }
                    if (r9.f11410 && (baseline = childAt.getBaseline()) != -1) {
                        r10.f8835 = baseline;
                    }
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m13339() {
        int i;
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof C2741) {
                C2741 r3 = (C2741) childAt;
                if (r3.f12753 != null) {
                    C2513 r4 = (C2513) r3.getLayoutParams();
                    C2513 r32 = (C2513) r3.f12753.getLayoutParams();
                    r32.f11409.f8850 = 0;
                    C1696 r5 = r4.f11409;
                    C1696 r6 = r32.f11409;
                    if (r6.f8850 == 8) {
                        i = 0;
                    } else {
                        i = r6.f8827;
                    }
                    r5.m9645(i);
                    C1696 r42 = r4.f11409;
                    C1696 r52 = r32.f11409;
                    if (r52.f8850 == 8) {
                        i2 = 0;
                    } else {
                        i2 = r52.f8836;
                    }
                    r42.m9651(i2);
                    r32.f11409.f8850 = 8;
                }
            }
        }
        int size = this.f11350.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f11350.get(i4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02bb  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13343(int r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r21.getPaddingTop()
            int r4 = r21.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r21.getPaddingLeft()
            int r5 = r21.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r21.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 8
            r9 = -1
            r10 = -2
            if (r7 >= r5) goto L_0x00d2
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 == r8) goto L_0x00ce
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            o.ь$ɩ r8 = (o.C2512.C2513) r8
            o.ʢ r13 = r8.f11409
            boolean r14 = r8.f11426
            if (r14 != 0) goto L_0x00ce
            boolean r14 = r8.f11366
            if (r14 != 0) goto L_0x00ce
            int r14 = r12.getVisibility()
            r13.f8850 = r14
            int r14 = r8.width
            int r15 = r8.height
            if (r14 == 0) goto L_0x00ae
            if (r15 != 0) goto L_0x004c
            goto L_0x00ae
        L_0x004c:
            if (r14 != r10) goto L_0x0051
            r16 = 1
            goto L_0x0053
        L_0x0051:
            r16 = 0
        L_0x0053:
            int r14 = getChildMeasureSpec(r1, r4, r14)
            if (r15 != r10) goto L_0x005b
            r11 = 1
            goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            int r10 = getChildMeasureSpec(r2, r3, r15)
            r12.measure(r14, r10)
            int r10 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            r13.m9645((int) r10)
            r13.m9651((int) r14)
            if (r16 == 0) goto L_0x0075
            r13.f8843 = r10
        L_0x0075:
            if (r11 == 0) goto L_0x0079
            r13.f8845 = r14
        L_0x0079:
            boolean r11 = r8.f11410
            if (r11 == 0) goto L_0x0085
            int r11 = r12.getBaseline()
            if (r11 == r9) goto L_0x0085
            r13.f8835 = r11
        L_0x0085:
            boolean r9 = r8.f11416
            if (r9 == 0) goto L_0x00ce
            boolean r8 = r8.f11406
            if (r8 == 0) goto L_0x00ce
            o.ιӀ r8 = r13.f8851
            if (r8 != 0) goto L_0x0098
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r13.f8851 = r8
        L_0x0098:
            o.ιӀ r8 = r13.f8851
            r8.m11003(r10)
            o.ιӀ r8 = r13.f8833
            if (r8 != 0) goto L_0x00a8
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r13.f8833 = r8
        L_0x00a8:
            o.ιӀ r8 = r13.f8833
            r8.m11003(r14)
            goto L_0x00ce
        L_0x00ae:
            o.ιӀ r8 = r13.f8851
            if (r8 != 0) goto L_0x00b9
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r13.f8851 = r8
        L_0x00b9:
            o.ιӀ r8 = r13.f8851
            r8.m14554()
            o.ιӀ r8 = r13.f8833
            if (r8 != 0) goto L_0x00c9
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r13.f8833 = r8
        L_0x00c9:
            o.ιӀ r8 = r13.f8833
            r8.m14554()
        L_0x00ce:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00d2:
            o.Ιɩ r7 = r0.f11359
            r7.m10024()
            r7 = 0
        L_0x00d8:
            if (r7 >= r5) goto L_0x02d0
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 == r8) goto L_0x02bd
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            o.ь$ɩ r13 = (o.C2512.C2513) r13
            o.ʢ r14 = r13.f11409
            boolean r15 = r13.f11426
            if (r15 != 0) goto L_0x02bd
            boolean r15 = r13.f11366
            if (r15 != 0) goto L_0x02bd
            int r15 = r12.getVisibility()
            r14.f8850 = r15
            int r15 = r13.width
            int r6 = r13.height
            if (r15 == 0) goto L_0x0102
            if (r6 != 0) goto L_0x02bd
        L_0x0102:
            o.ʈ$ı r8 = o.C1625.C1626.LEFT
            o.ʈ r8 = r14.m9629((o.C1625.C1626) r8)
            o.ιΙ r8 = r8.f8547
            o.ʈ$ı r9 = o.C1625.C1626.RIGHT
            o.ʈ r9 = r14.m9629((o.C1625.C1626) r9)
            o.ιΙ r9 = r9.f8547
            o.ʈ$ı r10 = o.C1625.C1626.LEFT
            o.ʈ r10 = r14.m9629((o.C1625.C1626) r10)
            o.ʈ r10 = r10.f8549
            if (r10 == 0) goto L_0x0128
            o.ʈ$ı r10 = o.C1625.C1626.RIGHT
            o.ʈ r10 = r14.m9629((o.C1625.C1626) r10)
            o.ʈ r10 = r10.f8549
            if (r10 == 0) goto L_0x0128
            r10 = 1
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            o.ʈ$ı r11 = o.C1625.C1626.TOP
            o.ʈ r11 = r14.m9629((o.C1625.C1626) r11)
            o.ιΙ r11 = r11.f8547
            r17 = r5
            o.ʈ$ı r5 = o.C1625.C1626.BOTTOM
            o.ʈ r5 = r14.m9629((o.C1625.C1626) r5)
            o.ιΙ r5 = r5.f8547
            r18 = r7
            o.ʈ$ı r7 = o.C1625.C1626.TOP
            o.ʈ r7 = r14.m9629((o.C1625.C1626) r7)
            o.ʈ r7 = r7.f8549
            if (r7 == 0) goto L_0x0153
            o.ʈ$ı r7 = o.C1625.C1626.BOTTOM
            o.ʈ r7 = r14.m9629((o.C1625.C1626) r7)
            o.ʈ r7 = r7.f8549
            if (r7 == 0) goto L_0x0153
            r7 = 1
            goto L_0x0154
        L_0x0153:
            r7 = 0
        L_0x0154:
            if (r15 != 0) goto L_0x015c
            if (r6 != 0) goto L_0x015c
            if (r10 == 0) goto L_0x015c
            if (r7 != 0) goto L_0x02c1
        L_0x015c:
            r19 = r13
            o.Ιɩ r13 = r0.f11359
            o.ʢ$ɩ r13 = r13.m9625()
            r20 = r12
            o.ʢ$ɩ r12 = o.C1696.C1697.WRAP_CONTENT
            if (r13 == r12) goto L_0x016c
            r12 = 1
            goto L_0x016d
        L_0x016c:
            r12 = 0
        L_0x016d:
            o.Ιɩ r13 = r0.f11359
            o.ʢ$ɩ r13 = r13.m9643()
            o.ʢ$ɩ r0 = o.C1696.C1697.WRAP_CONTENT
            if (r13 == r0) goto L_0x0179
            r0 = 1
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            if (r12 != 0) goto L_0x018c
            o.ιӀ r13 = r14.f8851
            if (r13 != 0) goto L_0x0187
            o.ιӀ r13 = new o.ιӀ
            r13.<init>()
            r14.f8851 = r13
        L_0x0187:
            o.ιӀ r13 = r14.f8851
            r13.m14554()
        L_0x018c:
            if (r0 != 0) goto L_0x019e
            o.ιӀ r13 = r14.f8833
            if (r13 != 0) goto L_0x0199
            o.ιӀ r13 = new o.ιӀ
            r13.<init>()
            r14.f8833 = r13
        L_0x0199:
            o.ιӀ r13 = r14.f8833
            r13.m14554()
        L_0x019e:
            if (r15 != 0) goto L_0x01dc
            if (r12 == 0) goto L_0x01d4
            boolean r13 = r14.m9639()
            if (r13 == 0) goto L_0x01d4
            if (r10 == 0) goto L_0x01d4
            int r10 = r8.f13030
            r13 = 1
            if (r10 != r13) goto L_0x01b1
            r10 = 1
            goto L_0x01b2
        L_0x01b1:
            r10 = 0
        L_0x01b2:
            if (r10 == 0) goto L_0x01d4
            int r10 = r9.f13030
            if (r10 != r13) goto L_0x01ba
            r10 = 1
            goto L_0x01bb
        L_0x01ba:
            r10 = 0
        L_0x01bb:
            if (r10 == 0) goto L_0x01d4
            float r9 = r9.f10002
            float r8 = r8.f10002
            float r9 = r9 - r8
            int r15 = (int) r9
            o.ιӀ r8 = r14.f8851
            if (r8 != 0) goto L_0x01ce
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r14.f8851 = r8
        L_0x01ce:
            o.ιӀ r8 = r14.f8851
            r8.m11003(r15)
            goto L_0x01eb
        L_0x01d4:
            r8 = -2
            int r9 = getChildMeasureSpec(r1, r4, r8)
            r8 = 1
            r12 = 0
            goto L_0x01f0
        L_0x01dc:
            r8 = -2
            r9 = -1
            if (r15 != r9) goto L_0x01e7
            int r10 = getChildMeasureSpec(r1, r4, r9)
            r9 = r10
            r8 = 0
            goto L_0x01f0
        L_0x01e7:
            if (r15 != r8) goto L_0x01eb
            r8 = 1
            goto L_0x01ec
        L_0x01eb:
            r8 = 0
        L_0x01ec:
            int r9 = getChildMeasureSpec(r1, r4, r15)
        L_0x01f0:
            if (r6 != 0) goto L_0x0233
            if (r0 == 0) goto L_0x0227
            boolean r6 = r14.m9624()
            if (r6 == 0) goto L_0x0227
            if (r7 == 0) goto L_0x0227
            int r6 = r11.f13030
            r13 = 1
            if (r6 != r13) goto L_0x0203
            r6 = 1
            goto L_0x0204
        L_0x0203:
            r6 = 0
        L_0x0204:
            if (r6 == 0) goto L_0x0228
            int r6 = r5.f13030
            if (r6 != r13) goto L_0x020c
            r6 = 1
            goto L_0x020d
        L_0x020c:
            r6 = 0
        L_0x020d:
            if (r6 == 0) goto L_0x0228
            float r5 = r5.f10002
            float r6 = r11.f10002
            float r5 = r5 - r6
            int r6 = (int) r5
            o.ιӀ r5 = r14.f8833
            if (r5 != 0) goto L_0x0220
            o.ιӀ r5 = new o.ιӀ
            r5.<init>()
            r14.f8833 = r5
        L_0x0220:
            o.ιӀ r5 = r14.f8833
            r5.m11003(r6)
            r5 = -2
            goto L_0x0245
        L_0x0227:
            r13 = 1
        L_0x0228:
            r5 = -2
            int r0 = getChildMeasureSpec(r2, r3, r5)
            r6 = r0
            r0 = r20
            r7 = 1
            r10 = 0
            goto L_0x024d
        L_0x0233:
            r5 = -2
            r7 = -1
            r13 = 1
            if (r6 != r7) goto L_0x0241
            int r6 = getChildMeasureSpec(r2, r3, r7)
            r10 = r0
            r0 = r20
            r7 = 0
            goto L_0x024d
        L_0x0241:
            if (r6 != r5) goto L_0x0245
            r7 = 1
            goto L_0x0246
        L_0x0245:
            r7 = 0
        L_0x0246:
            int r6 = getChildMeasureSpec(r2, r3, r6)
            r10 = r0
            r0 = r20
        L_0x024d:
            r0.measure(r9, r6)
            int r6 = r0.getMeasuredWidth()
            int r9 = r0.getMeasuredHeight()
            r14.m9645((int) r6)
            r14.m9651((int) r9)
            if (r8 == 0) goto L_0x0262
            r14.f8843 = r6
        L_0x0262:
            if (r7 == 0) goto L_0x0266
            r14.f8845 = r9
        L_0x0266:
            r7 = 2
            if (r12 == 0) goto L_0x027a
            o.ιӀ r8 = r14.f8851
            if (r8 != 0) goto L_0x0274
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r14.f8851 = r8
        L_0x0274:
            o.ιӀ r8 = r14.f8851
            r8.m11003(r6)
            goto L_0x0289
        L_0x027a:
            o.ιӀ r6 = r14.f8851
            if (r6 != 0) goto L_0x0285
            o.ιӀ r6 = new o.ιӀ
            r6.<init>()
            r14.f8851 = r6
        L_0x0285:
            o.ιӀ r6 = r14.f8851
            r6.f13030 = r7
        L_0x0289:
            if (r10 == 0) goto L_0x029c
            o.ιӀ r6 = r14.f8833
            if (r6 != 0) goto L_0x0296
            o.ιӀ r6 = new o.ιӀ
            r6.<init>()
            r14.f8833 = r6
        L_0x0296:
            o.ιӀ r6 = r14.f8833
            r6.m11003(r9)
            goto L_0x02ab
        L_0x029c:
            o.ιӀ r6 = r14.f8833
            if (r6 != 0) goto L_0x02a7
            o.ιӀ r6 = new o.ιӀ
            r6.<init>()
            r14.f8833 = r6
        L_0x02a7:
            o.ιӀ r6 = r14.f8833
            r6.f13030 = r7
        L_0x02ab:
            r6 = r19
            boolean r6 = r6.f11410
            if (r6 == 0) goto L_0x02bb
            int r0 = r0.getBaseline()
            r6 = -1
            if (r0 == r6) goto L_0x02c4
            r14.f8835 = r0
            goto L_0x02c4
        L_0x02bb:
            r6 = -1
            goto L_0x02c4
        L_0x02bd:
            r17 = r5
            r18 = r7
        L_0x02c1:
            r5 = -2
            r6 = -1
            r13 = 1
        L_0x02c4:
            int r7 = r18 + 1
            r5 = r17
            r8 = 8
            r9 = -1
            r10 = -2
            r0 = r21
            goto L_0x00d8
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2512.m13343(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08da, code lost:
        if ((r3.f8833.f13030 == 1) == false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0a84, code lost:
        if (r5 != r11) goto L_0x0a86;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x073e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07ac  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0aaf  */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0abc  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0abe  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0ac8  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0ad4  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0b0b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            int r3 = android.view.View.MeasureSpec.getMode(r42)
            int r4 = android.view.View.MeasureSpec.getSize(r42)
            int r5 = android.view.View.MeasureSpec.getMode(r43)
            int r6 = android.view.View.MeasureSpec.getSize(r43)
            int r7 = r41.getPaddingLeft()
            int r8 = r41.getPaddingTop()
            o.Ιɩ r9 = r0.f11359
            r9.m9636((int) r7)
            o.Ιɩ r9 = r0.f11359
            r9.m9631((int) r8)
            o.Ιɩ r9 = r0.f11359
            int r10 = r0.f11351
            int[] r9 = r9.f8846
            r11 = 0
            r9[r11] = r10
            o.Ιɩ r9 = r0.f11359
            int r10 = r0.f11363
            int[] r9 = r9.f8846
            r12 = 1
            r9[r12] = r10
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x004d
            o.Ιɩ r9 = r0.f11359
            int r13 = r41.getLayoutDirection()
            if (r13 != r12) goto L_0x004a
            r13 = 1
            goto L_0x004b
        L_0x004a:
            r13 = 0
        L_0x004b:
            r9.f9283 = r13
        L_0x004d:
            int r9 = android.view.View.MeasureSpec.getMode(r42)
            int r13 = android.view.View.MeasureSpec.getSize(r42)
            int r14 = android.view.View.MeasureSpec.getMode(r43)
            int r15 = android.view.View.MeasureSpec.getSize(r43)
            int r16 = r41.getPaddingTop()
            int r17 = r41.getPaddingBottom()
            int r16 = r16 + r17
            int r17 = r41.getPaddingLeft()
            int r18 = r41.getPaddingRight()
            int r17 = r17 + r18
            o.ʢ$ɩ r18 = o.C1696.C1697.FIXED
            o.ʢ$ɩ r19 = o.C1696.C1697.FIXED
            r41.getLayoutParams()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r9 == r10) goto L_0x0093
            if (r9 == 0) goto L_0x0090
            if (r9 == r12) goto L_0x0086
        L_0x0082:
            r9 = r18
            r13 = 0
            goto L_0x0097
        L_0x0086:
            int r9 = r0.f11351
            int r9 = java.lang.Math.min(r9, r13)
            int r9 = r9 - r17
            r13 = r9
            goto L_0x0095
        L_0x0090:
            o.ʢ$ɩ r18 = o.C1696.C1697.WRAP_CONTENT
            goto L_0x0082
        L_0x0093:
            o.ʢ$ɩ r18 = o.C1696.C1697.WRAP_CONTENT
        L_0x0095:
            r9 = r18
        L_0x0097:
            if (r14 == r10) goto L_0x00ae
            if (r14 == 0) goto L_0x00ab
            if (r14 == r12) goto L_0x00a1
        L_0x009d:
            r14 = r19
            r15 = 0
            goto L_0x00b2
        L_0x00a1:
            int r14 = r0.f11363
            int r14 = java.lang.Math.min(r14, r15)
            int r14 = r14 - r16
            r15 = r14
            goto L_0x00b0
        L_0x00ab:
            o.ʢ$ɩ r19 = o.C1696.C1697.WRAP_CONTENT
            goto L_0x009d
        L_0x00ae:
            o.ʢ$ɩ r19 = o.C1696.C1697.WRAP_CONTENT
        L_0x00b0:
            r14 = r19
        L_0x00b2:
            o.Ιɩ r12 = r0.f11359
            r12.m9655(r11)
            o.Ιɩ r12 = r0.f11359
            r12.m9657(r11)
            o.Ιɩ r12 = r0.f11359
            r12.m9623((o.C1696.C1697) r9)
            o.Ιɩ r9 = r0.f11359
            r9.m9645((int) r13)
            o.Ιɩ r9 = r0.f11359
            r9.m9648((o.C1696.C1697) r14)
            o.Ιɩ r9 = r0.f11359
            r9.m9651((int) r15)
            o.Ιɩ r9 = r0.f11359
            int r12 = r0.f11360
            int r13 = r41.getPaddingLeft()
            int r12 = r12 - r13
            int r13 = r41.getPaddingRight()
            int r12 = r12 - r13
            r9.m9655(r12)
            o.Ιɩ r9 = r0.f11359
            int r12 = r0.f11362
            int r13 = r41.getPaddingTop()
            int r12 = r12 - r13
            int r13 = r41.getPaddingBottom()
            int r12 = r12 - r13
            r9.m9657(r12)
            o.Ιɩ r9 = r0.f11359
            int r12 = r9.f8850
            r13 = 8
            if (r12 != r13) goto L_0x00fc
            r9 = 0
            goto L_0x00fe
        L_0x00fc:
            int r9 = r9.f8827
        L_0x00fe:
            o.Ιɩ r12 = r0.f11359
            int r14 = r12.f8850
            if (r14 != r13) goto L_0x0106
            r12 = 0
            goto L_0x0108
        L_0x0106:
            int r12 = r12.f8836
        L_0x0108:
            boolean r14 = r0.f11361
            if (r14 == 0) goto L_0x0717
            r0.f11361 = r11
            int r14 = r41.getChildCount()
            r10 = 0
        L_0x0113:
            if (r10 >= r14) goto L_0x0124
            android.view.View r18 = r0.getChildAt(r10)
            boolean r18 = r18.isLayoutRequested()
            if (r18 == 0) goto L_0x0121
            r10 = 1
            goto L_0x0125
        L_0x0121:
            int r10 = r10 + 1
            goto L_0x0113
        L_0x0124:
            r10 = 0
        L_0x0125:
            if (r10 == 0) goto L_0x0709
            java.util.ArrayList<o.ʢ> r10 = r0.f11355
            r10.clear()
            boolean r10 = r41.isInEditMode()
            int r14 = r41.getChildCount()
            if (r10 == 0) goto L_0x0174
            r13 = 0
        L_0x0137:
            if (r13 >= r14) goto L_0x0174
            android.view.View r19 = r0.getChildAt(r13)
            android.content.res.Resources r15 = r41.getResources()     // Catch:{ NotFoundException -> 0x016e }
            int r11 = r19.getId()     // Catch:{ NotFoundException -> 0x016e }
            java.lang.String r11 = r15.getResourceName(r11)     // Catch:{ NotFoundException -> 0x016e }
            int r15 = r19.getId()     // Catch:{ NotFoundException -> 0x016e }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NotFoundException -> 0x016e }
            r2 = 0
            r0.setDesignInformation(r2, r11, r15)     // Catch:{ NotFoundException -> 0x016e }
            r2 = 47
            int r2 = r11.indexOf(r2)     // Catch:{ NotFoundException -> 0x016e }
            r15 = -1
            if (r2 == r15) goto L_0x0164
            int r2 = r2 + 1
            java.lang.String r11 = r11.substring(r2)     // Catch:{ NotFoundException -> 0x016e }
        L_0x0164:
            int r2 = r19.getId()     // Catch:{ NotFoundException -> 0x016e }
            o.ʢ r2 = r0.m13342((int) r2)     // Catch:{ NotFoundException -> 0x016e }
            r2.f8858 = r11     // Catch:{ NotFoundException -> 0x016e }
        L_0x016e:
            int r13 = r13 + 1
            r2 = r43
            r11 = 0
            goto L_0x0137
        L_0x0174:
            r2 = 0
        L_0x0175:
            if (r2 >= r14) goto L_0x0194
            android.view.View r13 = r0.getChildAt(r2)
            if (r13 != r0) goto L_0x0180
            o.Ιɩ r11 = r0.f11359
            goto L_0x018c
        L_0x0180:
            if (r13 != 0) goto L_0x0184
            r11 = 0
            goto L_0x018c
        L_0x0184:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            o.ь$ɩ r11 = (o.C2512.C2513) r11
            o.ʢ r11 = r11.f11409
        L_0x018c:
            if (r11 == 0) goto L_0x0191
            r11.m9641()
        L_0x0191:
            int r2 = r2 + 1
            goto L_0x0175
        L_0x0194:
            int r2 = r0.f11364
            r13 = -1
            if (r2 == r13) goto L_0x027b
            r2 = 0
        L_0x019a:
            if (r2 >= r14) goto L_0x027b
            android.view.View r13 = r0.getChildAt(r2)
            int r15 = r13.getId()
            int r11 = r0.f11364
            if (r15 != r11) goto L_0x025d
            boolean r11 = r13 instanceof o.C2425
            if (r11 == 0) goto L_0x025d
            o.з r13 = (o.C2425) r13
            o.іι r11 = r13.f11041
            if (r11 != 0) goto L_0x01b9
            o.іι r11 = new o.іι
            r11.<init>()
            r13.f11041 = r11
        L_0x01b9:
            o.іι r11 = r13.f11041
            int r15 = r13.getChildCount()
            java.util.HashMap<java.lang.Integer, o.іι$ǃ> r1 = r11.f11769
            r1.clear()
            r1 = 0
        L_0x01c5:
            if (r1 >= r15) goto L_0x024c
            r23 = r15
            android.view.View r15 = r13.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r24 = r15.getLayoutParams()
            r25 = r7
            r7 = r24
            o.з$ǃ r7 = (o.C2425.C2426) r7
            r24 = r8
            int r8 = r15.getId()
            r26 = r6
            r6 = -1
            if (r8 == r6) goto L_0x0244
            java.util.HashMap<java.lang.Integer, o.іι$ǃ> r6 = r11.f11769
            r27 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x0204
            java.util.HashMap<java.lang.Integer, o.іι$ǃ> r5 = r11.f11769
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r28 = r4
            o.іι$ǃ r4 = new o.іι$ǃ
            r29 = r3
            r3 = 0
            r4.<init>(r3)
            r5.put(r6, r4)
            goto L_0x0208
        L_0x0204:
            r29 = r3
            r28 = r4
        L_0x0208:
            java.util.HashMap<java.lang.Integer, o.іι$ǃ> r3 = r11.f11769
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r4)
            o.іι$ǃ r3 = (o.C2597.C2598) r3
            boolean r4 = r15 instanceof o.C2107
            if (r4 == 0) goto L_0x0230
            o.ν r15 = (o.C2107) r15
            r3.m13774((int) r8, (o.C2425.C2426) r7)
            boolean r4 = r15 instanceof o.C2287
            if (r4 == 0) goto L_0x0230
            r4 = 1
            r3.f11837 = r4
            o.Іι r15 = (o.C2287) r15
            int r4 = r15.f10672
            r3.f11825 = r4
            int[] r4 = r15.m11260()
            r3.f11773 = r4
        L_0x0230:
            r3.m13774((int) r8, (o.C2425.C2426) r7)
            int r1 = r1 + 1
            r15 = r23
            r8 = r24
            r7 = r25
            r6 = r26
            r5 = r27
            r4 = r28
            r3 = r29
            goto L_0x01c5
        L_0x0244:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x024c:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            o.іι r1 = r13.f11041
            r0.f11353 = r1
            goto L_0x0269
        L_0x025d:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
        L_0x0269:
            int r2 = r2 + 1
            r1 = r42
            r8 = r24
            r7 = r25
            r6 = r26
            r5 = r27
            r4 = r28
            r3 = r29
            goto L_0x019a
        L_0x027b:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            o.іι r1 = r0.f11353
            if (r1 == 0) goto L_0x028e
            r1.m13772(r0)
        L_0x028e:
            o.Ιɩ r1 = r0.f11359
            r1.m11792()
            java.util.ArrayList<o.ν> r1 = r0.f11350
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x02ac
            r2 = 0
        L_0x029c:
            if (r2 >= r1) goto L_0x02ac
            java.util.ArrayList<o.ν> r3 = r0.f11350
            java.lang.Object r3 = r3.get(r2)
            o.ν r3 = (o.C2107) r3
            r3.m11256((o.C2512) r0)
            int r2 = r2 + 1
            goto L_0x029c
        L_0x02ac:
            r1 = 0
        L_0x02ad:
            if (r1 >= r14) goto L_0x02ec
            android.view.View r2 = r0.getChildAt(r1)
            boolean r3 = r2 instanceof o.C2741
            if (r3 == 0) goto L_0x02e9
            o.Һ r2 = (o.C2741) r2
            int r3 = r2.f12754
            r4 = -1
            if (r3 != r4) goto L_0x02c9
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L_0x02c9
            int r3 = r2.f12755
            r2.setVisibility(r3)
        L_0x02c9:
            int r3 = r2.f12754
            android.view.View r3 = r0.findViewById(r3)
            r2.f12753 = r3
            android.view.View r3 = r2.f12753
            if (r3 == 0) goto L_0x02e9
            android.view.View r3 = r2.f12753
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            o.ь$ɩ r3 = (o.C2512.C2513) r3
            r4 = 1
            r3.f11377 = r4
            android.view.View r3 = r2.f12753
            r4 = 0
            r3.setVisibility(r4)
            r2.setVisibility(r4)
        L_0x02e9:
            int r1 = r1 + 1
            goto L_0x02ad
        L_0x02ec:
            r1 = 0
        L_0x02ed:
            if (r1 >= r14) goto L_0x0715
            android.view.View r2 = r0.getChildAt(r1)
            if (r2 != r0) goto L_0x02f8
            o.Ιɩ r11 = r0.f11359
            goto L_0x0304
        L_0x02f8:
            if (r2 != 0) goto L_0x02fc
            r11 = 0
            goto L_0x0304
        L_0x02fc:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            o.ь$ɩ r3 = (o.C2512.C2513) r3
            o.ʢ r11 = r3.f11409
        L_0x0304:
            if (r11 == 0) goto L_0x0705
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            o.ь$ɩ r3 = (o.C2512.C2513) r3
            r3.m13346()
            if (r10 == 0) goto L_0x0341
            android.content.res.Resources r4 = r41.getResources()     // Catch:{ NotFoundException -> 0x0340 }
            int r5 = r2.getId()     // Catch:{ NotFoundException -> 0x0340 }
            java.lang.String r4 = r4.getResourceName(r5)     // Catch:{ NotFoundException -> 0x0340 }
            int r5 = r2.getId()     // Catch:{ NotFoundException -> 0x0340 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0340 }
            r6 = 0
            r0.setDesignInformation(r6, r4, r5)     // Catch:{ NotFoundException -> 0x0340 }
            java.lang.String r5 = "id/"
            int r5 = r4.indexOf(r5)     // Catch:{ NotFoundException -> 0x0340 }
            int r5 = r5 + 3
            java.lang.String r4 = r4.substring(r5)     // Catch:{ NotFoundException -> 0x0340 }
            int r5 = r2.getId()     // Catch:{ NotFoundException -> 0x0340 }
            o.ʢ r5 = r0.m13342((int) r5)     // Catch:{ NotFoundException -> 0x0340 }
            r5.f8858 = r4     // Catch:{ NotFoundException -> 0x0340 }
            goto L_0x0341
        L_0x0340:
        L_0x0341:
            int r4 = r2.getVisibility()
            r11.f8850 = r4
            boolean r4 = r3.f11377
            if (r4 == 0) goto L_0x034f
            r4 = 8
            r11.f8850 = r4
        L_0x034f:
            r11.f8810 = r2
            o.Ιɩ r2 = r0.f11359
            r2.m11797((o.C1696) r11)
            boolean r2 = r3.f11406
            if (r2 == 0) goto L_0x035e
            boolean r2 = r3.f11416
            if (r2 != 0) goto L_0x0363
        L_0x035e:
            java.util.ArrayList<o.ʢ> r2 = r0.f11355
            r2.add(r11)
        L_0x0363:
            boolean r2 = r3.f11426
            if (r2 == 0) goto L_0x03a8
            o.ιі r11 = (o.C2065) r11
            int r2 = r3.f11405
            int r4 = r3.f11395
            float r5 = r3.f11411
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 >= r7) goto L_0x037b
            int r2 = r3.f11386
            int r4 = r3.f11365
            float r5 = r3.f11375
        L_0x037b:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x038f
            if (r6 <= 0) goto L_0x038c
            r11.f10134 = r5
            r5 = -1
            r11.f10132 = r5
            r11.f10135 = r5
            goto L_0x0705
        L_0x038c:
            r5 = -1
            goto L_0x0705
        L_0x038f:
            r5 = -1
            if (r2 == r5) goto L_0x039c
            if (r2 < 0) goto L_0x0705
            r11.f10134 = r3
            r11.f10132 = r2
            r11.f10135 = r5
            goto L_0x0705
        L_0x039c:
            if (r4 == r5) goto L_0x0705
            if (r4 < 0) goto L_0x0705
            r11.f10134 = r3
            r11.f10132 = r5
            r11.f10135 = r4
            goto L_0x0705
        L_0x03a8:
            r5 = -1
            int r2 = r3.f11407
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11408
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11371
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11421
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11417
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11402
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11368
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11369
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11389
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11424
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11414
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11378
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11387
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11398
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11401
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.f11385
            if (r2 != r5) goto L_0x03f1
            int r2 = r3.width
            if (r2 == r5) goto L_0x03f1
            int r2 = r3.height
            if (r2 != r5) goto L_0x0705
        L_0x03f1:
            int r2 = r3.f11367
            int r4 = r3.f11379
            int r5 = r3.f11376
            int r6 = r3.f11380
            int r7 = r3.f11397
            int r8 = r3.f11381
            float r13 = r3.f11404
            int r15 = android.os.Build.VERSION.SDK_INT
            r23 = r2
            r2 = 17
            if (r15 >= r2) goto L_0x044e
            int r4 = r3.f11407
            int r5 = r3.f11408
            int r6 = r3.f11371
            int r7 = r3.f11421
            int r8 = r3.f11394
            int r13 = r3.f11396
            float r15 = r3.f11392
            r2 = -1
            if (r4 != r2) goto L_0x0422
            if (r5 != r2) goto L_0x0422
            r22 = r4
            int r4 = r3.f11417
            if (r4 == r2) goto L_0x0425
            int r4 = r3.f11417
        L_0x0422:
            r22 = r4
            goto L_0x042c
        L_0x0425:
            int r4 = r3.f11402
            if (r4 == r2) goto L_0x042c
            int r4 = r3.f11402
            goto L_0x042d
        L_0x042c:
            r4 = r5
        L_0x042d:
            if (r6 != r2) goto L_0x0446
            if (r7 != r2) goto L_0x0446
            int r5 = r3.f11368
            if (r5 == r2) goto L_0x043e
            int r5 = r3.f11368
            r6 = r5
        L_0x0438:
            r33 = r8
            r37 = r13
            r5 = r4
            goto L_0x044b
        L_0x043e:
            int r5 = r3.f11369
            if (r5 == r2) goto L_0x0446
            int r5 = r3.f11369
            r7 = r5
            goto L_0x0438
        L_0x0446:
            r5 = r4
            r33 = r8
            r37 = r13
        L_0x044b:
            r4 = r22
            goto L_0x0459
        L_0x044e:
            r2 = -1
            r33 = r7
            r37 = r8
            r15 = r13
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r23
        L_0x0459:
            int r8 = r3.f11385
            if (r8 == r2) goto L_0x0486
            int r2 = r3.f11385
            o.ʢ r2 = r0.m13342((int) r2)
            if (r2 == 0) goto L_0x062e
            float r4 = r3.f11393
            int r5 = r3.f11425
            o.ʈ$ı r6 = o.C1625.C1626.CENTER
            o.ʈ$ı r7 = o.C1625.C1626.CENTER
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r6)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r7)
            r33 = 0
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r5
            r30.m9388(r31, r32, r33, r34, r35, r36)
            r11.f8838 = r4
            goto L_0x062e
        L_0x0486:
            if (r4 == r2) goto L_0x04a8
            o.ʢ r2 = r0.m13342((int) r4)
            if (r2 == 0) goto L_0x04c9
            o.ʈ$ı r4 = o.C1625.C1626.LEFT
            o.ʈ$ı r5 = o.C1625.C1626.LEFT
            int r8 = r3.leftMargin
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r8
            r30.m9388(r31, r32, r33, r34, r35, r36)
            goto L_0x04c9
        L_0x04a8:
            if (r5 == r2) goto L_0x04ca
            o.ʢ r2 = r0.m13342((int) r5)
            if (r2 == 0) goto L_0x04c9
            o.ʈ$ı r4 = o.C1625.C1626.LEFT
            o.ʈ$ı r5 = o.C1625.C1626.RIGHT
            int r8 = r3.leftMargin
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r8
            r30.m9388(r31, r32, r33, r34, r35, r36)
        L_0x04c9:
            r2 = -1
        L_0x04ca:
            if (r6 == r2) goto L_0x04ec
            o.ʢ r2 = r0.m13342((int) r6)
            if (r2 == 0) goto L_0x050d
            o.ʈ$ı r4 = o.C1625.C1626.RIGHT
            o.ʈ$ı r5 = o.C1625.C1626.LEFT
            int r6 = r3.rightMargin
            o.ʈ r34 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r35 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r38 = o.C1625.Cif.STRONG
            r39 = 0
            r40 = 1
            r36 = r6
            r34.m9388(r35, r36, r37, r38, r39, r40)
            goto L_0x050d
        L_0x04ec:
            if (r7 == r2) goto L_0x050d
            o.ʢ r2 = r0.m13342((int) r7)
            if (r2 == 0) goto L_0x050d
            o.ʈ$ı r4 = o.C1625.C1626.RIGHT
            o.ʈ$ı r5 = o.C1625.C1626.RIGHT
            int r6 = r3.rightMargin
            o.ʈ r34 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r35 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r38 = o.C1625.Cif.STRONG
            r39 = 0
            r40 = 1
            r36 = r6
            r34.m9388(r35, r36, r37, r38, r39, r40)
        L_0x050d:
            int r2 = r3.f11389
            r4 = -1
            if (r2 == r4) goto L_0x0538
            int r2 = r3.f11389
            o.ʢ r2 = r0.m13342((int) r2)
            if (r2 == 0) goto L_0x0562
            o.ʈ$ı r4 = o.C1625.C1626.TOP
            o.ʈ$ı r5 = o.C1625.C1626.TOP
            int r6 = r3.topMargin
            int r7 = r3.f11373
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r6
            r33 = r7
            r30.m9388(r31, r32, r33, r34, r35, r36)
            goto L_0x0562
        L_0x0538:
            int r2 = r3.f11424
            r4 = -1
            if (r2 == r4) goto L_0x0562
            int r2 = r3.f11424
            o.ʢ r2 = r0.m13342((int) r2)
            if (r2 == 0) goto L_0x0562
            o.ʈ$ı r4 = o.C1625.C1626.TOP
            o.ʈ$ı r5 = o.C1625.C1626.BOTTOM
            int r6 = r3.topMargin
            int r7 = r3.f11373
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r6
            r33 = r7
            r30.m9388(r31, r32, r33, r34, r35, r36)
        L_0x0562:
            int r2 = r3.f11414
            r4 = -1
            if (r2 == r4) goto L_0x058d
            int r2 = r3.f11414
            o.ʢ r2 = r0.m13342((int) r2)
            if (r2 == 0) goto L_0x05b7
            o.ʈ$ı r4 = o.C1625.C1626.BOTTOM
            o.ʈ$ı r5 = o.C1625.C1626.TOP
            int r6 = r3.bottomMargin
            int r7 = r3.f11382
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r6
            r33 = r7
            r30.m9388(r31, r32, r33, r34, r35, r36)
            goto L_0x05b7
        L_0x058d:
            int r2 = r3.f11378
            r4 = -1
            if (r2 == r4) goto L_0x05b7
            int r2 = r3.f11378
            o.ʢ r2 = r0.m13342((int) r2)
            if (r2 == 0) goto L_0x05b7
            o.ʈ$ı r4 = o.C1625.C1626.BOTTOM
            o.ʈ$ı r5 = o.C1625.C1626.BOTTOM
            int r6 = r3.bottomMargin
            int r7 = r3.f11382
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r4)
            o.ʈ r31 = r2.m9629((o.C1625.C1626) r5)
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r32 = r6
            r33 = r7
            r30.m9388(r31, r32, r33, r34, r35, r36)
        L_0x05b7:
            int r2 = r3.f11387
            r4 = -1
            if (r2 == r4) goto L_0x060e
            android.util.SparseArray<android.view.View> r2 = r0.f11352
            int r4 = r3.f11387
            java.lang.Object r2 = r2.get(r4)
            android.view.View r2 = (android.view.View) r2
            int r4 = r3.f11387
            o.ʢ r4 = r0.m13342((int) r4)
            if (r4 == 0) goto L_0x060e
            if (r2 == 0) goto L_0x060e
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            boolean r5 = r5 instanceof o.C2512.C2513
            if (r5 == 0) goto L_0x060e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            o.ь$ɩ r2 = (o.C2512.C2513) r2
            r5 = 1
            r3.f11410 = r5
            r2.f11410 = r5
            o.ʈ$ı r2 = o.C1625.C1626.BASELINE
            o.ʈ r30 = r11.m9629((o.C1625.C1626) r2)
            o.ʈ$ı r2 = o.C1625.C1626.BASELINE
            o.ʈ r31 = r4.m9629((o.C1625.C1626) r2)
            r32 = 0
            r33 = -1
            o.ʈ$if r34 = o.C1625.Cif.STRONG
            r35 = 0
            r36 = 1
            r30.m9388(r31, r32, r33, r34, r35, r36)
            o.ʈ$ı r2 = o.C1625.C1626.TOP
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            r2.m9387()
            o.ʈ$ı r2 = o.C1625.C1626.BOTTOM
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            r2.m9387()
        L_0x060e:
            r2 = 0
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x061b
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x061b
            r11.f8853 = r15
        L_0x061b:
            float r2 = r3.f11390
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x062e
            float r2 = r3.f11390
            r4 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x062e
            float r2 = r3.f11390
            r11.f8868 = r2
        L_0x062e:
            if (r10 == 0) goto L_0x0640
            int r2 = r3.f11398
            r4 = -1
            if (r2 != r4) goto L_0x0639
            int r2 = r3.f11401
            if (r2 == r4) goto L_0x0640
        L_0x0639:
            int r2 = r3.f11398
            int r4 = r3.f11401
            r11.m9637(r2, r4)
        L_0x0640:
            boolean r2 = r3.f11416
            if (r2 != 0) goto L_0x066d
            int r2 = r3.width
            r4 = -1
            if (r2 != r4) goto L_0x0663
            o.ʢ$ɩ r2 = o.C1696.C1697.MATCH_PARENT
            r11.m9623((o.C1696.C1697) r2)
            o.ʈ$ı r2 = o.C1625.C1626.LEFT
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            int r4 = r3.leftMargin
            r2.f8544 = r4
            o.ʈ$ı r2 = o.C1625.C1626.RIGHT
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            int r4 = r3.rightMargin
            r2.f8544 = r4
            goto L_0x0677
        L_0x0663:
            o.ʢ$ɩ r2 = o.C1696.C1697.MATCH_CONSTRAINT
            r11.m9623((o.C1696.C1697) r2)
            r2 = 0
            r11.m9645((int) r2)
            goto L_0x0677
        L_0x066d:
            o.ʢ$ɩ r2 = o.C1696.C1697.FIXED
            r11.m9623((o.C1696.C1697) r2)
            int r2 = r3.width
            r11.m9645((int) r2)
        L_0x0677:
            boolean r2 = r3.f11406
            if (r2 != 0) goto L_0x06a4
            int r2 = r3.height
            r4 = -1
            if (r2 != r4) goto L_0x069a
            o.ʢ$ɩ r2 = o.C1696.C1697.MATCH_PARENT
            r11.m9648((o.C1696.C1697) r2)
            o.ʈ$ı r2 = o.C1625.C1626.TOP
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            int r4 = r3.topMargin
            r2.f8544 = r4
            o.ʈ$ı r2 = o.C1625.C1626.BOTTOM
            o.ʈ r2 = r11.m9629((o.C1625.C1626) r2)
            int r4 = r3.bottomMargin
            r2.f8544 = r4
            goto L_0x06ae
        L_0x069a:
            o.ʢ$ɩ r2 = o.C1696.C1697.MATCH_CONSTRAINT
            r11.m9648((o.C1696.C1697) r2)
            r2 = 0
            r11.m9651((int) r2)
            goto L_0x06ae
        L_0x06a4:
            o.ʢ$ɩ r2 = o.C1696.C1697.FIXED
            r11.m9648((o.C1696.C1697) r2)
            int r2 = r3.height
            r11.m9651((int) r2)
        L_0x06ae:
            java.lang.String r2 = r3.f11374
            if (r2 == 0) goto L_0x06b7
            java.lang.String r2 = r3.f11374
            r11.m9647((java.lang.String) r2)
        L_0x06b7:
            float r2 = r3.f11383
            float[] r4 = r11.f8825
            r5 = 0
            r4[r5] = r2
            float r2 = r3.f11384
            float[] r4 = r11.f8825
            r5 = 1
            r4[r5] = r2
            int r2 = r3.f11403
            r11.f8821 = r2
            int r2 = r3.f11412
            r11.f8823 = r2
            int r2 = r3.f11415
            int r4 = r3.f11418
            int r5 = r3.f11419
            float r6 = r3.f11420
            r11.f8863 = r2
            r11.f8866 = r4
            r11.f8867 = r5
            r11.f8822 = r6
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x06ea
            int r4 = r11.f8863
            if (r4 != 0) goto L_0x06ea
            r4 = 2
            r11.f8863 = r4
        L_0x06ea:
            int r4 = r3.f11413
            int r5 = r3.f11422
            int r6 = r3.f11423
            float r3 = r3.f11388
            r11.f8815 = r4
            r11.f8829 = r5
            r11.f8837 = r6
            r11.f8831 = r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0705
            int r2 = r11.f8815
            if (r2 != 0) goto L_0x0705
            r2 = 2
            r11.f8815 = r2
        L_0x0705:
            int r1 = r1 + 1
            goto L_0x02ed
        L_0x0709:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
        L_0x0715:
            r1 = 1
            goto L_0x0724
        L_0x0717:
            r29 = r3
            r28 = r4
            r27 = r5
            r26 = r6
            r25 = r7
            r24 = r8
            r1 = 0
        L_0x0724:
            int r2 = r0.f11357
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x072d
            r2 = 1
            goto L_0x072e
        L_0x072d:
            r2 = 0
        L_0x072e:
            if (r2 == 0) goto L_0x073e
            o.Ιɩ r3 = r0.f11359
            r3.m10025()
            o.Ιɩ r3 = r0.f11359
            r3.m10027(r9, r12)
            r41.m13343(r42, r43)
            goto L_0x0741
        L_0x073e:
            r41.m13340(r42, r43)
        L_0x0741:
            r41.m13339()
            int r3 = r41.getChildCount()
            if (r3 <= 0) goto L_0x0751
            if (r1 == 0) goto L_0x0751
            o.Ιɩ r1 = r0.f11359
            o.C1460.m8728(r1)
        L_0x0751:
            o.Ιɩ r1 = r0.f11359
            boolean r1 = r1.f9284
            if (r1 == 0) goto L_0x07ac
            o.Ιɩ r1 = r0.f11359
            boolean r1 = r1.f9296
            if (r1 == 0) goto L_0x077d
            r1 = r29
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L_0x077a
            o.Ιɩ r3 = r0.f11359
            int r3 = r3.f9285
            r4 = r28
            if (r3 >= r4) goto L_0x0772
            o.Ιɩ r3 = r0.f11359
            int r5 = r3.f9285
            r3.m9645((int) r5)
        L_0x0772:
            o.Ιɩ r3 = r0.f11359
            o.ʢ$ɩ r5 = o.C1696.C1697.FIXED
            r3.m9623((o.C1696.C1697) r5)
            goto L_0x0781
        L_0x077a:
            r4 = r28
            goto L_0x0781
        L_0x077d:
            r4 = r28
            r1 = r29
        L_0x0781:
            o.Ιɩ r3 = r0.f11359
            boolean r3 = r3.f9299
            if (r3 == 0) goto L_0x07a7
            r3 = r27
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r5) goto L_0x07a4
            o.Ιɩ r5 = r0.f11359
            int r5 = r5.f9289
            r6 = r26
            if (r5 >= r6) goto L_0x079c
            o.Ιɩ r5 = r0.f11359
            int r7 = r5.f9289
            r5.m9651((int) r7)
        L_0x079c:
            o.Ιɩ r5 = r0.f11359
            o.ʢ$ɩ r7 = o.C1696.C1697.FIXED
            r5.m9648((o.C1696.C1697) r7)
            goto L_0x07b4
        L_0x07a4:
            r6 = r26
            goto L_0x07b4
        L_0x07a7:
            r6 = r26
            r3 = r27
            goto L_0x07b4
        L_0x07ac:
            r6 = r26
            r3 = r27
            r4 = r28
            r1 = r29
        L_0x07b4:
            int r5 = r0.f11357
            r7 = 32
            r5 = r5 & r7
            if (r5 != r7) goto L_0x081d
            o.Ιɩ r5 = r0.f11359
            int r7 = r5.f8850
            r8 = 8
            if (r7 != r8) goto L_0x07c5
            r11 = 0
            goto L_0x07c7
        L_0x07c5:
            int r11 = r5.f8827
        L_0x07c7:
            o.Ιɩ r5 = r0.f11359
            int r7 = r5.f8850
            if (r7 != r8) goto L_0x07cf
            r5 = 0
            goto L_0x07d1
        L_0x07cf:
            int r5 = r5.f8836
        L_0x07d1:
            int r7 = r0.f11356
            if (r7 == r11) goto L_0x07e2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 != r7) goto L_0x07e4
            o.Ιɩ r1 = r0.f11359
            java.util.List<o.ιІ> r1 = r1.f9297
            r8 = 0
            o.C1460.m8727(r1, r8, r11)
            goto L_0x07e4
        L_0x07e2:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x07e4:
            int r1 = r0.f11358
            if (r1 == r5) goto L_0x07f2
            if (r3 != r7) goto L_0x07f2
            o.Ιɩ r1 = r0.f11359
            java.util.List<o.ιІ> r1 = r1.f9297
            r3 = 1
            o.C1460.m8727(r1, r3, r5)
        L_0x07f2:
            o.Ιɩ r1 = r0.f11359
            boolean r1 = r1.f9296
            if (r1 == 0) goto L_0x0807
            o.Ιɩ r1 = r0.f11359
            int r1 = r1.f9285
            if (r1 <= r4) goto L_0x0807
            o.Ιɩ r1 = r0.f11359
            java.util.List<o.ιІ> r1 = r1.f9297
            r3 = 0
            o.C1460.m8727(r1, r3, r4)
            goto L_0x0808
        L_0x0807:
            r3 = 0
        L_0x0808:
            o.Ιɩ r1 = r0.f11359
            boolean r1 = r1.f9299
            if (r1 == 0) goto L_0x081e
            o.Ιɩ r1 = r0.f11359
            int r1 = r1.f9289
            if (r1 <= r6) goto L_0x081e
            o.Ιɩ r1 = r0.f11359
            java.util.List<o.ιІ> r1 = r1.f9297
            r4 = 1
            o.C1460.m8727(r1, r4, r6)
            goto L_0x081e
        L_0x081d:
            r3 = 0
        L_0x081e:
            int r1 = r41.getChildCount()
            if (r1 <= 0) goto L_0x0829
            o.Ιɩ r1 = r0.f11359
            r1.m11791()
        L_0x0829:
            java.util.ArrayList<o.ʢ> r1 = r0.f11355
            int r1 = r1.size()
            int r4 = r41.getPaddingBottom()
            int r8 = r24 + r4
            int r4 = r41.getPaddingRight()
            int r7 = r25 + r4
            if (r1 <= 0) goto L_0x0aaf
            o.Ιɩ r5 = r0.f11359
            o.ʢ$ɩ r5 = r5.m9625()
            o.ʢ$ɩ r6 = o.C1696.C1697.WRAP_CONTENT
            if (r5 != r6) goto L_0x0849
            r5 = 1
            goto L_0x084a
        L_0x0849:
            r5 = 0
        L_0x084a:
            o.Ιɩ r6 = r0.f11359
            o.ʢ$ɩ r6 = r6.m9643()
            o.ʢ$ɩ r10 = o.C1696.C1697.WRAP_CONTENT
            if (r6 != r10) goto L_0x0856
            r6 = 1
            goto L_0x0857
        L_0x0856:
            r6 = 0
        L_0x0857:
            o.Ιɩ r10 = r0.f11359
            int r11 = r10.f8850
            r13 = 8
            if (r11 != r13) goto L_0x0861
            r11 = 0
            goto L_0x0863
        L_0x0861:
            int r11 = r10.f8827
        L_0x0863:
            int r10 = r0.f11360
            int r10 = java.lang.Math.max(r11, r10)
            o.Ιɩ r11 = r0.f11359
            int r14 = r11.f8850
            if (r14 != r13) goto L_0x0871
            r11 = 0
            goto L_0x0873
        L_0x0871:
            int r11 = r11.f8836
        L_0x0873:
            int r13 = r0.f11362
            int r11 = java.lang.Math.max(r11, r13)
            r13 = r10
            r14 = r11
            r10 = 0
            r11 = 0
            r15 = 0
        L_0x087e:
            if (r10 >= r1) goto L_0x09fc
            java.util.ArrayList<o.ʢ> r3 = r0.f11355
            java.lang.Object r3 = r3.get(r10)
            o.ʢ r3 = (o.C1696) r3
            java.lang.Object r4 = r3.f8810
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x09e2
            android.view.ViewGroup$LayoutParams r19 = r4.getLayoutParams()
            r20 = r1
            r1 = r19
            o.ь$ɩ r1 = (o.C2512.C2513) r1
            r19 = r12
            boolean r12 = r1.f11366
            if (r12 != 0) goto L_0x09db
            boolean r12 = r1.f11426
            if (r12 != 0) goto L_0x09db
            int r12 = r4.getVisibility()
            r23 = r9
            r9 = 8
            if (r12 == r9) goto L_0x09d6
            if (r2 == 0) goto L_0x08dd
            o.ιӀ r9 = r3.f8851
            if (r9 != 0) goto L_0x08b9
            o.ιӀ r9 = new o.ιӀ
            r9.<init>()
            r3.f8851 = r9
        L_0x08b9:
            o.ιӀ r9 = r3.f8851
            int r9 = r9.f13030
            r12 = 1
            if (r9 != r12) goto L_0x08c2
            r9 = 1
            goto L_0x08c3
        L_0x08c2:
            r9 = 0
        L_0x08c3:
            if (r9 == 0) goto L_0x08dd
            o.ιӀ r9 = r3.f8833
            if (r9 != 0) goto L_0x08d0
            o.ιӀ r9 = new o.ιӀ
            r9.<init>()
            r3.f8833 = r9
        L_0x08d0:
            o.ιӀ r9 = r3.f8833
            int r9 = r9.f13030
            r12 = 1
            if (r9 != r12) goto L_0x08d9
            r9 = 1
            goto L_0x08da
        L_0x08d9:
            r9 = 0
        L_0x08da:
            if (r9 != 0) goto L_0x09d6
            goto L_0x08de
        L_0x08dd:
            r12 = 1
        L_0x08de:
            int r9 = r1.width
            r12 = -2
            if (r9 != r12) goto L_0x08f0
            boolean r9 = r1.f11416
            if (r9 == 0) goto L_0x08f0
            int r9 = r1.width
            r12 = r42
            int r9 = getChildMeasureSpec(r12, r7, r9)
            goto L_0x0902
        L_0x08f0:
            r12 = r42
            int r9 = r3.f8850
            r12 = 8
            if (r9 != r12) goto L_0x08fa
            r9 = 0
            goto L_0x08fc
        L_0x08fa:
            int r9 = r3.f8827
        L_0x08fc:
            r12 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
        L_0x0902:
            int r12 = r1.height
            r25 = r7
            r7 = -2
            if (r12 != r7) goto L_0x0916
            boolean r7 = r1.f11406
            if (r7 == 0) goto L_0x0916
            int r7 = r1.height
            r12 = r43
            int r7 = getChildMeasureSpec(r12, r8, r7)
            goto L_0x0928
        L_0x0916:
            r12 = r43
            int r7 = r3.f8850
            r12 = 8
            if (r7 != r12) goto L_0x0920
            r7 = 0
            goto L_0x0922
        L_0x0920:
            int r7 = r3.f8836
        L_0x0922:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
        L_0x0928:
            r4.measure(r9, r7)
            int r7 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r12 = r3.f8850
            r24 = r8
            r8 = 8
            if (r12 != r8) goto L_0x093d
            r8 = 0
            goto L_0x093f
        L_0x093d:
            int r8 = r3.f8827
        L_0x093f:
            if (r7 == r8) goto L_0x0973
            r3.m9645((int) r7)
            if (r2 == 0) goto L_0x0956
            o.ιӀ r8 = r3.f8851
            if (r8 != 0) goto L_0x0951
            o.ιӀ r8 = new o.ιӀ
            r8.<init>()
            r3.f8851 = r8
        L_0x0951:
            o.ιӀ r8 = r3.f8851
            r8.m11003(r7)
        L_0x0956:
            if (r5 == 0) goto L_0x0971
            int r7 = r3.m9642()
            if (r7 <= r13) goto L_0x0971
            int r7 = r3.m9642()
            o.ʈ$ı r8 = o.C1625.C1626.RIGHT
            o.ʈ r8 = r3.m9629((o.C1625.C1626) r8)
            int r8 = r8.m9386()
            int r7 = r7 + r8
            int r13 = java.lang.Math.max(r13, r7)
        L_0x0971:
            r12 = 1
            goto L_0x0974
        L_0x0973:
            r12 = r11
        L_0x0974:
            int r7 = r3.f8850
            r8 = 8
            if (r7 != r8) goto L_0x097c
            r11 = 0
            goto L_0x097e
        L_0x097c:
            int r11 = r3.f8836
        L_0x097e:
            if (r9 == r11) goto L_0x09b2
            r3.m9651((int) r9)
            if (r2 == 0) goto L_0x0995
            o.ιӀ r7 = r3.f8833
            if (r7 != 0) goto L_0x0990
            o.ιӀ r7 = new o.ιӀ
            r7.<init>()
            r3.f8833 = r7
        L_0x0990:
            o.ιӀ r7 = r3.f8833
            r7.m11003(r9)
        L_0x0995:
            if (r6 == 0) goto L_0x09b1
            int r7 = r3.m9634()
            if (r7 <= r14) goto L_0x09b1
            int r7 = r3.m9634()
            o.ʈ$ı r8 = o.C1625.C1626.BOTTOM
            o.ʈ r8 = r3.m9629((o.C1625.C1626) r8)
            int r8 = r8.m9386()
            int r7 = r7 + r8
            int r7 = java.lang.Math.max(r14, r7)
            r14 = r7
        L_0x09b1:
            r12 = 1
        L_0x09b2:
            boolean r1 = r1.f11410
            if (r1 == 0) goto L_0x09c5
            int r1 = r4.getBaseline()
            r7 = -1
            if (r1 == r7) goto L_0x09c6
            int r8 = r3.f8835
            if (r1 == r8) goto L_0x09c6
            r3.f8835 = r1
            r12 = 1
            goto L_0x09c6
        L_0x09c5:
            r7 = -1
        L_0x09c6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r1 < r3) goto L_0x09d4
            int r1 = r4.getMeasuredState()
            int r15 = combineMeasuredStates(r15, r1)
        L_0x09d4:
            r11 = r12
            goto L_0x09ed
        L_0x09d6:
            r25 = r7
            r24 = r8
            goto L_0x09ec
        L_0x09db:
            r25 = r7
            r24 = r8
            r23 = r9
            goto L_0x09ec
        L_0x09e2:
            r20 = r1
            r25 = r7
            r24 = r8
            r23 = r9
            r19 = r12
        L_0x09ec:
            r7 = -1
        L_0x09ed:
            int r10 = r10 + 1
            r12 = r19
            r1 = r20
            r9 = r23
            r8 = r24
            r7 = r25
            r3 = 0
            goto L_0x087e
        L_0x09fc:
            r20 = r1
            r25 = r7
            r24 = r8
            r23 = r9
            r19 = r12
            if (r11 == 0) goto L_0x0a55
            o.Ιɩ r1 = r0.f11359
            r9 = r23
            r1.m9645((int) r9)
            o.Ιɩ r1 = r0.f11359
            r11 = r19
            r1.m9651((int) r11)
            if (r2 == 0) goto L_0x0a1d
            o.Ιɩ r1 = r0.f11359
            r1.m10024()
        L_0x0a1d:
            o.Ιɩ r1 = r0.f11359
            r1.m11791()
            o.Ιɩ r1 = r0.f11359
            int r2 = r1.f8850
            r3 = 8
            if (r2 != r3) goto L_0x0a2c
            r11 = 0
            goto L_0x0a2e
        L_0x0a2c:
            int r11 = r1.f8827
        L_0x0a2e:
            if (r11 >= r13) goto L_0x0a37
            o.Ιɩ r1 = r0.f11359
            r1.m9645((int) r13)
            r12 = 1
            goto L_0x0a38
        L_0x0a37:
            r12 = 0
        L_0x0a38:
            o.Ιɩ r1 = r0.f11359
            int r2 = r1.f8850
            if (r2 != r3) goto L_0x0a40
            r11 = 0
            goto L_0x0a42
        L_0x0a40:
            int r11 = r1.f8836
        L_0x0a42:
            if (r11 >= r14) goto L_0x0a4c
            o.Ιɩ r1 = r0.f11359
            r1.m9651((int) r14)
            r21 = 1
            goto L_0x0a4e
        L_0x0a4c:
            r21 = r12
        L_0x0a4e:
            if (r21 == 0) goto L_0x0a55
            o.Ιɩ r1 = r0.f11359
            r1.m11791()
        L_0x0a55:
            r1 = r20
            r2 = 0
        L_0x0a58:
            if (r2 >= r1) goto L_0x0ab4
            java.util.ArrayList<o.ʢ> r3 = r0.f11355
            java.lang.Object r3 = r3.get(r2)
            o.ʢ r3 = (o.C1696) r3
            java.lang.Object r4 = r3.f8810
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0aaa
            int r5 = r4.getMeasuredWidth()
            int r6 = r3.f8850
            r7 = 8
            if (r6 != r7) goto L_0x0a74
            r11 = 0
            goto L_0x0a76
        L_0x0a74:
            int r11 = r3.f8827
        L_0x0a76:
            if (r5 != r11) goto L_0x0a86
            int r5 = r4.getMeasuredHeight()
            int r6 = r3.f8850
            if (r6 != r7) goto L_0x0a82
            r11 = 0
            goto L_0x0a84
        L_0x0a82:
            int r11 = r3.f8836
        L_0x0a84:
            if (r5 == r11) goto L_0x0aaa
        L_0x0a86:
            int r5 = r3.f8850
            if (r5 == r7) goto L_0x0aaa
            int r5 = r3.f8850
            if (r5 != r7) goto L_0x0a92
            r5 = 1073741824(0x40000000, float:2.0)
            r11 = 0
            goto L_0x0a96
        L_0x0a92:
            int r11 = r3.f8827
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x0a96:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            int r8 = r3.f8850
            if (r8 != r7) goto L_0x0aa0
            r11 = 0
            goto L_0x0aa2
        L_0x0aa0:
            int r11 = r3.f8836
        L_0x0aa2:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r4.measure(r6, r3)
            goto L_0x0aac
        L_0x0aaa:
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x0aac:
            int r2 = r2 + 1
            goto L_0x0a58
        L_0x0aaf:
            r25 = r7
            r24 = r8
            r15 = 0
        L_0x0ab4:
            o.Ιɩ r1 = r0.f11359
            int r2 = r1.f8850
            r3 = 8
            if (r2 != r3) goto L_0x0abe
            r11 = 0
            goto L_0x0ac0
        L_0x0abe:
            int r11 = r1.f8827
        L_0x0ac0:
            int r11 = r11 + r25
            o.Ιɩ r1 = r0.f11359
            int r2 = r1.f8850
            if (r2 != r3) goto L_0x0aca
            r1 = 0
            goto L_0x0acc
        L_0x0aca:
            int r1 = r1.f8836
        L_0x0acc:
            int r1 = r1 + r24
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L_0x0b0b
            r2 = r42
            int r2 = resolveSizeAndState(r11, r2, r15)
            int r3 = r15 << 16
            r4 = r43
            int r1 = resolveSizeAndState(r1, r4, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 & r3
            int r3 = r0.f11351
            int r2 = java.lang.Math.min(r3, r2)
            int r3 = r0.f11363
            int r1 = java.lang.Math.min(r3, r1)
            o.Ιɩ r3 = r0.f11359
            boolean r3 = r3.f9287
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0afc
            r2 = r2 | r4
        L_0x0afc:
            o.Ιɩ r3 = r0.f11359
            boolean r3 = r3.f9293
            if (r3 == 0) goto L_0x0b03
            r1 = r1 | r4
        L_0x0b03:
            r0.setMeasuredDimension(r2, r1)
            r0.f11356 = r2
            r0.f11358 = r1
            return
        L_0x0b0b:
            r0.setMeasuredDimension(r11, r1)
            r0.f11356 = r11
            r0.f11358 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2512.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C2513 r0 = (C2513) childAt.getLayoutParams();
            C1696 r1 = r0.f11409;
            if ((childAt.getVisibility() != 8 || r0.f11426 || r0.f11366 || isInEditMode) && !r0.f11377) {
                int i8 = r1.f8861 + r1.f8832;
                int i9 = r1.f8864 + r1.f8862;
                if (r1.f8850 == 8) {
                    i5 = 0;
                } else {
                    i5 = r1.f8827;
                }
                int i10 = i5 + i8;
                if (r1.f8850 == 8) {
                    i6 = 0;
                } else {
                    i6 = r1.f8836;
                }
                int i11 = i6 + i9;
                childAt.layout(i8, i9, i10, i11);
                if ((childAt instanceof C2741) && (view = ((C2741) childAt).f12753) != null) {
                    view.setVisibility(0);
                    view.layout(i8, i9, i10, i11);
                }
            }
        }
        int size = this.f11350.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                this.f11350.get(i12).m11258();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.f11359.f9286 = i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    protected static C2513 m13341() {
        return new C2513();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2513(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2513;
    }

    public void setConstraintSet(C2597 r1) {
        this.f11353 = r1;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) i3;
                        float f3 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f10 = parseInt4;
                        float f11 = f7;
                        canvas2.drawLine(f8, f10, f11, f9, paint);
                        float f12 = f7;
                        canvas2.drawLine(f12, f10, f11, f5, paint);
                        paint.setColor(-16711936);
                        float f13 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f12, f5, f13, parseInt4, paint);
                        canvas2.drawLine(f12, parseInt4, f13, f5, paint);
                    }
                }
            }
        }
    }

    /* renamed from: o.ь$ɩ  reason: contains not printable characters */
    public static class C2513 extends ViewGroup.MarginLayoutParams {

        /* renamed from: ı  reason: contains not printable characters */
        public int f11365 = -1;

        /* renamed from: ıı  reason: contains not printable characters */
        boolean f11366 = false;

        /* renamed from: ıǃ  reason: contains not printable characters */
        int f11367 = -1;

        /* renamed from: ŀ  reason: contains not printable characters */
        public int f11368 = -1;

        /* renamed from: ł  reason: contains not printable characters */
        public int f11369 = -1;

        /* renamed from: ſ  reason: contains not printable characters */
        public int f11370 = -1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public int f11371 = -1;

        /* renamed from: Ɨ  reason: contains not printable characters */
        public int f11372 = -1;

        /* renamed from: ƚ  reason: contains not printable characters */
        public int f11373 = -1;

        /* renamed from: ǀ  reason: contains not printable characters */
        public String f11374 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        public float f11375 = -1.0f;

        /* renamed from: ǃı  reason: contains not printable characters */
        int f11376 = -1;

        /* renamed from: ǃǃ  reason: contains not printable characters */
        boolean f11377 = false;

        /* renamed from: ȷ  reason: contains not printable characters */
        public int f11378 = -1;

        /* renamed from: ɂ  reason: contains not printable characters */
        int f11379 = -1;

        /* renamed from: Ɉ  reason: contains not printable characters */
        int f11380 = -1;

        /* renamed from: ɉ  reason: contains not printable characters */
        int f11381 = -1;

        /* renamed from: ɍ  reason: contains not printable characters */
        public int f11382 = -1;

        /* renamed from: ɔ  reason: contains not printable characters */
        public float f11383 = -1.0f;

        /* renamed from: ɟ  reason: contains not printable characters */
        public float f11384 = -1.0f;

        /* renamed from: ɨ  reason: contains not printable characters */
        public int f11385 = -1;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f11386 = -1;

        /* renamed from: ɪ  reason: contains not printable characters */
        public int f11387 = -1;

        /* renamed from: ɭ  reason: contains not printable characters */
        public float f11388 = 1.0f;

        /* renamed from: ɹ  reason: contains not printable characters */
        public int f11389 = -1;

        /* renamed from: ɺ  reason: contains not printable characters */
        public float f11390 = 0.5f;

        /* renamed from: ɻ  reason: contains not printable characters */
        public boolean f11391 = false;

        /* renamed from: ɼ  reason: contains not printable characters */
        public float f11392 = 0.5f;

        /* renamed from: ɾ  reason: contains not printable characters */
        public float f11393 = 0.0f;

        /* renamed from: ɿ  reason: contains not printable characters */
        public int f11394 = -1;

        /* renamed from: ʃ  reason: contains not printable characters */
        int f11395;

        /* renamed from: ʅ  reason: contains not printable characters */
        public int f11396 = -1;

        /* renamed from: ʌ  reason: contains not printable characters */
        int f11397 = -1;

        /* renamed from: ʏ  reason: contains not printable characters */
        public int f11398 = -1;

        /* renamed from: ʔ  reason: contains not printable characters */
        public int f11399 = -1;

        /* renamed from: ʕ  reason: contains not printable characters */
        public boolean f11400 = false;

        /* renamed from: ʖ  reason: contains not printable characters */
        public int f11401 = -1;

        /* renamed from: ʟ  reason: contains not printable characters */
        public int f11402 = -1;

        /* renamed from: ͻ  reason: contains not printable characters */
        public int f11403 = 0;

        /* renamed from: ͼ  reason: contains not printable characters */
        float f11404 = 0.5f;

        /* renamed from: ͽ  reason: contains not printable characters */
        int f11405;

        /* renamed from: Γ  reason: contains not printable characters */
        boolean f11406 = true;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f11407 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        public int f11408 = -1;

        /* renamed from: ς  reason: contains not printable characters */
        C1696 f11409 = new C1696();

        /* renamed from: τ  reason: contains not printable characters */
        boolean f11410 = false;

        /* renamed from: ϛ  reason: contains not printable characters */
        float f11411;

        /* renamed from: ϲ  reason: contains not printable characters */
        public int f11412 = 0;

        /* renamed from: ϳ  reason: contains not printable characters */
        public int f11413 = 0;

        /* renamed from: І  reason: contains not printable characters */
        public int f11414 = -1;

        /* renamed from: Ј  reason: contains not printable characters */
        public int f11415 = 0;

        /* renamed from: Г  reason: contains not printable characters */
        boolean f11416 = true;

        /* renamed from: г  reason: contains not printable characters */
        public int f11417 = -1;

        /* renamed from: с  reason: contains not printable characters */
        public int f11418 = 0;

        /* renamed from: т  reason: contains not printable characters */
        public int f11419 = 0;

        /* renamed from: х  reason: contains not printable characters */
        public float f11420 = 1.0f;

        /* renamed from: і  reason: contains not printable characters */
        public int f11421 = -1;

        /* renamed from: ј  reason: contains not printable characters */
        public int f11422 = 0;

        /* renamed from: ґ  reason: contains not printable characters */
        public int f11423 = 0;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public int f11424 = -1;

        /* renamed from: ӏ  reason: contains not printable characters */
        public int f11425 = 0;

        /* renamed from: ӷ  reason: contains not printable characters */
        boolean f11426 = false;

        /* renamed from: o.ь$ɩ$If */
        static class If {

            /* renamed from: ι  reason: contains not printable characters */
            public static final SparseIntArray f11427;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f11427 = sparseIntArray;
                sparseIntArray.append(C2724.C2725.f12693, 8);
                f11427.append(C2724.C2725.f12649, 9);
                f11427.append(C2724.C2725.f12699, 10);
                f11427.append(C2724.C2725.f12708, 11);
                f11427.append(C2724.C2725.f12665, 12);
                f11427.append(C2724.C2725.f12664, 13);
                f11427.append(C2724.C2725.f12666, 14);
                f11427.append(C2724.C2725.f12602, 15);
                f11427.append(C2724.C2725.f12625, 16);
                f11427.append(C2724.C2725.f12601, 2);
                f11427.append(C2724.C2725.f12696, 3);
                f11427.append(C2724.C2725.f12656, 4);
                f11427.append(C2724.C2725.f12614, 49);
                f11427.append(C2724.C2725.f12628, 50);
                f11427.append(C2724.C2725.f12631, 5);
                f11427.append(C2724.C2725.f12603, 6);
                f11427.append(C2724.C2725.f12635, 7);
                f11427.append(C2724.C2725.f12587, 1);
                f11427.append(C2724.C2725.f12711, 17);
                f11427.append(C2724.C2725.f12663, 18);
                f11427.append(C2724.C2725.f12658, 19);
                f11427.append(C2724.C2725.f12608, 20);
                f11427.append(C2724.C2725.f12657, 21);
                f11427.append(C2724.C2725.f12630, 22);
                f11427.append(C2724.C2725.f12661, 23);
                f11427.append(C2724.C2725.f12629, 24);
                f11427.append(C2724.C2725.f12668, 25);
                f11427.append(C2724.C2725.f12616, 26);
                f11427.append(C2724.C2725.f12698, 29);
                f11427.append(C2724.C2725.f12652, 30);
                f11427.append(C2724.C2725.f12609, 44);
                f11427.append(C2724.C2725.f12689, 45);
                f11427.append(C2724.C2725.f12684, 46);
                f11427.append(C2724.C2725.f12688, 47);
                f11427.append(C2724.C2725.f12588, 48);
                f11427.append(C2724.C2725.f12646, 27);
                f11427.append(C2724.C2725.f12637, 28);
                f11427.append(C2724.C2725.f12694, 31);
                f11427.append(C2724.C2725.f12651, 32);
                f11427.append(C2724.C2725.f12720, 33);
                f11427.append(C2724.C2725.f12670, 34);
                f11427.append(C2724.C2725.f12590, 35);
                f11427.append(C2724.C2725.f12632, 36);
                f11427.append(C2724.C2725.f12612, 37);
                f11427.append(C2724.C2725.f12653, 38);
                f11427.append(C2724.C2725.f12667, 39);
                f11427.append(C2724.C2725.f12662, 40);
                f11427.append(C2724.C2725.f12701, 41);
                f11427.append(C2724.C2725.f12655, 42);
                f11427.append(C2724.C2725.f12718, 43);
            }
        }

        public C2513(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2724.C2725.f12613);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = If.f11427.get(index);
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        this.f11399 = obtainStyledAttributes.getInt(index, this.f11399);
                        break;
                    case 2:
                        this.f11385 = obtainStyledAttributes.getResourceId(index, this.f11385);
                        if (this.f11385 != -1) {
                            break;
                        } else {
                            this.f11385 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f11425 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11425);
                        break;
                    case 4:
                        this.f11393 = obtainStyledAttributes.getFloat(index, this.f11393) % 360.0f;
                        float f = this.f11393;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f11393 = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f11386 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11386);
                        break;
                    case 6:
                        this.f11365 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11365);
                        break;
                    case 7:
                        this.f11375 = obtainStyledAttributes.getFloat(index, this.f11375);
                        break;
                    case 8:
                        this.f11407 = obtainStyledAttributes.getResourceId(index, this.f11407);
                        if (this.f11407 != -1) {
                            break;
                        } else {
                            this.f11407 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f11408 = obtainStyledAttributes.getResourceId(index, this.f11408);
                        if (this.f11408 != -1) {
                            break;
                        } else {
                            this.f11408 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f11371 = obtainStyledAttributes.getResourceId(index, this.f11371);
                        if (this.f11371 != -1) {
                            break;
                        } else {
                            this.f11371 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f11421 = obtainStyledAttributes.getResourceId(index, this.f11421);
                        if (this.f11421 != -1) {
                            break;
                        } else {
                            this.f11421 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f11389 = obtainStyledAttributes.getResourceId(index, this.f11389);
                        if (this.f11389 != -1) {
                            break;
                        } else {
                            this.f11389 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f11424 = obtainStyledAttributes.getResourceId(index, this.f11424);
                        if (this.f11424 != -1) {
                            break;
                        } else {
                            this.f11424 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f11414 = obtainStyledAttributes.getResourceId(index, this.f11414);
                        if (this.f11414 != -1) {
                            break;
                        } else {
                            this.f11414 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f11378 = obtainStyledAttributes.getResourceId(index, this.f11378);
                        if (this.f11378 != -1) {
                            break;
                        } else {
                            this.f11378 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f11387 = obtainStyledAttributes.getResourceId(index, this.f11387);
                        if (this.f11387 != -1) {
                            break;
                        } else {
                            this.f11387 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f11402 = obtainStyledAttributes.getResourceId(index, this.f11402);
                        if (this.f11402 != -1) {
                            break;
                        } else {
                            this.f11402 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f11417 = obtainStyledAttributes.getResourceId(index, this.f11417);
                        if (this.f11417 != -1) {
                            break;
                        } else {
                            this.f11417 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f11368 = obtainStyledAttributes.getResourceId(index, this.f11368);
                        if (this.f11368 != -1) {
                            break;
                        } else {
                            this.f11368 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f11369 = obtainStyledAttributes.getResourceId(index, this.f11369);
                        if (this.f11369 != -1) {
                            break;
                        } else {
                            this.f11369 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f11394 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11394);
                        break;
                    case 22:
                        this.f11373 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11373);
                        break;
                    case 23:
                        this.f11396 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11396);
                        break;
                    case 24:
                        this.f11382 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11382);
                        break;
                    case 25:
                        this.f11372 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11372);
                        break;
                    case 26:
                        this.f11370 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11370);
                        break;
                    case 27:
                        this.f11400 = obtainStyledAttributes.getBoolean(index, this.f11400);
                        break;
                    case 28:
                        this.f11391 = obtainStyledAttributes.getBoolean(index, this.f11391);
                        break;
                    case 29:
                        this.f11392 = obtainStyledAttributes.getFloat(index, this.f11392);
                        break;
                    case 30:
                        this.f11390 = obtainStyledAttributes.getFloat(index, this.f11390);
                        break;
                    case 31:
                        this.f11415 = obtainStyledAttributes.getInt(index, 0);
                        int i3 = this.f11415;
                        break;
                    case 32:
                        this.f11413 = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.f11413;
                        break;
                    case 33:
                        try {
                            this.f11418 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11418);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f11418) != -2) {
                                break;
                            } else {
                                this.f11418 = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f11419 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11419);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f11419) != -2) {
                                break;
                            } else {
                                this.f11419 = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f11420 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f11420));
                        break;
                    case 36:
                        try {
                            this.f11422 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11422);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f11422) != -2) {
                                break;
                            } else {
                                this.f11422 = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f11423 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11423);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f11423) != -2) {
                                break;
                            } else {
                                this.f11423 = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f11388 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f11388));
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                this.f11374 = obtainStyledAttributes.getString(index);
                                String str = this.f11374;
                                if (str == null) {
                                    break;
                                } else {
                                    int length = str.length();
                                    int indexOf = this.f11374.indexOf(44);
                                    int i5 = (indexOf <= 0 || indexOf >= length + -1) ? 0 : indexOf + 1;
                                    int indexOf2 = this.f11374.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring = this.f11374.substring(i5, indexOf2);
                                        String substring2 = this.f11374.substring(indexOf2 + 1);
                                        if (substring.length() > 0 && substring2.length() > 0) {
                                            try {
                                                Float.parseFloat(substring);
                                                Float.parseFloat(substring2);
                                                break;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring3 = this.f11374.substring(i5);
                                        if (substring3.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring3);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f11383 = obtainStyledAttributes.getFloat(index, this.f11383);
                                break;
                            case 46:
                                this.f11384 = obtainStyledAttributes.getFloat(index, this.f11384);
                                break;
                            case 47:
                                this.f11403 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f11412 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f11398 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11398);
                                break;
                            case 50:
                                this.f11401 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11401);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m13346();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13346() {
            this.f11426 = false;
            this.f11416 = true;
            this.f11406 = true;
            if (this.width == -2 && this.f11400) {
                this.f11416 = false;
                this.f11415 = 1;
            }
            if (this.height == -2 && this.f11391) {
                this.f11406 = false;
                this.f11413 = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f11416 = false;
                if (this.width == 0 && this.f11415 == 1) {
                    this.width = -2;
                    this.f11400 = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f11406 = false;
                if (this.height == 0 && this.f11413 == 1) {
                    this.height = -2;
                    this.f11391 = true;
                }
            }
            if (this.f11375 != -1.0f || this.f11386 != -1 || this.f11365 != -1) {
                this.f11426 = true;
                this.f11416 = true;
                this.f11406 = true;
                if (!(this.f11409 instanceof C2065)) {
                    this.f11409 = new C2065();
                }
                ((C2065) this.f11409).m10989(this.f11399);
            }
        }

        public C2513() {
            super(-2, -2);
        }

        public C2513(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f11376 = r7
                r6.f11380 = r7
                r6.f11367 = r7
                r6.f11379 = r7
                r6.f11397 = r7
                r6.f11381 = r7
                int r2 = r6.f11394
                r6.f11397 = r2
                int r2 = r6.f11396
                r6.f11381 = r2
                float r2 = r6.f11392
                r6.f11404 = r2
                int r2 = r6.f11386
                r6.f11405 = r2
                int r2 = r6.f11365
                r6.f11395 = r2
                float r2 = r6.f11375
                r6.f11411 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x009a
                int r2 = r6.f11402
                if (r2 == r7) goto L_0x0041
                r6.f11376 = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f11417
                if (r2 == r7) goto L_0x0048
                r6.f11380 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f11368
                if (r2 == r7) goto L_0x004f
                r6.f11379 = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.f11369
                if (r2 == r7) goto L_0x0056
                r6.f11367 = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.f11372
                if (r2 == r7) goto L_0x005c
                r6.f11381 = r2
            L_0x005c:
                int r2 = r6.f11370
                if (r2 == r7) goto L_0x0062
                r6.f11397 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f11392
                float r3 = r2 - r3
                r6.f11404 = r3
            L_0x006c:
                boolean r3 = r6.f11426
                if (r3 == 0) goto L_0x00be
                int r3 = r6.f11399
                if (r3 != r4) goto L_0x00be
                float r3 = r6.f11375
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f11411 = r2
                r6.f11405 = r7
                r6.f11395 = r7
                goto L_0x00be
            L_0x0084:
                int r2 = r6.f11386
                if (r2 == r7) goto L_0x008f
                r6.f11395 = r2
                r6.f11405 = r7
                r6.f11411 = r4
                goto L_0x00be
            L_0x008f:
                int r2 = r6.f11365
                if (r2 == r7) goto L_0x00be
                r6.f11405 = r2
                r6.f11395 = r7
                r6.f11411 = r4
                goto L_0x00be
            L_0x009a:
                int r2 = r6.f11402
                if (r2 == r7) goto L_0x00a0
                r6.f11379 = r2
            L_0x00a0:
                int r2 = r6.f11417
                if (r2 == r7) goto L_0x00a6
                r6.f11367 = r2
            L_0x00a6:
                int r2 = r6.f11368
                if (r2 == r7) goto L_0x00ac
                r6.f11376 = r2
            L_0x00ac:
                int r2 = r6.f11369
                if (r2 == r7) goto L_0x00b2
                r6.f11380 = r2
            L_0x00b2:
                int r2 = r6.f11372
                if (r2 == r7) goto L_0x00b8
                r6.f11397 = r2
            L_0x00b8:
                int r2 = r6.f11370
                if (r2 == r7) goto L_0x00be
                r6.f11381 = r2
            L_0x00be:
                int r2 = r6.f11368
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f11369
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f11417
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f11402
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f11371
                if (r2 == r7) goto L_0x00dd
                r6.f11376 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
                goto L_0x00eb
            L_0x00dd:
                int r2 = r6.f11421
                if (r2 == r7) goto L_0x00eb
                r6.f11380 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
            L_0x00eb:
                int r1 = r6.f11407
                if (r1 == r7) goto L_0x00fa
                r6.f11367 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
                return
            L_0x00fa:
                int r1 = r6.f11408
                if (r1 == r7) goto L_0x0108
                r6.f11379 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2512.C2513.resolveLayoutDirection(int):void");
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f11361 = true;
        this.f11356 = -1;
        this.f11358 = -1;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2513();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2513(getContext(), attributeSet);
    }
}
