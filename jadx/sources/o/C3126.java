package o;

import android.graphics.Bitmap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import o.C3616p;

/* renamed from: o.լլ  reason: contains not printable characters */
abstract class C3126<T> {

    /* renamed from: ı  reason: contains not printable characters */
    final String f14261;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f14262;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C3617q f14263;

    /* renamed from: ɩ  reason: contains not printable characters */
    final boolean f14264;

    /* renamed from: Ι  reason: contains not printable characters */
    final WeakReference<T> f14265;

    /* renamed from: ι  reason: contains not printable characters */
    final C3616p f14266;

    /* renamed from: і  reason: contains not printable characters */
    final Object f14267;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f14268;

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m15856();

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m15858(Bitmap bitmap, C3616p.C0272 r2);

    /* renamed from: o.լլ$ɩ  reason: contains not printable characters */
    static class C3127<M> extends WeakReference<M> {

        /* renamed from: ɩ  reason: contains not printable characters */
        final C3126 f14269;

        public C3127(C3126 r1, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f14269 = r1;
        }
    }

    C3126(C3616p pVar, T t, C3617q qVar, String str, boolean z) {
        C3127 r1;
        this.f14266 = pVar;
        this.f14263 = qVar;
        if (t == null) {
            r1 = null;
        } else {
            r1 = new C3127(this, t, pVar.f3443);
        }
        this.f14265 = r1;
        this.f14264 = z;
        this.f14261 = str;
        this.f14267 = this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m15857() {
        this.f14268 = true;
    }
}
