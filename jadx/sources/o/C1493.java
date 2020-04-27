package o;

import o.C2622;

/* renamed from: o.ɼǃ  reason: contains not printable characters */
public final class C1493 implements C2622.Cif {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2683 f7974;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8886(java.io.File r10) {
        /*
            r0 = 4
            r1 = 0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0038 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            r3.<init>(r10)     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel r10 = r3.getChannel()     // Catch:{ all -> 0x0038 }
            r5 = 60
            r7 = 4
            r9 = 1
            r4 = r10
            r4.tryLock(r5, r7, r9)     // Catch:{ all -> 0x0036 }
            r3 = 60
            r10.position(r3)     // Catch:{ all -> 0x0036 }
            int r1 = r10.read(r2)     // Catch:{ all -> 0x0036 }
            if (r1 != r0) goto L_0x002e
            r2.rewind()     // Catch:{ all -> 0x0036 }
            int r0 = r2.getInt()     // Catch:{ all -> 0x0036 }
            r10.close()
            return r0
        L_0x002e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            r10 = r1
        L_0x003a:
            if (r10 == 0) goto L_0x003f
            r10.close()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1493.m8886(java.io.File):int");
    }

    public C1493(C2683 r1) {
        this.f7974 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m8887() {
        return this.f7974.getWritableDatabase();
    }
}
