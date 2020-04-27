package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import o.C0712;

/* renamed from: o.Іг  reason: contains not printable characters */
final class C2300 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2418 f10699;

    /* renamed from: ι  reason: contains not printable characters */
    static final Property<View, Float> f10700 = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(C2300.m11981((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C2300.m11979((View) obj, ((Float) obj2).floatValue());
        }
    };

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f10699 = new C2460();
        } else if (Build.VERSION.SDK_INT >= 23) {
            f10699 = new C2419();
        } else if (Build.VERSION.SDK_INT >= 22) {
            f10699 = new C2417();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f10699 = new C2329();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f10699 = new C2331();
        } else {
            f10699 = new C2418();
        }
        new Property<View, Rect>(Rect.class, "clipBounds") {
            public final /* synthetic */ Object get(Object obj) {
                return C0293.m4171((View) obj);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                C0293.m4149((View) obj, (Rect) obj2);
            }
        };
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C0712.C0713 m11983(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2508(view);
        }
        return new C2471(view.getWindowToken());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m11979(View view, float f) {
        f10699.m12473(view, f);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static float m11981(View view) {
        return f10699.m12476(view);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m11978(View view) {
        f10699.m12479(view);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m11977(View view) {
        f10699.m12472(view);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m11984(View view, int i) {
        f10699.m12477(view, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m11980(View view, Matrix matrix) {
        f10699.m12478(view, matrix);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m11976(View view, Matrix matrix) {
        f10699.m12475(view, matrix);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m11982(View view, int i, int i2, int i3, int i4) {
        f10699.m12474(view, i, i2, i3, i4);
    }
}
