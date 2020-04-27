package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C2226;

/* renamed from: o.ΣΙ  reason: contains not printable characters */
public final class C1917 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static PendingIntent f9667;

    /* renamed from: Ι  reason: contains not printable characters */
    private static int f9668;

    /* renamed from: ı  reason: contains not printable characters */
    private final C1799 f9669;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2226 f9670;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0910<String, C3203<Bundle>> f9671 = new C0910<>();

    /* renamed from: ɹ  reason: contains not printable characters */
    private Messenger f9672;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f9673;

    /* renamed from: і  reason: contains not printable characters */
    private Messenger f9674;

    public C1917(Context context, C1799 r3) {
        this.f9673 = context;
        this.f9669 = r3;
        this.f9674 = new Messenger(new C1852(this, Looper.getMainLooper()));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static synchronized void m10409(Context context, Intent intent) {
        synchronized (C1917.class) {
            if (f9667 == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f9667 = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f9667);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10413(String str, Bundle bundle) {
        synchronized (this.f9671) {
            C3203 remove = this.f9671.remove(str);
            if (remove != null) {
                remove.f14555.m6079(bundle);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Bundle m10414(Bundle bundle) {
        if (this.f9669.m9980() < 12000000) {
            return m10411(bundle);
        }
        C3074 r0 = C3074.m15678(this.f9673);
        try {
            return (Bundle) C0309.m4376(r0.m15679(new C1598(r0.m15681(), bundle)));
        } catch (InterruptedException | ExecutionException e) {
            if (!(e.getCause() instanceof C1669) || ((C1669) e.getCause()).f8681 != 4) {
                return null;
            }
            return m10411(bundle);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final Bundle m10411(Bundle bundle) {
        Bundle r0 = m10408(bundle);
        if (r0 == null || !r0.containsKey("google.messenger")) {
            return r0;
        }
        Bundle r02 = m10408(bundle);
        if (r02 == null || !r02.containsKey("google.messenger")) {
            return r02;
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static synchronized String m10412() {
        String num;
        synchronized (C1917.class) {
            int i = f9668;
            f9668 = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: ı  reason: contains not printable characters */
    private final android.os.Bundle m10408(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = m10412()
            o.ւɹ r1 = new o.ւɹ
            r1.<init>()
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r2 = r6.f9671
            monitor-enter(r2)
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r3 = r6.f9671     // Catch:{ all -> 0x00f5 }
            r3.put(r0, r1)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00f5 }
            o.ΙƩ r2 = r6.f9669
            int r2 = r2.m9979()
            if (r2 == 0) goto L_0x00ed
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            o.ΙƩ r3 = r6.f9669
            int r3 = r3.m9979()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r7)
            android.content.Context r7 = r6.f9673
            m10409(r7, r2)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            int r7 = r7 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            java.lang.String r7 = "|ID|"
            r3.append(r7)
            r3.append(r0)
            java.lang.String r7 = "|"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r7)
            r7 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r7 = android.util.Log.isLoggable(r3, r7)
            if (r7 == 0) goto L_0x0071
            r2.getExtras()
        L_0x0071:
            android.os.Messenger r7 = r6.f9674
            java.lang.String r3 = "google.messenger"
            r2.putExtra(r3, r7)
            android.os.Messenger r7 = r6.f9672
            if (r7 != 0) goto L_0x0080
            o.ІƩ r7 = r6.f9670
            if (r7 == 0) goto L_0x00a3
        L_0x0080:
            android.os.Message r7 = android.os.Message.obtain()
            r7.obj = r2
            android.os.Messenger r3 = r6.f9672     // Catch:{ RemoteException -> 0x00a2 }
            if (r3 == 0) goto L_0x0090
            android.os.Messenger r3 = r6.f9672     // Catch:{ RemoteException -> 0x00a2 }
            r3.send(r7)     // Catch:{ RemoteException -> 0x00a2 }
            goto L_0x00b6
        L_0x0090:
            o.ІƩ r3 = r6.f9670     // Catch:{ RemoteException -> 0x00a2 }
            android.os.Messenger r5 = r3.f10509     // Catch:{ RemoteException -> 0x00a2 }
            if (r5 == 0) goto L_0x009c
            android.os.Messenger r3 = r3.f10509     // Catch:{ RemoteException -> 0x00a2 }
            r3.send(r7)     // Catch:{ RemoteException -> 0x00a2 }
            goto L_0x00b6
        L_0x009c:
            o.ӀԼ r3 = r3.f10510     // Catch:{ RemoteException -> 0x00a2 }
            r3.m14833(r7)     // Catch:{ RemoteException -> 0x00a2 }
            goto L_0x00b6
        L_0x00a2:
        L_0x00a3:
            o.ΙƩ r7 = r6.f9669
            int r7 = r7.m9979()
            if (r7 != r4) goto L_0x00b1
            android.content.Context r7 = r6.f9673
            r7.sendBroadcast(r2)
            goto L_0x00b6
        L_0x00b1:
            android.content.Context r7 = r6.f9673
            r7.startService(r2)
        L_0x00b6:
            o.ƨɹ<TResult> r7 = r1.f14555     // Catch:{ InterruptedException | TimeoutException -> 0x00d8, ExecutionException -> 0x00d1 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00d8, ExecutionException -> 0x00d1 }
            java.lang.Object r7 = o.C0309.m4372(r7, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00d8, ExecutionException -> 0x00d1 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ InterruptedException | TimeoutException -> 0x00d8, ExecutionException -> 0x00d1 }
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r1 = r6.f9671
            monitor-enter(r1)
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r2 = r6.f9671     // Catch:{ all -> 0x00cc }
            r2.remove(r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r1)     // Catch:{ all -> 0x00cc }
            return r7
        L_0x00cc:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x00cf:
            r7 = move-exception
            goto L_0x00e0
        L_0x00d1:
            r7 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00cf }
            r1.<init>(r7)     // Catch:{ all -> 0x00cf }
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00d8:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "TIMEOUT"
            r7.<init>(r1)     // Catch:{ all -> 0x00cf }
            throw r7     // Catch:{ all -> 0x00cf }
        L_0x00e0:
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r1 = r6.f9671
            monitor-enter(r1)
            o.ǃɹ<java.lang.String, o.ւɹ<android.os.Bundle>> r2 = r6.f9671     // Catch:{ all -> 0x00ea }
            r2.remove(r0)     // Catch:{ all -> 0x00ea }
            monitor-exit(r1)     // Catch:{ all -> 0x00ea }
            throw r7
        L_0x00ea:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x00ed:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r7.<init>(r0)
            throw r7
        L_0x00f5:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1917.m10408(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m10410(C1917 r5, Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new C2226.C2227());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof C2226) {
                    r5.f9670 = (C2226) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    r5.f9672 = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        intent2.getExtras();
                    } else if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            r5.m10413(str, intent2.putExtra("error", str2).getExtras());
                        }
                    } else {
                        synchronized (r5.f9671) {
                            for (int i = 0; i < r5.f9671.size(); i++) {
                                r5.m10413((String) r5.f9671.f5784[i << 1], intent2.getExtras());
                            }
                        }
                    }
                } else {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        r5.m10413(group, extras);
                    }
                }
            }
        }
    }
}
