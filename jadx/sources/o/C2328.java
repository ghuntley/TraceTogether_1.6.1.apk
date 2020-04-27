package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.Ј  reason: contains not printable characters */
public class C2328 implements C1539 {

    /* renamed from: г  reason: contains not printable characters */
    private static final int[] f10796 = {1, 4, 5, 3, 2, 0};

    /* renamed from: ı  reason: contains not printable characters */
    public ArrayList<C2459> f10797;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final Resources f10798;

    /* renamed from: ł  reason: contains not printable characters */
    C2459 f10799;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f10800 = false;

    /* renamed from: Ɩ  reason: contains not printable characters */
    CharSequence f10801;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private boolean f10802;

    /* renamed from: ƚ  reason: contains not printable characters */
    private ArrayList<C2459> f10803;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Cif f10804;

    /* renamed from: ȷ  reason: contains not printable characters */
    View f10805;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f10806 = false;

    /* renamed from: ɨ  reason: contains not printable characters */
    public CopyOnWriteArrayList<WeakReference<C1483>> f10807 = new CopyOnWriteArrayList<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Context f10808;

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean f10809 = false;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f10810 = 0;

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean f10811 = false;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f10812;

    /* renamed from: ʅ  reason: contains not printable characters */
    private ArrayList<C2459> f10813 = new ArrayList<>();

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean f10814;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f10815;

    /* renamed from: ι  reason: contains not printable characters */
    ArrayList<C2459> f10816;

    /* renamed from: І  reason: contains not printable characters */
    public boolean f10817;

    /* renamed from: і  reason: contains not printable characters */
    Drawable f10818;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public ArrayList<C2459> f10819;

    /* renamed from: ӏ  reason: contains not printable characters */
    public boolean f10820 = false;

    /* renamed from: o.Ј$If */
    public interface If {
        /* renamed from: ι  reason: contains not printable characters */
        boolean m12159(C2459 r1);
    }

