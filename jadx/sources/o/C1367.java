package o;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: o.ɪʙ  reason: contains not printable characters */
public abstract class C1367 {
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m8485() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Number m8484() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public String m8483() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0815 r1 = new C0815(stringWriter);
            r1.f5313 = true;
            C2700.f12467.m15435(r1, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
