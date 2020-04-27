package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import o.C2438;

/* renamed from: o.с  reason: contains not printable characters */
public final class C2459 implements C1561 {

    /* renamed from: ı  reason: contains not printable characters */
    int f11167 = C0872.f5653;

    /* renamed from: ŀ  reason: contains not printable characters */
    private CharSequence f11168;

    /* renamed from: ł  reason: contains not printable characters */
    private Intent f11169;

    /* renamed from: ſ  reason: contains not printable characters */
    private PorterDuff.Mode f11170 = null;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f11171 = 0;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private boolean f11172 = false;

    /* renamed from: ƚ  reason: contains not printable characters */
    private CharSequence f11173;

    /* renamed from: ǀ  reason: contains not printable characters */
    private View f11174;

    /* renamed from: ǃ  reason: contains not printable characters */
    char f11175;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final int f11176;

    /* renamed from: ɍ  reason: contains not printable characters */
    private ColorStateList f11177 = null;

    /* renamed from: ɔ  reason: contains not printable characters */
    private MenuItem.OnActionExpandListener f11178;

    /* renamed from: ɟ  reason: contains not printable characters */
    private boolean f11179 = false;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final int f11180;

    /* renamed from: ɩ  reason: contains not printable characters */
    final int f11181;

    /* renamed from: ɪ  reason: contains not printable characters */
    private CharSequence f11182;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f11183 = 16;

    /* renamed from: ɼ  reason: contains not printable characters */
    private boolean f11184 = false;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final int f11185;

    /* renamed from: ɿ  reason: contains not printable characters */
    private MenuItem.OnMenuItemClickListener f11186;

    /* renamed from: ʅ  reason: contains not printable characters */
    private CharSequence f11187;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f11188 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    int f11189 = C0872.f5653;

    /* renamed from: ι  reason: contains not printable characters */
    char f11190;

    /* renamed from: І  reason: contains not printable characters */
    public C1653 f11191;

    /* renamed from: г  reason: contains not printable characters */
    private Drawable f11192;

    /* renamed from: і  reason: contains not printable characters */
    public C2328 f11193;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C2438 f11194;

    /* renamed from: ӏ  reason: contains not printable characters */
    public boolean f11195 = false;

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    C2459(C2328 r3, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f11193 = r3;
        this.f11180 = i2;
        this.f11176 = i;
        this.f11185 = i3;
        this.f11181 = i4;
        this.f11182 = charSequence;
        this.f11171 = i5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12669() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f11186;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C2328 r0 = this.f11193;
        if (r0.m12139(r0, this)) {
            return true;
        }
        if (this.f11169 != null) {
            try {
                this.f11193.f10808.startActivity(this.f11169);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        C2438 r02 = this.f11194;
        if (r02 == null || !r02.m12542()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.f11183 & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f11183 |= 16;
        } else {
            this.f11183 &= -17;
        }
        this.f11193.m12149(false);
        return this;
    }

    public final int getGroupId() {
        return this.f11176;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f11180;
    }

    public final int getOrder() {
        return this.f11185;
    }

    public final Intent getIntent() {
        return this.f11169;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f11169 = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.f11190;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f11190 == c) {
            return this;
        }
        this.f11190 = Character.toLowerCase(c);
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f11190 == c && this.f11189 == i) {
            return this;
        }
        this.f11190 = Character.toLowerCase(c);
        this.f11189 = KeyEvent.normalizeMetaState(i);
        this.f11193.m12149(false);
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.f11189;
    }

    public final char getNumericShortcut() {
        return this.f11175;
    }

