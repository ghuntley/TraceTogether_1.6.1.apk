package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import o.C2328;
import o.C2407;

/* renamed from: o.cON  reason: case insensitive filesystem */
public final class C3317cON extends C2407 implements C2328.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    private Context f1902;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2328 f1903;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0308 f1904;

    /* renamed from: ɹ  reason: contains not printable characters */
    private WeakReference<View> f1905;

    /* renamed from: Ι  reason: contains not printable characters */
    private C2407.If f1906;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f1907;

    public C3317cON(Context context, C0308 r2, C2407.If ifR) {
        this.f1902 = context;
        this.f1904 = r2;
        this.f1906 = ifR;
        C2328 r1 = new C2328(r2.getContext());
        r1.f10810 = 1;
        this.f1903 = r1;
        this.f1903.m12148((C2328.Cif) this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1903(CharSequence charSequence) {
        this.f1904.setTitle(charSequence);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1913(CharSequence charSequence) {
        this.f1904.setSubtitle(charSequence);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1906(int i) {
        this.f1904.setTitle(this.f1902.getString(i));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1909(int i) {
        this.f1904.setSubtitle(this.f1902.getString(i));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1916(boolean z) {
        super.m12446(z);
        this.f1904.setTitleOptional(z);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m1917() {
        return this.f1904.f3611;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1907(View view) {
        this.f1904.setCustomView(view);
        this.f1905 = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1914() {
        this.f1906.m12451((C2407) this, (Menu) this.f1903);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1905() {
        if (!this.f1907) {
            this.f1907 = true;
            this.f1904.sendAccessibilityEvent(32);
            this.f1906.m12450(this);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Menu m1908() {
        return this.f1903;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final CharSequence m1918() {
        return this.f1904.f3609;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final CharSequence m1904() {
        return this.f1904.f3612;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final View m1911() {
        WeakReference<View> weakReference = this.f1905;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final MenuInflater m1912() {
        return new C0491(this.f1904.getContext());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m1910(C2328 r1, MenuItem menuItem) {
        return this.f1906.m12452((C2407) this, menuItem);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1915(C2328 r2) {
        this.f1906.m12451((C2407) this, (Menu) this.f1903);
        this.f1904.m4371();
    }
}
