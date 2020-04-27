package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.к  reason: contains not printable characters */
public abstract class C2438 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f11074;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C2439 f11075;

    /* renamed from: ɩ  reason: contains not printable characters */
    private If f11076;

    /* renamed from: o.к$If */
    public interface If {
        /* renamed from: ι  reason: contains not printable characters */
        void m12550();
    }

    /* renamed from: o.к$ı  reason: contains not printable characters */
    public interface C2439 {
        /* renamed from: ı  reason: contains not printable characters */
        void m12551(boolean z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12540(SubMenu subMenu) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m12542() {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m12544() {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m12546() {
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m12548() {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public abstract View m12549();

    public C2438(Context context) {
        this.f11074 = context;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public View m12539(MenuItem menuItem) {
        return m12549();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12541(boolean z) {
        C2439 r0 = this.f11075;
        if (r0 != null) {
            r0.m12551(z);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12545(C2439 r1) {
        this.f11075 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m12547(If ifR) {
        this.f11076 = ifR;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m12543() {
        this.f11076 = null;
        this.f11075 = null;
    }
}
