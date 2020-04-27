package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import o.C3491im;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\rJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "getLoadPriority", "()I", "Ι", "", "p0", "Lo/im;", "createDispatcher", "(Ljava/util/List;)Lo/im;", "", "hintOnError", "()Ljava/lang/String;", ""}, k = 1, mv = {1, 1, 15})
public interface MainDispatcherFactory {
    C3491im createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
