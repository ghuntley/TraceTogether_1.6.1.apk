package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.C2958;

/* renamed from: o.ɂ  reason: contains not printable characters */
public class C1005 extends C2958 {
    public C1005(Context context) {
        super(context);
    }

    public C1005(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = 0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00ae
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ab
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ab
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            o.ԇ$ǃ r6 = (o.C2958.C2959) r6
            int r7 = r6.f13691
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int r8 = o.C0293.m4156(r9)
            int r7 = o.C2409.m12455(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008c
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0097
        L_0x0087:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L_0x0096
        L_0x008c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L_0x0096:
            int r7 = r7 - r8
        L_0x0097:
            boolean r8 = r9.hasDividerBeforeChildAt(r0)
            if (r8 == 0) goto L_0x009e
            int r12 = r12 + r14
        L_0x009e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        L_0x00ab:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1005.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.f167882131362404) {
                        view = childAt;
                    } else if (id == R.id.f164822131361971) {
                        view2 = childAt;
                    } else if ((id == R.id.f164942131361998 || id == R.id.f164992131362003) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i8, 0);
                    paddingTop += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i8, 0);
                    View view4 = view2;
                    while (true) {
                        i4 = C0293.m4182(view4);
                        if (i4 <= 0) {
                            if (!(view4 instanceof ViewGroup)) {
                                break;
                            }
                            ViewGroup viewGroup = (ViewGroup) view4;
                            if (viewGroup.getChildCount() != 1) {
                                break;
                            }
                            view4 = viewGroup.getChildAt(0);
                        } else {
                            break;
                        }
                    }
                    i4 = 0;
                    i5 = view2.getMeasuredHeight() - i4;
                    paddingTop += i4;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        i7 = 0;
                    } else {
                        i7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i8, i7);
                    i6 = view3.getMeasuredHeight();
                    paddingTop += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i10 = size - paddingTop;
                if (view2 != null) {
                    int i11 = paddingTop - i4;
                    int min = Math.min(i10, i5);
                    if (min > 0) {
                        i10 -= min;
                        i4 += min;
                    }
                    view2.measure(i8, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                    paddingTop = i11 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i10 > 0) {
                    view3.measure(i8, View.MeasureSpec.makeMeasureSpec(i6 + i10, mode));
                    paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i12 + getPaddingLeft() + getPaddingRight(), i8, i3), View.resolveSizeAndState(paddingTop, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            C2958.C2959 r12 = (C2958.C2959) childAt3.getLayoutParams();
                            if (r12.width == -1) {
                                int i15 = r12.height;
                                r12.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                r12.height = i15;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i16 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
