package o;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0288;
import o.C0587;
import o.C1190;
import o.C1345;
import o.C3024;

/* renamed from: o.ŀɪ  reason: contains not printable characters */
public final class C0506 implements Handler.Callback {

    /* renamed from: ı  reason: contains not printable characters */
    static final Status f4211 = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: ɪ  reason: contains not printable characters */
    private static C0506 f4212;

    /* renamed from: ι  reason: contains not printable characters */
    public static final Status f4213 = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: і  reason: contains not printable characters */
    static final Object f4214 = new Object();

    /* renamed from: ł  reason: contains not printable characters */
    private final Set<C0475<?>> f4215 = new C0639();

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final Context f4216;

    /* renamed from: ǃ  reason: contains not printable characters */
    long f4217 = 5000;

    /* renamed from: ȷ  reason: contains not printable characters */
    final Set<C0475<?>> f4218 = new C0639();

    /* renamed from: ɨ  reason: contains not printable characters */
    C0589 f4219 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    long f4220 = 10000;
    /* access modifiers changed from: package-private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Map<C0475<?>, C0507<?>> f4221 = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: ɾ  reason: contains not printable characters */
    private final AtomicInteger f4222 = new AtomicInteger(1);

    /* renamed from: ɿ  reason: contains not printable characters */
    private final AtomicInteger f4223 = new AtomicInteger(0);

    /* renamed from: Ι  reason: contains not printable characters */
    long f4224 = 120000;

    /* renamed from: І  reason: contains not printable characters */
    public final C2835 f4225;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final C1331 f4226;

    /* renamed from: ӏ  reason: contains not printable characters */
    public final Handler f4227;

    /* renamed from: ι  reason: contains not printable characters */
    public static C0506 m4911(Context context) {
        C0506 r4;
        synchronized (f4214) {
            if (f4212 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f4212 = new C0506(context.getApplicationContext(), handlerThread.getLooper(), C2835.f13281);
            }
            r4 = f4212;
        }
        return r4;
    }

    /* renamed from: o.ŀɪ$ǃ  reason: contains not printable characters */
    static class C0508 {

        /* renamed from: ı  reason: contains not printable characters */
        final C2847 f4247;

        /* renamed from: ǃ  reason: contains not printable characters */
        final C0475<?> f4248;

        private C0508(C0475<?> r1, C2847 r2) {
            this.f4248 = r1;
            this.f4247 = r2;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0508)) {
                C0508 r5 = (C0508) obj;
                C0475<?> r1 = this.f4248;
                C0475<?> r2 = r5.f4248;
                if (r1 == r2 || (r1 != null && r1.equals(r2))) {
                    C2847 r12 = this.f4247;
                    C2847 r52 = r5.f4247;
                    if (r12 == r52 || (r12 != null && r12.equals(r52))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f4248, this.f4247});
        }

        /* synthetic */ C0508(C0475 r1, C2847 r2, byte b) {
            this(r1, r2);
        }

