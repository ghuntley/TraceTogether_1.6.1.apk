package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import android.os.Build;
import o.C2466;
import o.C2468;
import o.C2495;
import o.C2572;
import o.C2581;
import o.C2602;
import o.C2606;
import o.C2693;

public abstract class SchedulingModule {
    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract C2468 m735(C2466 r1);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2606 m734(Context context, C2602 r3, C2572 r4, C2693 r5) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C2581(context, r3, r4);
        }
        return new C2495(context, r3, r5, r4);
    }
}
