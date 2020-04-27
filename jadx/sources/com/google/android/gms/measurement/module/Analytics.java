package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import o.C2193;
import o.C2658;

public class Analytics {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static volatile Analytics f606;

    @Keep
    public static Analytics getInstance(Context context) {
        if (f606 == null) {
            synchronized (Analytics.class) {
                if (f606 == null) {
                    f606 = new Analytics(C2658.m14078(context, (C2193) null));
                }
            }
        }
        return f606;
    }

    private Analytics(C2658 r2) {
        if (r2 == null) {
            throw new NullPointerException("null reference");
        }
    }
}
