package o;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;

/* renamed from: o.јі  reason: contains not printable characters */
public final class C2628 implements M<C2599> {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C2628 f11968 = new C2628();

    public final /* synthetic */ Object get() {
        C2599 r0 = EventStoreModule.m736();
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
