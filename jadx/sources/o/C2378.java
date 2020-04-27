package o;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.Ы  reason: contains not printable characters */
public final class C2378 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2378 f10902 = new C2378();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<Object, C2379> f10903 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f10904 = new Object();

    private C2378() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2378 m12371() {
        return f10902;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12372(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f10904) {
            C2379 r1 = new C2379(activity, runnable, obj);
            If r3 = If.m12374(activity);
            synchronized (r3.f10905) {
                r3.f10905.add(r1);
            }
            this.f10903.put(obj, r1);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12373(Object obj) {
        synchronized (this.f10904) {
            C2379 r4 = this.f10903.get(obj);
            if (r4 != null) {
                If r1 = If.m12374(r4.f10906);
                synchronized (r1.f10905) {
                    r1.f10905.remove(r4);
                }
            }
        }
    }

    /* renamed from: o.Ы$ı  reason: contains not printable characters */
    static class C2379 {

        /* renamed from: ı  reason: contains not printable characters */
        final Activity f10906;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Object f10907;

        /* renamed from: ι  reason: contains not printable characters */
        final Runnable f10908;

        public C2379(Activity activity, Runnable runnable, Object obj) {
            this.f10906 = activity;
            this.f10908 = runnable;
            this.f10907 = obj;
        }

        public final int hashCode() {
            return this.f10907.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2379)) {
                return false;
            }
            C2379 r4 = (C2379) obj;
            if (r4.f10907.equals(this.f10907) && r4.f10908 == this.f10908 && r4.f10906 == this.f10906) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Ы$If */
    static class If extends LifecycleCallback {

        /* renamed from: ǃ  reason: contains not printable characters */
        final List<C2379> f10905 = new ArrayList();

        private If(C0485 r2) {
            super(r2);
            this.f555.m4844("StorageOnStopCallback", this);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static If m12374(Activity activity) {
            C0485 r2 = m765(new C0502(activity));
            If ifR = (If) r2.m4845("StorageOnStopCallback", If.class);
            return ifR == null ? new If(r2) : ifR;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m12375() {
            ArrayList arrayList;
            synchronized (this.f10905) {
                arrayList = new ArrayList(this.f10905);
                this.f10905.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2379 r1 = (C2379) it.next();
                if (r1 != null) {
                    r1.f10908.run();
                    C2378.m12371().m12373(r1.f10907);
                }
            }
        }
    }
}
