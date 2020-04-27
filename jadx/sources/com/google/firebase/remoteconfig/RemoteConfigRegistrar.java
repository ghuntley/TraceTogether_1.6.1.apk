package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import o.C1855;
import o.C1916;
import o.C2298;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2405;
import o.C2406;
import o.C2745;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344[] r1 = new C2344[2];
        C2344.C2345 r2 = new C2344.C2345(C2405.class, new Class[0], (byte) 0).m12230(new C2393(Context.class, 1, 0)).m12230(new C2393(FirebaseApp.class, 1, 0)).m12230(new C2393(FirebaseInstanceId.class, 1, 0)).m12230(new C2393(C1916.class, 1, 0)).m12230(new C2393(C1855.class, 0, 0));
        C2313<T> r3 = C2406.m12433();
        if (r3 != null) {
            r2.f10854 = r3;
            if (r2.f10853 == 0) {
                r2.f10853 = 2;
                r1[0] = r2.m12231();
                r1[1] = C2745.m14502("fire-rc", "19.1.2");
                return Arrays.asList(r1);
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        throw new NullPointerException("Null factory");
    }

    public static /* synthetic */ C2405 lambda$getComponents$0(C2298 r7) {
        return new C2405((Context) r7.m11973(Context.class), (FirebaseApp) r7.m11973(FirebaseApp.class), (FirebaseInstanceId) r7.m11973(FirebaseInstanceId.class), ((C1916) r7.m11973(C1916.class)).m10407("frc"), (C1855) r7.m11973(C1855.class));
    }
}
