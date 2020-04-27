package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ıɔ  reason: contains not printable characters */
public abstract class C0326 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private volatile boolean f3671 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, Object> f3672 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    public void m4397() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m4395() {
        this.f3671 = true;
        Map<String, Object> map = this.f3672;
        if (map != null) {
            synchronized (map) {
                for (Object r2 : this.f3672.values()) {
                    m4393(r2);
                }
            }
        }
        m4397();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public <T> T m4396(String str, T t) {
        T t2;
        synchronized (this.f3672) {
            t2 = this.f3672.get(str);
            if (t2 == null) {
                this.f3672.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f3671) {
            m4393((Object) t);
        }
        return t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public <T> T m4394(String str) {
        T t;
        Map<String, Object> map = this.f3672;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3672.get(str);
        }
        return t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m4393(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
