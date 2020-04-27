package o;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;

/* renamed from: o.хІ  reason: contains not printable characters */
public final class C2494 implements M<C2606> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3351dc<C2572> f11294;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3351dc<C2602> f11295;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3351dc<C2693> f11296;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3351dc<Context> f11297;

    public C2494(C3351dc<Context> dcVar, C3351dc<C2602> dcVar2, C3351dc<C2572> dcVar3, C3351dc<C2693> dcVar4) {
        this.f11297 = dcVar;
        this.f11295 = dcVar2;
        this.f11294 = dcVar3;
        this.f11296 = dcVar4;
    }

    public final /* synthetic */ Object get() {
        C2606 r0 = SchedulingModule.m734(this.f11297.get(), this.f11295.get(), this.f11294.get(), this.f11296.get());
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
