package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C1855;
import o.C1915;
import o.C1916;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344[] r0 = new C2344[2];
        C2344.C2345 r2 = new C2344.C2345(C1916.class, new Class[0], (byte) 0);
        C2393 r4 = new C2393(Context.class, 1, 0);
        if (!r2.f10849.contains(r4.f10944)) {
            r2.f10851.add(r4);
            C2393 r42 = new C2393(C1855.class, 0, 0);
            if (!r2.f10849.contains(r42.f10944)) {
                r2.f10851.add(r42);
                C2313<T> r1 = C1915.m10405();
                if (r1 != null) {
                    r2.f10854 = r1;
                    r0[0] = r2.m12231();
                    r0[1] = C2745.m14502("fire-abt", "19.0.1");
                    return Arrays.asList(r0);
                }
                throw new NullPointerException("Null factory");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
