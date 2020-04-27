package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import o.C1519;

public abstract class StatsEvent extends C1519 implements ReflectedParcelable {
    /* renamed from: ı  reason: contains not printable characters */
    public abstract long m782();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract long m783();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m784();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m785();

    public String toString() {
        long r0 = m782();
        int r2 = m785();
        long r3 = m783();
        String r5 = m784();
        StringBuilder sb = new StringBuilder(String.valueOf(r5).length() + 53);
        sb.append(r0);
        sb.append("\t");
        sb.append(r2);
        sb.append("\t");
        sb.append(r3);
        sb.append(r5);
        return sb.toString();
    }
}
