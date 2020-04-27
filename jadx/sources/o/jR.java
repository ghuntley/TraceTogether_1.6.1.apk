package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class jR implements jY {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f2441;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final jI f2442;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f2443;

    /* renamed from: ι  reason: contains not printable characters */
    private final Inflater f2444;

    jR(jI jIVar, Inflater inflater) {
        if (jIVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f2442 = jIVar;
            this.f2444 = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final long read(jH jHVar, long j) {
        jS r0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.f2441) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.f2444.needsInput()) {
                    m2983();
                    if (this.f2444.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f2442.m2925()) {
                        z = true;
                    } else {
                        jS jSVar = this.f2442.m2919().f2412;
                        this.f2443 = jSVar.f2447 - jSVar.f2449;
                        this.f2444.setInput(jSVar.f2446, jSVar.f2449, this.f2443);
                    }
                }
                try {
                    r0 = jHVar.m2853(1);
                    int inflate = this.f2444.inflate(r0.f2446, r0.f2447, (int) Math.min(j, (long) (8192 - r0.f2447)));
                    if (inflate > 0) {
                        r0.f2447 += inflate;
                        long j2 = (long) inflate;
                        jHVar.f2411 += j2;
                        return j2;
                    } else if (this.f2444.finished()) {
                        break;
                    } else if (this.f2444.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m2983();
            if (r0.f2449 != r0.f2447) {
                return -1;
            }
            jHVar.f2412 = r0.m2984();
            jV.m3018(r0);
            return -1;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m2983() {
        int i = this.f2443;
        if (i != 0) {
            int remaining = i - this.f2444.getRemaining();
            this.f2443 -= remaining;
            this.f2442.m2928((long) remaining);
        }
    }

    public final C3533kb timeout() {
        return this.f2442.timeout();
    }

    public final void close() {
        if (!this.f2441) {
            this.f2444.end();
            this.f2441 = true;
            this.f2442.close();
        }
    }
}
