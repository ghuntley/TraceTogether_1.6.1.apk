package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import java.util.ArrayList;
import java.util.List;
import o.C1961;

/* renamed from: o.ͱɹ  reason: contains not printable characters */
public final class C1726 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1229 f8937;

    /* renamed from: Ι  reason: contains not printable characters */
    public static Animator m9727(C1961 r6, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r6, C1961.Cif.f9852, C1961.C1963.f9856, new C1961.C1962[]{new C1961.C1962(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C1961.C1962 C_ = r6.C_();
        if (C_ != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) r6, (int) f, (int) f2, C_.f9855, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public C1726() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<C2062> m9728() {
        C1229 r0 = this.f8937;
        if (r0.f6977 == null) {
            return C0719.m5842();
        }
        C0562 r02 = r0.f6977;
        ArrayList arrayList = new ArrayList();
        for (C1673 add : r02.f4464) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public C1726(C1229 r1) {
        this();
        this.f8937 = r1;
    }
}