        public final String toString() {
            return new C1345.C1346(this, (byte) 0).m8437("key", this.f4248).m8437("feature", this.f4247).toString();
        }
    }

    /* renamed from: o.ŀɪ$if  reason: invalid class name */
    class Cif implements C0874, C1190.C3638If {
        /* access modifiers changed from: private */

        /* renamed from: ı  reason: contains not printable characters */
        public final C3024.C3030 f4228;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Set<Scope> f4229 = null;
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0475<?> f4230;

        /* renamed from: Ι  reason: contains not printable characters */
        private C1304 f4231 = null;
        /* access modifiers changed from: private */

        /* renamed from: І  reason: contains not printable characters */
        public boolean f4233 = false;

        public Cif(C3024.C3030 r2, C0475<?> r3) {
            this.f4228 = r2;
            this.f4230 = r3;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4923(C2822 r3) {
            C0506.this.f4227.post(new C0690(this, r3));
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4924(C2822 r4) {
            C0507 r0 = C0506.this.f4221.get(this.f4230);
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                r0.f4234.m15483();
                r0.m4944(r4);
                return;
            }
            throw new IllegalStateException("Must be called on the handler thread");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4925(C1304 r2, Set<Scope> set) {
            C1304 r22;
            if (r2 == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                m4924(new C2822(4));
                return;
            }
            this.f4231 = r2;
            this.f4229 = set;
            if (this.f4233 && (r22 = this.f4231) != null) {
                this.f4228.m15486(r22, this.f4229);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        static /* synthetic */ void m4919(Cif ifVar) {
            C1304 r0;
            if (ifVar.f4233 && (r0 = ifVar.f4231) != null) {
                ifVar.f4228.m15486(r0, ifVar.f4229);
            }
        }
    }

    /* renamed from: o.ŀɪ$ı  reason: contains not printable characters */
    public class C0507<O extends C3024.Cif> implements C0288.C0289, C1111 {
        /* access modifiers changed from: package-private */

        /* renamed from: ı  reason: contains not printable characters */
        public final C3024.C3030 f4234;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Set<C1077> f4236 = new HashSet();

        /* renamed from: ɨ  reason: contains not printable characters */
        private final Map<C0587.Cif<?>, C0730> f4237 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f4238;

        /* renamed from: ɹ  reason: contains not printable characters */
        private final Queue<C0758> f4239 = new LinkedList();

        /* renamed from: ɾ  reason: contains not printable characters */
        private final C1082 f4240;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f4241;

        /* renamed from: ι  reason: contains not printable characters */
        final List<C0508> f4242 = new ArrayList();

        /* renamed from: І  reason: contains not printable characters */
        private final C0475<O> f4243;

        /* renamed from: і  reason: contains not printable characters */
        C2822 f4244 = null;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final C3024.C3028 f4245;

        /* renamed from: ӏ  reason: contains not printable characters */
        private final C0812 f4246;

        public C0507(C0339<O> r5) {
            this.f4234 = r5.m4466(C0506.this.f4227.getLooper(), (C0507<O>) this);
            C3024.C3030 r1 = this.f4234;
            if (r1 instanceof C1482) {
                this.f4245 = ((C1482) r1).f7941;
            } else {
                this.f4245 = r1;
            }
            this.f4243 = r5.m4464();
            this.f4240 = new C1082();
            this.f4241 = r5.m4467();
            if (this.f4234.m15481()) {
                this.f4246 = r5.m4465(C0506.this.f4216, C0506.this.f4227);
            } else {
                this.f4246 = null;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m4948(Bundle bundle) {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                m4928();
            } else {
                C0506.this.f4227.post(new C0663(this));
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4938(int i) {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                m4935();
            } else {
                C0506.this.f4227.post(new C0674(this));
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4944(C2822 r6) {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                C0812 r0 = this.f4246;
                if (r0 != null) {
                    r0.m6215();
                }
                if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                    this.f4244 = null;
                    C0506.this.f4226.f7352.clear();
                    m4932(r6);
                    if (r6.f13249 == 4) {
                        m4943(C0506.f4211);
                    } else if (this.f4239.isEmpty()) {
                        this.f4244 = r6;
                    } else if (!m4930(r6)) {
                        C0506 r02 = C0506.this;
                        if (!r02.f4225.m14792(r02.f4216, r6, this.f4241)) {
                            if (r6.f13249 == 18) {
                                this.f4238 = true;
                            }
                            if (this.f4238) {
                                C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 9, this.f4243), C0506.this.f4217);
                                return;
                            }
                            String str = this.f4243.f4103.f13928;
                            String valueOf = String.valueOf(r6);
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
                            sb.append("API: ");
                            sb.append(str);
                            sb.append(" is not available on this device. Connection failed with: ");
                            sb.append(valueOf);
                            m4943(new Status(17, sb.toString()));
                        }
                    }
                } else {
                    throw new IllegalStateException("Must be called on the handler thread");
                }
            } else {
                throw new IllegalStateException("Must be called on the handler thread");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4942() {
            ArrayList arrayList = new ArrayList(this.f4239);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0758 r3 = (C0758) obj;
                if (!this.f4234.m15489()) {
                    return;
                }
                if (m4931(r3)) {
                    this.f4239.remove(r3);
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4939(C0758 r3) {
            if (Looper.myLooper() != C0506.this.f4227.getLooper()) {
                throw new IllegalStateException("Must be called on the handler thread");
            } else if (!this.f4234.m15489()) {
                this.f4239.add(r3);
                C2822 r32 = this.f4244;
                if (r32 != null) {
                    if ((r32.f13249 == 0 || r32.f13246 == null) ? false : true) {
                        m4944(this.f4244);
                        return;
                    }
                }
                m4945();
            } else if (m4931(r3)) {
                m4936();
            } else {
                this.f4239.add(r3);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m4947() {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                m4943(C0506.f4213);
                this.f4240.m7441();
                for (C0587.Cif r3 : (C0587.Cif[]) this.f4237.keySet().toArray(new C0587.Cif[this.f4237.size()])) {
                    m4939((C0758) new C0937(r3, new C3203()));
                }
                m4932(new C2822(4));
                if (this.f4234.m15489()) {
                    this.f4234.m15485((C1190.Cif) new C0697(this));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called on the handler thread");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3024.C3030 m4941() {
            return this.f4234;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Map<C0587.Cif<?>, C0730> m4946() {
            return this.f4237;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean m4931(C0758 r6) {
            if (!(r6 instanceof C0680)) {
                m4934(r6);
                return true;
            }
            C0680 r0 = (C0680) r6;
            C2847 r2 = m4926(r0.m5555(this));
            if (r2 == null) {
                m4934(r6);
                return true;
            }
            if (r0.m5554(this)) {
                C0508 r62 = new C0508(this.f4243, r2, (byte) 0);
                int indexOf = this.f4242.indexOf(r62);
                if (indexOf >= 0) {
                    C0508 r63 = this.f4242.get(indexOf);
                    C0506.this.f4227.removeMessages(15, r63);
                    C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 15, r63), C0506.this.f4217);
                } else {
                    this.f4242.add(r62);
                    C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 15, r62), C0506.this.f4217);
                    C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 16, r62), C0506.this.f4224);
                    C2822 r64 = new C2822(2, (PendingIntent) null);
                    if (!m4930(r64)) {
                        C0506 r02 = C0506.this;
                        r02.f4225.m14792(r02.f4216, r64, this.f4241);
                    }
                }
            } else {
                r0.m6033(new C0441(r2));
            }
            return false;
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final void m4934(C0758 r3) {
            r3.m6036(this.f4240, this.f4234.m15481());
            try {
                r3.m6034((C0507<?>) this);
            } catch (DeadObjectException unused) {
                m4938(1);
                this.f4234.m15483();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4943(Status status) {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                for (C0758 r1 : this.f4239) {
                    r1.m6035(status);
                }
                this.f4239.clear();
                return;
            }
            throw new IllegalStateException("Must be called on the handler thread");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m4937() {
            if (this.f4238) {
                C0506.this.f4227.removeMessages(11, this.f4243);
                C0506.this.f4227.removeMessages(9, this.f4243);
                this.f4238 = false;
            }
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final void m4936() {
            C0506.this.f4227.removeMessages(12, this.f4243);
            C0506.this.f4227.sendMessageDelayed(C0506.this.f4227.obtainMessage(12, this.f4243), C0506.this.f4220);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m4940(boolean z) {
            if (Looper.myLooper() != C0506.this.f4227.getLooper()) {
                throw new IllegalStateException("Must be called on the handler thread");
            } else if (!this.f4234.m15489() || this.f4237.size() != 0) {
                return false;
            } else {
                if (this.f4240.m7440()) {
                    if (z) {
                        m4936();
                    }
                    return false;
                }
                this.f4234.m15483();
                return true;
            }
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final void m4945() {
            if (Looper.myLooper() != C0506.this.f4227.getLooper()) {
                throw new IllegalStateException("Must be called on the handler thread");
            } else if (!this.f4234.m15489() && !this.f4234.m15487()) {
                int r0 = C0506.this.f4226.m8365(C0506.this.f4216, this.f4234);
                if (r0 != 0) {
                    m4944(new C2822(r0, (PendingIntent) null));
                    return;
                }
                Cif ifVar = new Cif(this.f4234, this.f4243);
                if (this.f4234.m15481()) {
                    this.f4246.m6213((C0874) ifVar);
                }
                this.f4234.m15484((C1190.C3638If) ifVar);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private final void m4932(C2822 r5) {
            for (C1077 next : this.f4236) {
                String str = null;
                C2822 r3 = C2822.f13245;
                if (r5 == r3 || (r5 != null && r5.equals(r3))) {
                    str = this.f4234.m15491();
                }
                next.m7426(this.f4243, r5, str);
            }
            this.f4236.clear();
        }

        /* renamed from: ı  reason: contains not printable characters */
        private final C2847 m4926(C2847[] r14) {
            if (!(r14 == null || r14.length == 0)) {
                C2847[] r1 = this.f4234.m15482();
                int i = 0;
                if (r1 == null) {
                    r1 = new C2847[0];
                }
                C0299 r3 = new C0299(r1.length);
                for (C2847 r8 : r1) {
                    r3.put(r8.f13294, Long.valueOf(r8.f13292 == -1 ? (long) r8.f13293 : r8.f13292));
                }
                int length = r14.length;
                while (i < length) {
                    C2847 r4 = r14[i];
                    if (r3.containsKey(r4.f13294)) {
                        if (((Long) r3.get(r4.f13294)).longValue() >= (r4.f13292 == -1 ? (long) r4.f13293 : r4.f13292)) {
                            i++;
                        }
                    }
                    return r4;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m4949(C0508 r6) {
            C2847[] r3;
            if (this.f4242.remove(r6)) {
                C0506.this.f4227.removeMessages(15, r6);
                C0506.this.f4227.removeMessages(16, r6);
                C2847 r62 = r6.f4247;
                ArrayList arrayList = new ArrayList(this.f4239.size());
                for (C0758 r2 : this.f4239) {
                    if ((r2 instanceof C0680) && (r3 = ((C0680) r2).m5555(this)) != null && C2745.m14536((T[]) r3, r62)) {
                        arrayList.add(r2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C0758 r32 = (C0758) obj;
                    this.f4239.remove(r32);
                    r32.m6033(new C0441(r62));
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final void m4928() {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                this.f4244 = null;
                m4932(C2822.f13245);
                m4937();
                Iterator<C0730> it = this.f4237.values().iterator();
                while (it.hasNext()) {
                    C0730 next = it.next();
                    if (m4926(next.f4959.m5101()) != null) {
                        it.remove();
                    } else {
                        try {
                            next.f4959.m5100(this.f4245, new C3203());
                        } catch (DeadObjectException unused) {
                            m4938(1);
                            this.f4234.m15483();
                        } catch (RemoteException unused2) {
                            it.remove();
                        }
                    }
                }
                m4942();
                m4936();
                return;
            }
            throw new IllegalStateException("Must be called on the handler thread");
        }

        /* access modifiers changed from: private */
        /* renamed from: І  reason: contains not printable characters */
        public final void m4935() {
            if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                this.f4244 = null;
                this.f4238 = true;
                this.f4240.m7439();
                C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 9, this.f4243), C0506.this.f4217);
                C0506.this.f4227.sendMessageDelayed(Message.obtain(C0506.this.f4227, 11, this.f4243), C0506.this.f4224);
                C0506.this.f4226.f7352.clear();
                return;
            }
            throw new IllegalStateException("Must be called on the handler thread");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private final boolean m4930(C2822 r4) {
            synchronized (C0506.f4214) {
                if (C0506.this.f4219 == null || !C0506.this.f4218.contains(this.f4243)) {
                    return false;
                }
                C0506.this.f4219.m7415(r4, this.f4241);
                return true;
            }
        }
    }

    private C0506(Context context, Looper looper, C2835 r7) {
        this.f4216 = context;
        this.f4227 = new C0469(looper, this);
        this.f4225 = r7;
        this.f4226 = new C1331(r7);
        Handler handler = this.f4227;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m4917() {
        return this.f4222.getAndIncrement();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4912(C0339<?> r3) {
        Handler handler = this.f4227;
        handler.sendMessage(handler.obtainMessage(7, r3));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m4910(C0339<?> r3) {
        C0475<?> r0 = r3.m4464();
        C0507 r1 = this.f4221.get(r0);
        if (r1 == null) {
            r1 = new C0507(r3);
            this.f4221.put(r0, r1);
        }
        if (r1.f4234.m15481()) {
            this.f4215.add(r0);
        }
        r1.m4945();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4913(C0589 r3) {
        synchronized (f4214) {
            if (this.f4219 != r3) {
                this.f4219 = r3;
                this.f4218.clear();
            }
            this.f4218.addAll(r3.m5220());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4916(C0589 r3) {
        synchronized (f4214) {
            if (this.f4219 == r3) {
                this.f4219 = null;
                this.f4218.clear();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4918() {
        Handler handler = this.f4227;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <O extends C3024.Cif, ResultT> void m4915(C0339<O> r2, int i, C0661<C3024.C3028, ResultT> r4, C3203<ResultT> r5, C0539 r6) {
        C0984 r0 = new C0984(i, r4, r5, r6);
        Handler handler = this.f4227;
        handler.sendMessage(handler.obtainMessage(4, new C0735(r0, this.f4223.get(), r2)));
    }

    public final boolean handleMessage(Message message) {
        C0507 r2;
        Status status;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f4220 = j;
                this.f4227.removeMessages(12);
                for (C0475<?> obtainMessage : this.f4221.keySet()) {
                    Handler handler = this.f4227;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f4220);
                }
                break;
            case 2:
                C1077 r8 = (C1077) message.obj;
                Iterator<C0475<?>> it = r8.m7427().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0475 next = it.next();
                        C0507 r22 = this.f4221.get(next);
                        if (r22 == null) {
                            r8.m7426(next, new C2822(13), (String) null);
                            break;
                        } else if (r22.f4234.m15489()) {
                            r8.m7426(next, C2822.f13245, r22.f4234.m15491());
                        } else {
                            if (Looper.myLooper() != C0506.this.f4227.getLooper()) {
                                throw new IllegalStateException("Must be called on the handler thread");
                            } else if (r22.f4244 != null) {
                                if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                                    r8.m7426(next, r22.f4244, (String) null);
                                } else {
                                    throw new IllegalStateException("Must be called on the handler thread");
                                }
                            } else {
                                if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                                    r22.f4236.add(r8);
                                    r22.m4945();
                                } else {
                                    throw new IllegalStateException("Must be called on the handler thread");
                                }
                            }
                        }
                    }
                }
            case 3:
                for (C0507 next2 : this.f4221.values()) {
                    if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                        next2.f4244 = null;
                        next2.m4945();
                    } else {
                        throw new IllegalStateException("Must be called on the handler thread");
                    }
                }
                break;
            case 4:
            case 8:
            case 13:
                C0735 r82 = (C0735) message.obj;
                C0507 r0 = this.f4221.get(r82.f4965.m4464());
                if (r0 == null) {
                    m4910(r82.f4965);
                    r0 = this.f4221.get(r82.f4965.m4464());
                }
                if (r0.f4234.m15481() && this.f4223.get() != r82.f4964) {
                    r82.f4966.m6035(f4213);
                    r0.m4947();
                    break;
                } else {
                    r0.m4939(r82.f4966);
                    break;
                }
            case 5:
                int i = message.arg1;
                C2822 r83 = (C2822) message.obj;
                Iterator<C0507<?>> it2 = this.f4221.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        r2 = it2.next();
                        if (r2.f4241 == i) {
                        }
                    } else {
                        r2 = null;
                    }
                }
                if (r2 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String r3 = this.f4225.m14805(r83.f13249);
                    String str = r83.f13247;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(r3).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(r3);
                    sb2.append(": ");
                    sb2.append(str);
                    r2.m4943(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f4216.getApplicationContext() instanceof Application) {
                    C0473.m4804((Application) this.f4216.getApplicationContext());
                    C0473 r84 = C0473.f4096;
                    C0670 r02 = new C0670(this);
                    synchronized (C0473.f4096) {
                        r84.f4100.add(r02);
                    }
                    C0473 r85 = C0473.f4096;
                    if (!r85.f4099.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!r85.f4099.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            r85.f4098.set(true);
                        }
                    }
                    if (!r85.f4098.get()) {
                        this.f4220 = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m4910((C0339<?>) (C0339) message.obj);
                break;
            case 9:
                if (this.f4221.containsKey(message.obj)) {
                    C0507 r86 = this.f4221.get(message.obj);
                    if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                        if (r86.f4238) {
                            r86.m4945();
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Must be called on the handler thread");
                    }
                }
                break;
            case 10:
                for (C0475<?> remove : this.f4215) {
                    this.f4221.remove(remove).m4947();
                }
                this.f4215.clear();
                break;
            case 11:
                if (this.f4221.containsKey(message.obj)) {
                    C0507 r87 = this.f4221.get(message.obj);
                    if (Looper.myLooper() == C0506.this.f4227.getLooper()) {
                        if (r87.f4238) {
                            r87.m4937();
                            if (C0506.this.f4225.m14806(C0506.this.f4216) == 18) {
                                status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                            } else {
                                status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                            }
                            r87.m4943(status);
                            r87.f4234.m15483();
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Must be called on the handler thread");
                    }
                }
                break;
            case 12:
                if (this.f4221.containsKey(message.obj)) {
                    this.f4221.get(message.obj).m4940(true);
                    break;
                }
                break;
            case 14:
                C0646 r88 = (C0646) message.obj;
                C0475<?> r03 = r88.m5430();
                if (this.f4221.containsKey(r03)) {
                    boolean r04 = this.f4221.get(r03).m4940(false);
                    r88.m5429().f14555.m6079(Boolean.valueOf(r04));
                    break;
                } else {
                    r88.m5429().f14555.m6079(Boolean.FALSE);
                    break;
                }
            case 15:
                C0508 r89 = (C0508) message.obj;
                if (this.f4221.containsKey(r89.f4248)) {
                    C0507 r05 = this.f4221.get(r89.f4248);
                    if (r05.f4242.contains(r89) && !r05.f4238) {
                        if (r05.f4234.m15489()) {
                            r05.m4942();
                            break;
                        } else {
                            r05.m4945();
                            break;
                        }
                    }
                }
                break;
            case 16:
                C0508 r810 = (C0508) message.obj;
                if (this.f4221.containsKey(r810.f4248)) {
                    this.f4221.get(r810.f4248).m4949(r810);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                return false;
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4914(C2822 r4, int i) {
        if (!this.f4225.m14792(this.f4216, r4, i)) {
            Handler handler = this.f4227;
            handler.sendMessage(handler.obtainMessage(5, i, 0, r4));
        }
    }
}
