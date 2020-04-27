package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.ʔ  reason: contains not printable characters */
public final class C1652 extends C2612 implements SubMenu {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1676 f8651;

    public C1652(Context context, C1676 r2) {
        super(context, r2);
        this.f8651 = r2;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f8651.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f8651.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f8651.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f8651.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f8651.setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        this.f8651.clearHeader();
    }

    public final SubMenu setIcon(int i) {
        this.f8651.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f8651.setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return m973(this.f8651.getItem());
    }
}
