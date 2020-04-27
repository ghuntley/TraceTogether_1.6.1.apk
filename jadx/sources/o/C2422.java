package o;

import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;

/* renamed from: o.е  reason: contains not printable characters */
public final class C2422 implements M<C2572> {

    /* renamed from: ι  reason: contains not printable characters */
    private final C3351dc<C2693> f11021;

    public C2422(C3351dc<C2693> dcVar) {
        this.f11021 = dcVar;
    }

    public final /* synthetic */ Object get() {
        C2572 r0 = SchedulingConfigModule.m733(this.f11021.get());
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
