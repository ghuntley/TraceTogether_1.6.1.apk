package o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: o.ɩі  reason: contains not printable characters */
public final class C1311 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final TimeInterpolator f7288 = new C1972();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final TimeInterpolator f7289 = new C1991();

    /* renamed from: ι  reason: contains not printable characters */
    public static final TimeInterpolator f7290 = new LinearInterpolator();

    /* renamed from: І  reason: contains not printable characters */
    public static final TimeInterpolator f7291 = new C2000();

    /* renamed from: і  reason: contains not printable characters */
    public static final TimeInterpolator f7292 = new DecelerateInterpolator();

    /* renamed from: ı  reason: contains not printable characters */
    public final String f7293;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f7294;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f7295;

    /* renamed from: o.ɩі$ɩ  reason: contains not printable characters */
    interface C1312<T> {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m8268(T[] tArr, int i);

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m8269(T t);

        /* renamed from: Ι  reason: contains not printable characters */
        T m8270();
    }

    /* renamed from: o.ɩі$if  reason: invalid class name */
    static class Cif<T> implements C1312<T> {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Object[] f7296 = new Object[256];

        /* renamed from: ι  reason: contains not printable characters */
        private int f7297;

        Cif() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final T m8267() {
            int i = this.f7297;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f7296;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f7297 = i - 1;
            return t;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m8266(T t) {
            int i = this.f7297;
            Object[] objArr = this.f7296;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f7297 = i + 1;
            return true;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m8265(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f7297;
                Object[] objArr = this.f7296;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f7297 = i3 + 1;
                }
            }
        }
    }

    public C1311(String str, String str2, String str3) {
        this.f7294 = str;
        this.f7293 = str2;
        this.f7295 = str3;
    }

    public C1311() {
    }
}
