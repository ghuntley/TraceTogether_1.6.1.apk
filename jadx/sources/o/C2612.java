package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: o.ј  reason: contains not printable characters */
public class C2612 extends ExtendedFloatingActionButton.C0068 implements Menu {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1539 f11873;

    public C2612(Context context, C1539 r2) {
        super(context);
        if (r2 != null) {
            this.f11873 = r2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return m973(this.f11873.add(charSequence));
    }

    public MenuItem add(int i) {
        return m973(this.f11873.add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m973(this.f11873.add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m973(this.f11873.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m974(this.f11873.addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return m974(this.f11873.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m974(this.f11873.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m974(this.f11873.addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f11873.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = m973(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        m972(i);
        this.f11873.removeItem(i);
    }

    public void removeGroup(int i) {
        m970(i);
        this.f11873.removeGroup(i);
    }

    public void clear() {
        m971();
        this.f11873.clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f11873.setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f11873.setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f11873.setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return this.f11873.hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return m973(this.f11873.findItem(i));
    }

    public int size() {
        return this.f11873.size();
    }

    public MenuItem getItem(int i) {
        return m973(this.f11873.getItem(i));
    }

    public void close() {
        this.f11873.close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f11873.performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f11873.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f11873.performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        this.f11873.setQwertyMode(z);
    }
}
