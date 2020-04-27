package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.Ιɉ  reason: contains not printable characters */
final class C1811 extends FilterInputStream {

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f9265 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    private long f9266;

    C1811(InputStream inputStream, long j) {
        super(inputStream);
        C1764.m9851(inputStream);
        this.f9266 = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f9266);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f9265 = this.f9266;
    }

    public final int read() {
        if (this.f9266 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f9266--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f9266;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f9266 -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f9265 != -1) {
            this.in.reset();
            this.f9266 = this.f9265;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f9266));
        this.f9266 -= skip;
        return skip;
    }
}
