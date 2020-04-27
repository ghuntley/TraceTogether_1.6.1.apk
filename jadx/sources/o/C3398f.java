package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import o.C3478i;
import o.C3616p;

/* renamed from: o.f  reason: case insensitive filesystem */
final class C3398f {

    /* renamed from: ı  reason: contains not printable characters */
    final Map<String, C2666> f2137;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final Handler f2138;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Set<Object> f2139;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f2140;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C0172 f2141;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C3348d f2142;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C3622v f2143;

    /* renamed from: ɹ  reason: contains not printable characters */
    final Handler f2144;

    /* renamed from: ɾ  reason: contains not printable characters */
    private ExecutorService f2145;

    /* renamed from: Ι  reason: contains not printable characters */
    final Map<Object, C3126> f2146;

    /* renamed from: ι  reason: contains not printable characters */
    final Map<Object, C3126> f2147;

    /* renamed from: І  reason: contains not printable characters */
    final List<C2666> f2148;

    /* renamed from: і  reason: contains not printable characters */
    final C3259a f2149;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private If f2150 = new If();

    /* renamed from: ӏ  reason: contains not printable characters */
    private Context f2151;

    C3398f(Context context, ExecutorService executorService, Handler handler, C3348d dVar, C3259a aVar, C3622v vVar) {
        this.f2150.start();
        C3626z.m4087(this.f2150.getLooper());
        this.f2151 = context;
        this.f2145 = executorService;
        this.f2137 = new LinkedHashMap();
        this.f2146 = new WeakHashMap();
        this.f2147 = new WeakHashMap();
        this.f2139 = new HashSet();
        this.f2144 = new C0171(this.f2150.getLooper(), this);
        this.f2142 = dVar;
        this.f2138 = handler;
        this.f2149 = aVar;
        this.f2143 = vVar;
        this.f2148 = new ArrayList(4);
        C3626z.m4092(this.f2151);
        this.f2140 = C3626z.m4094(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f2141 = new C0172(this);
        C0172 r2 = this.f2141;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (r2.f2154.f2140) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        r2.f2154.f2151.registerReceiver(r2, intentFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m2234(C3126 r5, boolean z) {
        T t = null;
        if (this.f2139.contains(r5.f14267)) {
            Map<Object, C3126> map = this.f2147;
            if (r5.f14265 != null) {
                t = r5.f14265.get();
            }
            map.put(t, r5);
            boolean z2 = r5.f14266.f3452;
            return;
        }
        C2666 r0 = this.f2137.get(r5.f14261);
        if (r0 != null) {
            boolean z3 = r0.f12261.f3452;
            if (r0.f12279 == null) {
                r0.f12279 = r5;
                return;
            }
            if (r0.f12278 == null) {
                r0.f12278 = new ArrayList(3);
            }
            r0.f12278.add(r5);
            C3616p.Cif ifVar = r5.f14263.f3480;
            if (ifVar.ordinal() > r0.f12273.ordinal()) {
                r0.f12273 = ifVar;
            }
        } else if (this.f2145.isShutdown()) {
            boolean z4 = r5.f14266.f3452;
        } else {
            C2666 r02 = C2666.m14142(r5.f14266, this, this.f2149, this.f2143, r5);
            r02.f12277 = this.f2145.submit(r02);
            this.f2137.put(r5.f14261, r02);
            if (z) {
                Map<Object, C3126> map2 = this.f2146;
                if (r5.f14265 != null) {
                    t = r5.f14265.get();
                }
                map2.remove(t);
            }
            boolean z5 = r5.f14266.f3452;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m2235(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f2145;
        if (executorService instanceof C3584m) {
            C3584m mVar = (C3584m) executorService;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            mVar.setCorePoolSize(1);
                            mVar.setMaximumPoolSize(1);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            mVar.setCorePoolSize(2);
                            mVar.setMaximumPoolSize(2);
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    mVar.setCorePoolSize(3);
                                    mVar.setMaximumPoolSize(3);
                                    break;
                                default:
                                    mVar.setCorePoolSize(3);
                                    mVar.setMaximumPoolSize(3);
                                    break;
                            }
                            mVar.setCorePoolSize(2);
                            mVar.setMaximumPoolSize(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    mVar.setCorePoolSize(4);
                    mVar.setMaximumPoolSize(4);
                } else {
                    mVar.setCorePoolSize(3);
                    mVar.setMaximumPoolSize(3);
                }
            } else {
                mVar.setCorePoolSize(3);
                mVar.setMaximumPoolSize(3);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.f2146.isEmpty()) {
            Iterator<C3126> it = this.f2146.values().iterator();
            while (it.hasNext()) {
                C3126 next = it.next();
                it.remove();
                boolean z = next.f14266.f3452;
                m2234(next, false);
            }
        }
    }

    /* renamed from: o.f$ı  reason: contains not printable characters */
    static class C0171 extends Handler {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3398f f2152;

        public C0171(Looper looper, C3398f fVar) {
            super(looper);
            this.f2152 = fVar;
        }

        public final void handleMessage(final Message message) {
            T t = null;
            switch (message.what) {
                case 1:
                    this.f2152.m2234((C3126) message.obj, true);
                    return;
                case 2:
                    C3126 r12 = (C3126) message.obj;
                    C3398f fVar = this.f2152;
                    String str = r12.f14261;
                    C2666 r2 = fVar.f2137.get(str);
                    if (r2 != null) {
                        r2.m14145(r12);
                        if (r2.m14146()) {
                            fVar.f2137.remove(str);
                            boolean z = r12.f14266.f3452;
                        }
                    }
                    if (fVar.f2139.contains(r12.f14267)) {
                        fVar.f2147.remove(r12.f14265 == null ? null : r12.f14265.get());
                        boolean z2 = r12.f14266.f3452;
                    }
                    Map<Object, C3126> map = fVar.f2146;
                    if (r12.f14265 != null) {
                        t = r12.f14265.get();
                    }
                    C3126 remove = map.remove(t);
                    if (remove != null) {
                        boolean z3 = remove.f14266.f3452;
                        return;
                    }
                    return;
                case 4:
                    C2666 r122 = (C2666) message.obj;
                    C3398f fVar2 = this.f2152;
                    if (C3560l.m3363(0)) {
                        fVar2.f2149.m1445(r122.f12276, r122.f12265);
                    }
                    fVar2.f2137.remove(r122.f12276);
                    fVar2.m2237(r122);
                    boolean z4 = r122.f12261.f3452;
                    return;
                case 5:
                    this.f2152.m2236((C2666) message.obj);
                    return;
                case 6:
                    C2666 r123 = (C2666) message.obj;
                    C3398f fVar3 = this.f2152;
                    boolean z5 = r123.f12261.f3452;
                    fVar3.f2137.remove(r123.f12276);
                    fVar3.m2237(r123);
                    return;
                case 7:
                    C3398f fVar4 = this.f2152;
                    ArrayList arrayList = new ArrayList(fVar4.f2148);
                    fVar4.f2148.clear();
                    fVar4.f2138.sendMessage(fVar4.f2138.obtainMessage(8, arrayList));
                    if (!arrayList.isEmpty()) {
                        boolean z6 = ((C2666) arrayList.get(0)).f12261.f3452;
                        return;
                    }
                    return;
                case 9:
                    this.f2152.m2235((NetworkInfo) message.obj);
                    return;
                case 10:
                    int i = message.arg1;
                    return;
                case 11:
                    Object obj = message.obj;
                    C3398f fVar5 = this.f2152;
                    if (fVar5.f2139.add(obj)) {
                        Iterator<C2666> it = fVar5.f2137.values().iterator();
                        while (it.hasNext()) {
                            C2666 next = it.next();
                            boolean z7 = next.f12261.f3452;
                            C3126 r6 = next.f12279;
                            List<C3126> list = next.f12278;
                            boolean z8 = list != null && !list.isEmpty();
                            if (r6 != null || z8) {
                                if (r6 != null && r6.f14267.equals(obj)) {
                                    next.m14145(r6);
                                    fVar5.f2147.put(r6.f14265 == null ? null : r6.f14265.get(), r6);
                                }
                                if (z8) {
                                    for (int size = list.size() - 1; size >= 0; size--) {
                                        C3126 r8 = list.get(size);
                                        if (r8.f14267.equals(obj)) {
                                            next.m14145(r8);
                                            fVar5.f2147.put(r8.f14265 == null ? null : r8.f14265.get(), r8);
                                        }
                                    }
                                }
                                if (next.m14146()) {
                                    it.remove();
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    C3398f fVar6 = this.f2152;
                    if (fVar6.f2139.remove(obj2)) {
                        Iterator<C3126> it2 = fVar6.f2147.values().iterator();
                        while (it2.hasNext()) {
                            C3126 next2 = it2.next();
                            if (next2.f14267.equals(obj2)) {
                                if (t == null) {
                                    t = new ArrayList();
                                }
                                t.add(next2);
                                it2.remove();
                            }
                        }
                        if (t != null) {
                            fVar6.f2138.sendMessage(fVar6.f2138.obtainMessage(13, t));
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    C3616p.f3442.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }
    }

    /* renamed from: o.f$If */
    static class If extends HandlerThread {
        If() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: o.f$ǃ  reason: contains not printable characters */
    static class C0172 extends BroadcastReceiver {

        /* renamed from: ǃ  reason: contains not printable characters */
        final C3398f f2154;

        C0172(C3398f fVar) {
            this.f2154 = fVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        C3398f fVar = this.f2154;
                        fVar.f2144.sendMessage(fVar.f2144.obtainMessage(10, intent.getBooleanExtra("state", false) ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    C3398f fVar2 = this.f2154;
                    fVar2.f2144.sendMessage(fVar2.f2144.obtainMessage(9, ((ConnectivityManager) C3626z.m4085(context, "connectivity")).getActiveNetworkInfo()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m2236(C2666 r6) {
        boolean z;
        boolean z2 = true;
        if (!(r6.f12277 != null && r6.f12277.isCancelled())) {
            if (this.f2145.isShutdown()) {
                boolean z3 = r6.f12261.f3452;
                this.f2137.remove(r6.f12276);
                m2237(r6);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f2140) {
                networkInfo = ((ConnectivityManager) C3626z.m4085(this.f2151, "connectivity")).getActiveNetworkInfo();
            }
            boolean z4 = networkInfo != null && networkInfo.isConnected();
            if (!(r6.f12269 > 0)) {
                z = false;
            } else {
                r6.f12269--;
                z = r6.f12272.m4070(networkInfo);
            }
            boolean r4 = r6.f12272.m4071();
            if (!z) {
                if (!this.f2140 || !r4) {
                    z2 = false;
                }
                boolean z5 = r6.f12261.f3452;
                this.f2137.remove(r6.f12276);
                m2237(r6);
                if (z2) {
                    m2233(r6);
                }
            } else if (!this.f2140 || z4) {
                boolean z6 = r6.f12261.f3452;
                if (r6.f12271 instanceof C3478i.Cif) {
                    r6.f12270 |= C3505j.NO_CACHE.f2392;
                }
                r6.f12277 = this.f2145.submit(r6);
            } else {
                boolean z7 = r6.f12261.f3452;
                this.f2137.remove(r6.f12276);
                m2237(r6);
                if (r4) {
                    m2233(r6);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m2233(C2666 r8) {
        C3126 r0 = r8.f12279;
        if (r0 != null) {
            T t = r0.f14265 == null ? null : r0.f14265.get();
            if (t != null) {
                r0.f14262 = true;
                this.f2146.put(t, r0);
            }
        }
        List<C3126> list = r8.f12278;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3126 r4 = list.get(i);
                T t2 = r4.f14265 == null ? null : r4.f14265.get();
                if (t2 != null) {
                    r4.f14262 = true;
                    this.f2146.put(t2, r4);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m2237(C2666 r4) {
        if (!(r4.f12277 != null && r4.f12277.isCancelled())) {
            this.f2148.add(r4);
            if (!this.f2144.hasMessages(7)) {
                this.f2144.sendEmptyMessageDelayed(7, 200);
            }
        }
    }
}
