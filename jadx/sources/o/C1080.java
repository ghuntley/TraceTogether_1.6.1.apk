package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ɍι  reason: contains not printable characters */
public abstract class C1080 extends RecyclerView.C3246iF {
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.con con);

    public abstract boolean animateChange(RecyclerView.con con, RecyclerView.con con2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(RecyclerView.con con, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(RecyclerView.con con);

    public void onAddFinished(RecyclerView.con con) {
    }

    public void onAddStarting(RecyclerView.con con) {
    }

    public void onChangeFinished(RecyclerView.con con, boolean z) {
    }

    public void onChangeStarting(RecyclerView.con con, boolean z) {
    }

    public void onMoveFinished(RecyclerView.con con) {
    }

    public void onMoveStarting(RecyclerView.con con) {
    }

    public void onRemoveFinished(RecyclerView.con con) {
    }

    public void onRemoveStarting(RecyclerView.con con) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.con con) {
        return !this.mSupportsChangeAnimations || con.isInvalid();
    }

    public boolean animateDisappearance(RecyclerView.con con, RecyclerView.C3246iF.C0029 r8, RecyclerView.C3246iF.C0029 r9) {
        int i = r8.f365;
        int i2 = r8.f364;
        View view = con.itemView;
        int left = r9 == null ? view.getLeft() : r9.f365;
        int top = r9 == null ? view.getTop() : r9.f364;
        if (con.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(con);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(con, i, i2, left, top);
    }

    public boolean animateAppearance(RecyclerView.con con, RecyclerView.C3246iF.C0029 r10, RecyclerView.C3246iF.C0029 r11) {
        if (r10 == null || (r10.f365 == r11.f365 && r10.f364 == r11.f364)) {
            return animateAdd(con);
        }
        return animateMove(con, r10.f365, r10.f364, r11.f365, r11.f364);
    }

    public boolean animatePersistence(RecyclerView.con con, RecyclerView.C3246iF.C0029 r8, RecyclerView.C3246iF.C0029 r9) {
        if (r8.f365 == r9.f365 && r8.f364 == r9.f364) {
            dispatchMoveFinished(con);
            return false;
        }
        return animateMove(con, r8.f365, r8.f364, r9.f365, r9.f364);
    }

    public boolean animateChange(RecyclerView.con con, RecyclerView.con con2, RecyclerView.C3246iF.C0029 r10, RecyclerView.C3246iF.C0029 r11) {
        int i;
        int i2;
        int i3 = r10.f365;
        int i4 = r10.f364;
        if (con2.shouldIgnore()) {
            int i5 = r10.f365;
            i = r10.f364;
            i2 = i5;
        } else {
            i2 = r11.f365;
            i = r11.f364;
        }
        return animateChange(con, con2, i3, i4, i2, i);
    }

    public final void dispatchRemoveFinished(RecyclerView.con con) {
        onRemoveFinished(con);
        dispatchAnimationFinished(con);
    }

    public final void dispatchMoveFinished(RecyclerView.con con) {
        onMoveFinished(con);
        dispatchAnimationFinished(con);
    }

    public final void dispatchAddFinished(RecyclerView.con con) {
        onAddFinished(con);
        dispatchAnimationFinished(con);
    }

    public final void dispatchChangeFinished(RecyclerView.con con, boolean z) {
        onChangeFinished(con, z);
        dispatchAnimationFinished(con);
    }

    public final void dispatchRemoveStarting(RecyclerView.con con) {
        onRemoveStarting(con);
    }

    public final void dispatchMoveStarting(RecyclerView.con con) {
        onMoveStarting(con);
    }

    public final void dispatchAddStarting(RecyclerView.con con) {
        onAddStarting(con);
    }

    public final void dispatchChangeStarting(RecyclerView.con con, boolean z) {
        onChangeStarting(con, z);
    }
}
