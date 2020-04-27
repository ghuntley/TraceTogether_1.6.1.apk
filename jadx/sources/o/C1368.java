package o;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: o.ɪʟ  reason: contains not printable characters */
class C1368 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public static final short[] f7555 = {10, 20, 30, 60, 120, 300};

    /* renamed from: ǃ  reason: contains not printable characters */
    static final Map<String, String> f7556 = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public Thread f7557;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Object f7558 = new Object();
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C1369 f7559;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1045 f7560;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f7561;

    /* renamed from: і  reason: contains not printable characters */
    private final Cif f7562;

    /* renamed from: o.ɪʟ$If */
    interface If {
        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m8493();
    }

    /* renamed from: o.ɪʟ$if  reason: invalid class name */
    interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        File[] m8494();

        /* renamed from: Ι  reason: contains not printable characters */
        File[] m8495();

        /* renamed from: ι  reason: contains not printable characters */
        File[] m8496();
    }

    /* renamed from: o.ɪʟ$ı  reason: contains not printable characters */
    interface C1369 {
        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m8497();
    }

    /* renamed from: o.ɪʟ$ɩ  reason: contains not printable characters */
    static final class C1371 implements If {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m8500() {
            return true;
        }

        C1371() {
        }
    }

    public C1368(String str, C1045 r3, Cif ifVar, C1369 r5) {
        if (r3 != null) {
            this.f7560 = r3;
            this.f7561 = str;
            this.f7562 = ifVar;
            this.f7559 = r5;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public synchronized void m8490(float f, If ifR) {
        if (this.f7557 != null) {
            C3263ac.m1563();
            return;
        }
        this.f7557 = new Thread(new C1370(f, ifR), "Crashlytics Report Uploader");
        this.f7557.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m8489() {
        return this.f7557 != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m8492(o.C1390 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7558
            monitor-enter(r0)
            r1 = 0
            o.Ɉǃ r2 = new o.Ɉǃ     // Catch:{ Exception -> 0x0021 }
            java.lang.String r3 = r4.f7561     // Catch:{ Exception -> 0x0021 }
            r2.<init>(r3, r5)     // Catch:{ Exception -> 0x0021 }
            o.ɉı r3 = r4.f7560     // Catch:{ Exception -> 0x0021 }
            boolean r2 = r3.m7298(r2)     // Catch:{ Exception -> 0x0021 }
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x0021 }
            r5.m8555()     // Catch:{ Exception -> 0x0021 }
            if (r2 == 0) goto L_0x0024
            r5.m8556()     // Catch:{ Exception -> 0x0021 }
            r5 = 1
            r1 = 1
            goto L_0x0024
        L_0x001f:
            r5 = move-exception
            goto L_0x0026
        L_0x0021:
            o.C3263ac.m1563()     // Catch:{ all -> 0x001f }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r1
        L_0x0026:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1368.m8492(o.ɪг):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public List<C1390> m8491() {
        File[] r1;
        File[] r2;
        File[] r3;
        C3263ac.m1563();
        synchronized (this.f7558) {
            r1 = this.f7562.m8494();
            r2 = this.f7562.m8495();
            r3 = this.f7562.m8496();
        }
        LinkedList linkedList = new LinkedList();
        if (r1 != null) {
            for (File file : r1) {
                C3263ac.m1563();
                file.getPath();
                linkedList.add(new C1480(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (r2 != null) {
            for (File file2 : r2) {
                String r8 = C1006.m7132(file2);
                if (!hashMap.containsKey(r8)) {
                    hashMap.put(r8, new LinkedList());
                }
                ((List) hashMap.get(r8)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            C3263ac.m1563();
            List list = (List) hashMap.get(str);
            linkedList.add(new C1118(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (r3 != null) {
            for (File r22 : r3) {
                linkedList.add(new C1213(r22));
            }
        }
        if (linkedList.isEmpty()) {
            C3263ac.m1563();
        }
        return linkedList;
    }

    /* renamed from: o.ɪʟ$ǃ  reason: contains not printable characters */
    class C1370 extends C3280at {

        /* renamed from: Ι  reason: contains not printable characters */
        private final float f7564;

        /* renamed from: ι  reason: contains not printable characters */
        private final If f7565;

        C1370(float f, If ifR) {
            this.f7564 = f;
            this.f7565 = ifR;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m8499() {
            try {
                m8498();
            } catch (Exception unused) {
                C3263ac.m1563();
            }
            Thread unused2 = C1368.this.f7557 = null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m8498() {
            C3263ac.m1563();
            float f = this.f7564;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<C1390> r0 = C1368.this.m8491();
            if (!C1368.this.f7559.m8497()) {
                if (r0.isEmpty() || this.f7565.m8493()) {
                    int i = 0;
                    while (!r0.isEmpty() && !C1368.this.f7559.m8497()) {
                        C3263ac.m1563();
                        r0.size();
                        for (C1390 r2 : r0) {
                            C1368.this.m8492(r2);
                        }
                        r0 = C1368.this.m8491();
                        if (!r0.isEmpty()) {
                            int i2 = i + 1;
                            C3263ac.m1563();
                            try {
                                Thread.sleep(((long) C1368.f7555[Math.min(i, C1368.f7555.length - 1)]) * 1000);
                                i = i2;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                C3263ac.m1563();
                r0.size();
                for (C1390 r1 : r0) {
                    r1.m8556();
                }
            }
        }
    }
}
