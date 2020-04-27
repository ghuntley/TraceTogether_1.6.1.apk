package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: o.ɨӀ  reason: contains not printable characters */
public final class C1225 {

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final String[] f6932 = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: ı  reason: contains not printable characters */
    final String[] f6933;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Map<String, Set<String>> f6934;

    /* renamed from: ǃ  reason: contains not printable characters */
    AtomicBoolean f6935 = new AtomicBoolean(false);

    /* renamed from: ɩ  reason: contains not printable characters */
    volatile boolean f6936 = false;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1226 f6937;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Runnable f6938 = new Runnable() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: o.ʗ} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX WARNING: type inference failed for: r5v3, types: [boolean] */
        /* JADX WARNING: type inference failed for: r5v9, types: [boolean] */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
            r0.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
            r5 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[SYNTHETIC, Splitter:B:14:0x0033] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007e A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000b] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                o.ɨӀ r0 = o.C1225.this
                o.ɩƚ r0 = r0.f6940
                java.util.concurrent.locks.Lock r0 = r0.m8036()
                r1 = 0
                r2 = 1
                r3 = 0
                r0.lock()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɨӀ r4 = o.C1225.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɩƚ r5 = r4.f6940     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                boolean r5 = r5.m8023()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r5 != 0) goto L_0x001a
            L_0x0018:
                r4 = 0
                goto L_0x002d
            L_0x001a:
                boolean r5 = r4.f6936     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r5 != 0) goto L_0x0027
                o.ɩƚ r5 = r4.f6940     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ʗ r5 = r5.m8027()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                r5.m9512()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
            L_0x0027:
                boolean r4 = r4.f6936     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r4 != 0) goto L_0x002c
                goto L_0x0018
            L_0x002c:
                r4 = 1
            L_0x002d:
                if (r4 != 0) goto L_0x0033
                r0.unlock()
                return
            L_0x0033:
                o.ɨӀ r4 = o.C1225.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f6935     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                boolean r4 = r4.compareAndSet(r2, r3)     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r4 != 0) goto L_0x0041
                r0.unlock()
                return
            L_0x0041:
                o.ɨӀ r4 = o.C1225.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɩƚ r4 = r4.f6940     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                boolean r4 = r4.m8040()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r4 == 0) goto L_0x004f
                r0.unlock()
                return
            L_0x004f:
                o.ɨӀ r4 = o.C1225.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɩƚ r4 = r4.f6940     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                boolean r4 = r4.f7039     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                if (r4 == 0) goto L_0x0079
                o.ɨӀ r4 = o.C1225.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɩƚ r4 = r4.f6940     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ʗ r4 = r4.m8027()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                o.ɾӀ r4 = r4.m9512()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                r4.m9176()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                java.util.Set r5 = r11.m7917()     // Catch:{ all -> 0x0073 }
                r4.m9172()     // Catch:{ all -> 0x0071 }
                r4.m9177()     // Catch:{ SQLiteException | IllegalStateException -> 0x0084, all -> 0x007e }
                goto L_0x0084
            L_0x0071:
                r6 = move-exception
                goto L_0x0075
            L_0x0073:
                r6 = move-exception
                r5 = r1
            L_0x0075:
                r4.m9177()     // Catch:{ SQLiteException | IllegalStateException -> 0x0084, all -> 0x007e }
                throw r6     // Catch:{ SQLiteException | IllegalStateException -> 0x0084, all -> 0x007e }
            L_0x0079:
                java.util.Set r5 = r11.m7917()     // Catch:{ SQLiteException | IllegalStateException -> 0x0083, all -> 0x007e }
                goto L_0x0084
            L_0x007e:
                r1 = move-exception
                r0.unlock()
                throw r1
            L_0x0083:
                r5 = r1
            L_0x0084:
                r0.unlock()
                if (r5 == 0) goto L_0x00e6
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00e6
                o.ɨӀ r0 = o.C1225.this
                o.Ӏı<o.ɨӀ$If, o.ɨӀ$if> r0 = r0.f6941
                monitor-enter(r0)
                o.ɨӀ r4 = o.C1225.this     // Catch:{ all -> 0x00e3 }
                o.Ӏı<o.ɨӀ$If, o.ɨӀ$if> r4 = r4.f6941     // Catch:{ all -> 0x00e3 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e3 }
            L_0x009c:
                boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00e3 }
                if (r6 == 0) goto L_0x00e1
                java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00e3 }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00e3 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00e3 }
                o.ɨӀ$if r6 = (o.C1225.Cif) r6     // Catch:{ all -> 0x00e3 }
                int[] r7 = r6.f6946     // Catch:{ all -> 0x00e3 }
                int r7 = r7.length     // Catch:{ all -> 0x00e3 }
                r9 = r1
                r8 = 0
            L_0x00b3:
                if (r8 >= r7) goto L_0x00d9
                int[] r10 = r6.f6946     // Catch:{ all -> 0x00e3 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e3 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00e3 }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00e3 }
                if (r10 == 0) goto L_0x00d6
                if (r7 != r2) goto L_0x00c8
                java.util.Set<java.lang.String> r9 = r6.f6948     // Catch:{ all -> 0x00e3 }
                goto L_0x00d6
            L_0x00c8:
                if (r9 != 0) goto L_0x00cf
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00e3 }
                r9.<init>(r7)     // Catch:{ all -> 0x00e3 }
            L_0x00cf:
                java.lang.String[] r10 = r6.f6949     // Catch:{ all -> 0x00e3 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e3 }
                r9.add(r10)     // Catch:{ all -> 0x00e3 }
            L_0x00d6:
                int r8 = r8 + 1
                goto L_0x00b3
            L_0x00d9:
                if (r9 == 0) goto L_0x009c
                o.ɨӀ$If r6 = r6.f6947     // Catch:{ all -> 0x00e3 }
                r6.m7918(r9)     // Catch:{ all -> 0x00e3 }
                goto L_0x009c
            L_0x00e1:
                monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
                return
            L_0x00e3:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1225.AnonymousClass5.run():void");
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: ι  reason: contains not printable characters */
        private Set<Integer> m7917() {
            HashSet hashSet = new HashSet();
            Cursor r1 = C1225.this.f6940.m8025((C1611) new C3335coN("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (r1.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(r1.getInt(0)));
                } catch (Throwable th) {
                    r1.close();
                    throw th;
                }
            }
            r1.close();
            if (!hashSet.isEmpty()) {
                C1225.this.f6942.m9482();
            }
            return hashSet;
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    final HashMap<String, Integer> f6939;

    /* renamed from: ι  reason: contains not printable characters */
    final C1242 f6940;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: І  reason: contains not printable characters */
    final C2751<If, Cif> f6941 = new C2751<>();

    /* renamed from: і  reason: contains not printable characters */
    volatile C1647 f6942;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C1188 f6943;

    public C1225(C1242 r4, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f6940 = r4;
        this.f6937 = new C1226();
        this.f6939 = new HashMap<>();
        this.f6934 = map2;
        this.f6943 = new C1188(this.f6940);
        this.f6933 = new String[2];
        for (int i = 0; i < 2; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f6939.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.f6933[i] = str.toLowerCase(Locale.US);
            } else {
                this.f6933[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.f6939.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.f6939;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7913(C1558 r2) {
        synchronized (this) {
            if (!this.f6936) {
                r2.m9178("PRAGMA temp_store = MEMORY;");
                r2.m9178("PRAGMA recursive_triggers='ON';");
                r2.m9178("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m7916(r2);
                this.f6942 = r2.m9175("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f6936 = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7915(Context context, String str) {
        new C1223(context, str, this, this.f6940.m8039());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7908(C1558 r8, int i) {
        String str = this.f6933[i];
        StringBuilder sb = new StringBuilder();
        for (String append : f6932) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`room_table_modification_trigger_");
            sb.append(str);
            sb.append(C3292bc.f1729);
            sb.append(append);
            sb.append("`");
            r8.m9178(sb.toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7909(C1558 r9, int i) {
        StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        r9.m9178(sb.toString());
        String str = this.f6933[i];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f6932) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`room_table_modification_trigger_");
            sb2.append(str);
            sb2.append(C3292bc.f1729);
            sb2.append(str2);
            sb2.append("`");
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i);
            sb2.append(" AND invalidated = 0; END");
            r9.m9178(sb2.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7912(If ifR) {
        Cif r8;
        String[] r0 = m7907(ifR.f6945);
        int[] iArr = new int[r0.length];
        int length = r0.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f6939.get(r0[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(r0[i]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Cif ifVar = new Cif(ifR, iArr, r0);
        synchronized (this.f6941) {
            r8 = this.f6941.m14578(ifR, ifVar);
        }
        if (r8 == null && this.f6937.m7922(iArr) && this.f6940.m8023()) {
            m7916(this.f6940.m8027().m9512());
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private String[] m7907(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f6934.containsKey(lowerCase)) {
                hashSet.addAll(this.f6934.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7911(If ifR) {
        Cif r3;
        synchronized (this.f6941) {
            r3 = this.f6941.m14580(ifR);
        }
        if (r3 != null && this.f6937.m7920(r3.f6946) && this.f6940.m8023()) {
            m7916(this.f6940.m8027().m9512());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7914() {
        if (this.f6935.compareAndSet(false, true)) {
            this.f6940.m8039().execute(this.f6938);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7916(C1558 r8) {
        if (!r8.m9182()) {
            while (true) {
                try {
                    Lock r0 = this.f6940.m8036();
                    r0.lock();
                    try {
                        int[] r1 = this.f6937.m7921();
                        if (r1 == null) {
                            r0.unlock();
                            return;
                        }
                        int length = r1.length;
                        r8.m9176();
                        for (int i = 0; i < length; i++) {
                            int i2 = r1[i];
                            if (i2 == 1) {
                                m7909(r8, i);
                            } else if (i2 == 2) {
                                m7908(r8, i);
                            }
                        }
                        r8.m9172();
                        r8.m9177();
                        C1226 r12 = this.f6937;
                        synchronized (r12) {
                            r12.f6954 = false;
                        }
                        r0.unlock();
                    } catch (Throwable th) {
                        r0.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> LiveData<T> m7910(String[] strArr, Callable<T> callable) {
        C1188 r0 = this.f6943;
        String[] r7 = m7907(strArr);
        int length = r7.length;
        int i = 0;
        while (i < length) {
            String str = r7[i];
            if (this.f6939.containsKey(str.toLowerCase(Locale.US))) {
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        return new C1405(r0.f6808, r0, callable, r7);
    }

    /* renamed from: o.ɨӀ$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        final int[] f6946;

        /* renamed from: ɩ  reason: contains not printable characters */
        final If f6947;

        /* renamed from: Ι  reason: contains not printable characters */
        final Set<String> f6948;

        /* renamed from: ι  reason: contains not printable characters */
        final String[] f6949;

        Cif(If ifR, int[] iArr, String[] strArr) {
            this.f6947 = ifR;
            this.f6946 = iArr;
            this.f6949 = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f6949[0]);
                this.f6948 = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f6948 = null;
        }
    }

    /* renamed from: o.ɨӀ$If */
    public static abstract class If {

        /* renamed from: ι  reason: contains not printable characters */
        final String[] f6945;

        /* renamed from: ı  reason: contains not printable characters */
        public abstract void m7918(Set<String> set);

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public boolean m7919() {
            return false;
        }

        public If(String[] strArr) {
            this.f6945 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    /* renamed from: o.ɨӀ$ǃ  reason: contains not printable characters */
    static class C1226 {

        /* renamed from: ı  reason: contains not printable characters */
        final int[] f6950 = new int[2];

        /* renamed from: ǃ  reason: contains not printable characters */
        final boolean[] f6951 = new boolean[2];

        /* renamed from: ɩ  reason: contains not printable characters */
        final long[] f6952 = new long[2];

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f6953;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f6954;

        C1226() {
            Arrays.fill(this.f6952, 0);
            Arrays.fill(this.f6951, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m7922(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f6952[i];
                    this.f6952[i] = 1 + j;
                    if (j == 0) {
                        this.f6953 = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m7920(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f6952[i];
                    this.f6952[i] = j - 1;
                    if (j == 1) {
                        this.f6953 = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final int[] m7921() {
            synchronized (this) {
                if (this.f6953) {
                    if (!this.f6954) {
                        int length = this.f6952.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f6952[i] > 0;
                                if (z != this.f6951[i]) {
                                    int[] iArr = this.f6950;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f6950[i] = 0;
                                }
                                this.f6951[i] = z;
                                i++;
                            } else {
                                this.f6954 = true;
                                this.f6953 = false;
                                int[] iArr2 = this.f6950;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: o.ɨӀ$ɩ  reason: contains not printable characters */
    static class C1227 extends If {

        /* renamed from: ı  reason: contains not printable characters */
        final C1225 f6955;

        /* renamed from: ǃ  reason: contains not printable characters */
        final WeakReference<If> f6956;

        C1227(C1225 r2, If ifR) {
            super(ifR.f6945);
            this.f6955 = r2;
            this.f6956 = new WeakReference<>(ifR);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7923(Set<String> set) {
            If ifR = this.f6956.get();
            if (ifR == null) {
                this.f6955.m7911((If) this);
            } else {
                ifR.m7918(set);
            }
        }
    }
}
