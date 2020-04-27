package androidx.activity;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Iterator;
import o.C1242;
import o.C2319;
import o.C2456;
import o.C2851;
import o.C3611mx;

public final class OnBackPressedDispatcher {

    /* renamed from: ǃ  reason: contains not printable characters */
    final ArrayDeque<C1242.C1244> f91;

    /* renamed from: ι  reason: contains not printable characters */
    private final Runnable f92;

    public OnBackPressedDispatcher() {
        this((Runnable) null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f91 = new ArrayDeque<>();
        this.f92 = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m95(C2851 r3, C1242.C1244 r4) {
        C2319 lifecycle = r3.getLifecycle();
        if (lifecycle.m12096() != C2319.Cif.DESTROYED) {
            r4.m8048(new LifecycleOnBackPressedCancellable(lifecycle, r4));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m96() {
        Iterator<C1242.C1244> descendingIterator = this.f91.descendingIterator();
        while (descendingIterator.hasNext()) {
            C1242.C1244 next = descendingIterator.next();
            if (next.m8046()) {
                next.m8047();
                return;
            }
        }
        Runnable runnable = this.f92;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$ɩ  reason: contains not printable characters */
    class C0009 implements C3611mx {

        /* renamed from: ı  reason: contains not printable characters */
        private final C1242.C1244 f97;

        C0009(C1242.C1244 r2) {
            this.f97 = r2;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m99() {
            OnBackPressedDispatcher.this.f91.remove(this.f97);
            this.f97.m8049(this);
        }
    }

    class LifecycleOnBackPressedCancellable implements C2456, C3611mx {

        /* renamed from: ı  reason: contains not printable characters */
        private C3611mx f93;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C1242.C1244 f94;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2319 f96;

        LifecycleOnBackPressedCancellable(C2319 r2, C1242.C1244 r3) {
            this.f96 = r2;
            this.f94 = r3;
            r2.m12098(this);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m97(C2851 r2, C2319.C2320 r3) {
            if (r3 == C2319.C2320.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C1242.C1244 r32 = this.f94;
                onBackPressedDispatcher.f91.add(r32);
                C0009 r0 = new C0009(r32);
                r32.m8048(r0);
                this.f93 = r0;
            } else if (r3 == C2319.C2320.ON_STOP) {
                C3611mx mxVar = this.f93;
                if (mxVar != null) {
                    mxVar.m3937();
                }
            } else if (r3 == C2319.C2320.ON_DESTROY) {
                m98();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m98() {
            this.f96.m12097(this);
            this.f94.m8049(this);
            C3611mx mxVar = this.f93;
            if (mxVar != null) {
                mxVar.m3937();
                this.f93 = null;
            }
        }
    }
}
