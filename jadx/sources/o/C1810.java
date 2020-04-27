package o;

/* renamed from: o.ΙɈ  reason: contains not printable characters */
public final class C1810 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int f9263;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1878 f9264;

    /* renamed from: o.ΙɈ$if  reason: invalid class name */
    static final class Cif extends C1878 {
        Cif() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m10010(Throwable th, Throwable th2) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m10008(Throwable th, Throwable th2) {
        f9264.m10271(th, th2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Integer m10009() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m10009()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ all -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            o.ΞІ r2 = new o.ΞІ     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            o.ΙΞ r2 = new o.ΙΞ     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x0024:
            o.ΙɈ$if r2 = new o.ΙɈ$if     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x005f
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<o.ΙɈ$if> r4 = o.C1810.Cif.class
            java.lang.String r4 = r4.getName()
            int r5 = r4.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            o.ΙɈ$if r2 = new o.ΙɈ$if
            r2.<init>()
        L_0x005f:
            f9264 = r2
            if (r1 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            int r0 = r1.intValue()
        L_0x0068:
            f9263 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1810.<clinit>():void");
    }
}
