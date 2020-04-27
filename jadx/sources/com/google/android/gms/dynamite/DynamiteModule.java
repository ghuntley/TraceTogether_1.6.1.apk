package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import o.C2722;
import o.C2813;
import o.C2860;
import o.C2881;
import o.C2888;
import o.C2901;
import o.C2913;
import o.C2916;
import o.C2938;
import o.C2956;
import o.C3002;

public final class DynamiteModule {

    /* renamed from: ı  reason: contains not printable characters */
    private static Boolean f576 = null;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static C3002 f577 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0053 f578 = new C2860();

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final C0053.Cif f579 = new C2901();

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final ThreadLocal<C0055> f580 = new ThreadLocal<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C0053 f581 = new C2938();

    /* renamed from: ι  reason: contains not printable characters */
    public static final C0053 f582 = new C2916();

    /* renamed from: І  reason: contains not printable characters */
    private static String f583 = null;

    /* renamed from: і  reason: contains not printable characters */
    private static C2956 f584 = null;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static int f585 = -1;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f586;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$ı  reason: contains not printable characters */
    public interface C0053 {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$ı$if  reason: invalid class name */
        public interface Cif {
            /* renamed from: ı  reason: contains not printable characters */
            int m805(Context context, String str);

            /* renamed from: ɩ  reason: contains not printable characters */
            int m806(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$ı$ɩ  reason: contains not printable characters */
        public static class C0054 {

            /* renamed from: ɩ  reason: contains not printable characters */
            public int f588 = 0;

            /* renamed from: Ι  reason: contains not printable characters */
            public int f589 = 0;

            /* renamed from: ι  reason: contains not printable characters */
            public int f590 = 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        C0054 m804(Context context, String str, Cif ifVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$ɩ  reason: contains not printable characters */
    static class C0055 {

        /* renamed from: Ι  reason: contains not printable characters */
        public Cursor f591;

        private C0055() {
        }

        /* synthetic */ C0055(byte b) {
            this();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static DynamiteModule m800(Context context, C0053 r8, String str) {
        C0053.C0054 r3;
        C0055 r0 = f580.get();
        C0055 r1 = new C0055((byte) 0);
        f580.set(r1);
        try {
            r3 = r8.m804(context, str, f579);
            if (r3.f589 == 0 || ((r3.f589 == -1 && r3.f588 == 0) || (r3.f589 == 1 && r3.f590 == 0))) {
                int i = r3.f588;
                int i2 = r3.f590;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i);
                sb.append(" and remote version is ");
                sb.append(i2);
                sb.append(".");
                throw new If(sb.toString(), (byte) 0);
            } else if (r3.f589 == -1) {
                DynamiteModule dynamiteModule = new DynamiteModule(context.getApplicationContext());
                if (r1.f591 != null) {
                    r1.f591.close();
                }
                f580.set(r0);
                return dynamiteModule;
            } else if (r3.f589 == 1) {
                DynamiteModule r7 = m797(context, str, r3.f590);
                if (r1.f591 != null) {
                    r1.f591.close();
                }
                f580.set(r0);
                return r7;
            } else {
                int i3 = r3.f589;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(i3);
                throw new If(sb2.toString(), (byte) 0);
            }
        } catch (If e) {
            e.getMessage();
            if (r3.f588 == 0 || r8.m804(context, str, new Cif(r3.f588)).f589 != -1) {
                throw new If("Remote load failed. No local fallback found.", e, (byte) 0);
            }
            DynamiteModule dynamiteModule2 = new DynamiteModule(context.getApplicationContext());
            if (r1.f591 != null) {
                r1.f591.close();
            }
            f580.set(r0);
            return dynamiteModule2;
        } catch (Throwable th) {
            if (r1.f591 != null) {
                r1.f591.close();
            }
            f580.set(r0);
            throw th;
        }
    }

    public static class If extends Exception {
        private If(String str) {
            super(str);
        }

        private If(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ If(String str, byte b) {
            this(str);
        }

        /* synthetic */ If(String str, Throwable th, byte b) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$if  reason: invalid class name */
    static class Cif implements C0053.Cif {

        /* renamed from: ι  reason: contains not printable characters */
        private final int f587;

        public Cif(int i) {
            this.f587 = i;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m803(Context context, String str, boolean z) {
            return 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m802(Context context, String str) {
            return this.f587;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m798(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            declaredField.get((Object) null);
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: ι  reason: contains not printable characters */
    public static int m799(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00ab }
            java.lang.Boolean r1 = f576     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x0091
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m796(r4)     // Catch:{ If -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m791((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ If -> 0x007e }
            java.lang.String r5 = f583     // Catch:{ If -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f583     // Catch:{ If -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ If -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            o.ӏґ r5 = new o.ӏґ     // Catch:{ If -> 0x007e }
            java.lang.String r6 = f583     // Catch:{ If -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ If -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ If -> 0x007e }
            m796(r5)     // Catch:{ If -> 0x007e }
            r2.set(r3, r5)     // Catch:{ If -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ If -> 0x007e }
            f576 = r5     // Catch:{ If -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x008f
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        L_0x008d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
        L_0x008f:
            f576 = r1     // Catch:{ all -> 0x00a8 }
        L_0x0091:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x00a3
            int r8 = m791((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ If -> 0x009d }
            return r8
        L_0x009d:
            r9 = move-exception
            r9.getMessage()     // Catch:{ all -> 0x00ab }
            r8 = 0
            return r8
        L_0x00a3:
            int r8 = m794(r8, r9, r10)     // Catch:{ all -> 0x00ab }
            return r8
        L_0x00a8:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r9     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r9 = move-exception
            o.C2154.m11412(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m799(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m794(Context context, String str, boolean z) {
        C2956 r0 = m793(context);
        if (r0 == null) {
            return 0;
        }
        try {
            if (r0.m15219() >= 2) {
                return r0.m15217((C2722) new C2813(context), str, z);
            }
            return r0.m15220((C2722) new C2813(context), str, z);
        } catch (RemoteException e) {
            e.getMessage();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        r0 = r8;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r0 = r8;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.If("V2 version check failed", r8, (byte) 0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m791(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            r1 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0095 }
            if (r10 == 0) goto L_0x000b
            java.lang.String r8 = "api_force_staging"
            goto L_0x000d
        L_0x000b:
            java.lang.String r8 = "api"
        L_0x000d:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0095 }
            int r10 = r10 + 42
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0095 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0095 }
            int r10 = r10 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
            r3.<init>(r10)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r3.append(r10)     // Catch:{ Exception -> 0x0095 }
            r3.append(r8)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r8 = "/"
            r3.append(r8)     // Catch:{ Exception -> 0x0095 }
            r3.append(r9)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x0095 }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0095 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0095 }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 == 0) goto L_0x0083
            int r9 = r8.getInt(r1)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r9 <= 0) goto L_0x007d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r2 = 2
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x007a }
            f583 = r2     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "loaderVersion"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x007a }
            if (r2 < 0) goto L_0x0067
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x007a }
            f585 = r2     // Catch:{ all -> 0x007a }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x007a }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$ɩ> r10 = f580     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            com.google.android.gms.dynamite.DynamiteModule$ɩ r10 = (com.google.android.gms.dynamite.DynamiteModule.C0055) r10     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r10 == 0) goto L_0x007d
            android.database.Cursor r2 = r10.f591     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            if (r2 != 0) goto L_0x007d
            r10.f591 = r8     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r8 = r0
            goto L_0x007d
        L_0x007a:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x007d:
            if (r8 == 0) goto L_0x0082
            r8.close()
        L_0x0082:
            return r9
        L_0x0083:
            com.google.android.gms.dynamite.DynamiteModule$If r9 = new com.google.android.gms.dynamite.DynamiteModule$If     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (byte) r1)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            throw r9     // Catch:{ Exception -> 0x008f, all -> 0x008b }
        L_0x008b:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a3
        L_0x008f:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x0096
        L_0x0093:
            r8 = move-exception
            goto L_0x00a3
        L_0x0095:
            r8 = move-exception
        L_0x0096:
            boolean r9 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.If     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x009b
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x009b:
            com.google.android.gms.dynamite.DynamiteModule$If r9 = new com.google.android.gms.dynamite.DynamiteModule$If     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "V2 version check failed"
            r9.<init>(r10, r8, r1)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x00a3:
            if (r0 == 0) goto L_0x00a8
            r0.close()
        L_0x00a8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m791(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m790(Context context, String str) {
        return m799(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        o.C2154.m11412(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.If("Failed to load remote module.", r5, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.If("Failed to load remote module.", r4, (byte) 0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.DynamiteModule m797(android.content.Context r4, java.lang.String r5, int r6) {
        /*
            r0 = 0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            java.lang.Boolean r2 = f576     // Catch:{ all -> 0x005e }
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0056
            boolean r1 = r2.booleanValue()     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.dynamite.DynamiteModule r4 = m792((android.content.Context) r4, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            return r4
        L_0x0014:
            o.ԃ r1 = m793(r4)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            if (r1 == 0) goto L_0x004e
            int r2 = r1.m15219()     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            r3 = 2
            if (r2 < r3) goto L_0x002b
            o.ӀΓ r2 = new o.ӀΓ     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            o.ҳ r5 = r1.m15218((o.C2722) r2, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            goto L_0x0034
        L_0x002b:
            o.ӀΓ r2 = new o.ӀΓ     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            o.ҳ r5 = r1.m15221((o.C2722) r2, (java.lang.String) r5, (int) r6)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
        L_0x0034:
            java.lang.Object r6 = o.C2813.m14731(r5)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            if (r6 == 0) goto L_0x0046
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            java.lang.Object r5 = o.C2813.m14731(r5)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            r6.<init>(r5)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            return r6
        L_0x0046:
            com.google.android.gms.dynamite.DynamiteModule$If r5 = new com.google.android.gms.dynamite.DynamiteModule$If     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>((java.lang.String) r6, (byte) r0)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            throw r5     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
        L_0x004e:
            com.google.android.gms.dynamite.DynamiteModule$If r5 = new com.google.android.gms.dynamite.DynamiteModule$If     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            java.lang.String r6 = "Failed to create IDynamiteLoader."
            r5.<init>((java.lang.String) r6, (byte) r0)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            throw r5     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
        L_0x0056:
            com.google.android.gms.dynamite.DynamiteModule$If r5 = new com.google.android.gms.dynamite.DynamiteModule$If     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            java.lang.String r6 = "Failed to determine which loading route to use."
            r5.<init>((java.lang.String) r6, (byte) r0)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            throw r5     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
        L_0x005e:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
            throw r5     // Catch:{ RemoteException -> 0x006f, If -> 0x006d, all -> 0x0061 }
        L_0x0061:
            r5 = move-exception
            o.C2154.m11412(r4, r5)
            com.google.android.gms.dynamite.DynamiteModule$If r4 = new com.google.android.gms.dynamite.DynamiteModule$If
            java.lang.String r6 = "Failed to load remote module."
            r4.<init>(r6, r5, r0)
            throw r4
        L_0x006d:
            r4 = move-exception
            throw r4
        L_0x006f:
            r4 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$If r5 = new com.google.android.gms.dynamite.DynamiteModule$If
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>(r6, r4, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m797(android.content.Context, java.lang.String, int):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.C2956 m793(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            o.ԃ r1 = f584     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x000b
            o.ԃ r4 = f584     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r4
        L_0x000b:
            o.Ӏх r1 = o.C2837.f13284     // Catch:{ all -> 0x0051 }
            int r1 = r1.m14806(r4)     // Catch:{ all -> 0x0051 }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x0016:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004b }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x004b }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x004b }
            if (r4 != 0) goto L_0x0031
            r4 = r2
            goto L_0x0045
        L_0x0031:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004b }
            boolean r3 = r1 instanceof o.C2956     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x003f
            r4 = r1
            o.ԃ r4 = (o.C2956) r4     // Catch:{ Exception -> 0x004b }
            goto L_0x0045
        L_0x003f:
            o.ԛ r1 = new o.ԛ     // Catch:{ Exception -> 0x004b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x004b }
            r4 = r1
        L_0x0045:
            if (r4 == 0) goto L_0x004f
            f584 = r4     // Catch:{ Exception -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r4
        L_0x004b:
            r4 = move-exception
            r4.getMessage()     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m793(android.content.Context):o.ԃ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static DynamiteModule m792(Context context, String str, int i) {
        C3002 r1;
        C2722 r5;
        synchronized (DynamiteModule.class) {
            r1 = f577;
        }
        if (r1 != null) {
            C0055 r2 = f580.get();
            if (r2 == null || r2.f591 == null) {
                throw new If("No result cursor", (byte) 0);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = r2.f591;
            new C2813(null);
            if (m795().booleanValue()) {
                r5 = r1.m15390(new C2813(applicationContext), str, i, new C2813(cursor));
            } else {
                r5 = r1.m15389(new C2813(applicationContext), str, i, new C2813(cursor));
            }
            Context context2 = (Context) C2813.m14731(r5);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new If("Failed to get module context", (byte) 0);
        }
        throw new If("DynamiteLoaderV2 was not cached.", (byte) 0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Boolean m795() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f585 >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m796(java.lang.ClassLoader r3) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r3 != 0) goto L_0x0019
            r3 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r2 = r1 instanceof o.C3002     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 == 0) goto L_0x0027
            r3 = r1
            o.ԧǃ r3 = (o.C3002) r3     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            o.ԉ r1 = new o.ԉ     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r1.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r3 = r1
        L_0x002d:
            f577 = r3     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r3 = move-exception
            goto L_0x0039
        L_0x0032:
            r3 = move-exception
            goto L_0x0039
        L_0x0034:
            r3 = move-exception
            goto L_0x0039
        L_0x0036:
            r3 = move-exception
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$If r1 = new com.google.android.gms.dynamite.DynamiteModule$If
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m796(java.lang.ClassLoader):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final IBinder m801(String str) {
        try {
            return (IBinder) this.f586.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new If(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (byte) 0);
        }
    }

    private DynamiteModule(Context context) {
        if (context != null) {
            this.f586 = context;
            return;
        }
        throw new NullPointerException("null reference");
    }

    static {
        new C2881();
        new C2888();
        new C2913();
    }
}
