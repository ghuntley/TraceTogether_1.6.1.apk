package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import o.C1841;
import o.C3126;

/* renamed from: o.p  reason: case insensitive filesystem */
public class C3616p {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static volatile C3616p f3441 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    static final Handler f3442 = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            int i = message.what;
            T t = null;
            if (i == 3) {
                C3126 r11 = (C3126) message.obj;
                boolean z = r11.f14266.f3452;
                C3616p pVar = r11.f14266;
                if (r11.f14265 != null) {
                    t = r11.f14265.get();
                }
                pVar.m4044((Object) t);
            } else if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C2666 r2 = (C2666) list.get(i2);
                    C3616p pVar2 = r2.f12261;
                    C3126 r5 = r2.f12279;
                    List<C3126> list2 = r2.f12278;
                    boolean z2 = true;
                    boolean z3 = list2 != null && !list2.isEmpty();
                    if (r5 == null && !z3) {
                        z2 = false;
                    }
                    if (z2) {
                        Bitmap bitmap = r2.f12265;
                        C0272 r22 = r2.f12267;
                        if (r5 != null) {
                            pVar2.m4046(bitmap, r22, r5);
                        }
                        if (z3) {
                            int size2 = list2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                pVar2.m4046(bitmap, r22, list2.get(i3));
                            }
                        }
                    }
                }
            } else if (i == 13) {
                List list3 = (List) message.obj;
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C3126 r4 = (C3126) list3.get(i4);
                    C3616p pVar3 = r4.f14266;
                    Bitmap r6 = C3560l.m3362(0) ? pVar3.m4043(r4.f14261) : null;
                    if (r6 != null) {
                        pVar3.m4046(r6, C0272.MEMORY, r4);
                        boolean z4 = pVar3.f3452;
                    } else {
                        pVar3.m4045(r4);
                        boolean z5 = pVar3.f3452;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                sb.append(message.what);
                throw new AssertionError(sb.toString());
            }
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final ReferenceQueue<Object> f3443 = new ReferenceQueue<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    final Context f3444;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Map<Object, C3126> f3445 = new WeakHashMap();

    /* renamed from: ɨ  reason: contains not printable characters */
    private C3622v f3446;

    /* renamed from: ɩ  reason: contains not printable characters */
    final List<C3618r> f3447;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C0271 f3448 = new C0271(this.f3443, f3442);

    /* renamed from: ɾ  reason: contains not printable characters */
    private C3259a f3449;

    /* renamed from: ι  reason: contains not printable characters */
    final Map<ImageView, C2667> f3450 = new WeakHashMap();

    /* renamed from: І  reason: contains not printable characters */
    private final C0273 f3451;

    /* renamed from: і  reason: contains not printable characters */
    volatile boolean f3452 = false;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final Bitmap.Config f3453;

    /* renamed from: ӏ  reason: contains not printable characters */
    private C3398f f3454;

    /* renamed from: o.p$if  reason: invalid class name */
    public enum Cif {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: o.p$ı  reason: contains not printable characters */
    public interface C0270 {
        /* renamed from: ı  reason: contains not printable characters */
        float m4048(C1841.C1842 r1);

        /* renamed from: ı  reason: contains not printable characters */
        void m4049(C1841.C1842 r1, float f);

        /* renamed from: Ɩ  reason: contains not printable characters */
        ColorStateList m4050(C1841.C1842 r1);

        /* renamed from: ǃ  reason: contains not printable characters */
        float m4051(C1841.C1842 r1);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m4052();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m4053(C1841.C1842 r1, ColorStateList colorStateList);

        /* renamed from: ɩ  reason: contains not printable characters */
        float m4054(C1841.C1842 r1);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m4055(C1841.C1842 r1, float f);

        /* renamed from: ɹ  reason: contains not printable characters */
        void m4056(C1841.C1842 r1);

        /* renamed from: Ι  reason: contains not printable characters */
        float m4057(C1841.C1842 r1);

        /* renamed from: Ι  reason: contains not printable characters */
        void m4058(C1841.C1842 r1, float f);

        /* renamed from: Ι  reason: contains not printable characters */
        void m4059(C1841.C1842 r1, Context context, ColorStateList colorStateList, float f, float f2, float f3);

        /* renamed from: ι  reason: contains not printable characters */
        float m4060(C1841.C1842 r1);

        /* renamed from: І  reason: contains not printable characters */
        void m4061(C1841.C1842 r1);

        /* renamed from: Ӏ  reason: contains not printable characters */
        void m4062(C1841.C1842 r1);
    }

    /* renamed from: o.p$Ι  reason: contains not printable characters */
    public interface C0273 {

        /* renamed from: ι  reason: contains not printable characters */
        public static final C0273 f3473 = new C0273() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final C3617q m4064(C3617q qVar) {
                return qVar;
            }
        };

        /* renamed from: ɩ  reason: contains not printable characters */
        C3617q m4063(C3617q qVar);
    }

    C3616p(Context context, C3398f fVar, C3259a aVar, C0273 r4, C3622v vVar, Bitmap.Config config) {
        this.f3444 = context;
        this.f3454 = fVar;
        this.f3449 = aVar;
        this.f3451 = r4;
        this.f3453 = config;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C3621u(context));
        arrayList.add(new C2648(context));
        arrayList.add(new C3452h(context));
        arrayList.add(new C2668(context));
        arrayList.add(new C2697(context));
        arrayList.add(new C3316c(context));
        arrayList.add(new C3478i(fVar.f2142, vVar));
        this.f3447 = Collections.unmodifiableList(arrayList);
        this.f3446 = vVar;
        this.f3448.start();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3620t m4041(String str) {
        if (str == null) {
            return new C3620t(this, (Uri) null);
        }
        if (str.trim().length() != 0) {
            return new C3620t(this, Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3617q m4042(C3617q qVar) {
        C3617q r0 = this.f3451.m4063(qVar);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder("Request transformer ");
        sb.append(this.f3451.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(qVar);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bitmap m4043(String str) {
        Bitmap r3 = this.f3449.m1444(str);
        if (r3 != null) {
            this.f3446.f3510.sendEmptyMessage(0);
        } else {
            this.f3446.f3510.sendEmptyMessage(1);
        }
        return r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4044(Object obj) {
        C2667 remove;
        C3626z.m4097();
        C3126 remove2 = this.f3445.remove(obj);
        if (remove2 != null) {
            remove2.m15857();
            C3398f fVar = this.f3454;
            fVar.f2144.sendMessage(fVar.f2144.obtainMessage(2, remove2));
        }
        if ((obj instanceof ImageView) && (remove = this.f3450.remove((ImageView) obj)) != null) {
            remove.m14149();
        }
    }

    /* renamed from: o.p$ǃ  reason: contains not printable characters */
    static class C0271 extends Thread {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final ReferenceQueue<Object> f3465;

        /* renamed from: ι  reason: contains not printable characters */
        private final Handler f3466;

        C0271(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f3465 = referenceQueue;
            this.f3466 = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C3126.C3127 r0 = (C3126.C3127) this.f3465.remove(1000);
                    Message obtainMessage = this.f3466.obtainMessage();
                    if (r0 != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = r0.f14269;
                        this.f3466.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f3466.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C3616p m4040(Context context) {
        if (f3441 == null) {
            synchronized (C3616p.class) {
                if (f3441 == null) {
                    f3441 = new If(context).m4047();
                }
            }
        }
        return f3441;
    }

    /* renamed from: o.p$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public C3348d f3455;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Context f3456;

        /* renamed from: ɩ  reason: contains not printable characters */
        public ExecutorService f3457;

        /* renamed from: Ι  reason: contains not printable characters */
        public Bitmap.Config f3458;

        /* renamed from: ι  reason: contains not printable characters */
        private C3259a f3459;

        /* renamed from: і  reason: contains not printable characters */
        private C0273 f3460;

        public If(Context context) {
            if (context != null) {
                this.f3456 = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3616p m4047() {
            Context context = this.f3456;
            if (this.f3455 == null) {
                this.f3455 = C3626z.m4082(context);
            }
            if (this.f3459 == null) {
                this.f3459 = new C3425g(context);
            }
            if (this.f3457 == null) {
                this.f3457 = new C3584m();
            }
            if (this.f3460 == null) {
                this.f3460 = C0273.f3473;
            }
            C3622v vVar = new C3622v(this.f3459);
            Context context2 = context;
            return new C3616p(context2, new C3398f(context2, this.f3457, C3616p.f3442, this.f3455, this.f3459, vVar), this.f3459, this.f3460, vVar, this.f3458);
        }
    }

    /* renamed from: o.p$ɩ  reason: contains not printable characters */
    public enum C0272 {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f3472;

        private C0272(int i) {
            this.f3472 = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4045(C3126 r4) {
        T t = r4.f14265 == null ? null : r4.f14265.get();
        if (!(t == null || this.f3445.get(t) == r4)) {
            m4044((Object) t);
            this.f3445.put(t, r4);
        }
        C3398f fVar = this.f3454;
        fVar.f2144.sendMessage(fVar.f2144.obtainMessage(1, r4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m4046(Bitmap bitmap, C0272 r4, C3126 r5) {
        if (!r5.f14268) {
            if (!r5.f14262) {
                this.f3445.remove(r5.f14265 == null ? null : r5.f14265.get());
            }
            if (bitmap == null) {
                r5.m15856();
                boolean z = this.f3452;
            } else if (r4 != null) {
                r5.m15858(bitmap, r4);
                boolean z2 = this.f3452;
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }
}
