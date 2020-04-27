package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: o.յі  reason: contains not printable characters */
public final class C3158 extends C1976 {
    /* renamed from: ι  reason: contains not printable characters */
    public final void m15972(C2259 r1) {
        m15969(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15970(C2259 r1) {
        m15969(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m15969(C2259 r2) {
        if (r2.f10584 instanceof TextView) {
            r2.f10585.put("android:textscale:scale", Float.valueOf(((TextView) r2.f10584).getScaleX()));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Animator m15971(ViewGroup viewGroup, C2259 r6, C2259 r7) {
        if (r6 == null || r7 == null || !(r6.f10584 instanceof TextView) || !(r7.f10584 instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) r7.f10584;
        Map<String, Object> map = r6.f10585;
        Map<String, Object> map2 = r7.f10585;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
