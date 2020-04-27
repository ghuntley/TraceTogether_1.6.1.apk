package o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3348d;
import o.C3478i;
import o.C3616p;
import o.C3618r;

/* renamed from: o.ҎΙ  reason: contains not printable characters */
final class C2666 implements Runnable {

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final ThreadLocal<StringBuilder> f12257 = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };

    /* renamed from: ʟ  reason: contains not printable characters */
    private static final AtomicInteger f12258 = new AtomicInteger();

    /* renamed from: г  reason: contains not printable characters */
    private static final C3618r f12259 = new C3618r() {
        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m14148(C3617q qVar) {
            return true;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C3618r.C0275 m14147(C3617q qVar) {
            throw new IllegalStateException("Unrecognized type of request: ".concat(String.valueOf(qVar)));
        }
    };

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final Object f12260 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    final C3616p f12261;

    /* renamed from: ŀ  reason: contains not printable characters */
    private C3259a f12262;

    /* renamed from: ł  reason: contains not printable characters */
    private C3398f f12263;

    /* renamed from: ſ  reason: contains not printable characters */
    private C3617q f12264;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Bitmap f12265;

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f12266;

    /* renamed from: ȷ  reason: contains not printable characters */
    C3616p.C0272 f12267;

    /* renamed from: ɍ  reason: contains not printable characters */
    private int f12268;

    /* renamed from: ɨ  reason: contains not printable characters */
    int f12269;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f12270;

    /* renamed from: ɪ  reason: contains not printable characters */
    Exception f12271;

    /* renamed from: ɹ  reason: contains not printable characters */
    final C3618r f12272;

    /* renamed from: ɾ  reason: contains not printable characters */
    C3616p.Cif f12273;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C3622v f12274;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f12275 = f12258.incrementAndGet();

    /* renamed from: ι  reason: contains not printable characters */
    final String f12276;

    /* renamed from: І  reason: contains not printable characters */
    Future<?> f12277;

    /* renamed from: і  reason: contains not printable characters */
    List<C3126> f12278;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C3126 f12279;

    private C2666(C3616p pVar, C3398f fVar, C3259a aVar, C3622v vVar, C3126 r6, C3618r rVar) {
        this.f12261 = pVar;
        this.f12263 = fVar;
        this.f12262 = aVar;
        this.f12274 = vVar;
        this.f12279 = r6;
        this.f12276 = r6.f14261;
        this.f12264 = r6.f14263;
        this.f12273 = r6.f14263.f3480;
        this.f12266 = 0;
        this.f12270 = 0;
        this.f12272 = rVar;
        this.f12269 = rVar.m4072();
    }

    public final void run() {
        String str;
        Thread currentThread;
        String str2;
        String str3 = "Picasso-Idle";
        try {
            C3617q qVar = this.f12264;
            if (qVar.f3474 != null) {
                str2 = String.valueOf(qVar.f3474.getPath());
            } else {
                str2 = Integer.toHexString(qVar.f3476);
            }
            StringBuilder sb = f12257.get();
            sb.ensureCapacity(str2.length() + 8);
            sb.replace(8, sb.length(), str2);
            Thread.currentThread().setName(sb.toString());
            boolean z = this.f12261.f3452;
            this.f12265 = m14143();
            if (this.f12265 == null) {
                C3398f fVar = this.f12263;
                fVar.f2144.sendMessage(fVar.f2144.obtainMessage(6, this));
            } else {
                C3398f fVar2 = this.f12263;
                fVar2.f2144.sendMessage(fVar2.f2144.obtainMessage(4, this));
            }
        } catch (C3348d.C0156 e) {
            if (!e.f2027 || e.f2026 != 504) {
                this.f12271 = e;
            }
            C3398f fVar3 = this.f12263;
            fVar3.f2144.sendMessage(fVar3.f2144.obtainMessage(6, this));
        } catch (C3478i.Cif e2) {
            this.f12271 = e2;
            C3398f fVar4 = this.f12263;
            fVar4.f2144.sendMessageDelayed(fVar4.f2144.obtainMessage(5, this), 500);
        } catch (IOException e3) {
            this.f12271 = e3;
            C3398f fVar5 = this.f12263;
            fVar5.f2144.sendMessageDelayed(fVar5.f2144.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            C3622v vVar = this.f12274;
            int r8 = vVar.f3503.m1443();
            int r9 = vVar.f3503.m1442();
            long j = vVar.f3506;
            long j2 = vVar.f3501;
            long j3 = vVar.f3511;
            long j4 = vVar.f3508;
            str = str3;
            OutOfMemoryError outOfMemoryError = e4;
            long j5 = vVar.f3514;
            long j6 = vVar.f3502;
            long j7 = vVar.f3513;
            long j8 = j4;
            int i = vVar.f3505;
            int i2 = vVar.f3509;
            long j9 = j5;
            long j10 = j7;
            int i3 = i;
            C3427gb gbVar = new C3427gb(r8, r9, j, j2, j3, j8, vVar.f3512, j9, j6, j10, i3, i2, vVar.f3507, System.currentTimeMillis());
            StringWriter stringWriter2 = stringWriter;
            PrintWriter printWriter = new PrintWriter(stringWriter2);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            printWriter.println(gbVar.f2219);
            printWriter.print("  Cache Size: ");
            printWriter.println(gbVar.f2222);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) gbVar.f2222) / ((float) gbVar.f2219)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(gbVar.f2214);
            printWriter.print("  Cache Misses: ");
            printWriter.println(gbVar.f2223);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(gbVar.f2218);
            printWriter.print("  Total Download Size: ");
            printWriter.println(gbVar.f2216);
            printWriter.print("  Average Download Size: ");
            printWriter.println(gbVar.f2225);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(gbVar.f2220);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(gbVar.f2221);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(gbVar.f2227);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(gbVar.f2215);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(gbVar.f2226);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(gbVar.f2224);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter2.toString(), outOfMemoryError);
            this.f12271 = runtimeException;
            C3398f fVar6 = this.f12263;
            fVar6.f2144.sendMessage(fVar6.f2144.obtainMessage(6, this));
            currentThread = Thread.currentThread();
            str3 = str;
        } catch (Exception e5) {
            this.f12271 = e5;
            C3398f fVar7 = this.f12263;
            fVar7.f2144.sendMessage(fVar7.f2144.obtainMessage(6, this));
        } catch (Throwable th) {
            th = th;
            str3 = str;
            Thread.currentThread().setName(str3);
            throw th;
        }
        currentThread = Thread.currentThread();
        currentThread.setName(str3);
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0127  */
    /* renamed from: ɩ  reason: contains not printable characters */
    private android.graphics.Bitmap m14143() {
        /*
            r17 = this;
            r1 = r17
            r0 = 0
            boolean r2 = o.C3560l.m3362(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0024
            o.a r2 = r1.f12262
            java.lang.String r4 = r1.f12276
            android.graphics.Bitmap r2 = r2.m1444(r4)
            if (r2 == 0) goto L_0x0025
            o.v r3 = r1.f12274
            android.os.Handler r3 = r3.f3510
            r3.sendEmptyMessage(r0)
            o.p$ɩ r0 = o.C3616p.C0272.MEMORY
            r1.f12267 = r0
            o.p r0 = r1.f12261
            boolean r0 = r0.f3452
            return r2
        L_0x0024:
            r2 = r3
        L_0x0025:
            o.q r4 = r1.f12264
            int r5 = r1.f12269
            if (r5 != 0) goto L_0x0030
            o.j r5 = o.C3505j.OFFLINE
            int r5 = r5.f2392
            goto L_0x0032
        L_0x0030:
            int r5 = r1.f12270
        L_0x0032:
            r4.f3478 = r5
            o.r r4 = r1.f12272
            o.q r5 = r1.f12264
            o.r$ǃ r4 = r4.m4069(r5)
            r5 = 1
            if (r4 == 0) goto L_0x00b6
            o.p$ɩ r2 = r4.f3493
            r1.f12267 = r2
            int r2 = r4.f3491
            r1.f12268 = r2
            android.graphics.Bitmap r2 = r4.f3492
            if (r2 != 0) goto L_0x00b6
            java.io.InputStream r2 = r4.f3490
            o.q r4 = r1.f12264     // Catch:{ all -> 0x00b1 }
            o.k r6 = new o.k     // Catch:{ all -> 0x00b1 }
            r6.<init>(r2)     // Catch:{ all -> 0x00b1 }
            r7 = 65536(0x10000, float:9.18355E-41)
            long r7 = r6.m3195((int) r7)     // Catch:{ all -> 0x00b1 }
            android.graphics.BitmapFactory$Options r9 = o.C3618r.m4067(r4)     // Catch:{ all -> 0x00b1 }
            if (r9 == 0) goto L_0x0066
            boolean r10 = r9.inJustDecodeBounds     // Catch:{ all -> 0x00b1 }
            if (r10 == 0) goto L_0x0066
            r10 = 1
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            boolean r11 = o.C3626z.m4095(r6)     // Catch:{ all -> 0x00b1 }
            r6.m3196((long) r7)     // Catch:{ all -> 0x00b1 }
            if (r11 == 0) goto L_0x008b
            byte[] r3 = o.C3626z.m4098((java.io.InputStream) r6)     // Catch:{ all -> 0x00b1 }
            if (r10 == 0) goto L_0x0085
            int r6 = r3.length     // Catch:{ all -> 0x00b1 }
            android.graphics.BitmapFactory.decodeByteArray(r3, r0, r6, r9)     // Catch:{ all -> 0x00b1 }
            int r6 = r4.f3479     // Catch:{ all -> 0x00b1 }
            int r4 = r4.f3481     // Catch:{ all -> 0x00b1 }
            int r7 = r9.outWidth     // Catch:{ all -> 0x00b1 }
            int r8 = r9.outHeight     // Catch:{ all -> 0x00b1 }
            o.C3618r.m4068(r6, r4, r7, r8, r9)     // Catch:{ all -> 0x00b1 }
        L_0x0085:
            int r4 = r3.length     // Catch:{ all -> 0x00b1 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r4, r9)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a4
        L_0x008b:
            if (r10 == 0) goto L_0x009e
            android.graphics.BitmapFactory.decodeStream(r6, r3, r9)     // Catch:{ all -> 0x00b1 }
            int r10 = r4.f3479     // Catch:{ all -> 0x00b1 }
            int r4 = r4.f3481     // Catch:{ all -> 0x00b1 }
            int r11 = r9.outWidth     // Catch:{ all -> 0x00b1 }
            int r12 = r9.outHeight     // Catch:{ all -> 0x00b1 }
            o.C3618r.m4068(r10, r4, r11, r12, r9)     // Catch:{ all -> 0x00b1 }
            r6.m3196((long) r7)     // Catch:{ all -> 0x00b1 }
        L_0x009e:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r6, r3, r9)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00a9
        L_0x00a4:
            o.C3626z.m4083((java.io.InputStream) r2)
            r2 = r3
            goto L_0x00b6
        L_0x00a9:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "Failed to decode stream."
            r0.<init>(r3)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            o.C3626z.m4083((java.io.InputStream) r2)
            throw r0
        L_0x00b6:
            if (r2 == 0) goto L_0x01ca
            o.p r3 = r1.f12261
            boolean r3 = r3.f3452
            o.v r3 = r1.f12274
            int r4 = o.C3626z.m4089((android.graphics.Bitmap) r2)
            android.os.Handler r6 = r3.f3510
            android.os.Handler r3 = r3.f3510
            r7 = 2
            android.os.Message r3 = r3.obtainMessage(r7, r4, r0)
            r6.sendMessage(r3)
            o.q r3 = r1.f12264
            int r4 = r3.f3479
            if (r4 != 0) goto L_0x00db
            int r4 = r3.f3481
            if (r4 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r4 = 0
            goto L_0x00dc
        L_0x00db:
            r4 = 1
        L_0x00dc:
            if (r4 != 0) goto L_0x00ea
            java.util.List<o.y> r3 = r3.f3475
            if (r3 == 0) goto L_0x00e4
            r3 = 1
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            if (r3 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r3 = 0
            goto L_0x00eb
        L_0x00ea:
            r3 = 1
        L_0x00eb:
            if (r3 != 0) goto L_0x00f1
            int r3 = r1.f12268
            if (r3 == 0) goto L_0x01ca
        L_0x00f1:
            java.lang.Object r3 = f12260
            monitor-enter(r3)
            o.q r4 = r1.f12264     // Catch:{ all -> 0x01c7 }
            int r6 = r4.f3479     // Catch:{ all -> 0x01c7 }
            if (r6 != 0) goto L_0x0101
            int r4 = r4.f3481     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r4 = 0
            goto L_0x0102
        L_0x0101:
            r4 = 1
        L_0x0102:
            if (r4 != 0) goto L_0x0108
            int r4 = r1.f12268     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x019b
        L_0x0108:
            o.q r4 = r1.f12264     // Catch:{ all -> 0x01c7 }
            int r6 = r1.f12268     // Catch:{ all -> 0x01c7 }
            int r8 = r2.getWidth()     // Catch:{ all -> 0x01c7 }
            int r9 = r2.getHeight()     // Catch:{ all -> 0x01c7 }
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ all -> 0x01c7 }
            r11.<init>()     // Catch:{ all -> 0x01c7 }
            int r10 = r4.f3479     // Catch:{ all -> 0x01c7 }
            if (r10 != 0) goto L_0x0124
            int r10 = r4.f3481     // Catch:{ all -> 0x01c7 }
            if (r10 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r10 = 0
            goto L_0x0125
        L_0x0124:
            r10 = 1
        L_0x0125:
            if (r10 == 0) goto L_0x0181
            int r10 = r4.f3479     // Catch:{ all -> 0x01c7 }
            int r12 = r4.f3481     // Catch:{ all -> 0x01c7 }
            boolean r4 = r4.f3482     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x0165
            float r4 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r10 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r13 = r4 / r10
            float r12 = (float) r12     // Catch:{ all -> 0x01c7 }
            float r14 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r15 = r12 / r14
            int r16 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x014e
            float r15 = r15 / r13
            float r14 = r14 * r15
            double r14 = (double) r14     // Catch:{ all -> 0x01c7 }
            double r14 = java.lang.Math.ceil(r14)     // Catch:{ all -> 0x01c7 }
            int r4 = (int) r14     // Catch:{ all -> 0x01c7 }
            int r9 = r9 - r4
            int r7 = r9 / 2
            float r9 = (float) r4     // Catch:{ all -> 0x01c7 }
            float r15 = r12 / r9
            r10 = r8
            r8 = r7
            r7 = 0
            goto L_0x015f
        L_0x014e:
            float r13 = r13 / r15
            float r10 = r10 * r13
            double r12 = (double) r10     // Catch:{ all -> 0x01c7 }
            double r12 = java.lang.Math.ceil(r12)     // Catch:{ all -> 0x01c7 }
            int r10 = (int) r12     // Catch:{ all -> 0x01c7 }
            int r8 = r8 - r10
            int r7 = r8 / 2
            float r8 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r13 = r4 / r8
            r4 = r9
            r8 = 0
        L_0x015f:
            r11.preScale(r13, r15)     // Catch:{ all -> 0x01c7 }
            r9 = r10
            r10 = r4
            goto L_0x0185
        L_0x0165:
            if (r10 != 0) goto L_0x0169
            if (r12 == 0) goto L_0x0181
        L_0x0169:
            if (r10 != r8) goto L_0x016d
            if (r12 == r9) goto L_0x0181
        L_0x016d:
            if (r10 == 0) goto L_0x0172
            float r4 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r7 = (float) r8     // Catch:{ all -> 0x01c7 }
            goto L_0x0174
        L_0x0172:
            float r4 = (float) r12     // Catch:{ all -> 0x01c7 }
            float r7 = (float) r9     // Catch:{ all -> 0x01c7 }
        L_0x0174:
            float r4 = r4 / r7
            if (r12 == 0) goto L_0x017b
            float r7 = (float) r12     // Catch:{ all -> 0x01c7 }
            float r10 = (float) r9     // Catch:{ all -> 0x01c7 }
        L_0x0179:
            float r7 = r7 / r10
            goto L_0x017e
        L_0x017b:
            float r7 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r10 = (float) r8     // Catch:{ all -> 0x01c7 }
            goto L_0x0179
        L_0x017e:
            r11.preScale(r4, r7)     // Catch:{ all -> 0x01c7 }
        L_0x0181:
            r10 = r9
            r7 = 0
            r9 = r8
            r8 = 0
        L_0x0185:
            if (r6 == 0) goto L_0x018b
            float r4 = (float) r6     // Catch:{ all -> 0x01c7 }
            r11.preRotate(r4)     // Catch:{ all -> 0x01c7 }
        L_0x018b:
            r12 = 1
            r6 = r2
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01c7 }
            if (r4 == r2) goto L_0x0197
            r2.recycle()     // Catch:{ all -> 0x01c7 }
            r2 = r4
        L_0x0197:
            o.p r4 = r1.f12261     // Catch:{ all -> 0x01c7 }
            boolean r4 = r4.f3452     // Catch:{ all -> 0x01c7 }
        L_0x019b:
            o.q r4 = r1.f12264     // Catch:{ all -> 0x01c7 }
            java.util.List<o.y> r4 = r4.f3475     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r5 = 0
        L_0x01a3:
            if (r5 == 0) goto L_0x01b1
            o.q r4 = r1.f12264     // Catch:{ all -> 0x01c7 }
            java.util.List<o.y> r4 = r4.f3475     // Catch:{ all -> 0x01c7 }
            android.graphics.Bitmap r2 = m14144(r4, r2)     // Catch:{ all -> 0x01c7 }
            o.p r4 = r1.f12261     // Catch:{ all -> 0x01c7 }
            boolean r4 = r4.f3452     // Catch:{ all -> 0x01c7 }
        L_0x01b1:
            monitor-exit(r3)     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x01ca
            o.v r3 = r1.f12274
            int r4 = o.C3626z.m4089((android.graphics.Bitmap) r2)
            android.os.Handler r5 = r3.f3510
            android.os.Handler r3 = r3.f3510
            r6 = 3
            android.os.Message r0 = r3.obtainMessage(r6, r4, r0)
            r5.sendMessage(r0)
            goto L_0x01ca
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2666.m14143():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14145(C3126 r6) {
        boolean z;
        boolean z2 = true;
        if (this.f12279 == r6) {
            this.f12279 = null;
            z = true;
        } else {
            List<C3126> list = this.f12278;
            if (list != null) {
                z = list.remove(r6);
            } else {
                z = false;
            }
        }
        if (z && r6.f14263.f3480 == this.f12273) {
            C3616p.Cif ifVar = C3616p.Cif.LOW;
            List<C3126> list2 = this.f12278;
            boolean z3 = list2 != null && !list2.isEmpty();
            if (this.f12279 == null && !z3) {
                z2 = false;
            }
            if (z2) {
                C3126 r1 = this.f12279;
                if (r1 != null) {
                    ifVar = r1.f14263.f3480;
                }
                if (z3) {
                    int size = this.f12278.size();
                    for (int i = 0; i < size; i++) {
                        C3616p.Cif ifVar2 = this.f12278.get(i).f14263.f3480;
                        if (ifVar2.ordinal() > ifVar.ordinal()) {
                            ifVar = ifVar2;
                        }
                    }
                }
            }
            this.f12273 = ifVar;
        }
        boolean z4 = this.f12261.f3452;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14146() {
        List<C3126> list;
        Future<?> future;
        if (this.f12279 != null || (((list = this.f12278) != null && !list.isEmpty()) || (future = this.f12277) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Bitmap m14144(List<C3625y> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final C3625y yVar = list.get(i);
            try {
                Bitmap transform = yVar.transform(bitmap);
                if (transform == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(yVar.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C3625y key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    C3616p.f3442.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    C3616p.f3442.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(yVar.key());
                            sb.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = transform;
                } else {
                    C3616p.f3442.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(yVar.key());
                            sb.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                C3616p.f3442.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Transformation ");
                        sb.append(yVar.key());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2666 m14142(C3616p pVar, C3398f fVar, C3259a aVar, C3622v vVar, C3126 r12) {
        C3617q qVar = r12.f14263;
        List<C3618r> list = pVar.f3447;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3618r rVar = list.get(i);
            if (rVar.m4073(qVar)) {
                return new C2666(pVar, fVar, aVar, vVar, r12, rVar);
            }
        }
        return new C2666(pVar, fVar, aVar, vVar, r12, f12259);
    }
}
