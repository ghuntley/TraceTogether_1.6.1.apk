package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.C2407;
import o.C2596;

/* renamed from: o.ȷ  reason: contains not printable characters */
public class C0956 extends Dialog implements C3249AUx {
    private C3336con mDelegate;
    private final C2596.Cif mKeyDispatcher = new C2596.Cif() {
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C0956.this.superDispatchKeyEvent(keyEvent);
        }
    };

    public void onSupportActionModeFinished(C2407 r1) {
    }

    public void onSupportActionModeStarted(C2407 r1) {
    }

    public C2407 onWindowStartingSupportActionMode(C2407.If ifR) {
        return null;
    }

    public C0956(Context context, int i) {
        super(context, getThemeResId(context, i));
        C3336con delegate = getDelegate();
        delegate.m1987(getThemeResId(context, i));
        delegate.m1989((Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        getDelegate().m2007();
        super.onCreate(bundle);
        getDelegate().m1989(bundle);
    }

    public void setContentView(int i) {
        getDelegate().m1993(i);
    }

    public void setContentView(View view) {
        getDelegate().m2001(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().m2002(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().m2005(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().m1996(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().m1996((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().m1995(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().m1986();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().m2003(i);
    }

    public void invalidateOptionsMenu() {
        getDelegate().m1998();
    }

    public C3336con getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C3336con.m1982((Dialog) this, (C3249AUx) this);
        }
        return this.mDelegate;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f150852130968872, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C2596.m13767(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
