package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C1855;
import o.C1890;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;
import o.C3121;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C2344<?>> getComponents() {
        C2344[] r1 = new C2344[2];
        C2344.C2345 r3 = new C2344.C2345(C1855.class, new Class[0], (byte) 0);
        C2393 r5 = new C2393(FirebaseApp.class, 1, 0);
        if (!r3.f10849.contains(r5.f10944)) {
            r3.f10851.add(r5);
            C2393 r52 = new C2393(Context.class, 1, 0);
            if (!r3.f10849.contains(r52.f10944)) {
                r3.f10851.add(r52);
                C2393 r53 = new C2393(C3121.class, 1, 0);
                if (!r3.f10849.contains(r53.f10944)) {
                    r3.f10851.add(r53);
                    C2313<T> r2 = C1890.f9577;
                    if (r2 != null) {
                        r3.f10854 = r2;
                        if (r3.f10853 == 0) {
                            r3.f10853 = 2;
                            r1[0] = r3.m12231();
                            r1[1] = C2745.m14502("fire-analytics", "17.2.3");
                            return Arrays.asList(r1);
                        }
                        throw new IllegalStateException("Instantiation type has already been set.");
                    }
                    throw new NullPointerException("Null factory");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
