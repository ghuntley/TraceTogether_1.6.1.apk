package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ƌ  reason: contains not printable characters */
final class C0614 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ boolean f4577;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f4578;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f4579;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f4580;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f4581;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4582;

    C0614(C0305 r1, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f4582 = r1;
        this.f4580 = atomicReference;
        this.f4581 = str;
        this.f4579 = str2;
        this.f4578 = str3;
        this.f4577 = z;
    }

    public final void run() {
        this.f4582.f14314.m14093().m6383(this.f4580, this.f4581, this.f4579, this.f4578, this.f4577);
    }
}
