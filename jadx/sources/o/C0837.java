package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ǀı  reason: contains not printable characters */
public class C0837 extends C1080 {
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.con> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.con>> mAdditionsList = new ArrayList<>();
    ArrayList<RecyclerView.con> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<C0838>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.con> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<If>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.con> mPendingAdditions = new ArrayList<>();
    private ArrayList<C0838> mPendingChanges = new ArrayList<>();
    private ArrayList<If> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.con> mPendingRemovals = new ArrayList<>();
    ArrayList<RecyclerView.con> mRemoveAnimations = new ArrayList<>();

    /* renamed from: o.ǀı$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public int f5518;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f5519;

        /* renamed from: ɩ  reason: contains not printable characters */
        public RecyclerView.con f5520;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f5521;

        /* renamed from: ι  reason: contains not printable characters */
        public int f5522;

        If(RecyclerView.con con, int i, int i2, int i3, int i4) {
            this.f5520 = con;
            this.f5519 = i;
            this.f5521 = i2;
            this.f5522 = i3;
            this.f5518 = i4;
        }
    }

    /* renamed from: o.ǀı$ɩ  reason: contains not printable characters */
    static class C0838 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f5523;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f5524;

        /* renamed from: ɩ  reason: contains not printable characters */
        public RecyclerView.con f5525;

        /* renamed from: Ι  reason: contains not printable characters */
        public RecyclerView.con f5526;

        /* renamed from: ι  reason: contains not printable characters */
        public int f5527;

        /* renamed from: і  reason: contains not printable characters */
        public int f5528;

        private C0838(RecyclerView.con con, RecyclerView.con con2) {
            this.f5525 = con;
            this.f5526 = con2;
        }

        C0838(RecyclerView.con con, RecyclerView.con con2, int i, int i2, int i3, int i4) {
            this(con, con2);
            this.f5524 = i;
            this.f5527 = i2;
            this.f5523 = i3;
            this.f5528 = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f5525);
            sb.append(", newHolder=");
            sb.append(this.f5526);
            sb.append(", fromX=");
            sb.append(this.f5524);
            sb.append(", fromY=");
            sb.append(this.f5527);
            sb.append(", toX=");
            sb.append(this.f5523);
            sb.append(", toY=");
            sb.append(this.f5528);
            sb.append('}');
            return sb.toString();
        }
    }

    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.con> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                AnonymousClass2 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            If ifR = (If) it.next();
                            C0837.this.animateMoveImpl(ifR.f5520, ifR.f5519, ifR.f5521, ifR.f5522, ifR.f5518);
                        }
                        arrayList.clear();
                        C0837.this.mMovesList.remove(arrayList);
                    }
                };
                if (z) {
                    C0293.m4166(((If) arrayList.get(0)).f5520.itemView, r6, getRemoveDuration());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                AnonymousClass5 r62 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C0837.this.animateChangeImpl((C0838) it.next());
                        }
                        arrayList2.clear();
                        C0837.this.mChangesList.remove(arrayList2);
                    }
                };
                if (z) {
                    C0293.m4166(((C0838) arrayList2.get(0)).f5525.itemView, r62, getRemoveDuration());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                AnonymousClass1 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C0837.this.animateAddImpl((RecyclerView.con) it.next());
                        }
                        arrayList3.clear();
                        C0837.this.mAdditionsList.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long removeDuration = z ? getRemoveDuration() : 0;
                    long moveDuration = z2 ? getMoveDuration() : 0;
                    if (z3) {
                        j = getChangeDuration();
                    }
                    C0293.m4166(((RecyclerView.con) arrayList3.get(0)).itemView, r5, removeDuration + Math.max(moveDuration, j));
                    return;
                }
                r5.run();
            }
        }
    }

    public boolean animateRemove(RecyclerView.con con) {
        resetAnimation(con);
        this.mPendingRemovals.add(con);
        return true;
    }

    private void animateRemoveImpl(final RecyclerView.con con) {
        final View view = con.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(con);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C0837.this.dispatchRemoveStarting(con);
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                C0837.this.dispatchRemoveFinished(con);
                C0837.this.mRemoveAnimations.remove(con);
                C0837.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    public boolean animateAdd(RecyclerView.con con) {
        resetAnimation(con);
        con.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(con);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateAddImpl(final RecyclerView.con con) {
        final View view = con.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(con);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C0837.this.dispatchAddStarting(con);
            }

            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0837.this.dispatchAddFinished(con);
                C0837.this.mAddAnimations.remove(con);
                C0837.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    public boolean animateMove(RecyclerView.con con, int i, int i2, int i3, int i4) {
        View view = con.itemView;
        int translationX = i + ((int) con.itemView.getTranslationX());
        int translationY = i2 + ((int) con.itemView.getTranslationY());
        resetAnimation(con);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(con);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.mPendingMoves.add(new If(con, translationX, translationY, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateMoveImpl(RecyclerView.con con, int i, int i2, int i3, int i4) {
        final View view = con.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(con);
        final RecyclerView.con con2 = con;
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C0837.this.dispatchMoveStarting(con2);
            }

            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0837.this.dispatchMoveFinished(con2);
                C0837.this.mMoveAnimations.remove(con2);
                C0837.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    public boolean animateChange(RecyclerView.con con, RecyclerView.con con2, int i, int i2, int i3, int i4) {
        if (con == con2) {
            return animateMove(con, i, i2, i3, i4);
        }
        float translationX = con.itemView.getTranslationX();
        float translationY = con.itemView.getTranslationY();
        float alpha = con.itemView.getAlpha();
        resetAnimation(con);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        con.itemView.setTranslationX(translationX);
        con.itemView.setTranslationY(translationY);
        con.itemView.setAlpha(alpha);
        if (con2 != null) {
            resetAnimation(con2);
            con2.itemView.setTranslationX((float) (-i5));
            con2.itemView.setTranslationY((float) (-i6));
            con2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new C0838(con, con2, i, i2, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateChangeImpl(final C0838 r7) {
        final View view;
        RecyclerView.con con = r7.f5525;
        final View view2 = null;
        if (con == null) {
            view = null;
        } else {
            view = con.itemView;
        }
        RecyclerView.con con2 = r7.f5526;
        if (con2 != null) {
            view2 = con2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(r7.f5525);
            duration.translationX((float) (r7.f5523 - r7.f5524));
            duration.translationY((float) (r7.f5528 - r7.f5527));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C0837.this.dispatchChangeStarting(r7.f5525, true);
                }

                public final void onAnimationEnd(Animator animator) {
                    duration.setListener((Animator.AnimatorListener) null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C0837.this.dispatchChangeFinished(r7.f5525, true);
                    C0837.this.mChangeAnimations.remove(r7.f5525);
                    C0837.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(r7.f5526);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C0837.this.dispatchChangeStarting(r7.f5526, false);
                }

                public final void onAnimationEnd(Animator animator) {
                    animate.setListener((Animator.AnimatorListener) null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C0837.this.dispatchChangeFinished(r7.f5526, false);
                    C0837.this.mChangeAnimations.remove(r7.f5526);
                    C0837.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
    }

    private void endChangeAnimation(List<C0838> list, RecyclerView.con con) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0838 r1 = list.get(size);
            if (endChangeAnimationIfNecessary(r1, con) && r1.f5525 == null && r1.f5526 == null) {
                list.remove(r1);
            }
        }
    }

    private void endChangeAnimationIfNecessary(C0838 r2) {
        if (r2.f5525 != null) {
            endChangeAnimationIfNecessary(r2, r2.f5525);
        }
        if (r2.f5526 != null) {
            endChangeAnimationIfNecessary(r2, r2.f5526);
        }
    }

    private boolean endChangeAnimationIfNecessary(C0838 r5, RecyclerView.con con) {
        boolean z = false;
        if (r5.f5526 == con) {
            r5.f5526 = null;
        } else if (r5.f5525 != con) {
            return false;
        } else {
            r5.f5525 = null;
            z = true;
        }
        con.itemView.setAlpha(1.0f);
        con.itemView.setTranslationX(0.0f);
        con.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(con, z);
        return true;
    }

    public void endAnimation(RecyclerView.con con) {
        View view = con.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f5520 == con) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(con);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, con);
        if (this.mPendingRemovals.remove(con)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(con);
        }
        if (this.mPendingAdditions.remove(con)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(con);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, con);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((If) arrayList2.get(size4)).f5520 == con) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(con);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(con)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(con);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(con);
        this.mAddAnimations.remove(con);
        this.mChangeAnimations.remove(con);
        this.mMoveAnimations.remove(con);
        dispatchFinishedWhenDone();
    }

    private void resetAnimation(RecyclerView.con con) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        con.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(con);
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            If ifR = this.mPendingMoves.get(size);
            View view = ifR.f5520.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(ifR.f5520);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.con con = this.mPendingAdditions.get(size3);
            con.itemView.setAlpha(1.0f);
            dispatchAddFinished(con);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    If ifR2 = (If) arrayList.get(size6);
                    View view2 = ifR2.f5520.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(ifR2.f5520);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.con con2 = (RecyclerView.con) arrayList2.get(size8);
                    con2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(con2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((C0838) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelAll(List<RecyclerView.con> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.con con, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(con, list);
    }
}
