package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o.ıͻ  reason: contains not printable characters */
public final class C0375 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final Object f3855 = new Object();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static C0375 f3856;

    /* renamed from: ı  reason: contains not printable characters */
    final HashMap<BroadcastReceiver, ArrayList<Cif>> f3857 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final HashMap<String, ArrayList<Cif>> f3858 = new HashMap<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    final ArrayList<C0376> f3859 = new ArrayList<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private final Handler f3860;

    /* renamed from: ι  reason: contains not printable characters */
    final Context f3861;

    /* renamed from: o.ıͻ$if  reason: invalid class name */
    static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        final BroadcastReceiver f3863;

        /* renamed from: ǃ  reason: contains not printable characters */
        final IntentFilter f3864;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f3865;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f3866;

        Cif(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3864 = intentFilter;
            this.f3863 = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3863);
            sb.append(" filter=");
            sb.append(this.f3864);
            if (this.f3866) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: o.ıͻ$ɩ  reason: contains not printable characters */
    static final class C0376 {

        /* renamed from: ɩ  reason: contains not printable characters */
        final ArrayList<Cif> f3867;

        /* renamed from: ι  reason: contains not printable characters */
        final Intent f3868;

        C0376(Intent intent, ArrayList<Cif> arrayList) {
            this.f3868 = intent;
            this.f3867 = arrayList;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0375 m4583(Context context) {
        C0375 r2;
        synchronized (f3855) {
            if (f3856 == null) {
                f3856 = new C0375(context.getApplicationContext());
            }
            r2 = f3856;
        }
        return r2;
    }

    private C0375(Context context) {
        this.f3861 = context;
        this.f3860 = new Handler(context.getMainLooper()) {
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
                if (r2 >= r1.length) goto L_0x000b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
                r3 = r1[r2];
                r4 = r3.f3867.size();
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
                if (r5 >= r4) goto L_0x004d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
                r6 = r3.f3867.get(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
                if (r6.f3866 != false) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
                r6.f3863.onReceive(r10.f3861, r3.f3868);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
                r5 = r5 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
                r2 = r2 + 1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r10) {
                /*
                    r9 = this;
                    int r0 = r10.what
                    r1 = 1
                    if (r0 == r1) goto L_0x0009
                    super.handleMessage(r10)
                    return
                L_0x0009:
                    o.ıͻ r10 = o.C0375.this
                L_0x000b:
                    java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.ıͻ$if>> r0 = r10.f3857
                    monitor-enter(r0)
                    java.util.ArrayList<o.ıͻ$ɩ> r1 = r10.f3859     // Catch:{ all -> 0x0050 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0050 }
                    if (r1 > 0) goto L_0x0018
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    return
                L_0x0018:
                    o.ıͻ$ɩ[] r1 = new o.C0375.C0376[r1]     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<o.ıͻ$ɩ> r2 = r10.f3859     // Catch:{ all -> 0x0050 }
                    r2.toArray(r1)     // Catch:{ all -> 0x0050 }
                    java.util.ArrayList<o.ıͻ$ɩ> r2 = r10.f3859     // Catch:{ all -> 0x0050 }
                    r2.clear()     // Catch:{ all -> 0x0050 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                    r0 = 0
                    r2 = 0
                L_0x0027:
                    int r3 = r1.length
                    if (r2 >= r3) goto L_0x000b
                    r3 = r1[r2]
                    java.util.ArrayList<o.ıͻ$if> r4 = r3.f3867
                    int r4 = r4.size()
                    r5 = 0
                L_0x0033:
                    if (r5 >= r4) goto L_0x004d
                    java.util.ArrayList<o.ıͻ$if> r6 = r3.f3867
                    java.lang.Object r6 = r6.get(r5)
                    o.ıͻ$if r6 = (o.C0375.Cif) r6
                    boolean r7 = r6.f3866
                    if (r7 != 0) goto L_0x004a
                    android.content.BroadcastReceiver r6 = r6.f3863
                    android.content.Context r7 = r10.f3861
                    android.content.Intent r8 = r3.f3868
                    r6.onReceive(r7, r8)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0033
                L_0x004d:
                    int r2 = r2 + 1
                    goto L_0x0027
                L_0x0050:
                    r10 = move-exception
                    monitor-exit(r0)
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C0375.AnonymousClass3.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4586(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f3857) {
            Cif ifVar = new Cif(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f3857.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f3857.put(broadcastReceiver, arrayList);
            }
            arrayList.add(ifVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f3858.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f3858.put(action, arrayList2);
                }
                arrayList2.add(ifVar);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4584(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3857) {
            ArrayList remove = this.f3857.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    Cif ifVar = (Cif) remove.get(size);
                    ifVar.f3866 = true;
                    for (int i = 0; i < ifVar.f3864.countActions(); i++) {
                        String action = ifVar.f3864.getAction(i);
                        ArrayList arrayList = this.f3858.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                Cif ifVar2 = (Cif) arrayList.get(size2);
                                if (ifVar2.f3863 == broadcastReceiver) {
                                    ifVar2.f3866 = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f3858.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        return false;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m4585(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o.ıͻ$if>> r2 = r1.f3857
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            android.content.Context r3 = r1.f3861     // Catch:{ all -> 0x00c6 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00c6 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00c6 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00c6 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00c6 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00c6 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            java.util.HashMap<java.lang.String, java.util.ArrayList<o.ıͻ$if>> r3 = r1.f3858     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00c6 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x00c3
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0041:
            int r3 = r8.size()     // Catch:{ all -> 0x00c6 }
            if (r7 >= r3) goto L_0x0093
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            r5 = r3
            o.ıͻ$if r5 = (o.C0375.Cif) r5     // Catch:{ all -> 0x00c6 }
            boolean r3 = r5.f3865     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x005d
            r19 = r7
            r20 = r8
            r18 = r10
            r21 = r11
            r11 = 1
            r10 = r6
            goto L_0x0088
        L_0x005d:
            android.content.IntentFilter r3 = r5.f3864     // Catch:{ all -> 0x00c6 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r10
            r10 = r6
            r6 = r13
            r19 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c6 }
            if (r3 < 0) goto L_0x0088
            if (r10 != 0) goto L_0x0081
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r6.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x0082
        L_0x0081:
            r6 = r10
        L_0x0082:
            r6.add(r15)     // Catch:{ all -> 0x00c6 }
            r15.f3865 = r11     // Catch:{ all -> 0x00c6 }
            goto L_0x0089
        L_0x0088:
            r6 = r10
        L_0x0089:
            int r7 = r19 + 1
            r10 = r18
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x0041
        L_0x0093:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x00c3
            r3 = 0
        L_0x0098:
            int r4 = r10.size()     // Catch:{ all -> 0x00c6 }
            if (r3 >= r4) goto L_0x00aa
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00c6 }
            o.ıͻ$if r4 = (o.C0375.Cif) r4     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r4.f3865 = r5     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00aa:
            java.util.ArrayList<o.ıͻ$ɩ> r3 = r1.f3859     // Catch:{ all -> 0x00c6 }
            o.ıͻ$ɩ r4 = new o.ıͻ$ɩ     // Catch:{ all -> 0x00c6 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00c6 }
            r3.add(r4)     // Catch:{ all -> 0x00c6 }
            android.os.Handler r0 = r1.f3860     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00c1
            android.os.Handler r0 = r1.f3860     // Catch:{ all -> 0x00c6 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x00c6 }
        L_0x00c1:
            monitor-exit(r2)     // Catch:{ all -> 0x00c6 }
            return r11
        L_0x00c3:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0375.m4585(android.content.Intent):boolean");
    }
}
