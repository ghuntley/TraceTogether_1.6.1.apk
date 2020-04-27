package o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: o.λ  reason: contains not printable characters */
public class C2104 implements Spannable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Object f10200 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private static Executor f10201 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Spannable f10202;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2105 f10203;

    /* renamed from: o.λ$ı  reason: contains not printable characters */
    public static final class C2105 {

        /* renamed from: ı  reason: contains not printable characters */
        final PrecomputedText.Params f10204 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final TextPaint f10205;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final TextDirectionHeuristic f10206;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f10207;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f10208;

        /* renamed from: o.λ$ı$If */
        public static class If {

            /* renamed from: ı  reason: contains not printable characters */
            private final TextPaint f10209;

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f10210;

            /* renamed from: ɩ  reason: contains not printable characters */
            private TextDirectionHeuristic f10211;

            /* renamed from: ι  reason: contains not printable characters */
            private int f10212;

            public If(TextPaint textPaint) {
                this.f10209 = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f10212 = 1;
                    this.f10210 = 1;
                } else {
                    this.f10210 = 0;
                    this.f10212 = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f10211 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f10211 = null;
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public If m11249(int i) {
                this.f10212 = i;
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public If m11250(int i) {
                this.f10210 = i;
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public If m11252(TextDirectionHeuristic textDirectionHeuristic) {
                this.f10211 = textDirectionHeuristic;
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public C2105 m11251() {
                return new C2105(this.f10209, this.f10211, this.f10212, this.f10210);
            }
        }

        C2105(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f10205 = textPaint;
            this.f10206 = textDirectionHeuristic;
            this.f10207 = i;
            this.f10208 = i2;
        }

        public C2105(PrecomputedText.Params params) {
            this.f10205 = params.getTextPaint();
            this.f10206 = params.getTextDirection();
            this.f10207 = params.getBreakStrategy();
            this.f10208 = params.getHyphenationFrequency();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final TextPaint m11244() {
            return this.f10205;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final TextDirectionHeuristic m11247() {
            return this.f10206;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m11248() {
            return this.f10207;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m11246() {
            return this.f10208;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m11245(C2105 r4) {
            PrecomputedText.Params params = this.f10204;
            if (params != null) {
                return params.equals(r4.f10204);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f10207 != r4.m11248() || this.f10208 != r4.m11246())) || this.f10205.getTextSize() != r4.m11244().getTextSize() || this.f10205.getTextScaleX() != r4.m11244().getTextScaleX() || this.f10205.getTextSkewX() != r4.m11244().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f10205.getLetterSpacing() != r4.m11244().getLetterSpacing() || !TextUtils.equals(this.f10205.getFontFeatureSettings(), r4.m11244().getFontFeatureSettings()))) || this.f10205.getFlags() != r4.m11244().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f10205.getTextLocales().equals(r4.m11244().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.f10205.getTextLocale().equals(r4.m11244().getTextLocale())) {
                return false;
            }
            if (this.f10205.getTypeface() == null) {
                if (r4.m11244().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f10205.getTypeface().equals(r4.m11244().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2105)) {
                return false;
            }
            C2105 r5 = (C2105) obj;
            if (!m11245(r5)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f10206 == r5.m11247();
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C2408.m12454(Float.valueOf(this.f10205.getTextSize()), Float.valueOf(this.f10205.getTextScaleX()), Float.valueOf(this.f10205.getTextSkewX()), Float.valueOf(this.f10205.getLetterSpacing()), Integer.valueOf(this.f10205.getFlags()), this.f10205.getTextLocales(), this.f10205.getTypeface(), Boolean.valueOf(this.f10205.isElegantTextHeight()), this.f10206, Integer.valueOf(this.f10207), Integer.valueOf(this.f10208));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return C2408.m12454(Float.valueOf(this.f10205.getTextSize()), Float.valueOf(this.f10205.getTextScaleX()), Float.valueOf(this.f10205.getTextSkewX()), Float.valueOf(this.f10205.getLetterSpacing()), Integer.valueOf(this.f10205.getFlags()), this.f10205.getTextLocale(), this.f10205.getTypeface(), Boolean.valueOf(this.f10205.isElegantTextHeight()), this.f10206, Integer.valueOf(this.f10207), Integer.valueOf(this.f10208));
            } else if (Build.VERSION.SDK_INT >= 18) {
                return C2408.m12454(Float.valueOf(this.f10205.getTextSize()), Float.valueOf(this.f10205.getTextScaleX()), Float.valueOf(this.f10205.getTextSkewX()), Integer.valueOf(this.f10205.getFlags()), this.f10205.getTextLocale(), this.f10205.getTypeface(), this.f10206, Integer.valueOf(this.f10207), Integer.valueOf(this.f10208));
            } else if (Build.VERSION.SDK_INT >= 17) {
                return C2408.m12454(Float.valueOf(this.f10205.getTextSize()), Float.valueOf(this.f10205.getTextScaleX()), Float.valueOf(this.f10205.getTextSkewX()), Integer.valueOf(this.f10205.getFlags()), this.f10205.getTextLocale(), this.f10205.getTypeface(), this.f10206, Integer.valueOf(this.f10207), Integer.valueOf(this.f10208));
            } else {
                return C2408.m12454(Float.valueOf(this.f10205.getTextSize()), Float.valueOf(this.f10205.getTextScaleX()), Float.valueOf(this.f10205.getTextSkewX()), Integer.valueOf(this.f10205.getFlags()), this.f10205.getTypeface(), this.f10206, Integer.valueOf(this.f10207), Integer.valueOf(this.f10208));
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.f10205.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.f10205.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.f10205.getTextSkewX());
            sb.append(sb4.toString());
            if (Build.VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder(", letterSpacing=");
                sb5.append(this.f10205.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
                sb6.append(this.f10205.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                sb7.append(this.f10205.getTextLocales());
                sb.append(sb7.toString());
            } else if (Build.VERSION.SDK_INT >= 17) {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.f10205.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.f10205.getTypeface());
            sb.append(sb9.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                sb10.append(this.f10205.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.f10206);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.f10207);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.f10208);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C2105 m11243() {
        return this.f10203;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f10202.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.f10202.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f10202.getSpans(i, i2, cls);
    }

    public int getSpanStart(Object obj) {
        return this.f10202.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        return this.f10202.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f10202.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10202.nextSpanTransition(i, i2, cls);
    }

    public int length() {
        return this.f10202.length();
    }

    public char charAt(int i) {
        return this.f10202.charAt(i);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f10202.subSequence(i, i2);
    }

    public String toString() {
        return this.f10202.toString();
    }
}
