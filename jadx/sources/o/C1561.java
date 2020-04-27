package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* renamed from: o.ɿı  reason: contains not printable characters */
public interface C1561 extends MenuItem {
    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    /* renamed from: Ι  reason: contains not printable characters */
    C1561 m9188(CharSequence charSequence);

    /* renamed from: Ι  reason: contains not printable characters */
    C2438 m9189();

    /* renamed from: ι  reason: contains not printable characters */
    C1561 m9190(CharSequence charSequence);

    /* renamed from: ι  reason: contains not printable characters */
    C1561 m9191(C2438 r1);
}
