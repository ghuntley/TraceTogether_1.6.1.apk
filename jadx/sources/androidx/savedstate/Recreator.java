package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.C1555;
import o.C1568;
import o.C2319;
import o.C2456;
import o.C2851;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements C2456 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1568 f451;

    public Recreator(C1568 r1) {
        this.f451 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m606(C2851 r4, C2319.C2320 r5) {
        if (r5 == C2319.C2320.ON_CREATE) {
            r4.getLifecycle().m12097(this);
            Bundle r42 = this.f451.getSavedStateRegistry().m9166("androidx.savedstate.Restarter");
            if (r42 != null) {
                ArrayList<String> stringArrayList = r42.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C1555.C1556.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((C1555.C1556) declaredConstructor.newInstance(new Object[0])).m9169(this.f451);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder sb = new StringBuilder("Class");
                                sb.append(asSubclass.getSimpleName());
                                sb.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(sb.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            StringBuilder sb2 = new StringBuilder("Class ");
                            sb2.append(next);
                            sb2.append(" wasn't found");
                            throw new RuntimeException(sb2.toString(), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    /* renamed from: androidx.savedstate.Recreator$ı  reason: contains not printable characters */
    public static final class C0048 implements C1555.C1557 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Set<String> f452 = new HashSet();

        public C0048(C1555 r2) {
            if (r2.f8299.m14578("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Bundle m607() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f452));
            return bundle;
        }
    }
}
