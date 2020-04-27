package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: o.bs  reason: case insensitive filesystem */
public final class C3308bs implements C3306bq {

    /* renamed from: ı  reason: contains not printable characters */
    private final SharedPreferences f1783;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f1784;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f1785;

    public C3308bs(Context context, String str) {
        if (context != null) {
            this.f1784 = context;
            this.f1785 = str;
            this.f1783 = this.f1784.getSharedPreferences(this.f1785, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C3308bs(C3269ai aiVar) {
        this(aiVar.m1589(), aiVar.getClass().getName());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final SharedPreferences m1837() {
        return this.f1783;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final SharedPreferences.Editor m1835() {
        return this.f1783.edit();
    }

    @TargetApi(9)
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m1836(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
