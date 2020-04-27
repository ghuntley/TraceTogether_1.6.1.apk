package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o.C1260;
import o.C1733;
import o.C1757;
import o.C1758;
import o.C2231;
import o.C2243;
import o.C2291;
import o.C2298;
import o.C2302;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2846;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344.C2345 r0 = new C2344.C2345(C1757.class, new Class[0], (byte) 0).m12230(new C2393(Context.class, 1, 0));
        C2313<T> r1 = C2846.m14820();
        if (r1 != null) {
            r0.f10854 = r1;
            return Collections.singletonList(r0.m12231());
        }
        throw new NullPointerException("Null factory");
    }

    public static /* synthetic */ C1757 lambda$getComponents$0(C2298 r5) {
        Set<T> set;
        C2243.m11696((Context) r5.m11973(Context.class));
        C2302 r52 = C2243.f10531;
        if (r52 != null) {
            C2243 r53 = r52.m11989();
            C1758 r0 = C1758.f9065;
            if (r0 instanceof C2231) {
                set = Collections.unmodifiableSet(r0.m11681());
            } else {
                set = Collections.singleton(new C1733("proto"));
            }
            return new C1260.C1261(set, C2291.m11958().m11963(r0.m11591()).m11965(r0.m11592()).m11962(), r53);
        }
        throw new IllegalStateException("Not initialized!");
    }
}
