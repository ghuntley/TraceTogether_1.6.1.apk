package o;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "p0", "Lo/im;", "ǃ", "(Lkotlinx/coroutines/internal/MainDispatcherFactory;Ljava/util/List;)Lo/im;"}, k = 2, mv = {1, 1, 15})
public final class iW {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3491im m2662(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        fM.m2254(mainDispatcherFactory, "");
        fM.m2254(list, "");
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new iU(th, mainDispatcherFactory.hintOnError());
        }
    }
}
