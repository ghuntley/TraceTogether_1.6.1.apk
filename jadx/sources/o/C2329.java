package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: o.Јı  reason: contains not printable characters */
class C2329 extends C2331 {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f10821 = true;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f10822 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f10823 = true;

    C2329() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12163(View view, Matrix matrix) {
        if (f10823) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f10823 = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ı  reason: contains not printable characters */
    public void m12162(View view, Matrix matrix) {
        if (f10822) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f10822 = false;
            }
        }
    }
}
