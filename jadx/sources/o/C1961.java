package o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import o.C1899;

/* renamed from: o.ιƶ  reason: contains not printable characters */
public interface C1961 extends C1899.C1900 {
    C1962 C_();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1962 r1);

    /* renamed from: ı  reason: contains not printable characters */
    void m10688();

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10689();

    /* renamed from: ι  reason: contains not printable characters */
    int m10690();

    /* renamed from: o.ιƶ$ı  reason: contains not printable characters */
    public static class C1962 {

        /* renamed from: ı  reason: contains not printable characters */
        public float f9853;

        /* renamed from: ɩ  reason: contains not printable characters */
        public float f9854;

        /* renamed from: ι  reason: contains not printable characters */
        public float f9855;

        /* synthetic */ C1962(byte b) {
            this();
        }

        private C1962() {
        }

        public C1962(float f, float f2, float f3) {
            this.f9854 = f;
            this.f9853 = f2;
            this.f9855 = f3;
        }

        public C1962(C1962 r3) {
            this(r3.f9854, r3.f9853, r3.f9855);
        }
    }

    /* renamed from: o.ιƶ$if  reason: invalid class name */
    public static class Cif extends Property<C1961, C1962> {

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final Property<C1961, C1962> f9852 = new Cif("circularReveal");

        public final /* synthetic */ Object get(Object obj) {
            return ((C1961) obj).C_();
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((C1961) obj).setRevealInfo((C1962) obj2);
        }

        private Cif(String str) {
            super(C1962.class, str);
        }
    }

    /* renamed from: o.ιƶ$ǃ  reason: contains not printable characters */
    public static class C1963 implements TypeEvaluator<C1962> {

        /* renamed from: ı  reason: contains not printable characters */
        public static final TypeEvaluator<C1962> f9856 = new C1963();

        /* renamed from: ι  reason: contains not printable characters */
        private final C1962 f9857 = new C1962((byte) 0);

        public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            C1962 r7 = (C1962) obj;
            C1962 r8 = (C1962) obj2;
            C1962 r0 = this.f9857;
            float f2 = 1.0f - f;
            float f3 = (r7.f9854 * f2) + (r8.f9854 * f);
            float f4 = r7.f9853;
            float f5 = r7.f9855;
            r0.f9854 = f3;
            r0.f9853 = (f4 * f2) + (r8.f9853 * f);
            r0.f9855 = (f2 * f5) + (f * r8.f9855);
            return this.f9857;
        }
    }

    /* renamed from: o.ιƶ$ɩ  reason: contains not printable characters */
    public static class C1964 extends Property<C1961, Integer> {

        /* renamed from: ι  reason: contains not printable characters */
        public static final Property<C1961, Integer> f9858 = new C1964("circularRevealScrimColor");

        public final /* synthetic */ Object get(Object obj) {
            return Integer.valueOf(((C1961) obj).m10690());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((C1961) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }

        private C1964(String str) {
            super(Integer.class, str);
        }
    }
}
