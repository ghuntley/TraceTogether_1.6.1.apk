package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.ǀ  reason: contains not printable characters */
public final class C0836 implements C1561 {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f5470;

    /* renamed from: ŀ  reason: contains not printable characters */
    private ColorStateList f5471 = null;

    /* renamed from: ł  reason: contains not printable characters */
    private int f5472 = 16;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private char f5473;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f5474;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Drawable f5475;

    /* renamed from: ɨ  reason: contains not printable characters */
    private CharSequence f5476;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f5477;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Context f5478;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Intent f5479;

    /* renamed from: ɾ  reason: contains not printable characters */
    private CharSequence f5480;

    /* renamed from: ɿ  reason: contains not printable characters */
    private PorterDuff.Mode f5481 = null;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f5482 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f5483;

    /* renamed from: ι  reason: contains not printable characters */
    private CharSequence f5484;

    /* renamed from: І  reason: contains not printable characters */
    private char f5485;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f5486 = false;

    /* renamed from: і  reason: contains not printable characters */
    private int f5487 = C0872.f5653;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private CharSequence f5488;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f5489 = C0872.f5653;

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2438 m6305() {
        return null;
    }

    public C0836(Context context, CharSequence charSequence) {
        this.f5478 = context;
        this.f5477 = 16908332;
        this.f5483 = 0;
        this.f5470 = 0;
        this.f5474 = 0;
        this.f5484 = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.f5473;
    }

    public final int getAlphabeticModifiers() {
        return this.f5489;
    }

    public final int getGroupId() {
        return this.f5483;
    }

    public final Drawable getIcon() {
        return this.f5475;
    }

    public final Intent getIntent() {
        return this.f5479;
    }

    public final int getItemId() {
        return this.f5477;
    }

    public final char getNumericShortcut() {
        return this.f5485;
    }

    public final int getNumericModifiers() {
        return this.f5487;
    }

    public final int getOrder() {
        return this.f5474;
    }

    public final CharSequence getTitle() {
        return this.f5484;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5488;
        return charSequence != null ? charSequence : this.f5484;
    }

    public final boolean isCheckable() {
        return (this.f5472 & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f5472 & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f5472 & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f5472 & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f5473 = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5473 = Character.toLowerCase(c);
        this.f5489 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f5472 = z | (this.f5472 & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f5472 = (z ? 2 : 0) | (this.f5472 & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f5472 = (z ? 16 : 0) | (this.f5472 & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f5475 = drawable;
        m6303();
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f5475 = C0651.m5458(this.f5478, i);
        m6303();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f5479 = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f5485 = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f5485 = c;
        this.f5487 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f5485 = c;
        this.f5473 = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5485 = c;
        this.f5487 = KeyEvent.normalizeMetaState(i);
        this.f5473 = Character.toLowerCase(c2);
        this.f5489 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5484 = charSequence;
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f5484 = this.f5478.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5488 = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f5472 & 8;
        if (z) {
            i = 0;
        }
        this.f5472 = i2 | i;
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1561 m6307(C2438 r1) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1561 m6304(CharSequence charSequence) {
        this.f5476 = charSequence;
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f5476;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1561 m6306(CharSequence charSequence) {
        this.f5480 = charSequence;
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.f5480;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5471 = colorStateList;
        this.f5482 = true;
        m6303();
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.f5471;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5481 = mode;
        this.f5486 = true;
        m6303();
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f5481;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6303() {
        if (this.f5475 == null) {
            return;
        }
        if (this.f5482 || this.f5486) {
            this.f5475 = C1266.m8158(this.f5475);
            this.f5475 = this.f5475.mutate();
            if (this.f5482) {
                C1266.m8152(this.f5475, this.f5471);
            }
            if (this.f5486) {
                C1266.m8153(this.f5475, this.f5481);
            }
        }
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f5480 = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f5476 = charSequence;
        return this;
    }
}
