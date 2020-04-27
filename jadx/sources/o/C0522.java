package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: o.ł  reason: contains not printable characters */
public final class C0522 extends ContextWrapper {

    /* renamed from: ı  reason: contains not printable characters */
    public int f4345;

    /* renamed from: ɩ  reason: contains not printable characters */
    private LayoutInflater f4346;

    /* renamed from: Ι  reason: contains not printable characters */
    private Resources.Theme f4347;

    /* renamed from: ι  reason: contains not printable characters */
    private Resources f4348;

    public C0522() {
        super((Context) null);
    }

    public C0522(Context context, int i) {
        super(context);
        this.f4345 = i;
    }

    public C0522(Context context, Resources.Theme theme) {
        super(context);
        this.f4347 = theme;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i) {
        if (this.f4345 != i) {
            this.f4345 = i;
            m5078();
        }
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4347;
        if (theme != null) {
            return theme;
        }
        if (this.f4345 == 0) {
            this.f4345 = R.style.f174212131952028;
        }
        m5078();
        return this.f4347;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4346 == null) {
            this.f4346 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4346;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m5078() {
        if (this.f4347 == null) {
            this.f4347 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4347.setTo(theme);
            }
        }
        this.f4347.applyStyle(this.f4345, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f4348 == null) {
            this.f4348 = super.getResources();
        }
        return this.f4348;
    }
}
