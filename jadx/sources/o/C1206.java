package o;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.ɨȷ  reason: contains not printable characters */
final class C1206 {
    private C1206() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    static byte[] m7827(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] r2 = m7830((InputStream) fileInputStream);
                C3285aw.m1684((Closeable) fileInputStream);
                return r2;
            } catch (FileNotFoundException unused) {
                C3285aw.m1684((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                C3285aw.m1684((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C3285aw.m1684((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            C3285aw.m1684((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            C3285aw.m1684((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C3285aw.m1684((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static byte[] m7830(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static File m7835(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static byte[] m7832(File file) {
        File r1 = m7835(file, ".dmp");
        if (r1 == null) {
            return new byte[0];
        }
        return m7829(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static byte[] m7829(File file) {
        return m7827(file);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static byte[] m7836(File file, Context context) {
        File r0 = m7835(file, ".maps");
        if (r0 != null) {
            return m7828(r0, context);
        }
        File r1 = m7835(file, ".binary_libs");
        if (r1 != null) {
            return m7833(r1, context);
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static byte[] m7833(File file, Context context) {
        byte[] r1 = m7827(file);
        if (r1 == null || r1.length == 0) {
            return null;
        }
        return m7831(context, new String(r1));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static byte[] m7828(File file, Context context) {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] r3 = new C0776(context, new C1479()).m6103(bufferedReader);
                C3285aw.m1684((Closeable) bufferedReader);
                return r3;
            } catch (Throwable th) {
                th = th;
                C3285aw.m1684((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C3285aw.m1684((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static byte[] m7834(File file) {
        File r1 = m7835(file, ".device_info");
        if (r1 == null) {
            return null;
        }
        return m7827(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static byte[] m7831(Context context, String str) {
        return new C0776(context, new C1479()).m6104(str);
    }
}
