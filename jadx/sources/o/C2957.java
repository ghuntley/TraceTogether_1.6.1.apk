package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import o.C2319;
import o.C2596;

/* renamed from: o.ԅ  reason: contains not printable characters */
public class C2957 extends Activity implements C2851, C2596.Cif {
    private C0910<Class<? extends Object>, Object> mExtraDataMap = new C0910<>();
    private C2656 mLifecycleRegistry = new C2656(this);

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2918.m15076(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.m14071(C2319.Cif.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public C2319 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C2596.m13766(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C2596.m13766(decorView, keyEvent)) {
            return C2596.m13767(this, decorView, this, keyEvent);
        }
        return true;
    }
}
