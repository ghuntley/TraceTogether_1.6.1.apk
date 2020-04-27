package o;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: o.յլ  reason: contains not printable characters */
public final class C3162 implements Closeable {

    /* renamed from: ı  reason: contains not printable characters */
    private static Pattern f14384 = Pattern.compile("[a-z0-9_-]{1,64}");
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public static final OutputStream f14385 = new OutputStream() {
        public final void write(int i) {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f14386;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final File f14387;

    /* renamed from: ɨ  reason: contains not printable characters */
    private long f14388 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final File f14389;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public Writer f14390;

    /* renamed from: ɾ  reason: contains not printable characters */
    private ThreadPoolExecutor f14391 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: Ι  reason: contains not printable characters */
    private final File f14392;

    /* renamed from: ι  reason: contains not printable characters */
    public final File f14393;

    /* renamed from: І  reason: contains not printable characters */
    private long f14394 = 0;

    /* renamed from: і  reason: contains not printable characters */
    private long f14395;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final LinkedHashMap<String, C3164> f14396 = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Callable<Void> f14397 = new Callable<Void>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
            return null;
         */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r3 = this;
                o.յլ r0 = o.C3162.this
                monitor-enter(r0)
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0027 }
                java.io.Writer r1 = r1.f14390     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000e:
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0027 }
                r1.m15997()     // Catch:{ all -> 0x0027 }
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0027 }
                boolean r1 = o.C3162.m15992((o.C3162) r1)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0025
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0027 }
                r1.m15989()     // Catch:{ all -> 0x0027 }
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0027 }
                int unused = r1.f14386 = 0     // Catch:{ all -> 0x0027 }
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3162.AnonymousClass3.call():java.lang.Void");
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    static /* synthetic */ int m15993() {
        return 1;
    }

    private C3162(File file, long j) {
        File file2 = file;
        this.f14393 = file2;
        this.f14387 = new File(file2, "journal");
        this.f14389 = new File(file2, "journal.tmp");
        this.f14392 = new File(file2, "journal.bkp");
        this.f14395 = j;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C3162 m15995(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            C3162 r0 = new C3162(file, j);
            if (r0.f14387.exists()) {
                try {
                    r0.m15982();
                    r0.m15984();
                    r0.f14390 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(r0.f14387, true), C2665.f12256));
                    return r0;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    r0.close();
                    C2665.m14140(r0.f14393);
                }
            }
            file.mkdirs();
            C3162 r02 = new C3162(file, j);
            r02.m15989();
            return r02;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:51|52|53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.f14386 = r2 - r12.f14396.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00f2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x00f2=Splitter:B:51:0x00f2, B:55:0x00ff=Splitter:B:55:0x00ff} */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15982() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            o.լչ r1 = new o.լչ
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r12.f14387
            r2.<init>(r3)
            java.nio.charset.Charset r3 = o.C2665.f12256
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.m15863()     // Catch:{ all -> 0x012a }
            java.lang.String r3 = r1.m15863()     // Catch:{ all -> 0x012a }
            java.lang.String r4 = r1.m15863()     // Catch:{ all -> 0x012a }
            java.lang.String r5 = r1.m15863()     // Catch:{ all -> 0x012a }
            java.lang.String r6 = r1.m15863()     // Catch:{ all -> 0x012a }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x00ff
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x00ff
            r7 = 1
            java.lang.String r8 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x012a }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x012a }
            if (r4 == 0) goto L_0x00ff
            java.lang.String r4 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x012a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x012a }
            if (r4 == 0) goto L_0x00ff
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x012a }
            if (r4 == 0) goto L_0x00ff
            r0 = 0
            r2 = 0
        L_0x0053:
            java.lang.String r3 = r1.m15863()     // Catch:{ EOFException -> 0x00f2 }
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x00f2 }
            java.lang.String r6 = "unexpected journal line: "
            r8 = -1
            if (r5 == r8) goto L_0x00e8
            int r9 = r5 + 1
            int r4 = r3.indexOf(r4, r9)     // Catch:{ EOFException -> 0x00f2 }
            if (r4 != r8) goto L_0x007f
            java.lang.String r9 = r3.substring(r9)     // Catch:{ EOFException -> 0x00f2 }
            r10 = 6
            if (r5 != r10) goto L_0x0083
            java.lang.String r10 = "REMOVE"
            boolean r10 = r3.startsWith(r10)     // Catch:{ EOFException -> 0x00f2 }
            if (r10 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r3 = r12.f14396     // Catch:{ EOFException -> 0x00f2 }
            r3.remove(r9)     // Catch:{ EOFException -> 0x00f2 }
            goto L_0x00da
        L_0x007f:
            java.lang.String r9 = r3.substring(r9, r4)     // Catch:{ EOFException -> 0x00f2 }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r10 = r12.f14396     // Catch:{ EOFException -> 0x00f2 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ EOFException -> 0x00f2 }
            o.յլ$ı r10 = (o.C3162.C3164) r10     // Catch:{ EOFException -> 0x00f2 }
            if (r10 != 0) goto L_0x0097
            o.յլ$ı r10 = new o.յլ$ı     // Catch:{ EOFException -> 0x00f2 }
            r10.<init>(r12, r9, r0)     // Catch:{ EOFException -> 0x00f2 }
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r11 = r12.f14396     // Catch:{ EOFException -> 0x00f2 }
            r11.put(r9, r10)     // Catch:{ EOFException -> 0x00f2 }
        L_0x0097:
            r9 = 5
            if (r4 == r8) goto L_0x00b9
            if (r5 != r9) goto L_0x00b9
            java.lang.String r11 = "CLEAN"
            boolean r11 = r3.startsWith(r11)     // Catch:{ EOFException -> 0x00f2 }
            if (r11 == 0) goto L_0x00b9
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x00f2 }
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ EOFException -> 0x00f2 }
            r10.f14405 = r7     // Catch:{ EOFException -> 0x00f2 }
            r4 = 0
            r10.f14408 = r4     // Catch:{ EOFException -> 0x00f2 }
            r10.m16009((java.lang.String[]) r3)     // Catch:{ EOFException -> 0x00f2 }
            goto L_0x00da
        L_0x00b9:
            if (r4 != r8) goto L_0x00cd
            if (r5 != r9) goto L_0x00cd
            java.lang.String r9 = "DIRTY"
            boolean r9 = r3.startsWith(r9)     // Catch:{ EOFException -> 0x00f2 }
            if (r9 == 0) goto L_0x00cd
            o.յլ$if r3 = new o.յլ$if     // Catch:{ EOFException -> 0x00f2 }
            r3.<init>(r12, r10, r0)     // Catch:{ EOFException -> 0x00f2 }
            r10.f14408 = r3     // Catch:{ EOFException -> 0x00f2 }
            goto L_0x00da
        L_0x00cd:
            if (r4 != r8) goto L_0x00de
            r4 = 4
            if (r5 != r4) goto L_0x00de
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch:{ EOFException -> 0x00f2 }
            if (r4 == 0) goto L_0x00de
        L_0x00da:
            int r2 = r2 + 1
            goto L_0x0053
        L_0x00de:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x00f2 }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x00f2 }
            r0.<init>(r3)     // Catch:{ EOFException -> 0x00f2 }
            throw r0     // Catch:{ EOFException -> 0x00f2 }
        L_0x00e8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x00f2 }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ EOFException -> 0x00f2 }
            r0.<init>(r3)     // Catch:{ EOFException -> 0x00f2 }
            throw r0     // Catch:{ EOFException -> 0x00f2 }
        L_0x00f2:
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r0 = r12.f14396     // Catch:{ all -> 0x012a }
            int r0 = r0.size()     // Catch:{ all -> 0x012a }
            int r2 = r2 - r0
            r12.f14386 = r2     // Catch:{ all -> 0x012a }
            o.C2665.m14141(r1)
            return
        L_0x00ff:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x012a }
            r7.append(r2)     // Catch:{ all -> 0x012a }
            r7.append(r0)     // Catch:{ all -> 0x012a }
            r7.append(r3)     // Catch:{ all -> 0x012a }
            r7.append(r0)     // Catch:{ all -> 0x012a }
            r7.append(r5)     // Catch:{ all -> 0x012a }
            r7.append(r0)     // Catch:{ all -> 0x012a }
            r7.append(r6)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x012a }
            r4.<init>(r0)     // Catch:{ all -> 0x012a }
            throw r4     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            o.C2665.m14141(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3162.m15982():void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m15984() {
        File file = this.f14389;
        if (!file.exists() || file.delete()) {
            Iterator<C3164> it = this.f14396.values().iterator();
            while (it.hasNext()) {
                C3164 next = it.next();
                int i = 0;
                if (next.f14408 == null) {
                    while (i <= 0) {
                        this.f14394 += next.f14407[i];
                        i++;
                    }
                } else {
                    next.f14408 = null;
                    while (i <= 0) {
                        File r2 = next.m16008(i);
                        if (!r2.exists() || r2.delete()) {
                            File r22 = next.m16007(i);
                            if (!r22.exists() || r22.delete()) {
                                i++;
                            } else {
                                throw new IOException();
                            }
                        } else {
                            throw new IOException();
                        }
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IOException();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public synchronized void m15989() {
        if (this.f14390 != null) {
            this.f14390.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14389), C2665.f12256));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(1));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(1));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C3164 next : this.f14396.values()) {
                if (next.f14408 != null) {
                    StringBuilder sb = new StringBuilder("DIRTY ");
                    sb.append(next.f14406);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(next.f14406);
                    sb2.append(next.m16010());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f14387.exists()) {
                File file = this.f14387;
                File file2 = this.f14392;
                if (file2.exists()) {
                    if (!file2.delete()) {
                        throw new IOException();
                    }
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (this.f14389.renameTo(this.f14387)) {
                this.f14392.delete();
                this.f14390 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14387, true), C2665.f12256));
            } else {
                throw new IOException();
            }
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        if (r1 != false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        return;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m15996(o.C3162.Cif r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            o.յլ$ı r0 = r9.f14402     // Catch:{ all -> 0x0106 }
            o.յլ$if r1 = r0.f14408     // Catch:{ all -> 0x0106 }
            if (r1 != r9) goto L_0x0100
            r1 = 0
            if (r10 == 0) goto L_0x003c
            boolean r2 = r0.f14405     // Catch:{ all -> 0x0106 }
            if (r2 != 0) goto L_0x003c
            r2 = 0
        L_0x0011:
            if (r2 > 0) goto L_0x003c
            boolean[] r3 = r9.f14400     // Catch:{ all -> 0x0106 }
            boolean r3 = r3[r1]     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.m16007(r1)     // Catch:{ all -> 0x0106 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0106 }
            if (r3 != 0) goto L_0x002c
            o.յլ r10 = o.C3162.this     // Catch:{ all -> 0x0106 }
            r10.m15996((o.C3162.Cif) r9, (boolean) r1)     // Catch:{ all -> 0x0106 }
            monitor-exit(r8)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002f:
            o.յլ r10 = o.C3162.this     // Catch:{ all -> 0x0106 }
            r10.m15996((o.C3162.Cif) r9, (boolean) r1)     // Catch:{ all -> 0x0106 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = "Newly created entry didn't create value for index 0"
            r9.<init>(r10)     // Catch:{ all -> 0x0106 }
            throw r9     // Catch:{ all -> 0x0106 }
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 > 0) goto L_0x007b
            java.io.File r2 = r0.m16007(r1)     // Catch:{ all -> 0x0106 }
            if (r10 == 0) goto L_0x0065
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x0078
            java.io.File r3 = r0.m16008((int) r1)     // Catch:{ all -> 0x0106 }
            r2.renameTo(r3)     // Catch:{ all -> 0x0106 }
            long[] r2 = r0.f14407     // Catch:{ all -> 0x0106 }
            r4 = r2[r1]     // Catch:{ all -> 0x0106 }
            long r2 = r3.length()     // Catch:{ all -> 0x0106 }
            long[] r6 = r0.f14407     // Catch:{ all -> 0x0106 }
            r6[r1] = r2     // Catch:{ all -> 0x0106 }
            long r6 = r8.f14394     // Catch:{ all -> 0x0106 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f14394 = r6     // Catch:{ all -> 0x0106 }
            goto L_0x0078
        L_0x0065:
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x0078
            boolean r2 = r2.delete()     // Catch:{ all -> 0x0106 }
            if (r2 == 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0106 }
            r9.<init>()     // Catch:{ all -> 0x0106 }
            throw r9     // Catch:{ all -> 0x0106 }
        L_0x0078:
            int r9 = r9 + 1
            goto L_0x003d
        L_0x007b:
            int r9 = r8.f14386     // Catch:{ all -> 0x0106 }
            r2 = 1
            int r9 = r9 + r2
            r8.f14386 = r9     // Catch:{ all -> 0x0106 }
            r9 = 0
            r0.f14408 = r9     // Catch:{ all -> 0x0106 }
            boolean r9 = r0.f14405     // Catch:{ all -> 0x0106 }
            r9 = r9 | r10
            r3 = 10
            if (r9 == 0) goto L_0x00b8
            r0.f14405 = r2     // Catch:{ all -> 0x0106 }
            java.io.Writer r9 = r8.f14390     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0106 }
            java.lang.String r5 = "CLEAN "
            r4.<init>(r5)     // Catch:{ all -> 0x0106 }
            java.lang.String r5 = r0.f14406     // Catch:{ all -> 0x0106 }
            r4.append(r5)     // Catch:{ all -> 0x0106 }
            java.lang.String r5 = r0.m16010()     // Catch:{ all -> 0x0106 }
            r4.append(r5)     // Catch:{ all -> 0x0106 }
            r4.append(r3)     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0106 }
            r9.write(r3)     // Catch:{ all -> 0x0106 }
            if (r10 == 0) goto L_0x00d7
            long r9 = r8.f14388     // Catch:{ all -> 0x0106 }
            r3 = 1
            long r3 = r3 + r9
            r8.f14388 = r3     // Catch:{ all -> 0x0106 }
            r0.f14404 = r9     // Catch:{ all -> 0x0106 }
            goto L_0x00d7
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r9 = r8.f14396     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = r0.f14406     // Catch:{ all -> 0x0106 }
            r9.remove(r10)     // Catch:{ all -> 0x0106 }
            java.io.Writer r9 = r8.f14390     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = "REMOVE "
            r10.<init>(r4)     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = r0.f14406     // Catch:{ all -> 0x0106 }
            r10.append(r0)     // Catch:{ all -> 0x0106 }
            r10.append(r3)     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0106 }
            r9.write(r10)     // Catch:{ all -> 0x0106 }
        L_0x00d7:
            java.io.Writer r9 = r8.f14390     // Catch:{ all -> 0x0106 }
            r9.flush()     // Catch:{ all -> 0x0106 }
            long r9 = r8.f14394     // Catch:{ all -> 0x0106 }
            long r3 = r8.f14395     // Catch:{ all -> 0x0106 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
            int r9 = r8.f14386     // Catch:{ all -> 0x0106 }
            r10 = 2000(0x7d0, float:2.803E-42)
            if (r9 < r10) goto L_0x00f5
            int r9 = r8.f14386     // Catch:{ all -> 0x0106 }
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r10 = r8.f14396     // Catch:{ all -> 0x0106 }
            int r10 = r10.size()     // Catch:{ all -> 0x0106 }
            if (r9 < r10) goto L_0x00f5
            r1 = 1
        L_0x00f5:
            if (r1 == 0) goto L_0x00fe
        L_0x00f7:
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f14391     // Catch:{ all -> 0x0106 }
            java.util.concurrent.Callable<java.lang.Void> r10 = r8.f14397     // Catch:{ all -> 0x0106 }
            r9.submit(r10)     // Catch:{ all -> 0x0106 }
        L_0x00fe:
            monitor-exit(r8)
            return
        L_0x0100:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0106 }
            r9.<init>()     // Catch:{ all -> 0x0106 }
            throw r9     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3162.m15996(o.յլ$if, boolean):void");
    }

    public final synchronized void close() {
        if (this.f14390 != null) {
            Iterator it = new ArrayList(this.f14396.values()).iterator();
            while (it.hasNext()) {
                C3164 r1 = (C3164) it.next();
                if (r1.f14408 != null) {
                    Cif ifVar = r1.f14408;
                    C3162.this.m15996(ifVar, false);
                }
            }
            m15997();
            this.f14390.close();
            this.f14390 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: і  reason: contains not printable characters */
    public void m15997() {
        while (this.f14394 > this.f14395) {
            m15998((String) this.f14396.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m15985(String str) {
        if (!f14384.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,64}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: o.յլ$ɩ  reason: contains not printable characters */
    public final class C3165 implements Closeable {

        /* renamed from: ı  reason: contains not printable characters */
        public final long[] f14410;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final InputStream[] f14411;

        /* synthetic */ C3165(InputStream[] inputStreamArr, long[] jArr) {
            this(inputStreamArr, jArr, (byte) 0);
        }

        private C3165(InputStream[] inputStreamArr, long[] jArr, byte b) {
            this.f14411 = inputStreamArr;
            this.f14410 = jArr;
        }

        public final void close() {
            for (InputStream r3 : this.f14411) {
                C2665.m14141(r3);
            }
        }
    }

    /* renamed from: o.յլ$if  reason: invalid class name */
    public final class Cif {
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean[] f14400;
        /* access modifiers changed from: private */

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f14401;
        /* access modifiers changed from: private */

        /* renamed from: ι  reason: contains not printable characters */
        public final C3164 f14402;

        /* synthetic */ Cif(C3162 r1, C3164 r2, byte b) {
            this(r2);
        }

        private Cif(C3164 r2) {
            this.f14402 = r2;
            this.f14400 = r2.f14405 ? null : new boolean[C3162.m15993()];
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
        /* renamed from: ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream m16005(int r4) {
            /*
                r3 = this;
                o.յլ r0 = o.C3162.this
                monitor-enter(r0)
                o.յլ$ı r1 = r3.f14402     // Catch:{ all -> 0x0042 }
                o.յլ$if r1 = r1.f14408     // Catch:{ all -> 0x0042 }
                if (r1 != r3) goto L_0x003c
                o.յլ$ı r1 = r3.f14402     // Catch:{ all -> 0x0042 }
                boolean r1 = r1.f14405     // Catch:{ all -> 0x0042 }
                if (r1 != 0) goto L_0x0014
                boolean[] r1 = r3.f14400     // Catch:{ all -> 0x0042 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0042 }
            L_0x0014:
                o.յլ$ı r1 = r3.f14402     // Catch:{ all -> 0x0042 }
                java.io.File r4 = r1.m16007(r4)     // Catch:{ all -> 0x0042 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0020 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0020 }
                goto L_0x002e
            L_0x0020:
                o.յլ r1 = o.C3162.this     // Catch:{ all -> 0x0042 }
                java.io.File r1 = r1.f14393     // Catch:{ all -> 0x0042 }
                r1.mkdirs()     // Catch:{ all -> 0x0042 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0036 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0036 }
            L_0x002e:
                o.յլ$if$ǃ r4 = new o.յլ$if$ǃ     // Catch:{ all -> 0x0042 }
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch:{ all -> 0x0042 }
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return r4
            L_0x0036:
                java.io.OutputStream r4 = o.C3162.f14385     // Catch:{ all -> 0x0042 }
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return r4
            L_0x003c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0042 }
                r4.<init>()     // Catch:{ all -> 0x0042 }
                throw r4     // Catch:{ all -> 0x0042 }
            L_0x0042:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3162.Cif.m16005(int):java.io.OutputStream");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m16006() {
            if (this.f14401) {
                C3162.this.m15996(this, false);
                C3162.this.m15998(this.f14402.f14406);
                return;
            }
            C3162.this.m15996(this, true);
        }

        /* renamed from: o.յլ$if$ǃ  reason: contains not printable characters */
        class C3163 extends FilterOutputStream {
            /* synthetic */ C3163(Cif ifVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            private C3163(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = Cif.this.f14401 = true;
                }
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = Cif.this.f14401 = true;
                }
            }

            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = Cif.this.f14401 = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = Cif.this.f14401 = true;
                }
            }
        }
    }

    /* renamed from: o.յլ$ı  reason: contains not printable characters */
    final class C3164 {

        /* renamed from: ı  reason: contains not printable characters */
        long f14404;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f14405;

        /* renamed from: ɩ  reason: contains not printable characters */
        final String f14406;

        /* renamed from: Ι  reason: contains not printable characters */
        final long[] f14407;

        /* renamed from: ι  reason: contains not printable characters */
        Cif f14408;

        /* synthetic */ C3164(C3162 r1, String str, byte b) {
            this(str);
        }

        private C3164(String str) {
            this.f14406 = str;
            this.f14407 = new long[C3162.m15993()];
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m16010() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f14407) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m16009(String[] strArr) {
            if (strArr.length == C3162.m15993()) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f14407[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("unexpected journal line: ");
                        sb.append(Arrays.toString(strArr));
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(Arrays.toString(strArr));
            throw new IOException(sb2.toString());
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final File m16008(int i) {
            File r1 = C3162.this.f14393;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14406);
            sb.append(".");
            sb.append(i);
            return new File(r1, sb.toString());
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final File m16007(int i) {
            File r1 = C3162.this.f14393;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14406);
            sb.append(".");
            sb.append(i);
            sb.append(".tmp");
            return new File(r1, sb.toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized C3165 m15999(String str) {
        if (this.f14390 != null) {
            m15985(str);
            C3164 r0 = this.f14396.get(str);
            if (r0 == null) {
                return null;
            }
            if (!r0.f14405) {
                return null;
            }
            boolean z = true;
            InputStream[] inputStreamArr = new InputStream[1];
            int i = 0;
            while (i <= 0) {
                try {
                    inputStreamArr[0] = new FileInputStream(r0.m16008(0));
                    i++;
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        if (inputStreamArr[0] == null) {
                            break;
                        }
                        C2665.m14141(inputStreamArr[0]);
                    }
                    return null;
                }
            }
            this.f14386++;
            Writer writer = this.f14390;
            StringBuilder sb = new StringBuilder("READ ");
            sb.append(str);
            sb.append(10);
            writer.append(sb.toString());
            if (this.f14386 < 2000 || this.f14386 < this.f14396.size()) {
                z = false;
            }
            if (z) {
                this.f14391.submit(this.f14397);
            }
            return new C3165(inputStreamArr, r0.f14407);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized Cif m16000(String str) {
        if (this.f14390 != null) {
            m15985(str);
            C3164 r0 = this.f14396.get(str);
            if (r0 == null) {
                r0 = new C3164(this, str, (byte) 0);
                this.f14396.put(str, r0);
            } else if (r0.f14408 != null) {
                return null;
            }
            Cif ifVar = new Cif(this, r0, (byte) 0);
            r0.f14408 = ifVar;
            Writer writer = this.f14390;
            StringBuilder sb = new StringBuilder("DIRTY ");
            sb.append(str);
            sb.append(10);
            writer.write(sb.toString());
            this.f14390.flush();
            return ifVar;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        return false;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m15998(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.Writer r0 = r8.f14390     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            m15985((java.lang.String) r9)     // Catch:{ all -> 0x0098 }
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r0 = r8.f14396     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0098 }
            o.յլ$ı r0 = (o.C3162.C3164) r0     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r0 == 0) goto L_0x008e
            o.յլ$if r2 = r0.f14408     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0019
            goto L_0x008e
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 > 0) goto L_0x004f
            java.io.File r3 = r0.m16008((int) r1)     // Catch:{ all -> 0x0098 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x003d
            boolean r4 = r3.delete()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x002d
            goto L_0x003d
        L_0x002d:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "failed to delete "
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0098 }
            r9.<init>(r0)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x003d:
            long r3 = r8.f14394     // Catch:{ all -> 0x0098 }
            long[] r5 = r0.f14407     // Catch:{ all -> 0x0098 }
            r6 = r5[r1]     // Catch:{ all -> 0x0098 }
            long r3 = r3 - r6
            r8.f14394 = r3     // Catch:{ all -> 0x0098 }
            long[] r3 = r0.f14407     // Catch:{ all -> 0x0098 }
            r4 = 0
            r3[r1] = r4     // Catch:{ all -> 0x0098 }
            int r2 = r2 + 1
            goto L_0x001a
        L_0x004f:
            int r0 = r8.f14386     // Catch:{ all -> 0x0098 }
            r2 = 1
            int r0 = r0 + r2
            r8.f14386 = r0     // Catch:{ all -> 0x0098 }
            java.io.Writer r0 = r8.f14390     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "REMOVE "
            r3.<init>(r4)     // Catch:{ all -> 0x0098 }
            r3.append(r9)     // Catch:{ all -> 0x0098 }
            r4 = 10
            r3.append(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0098 }
            r0.append(r3)     // Catch:{ all -> 0x0098 }
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r0 = r8.f14396     // Catch:{ all -> 0x0098 }
            r0.remove(r9)     // Catch:{ all -> 0x0098 }
            int r9 = r8.f14386     // Catch:{ all -> 0x0098 }
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r9 < r0) goto L_0x0083
            int r9 = r8.f14386     // Catch:{ all -> 0x0098 }
            java.util.LinkedHashMap<java.lang.String, o.յլ$ı> r0 = r8.f14396     // Catch:{ all -> 0x0098 }
            int r0 = r0.size()     // Catch:{ all -> 0x0098 }
            if (r9 < r0) goto L_0x0083
            r1 = 1
        L_0x0083:
            if (r1 == 0) goto L_0x008c
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f14391     // Catch:{ all -> 0x0098 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.f14397     // Catch:{ all -> 0x0098 }
            r9.submit(r0)     // Catch:{ all -> 0x0098 }
        L_0x008c:
            monitor-exit(r8)
            return r2
        L_0x008e:
            monitor-exit(r8)
            return r1
        L_0x0090:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "cache is closed"
            r9.<init>(r0)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3162.m15998(java.lang.String):boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ boolean m15992(C3162 r2) {
        int i = r2.f14386;
        return i >= 2000 && i >= r2.f14396.size();
    }
}
