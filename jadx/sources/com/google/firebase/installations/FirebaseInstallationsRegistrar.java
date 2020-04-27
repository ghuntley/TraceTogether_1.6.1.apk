package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C1298;
import o.C1971;
import o.C2298;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;
import o.C2859;
import o.C2922;
import o.C3035;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344[] r0 = new C2344[2];
        C2344.C2345 r1 = new C2344.C2345(C3035.class, new Class[0], (byte) 0).m12230(new C2393(FirebaseApp.class, 1, 0)).m12230(new C2393(C1298.class, 1, 0)).m12230(new C2393(C1971.class, 1, 0));
        C2313<T> r2 = C2922.m15082();
        if (r2 != null) {
            r1.f10854 = r2;
            r0[0] = r1.m12231();
            r0[1] = C2745.m14502("fire-installations", "16.0.0");
            return Arrays.asList(r0);
        }
        throw new NullPointerException("Null factory");
    }

    public static /* synthetic */ C3035 lambda$getComponents$0(C2298 r4) {
        return new C2859((FirebaseApp) r4.m11973(FirebaseApp.class), (C1971) r4.m11973(C1971.class), (C1298) r4.m11973(C1298.class));
    }
}
