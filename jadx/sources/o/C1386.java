package o;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: o.ɪІ  reason: contains not printable characters */
final class C1386 implements C1655 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static int f7622 = 0;

    /* renamed from: ɹ  reason: contains not printable characters */
    private static int f7623 = 1;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final byte[] f7624 = {33, -105, -75, -92, -5, -8, -6, 56, -62, -20, -9, -17, 68, -67, -5, -15, -12, 3, -21};

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f7625;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final File f7626;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7627;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1655 f7628;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f7629;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f7630;

    /* renamed from: і  reason: contains not printable characters */
    private C1116 f7631;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8544() {
        /*
            byte[] r0 = f7624
            r1 = 16
            byte[] r1 = new byte[r1]
            r2 = 4
            r3 = 114(0x72, float:1.6E-43)
            r4 = 0
            if (r0 != 0) goto L_0x0011
            r6 = r1
            r5 = 0
            r1 = r0
            r0 = 4
            goto L_0x002f
        L_0x0011:
            r3 = r0
            r0 = 0
            r2 = 114(0x72, float:1.6E-43)
            r5 = 4
        L_0x0016:
            byte r6 = (byte) r2
            r1[r0] = r6
            r6 = 15
            if (r0 != r6) goto L_0x0023
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r4)
            return r0
        L_0x0023:
            int r0 = r0 + 1
            byte r6 = r3[r5]
            r7 = r5
            r5 = r0
            r0 = r2
            r2 = r7
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r8
        L_0x002f:
            int r3 = -r3
            int r2 = r2 + 1
            int r0 = r0 + r3
            int r0 = r0 + -8
            r3 = r1
            r1 = r6
            r7 = r2
            r2 = r0
            r0 = r5
            r5 = r7
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1386.m8544():java.lang.String");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m8548() {
        return this.f7628.m9514();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8547(boolean z) {
        this.f7628.m9513(z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1558 m8545() {
        if (!this.f7630) {
            String r0 = this.f7628.m9514();
            File databasePath = this.f7625.getDatabasePath(r0);
            C1116 r2 = this.f7631;
            C1476 r4 = new C1476(r0, this.f7625.getFilesDir(), r2 == null || r2.f6616);
            try {
                r4.f7933.lock();
                if (r4.f7932) {
                    r4.f7931 = new FileOutputStream(r4.f7934).getChannel();
                    r4.f7931.lock();
                }
                if (!databasePath.exists()) {
                    m8543(databasePath);
                    if (r4.f7931 != null) {
                        try {
                            r4.f7931.close();
                        } catch (IOException unused) {
                        }
                    }
                    r4.f7933.unlock();
                } else if (this.f7631 == null) {
                    if (r4.f7931 != null) {
                        try {
                            r4.f7931.close();
                        } catch (IOException unused2) {
                        }
                    }
                    r4.f7933.unlock();
                } else {
                    try {
                        int r22 = C1493.m8886(databasePath);
                        if (r22 == this.f7629) {
                            if (r4.f7931 != null) {
                                try {
                                    r4.f7931.close();
                                } catch (IOException unused3) {
                                }
                            }
                            r4.f7933.unlock();
                        } else if (this.f7631.m7528(r22, this.f7629)) {
                            if (r4.f7931 != null) {
                                try {
                                    r4.f7931.close();
                                } catch (IOException unused4) {
                                }
                            }
                            r4.f7933.unlock();
                        } else {
                            if (this.f7625.deleteDatabase(r0)) {
                                try {
                                    m8543(databasePath);
                                } catch (IOException unused5) {
                                }
                            }
                            if (r4.f7931 != null) {
                                try {
                                    r4.f7931.close();
                                } catch (IOException unused6) {
                                }
                            }
                            r4.f7933.unlock();
                        }
                    } catch (IOException unused7) {
                        if (r4.f7931 != null) {
                            try {
                                r4.f7931.close();
                            } catch (IOException unused8) {
                            }
                        }
                        r4.f7933.unlock();
                    }
                }
                this.f7630 = true;
            } catch (IOException e) {
                throw new RuntimeException("Unable to copy database file.", e);
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            } catch (Throwable th) {
                if (r4.f7931 != null) {
                    try {
                        r4.f7931.close();
                    } catch (IOException unused9) {
                    }
                }
                r4.f7933.unlock();
                throw th;
            }
        }
        return this.f7628.m9512();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8546(C1116 r1) {
        this.f7631 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((r9.f7627 != null) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = r9.f7626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r0 = new java.io.FileInputStream(r0).getChannel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r1 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r3 != true) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011b, code lost:
        throw new java.lang.IllegalStateException("copyFromAssetPath and copyFromFile == null!");
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8543(java.io.File r10) {
        /*
            r9 = this;
            int r0 = f7622
            int r0 = r0 + 83
            int r1 = r0 % 128
            f7623 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r4 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r9.f7627
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0067
            goto L_0x0025
        L_0x001e:
            java.lang.String r0 = r9.f7627
            super.hashCode()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0067
        L_0x0025:
            android.content.Context r0 = r9.f7625
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r5 = r9.f7627
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x005e }
            r6[r2] = r5     // Catch:{ all -> 0x005e }
            r6[r3] = r0     // Catch:{ all -> 0x005e }
            r0 = 4
            java.lang.Object r0 = o.C1534.m8995(r3, r3, r0)     // Catch:{ all -> 0x005e }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "ǃ"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x005e }
            java.lang.Class<android.content.res.AssetManager> r8 = android.content.res.AssetManager.class
            r7[r3] = r8     // Catch:{ all -> 0x005e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r2] = r8     // Catch:{ all -> 0x005e }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ all -> 0x005e }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x005e }
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            int r5 = f7622
            int r5 = r5 + 3
            int r6 = r5 % 128
            f7623 = r6
            int r5 = r5 % r1
            goto L_0x0074
        L_0x005e:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto L_0x0066
            throw r0
        L_0x0066:
            throw r10
        L_0x0067:
            java.io.File r0 = r9.f7626
            if (r0 == 0) goto L_0x0114
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r0)
            java.nio.channels.FileChannel r0 = r5.getChannel()
        L_0x0074:
            java.lang.String r5 = m8544()
            android.content.Context r6 = r9.f7625
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r7 = ".tmp"
            java.io.File r5 = java.io.File.createTempFile(r5, r7, r6)
            r5.deleteOnExit()
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r6.<init>(r5)
            java.nio.channels.FileChannel r6 = r6.getChannel()
            o.C1477.m8846(r0, r6)
            java.io.File r0 = r10.getParentFile()
            r6 = 25
            if (r0 == 0) goto L_0x009e
            r7 = 18
            goto L_0x00a0
        L_0x009e:
            r7 = 25
        L_0x00a0:
            if (r7 == r6) goto L_0x00e4
            int r6 = f7623     // Catch:{ Exception -> 0x00e2 }
            int r6 = r6 + 49
            int r7 = r6 % 128
            f7622 = r7     // Catch:{ Exception -> 0x00e2 }
            int r6 = r6 % r1
            if (r6 == 0) goto L_0x00b9
            boolean r1 = r0.exists()
            super.hashCode()     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x00e4
            goto L_0x00c3
        L_0x00b7:
            r10 = move-exception
            throw r10
        L_0x00b9:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x00c0
            r3 = 1
        L_0x00c0:
            if (r3 == r2) goto L_0x00c3
            goto L_0x00e4
        L_0x00c3:
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00ca
            goto L_0x00e4
        L_0x00ca:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to create directories for "
            r1.<init>(r2)
            java.lang.String r10 = r10.getAbsolutePath()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x00e2:
            r10 = move-exception
            throw r10
        L_0x00e4:
            boolean r0 = r5.renameTo(r10)
            if (r0 == 0) goto L_0x00eb
            return
        L_0x00eb:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to move intermediate file ("
            r1.<init>(r2)
            java.lang.String r2 = r5.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = ") to destination ("
            r1.append(r2)
            java.lang.String r10 = r10.getAbsolutePath()
            r1.append(r10)
            java.lang.String r10 = ")."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0114:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyFromAssetPath and copyFromFile == null!"
            r10.<init>(r0)
            throw r10
        L_0x011c:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1386.m8543(java.io.File):void");
    }
}
