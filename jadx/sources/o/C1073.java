package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ɍɩ  reason: contains not printable characters */
public abstract class C1073 extends RecyclerView.C0042 {

    /* renamed from: ı  reason: contains not printable characters */
    private final RecyclerView.C3243aUx f6442 = new RecyclerView.C3243aUx() {

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f6446 = false;

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7409(RecyclerView recyclerView, int i) {
            super.m473(recyclerView, i);
            if (i == 0 && this.f6446) {
                this.f6446 = false;
                C1073.this.m7408();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7410(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f6446 = true;
            }
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    private Scroller f6443;

    /* renamed from: ɩ  reason: contains not printable characters */
    RecyclerView f6444;

    /* renamed from: ı  reason: contains not printable characters */
    public abstract View m7401(RecyclerView.IF ifR);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int[] m7406(RecyclerView.IF ifR, View view);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m7407(RecyclerView.IF ifR, int i, int i2);

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7402(int i, int i2) {
        boolean z;
        C0974 r2;
        int r5;
        RecyclerView.IF layoutManager = this.f6444.getLayoutManager();
        if (layoutManager == null || this.f6444.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6444.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if (!(layoutManager instanceof RecyclerView.C3240AuX.Cif) || (r2 = m7403(layoutManager)) == null || (r5 = m7407(layoutManager, i, i2)) == -1) {
                z = false;
            } else {
                r2.setTargetPosition(r5);
                layoutManager.m403((RecyclerView.C3240AuX) r2);
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7404(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6444;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.f6442);
                this.f6444.setOnFlingListener((RecyclerView.C0042) null);
            }
            this.f6444 = recyclerView;
            RecyclerView recyclerView3 = this.f6444;
            if (recyclerView3 == null) {
                return;
            }
            if (recyclerView3.getOnFlingListener() == null) {
                this.f6444.addOnScrollListener(this.f6442);
                this.f6444.setOnFlingListener(this);
                this.f6443 = new Scroller(this.f6444.getContext(), new DecelerateInterpolator());
                m7408();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int[] m7405(int i, int i2) {
        this.f6443.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f6443.getFinalX(), this.f6443.getFinalY()};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7408() {
        RecyclerView.IF layoutManager;
        View r1;
        RecyclerView recyclerView = this.f6444;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (r1 = m7401(layoutManager)) != null) {
            int[] r0 = m7406(layoutManager, r1);
            if (r0[0] != 0 || r0[1] != 0) {
                this.f6444.smoothScrollBy(r0[0], r0[1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public C0974 m7403(RecyclerView.IF ifR) {
        if (!(ifR instanceof RecyclerView.C3240AuX.Cif)) {
            return null;
        }
        return new C0974(this.f6444.getContext()) {
            public final void onTargetFound(View view, RecyclerView.C0033 r5, RecyclerView.C3240AuX.C0025 r6) {
                if (C1073.this.f6444 != null) {
                    C1073 r52 = C1073.this;
                    int[] r4 = r52.m7406(r52.f6444.getLayoutManager(), view);
                    int i = r4[0];
                    int i2 = r4[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                        r6.f334 = i;
                        r6.f337 = i2;
                        r6.f336 = calculateTimeForDeceleration;
                        r6.f332 = decelerateInterpolator;
                        r6.f333 = true;
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
    }
}