    /* renamed from: o.Ј$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m12160(C2328 r1, MenuItem menuItem);

        /* renamed from: ι  reason: contains not printable characters */
        void m12161(C2328 r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public String m12135() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: І  reason: contains not printable characters */
    public C2328 m12158() {
        return this;
    }

    public C2328(Context context) {
        this.f10808 = context;
        this.f10798 = context.getResources();
        this.f10816 = new ArrayList<>();
        this.f10803 = new ArrayList<>();
        boolean z = true;
        this.f10815 = true;
        this.f10797 = new ArrayList<>();
        this.f10819 = new ArrayList<>();
        this.f10817 = true;
        this.f10802 = (this.f10798.getConfiguration().keyboard == 1 || !C0297.m4264(ViewConfiguration.get(this.f10808), this.f10808)) ? false : z;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12156(C1483 r4) {
        Context context = this.f10808;
        this.f10807.add(new WeakReference(r4));
        r4.m8873(context, this);
        this.f10817 = true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12138(C1483 r4) {
        Iterator<WeakReference<C1483>> it = this.f10807.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C1483 r2 = (C1483) next.get();
            if (r2 == null || r2 == r4) {
                this.f10807.remove(next);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m12132(C1653 r4, C1483 r5) {
        boolean z = false;
        if (this.f10807.isEmpty()) {
            return false;
        }
        if (r5 != null) {
            z = r5.m8872(r4);
        }
        Iterator<WeakReference<C1483>> it = this.f10807.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C1483 r2 = (C1483) next.get();
            if (r2 == null) {
                this.f10807.remove(next);
            } else if (!z) {
                z = r2.m8872(r4);
            }
        }
        return z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12141(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C1653) item.getSubMenu()).m12141(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m12135(), sparseArray);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12147(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(m12135());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C1653) item.getSubMenu()).m12147(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m12148(Cif ifVar) {
        this.f10804 = ifVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return m12151(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return m12151(0, 0, 0, this.f10798.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m12151(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m12151(i, i2, i3, this.f10798.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f10798.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C2459 r1 = (C2459) m12151(i, i2, i3, charSequence);
        C1653 r2 = new C1653(this.f10808, this, r1);
        r1.f11191 = r2;
        r2.setHeaderTitle(r1.getTitle());
        return r2;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f10798.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f10806 = z;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m12157() {
        return this.f10806;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f10808.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m12131(int i, boolean z) {
        if (i >= 0 && i < this.f10816.size()) {
            this.f10816.remove(i);
            if (z) {
                m12149(true);
            }
        }
    }

    public void clear() {
        C2459 r0 = this.f10799;
        if (r0 != null) {
            m12140(r0);
        }
        this.f10816.clear();
        m12149(true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f10816.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2459 r3 = this.f10816.get(i2);
            if (r3.getGroupId() == i) {
                r3.f11183 = (r3.f11183 & -5) | (z2 ? 4 : 0);
                r3.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f10816.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C2459 r4 = this.f10816.get(i2);
            if (r4.getGroupId() == i && r4.m12670(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m12149(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f10816.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2459 r2 = this.f10816.get(i2);
            if (r2.getGroupId() == i) {
                r2.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f10814) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f10816.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C2459 r2 = this.f10816.get(i2);
            if (r2.getItemId() == i) {
                return r2;
            }
            if (r2.hasSubMenu() && (findItem = r2.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int size() {
        return this.f10816.size();
    }

    public MenuItem getItem(int i) {
        return this.f10816.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m12130(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f10812 = z;
        m12149(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m12134() {
        return this.f10812;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m12142() {
        return this.f10802;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m12139(C2328 r2, MenuItem menuItem) {
        Cif ifVar = this.f10804;
        return ifVar != null && ifVar.m12160(r2, menuItem);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m12129(ArrayList<C2459> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f11181 <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C2459 r1 = m12130(i, keyEvent);
        if (r1 != null) {
            z = m12143(r1, (C1483) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m12133(true);
        }
        return z;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m12128(List<C2459> list, int i, KeyEvent keyEvent) {
        boolean r0 = m12134();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f10816.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2459 r7 = this.f10816.get(i2);
                if (r7.hasSubMenu()) {
                    ((C2328) r7.getSubMenu()).m12128(list, i, keyEvent);
                }
                char alphabeticShortcut = r0 ? r7.getAlphabeticShortcut() : r7.getNumericShortcut();
                if (((modifiers & 69647) == ((r0 ? r7.getAlphabeticModifiers() : r7.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (r0 && alphabeticShortcut == 8 && i == 67)) && r7.isEnabled())) {
                    list.add(r7);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2459 m12130(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C2459> arrayList = this.f10813;
        arrayList.clear();
        m12128(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean r4 = m12134();
        for (int i2 = 0; i2 < size; i2++) {
            C2459 r7 = arrayList.get(i2);
            if (r4) {
                c = r7.getAlphabeticShortcut();
            } else {
                c = r7.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (r4 && c == 8 && i == 67))) {
                return r7;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m12143(findItem(i), (C1483) null, i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m12143(MenuItem menuItem, C1483 r8, int i) {
        C2459 r7 = (C2459) menuItem;
        if (r7 == null || !r7.isEnabled()) {
            return false;
        }
        boolean r1 = r7.m12669();
        C2438 r2 = r7.f11194;
        boolean z = r2 != null && r2.m12544();
        if (r7.m12675()) {
            r1 |= r7.expandActionView();
            if (r1) {
                m12133(true);
            }
        } else if (r7.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m12133(false);
            }
            if (!r7.hasSubMenu()) {
                C1653 r9 = new C1653(this.f10808, this, r7);
                r7.f11191 = r9;
                r9.setHeaderTitle(r7.getTitle());
            }
            C1653 r72 = (C1653) r7.getSubMenu();
            if (z) {
                r2.m12540((SubMenu) r72);
            }
            r1 |= m12132(r72, r8);
            if (!r1) {
                m12133(true);
            }
        } else if ((i & 1) == 0) {
            m12133(true);
        }
        return r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12133(boolean z) {
        if (!this.f10800) {
            this.f10800 = true;
            Iterator<WeakReference<C1483>> it = this.f10807.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1483 r2 = (C1483) next.get();
                if (r2 == null) {
                    this.f10807.remove(next);
                } else {
                    r2.m8866(this, z);
                }
            }
            this.f10800 = false;
        }
    }

    public void close() {
        m12133(true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m12149(boolean z) {
        if (!this.f10820) {
            if (z) {
                this.f10815 = true;
                this.f10817 = true;
            }
            if (!this.f10807.isEmpty()) {
                if (!this.f10820) {
                    this.f10820 = true;
                    this.f10809 = false;
                    this.f10811 = false;
                }
                Iterator<WeakReference<C1483>> it = this.f10807.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    C1483 r3 = (C1483) next.get();
                    if (r3 == null) {
                        this.f10807.remove(next);
                    } else {
                        r3.m8874(z);
                    }
                }
                this.f10820 = false;
                if (this.f10809) {
                    this.f10809 = false;
                    m12149(this.f10811);
                    return;
                }
                return;
            }
            return;
        }
        this.f10809 = true;
        if (z) {
            this.f10811 = true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final ArrayList<C2459> m12145() {
        if (!this.f10815) {
            return this.f10803;
        }
        this.f10803.clear();
        int size = this.f10816.size();
        for (int i = 0; i < size; i++) {
            C2459 r3 = this.f10816.get(i);
            if (r3.isVisible()) {
                this.f10803.add(r3);
            }
        }
        this.f10815 = false;
        this.f10817 = true;
        return this.f10803;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m12144() {
        ArrayList<C2459> r0 = m12145();
        if (this.f10817) {
            Iterator<WeakReference<C1483>> it = this.f10807.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1483 r5 = (C1483) next.get();
                if (r5 == null) {
                    this.f10807.remove(next);
                } else {
                    z |= r5.m8867();
                }
            }
            if (z) {
                this.f10797.clear();
                this.f10819.clear();
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    C2459 r4 = r0.get(i);
                    if ((r4.f11183 & 32) == 32) {
                        this.f10797.add(r4);
                    } else {
                        this.f10819.add(r4);
                    }
                }
            } else {
                this.f10797.clear();
                this.f10819.clear();
                this.f10819.addAll(m12145());
            }
            this.f10817 = false;
        }
    }

    public void clearHeader() {
        this.f10818 = null;
        this.f10801 = null;
        this.f10805 = null;
        m12149(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2328 m12136(CharSequence charSequence) {
        m12127(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2328 m12152(int i) {
        m12127(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2328 m12153(Drawable drawable) {
        m12127(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C2328 m12146(int i) {
        m12127(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2328 m12154(View view) {
        m12127(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m12150(C2459 r6) {
        if (this.f10807.isEmpty()) {
            return false;
        }
        if (!this.f10820) {
            this.f10820 = true;
            this.f10809 = false;
            this.f10811 = false;
        }
        Iterator<WeakReference<C1483>> it = this.f10807.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference next = it.next();
            C1483 r4 = (C1483) next.get();
            if (r4 == null) {
                this.f10807.remove(next);
            } else {
                z = r4.m8868(r6);
                if (z) {
                    break;
                }
            }
        }
        this.f10820 = false;
        if (this.f10809) {
            this.f10809 = false;
            m12149(this.f10811);
        }
        if (z) {
            this.f10799 = r6;
        }
        return z;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m12140(C2459 r6) {
        if (this.f10807.isEmpty() || this.f10799 != r6) {
            return false;
        }
        if (!this.f10820) {
            this.f10820 = true;
            this.f10809 = false;
            this.f10811 = false;
        }
        Iterator<WeakReference<C1483>> it = this.f10807.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference next = it.next();
            C1483 r4 = (C1483) next.get();
            if (r4 == null) {
                this.f10807.remove(next);
            } else {
                z = r4.m8875(r6);
                if (z) {
                    break;
                }
            }
        }
        this.f10820 = false;
        if (this.f10809) {
            this.f10809 = false;
            m12149(this.f10811);
        }
        if (z) {
            this.f10799 = null;
        }
        return z;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12155(Bundle bundle) {
        Parcelable r3;
        if (!this.f10807.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C1483>> it = this.f10807.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1483 r32 = (C1483) next.get();
                if (r32 == null) {
                    this.f10807.remove(next);
                } else {
                    int r2 = r32.m8870();
                    if (r2 > 0 && (r3 = r32.m8871()) != null) {
                        sparseArray.put(r2, r3);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12137(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f10807.isEmpty()) {
            Iterator<WeakReference<C1483>> it = this.f10807.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1483 r2 = (C1483) next.get();
                if (r2 == null) {
                    this.f10807.remove(next);
                } else {
                    int r1 = r2.m8870();
                    if (r1 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(r1)) != null) {
                        r2.m8869(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public MenuItem m12151(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 >= 0) {
            int[] iArr = f10796;
            if (i4 < iArr.length) {
                int i5 = (iArr[i4] << 16) | (65535 & i3);
                C2459 r2 = new C2459(this, i, i2, i3, i5, charSequence, this.f10810);
                ArrayList<C2459> arrayList = this.f10816;
                arrayList.add(m12129(arrayList, i5), r2);
                m12149(true);
                return r2;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f10816.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m12131(i2, true);
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f10816.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f10816.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f10816.get(i2).getGroupId() != i) {
                    m12149(true);
                } else {
                    m12131(i2, false);
                    i3 = i4;
                }
            }
            m12149(true);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m12127(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f10798;
        if (view != null) {
            this.f10805 = view;
            this.f10801 = null;
            this.f10818 = null;
        } else {
            if (i > 0) {
                this.f10801 = resources.getText(i);
            } else if (charSequence != null) {
                this.f10801 = charSequence;
            }
            if (i2 > 0) {
                this.f10818 = C0651.m5458(this.f10808, i2);
            } else if (drawable != null) {
                this.f10818 = drawable;
            }
            this.f10805 = null;
        }
        m12149(false);
    }
}