    public final int getNumericModifiers() {
        return this.f11167;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f11175 == c) {
            return this;
        }
        this.f11175 = c;
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f11175 == c && this.f11167 == i) {
            return this;
        }
        this.f11175 = c;
        this.f11167 = KeyEvent.normalizeMetaState(i);
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f11175 = c;
        this.f11190 = Character.toLowerCase(c2);
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f11175 = c;
        this.f11167 = KeyEvent.normalizeMetaState(i);
        this.f11190 = Character.toLowerCase(c2);
        this.f11189 = KeyEvent.normalizeMetaState(i2);
        this.f11193.m12149(false);
        return this;
    }

    public final SubMenu getSubMenu() {
        return this.f11191;
    }

    public final boolean hasSubMenu() {
        return this.f11191 != null;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f11182;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11182 = charSequence;
        this.f11193.m12149(false);
        C1653 r0 = this.f11191;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f11193.f10808.getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11168;
        if (charSequence == null) {
            charSequence = this.f11182;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11168 = charSequence;
        this.f11193.m12149(false);
        return this;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f11192;
        if (drawable != null) {
            return m12666(drawable);
        }
        if (this.f11188 == 0) {
            return null;
        }
        Drawable r0 = C3257Con.m1345(this.f11193.f10808, this.f11188);
        this.f11188 = 0;
        this.f11192 = r0;
        return m12666(r0);
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f11188 = 0;
        this.f11192 = drawable;
        this.f11184 = true;
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f11192 = null;
        this.f11188 = i;
        this.f11184 = true;
        this.f11193.m12149(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11177 = colorStateList;
        this.f11172 = true;
        this.f11184 = true;
        this.f11193.m12149(false);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.f11177;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11170 = mode;
        this.f11179 = true;
        this.f11184 = true;
        this.f11193.m12149(false);
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f11170;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable m12666(Drawable drawable) {
        if (drawable != null && this.f11184 && (this.f11172 || this.f11179)) {
            drawable = C1266.m8158(drawable).mutate();
            if (this.f11172) {
                C1266.m8152(drawable, this.f11177);
            }
            if (this.f11179) {
                C1266.m8153(drawable, this.f11170);
            }
            this.f11184 = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.f11183 & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f11183;
        this.f11183 = z | (i & true) ? 1 : 0;
        if (i != this.f11183) {
            this.f11193.m12149(false);
        }
        return this;
    }

    public final boolean isChecked() {
        return (this.f11183 & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f11183 & 4) != 0) {
            C2328 r8 = this.f11193;
            int groupId = getGroupId();
            int size = r8.f10816.size();
            if (!r8.f10820) {
                r8.f10820 = true;
                r8.f10809 = false;
                r8.f10811 = false;
            }
            for (int i = 0; i < size; i++) {
                C2459 r5 = r8.f10816.get(i);
                if (r5.getGroupId() == groupId) {
                    if (((r5.f11183 & 4) != 0) && r5.isCheckable()) {
                        r5.m12667(r5 == this);
                    }
                }
            }
            r8.f10820 = false;
            if (r8.f10809) {
                r8.f10809 = false;
                r8.m12149(r8.f10811);
            }
        } else {
            m12667(z);
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m12667(boolean z) {
        int i = this.f11183;
        this.f11183 = (z ? 2 : 0) | (i & -3);
        if (i != this.f11183) {
            this.f11193.m12149(false);
        }
    }

    public final boolean isVisible() {
        C2438 r0 = this.f11194;
        return (r0 == null || !r0.m12548()) ? (this.f11183 & 8) == 0 : (this.f11183 & 8) == 0 && this.f11194.m12546();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12670(boolean z) {
        int i = this.f11183;
        this.f11183 = (z ? 0 : 8) | (i & -9);
        if (i != this.f11183) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (m12670(z)) {
            C2328 r2 = this.f11193;
            r2.f10815 = true;
            r2.m12149(true);
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11186 = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f11182;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f11171 = i;
            C2328 r4 = this.f11193;
            r4.f10817 = true;
            r4.m12149(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C1561 setActionView(View view) {
        int i;
        this.f11174 = view;
        this.f11194 = null;
        if (view != null && view.getId() == -1 && (i = this.f11180) > 0) {
            view.setId(i);
        }
        C2328 r3 = this.f11193;
        r3.f10817 = true;
        r3.m12149(true);
        return this;
    }

    public final View getActionView() {
        View view = this.f11174;
        if (view != null) {
            return view;
        }
        C2438 r0 = this.f11194;
        if (r0 == null) {
            return null;
        }
        this.f11174 = r0.m12539((MenuItem) this);
        return this.f11174;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2438 m12672() {
        return this.f11194;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1561 m12674(C2438 r2) {
        C2438 r0 = this.f11194;
        if (r0 != null) {
            r0.m12543();
        }
        this.f11174 = null;
        this.f11194 = r2;
        this.f11193.m12149(true);
        C2438 r22 = this.f11194;
        if (r22 != null) {
            r22.m12547(new C2438.If() {
                /* renamed from: ι  reason: contains not printable characters */
                public final void m12676() {
                    C2328 r0 = C2459.this.f11193;
                    r0.f10815 = true;
                    r0.m12149(true);
                }
            });
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!m12675()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11178;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f11193.m12150(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.f11171 & 8) == 0) {
            return false;
        }
        if (this.f11174 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11178;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f11193.m12140(this);
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m12675() {
        C2438 r0;
        if ((this.f11171 & 8) != 0) {
            if (this.f11174 == null && (r0 = this.f11194) != null) {
                this.f11174 = r0.m12539((MenuItem) this);
            }
            if (this.f11174 != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f11195;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11178 = onActionExpandListener;
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1561 m12671(CharSequence charSequence) {
        this.f11187 = charSequence;
        this.f11193.m12149(false);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f11187;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1561 m12673(CharSequence charSequence) {
        this.f11173 = charSequence;
        this.f11193.m12149(false);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.f11173;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f11193.f10808;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f11173 = charSequence;
        this.f11193.m12149(false);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f11187 = charSequence;
        this.f11193.m12149(false);
        return this;
    }
}
