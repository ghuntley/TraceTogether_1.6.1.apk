package com.google.firebase.functions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C0367;
import o.C0400;
import o.C0554;
import o.C0709;
import o.C0797;
import o.C0948;
import o.C1095;
import o.C1731;
import o.C2298;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;

@Keep
public class FunctionsRegistrar implements ComponentRegistrar {
    public List<C2344<?>> getComponents() {
        C2344[] r0 = new C2344[3];
        C2344.C2345 r1 = new C2344.C2345(C0554.class, new Class[0], (byte) 0).m12230(new C2393(C0367.class, 0, 1)).m12230(new C2393(C1095.class, 1, 1));
        C2313<T> r2 = C0948.m6847();
        if (r2 != null) {
            r1.f10854 = r2;
            r0[0] = r1.m12231();
            C2344.C2345 r12 = new C2344.C2345(C0709.class, new Class[0], (byte) 0).m12230(new C2393(Context.class, 1, 0)).m12230(new C2393(C0554.class, 1, 0)).m12230(new C2393(C1731.class, 1, 0));
            C2313<T> r22 = C0797.m6173();
            if (r22 != null) {
                r12.f10854 = r22;
                r0[1] = r12.m12231();
                r0[2] = C2745.m14502("fire-fn", "19.0.2");
                return Arrays.asList(r0);
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null factory");
    }

    public static /* synthetic */ C0554 lambda$getComponents$0(C2298 r3) {
        return new C0400(r3.m11970(C0367.class), r3.m11970(C1095.class));
    }

    public static /* synthetic */ C0709 lambda$getComponents$1(C2298 r4) {
        return new C0709((Context) r4.m11973(Context.class), (C0554) r4.m11973(C0554.class), ((C1731) r4.m11973(C1731.class)).f8949);
    }
}
