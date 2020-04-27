package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aE implements Closeable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Logger f1410 = Logger.getLogger(aE.class.getName());

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0108 f1411;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f1412;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final RandomAccessFile f1413;

    /* renamed from: ι  reason: contains not printable characters */
    private int f1414;

    /* renamed from: І  reason: contains not printable characters */
    private C0108 f1415;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final byte[] f1416 = new byte[16];

    /* renamed from: o.aE$ɩ  reason: contains not printable characters */
    public interface C0109 {
        /* renamed from: ι  reason: contains not printable characters */
        void m1481(InputStream inputStream, int i);
    }

    /* JADX INFO: finally extract failed */
    public aE(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                m1464(bArr, 4096, 0, 0, 0);
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        this.f1413 = new RandomAccessFile(file, "rwd");
        this.f1413.seek(0);
        this.f1413.readFully(this.f1416);
        this.f1412 = m1462(this.f1416, 0);
        if (((long) this.f1412) <= this.f1413.length()) {
            this.f1414 = m1462(this.f1416, 4);
            int r11 = m1462(this.f1416, 8);
            int r0 = m1462(this.f1416, 12);
            this.f1411 = m1469(r11);
            this.f1415 = m1469(r0);
            return;
        }
        StringBuilder sb2 = new StringBuilder("File is truncated. Expected length: ");
        sb2.append(this.f1412);
        sb2.append(", Actual length: ");
        sb2.append(this.f1413.length());
        throw new IOException(sb2.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m1474(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m1464(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            m1474(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m1462(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m1470(int i, int i2, int i3, int i4) {
        byte[] bArr = this.f1416;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m1474(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.f1413.seek(0);
        this.f1413.write(this.f1416);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C0108 m1469(int i) {
        if (i == 0) {
            return C0108.f1422;
        }
        this.f1413.seek((long) i);
        return new C0108(i, this.f1413.readInt());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m1477(byte[] bArr, int i) {
        int i2;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if ((i | 0) < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            m1465(i);
            boolean r0 = m1479();
            if (r0) {
                i2 = 16;
            } else {
                i2 = this.f1415.f1423 + 4 + this.f1415.f1424;
                if (i2 >= this.f1412) {
                    i2 = (i2 + 16) - this.f1412;
                }
            }
            C0108 r3 = new C0108(i2, i);
            m1474(this.f1416, 0, i);
            m1471(r3.f1423, this.f1416, 4);
            m1471(r3.f1423 + 4, bArr, i);
            m1470(this.f1412, this.f1414 + 1, r0 ? r3.f1423 : this.f1411.f1423, r3.f1423);
            this.f1415 = r3;
            this.f1414++;
            if (r0) {
                this.f1411 = this.f1415;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m1475() {
        if (this.f1414 == 0) {
            return 16;
        }
        if (this.f1415.f1423 >= this.f1411.f1423) {
            return (this.f1415.f1423 - this.f1411.f1423) + 4 + this.f1415.f1424 + 16;
        }
        return (((this.f1415.f1423 + 4) + this.f1415.f1424) + this.f1412) - this.f1411.f1423;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized boolean m1479() {
        return this.f1414 == 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m1478(C0109 r6) {
        int i = this.f1411.f1423;
        for (int i2 = 0; i2 < this.f1414; i2++) {
            C0108 r2 = m1469(i);
            r6.m1481(new Cif(this, r2, (byte) 0), r2.f1424);
            int i3 = r2.f1423 + 4 + r2.f1424;
            if (i3 >= this.f1412) {
                i3 = (i3 + 16) - this.f1412;
            }
            i = i3;
        }
    }

    /* renamed from: o.aE$if  reason: invalid class name */
    final class Cif extends InputStream {

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f1420;

        /* renamed from: ι  reason: contains not printable characters */
        private int f1421;

        /* synthetic */ Cif(aE aEVar, C0108 r2, byte b) {
            this(r2);
        }

        private Cif(C0108 r3) {
            this.f1420 = aE.m1468((aE) aE.this, r3.f1423 + 4);
            this.f1421 = r3.f1424;
        }

        public final int read(byte[] bArr, int i, int i2) {
            aE.m1472(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f1421;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            aE.this.m1466(this.f1420, bArr, i, i2);
            this.f1420 = aE.m1468(aE.this, this.f1420 + i2);
            this.f1421 -= i2;
            return i2;
        }

        public final int read() {
            if (this.f1421 == 0) {
                return -1;
            }
            aE.this.f1413.seek((long) this.f1420);
            int read = aE.this.f1413.read();
            this.f1420 = aE.m1468(aE.this, this.f1420 + 1);
            this.f1421--;
            return read;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m1476() {
        if (m1479()) {
            throw new NoSuchElementException();
        } else if (this.f1414 == 1) {
            m1463();
        } else {
            int i = this.f1411.f1423 + 4 + this.f1411.f1424;
            if (i >= this.f1412) {
                i = (i + 16) - this.f1412;
            }
            m1466(i, this.f1416, 0, 4);
            int r2 = m1462(this.f1416, 0);
            m1470(this.f1412, this.f1414 - 1, i, this.f1415.f1423);
            this.f1414--;
            this.f1411 = new C0108(i, r2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private synchronized void m1463() {
        m1470(C0872.f5653, 0, 0, 0);
        this.f1414 = 0;
        this.f1411 = C0108.f1422;
        this.f1415 = C0108.f1422;
        if (this.f1412 > 4096) {
            this.f1413.setLength(4096);
            this.f1413.getChannel().force(true);
        }
        this.f1412 = C0872.f5653;
    }

    public synchronized void close() {
        this.f1413.close();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f1412);
        sb.append(", size=");
        sb.append(this.f1414);
        sb.append(", first=");
        sb.append(this.f1411);
        sb.append(", last=");
        sb.append(this.f1415);
        sb.append(", element lengths=[");
        try {
            m1478(new C0109() {

                /* renamed from: ǃ  reason: contains not printable characters */
                private boolean f1417 = true;

                /* renamed from: ι  reason: contains not printable characters */
                public final void m1480(InputStream inputStream, int i) {
                    if (this.f1417) {
                        this.f1417 = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f1410.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: o.aE$ǃ  reason: contains not printable characters */
    static class C0108 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final C0108 f1422 = new C0108(0, 0);

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f1423;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f1424;

        C0108(int i, int i2) {
            this.f1423 = i;
            this.f1424 = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f1423);
            sb.append(", length = ");
            sb.append(this.f1424);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m1471(int i, byte[] bArr, int i2) {
        int i3 = this.f1412;
        if (i >= i3) {
            i = (i + 16) - i3;
        }
        int i4 = i + i2;
        int i5 = this.f1412;
        if (i4 <= i5) {
            this.f1413.seek((long) i);
            this.f1413.write(bArr, 0, i2);
            return;
        }
        int i6 = i5 - i;
        this.f1413.seek((long) i);
        this.f1413.write(bArr, 0, i6);
        this.f1413.seek(16);
        this.f1413.write(bArr, i6, i2 - i6);
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m1466(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f1412;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        int i5 = i + i3;
        int i6 = this.f1412;
        if (i5 <= i6) {
            this.f1413.seek((long) i);
            this.f1413.readFully(bArr, i2, i3);
            return;
        }
        int i7 = i6 - i;
        this.f1413.seek((long) i);
        this.f1413.readFully(bArr, i2, i7);
        this.f1413.seek(16);
        this.f1413.readFully(bArr, i2 + i7, i3 - i7);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m1465(int i) {
        int i2 = i + 4;
        int r0 = this.f1412 - m1475();
        if (r0 < i2) {
            int i3 = this.f1412;
            do {
                r0 += i3;
                i3 <<= 1;
            } while (r0 < i2);
            this.f1413.setLength((long) i3);
            this.f1413.getChannel().force(true);
            int i4 = this.f1415.f1423 + 4 + this.f1415.f1424;
            int i5 = this.f1412;
            if (i4 >= i5) {
                i4 = (i4 + 16) - i5;
            }
            if (i4 < this.f1411.f1423) {
                FileChannel channel = this.f1413.getChannel();
                channel.position((long) this.f1412);
                long j = (long) (i4 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f1415.f1423 < this.f1411.f1423) {
                int i6 = (this.f1412 + this.f1415.f1423) - 16;
                m1470(i3, this.f1414, this.f1411.f1423, i6);
                this.f1415 = new C0108(i6, this.f1415.f1424);
            } else {
                m1470(i3, this.f1414, this.f1411.f1423, this.f1415.f1423);
            }
            this.f1412 = i3;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ int m1468(aE aEVar, int i) {
        int i2 = aEVar.f1412;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ Object m1472(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
