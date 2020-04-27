package o;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.ƹ  reason: contains not printable characters */
class C0813 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String f5307;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicLong f5308 = new AtomicLong(0);

    public C0813(aD aDVar) {
        byte[] bArr = new byte[10];
        m6221(bArr);
        m6219(bArr);
        m6218(bArr);
        String r9 = C3285aw.m1675(aDVar.m1459());
        String r0 = C3285aw.m1666(bArr);
        f5307 = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{r0.substring(0, 12), r0.substring(12, 16), r0.subSequence(16, 20), r9.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6221(byte[] bArr) {
        long time = new Date().getTime();
        byte[] r2 = m6222(time / 1000);
        bArr[0] = r2[0];
        bArr[1] = r2[1];
        bArr[2] = r2[2];
        bArr[3] = r2[3];
        byte[] r0 = m6220(time % 1000);
        bArr[4] = r0[0];
        bArr[5] = r0[1];
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6219(byte[] bArr) {
        byte[] r0 = m6220(f5308.incrementAndGet());
        bArr[6] = r0[0];
        bArr[7] = r0[1];
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6218(byte[] bArr) {
        byte[] r0 = m6220((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = r0[0];
        bArr[9] = r0[1];
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static byte[] m6222(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static byte[] m6220(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f5307;
    }
}
