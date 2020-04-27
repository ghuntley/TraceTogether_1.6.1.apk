package o;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;

/* renamed from: o.z  reason: case insensitive filesystem */
final class C3626z {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static StringBuilder f3517 = new StringBuilder();

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m4089(Bitmap bitmap) {
        int i;
        if (Build.VERSION.SDK_INT >= 12) {
            i = bitmap.getByteCount();
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Negative size: ".concat(String.valueOf(bitmap)));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static <T> T m4093(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m4086(C3617q qVar) {
        StringBuilder sb = f3517;
        if (qVar.f3474 != null) {
            String obj = qVar.f3474.toString();
            sb.ensureCapacity(obj.length() + 50);
            sb.append(obj);
        } else {
            sb.ensureCapacity(50);
            sb.append(qVar.f3476);
        }
        sb.append(10);
        if ((qVar.f3479 == 0 && qVar.f3481 == 0) ? false : true) {
            sb.append("resize:");
            sb.append(qVar.f3479);
            sb.append('x');
            sb.append(qVar.f3481);
            sb.append(10);
        }
        if (qVar.f3482) {
            sb.append("centerCrop\n");
        }
        if (qVar.f3475 != null) {
            int size = qVar.f3475.size();
            for (int i = 0; i < size; i++) {
                sb.append(qVar.f3475.get(i).key());
                sb.append(10);
            }
        }
        String obj2 = sb.toString();
        f3517.setLength(0);
        return obj2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m4083(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m4088(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C3348d m4082(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new C3614n(context);
        } catch (ClassNotFoundException unused) {
            return new A(context);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static File m4084(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static long m4090(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m4092(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static <T> T m4085(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m4094(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static byte[] m4098(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[C0872.f5653];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m4095(InputStream inputStream) {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12 || !"RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) || !"WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
            return false;
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m4081(Resources resources, C3617q qVar) {
        if (qVar.f3476 != 0 || qVar.f3474 == null) {
            return qVar.f3476;
        }
        String authority = qVar.f3474.getAuthority();
        if (authority != null) {
            List<String> pathSegments = qVar.f3474.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(qVar.f3474);
                throw new FileNotFoundException(sb.toString());
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(qVar.f3474);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(qVar.f3474);
                throw new FileNotFoundException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder("No package provided: ");
            sb4.append(qVar.f3474);
            throw new FileNotFoundException(sb4.toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static Resources m4091(Context context, C3617q qVar) {
        if (qVar.f3476 != 0 || qVar.f3474 == null) {
            return context.getResources();
        }
        String authority = qVar.f3474.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(qVar.f3474);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(qVar.f3474);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m4087(Looper looper) {
        AnonymousClass1 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    /* renamed from: o.z$if  reason: invalid class name */
    static class Cif implements ThreadFactory {
        Cif() {
        }

        public final Thread newThread(Runnable runnable) {
            return new If(runnable);
        }
    }

    /* renamed from: o.z$If */
    static class If extends Thread {
        public If(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    @TargetApi(12)
    /* renamed from: o.z$ı  reason: contains not printable characters */
    public static class C0277 implements C3149 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C0278 f3518;

        public C0277(C0278 r1) {
            this.f3518 = r1;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4099(C0329 r2) {
            this.f3518.f3520.f14555.m6087(null);
        }
    }

    /* renamed from: o.z$ǃ  reason: contains not printable characters */
    public static class C0278 {

        /* renamed from: ı  reason: contains not printable characters */
        public final Intent f3519;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C3203<Void> f3520 = new C3203<>();

        public C0278(Intent intent) {
            this.f3519 = intent;
        }
    }

    @TargetApi(11)
    /* renamed from: o.z$ɩ  reason: contains not printable characters */
    public static class C0279 {

        /* renamed from: ı  reason: contains not printable characters */
        private int f3521 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C1881 f3522;

        /* renamed from: ι  reason: contains not printable characters */
        private final Map<Integer, C3203<Void>> f3523 = new C0299();

        public C0279(C1881 r2) {
            this.f3522 = r2;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final synchronized boolean m4103() {
            return m4100() != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r2 = r4.f3523.remove(java.lang.Integer.valueOf(r4.f3521));
            m4102(r0);
            r4.f3521++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
            if (r2 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
            r2.f14555.m6079(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (m4101(r5, r0) != false) goto L_0x0016;
         */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean m4104(com.google.firebase.iid.FirebaseInstanceId r5) {
            /*
                r4 = this;
            L_0x0000:
                monitor-enter(r4)
                java.lang.String r0 = r4.m4100()     // Catch:{ all -> 0x003a }
                r1 = 1
                if (r0 != 0) goto L_0x000d
                com.google.firebase.iid.FirebaseInstanceId.m1108()     // Catch:{ all -> 0x003a }
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                return r1
            L_0x000d:
                monitor-exit(r4)
                boolean r2 = m4101(r5, r0)
                if (r2 != 0) goto L_0x0016
                r5 = 0
                return r5
            L_0x0016:
                monitor-enter(r4)
                java.util.Map<java.lang.Integer, o.ւɹ<java.lang.Void>> r2 = r4.f3523     // Catch:{ all -> 0x0037 }
                int r3 = r4.f3521     // Catch:{ all -> 0x0037 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0037 }
                java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0037 }
                o.ւɹ r2 = (o.C3203) r2     // Catch:{ all -> 0x0037 }
                r4.m4102(r0)     // Catch:{ all -> 0x0037 }
                int r0 = r4.f3521     // Catch:{ all -> 0x0037 }
                int r0 = r0 + r1
                r4.f3521 = r0     // Catch:{ all -> 0x0037 }
                monitor-exit(r4)     // Catch:{ all -> 0x0037 }
                if (r2 == 0) goto L_0x0000
                o.ƨɹ<TResult> r0 = r2.f14555
                r1 = 0
                r0.m6079(r1)
                goto L_0x0000
            L_0x0037:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x003a:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3626z.C0279.m4104(com.google.firebase.iid.FirebaseInstanceId):boolean");
        }

        /* renamed from: ı  reason: contains not printable characters */
        private String m4100() {
            String r1;
            synchronized (this.f3522) {
                r1 = this.f3522.m10281();
            }
            if (TextUtils.isEmpty(r1)) {
                return null;
            }
            String[] split = r1.split(",");
            if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
                return null;
            }
            return split[1];
        }

        /* renamed from: ı  reason: contains not printable characters */
        private synchronized boolean m4102(String str) {
            synchronized (this.f3522) {
                String r1 = this.f3522.m10281();
                String valueOf = String.valueOf(str);
                if (!r1.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                    return false;
                }
                String valueOf2 = String.valueOf(str);
                this.f3522.m10283(r1.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d9 A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010e A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x010f A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0114 A[Catch:{ IOException -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0170 A[Catch:{ IOException -> 0x0176 }] */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m4101(com.google.firebase.iid.FirebaseInstanceId r14, java.lang.String r15) {
            /*
                java.lang.String r0 = "!"
                java.lang.String[] r15 = r15.split(r0)
                int r0 = r15.length
                r1 = 1
                r2 = 2
                if (r0 != r2) goto L_0x019c
                r0 = 0
                r2 = r15[r0]
                r15 = r15[r1]
                r3 = -1
                int r4 = r2.hashCode()     // Catch:{ IOException -> 0x0176 }
                r5 = 83
                if (r4 == r5) goto L_0x0028
                r5 = 85
                if (r4 == r5) goto L_0x001e
                goto L_0x0031
            L_0x001e:
                java.lang.String r4 = "U"
                boolean r2 = r2.equals(r4)     // Catch:{ IOException -> 0x0176 }
                if (r2 == 0) goto L_0x0031
                r3 = 1
                goto L_0x0031
            L_0x0028:
                java.lang.String r4 = "S"
                boolean r2 = r2.equals(r4)     // Catch:{ IOException -> 0x0176 }
                if (r2 == 0) goto L_0x0031
                r3 = 0
            L_0x0031:
                java.lang.String r2 = "gcm.topic"
                java.lang.String r4 = "token not available"
                java.lang.String r5 = ""
                java.lang.String r6 = "*"
                java.lang.String r7 = "/topics/"
                if (r3 == 0) goto L_0x00df
                if (r3 == r1) goto L_0x0041
                goto L_0x019c
            L_0x0041:
                com.google.firebase.FirebaseApp r3 = r14.f983     // Catch:{ IOException -> 0x0176 }
                java.lang.String r3 = o.C1799.m9976(r3)     // Catch:{ IOException -> 0x0176 }
                o.Ιя r8 = com.google.firebase.iid.FirebaseInstanceId.f978     // Catch:{ IOException -> 0x0176 }
                o.ΣІ r3 = r8.m10280(r5, r3, r6)     // Catch:{ IOException -> 0x0176 }
                if (r3 == 0) goto L_0x0073
                o.ΙƩ r5 = r14.f981     // Catch:{ IOException -> 0x0176 }
                java.lang.String r5 = r5.m9978()     // Catch:{ IOException -> 0x0176 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0176 }
                long r10 = r3.f9676     // Catch:{ IOException -> 0x0176 }
                long r12 = o.C1918.f9675     // Catch:{ IOException -> 0x0176 }
                long r10 = r10 + r12
                int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r6 > 0) goto L_0x006d
                java.lang.String r6 = r3.f9677     // Catch:{ IOException -> 0x0176 }
                boolean r5 = r5.equals(r6)     // Catch:{ IOException -> 0x0176 }
                if (r5 != 0) goto L_0x006b
                goto L_0x006d
            L_0x006b:
                r5 = 0
                goto L_0x006e
            L_0x006d:
                r5 = 1
            L_0x006e:
                if (r5 == 0) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                r5 = 0
                goto L_0x0074
            L_0x0073:
                r5 = 1
            L_0x0074:
                if (r5 != 0) goto L_0x00d9
                java.lang.String r4 = r14.m1118()     // Catch:{ IOException -> 0x0176 }
                o.вɩ r5 = r14.f988     // Catch:{ IOException -> 0x0176 }
                java.lang.String r3 = r3.f9678     // Catch:{ IOException -> 0x0176 }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ IOException -> 0x0176 }
                r6.<init>()     // Catch:{ IOException -> 0x0176 }
                java.lang.String r8 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0176 }
                int r9 = r8.length()     // Catch:{ IOException -> 0x0176 }
                if (r9 == 0) goto L_0x0092
                java.lang.String r8 = r7.concat(r8)     // Catch:{ IOException -> 0x0176 }
                goto L_0x0097
            L_0x0092:
                java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x0176 }
                r8.<init>(r7)     // Catch:{ IOException -> 0x0176 }
            L_0x0097:
                r6.putString(r2, r8)     // Catch:{ IOException -> 0x0176 }
                java.lang.String r2 = "delete"
                java.lang.String r8 = "1"
                r6.putString(r2, r8)     // Catch:{ IOException -> 0x0176 }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0176 }
                int r2 = r15.length()     // Catch:{ IOException -> 0x0176 }
                if (r2 == 0) goto L_0x00b0
                java.lang.String r15 = r7.concat(r15)     // Catch:{ IOException -> 0x0176 }
                goto L_0x00b5
            L_0x00b0:
                java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x0176 }
                r15.<init>(r7)     // Catch:{ IOException -> 0x0176 }
            L_0x00b5:
                o.ıə r15 = r5.m12423(r4, r3, r15, r6)     // Catch:{ IOException -> 0x0176 }
                java.util.concurrent.Executor r2 = r5.f10962     // Catch:{ IOException -> 0x0176 }
                o.ӀƩ r3 = new o.ӀƩ     // Catch:{ IOException -> 0x0176 }
                r3.<init>()     // Catch:{ IOException -> 0x0176 }
                o.ıə r15 = r15.m4418((java.util.concurrent.Executor) r2, r3)     // Catch:{ IOException -> 0x0176 }
                java.util.concurrent.Executor r2 = o.C2324.m12102()     // Catch:{ IOException -> 0x0176 }
                o.О r3 = new o.О     // Catch:{ IOException -> 0x0176 }
                r3.<init>()     // Catch:{ IOException -> 0x0176 }
                o.ıə r15 = r15.m4418((java.util.concurrent.Executor) r2, r3)     // Catch:{ IOException -> 0x0176 }
                r14.m1114(r15)     // Catch:{ IOException -> 0x0176 }
                com.google.firebase.iid.FirebaseInstanceId.m1108()     // Catch:{ IOException -> 0x0176 }
                goto L_0x019c
            L_0x00d9:
                java.io.IOException r14 = new java.io.IOException     // Catch:{ IOException -> 0x0176 }
                r14.<init>(r4)     // Catch:{ IOException -> 0x0176 }
                throw r14     // Catch:{ IOException -> 0x0176 }
            L_0x00df:
                com.google.firebase.FirebaseApp r3 = r14.f983     // Catch:{ IOException -> 0x0176 }
                java.lang.String r3 = o.C1799.m9976(r3)     // Catch:{ IOException -> 0x0176 }
                o.Ιя r8 = com.google.firebase.iid.FirebaseInstanceId.f978     // Catch:{ IOException -> 0x0176 }
                o.ΣІ r3 = r8.m10280(r5, r3, r6)     // Catch:{ IOException -> 0x0176 }
                if (r3 == 0) goto L_0x0111
                o.ΙƩ r5 = r14.f981     // Catch:{ IOException -> 0x0176 }
                java.lang.String r5 = r5.m9978()     // Catch:{ IOException -> 0x0176 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0176 }
                long r10 = r3.f9676     // Catch:{ IOException -> 0x0176 }
                long r12 = o.C1918.f9675     // Catch:{ IOException -> 0x0176 }
                long r10 = r10 + r12
                int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r6 > 0) goto L_0x010b
                java.lang.String r6 = r3.f9677     // Catch:{ IOException -> 0x0176 }
                boolean r5 = r5.equals(r6)     // Catch:{ IOException -> 0x0176 }
                if (r5 != 0) goto L_0x0109
                goto L_0x010b
            L_0x0109:
                r5 = 0
                goto L_0x010c
            L_0x010b:
                r5 = 1
            L_0x010c:
                if (r5 == 0) goto L_0x010f
                goto L_0x0111
            L_0x010f:
                r5 = 0
                goto L_0x0112
            L_0x0111:
                r5 = 1
            L_0x0112:
                if (r5 != 0) goto L_0x0170
                java.lang.String r4 = r14.m1118()     // Catch:{ IOException -> 0x0176 }
                java.lang.String r3 = r3.f9678     // Catch:{ IOException -> 0x0176 }
                o.вɩ r5 = r14.f988     // Catch:{ IOException -> 0x0176 }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ IOException -> 0x0176 }
                r6.<init>()     // Catch:{ IOException -> 0x0176 }
                java.lang.String r8 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0176 }
                int r9 = r8.length()     // Catch:{ IOException -> 0x0176 }
                if (r9 == 0) goto L_0x0130
                java.lang.String r8 = r7.concat(r8)     // Catch:{ IOException -> 0x0176 }
                goto L_0x0135
            L_0x0130:
                java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x0176 }
                r8.<init>(r7)     // Catch:{ IOException -> 0x0176 }
            L_0x0135:
                r6.putString(r2, r8)     // Catch:{ IOException -> 0x0176 }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0176 }
                int r2 = r15.length()     // Catch:{ IOException -> 0x0176 }
                if (r2 == 0) goto L_0x0147
                java.lang.String r15 = r7.concat(r15)     // Catch:{ IOException -> 0x0176 }
                goto L_0x014c
            L_0x0147:
                java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x0176 }
                r15.<init>(r7)     // Catch:{ IOException -> 0x0176 }
            L_0x014c:
                o.ıə r15 = r5.m12423(r4, r3, r15, r6)     // Catch:{ IOException -> 0x0176 }
                java.util.concurrent.Executor r2 = r5.f10962     // Catch:{ IOException -> 0x0176 }
                o.ӀƩ r3 = new o.ӀƩ     // Catch:{ IOException -> 0x0176 }
                r3.<init>()     // Catch:{ IOException -> 0x0176 }
                o.ıə r15 = r15.m4418((java.util.concurrent.Executor) r2, r3)     // Catch:{ IOException -> 0x0176 }
                java.util.concurrent.Executor r2 = o.C2324.m12102()     // Catch:{ IOException -> 0x0176 }
                o.О r3 = new o.О     // Catch:{ IOException -> 0x0176 }
                r3.<init>()     // Catch:{ IOException -> 0x0176 }
                o.ıə r15 = r15.m4418((java.util.concurrent.Executor) r2, r3)     // Catch:{ IOException -> 0x0176 }
                r14.m1114(r15)     // Catch:{ IOException -> 0x0176 }
                boolean r14 = com.google.firebase.iid.FirebaseInstanceId.m1108()     // Catch:{ IOException -> 0x0176 }
                goto L_0x019c
            L_0x0170:
                java.io.IOException r14 = new java.io.IOException     // Catch:{ IOException -> 0x0176 }
                r14.<init>(r4)     // Catch:{ IOException -> 0x0176 }
                throw r14     // Catch:{ IOException -> 0x0176 }
            L_0x0176:
                r14 = move-exception
                java.lang.String r15 = r14.getMessage()
                java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
                boolean r15 = r1.equals(r15)
                if (r15 != 0) goto L_0x0198
                java.lang.String r15 = r14.getMessage()
                java.lang.String r1 = "INTERNAL_SERVER_ERROR"
                boolean r15 = r1.equals(r15)
                if (r15 == 0) goto L_0x0190
                goto L_0x0198
            L_0x0190:
                java.lang.String r15 = r14.getMessage()
                if (r15 != 0) goto L_0x0197
                return r0
            L_0x0197:
                throw r14
            L_0x0198:
                r14.getMessage()
                return r0
            L_0x019c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3626z.C0279.m4101(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m4097() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m4096(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return (memoryClass * 1048576) / 7;
    }
}
