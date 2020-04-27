package zendesk.support;

import java.io.IOException;
import java.lang.reflect.Type;
import o.C2864;
import o.C3122;
import o.C3162;
import o.F;
import o.jP;
import zendesk.support.Streams;

public class SupportUiStorage {
    /* access modifiers changed from: private */
    public final C3122 gson;
    private final C3162 storage;

    public SupportUiStorage(C3162 r1, C3122 r2) {
        this.storage = r1;
        this.gson = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        abortEdit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 0
            o.յլ r1 = r3.storage     // Catch:{ IOException -> 0x0026 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0026 }
            o.յլ r2 = r3.storage     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = key(r4)     // Catch:{ all -> 0x0023 }
            o.յլ$if r0 = r2.m16000((java.lang.String) r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0022
            r4 = 0
            java.io.OutputStream r4 = r0.m16005((int) r4)     // Catch:{ IOException -> 0x0026 }
            o.jZ r4 = o.jP.m2977((java.io.OutputStream) r4)     // Catch:{ IOException -> 0x0026 }
            o.լј r1 = r3.gson     // Catch:{ IOException -> 0x0026 }
            zendesk.support.Streams.toJson(r1, r4, r5)     // Catch:{ IOException -> 0x0026 }
            r0.m16006()     // Catch:{ IOException -> 0x0026 }
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0026 }
            throw r4     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            abortEdit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.SupportUiStorage.write(java.lang.String, java.lang.Object):void");
    }

    public <E> E read(String str, final Type type) {
        E use;
        try {
            synchronized (this.storage) {
                use = Streams.use(this.storage.m15999(key(str)), new Streams.Use<E, C3162.C3165>() {
                    public E use(C3162.C3165 r3) {
                        return SupportUiStorage.this.gson.m15831(Streams.toReader(jP.m2974(r3.f14411[0])), type);
                    }
                });
            }
            return use;
        } catch (IOException unused) {
            F.m1361();
            return null;
        }
    }

    private static String key(String str) {
        return C2864.C2866.m14866(str);
    }

    private static void abortEdit(C3162.Cif ifVar) {
        F.m1361();
        if (ifVar != null) {
            try {
                C3162.this.m15996(ifVar, false);
            } catch (IOException unused) {
                F.m1356();
            }
        }
    }
}
