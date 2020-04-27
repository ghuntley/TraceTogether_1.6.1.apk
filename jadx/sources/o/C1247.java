package o;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.google.firebase.auth.internal.FederatedSignInActivity;

/* renamed from: o.ɩƶ  reason: contains not printable characters */
public final class C1247 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final int[] f7061 = {16843848};

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ FederatedSignInActivity f7062;

    C1247() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m8053(View view, float f) {
        view.getResources();
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842766, R.attr.f154432130969262, -2130969263}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(150));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(150));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    public C1247(FederatedSignInActivity federatedSignInActivity) {
        this.f7062 = federatedSignInActivity;
    }

    public final void run() {
        this.f7062.m1099();
        Runnable unused = FederatedSignInActivity.f974 = null;
    }
}
