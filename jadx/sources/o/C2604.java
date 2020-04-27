package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: o.іі  reason: contains not printable characters */
public final class C2604 {
    /* renamed from: ı  reason: contains not printable characters */
    public static MenuItem m13816(MenuItem menuItem, C2438 r2) {
        return menuItem instanceof C1561 ? ((C1561) menuItem).m9191(r2) : menuItem;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m13819(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).m9188(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m13820(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).m9190(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m13821(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m13817(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m13822(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m13818(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C1561) {
            ((C1561) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
