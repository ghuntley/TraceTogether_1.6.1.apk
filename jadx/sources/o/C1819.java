package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import o.C1976;

/* renamed from: o.Ιɨ  reason: contains not printable characters */
public class C1819 extends C2461 {
    public C1819(int i) {
        m12690(i);
    }

    public C1819() {
    }

    @SuppressLint({"RestrictedApi"})
    public C1819(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004.f9957);
        int r0 = m12687();
        m12690(((XmlResourceParser) attributeSet).getAttributeValue("http://schemas.android.com/apk/res/android", "fadingMode") != null ? obtainStyledAttributes.getInt(0, r0) : r0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10019(C2259 r3) {
        super.m12693(r3);
        r3.f10585.put("android:fade:transitionAlpha", Float.valueOf(C2300.m11981(r3.f10584)));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Animator m10016(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C2300.m11979(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C2300.f10700, new float[]{f2});
        ofFloat.addListener(new C1820(view));
        m10747((C1976.If) new C2169() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10020(C1976 r3) {
                C2300.m11979(view, 1.0f);
                C2300.m11977(view);
                r3.m10741((C1976.If) this);
            }
        });
        return ofFloat;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Animator m10017(View view, C2259 r3) {
        float f;
        Float f2;
        C2300.m11978(view);
        if (r3 == null || (f2 = (Float) r3.f10585.get("android:fade:transitionAlpha")) == null) {
            f = 1.0f;
        } else {
            f = f2.floatValue();
        }
        return m10016(view, f, 0.0f);
    }

    /* renamed from: o.Ιɨ$ɩ  reason: contains not printable characters */
    static class C1820 extends AnimatorListenerAdapter {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f9281 = false;

        /* renamed from: Ι  reason: contains not printable characters */
        private final View f9282;

        C1820(View view) {
            this.f9282 = view;
        }

        public final void onAnimationStart(Animator animator) {
            if (C0293.m4191(this.f9282) && this.f9282.getLayerType() == 0) {
                this.f9281 = true;
                this.f9282.setLayerType(2, (Paint) null);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C2300.m11979(this.f9282, 1.0f);
            if (this.f9281) {
                this.f9282.setLayerType(0, (Paint) null);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Animator m10018(View view, C2259 r5) {
        float f;
        Float f2;
        if (r5 == null || (f2 = (Float) r5.f10585.get("android:fade:transitionAlpha")) == null) {
            f = 0.0f;
        } else {
            f = f2.floatValue();
        }
        if (f == 1.0f) {
            f = 0.0f;
        }
        return m10016(view, f, 1.0f);
    }
}
