package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ȷӀ  reason: contains not printable characters */
public class C0974 extends RecyclerView.C3240AuX {
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    private float mMillisPerPixel;
    protected PointF mTargetVector;

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public void onStart() {
    }

    public C0974(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    public void onTargetFound(View view, RecyclerView.C0033 r4, RecyclerView.C3240AuX.C0025 r5) {
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((double) ((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible))));
        if (calculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            r5.f334 = -calculateDxToMakeVisible;
            r5.f337 = -calculateDyToMakeVisible;
            r5.f336 = calculateTimeForDeceleration;
            r5.f332 = decelerateInterpolator;
            r5.f333 = true;
        }
    }

    public void onSeekTargetStep(int i, int i2, RecyclerView.C0033 r3, RecyclerView.C3240AuX.C0025 r4) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i);
        this.mInterimTargetDy = clampApplyScroll(this.mInterimTargetDy, i2);
        if (this.mInterimTargetDx == 0 && this.mInterimTargetDy == 0) {
            updateActionForInterimTarget(r4);
        }
    }

    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    /* access modifiers changed from: protected */
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    private float getSpeedPerPixel() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    /* access modifiers changed from: protected */
    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * getSpeedPerPixel()));
    }

    /* access modifiers changed from: protected */
    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.mTargetVector.x > 0.0f ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.mTargetVector.y > 0.0f ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void updateActionForInterimTarget(RecyclerView.C3240AuX.C0025 r5) {
        PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f)) {
            r5.f335 = getTargetPosition();
            stop();
            return;
        }
        normalize(computeScrollVectorForPosition);
        this.mTargetVector = computeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (computeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (computeScrollVectorForPosition.y * 10000.0f);
        int calculateTimeForScrolling = calculateTimeForScrolling(C3273am.f1527);
        LinearInterpolator linearInterpolator = this.mLinearInterpolator;
        r5.f334 = (int) (((float) this.mInterimTargetDx) * 1.2f);
        r5.f337 = (int) (((float) this.mInterimTargetDy) * 1.2f);
        r5.f336 = (int) (((float) calculateTimeForScrolling) * 1.2f);
        r5.f332 = linearInterpolator;
        r5.f333 = true;
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.IF layoutManager = getLayoutManager();
        int i2 = 0;
        if (layoutManager == null || !layoutManager.m453()) {
            return 0;
        }
        RecyclerView.C0038 r2 = (RecyclerView.C0038) view.getLayoutParams();
        int top = (view.getTop() - RecyclerView.IF.m383(view)) - r2.topMargin;
        int bottom = view.getBottom() + RecyclerView.IF.m393(view) + r2.bottomMargin;
        int paddingTop = layoutManager.f349 != null ? layoutManager.f349.getPaddingTop() : 0;
        int i3 = layoutManager.f341;
        if (layoutManager.f349 != null) {
            i2 = layoutManager.f349.getPaddingBottom();
        }
        return calculateDtToFit(top, bottom, paddingTop, i3 - i2, i);
    }

    public int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.IF layoutManager = getLayoutManager();
        int i2 = 0;
        if (layoutManager == null || !layoutManager.m408()) {
            return 0;
        }
        RecyclerView.C0038 r2 = (RecyclerView.C0038) view.getLayoutParams();
        int left = (view.getLeft() - RecyclerView.IF.m384(view)) - r2.leftMargin;
        int right = view.getRight() + RecyclerView.IF.m382(view) + r2.rightMargin;
        int paddingLeft = layoutManager.f349 != null ? layoutManager.f349.getPaddingLeft() : 0;
        int i3 = layoutManager.f351;
        if (layoutManager.f349 != null) {
            i2 = layoutManager.f349.getPaddingRight();
        }
        return calculateDtToFit(left, right, paddingLeft, i3 - i2, i);
    }
}
