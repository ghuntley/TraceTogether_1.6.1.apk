package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import o.fM;
import o.iA;
import o.iB;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0006B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00018V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "", "getLoadPriority", "()I", "loadPriority", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "p0", "Lo/iA;", "createDispatcher", "(Ljava/util/List;)Lo/iA;", "", "hintOnError", "()Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 1, 15})
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public final int getLoadPriority() {
        return 1073741823;
    }

    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public final iA createDispatcher(List<? extends MainDispatcherFactory> list) {
        fM.m2254(list, "");
        Looper mainLooper = Looper.getMainLooper();
        fM.m2252((Object) mainLooper, "");
        return new iA(iB.m2566(mainLooper, true), "Main");
    }
}
