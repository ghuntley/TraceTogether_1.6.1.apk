package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C1655;

/* renamed from: o.ɩƚ  reason: contains not printable characters */
public abstract class C1242 {

    /* renamed from: ı  reason: contains not printable characters */
    private Executor f7032;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final ReentrantReadWriteLock f7033 = new ReentrantReadWriteLock();
    @Deprecated

    /* renamed from: ǃ  reason: contains not printable characters */
    public volatile C1558 f7034;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Map<String, Object> f7035 = new ConcurrentHashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private Executor f7036;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1225 f7037 = m8035();
    @Deprecated

    /* renamed from: Ι  reason: contains not printable characters */
    public List<C1244> f7038;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f7039;

    /* renamed from: І  reason: contains not printable characters */
    private C1655 f7040;

    /* renamed from: і  reason: contains not printable characters */
    private final ThreadLocal<Integer> f7041 = new ThreadLocal<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f7042;

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract C1655 m8032(C1116 r1);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract C1225 m8035();

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public Lock m8036() {
        return this.f7033.readLock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, Object> m8031() {
        return this.f7035;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m8022(C1116 r4) {
        this.f7040 = m8032(r4);
        C1655 r0 = this.f7040;
        if (r0 instanceof C1386) {
            ((C1386) r0).m8546(r4);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (r4.f6605 == C1243.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f7040.m9513(z);
        }
        this.f7038 = r4.f6609;
        this.f7032 = r4.f6611;
        this.f7036 = new C1401(r4.f6617);
        this.f7042 = r4.f6615;
        this.f7039 = z;
        if (r4.f6616) {
            this.f7037.m7915(r4.f6613, r4.f6604);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1655 m8027() {
        return this.f7040;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m8023() {
        C1558 r0 = this.f7034;
        return r0 != null && r0.m9180();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m8024() {
        if (!this.f7042 && m8020()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m8038() {
        if (!m8040() && this.f7041.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Cursor m8025(C1611 r2) {
        return m8026(r2, (CancellationSignal) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Cursor m8026(C1611 r3, CancellationSignal cancellationSignal) {
        m8024();
        m8038();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f7040.m9512().m9181(r3);
        }
        return this.f7040.m9512().m9174(r3, cancellationSignal);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C1647 m8021(String str) {
        m8024();
        m8038();
        return this.f7040.m9512().m9175(str);
    }

    @Deprecated
    /* renamed from: І  reason: contains not printable characters */
    public void m8037() {
        m8024();
        C1558 r0 = this.f7040.m9512();
        this.f7037.m7916(r0);
        r0.m9176();
    }

    @Deprecated
    /* renamed from: ɹ  reason: contains not printable characters */
    public void m8034() {
        this.f7040.m9512().m9177();
        if (!m8040()) {
            this.f7037.m7914();
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public Executor m8039() {
        return this.f7032;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public Executor m8030() {
        return this.f7036;
    }

    @Deprecated
    /* renamed from: ɪ  reason: contains not printable characters */
    public void m8033() {
        this.f7040.m9512().m9172();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8028(C1558 r2) {
        this.f7037.m7913(r2);
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public C1225 m8029() {
        return this.f7037;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public boolean m8040() {
        return this.f7040.m9512().m9182();
    }

    /* renamed from: o.ɩƚ$ı  reason: contains not printable characters */
    public enum C1243 {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: ı  reason: contains not printable characters */
        static boolean m8043(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }
    }

    /* renamed from: o.ɩƚ$ɩ  reason: contains not printable characters */
    public static class C1245<T extends C1242> {

        /* renamed from: ı  reason: contains not printable characters */
        private Executor f7050;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final Cif f7051 = new Cif();

        /* renamed from: ǃ  reason: contains not printable characters */
        private Executor f7052;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Context f7053;

        /* renamed from: ɹ  reason: contains not printable characters */
        private boolean f7054 = true;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Class<T> f7055;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f7056;

        /* renamed from: І  reason: contains not printable characters */
        private C1655.C1656 f7057;

        /* renamed from: і  reason: contains not printable characters */
        private Set<Integer> f7058;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private C1243 f7059 = C1243.AUTOMATIC;

        C1245(Context context, Class<T> cls, String str) {
            this.f7053 = context;
            this.f7055 = cls;
            this.f7056 = str;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1245<T> m8050(C1549... r6) {
            if (this.f7058 == null) {
                this.f7058 = new HashSet();
            }
            for (int i = 0; i <= 0; i++) {
                C1549 r2 = r6[0];
                this.f7058.add(Integer.valueOf(r2.f8248));
                this.f7058.add(Integer.valueOf(r2.f8249));
            }
            this.f7051.m8042(r6);
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: ι  reason: contains not printable characters */
        public final T m8051() {
            ActivityManager activityManager;
            Executor executor;
            if (this.f7053 == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f7055 != null) {
                if (this.f7052 == null && this.f7050 == null) {
                    Executor r0 = C2523.m13403();
                    this.f7050 = r0;
                    this.f7052 = r0;
                } else {
                    Executor executor2 = this.f7052;
                    if (executor2 != null && this.f7050 == null) {
                        this.f7050 = executor2;
                    } else if (this.f7052 == null && (executor = this.f7050) != null) {
                        this.f7052 = executor;
                    }
                }
                if (this.f7057 == null) {
                    this.f7057 = new C1736();
                }
                Context context = this.f7053;
                String str = this.f7056;
                C1655.C1656 r4 = this.f7057;
                Cif ifVar = this.f7051;
                C1243 r1 = this.f7059;
                if (r1 == C1243.AUTOMATIC) {
                    if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || C1243.m8043(activityManager)) {
                        r1 = C1243.TRUNCATE;
                    } else {
                        r1 = C1243.WRITE_AHEAD_LOGGING;
                    }
                }
                C1116 r12 = new C1116(context, str, r4, ifVar, r1, this.f7052, this.f7050, this.f7054);
                T t = (C1242) C1238.m7990(this.f7055, "_Impl");
                t.m8022(r12);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    /* renamed from: o.ɩƚ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private HashMap<Integer, TreeMap<Integer, C1549>> f7043 = new HashMap<>();

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m8042(C1549... r8) {
            for (C1549 r2 : r8) {
                int i = r2.f8248;
                int i2 = r2.f8249;
                TreeMap treeMap = this.f7043.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    this.f7043.put(Integer.valueOf(i), treeMap);
                }
                treeMap.get(Integer.valueOf(i2));
                treeMap.put(Integer.valueOf(i2), r2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final List<C1549> m8041(List<C1549> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f7043.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private static boolean m8020() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: o.ɩƚ$ǃ  reason: contains not printable characters */
    public static abstract class C1244 {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f7048;

        /* renamed from: ǃ  reason: contains not printable characters */
        private CopyOnWriteArrayList<C3611mx> f7049;

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m8047();

        public C1244() {
        }

        public C1244(boolean z) {
            this.f7049 = new CopyOnWriteArrayList<>();
            this.f7048 = z;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m8045(boolean z) {
            this.f7048 = z;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m8046() {
            return this.f7048;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m8044() {
            Iterator<C3611mx> it = this.f7049.iterator();
            while (it.hasNext()) {
                it.next().m3937();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m8048(C3611mx mxVar) {
            this.f7049.add(mxVar);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m8049(C3611mx mxVar) {
            this.f7049.remove(mxVar);
        }
    }
}
