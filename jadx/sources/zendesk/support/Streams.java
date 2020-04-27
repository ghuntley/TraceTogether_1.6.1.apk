package zendesk.support;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import o.C0815;
import o.C0875;
import o.C1169;
import o.C1367;
import o.C2036;
import o.C3122;
import o.jI;
import o.jK;
import o.jP;
import o.jY;
import o.jZ;

public class Streams {

    public interface Use<R, P extends Closeable> {
        R use(P p);
    }

    public static Reader toReader(jY jYVar) {
        if (jYVar instanceof jI) {
            return new InputStreamReader(((jI) jYVar).m2906());
        }
        return new InputStreamReader(jP.m2972(jYVar).m2906());
    }

    public static Writer toWriter(jZ jZVar) {
        if (jZVar instanceof jK) {
            return new OutputStreamWriter(((jK) jZVar).m2931());
        }
        return new OutputStreamWriter(jP.m2979(jZVar).m2931());
    }

    public static void toJson(final C3122 r1, jZ jZVar, final Object obj) {
        use(toWriter(jZVar), new Use<Void, Writer>() {
            public final Void use(Writer writer) {
                C3122 r0 = r1;
                Object obj = obj;
                if (obj != null) {
                    r0.m15833(obj, obj.getClass(), writer);
                    return null;
                }
                C0875 r1 = C0875.f5659;
                try {
                    C0815 r2 = new C0815(writer instanceof Writer ? writer : new C2036.C2037(writer));
                    r2.f5316 = false;
                    r0.m15835((C1367) r1, r2);
                    return null;
                } catch (IOException e) {
                    throw new C1169((Throwable) e);
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        closeQuietly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        o.F.m1362();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <R, P extends java.io.Closeable> R use(P r1, zendesk.support.Streams.Use<R, P> r2) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Object r2 = r2.use(r1)     // Catch:{ Exception -> 0x000e }
            closeQuietly(r1)
            return r2
        L_0x000c:
            r2 = move-exception
            goto L_0x0015
        L_0x000e:
            o.F.m1362()     // Catch:{ all -> 0x000c }
            closeQuietly(r1)
            return r0
        L_0x0015:
            closeQuietly(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.Streams.use(java.io.Closeable, zendesk.support.Streams$Use):java.lang.Object");
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
