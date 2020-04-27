package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ɐɩ  reason: contains not printable characters */
final class C1093 {

    /* renamed from: ı  reason: contains not printable characters */
    int f6501;

    /* renamed from: ŀ  reason: contains not printable characters */
    private FrameLayout f6502;

    /* renamed from: ł  reason: contains not printable characters */
    private LinearLayout f6503;

    /* renamed from: Ɩ  reason: contains not printable characters */
    TextView f6504;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private int f6505;

    /* renamed from: ƚ  reason: contains not printable characters */
    private final float f6506 = ((float) this.f6507.getResources().getDimensionPixelSize(R.dimen.f158372131165326));

    /* renamed from: ǃ  reason: contains not printable characters */
    final Context f6507;

    /* renamed from: ȷ  reason: contains not printable characters */
    ColorStateList f6508;

    /* renamed from: ɨ  reason: contains not printable characters */
    TextView f6509;

    /* renamed from: ɩ  reason: contains not printable characters */
    Animator f6510;

    /* renamed from: ɪ  reason: contains not printable characters */
    int f6511;

    /* renamed from: ɹ  reason: contains not printable characters */
    CharSequence f6512;

    /* renamed from: ɾ  reason: contains not printable characters */
    boolean f6513;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int f6514;

    /* renamed from: ʟ  reason: contains not printable characters */
    Typeface f6515;

    /* renamed from: Ι  reason: contains not printable characters */
    int f6516;

    /* renamed from: ι  reason: contains not printable characters */
    final C1336 f6517;

    /* renamed from: І  reason: contains not printable characters */
    int f6518;

    /* renamed from: г  reason: contains not printable characters */
    ColorStateList f6519;

    /* renamed from: і  reason: contains not printable characters */
    CharSequence f6520;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f6521;

    /* renamed from: ӏ  reason: contains not printable characters */
    CharSequence f6522;

    public C1093(C1336 r2) {
        this.f6507 = r2.getContext();
        this.f6517 = r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7468() {
        this.f6512 = null;
        Animator animator = this.f6510;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f6516 == 1) {
            if (!this.f6513 || TextUtils.isEmpty(this.f6522)) {
                this.f6501 = 0;
            } else {
                this.f6501 = 2;
            }
        }
        m7469(this.f6516, this.f6501, m7474(this.f6504, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7474(TextView textView, CharSequence charSequence) {
        if (!C0293.m4186(this.f6517) || !this.f6517.isEnabled()) {
            return false;
        }
        return this.f6501 != this.f6516 || textView == null || !TextUtils.equals(textView.getText(), charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7469(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f6510 = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m7465(arrayList2, this.f6513, this.f6509, 2, i3, i4);
                m7465(arrayList2, this.f6521, this.f6504, 1, i3, i4);
                C1460.m8726(animatorSet, (List<Animator>) arrayList);
                final TextView r3 = m7466(i);
                final TextView r5 = m7466(i2);
                final int i5 = i2;
                final int i6 = i;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C1093 r3 = C1093.this;
                        r3.f6516 = i5;
                        r3.f6510 = null;
                        TextView textView = r3;
                        if (textView != null) {
                            textView.setVisibility(4);
                            if (i6 == 1 && C1093.this.f6504 != null) {
                                C1093.this.f6504.setText((CharSequence) null);
                            }
                        }
                        TextView textView2 = r5;
                        if (textView2 != null) {
                            textView2.setTranslationY(0.0f);
                            r5.setAlpha(1.0f);
                        }
                    }

                    public final void onAnimationStart(Animator animator) {
                        TextView textView = r5;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                });
                animatorSet.start();
            } else {
                m7464(i, i2);
            }
            this.f6517.m8416();
            this.f6517.m8414(z2, false);
            this.f6517.m8415();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7464(int i, int i2) {
        TextView r0;
        TextView r02;
        if (i != i2) {
            if (!(i2 == 0 || (r02 = m7466(i2)) == null)) {
                r02.setVisibility(0);
                r02.setAlpha(1.0f);
            }
            if (!(i == 0 || (r0 = m7466(i)) == null)) {
                r0.setVisibility(4);
                if (i == 1) {
                    r0.setText((CharSequence) null);
                }
            }
            this.f6516 = i2;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7465(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m7463(textView, i3 == i));
                if (i3 == i) {
                    list.add(m7467(textView));
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static ObjectAnimator m7463(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C1311.f7290);
        return ofFloat;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private ObjectAnimator m7467(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f6506, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C1311.f7291);
        return ofFloat;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private TextView m7466(int i) {
        if (i == 1) {
            return this.f6504;
        }
        if (i != 2) {
            return null;
        }
        return this.f6509;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7470(TextView textView, int i) {
        if (this.f6503 == null && this.f6502 == null) {
            this.f6503 = new LinearLayout(this.f6507);
            this.f6503.setOrientation(0);
            this.f6517.addView(this.f6503, -1, -2);
            this.f6502 = new FrameLayout(this.f6507);
            this.f6503.addView(this.f6502, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6517.f7418 != null) {
                m7472();
            }
        }
        if (i == 0 || i == 1) {
            this.f6502.setVisibility(0);
            this.f6502.addView(textView);
            this.f6505++;
        } else {
            this.f6503.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6503.setVisibility(0);
        this.f6514++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7473(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f6503 != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.f6502) == null) {
                this.f6503.removeView(textView);
            } else {
                this.f6505--;
                if (this.f6505 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.f6502.removeView(textView);
            }
            this.f6514--;
            LinearLayout linearLayout = this.f6503;
            if (this.f6514 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m7471() {
        if (this.f6501 != 1 || this.f6504 == null || TextUtils.isEmpty(this.f6512)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7472() {
        if ((this.f6503 == null || this.f6517.f7418 == null) ? false : true) {
            C0293.m4178(this.f6503, C0293.m4184(this.f6517.f7418), 0, C0293.m4173(this.f6517.f7418), 0);
        }
    }
}
