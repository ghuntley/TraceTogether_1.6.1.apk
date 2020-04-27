package o;

import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* renamed from: o.ʬı  reason: contains not printable characters */
public final class C1700 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ FirebaseAuth f8878;

    public C1700() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1367 m9668(Reader reader) {
        try {
            C0995 r0 = new C0995(reader);
            C1367 r2 = m9669(r0);
            if (!(r2 instanceof C0875)) {
                if (r0.m7095() != C0313.END_DOCUMENT) {
                    throw new C1701("Did not consume the entire document.");
                }
            }
            return r2;
        } catch (C3217 e) {
            throw new C1701((Throwable) e);
        } catch (IOException e2) {
            throw new C1169((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new C1701((Throwable) e3);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C1367 m9669(C0995 r6) {
        boolean z = r6.f6050;
        r6.f6050 = true;
        try {
            C1367 r0 = C2036.m10907(r6);
            r6.f6050 = z;
            return r0;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder("Failed parsing JSON source: ");
            sb.append(r6);
            sb.append(" to Json");
            throw new C0436(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder("Failed parsing JSON source: ");
            sb2.append(r6);
            sb2.append(" to Json");
            throw new C0436(sb2.toString(), e2);
        } catch (Throwable th) {
            r6.f6050 = z;
            throw th;
        }
    }

    public C1700(FirebaseAuth firebaseAuth) {
        this.f8878 = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f8878.f963.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = this.f8878.f961.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
