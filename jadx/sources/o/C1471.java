package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: o.ɹІ  reason: contains not printable characters */
public class C1471 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1472<?> f7904;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1471 m8801(C1472<?> r1) {
        return new C1471(r1);
    }

    private C1471(C1472<?> r1) {
        this.f7904 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1550 m8806() {
        return this.f7904.f7909;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1277 m8817(String str) {
        return this.f7904.f7909.f8274.m14569(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8822(C1277 r3) {
        C1550 r32 = this.f7904.f7909;
        C1472<?> r0 = this.f7904;
        r32.m9120(r0, r0, (C1277) null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final View m8810(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f7904.f7909.f8264.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8802() {
        this.f7904.f7909.m9147();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Parcelable m8809() {
        return this.f7904.f7909.m9142();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8811(Parcelable parcelable) {
        C1472<?> r0 = this.f7904;
        if (r0 instanceof C0350) {
            r0.f7909.m9134(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8820() {
        C1550 r0 = this.f7904.f7909;
        r0.f8272 = false;
        r0.f8276 = false;
        r0.m9115(1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8818() {
        C1550 r0 = this.f7904.f7909;
        r0.f8272 = false;
        r0.f8276 = false;
        r0.m9115(2);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m8825() {
        C1550 r0 = this.f7904.f7909;
        r0.f8272 = false;
        r0.f8276 = false;
        r0.m9115(3);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m8823() {
        C1550 r0 = this.f7904.f7909;
        r0.f8272 = false;
        r0.f8276 = false;
        r0.m9115(4);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m8815() {
        this.f7904.f7909.m9115(3);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m8805() {
        C1550 r0 = this.f7904.f7909;
        r0.f8276 = true;
        r0.m9115(2);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m8824() {
        this.f7904.f7909.m9144();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8803(boolean z) {
        this.f7904.f7909.m9101(z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8812(boolean z) {
        this.f7904.f7909.m9093(z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8819(Configuration configuration) {
        this.f7904.f7909.m9089(configuration);
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m8808() {
        this.f7904.f7909.m9129();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8813(Menu menu, MenuInflater menuInflater) {
        return this.f7904.f7909.m9122(menu, menuInflater);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m8807(Menu menu) {
        return this.f7904.f7909.m9104(menu);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m8804(MenuItem menuItem) {
        return this.f7904.f7909.m9105(menuItem);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8814(MenuItem menuItem) {
        return this.f7904.f7909.m9123(menuItem);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8821(Menu menu) {
        this.f7904.f7909.m9117(menu);
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final boolean m8816() {
        return this.f7904.f7909.m9141(true);
    }
}
