package androidx.lifecycle;

import android.os.Bundle;
import java.util.HashSet;
import o.C0307;
import o.C0326;
import o.C0350;
import o.C1555;
import o.C1568;
import o.C2319;
import o.C2456;
import o.C2851;
import o.C3180;

public final class SavedStateHandleController implements C2456 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f252;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f253 = false;

    /* renamed from: ι  reason: contains not printable characters */
    public final C3180 f254;

    private SavedStateHandleController(String str, C3180 r3) {
        this.f252 = str;
        this.f254 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m211(C1555 r2, C2319 r3) {
        if (!this.f253) {
            this.f253 = true;
            r3.m12098(this);
            if (r2.f8299.m14578(this.f252, this.f254.f14444) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m213(C2851 r2, C2319.C2320 r3) {
        if (r3 == C2319.C2320.ON_DESTROY) {
            this.f253 = false;
            r2.getLifecycle().m12097(this);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static SavedStateHandleController m209(C1555 r1, C2319 r2, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C3180.m16052(r1.m9166(str), bundle));
        savedStateHandleController.m211(r1, r2);
        m212(r1, r2);
        return savedStateHandleController;
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$ı  reason: contains not printable characters */
    static final class C0020 implements C1555.C1556 {
        C0020() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m215(C1568 r6) {
            if (r6 instanceof C0350) {
                C0307 viewModelStore = ((C0350) r6).getViewModelStore();
                C1555 savedStateRegistry = r6.getSavedStateRegistry();
                for (String str : new HashSet(viewModelStore.f3602.keySet())) {
                    SavedStateHandleController.m210(viewModelStore.f3602.get(str), savedStateRegistry, r6.getLifecycle());
                }
                if (!new HashSet(viewModelStore.f3602.keySet()).isEmpty()) {
                    savedStateRegistry.m9167((Class<? extends C1555.C1556>) C0020.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m210(C0326 r1, C1555 r2, C2319 r3) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) r1.m4394("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f253) {
            savedStateHandleController.m211(r2, r3);
            m212(r2, r3);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m212(final C1555 r2, final C2319 r3) {
        C2319.Cif r0 = r3.m12096();
        if (r0 != C2319.Cif.INITIALIZED) {
            if (!(r0.compareTo(C2319.Cif.STARTED) >= 0)) {
                r3.m12098(new C2456() {
                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final void m214(C2851 r1, C2319.C2320 r2) {
                        if (r2 == C2319.C2320.ON_START) {
                            r3.m12097(this);
                            r2.m9167((Class<? extends C1555.C1556>) C0020.class);
                        }
                    }
                });
                return;
            }
        }
        r2.m9167((Class<? extends C1555.C1556>) C0020.class);
    }
}
