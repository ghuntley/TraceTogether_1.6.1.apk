package o;

import android.app.Activity;
import android.os.Build;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import o.C0993;
import o.C0993.C0994;

/* renamed from: o.ιϫ  reason: contains not printable characters */
public final class C2038<ListenerTypeT, ResultT extends C0993.C0994> {

    /* renamed from: ı  reason: contains not printable characters */
    public Cif<ListenerTypeT, ResultT> f10070;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final HashMap<ListenerTypeT, C1498> f10071 = new HashMap<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f10072;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0993<ResultT> f10073;

    /* renamed from: ι  reason: contains not printable characters */
    public final Queue<ListenerTypeT> f10074 = new ConcurrentLinkedQueue();

    /* renamed from: o.ιϫ$if  reason: invalid class name */
    public interface Cif<ListenerTypeT, ResultT> {
        /* renamed from: ı  reason: contains not printable characters */
        void m10912(ListenerTypeT listenertypet, ResultT resultt);
    }

    public C2038(C0993<ResultT> r2, int i, Cif<ListenerTypeT, ResultT> ifVar) {
        this.f10073 = r2;
        this.f10072 = i;
        this.f10070 = ifVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10911(Activity activity, Executor executor, ListenerTypeT listenertypet) {
        boolean z;
        C1498 r4;
        if (listenertypet != null) {
            synchronized (this.f10073.f6039) {
                boolean z2 = true;
                z = (this.f10073.f6041 & this.f10072) != 0;
                this.f10074.add(listenertypet);
                r4 = new C1498(executor);
                this.f10071.put(listenertypet, r4);
                if (activity != null) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        if (activity.isDestroyed()) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException("Activity is already destroyed!");
                        }
                    }
                    C2378.m12371().m12372(activity, listenertypet, new nj(this, listenertypet));
                }
            }
            if (z) {
                r4.m8917((Runnable) new C3312bw(this, listenertypet, this.f10073.m7074()));
                return;
            }
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10910() {
        if ((this.f10073.f6041 & this.f10072) != 0) {
            ResultT r0 = this.f10073.m7074();
            for (Object next : this.f10074) {
                C1498 r3 = this.f10071.get(next);
                if (r3 != null) {
                    r3.m8917((Runnable) new C3314by(this, next, r0));
                }
            }
        }
    }
}
