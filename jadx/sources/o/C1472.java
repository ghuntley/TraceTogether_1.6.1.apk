package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* renamed from: o.ɹі  reason: contains not printable characters */
public abstract class C1472<E> extends C1380 {

    /* renamed from: ı  reason: contains not printable characters */
    public final Context f7905;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Activity f7906;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Handler f7907;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f7908;

    /* renamed from: ι  reason: contains not printable characters */
    final C1550 f7909;

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m8827() {
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public View m8830(int i) {
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8831() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m8832(String str) {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract E m8834();

    /* renamed from: Ι  reason: contains not printable characters */
    public void m8835(String str, PrintWriter printWriter, String[] strArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m8836(C1277 r1) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m8837(C1277 r1, String[] strArr, int i) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m8838() {
        return true;
    }

    C1472(C1269 r2) {
        this(r2, r2, new Handler());
    }

    private C1472(Activity activity, Context context, Handler handler) {
        this.f7909 = new C1473();
        this.f7906 = activity;
        if (context != null) {
            this.f7905 = context;
            this.f7907 = handler;
            this.f7908 = 0;
            return;
        }
        throw new NullPointerException("context == null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public LayoutInflater m8829() {
        return LayoutInflater.from(this.f7905);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m8826(C1277 r1, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f7905.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final Activity m8839() {
        return this.f7906;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final Context m8833() {
        return this.f7905;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final Handler m8828() {
        return this.f7907;
    }
}
