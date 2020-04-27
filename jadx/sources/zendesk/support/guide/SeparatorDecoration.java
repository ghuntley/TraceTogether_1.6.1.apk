package zendesk.support.guide;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.support.guide.HelpRecyclerViewAdapter;

class SeparatorDecoration extends RecyclerView.C0037 {
    private Drawable mDivider;

    SeparatorDecoration(Drawable drawable) {
        this.mDivider = drawable;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0033 r9) {
        super.onDraw(canvas, recyclerView, r9);
        if (recyclerView.getItemAnimator() == null || !recyclerView.getItemAnimator().isRunning()) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (shouldShowTopSeparator(recyclerView, i)) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int top = childAt.getTop() + ((RecyclerView.C0038) childAt.getLayoutParams()).topMargin;
                    this.mDivider.setBounds(paddingLeft, top, width, this.mDivider.getIntrinsicHeight() + top);
                    this.mDivider.draw(canvas);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldShowTopSeparator(RecyclerView recyclerView, int i) {
        return isItemACategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i))) && (isItemAnExpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i))) || !(i > 0 && isItemAnUnexpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i - 1)))));
    }

    private boolean isItemACategory(RecyclerView.con con) {
        return con instanceof HelpRecyclerViewAdapter.CategoryViewHolder;
    }

    private boolean isItemAnExpandedCategory(RecyclerView.con con) {
        return (con instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && ((HelpRecyclerViewAdapter.CategoryViewHolder) con).isExpanded();
    }

    private boolean isItemAnUnexpandedCategory(RecyclerView.con con) {
        return (con instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && !((HelpRecyclerViewAdapter.CategoryViewHolder) con).isExpanded();
    }
}
