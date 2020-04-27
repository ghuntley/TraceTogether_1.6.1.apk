package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: o.Ιı  reason: contains not printable characters */
public final class C1786 extends ContextWrapper {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Object f9114 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ArrayList<WeakReference<C1786>> f9115;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Resources.Theme f9116 = null;

    /* renamed from: ι  reason: contains not printable characters */
    private final Resources f9117;

    private C1786(Context context) {
        super(context);
        this.f9117 = new C1804(this, context.getResources());
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9116;
        return theme == null ? super.getTheme() : theme;
    }

    public final void setTheme(int i) {
        Resources.Theme theme = this.f9116;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.f9117;
    }

    public final AssetManager getAssets() {
        return this.f9117.getAssets();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Context m9912(Context context) {
        boolean z = false;
        if (!(context instanceof C1786) && !(context.getResources() instanceof C1804) && !(context.getResources() instanceof C2123) && Build.VERSION.SDK_INT < 21) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f9114) {
            if (f9115 == null) {
                f9115 = new ArrayList<>();
            } else {
                for (int size = f9115.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f9115.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f9115.remove(size);
                    }
                }
                for (int size2 = f9115.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f9115.get(size2);
                    C1786 r2 = weakReference2 != null ? (C1786) weakReference2.get() : null;
                    if (r2 != null && r2.getBaseContext() == context) {
                        return r2;
                    }
                }
            }
            C1786 r1 = new C1786(context);
            f9115.add(new WeakReference(r1));
            return r1;
        }
    }
}
