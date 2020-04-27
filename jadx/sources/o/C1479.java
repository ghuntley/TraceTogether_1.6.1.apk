package o;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import o.C0776;

/* renamed from: o.ɺІ  reason: contains not printable characters */
class C1479 implements C0776.C0777 {
    C1479() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m8852(File file) {
        return m8851(file.getPath());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m8851(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String r3 = C3285aw.m1661((InputStream) bufferedInputStream2);
                C3285aw.m1684((Closeable) bufferedInputStream2);
                return r3;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C3285aw.m1684((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3285aw.m1684((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
