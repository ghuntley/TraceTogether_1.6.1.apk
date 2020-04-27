package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: o.լչ  reason: contains not printable characters */
final class C3129 implements Closeable {

    /* renamed from: ı  reason: contains not printable characters */
    private byte[] f14275;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Charset f14276;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f14277;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f14278;

    /* renamed from: ι  reason: contains not printable characters */
    private final InputStream f14279;

    public C3129(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private C3129(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C2665.f12256)) {
            this.f14279 = inputStream;
            this.f14276 = charset;
            this.f14275 = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.f14279) {
            if (this.f14275 != null) {
                this.f14275 = null;
                this.f14279.close();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m15863() {
        int i;
        int i2;
        synchronized (this.f14279) {
            if (this.f14275 != null) {
                if (this.f14278 >= this.f14277) {
                    m15862();
                }
                for (int i3 = this.f14278; i3 != this.f14277; i3++) {
                    if (this.f14275[i3] == 10) {
                        if (i3 != this.f14278) {
                            i2 = i3 - 1;
                            if (this.f14275[i2] == 13) {
                                byte[] bArr = this.f14275;
                                int i4 = this.f14278;
                                String str = new String(bArr, i4, i2 - i4, this.f14276.name());
                                this.f14278 = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr2 = this.f14275;
                        int i42 = this.f14278;
                        String str2 = new String(bArr2, i42, i2 - i42, this.f14276.name());
                        this.f14278 = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f14277 - this.f14278) + 80) {
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C3129.this.f14276.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f14275, this.f14278, this.f14277 - this.f14278);
                    this.f14277 = -1;
                    m15862();
                    i = this.f14278;
                    while (true) {
                        if (i != this.f14277) {
                            if (this.f14275[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f14278) {
                    byte[] bArr3 = this.f14275;
                    int i5 = this.f14278;
                    r1.write(bArr3, i5, i - i5);
                }
                this.f14278 = i + 1;
                String obj = r1.toString();
                return obj;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m15862() {
        InputStream inputStream = this.f14279;
        byte[] bArr = this.f14275;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f14278 = 0;
            this.f14277 = read;
            return;
        }
        throw new EOFException();
    }
}
