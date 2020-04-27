package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o.C1095;
import o.C1298;
import o.C1660;
import o.C1664;
import o.C1799;
import o.C1918;
import o.C1971;
import o.C2313;
import o.C2344;
import o.C2393;
import o.C2745;
import o.C3035;
import o.C3121;

@Keep
public final class Registrar implements ComponentRegistrar {
    @Keep
    public final List<C2344<?>> getComponents() {
        C2344.C2345 r0 = new C2344.C2345(FirebaseInstanceId.class, new Class[0], (byte) 0).m12230(new C2393(FirebaseApp.class, 1, 0)).m12230(new C2393(C3121.class, 1, 0)).m12230(new C2393(C1971.class, 1, 0)).m12230(new C2393(C1298.class, 1, 0)).m12230(new C2393(C3035.class, 1, 0));
        C2313<T> r1 = C1664.f8667;
        if (r1 != null) {
            r0.f10854 = r1;
            C2344 r02 = r0.m12229().m12231();
            C2344.C2345 r12 = new C2344.C2345(C1095.class, new Class[0], (byte) 0).m12230(new C2393(FirebaseInstanceId.class, 1, 0));
            C2313<T> r5 = C1660.f8662;
            if (r5 != null) {
                r12.f10854 = r5;
                return Arrays.asList(new C2344[]{r02, r12.m12231(), C2745.m14502("fire-iid", "20.1.1")});
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null factory");
    }

    public static class If implements C1095 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final FirebaseInstanceId f997;

        public If(FirebaseInstanceId firebaseInstanceId) {
            this.f997 = firebaseInstanceId;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m1126() {
            FirebaseInstanceId firebaseInstanceId = this.f997;
            FirebaseInstanceId.m1107(firebaseInstanceId.f983);
            C1918 r1 = FirebaseInstanceId.f978.m10280("", C1799.m9976(firebaseInstanceId.f983), "*");
            if (firebaseInstanceId.m1119(r1)) {
                firebaseInstanceId.m1115();
            }
            return C1918.m10417(r1);
        }
    }
}
