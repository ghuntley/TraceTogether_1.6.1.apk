package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;
import o.C2751;

@SuppressLint({"RestrictedApi"})
/* renamed from: o.ɾі  reason: contains not printable characters */
public final class C1555 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f8297;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Bundle f8298;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2751<String, C1557> f8299 = new C2751<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f8300 = true;

    /* renamed from: ι  reason: contains not printable characters */
    private Recreator.C0048 f8301;

    /* renamed from: o.ɾі$ǃ  reason: contains not printable characters */
    public interface C1556 {
        /* renamed from: ı  reason: contains not printable characters */
        void m9169(C1568 r1);
    }

    /* renamed from: o.ɾі$ɩ  reason: contains not printable characters */
    public interface C1557 {
        /* renamed from: Ι  reason: contains not printable characters */
        Bundle m9170();
    }

    C1555() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Bundle m9166(String str) {
        if (this.f8297) {
            Bundle bundle = this.f8298;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f8298.remove(str);
            if (this.f8298.isEmpty()) {
                this.f8298 = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9167(Class<? extends C1556> cls) {
        if (this.f8300) {
            if (this.f8301 == null) {
                this.f8301 = new Recreator.C0048(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C0048 r0 = this.f8301;
                r0.f452.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9165(C2319 r2, Bundle bundle) {
        if (!this.f8297) {
            if (bundle != null) {
                this.f8298 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            r2.m12098(new SavedStateRegistry$1(this));
            this.f8297 = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9168(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f8298;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2751<String, C1557> r1 = this.f8299;
        C2751.C2754 r2 = new C2751.C2754();
        r1.f13053.put(r2, Boolean.FALSE);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            bundle2.putBundle((String) entry.getKey(), ((C1557) entry.getValue()).m9170());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
