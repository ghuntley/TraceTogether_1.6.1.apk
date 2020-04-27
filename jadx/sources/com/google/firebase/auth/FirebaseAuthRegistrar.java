package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C0367;
import o.C2050;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;

@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    @Keep
    public List<C2344<?>> getComponents() {
        C2344[] r1 = new C2344[2];
        C2344.C2345 r5 = new C2344.C2345(FirebaseAuth.class, new Class[]{C0367.class}, (byte) 0);
        C2393 r4 = new C2393(FirebaseApp.class, 1, 0);
        if (!r5.f10849.contains(r4.f10944)) {
            r5.f10851.add(r4);
            C2313<T> r2 = C2050.f10104;
            if (r2 != null) {
                r5.f10854 = r2;
                if (r5.f10853 == 0) {
                    r5.f10853 = 2;
                    r1[0] = r5.m12231();
                    r1[1] = C2745.m14502("fire-auth", "19.2.0");
                    return Arrays.asList(r1);
                }
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            throw new NullPointerException("Null factory");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
