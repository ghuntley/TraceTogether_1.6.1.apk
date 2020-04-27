package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import o.C2407;

/* renamed from: o.ſ  reason: contains not printable characters */
public final class C0575 extends ActionMode {

    /* renamed from: Ι  reason: contains not printable characters */
    final Context f4486;

    /* renamed from: ι  reason: contains not printable characters */
    final C2407 f4487;

    public C0575(Context context, C2407 r2) {
        this.f4486 = context;
        this.f4487 = r2;
    }

    public final Object getTag() {
        return this.f4487.f10988;
    }

    public final void setTag(Object obj) {
        this.f4487.f10988 = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f4487.m12435(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f4487.m12444(charSequence);
    }

    public final void invalidate() {
        this.f4487.m12445();
    }

    public final void finish() {
        this.f4487.m12437();
    }

    public final Menu getMenu() {
        return new C2612(this.f4486, (C1539) this.f4487.m12440());
    }

    public final CharSequence getTitle() {
        return this.f4487.m12448();
    }

    public final void setTitle(int i) {
        this.f4487.m12438(i);
    }

    public final CharSequence getSubtitle() {
        return this.f4487.m12436();
    }

    public final void setSubtitle(int i) {
        this.f4487.m12441(i);
    }

    public final View getCustomView() {
        return this.f4487.m12442();
    }

    public final void setCustomView(View view) {
        this.f4487.m12439(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.f4487.m12443();
    }

    public final boolean getTitleOptionalHint() {
        return this.f4487.f10987;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f4487.m12446(z);
    }

    public final boolean isTitleOptional() {
        return this.f4487.m12447();
    }

    /* renamed from: o.ſ$ǃ  reason: contains not printable characters */
    public static class C0576 implements C2407.If {

        /* renamed from: ı  reason: contains not printable characters */
        final Context f4488;

        /* renamed from: ɩ  reason: contains not printable characters */
        final ActionMode.Callback f4489;

        /* renamed from: Ι  reason: contains not printable characters */
        final C0910<Menu, Menu> f4490 = new C0910<>();

        /* renamed from: ι  reason: contains not printable characters */
        final ArrayList<C0575> f4491 = new ArrayList<>();

        public C0576(Context context, ActionMode.Callback callback) {
            this.f4488 = context;
            this.f4489 = callback;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m5189(C2407 r2, Menu menu) {
            return this.f4489.onCreateActionMode(m5193(r2), m5188(menu));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m5191(C2407 r2, Menu menu) {
            return this.f4489.onPrepareActionMode(m5193(r2), m5188(menu));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m5192(C2407 r4, MenuItem menuItem) {
            return this.f4489.onActionItemClicked(m5193(r4), new C2179(this.f4488, (C1561) menuItem));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m5190(C2407 r2) {
            this.f4489.onDestroyActionMode(m5193(r2));
        }

        /* renamed from: ı  reason: contains not printable characters */
        private Menu m5188(Menu menu) {
            Menu menu2 = this.f4490.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C2612 r0 = new C2612(this.f4488, (C1539) menu);
            this.f4490.put(menu, r0);
            return r0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final ActionMode m5193(C2407 r5) {
            int size = this.f4491.size();
            for (int i = 0; i < size; i++) {
                C0575 r2 = this.f4491.get(i);
                if (r2 != null && r2.f4487 == r5) {
                    return r2;
                }
            }
            C0575 r0 = new C0575(this.f4488, r5);
            this.f4491.add(r0);
            return r0;
        }
    }
}
