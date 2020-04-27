package o;

/* renamed from: o.ՒΙ  reason: contains not printable characters */
public final class C3056 {
    /* renamed from: ι  reason: contains not printable characters */
    static long[] m15607(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + ((long) i3);
        }
        return jArr;
    }
}
