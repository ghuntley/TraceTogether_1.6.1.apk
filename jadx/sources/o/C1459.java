package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import o.C0656;
import o.C2407;

/* renamed from: o.ɹ  reason: contains not printable characters */
public class C1459 extends C1269 implements C3249AUx, C0656.If {
    private C3336con mDelegate;
    private Resources mResources;

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C0656 r1) {
    }

    public void onSupportActionModeFinished(C2407 r1) {
    }

    public void onSupportActionModeStarted(C2407 r1) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public C2407 onWindowStartingSupportActionMode(C2407.If ifR) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        getDelegate().m1988(context);
    }

    public void onCreate(Bundle bundle) {
        C3336con delegate = getDelegate();
        delegate.m2007();
        delegate.m1989(bundle);
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().m1987(i);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().m1994(bundle);
    }

    public C3282auX getSupportActionBar() {
        return getDelegate().m1992();
    }

    public void setSupportActionBar(C2026 r2) {
        getDelegate().m1997(r2);
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().m2004();
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

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().m1995(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().m2000(configuration);
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().m1991();
    }

    public void onStart() {
        super.onStart();
        getDelegate().m1999();
    }

    public void onStop() {
        super.onStop();
        getDelegate().m1986();
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().m2005(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C3282auX supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.m1631() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().m2008();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().m1996(charSequence);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().m1998();
    }

    public void invalidateOptionsMenu() {
        getDelegate().m1998();
    }

    public void onCreateSupportNavigateUpTaskStack(C0656 r1) {
        r1.m5472((Activity) this);
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0656 r0 = C0656.m5471((Context) this);
            onCreateSupportNavigateUpTaskStack(r0);
            onPrepareSupportNavigateUpTaskStack(r0);
            r0.m5474();
            try {
                C2944.m15206(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public Intent getSupportParentActivityIntent() {
        return C0336.m4436(this);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0336.m4440(this, intent);
    }

    public void supportNavigateUpTo(Intent intent) {
        C0336.m4439(this, intent);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().m2006(bundle);
    }

    public C3336con getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C3336con.m1981((Activity) this, (C3249AUx) this);
        }
        return this.mDelegate;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C3282auX supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.m1630(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Resources getResources() {
        if (this.mResources == null && C2123.m11293()) {
            this.mResources = new C2123(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1459.performMenuItemShortcut(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        C3282auX supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.m1629()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        C3282auX supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.m1636()) {
            super.closeOptionsMenu();
        }
    }
}
