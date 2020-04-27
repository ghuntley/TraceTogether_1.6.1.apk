package o;

import com.google.android.datatransport.runtime.time.TimeModule;

/* renamed from: o.ң  reason: contains not printable characters */
public final class C2711 implements M<C2693> {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2711 f12538 = new C2711();

    public final /* synthetic */ Object get() {
        C2693 r0 = TimeModule.m741();
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
