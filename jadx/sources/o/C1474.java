package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ɹӏ  reason: contains not printable characters */
public abstract class C1474 {

    /* renamed from: ı  reason: contains not printable characters */
    public final AtomicBoolean f7910 = new AtomicBoolean(false);

    /* renamed from: ɩ  reason: contains not printable characters */
    public volatile C1647 f7911;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1242 f7912;

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m8841();

    public C1474(C1242 r3) {
        this.f7912 = r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1647 m8840() {
        this.f7912.m8024();
        if (this.f7910.compareAndSet(false, true)) {
            if (this.f7911 == null) {
                this.f7911 = this.f7912.m8021(m8841());
            }
            return this.f7911;
        }
        return this.f7912.m8021(m8841());
    }
}
