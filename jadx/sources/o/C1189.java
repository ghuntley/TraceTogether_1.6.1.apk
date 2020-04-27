package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o.ɨı  reason: contains not printable characters */
public class C1189 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static File m7728(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String obj = sb.toString();
        int i = 0;
        while (i < 100) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(i);
            File file = new File(cacheDir, sb2.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        throw r1;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer m7727(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0025 }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0019 }
            long r5 = r1.size()     // Catch:{ all -> 0x0019 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0019 }
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0019 }
            r0.close()     // Catch:{ IOException -> 0x0025 }
            return r7
        L_0x0019:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x001b }
        L_0x001b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch:{ IOException -> 0x0025 }
        L_0x0024:
            throw r1     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1189.m7727(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004a, code lost:
        throw r9;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m7729(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x004b }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x004b }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003f }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x003f }
            r8.<init>(r9)     // Catch:{ all -> 0x003f }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0033 }
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            r8.close()     // Catch:{ all -> 0x003f }
            r7.close()     // Catch:{ IOException -> 0x004b }
            return r9
        L_0x0033:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch:{ all -> 0x003f }
        L_0x003e:
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r9 = move-exception
            r7.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            throw r9     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1189.m7729(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ByteBuffer m7726(Context context, Resources resources, int i) {
        File r1 = m7728(context);
        if (r1 == null) {
            return null;
        }
        try {
            if (!m7731(r1, resources, i)) {
                return null;
            }
            ByteBuffer r2 = m7727(r1);
            r1.delete();
            return r2;
        } finally {
            r1.delete();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m7730(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m7732(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    e.getMessage();
                    m7732(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m7732(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m7732(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            e.getMessage();
            m7732(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m7731(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean r0 = m7730(file, inputStream);
                m7732(inputStream);
                return r0;
            } catch (Throwable th) {
                th = th;
                m7732(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m7732(inputStream);
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m7732(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
