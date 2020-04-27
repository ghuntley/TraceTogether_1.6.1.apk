package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o.C2328;

/* renamed from: o.ʕ  reason: contains not printable characters */
public class C1653 extends C2328 implements SubMenu {

    /* renamed from: ɿ  reason: contains not printable characters */
    private C2459 f8652;

    /* renamed from: г  reason: contains not printable characters */
    public C2328 f8653;

    public C1653(Context context, C2328 r2, C2459 r3) {
        super(context);
        this.f8653 = r2;
        this.f8652 = r3;
    }

    public void setQwertyMode(boolean z) {
        this.f8653.setQwertyMode(z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9503() {
        return this.f8653.m12134();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9507() {
        return this.f8653.m12142();
    }

    public MenuItem getItem() {
        return this.f8652;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9508(C2328.Cif ifVar) {
        this.f8653.m12148(ifVar);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C2328 m9511() {
        return this.f8653.m12158();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9505(C2328 r2, MenuItem menuItem) {
        return super.m12139(r2, menuItem) || this.f8653.m12139(r2, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f8652.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f8652.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m12153(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m12146(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m12136(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m12152(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m12154(view);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9509(C2459 r2) {
        return this.f8653.m12150(r2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9506(C2459 r2) {
        return this.f8653.m12140(r2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m9504() {
        C2459 r0 = this.f8652;
        int itemId = r0 != null ? r0.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.m12135());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f8653.setGroupDividerEnabled(z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9510() {
        return this.f8653.m12157();
    }
}
