package o;

import java.io.InputStream;

/* renamed from: o.вɹ  reason: contains not printable characters */
public final class C2402 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Runtime f10967 = Runtime.getRuntime();

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f10968 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    public byte[] f10969 = new byte[262144];

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f10970 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public final InputStream f10971;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f10972 = true;

    public C2402(InputStream inputStream) {
        this.f10971 = inputStream;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m12428(int i) {
        int i2 = this.f10970;
        if (i <= i2) {
            this.f10970 = i2 - i;
            byte[] bArr = this.f10969;
            System.arraycopy(bArr, i, bArr, 0, this.f10970);
            return i;
        }
        this.f10970 = 0;
        int i3 = this.f10970;
        while (i3 < i) {
            int skip = (int) this.f10971.skip((long) (i - i3));
            if (skip <= 0) {
                if (skip == 0) {
                    if (this.f10971.read() == -1) {
                        break;
                    }
                    i3++;
                } else {
                    continue;
                }
            } else {
                i3 += skip;
            }
        }
        return i3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m12427(int i) {
        if (i > this.f10969.length) {
            i = Math.min(i, m12426(i));
        }
        while (true) {
            int i2 = this.f10970;
            if (i2 >= i) {
                break;
            }
            int read = this.f10971.read(this.f10969, i2, i - i2);
            if (read == -1) {
                this.f10968 = true;
                break;
            }
            this.f10970 += read;
        }
        return this.f10970;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m12426(int i) {
        int max = Math.max(this.f10969.length << 1, i);
        long maxMemory = f10967.maxMemory() - (f10967.totalMemory() - f10967.freeMemory());
        if (this.f10972 && ((long) max) < maxMemory) {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f10969, 0, bArr, 0, this.f10970);
                this.f10969 = bArr;
            } catch (OutOfMemoryError unused) {
                this.f10972 = false;
            }
        }
        return this.f10969.length;
    }
}
