package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u00020\u00048\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/iX;", "", "ı", "Z", "Lo/im;", "ι", "Lo/im;", "Ι", "()Lo/im;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public final class iX {

    /* renamed from: ı  reason: contains not printable characters */
    private static final boolean f2359 = C3511jf.m3073("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: Ι  reason: contains not printable characters */
    public static final iX f2360;

    /* renamed from: ι  reason: contains not printable characters */
    public static final C3491im f2361;

    static {
        iX iXVar = new iX();
        f2360 = iXVar;
        f2361 = iXVar.m2663();
    }

    private iX() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final C3491im m2663() {
        List<S> list;
        Object obj;
        C3491im r2;
        try {
            if (f2359) {
                Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
                iM iMVar = iM.f2335;
                ClassLoader classLoader = cls.getClassLoader();
                fM.m2252((Object) classLoader, "");
                list = iMVar.m2611(cls, classLoader);
            } else {
                Iterator<S> it = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
                fM.m2252((Object) it, "");
                list = C3450gy.m2319(C3450gy.m2307(it));
            }
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                obj = it2.next();
                if (it2.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    do {
                        Object next = it2.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it2.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory == null || (r2 = iW.m2662(mainDispatcherFactory, list)) == null) {
                return new iU((Throwable) null, (String) null, 2, (fL) null);
            }
            return r2;
        } catch (Throwable th) {
            return new iU(th, (String) null, 2, (fL) null);
        }
    }
}
