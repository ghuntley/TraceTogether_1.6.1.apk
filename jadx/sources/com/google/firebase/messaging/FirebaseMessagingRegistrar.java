package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import o.C1409;
import o.C1733;
import o.C1744;
import o.C1748;
import o.C1757;
import o.C1781;
import o.C2313;
import o.C2344;
import o.C2393;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$ǃ  reason: contains not printable characters */
    public static class C0078 implements C1757 {
        /* renamed from: ι  reason: contains not printable characters */
        public final <T> C1781<T> m1128(String str, Class<T> cls, C1733 r3, C1748<T, byte[]> r4) {
            return new If((byte) 0);
        }
    }

    @Keep
    public List<C2344<?>> getComponents() {
        C2344[] r1 = new C2344[1];
        C2344.C2345 r0 = new C2344.C2345(FirebaseMessaging.class, new Class[0], (byte) 0).m12230(new C2393(FirebaseApp.class, 1, 0)).m12230(new C2393(FirebaseInstanceId.class, 1, 0)).m12230(new C2393(C1757.class, 0, 0));
        C2313<T> r2 = C1409.f7707;
        if (r2 != null) {
            r0.f10854 = r2;
            r1[0] = r0.m12229().m12231();
            return Arrays.asList(r1);
        }
        throw new NullPointerException("Null factory");
    }

    static class If<T> implements C1781<T> {
        private If() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1127(C1744<T> r1) {
        }

        /* synthetic */ If(byte b) {
            this();
        }
    }
}
