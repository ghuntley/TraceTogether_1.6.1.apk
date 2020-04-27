package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: o.ɪɩ  reason: contains not printable characters */
public final class C1356 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C2693 f7517;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2693 f7518;

    /* renamed from: ι  reason: contains not printable characters */
    public final Context f7519;

    /* renamed from: ı  reason: contains not printable characters */
    static C1357 m8468(Context context, C1380 r7, C1277 r8, boolean z) {
        int nextTransition = r8.getNextTransition();
        int nextAnim = r8.getNextAnim();
        boolean z2 = false;
        r8.setNextAnim(0);
        View r72 = r7.m8524(r8.mContainerId);
        if (!(r72 == null || r72.getTag(R.id.f168232131362449) == null)) {
            r72.setTag(R.id.f168232131362449, (Object) null);
        }
        if (r8.mContainer != null && r8.mContainer.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = r8.onCreateAnimation(nextTransition, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C1357(onCreateAnimation);
        }
        Animator onCreateAnimator = r8.onCreateAnimator(nextTransition, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C1357(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new C1357(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (loadAnimator != null) {
                        return new C1357(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                        if (loadAnimation2 != null) {
                            return new C1357(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (nextTransition == 0) {
            return null;
        }
        int i = -1;
        if (nextTransition == 4097) {
            i = z ? R.anim.f147912130772003 : R.anim.f147922130772004;
        } else if (nextTransition == 4099) {
            i = z ? R.anim.f147882130772000 : R.anim.f147892130772001;
        } else if (nextTransition == 8194) {
            i = z ? R.anim.f147862130771998 : R.anim.f147872130771999;
        }
        if (i < 0) {
            return null;
        }
        return new C1357(AnimationUtils.loadAnimation(context, i));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0012 A[LOOP:0: B:2:0x0012->B:26:0x0012, LOOP_START, SYNTHETIC] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m8469(final o.C1277 r7, o.C1356.C1357 r8, final o.C1827.C1828 r9) {
        /*
            android.view.View r2 = r7.mView
            android.view.ViewGroup r1 = r7.mContainer
            r1.startViewTransition(r2)
            o.ɿǃ r5 = new o.ɿǃ
            r5.<init>()
            o.ɪɩ$5 r0 = new o.ɪɩ$5
            r0.<init>(r7)
            monitor-enter(r5)
        L_0x0012:
            boolean r3 = r5.f8314     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x001a
            r5.wait()     // Catch:{ InterruptedException -> 0x0012 }
            goto L_0x0012
        L_0x001a:
            o.ɿǃ$if r3 = r5.f8312     // Catch:{ all -> 0x0068 }
            if (r3 != r0) goto L_0x0020
            monitor-exit(r5)     // Catch:{ all -> 0x0068 }
            goto L_0x002c
        L_0x0020:
            r5.f8312 = r0     // Catch:{ all -> 0x0068 }
            boolean r3 = r5.f8313     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0028
            monitor-exit(r5)     // Catch:{ all -> 0x0068 }
            goto L_0x002c
        L_0x0028:
            monitor-exit(r5)
            r0.m9194()
        L_0x002c:
            r9.m10112(r7, r5)
            android.view.animation.Animation r0 = r8.f7531
            if (r0 == 0) goto L_0x004d
            o.ɪɩ$ɩ r0 = new o.ɪɩ$ɩ
            android.view.animation.Animation r8 = r8.f7531
            r0.<init>(r8, r1, r2)
            android.view.View r8 = r7.mView
            r7.setAnimatingAway(r8)
            o.ɪɩ$3 r8 = new o.ɪɩ$3
            r8.<init>(r1, r7, r9, r5)
            r0.setAnimationListener(r8)
            android.view.View r7 = r7.mView
            r7.startAnimation(r0)
            return
        L_0x004d:
            android.animation.Animator r6 = r8.f7530
            android.animation.Animator r8 = r8.f7530
            r7.setAnimator(r8)
            o.ɪɩ$2 r8 = new o.ɪɩ$2
            r0 = r8
            r3 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r8)
            android.view.View r7 = r7.mView
            r6.setTarget(r7)
            r6.start()
            return
        L_0x0068:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1356.m8469(o.ɩʟ, o.ɪɩ$ı, o.Ιɹ$ǃ):void");
    }

    /* renamed from: o.ɪɩ$ı  reason: contains not printable characters */
    static class C1357 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Animator f7530;

        /* renamed from: ι  reason: contains not printable characters */
        public final Animation f7531;

        C1357(Animation animation) {
            this.f7531 = animation;
            this.f7530 = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1357(Animator animator) {
            this.f7531 = null;
            this.f7530 = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: o.ɪɩ$ɩ  reason: contains not printable characters */
    static class C1358 extends AnimationSet implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f7532 = true;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final View f7533;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f7534;

        /* renamed from: Ι  reason: contains not printable characters */
        private final ViewGroup f7535;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f7536;

        C1358(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f7535 = viewGroup;
            this.f7533 = view;
            addAnimation(animation);
            this.f7535.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f7532 = true;
            if (!this.f7536) {
                if (!super.getTransformation(j, transformation)) {
                    this.f7536 = true;
                    C2966.m15241(this.f7535, this);
                }
                return true;
            } else if (!this.f7534) {
                return true;
            } else {
                return false;
            }
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f7532 = true;
            if (!this.f7536) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.f7536 = true;
                    C2966.m15241(this.f7535, this);
                }
                return true;
            } else if (!this.f7534) {
                return true;
            } else {
                return false;
            }
        }

        public final void run() {
            if (this.f7536 || !this.f7532) {
                this.f7535.endViewTransition(this.f7533);
                this.f7534 = true;
                return;
            }
            this.f7532 = false;
            this.f7535.post(this);
        }
    }

    @C3350db
    public C1356(Context context, C2693 r2, C2693 r3) {
        this.f7519 = context;
        this.f7517 = r2;
        this.f7518 = r3;
    }

    C1356() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m8470(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), C0872.f5653).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equals : strArr) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
