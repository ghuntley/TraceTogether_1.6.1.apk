package o;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: o.ɩƗ  reason: contains not printable characters */
public final class C1241 implements C1611, C1576 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static TreeMap<Integer, C1241> f7023 = new TreeMap<>();

    /* renamed from: ı  reason: contains not printable characters */
    final double[] f7024;

    /* renamed from: ǃ  reason: contains not printable characters */
    final byte[][] f7025;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String[] f7026;

    /* renamed from: Ι  reason: contains not printable characters */
    final long[] f7027;

    /* renamed from: ι  reason: contains not printable characters */
    public final int[] f7028;

    /* renamed from: І  reason: contains not printable characters */
    private int f7029;

    /* renamed from: і  reason: contains not printable characters */
    final int f7030;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private volatile String f7031;

    public final void close() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1241 m8011(String str, int i) {
        synchronized (f7023) {
            Map.Entry<Integer, C1241> ceilingEntry = f7023.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f7023.remove(ceilingEntry.getKey());
                C1241 value = ceilingEntry.getValue();
                value.f7031 = str;
                value.f7029 = i;
                return value;
            }
            C1241 r0 = new C1241(i);
            r0.f7031 = str;
            r0.f7029 = i;
            return r0;
        }
    }

    private C1241(int i) {
        this.f7030 = i;
        int i2 = i + 1;
        this.f7028 = new int[i2];
        this.f7027 = new long[i2];
        this.f7024 = new double[i2];
        this.f7026 = new String[i2];
        this.f7025 = new byte[i2][];
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8014() {
        synchronized (f7023) {
            f7023.put(Integer.valueOf(this.f7030), this);
            if (f7023.size() > 15) {
                int size = f7023.size() - 10;
                Iterator<Integer> it = f7023.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8016() {
        return this.f7031;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8015(C1576 r6) {
        for (int i = 1; i <= this.f7029; i++) {
            int i2 = this.f7028[i];
            if (i2 == 1) {
                r6.m9243(i);
            } else if (i2 == 2) {
                r6.m9242(i, this.f7027[i]);
            } else if (i2 == 3) {
                r6.m9241(i, this.f7024[i]);
            } else if (i2 == 4) {
                r6.m9245(i, this.f7026[i]);
            } else if (i2 == 5) {
                r6.m9244(i, this.f7025[i]);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8017(int i) {
        this.f7028[i] = 1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8013(int i, long j) {
        this.f7028[i] = 2;
        this.f7027[i] = j;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8012(int i, double d) {
        this.f7028[i] = 3;
        this.f7024[i] = d;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8019(int i, String str) {
        this.f7028[i] = 4;
        this.f7026[i] = str;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8018(int i, byte[] bArr) {
        this.f7028[i] = 5;
        this.f7025[i] = bArr;
    }
}
