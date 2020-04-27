package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ǃϳ  reason: contains not printable characters */
public final class C0918 extends RecyclerView.C0037 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int[] f5807 = {16843284};

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable f5808;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f5809;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Rect f5810 = new Rect();

    public C0918(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5807);
        this.f5808 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f5809 = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0033 r9) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.f5808 != null) {
            int i5 = 0;
            if (this.f5809 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    recyclerView.getDecoratedBoundsWithMargins(childAt, this.f5810);
                    int round = this.f5810.bottom + Math.round(childAt.getTranslationY());
                    this.f5808.setBounds(i3, round - this.f5808.getIntrinsicHeight(), i4, round);
                    this.f5808.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.getLayoutManager();
                RecyclerView.IF.m388(childAt2, this.f5810);
                int round2 = this.f5810.right + Math.round(childAt2.getTranslationX());
                this.f5808.setBounds(round2 - this.f5808.getIntrinsicWidth(), i, round2, i2);
                this.f5808.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0033 r5) {
        Drawable drawable = this.f5808;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5809 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
