package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class jO implements jY {

    /* renamed from: ı  reason: contains not printable characters */
    private final jI f2429;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f2430 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final jR f2431;

    /* renamed from: Ι  reason: contains not printable characters */
    private final CRC32 f2432 = new CRC32();

    /* renamed from: ι  reason: contains not printable characters */
    private final Inflater f2433;

    public jO(jY jYVar) {
        if (jYVar != null) {
            this.f2433 = new Inflater(true);
            this.f2429 = jP.m2972(jYVar);
            this.f2431 = new jR(this.f2429, this.f2433);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long read(jH jHVar, long j) {
        long j2;
        jH jHVar2 = jHVar;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f2430 == 0) {
                this.f2429.m2903(10);
                byte r13 = this.f2429.m2919().m2847(3);
                boolean z = ((r13 >> 1) & 1) == 1;
                if (z) {
                    m2971(this.f2429.m2919(), 0, 10);
                }
                m2970("ID1ID2", 8075, this.f2429.m2926());
                this.f2429.m2928(8);
                if (((r13 >> 2) & 1) == 1) {
                    this.f2429.m2903(2);
                    if (z) {
                        m2971(this.f2429.m2919(), 0, 2);
                    }
                    long r4 = (long) this.f2429.m2919().m2867();
                    this.f2429.m2903(r4);
                    if (z) {
                        j2 = r4;
                        m2971(this.f2429.m2919(), 0, r4);
                    } else {
                        j2 = r4;
                    }
                    this.f2429.m2928(j2);
                }
                if (((r13 >> 3) & 1) == 1) {
                    long r17 = this.f2429.m2904();
                    if (r17 != -1) {
                        if (z) {
                            m2971(this.f2429.m2919(), 0, r17 + 1);
                        }
                        this.f2429.m2928(r17 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((r13 >> 4) & 1) == 1) {
                    long r172 = this.f2429.m2904();
                    if (r172 != -1) {
                        if (z) {
                            m2971(this.f2429.m2919(), 0, r172 + 1);
                        }
                        this.f2429.m2928(r172 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    m2970("FHCRC", this.f2429.m2914(), (short) ((int) this.f2432.getValue()));
                    this.f2432.reset();
                }
                this.f2430 = 1;
            }
            if (this.f2430 == 1) {
                long j4 = jHVar2.f2411;
                long read = this.f2431.read(jHVar2, j3);
                if (read != -1) {
                    m2971(jHVar, j4, read);
                    return read;
                }
                this.f2430 = 2;
            }
            if (this.f2430 == 2) {
                m2970("CRC", this.f2429.m2910(), (int) this.f2432.getValue());
                m2970("ISIZE", this.f2429.m2910(), (int) this.f2433.getBytesWritten());
                this.f2430 = 3;
                if (!this.f2429.m2925()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final C3533kb timeout() {
        return this.f2429.timeout();
    }

    public final void close() {
        this.f2431.close();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m2971(jH jHVar, long j, long j2) {
        jS jSVar = jHVar.f2412;
        while (j >= ((long) (jSVar.f2447 - jSVar.f2449))) {
            j -= (long) (jSVar.f2447 - jSVar.f2449);
            jSVar = jSVar.f2450;
        }
        while (j2 > 0) {
            int i = (int) (((long) jSVar.f2449) + j);
            int min = (int) Math.min((long) (jSVar.f2447 - i), j2);
            this.f2432.update(jSVar.f2446, i, min);
            j2 -= (long) min;
            jSVar = jSVar.f2450;
            j = 0;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m2970(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
