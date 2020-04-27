package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ѕɹ  reason: contains not printable characters */
public abstract class C2551 implements C2857 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2134 f11643;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f11644;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ArrayList<Animator.AnimatorListener> f11645 = new ArrayList<>();

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1091 f11646;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ExtendedFloatingActionButton f11647;

    /* renamed from: ι  reason: contains not printable characters */
    private C1091 f11648;

    public C2551(ExtendedFloatingActionButton extendedFloatingActionButton, C2134 r3) {
        this.f11647 = extendedFloatingActionButton;
        this.f11644 = extendedFloatingActionButton.getContext();
        this.f11643 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13614(C1091 r1) {
        this.f11646 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1091 m13611() {
        C1091 r0 = this.f11646;
        if (r0 != null) {
            return r0;
        }
        if (this.f11648 == null) {
            this.f11648 = C1091.m7459(this.f11644, m14835());
        }
        C1091 r02 = this.f11648;
        if (r02 != null) {
            return r02;
        }
        throw new NullPointerException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<Animator.AnimatorListener> m13617() {
        return this.f11645;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m13612(Animator animator) {
        C2134 r0 = this.f11643;
        if (r0.f10280 != null) {
            r0.f10280.cancel();
        }
        r0.f10280 = animator;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m13613() {
        this.f11643.f10280 = null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m13616() {
        this.f11643.f10280 = null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public AnimatorSet m13610() {
        return m13615(m13611());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final AnimatorSet m13615(C1091 r8) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (r8.f6499.get("opacity") != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.f11647;
            Property property = View.ALPHA;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, r8.m7462("opacity"));
            ofPropertyValuesHolder.setProperty(property);
            r8.m7460("opacity").m7543((Animator) ofPropertyValuesHolder);
            arrayList.add(ofPropertyValuesHolder);
        }
        if (r8.f6499.get("scale") != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.f11647;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton2, r8.m7462("scale"));
            ofPropertyValuesHolder2.setProperty(property2);
            r8.m7460("scale").m7543((Animator) ofPropertyValuesHolder2);
            arrayList.add(ofPropertyValuesHolder2);
            ExtendedFloatingActionButton extendedFloatingActionButton3 = this.f11647;
            Property property3 = View.SCALE_X;
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton3, r8.m7462("scale"));
            ofPropertyValuesHolder3.setProperty(property3);
            r8.m7460("scale").m7543((Animator) ofPropertyValuesHolder3);
            arrayList.add(ofPropertyValuesHolder3);
        }
        if (r8.f6499.get("width") != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton4 = this.f11647;
            Property<View, Float> property4 = ExtendedFloatingActionButton.f823;
            ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton4, r8.m7462("width"));
            ofPropertyValuesHolder4.setProperty(property4);
            r8.m7460("width").m7543((Animator) ofPropertyValuesHolder4);
            arrayList.add(ofPropertyValuesHolder4);
        }
        if (r8.f6499.get("height") == null) {
            z = false;
        }
        if (z) {
            ExtendedFloatingActionButton extendedFloatingActionButton5 = this.f11647;
            Property<View, Float> property5 = ExtendedFloatingActionButton.f822;
            ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton5, r8.m7462("height"));
            ofPropertyValuesHolder5.setProperty(property5);
            r8.m7460("height").m7543((Animator) ofPropertyValuesHolder5);
            arrayList.add(ofPropertyValuesHolder5);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C1460.m8726(animatorSet, (List<Animator>) arrayList);
        return animatorSet;
    }
}
