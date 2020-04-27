package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.гі  reason: contains not printable characters */
class C2418 {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f11007;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f11008;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Field f11009;

    /* renamed from: ι  reason: contains not printable characters */
    private static Method f11010;

    C2418() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12473(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.f167202131362306);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public float m12476(View view) {
        Float f = (Float) view.getTag(R.id.f167202131362306);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m12479(View view) {
        if (view.getTag(R.id.f167202131362306) == null) {
            view.setTag(R.id.f167202131362306, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12472(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.f167202131362306, (Object) null);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12478(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12478(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12475(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12475(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12474(View view, int i, int i2, int i3, int i4) {
        m12471();
        Method method = f11010;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12477(View view, int i) {
        if (!f11007) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11009 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11007 = true;
        }
        Field field = f11009;
        if (field != null) {
            try {
                f11009.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ι  reason: contains not printable characters */
    private void m12471() {
        if (!f11008) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f11010 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f11008 = true;
        }
    }
}
