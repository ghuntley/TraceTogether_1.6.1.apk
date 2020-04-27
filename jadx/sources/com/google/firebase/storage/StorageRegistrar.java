package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C0367;
import o.C0951;
import o.C2298;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;
import o.C3157;

@Keep
public class StorageRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344[] r0 = new C2344[2];
        C2344.C2345 r1 = new C2344.C2345(C3157.class, new Class[0], (byte) 0).m12230(new C2393(FirebaseApp.class, 1, 0)).m12230(new C2393(C0367.class, 0, 1));
        C2313<T> r2 = C0951.m6854();
        if (r2 != null) {
            r1.f10854 = r2;
            r0[0] = r1.m12231();
            r0[1] = C2745.m14502("fire-gcs", "19.1.1");
            return Arrays.asList(r0);
        }
        throw new NullPointerException("Null factory");
    }

    public static /* synthetic */ C3157 lambda$getComponents$0(C2298 r3) {
        return new C3157((FirebaseApp) r3.m11973(FirebaseApp.class), r3.m11970(C0367.class));
    }
}
