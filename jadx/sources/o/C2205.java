package o;

import com.google.android.datatransport.runtime.ExecutionModule;
import java.util.concurrent.Executor;

/* renamed from: o.Ͻ  reason: contains not printable characters */
public final class C2205 implements M<Executor> {

    /* renamed from: Ι  reason: contains not printable characters */
    static final C2205 f10455 = new C2205();

    public final /* synthetic */ Object get() {
        Executor r0 = ExecutionModule.m732();
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
