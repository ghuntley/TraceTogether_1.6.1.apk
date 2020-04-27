package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.lang.reflect.Method;
import o.C2438;

/* renamed from: o.ϳ  reason: contains not printable characters */
public final class C2179 extends ExtendedFloatingActionButton.C0068 implements MenuItem {

    /* renamed from: ı  reason: contains not printable characters */
    public Method f10381;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1561 f10382;

    public C2179(Context context, C1561 r2) {
        super(context);
        if (r2 != null) {
            this.f10382 = r2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final int getItemId() {
        return this.f10382.getItemId();
    }

    public final int getGroupId() {
        return this.f10382.getGroupId();
    }

    public final int getOrder() {
        return this.f10382.getOrder();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f10382.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f10382.setTitle(i);
        return this;
    }

    public final CharSequence getTitle() {
        return this.f10382.getTitle();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10382.setTitleCondensed(charSequence);
        return this;
    }

    public final CharSequence getTitleCondensed() {
        return this.f10382.getTitleCondensed();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f10382.setIcon(drawable);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f10382.setIcon(i);
        return this;
    }

    public final Drawable getIcon() {
        return this.f10382.getIcon();
    }

    public final MenuItem setIntent(Intent intent) {
        this.f10382.setIntent(intent);
        return this;
    }

    public final Intent getIntent() {
        return this.f10382.getIntent();
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f10382.setShortcut(c, c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f10382.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f10382.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f10382.setNumericShortcut(c, i);
        return this;
    }

    public final char getNumericShortcut() {
        return this.f10382.getNumericShortcut();
    }

    public final int getNumericModifiers() {
        return this.f10382.getNumericModifiers();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f10382.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f10382.setAlphabeticShortcut(c, i);
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.f10382.getAlphabeticShortcut();
    }

    public final int getAlphabeticModifiers() {
        return this.f10382.getAlphabeticModifiers();
    }

    public final MenuItem setCheckable(boolean z) {
        this.f10382.setCheckable(z);
        return this;
    }

    public final boolean isCheckable() {
        return this.f10382.isCheckable();
    }

    public final MenuItem setChecked(boolean z) {
        this.f10382.setChecked(z);
        return this;
    }

    public final boolean isChecked() {
        return this.f10382.isChecked();
    }

    public final MenuItem setVisible(boolean z) {
        return this.f10382.setVisible(z);
    }

    public final boolean isVisible() {
        return this.f10382.isVisible();
    }

    public final MenuItem setEnabled(boolean z) {
        this.f10382.setEnabled(z);
        return this;
    }

    public final boolean isEnabled() {
        return this.f10382.isEnabled();
    }

    public final boolean hasSubMenu() {
        return this.f10382.hasSubMenu();
    }

    public final SubMenu getSubMenu() {
        return m974(this.f10382.getSubMenu());
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10382.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C2181(onMenuItemClickListener) : null);
        return this;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10382.getMenuInfo();
    }

    public final void setShowAsAction(int i) {
        this.f10382.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f10382.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C2182(view);
        }
        this.f10382.setActionView(view);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.f10382.setActionView(i);
        View actionView = this.f10382.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f10382.setActionView((View) new C2182(actionView));
        }
        return this;
    }

    public final View getActionView() {
        View actionView = this.f10382.getActionView();
        return actionView instanceof C2182 ? (View) ((C2182) actionView).f10391 : actionView;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        C2438 r0;
        if (Build.VERSION.SDK_INT >= 16) {
            r0 = new C2180(this.f843, actionProvider);
        } else {
            r0 = new If(this.f843, actionProvider);
        }
        C1561 r1 = this.f10382;
        if (actionProvider == null) {
            r0 = null;
        }
        r1.m9191(r0);
        return this;
    }

    public final ActionProvider getActionProvider() {
        C2438 r0 = this.f10382.m9189();
        if (r0 instanceof If) {
            return ((If) r0).f10383;
        }
        return null;
    }

    public final boolean expandActionView() {
        return this.f10382.expandActionView();
    }

    public final boolean collapseActionView() {
        return this.f10382.collapseActionView();
    }

    public final boolean isActionViewExpanded() {
        return this.f10382.isActionViewExpanded();
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10382.setOnActionExpandListener(onActionExpandListener != null ? new Cif(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f10382.m9188(charSequence);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f10382.getContentDescription();
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f10382.m9190(charSequence);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.f10382.getTooltipText();
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10382.setIconTintList(colorStateList);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.f10382.getIconTintList();
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10382.setIconTintMode(mode);
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f10382.getIconTintMode();
    }

    /* renamed from: o.ϳ$ǃ  reason: contains not printable characters */
    class C2181 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: Ι  reason: contains not printable characters */
        private final MenuItem.OnMenuItemClickListener f10390;

        C2181(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f10390 = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f10390.onMenuItemClick(C2179.this.m973(menuItem));
        }
    }

    /* renamed from: o.ϳ$if  reason: invalid class name */
    class Cif implements MenuItem.OnActionExpandListener {

        /* renamed from: ι  reason: contains not printable characters */
        private final MenuItem.OnActionExpandListener f10386;

        Cif(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f10386 = onActionExpandListener;
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10386.onMenuItemActionExpand(C2179.this.m973(menuItem));
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10386.onMenuItemActionCollapse(C2179.this.m973(menuItem));
        }
    }

    /* renamed from: o.ϳ$If */
    class If extends C2438 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final ActionProvider f10383;

        If(Context context, ActionProvider actionProvider) {
            super(context);
            this.f10383 = actionProvider;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public View m11561() {
            return this.f10383.onCreateActionView();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean m11559() {
            return this.f10383.onPerformDefaultAction();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m11560() {
            return this.f10383.hasSubMenu();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m11558(SubMenu subMenu) {
            this.f10383.onPrepareSubMenu(C2179.this.m974(subMenu));
        }
    }

    /* renamed from: o.ϳ$ı  reason: contains not printable characters */
    class C2180 extends If implements ActionProvider.VisibilityListener {

        /* renamed from: ı  reason: contains not printable characters */
        private C2438.If f10387;

        C2180(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public View m11562(MenuItem menuItem) {
            return this.f10383.onCreateActionView(menuItem);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m11565() {
            return this.f10383.overridesItemVisibility();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m11563() {
            return this.f10383.isVisible();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m11564(C2438.If ifR) {
            this.f10387 = ifR;
            this.f10383.setVisibilityListener(ifR != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C2438.If ifR = this.f10387;
            if (ifR != null) {
                ifR.m12550();
            }
        }
    }

    /* renamed from: o.ϳ$ɩ  reason: contains not printable characters */
    static class C2182 extends FrameLayout implements CON {

        /* renamed from: ı  reason: contains not printable characters */
        final CollapsibleActionView f10391;

        C2182(View view) {
            super(view.getContext());
            this.f10391 = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewExpanded() {
            this.f10391.onActionViewExpanded();
        }

        public final void onActionViewCollapsed() {
            this.f10391.onActionViewCollapsed();
        }
    }
}
