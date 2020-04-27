package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: o.ɨƭ  reason: contains not printable characters */
public abstract class C1203 extends C1351<View> {
    private int overlayTop;
    public final Rect tempRect1 = new Rect();
    final Rect tempRect2 = new Rect();
    private int verticalLayoutGap = 0;

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract View findFirstDependency(List<View> list);

    /* access modifiers changed from: protected */
    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public C1203() {
    }

    public C1203(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View findFirstDependency;
        C0501 r3;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (findFirstDependency = findFirstDependency(coordinatorLayout.m144(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0293.m4153(findFirstDependency) && (r3 = coordinatorLayout.f147) != null) {
            size += r3.m4893() + r3.m4890();
        }
        int scrollRange = size + getScrollRange(findFirstDependency);
        int measuredHeight = findFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.m152(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.m144(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.C0016 r1 = (CoordinatorLayout.C0016) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + r1.leftMargin, findFirstDependency.getBottom() + r1.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - r1.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - r1.bottomMargin);
            C0501 r2 = coordinatorLayout.f147;
            if (r2 != null && C0293.m4153(coordinatorLayout) && !C0293.m4153(view)) {
                rect.left += r2.m4895();
                rect.right -= r2.m4894();
            }
            Rect rect2 = this.tempRect2;
            C2409.m12456(resolveGravity(r1.f164), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.verticalLayoutGap = 0;
    }

    /* access modifiers changed from: protected */
    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        int i2 = (int) (overlapRatioForOffset * ((float) i));
        if (i2 < 0) {
            return 0;
        }
        return i2 > i ? i : i2;
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }
}
