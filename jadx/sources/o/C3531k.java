package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.k  reason: case insensitive filesystem */
final class C3531k extends InputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private long f2536;

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f2537;

    /* renamed from: ɩ  reason: contains not printable characters */
    private long f2538;

    /* renamed from: Ι  reason: contains not printable characters */
    private long f2539;

    /* renamed from: ι  reason: contains not printable characters */
    private final InputStream f2540;

    public C3531k(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    private C3531k(InputStream inputStream, byte b) {
        this.f2539 = -1;
        this.f2540 = !inputStream.markSupported() ? new BufferedInputStream(inputStream, C0872.f5653) : inputStream;
    }

    public final void mark(int i) {
        this.f2539 = m3195(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m3195(int i) {
        long j = this.f2536 + ((long) i);
        if (this.f2537 < j) {
            m3193(j);
        }
        return this.f2536;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m3193(long j) {
        try {
            if (this.f2538 >= this.f2536 || this.f2536 > this.f2537) {
                this.f2538 = this.f2536;
                this.f2540.mark((int) (j - this.f2536));
            } else {
                this.f2540.reset();
                this.f2540.mark((int) (j - this.f2538));
                m3194(this.f2538, this.f2536);
            }
            this.f2537 = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: ".concat(String.valueOf(e)));
        }
    }

    public final void reset() {
        m3196(this.f2539);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3196(long j) {
        if (this.f2536 > this.f2537 || j < this.f2538) {
            throw new IOException("Cannot reset");
        }
        this.f2540.reset();
        m3194(this.f2538, j);
        this.f2536 = j;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m3194(long j, long j2) {
        while (j < j2) {
            long skip = this.f2540.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final int read() {
        int read = this.f2540.read();
        if (read != -1) {
            this.f2536++;
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.f2540.read(bArr);
        if (read != -1) {
            this.f2536 += (long) read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f2540.read(bArr, i, i2);
        if (read != -1) {
            this.f2536 += (long) read;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = this.f2540.skip(j);
        this.f2536 += skip;
        return skip;
    }

    public final int available() {
        return this.f2540.available();
    }

    public final void close() {
        this.f2540.close();
    }

    public final boolean markSupported() {
        return this.f2540.markSupported();
    }
}
