package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.Ιɂ  reason: contains not printable characters */
public final class C1809 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Logger f9262 = Logger.getLogger(C1809.class.getName());

    private C1809() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m10007(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f9262.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
