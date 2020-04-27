package com.google.android.datatransport.runtime.scheduling;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C1766;
import o.C2492;
import o.C2496;
import o.C2572;
import o.C2693;

public abstract class SchedulingConfigModule {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2572 m733(C2693 r7) {
        C2572.C2574 r0 = new C2572.C2574();
        C1766 r1 = C1766.DEFAULT;
        C2492.If ifR = new C2492.If();
        Set<C2572.Cif> emptySet = Collections.emptySet();
        if (emptySet != null) {
            ifR.f11291 = emptySet;
            r0.f11708.put(r1, ifR.m13690(30000).m13689().m13688());
            C1766 r12 = C1766.HIGHEST;
            C2492.If ifR2 = new C2492.If();
            Set<C2572.Cif> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                ifR2.f11291 = emptySet2;
                r0.f11708.put(r12, ifR2.m13690(1000).m13689().m13688());
                C1766 r13 = C1766.VERY_LOW;
                C2492.If ifR3 = new C2492.If();
                Set<C2572.Cif> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    ifR3.f11291 = emptySet3;
                    r0.f11708.put(r13, ifR3.m13690(86400000).m13689().m13687(Collections.unmodifiableSet(new HashSet(Arrays.asList(new C2572.Cif[]{C2572.Cif.NETWORK_UNMETERED, C2572.Cif.DEVICE_IDLE})))).m13688());
                    r0.f11709 = r7;
                    if (r0.f11709 == null) {
                        throw new NullPointerException("missing required property: clock");
                    } else if (r0.f11708.keySet().size() >= C1766.values().length) {
                        Map<C1766, C2572.If> map = r0.f11708;
                        r0.f11708 = new HashMap();
                        return new C2496(r0.f11709, map);
                    } else {
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
