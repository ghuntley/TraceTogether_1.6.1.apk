package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import o.C2745;

/* renamed from: o.ιı  reason: contains not printable characters */
public class C1949 extends LinearLayout {

    /* renamed from: ı  reason: contains not printable characters */
    private int f9829 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f9830;

    public C1949(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12797);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C2745.aux.f12797, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f9830 = obtainStyledAttributes.getBoolean(C2745.aux.f12834, true);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f9830 != z) {
            this.f9830 = z;
            if (!this.f9830 && getOrientation() == 1) {
                m10674(false);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f9830) {
            if (size > this.f9829) {
                if (getOrientation() == 1) {
                    m10674(false);
                }
            }
            this.f9829 = size;
        }
        if ((getOrientation() == 1) || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f9830) {
            if (!(getOrientation() == 1)) {
                if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                    m10674(true);
                    z = true;
                }
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                i5 = -1;
                break;
            } else if (getChildAt(i5).getVisibility() == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (getOrientation() == 1) {
                i4 = 1;
            }
            if (i4 != 0) {
                int i6 = i5 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i6 >= childCount2) {
                        i6 = -1;
                        break;
                    } else if (getChildAt(i6).getVisibility() == 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 >= 0) {
                    paddingTop += getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0293.m4182(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m10674(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.f167462131362345);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }
}
