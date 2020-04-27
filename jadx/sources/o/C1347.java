package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: o.ɪɐ  reason: contains not printable characters */
public class C1347 extends C1513 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Queue<String> f7476 = new ArrayDeque(10);

    /* renamed from: ı  reason: contains not printable characters */
    public void m8439(String str, Exception exc) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8440() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8442(String str) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m8444(String str) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m8445(C1170 r1) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final Intent m8438(Intent intent) {
        return C1911.m10386().m10387();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8443(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!C1671.m9536(intent)) {
            return true;
        }
        C1671.m9539(intent);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        if (r1.equals("gcm") != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8441(android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.String r0 = r13.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x0059
        L_0x0017:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0029
            boolean r0 = o.C1671.m9536(r13)
            if (r0 == 0) goto L_0x0058
            o.C1671.m9545(r13)
            return
        L_0x0029:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "token"
            java.lang.String r13 = r13.getStringExtra(r0)
            r12.m8444((java.lang.String) r13)
            return
        L_0x003b:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r13 = r13.getAction()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r1 = r13.length()
            if (r1 == 0) goto L_0x0050
            java.lang.String r13 = r0.concat(r13)
            goto L_0x0055
        L_0x0050:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L_0x0055:
            android.util.Log.d(r2, r13)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r13.getStringExtra(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x006c
            o.ıə r3 = o.C0309.m4374(r4)
            goto L_0x007c
        L_0x006c:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r0, r1)
            o.էі r6 = o.C3074.m15678(r12)
            o.ıə r3 = r6.m15680(r5, r3)
        L_0x007c:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r7 = 1
            r8 = 3
            r9 = 0
            if (r6 == 0) goto L_0x0087
        L_0x0085:
            r1 = 0
            goto L_0x00c5
        L_0x0087:
            java.util.Queue<java.lang.String> r6 = f7476
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00b0
            boolean r6 = android.util.Log.isLoggable(r2, r8)
            if (r6 == 0) goto L_0x00ae
            java.lang.String r6 = "Received duplicate message: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00a6
            java.lang.String r1 = r6.concat(r1)
            goto L_0x00ab
        L_0x00a6:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
        L_0x00ab:
            android.util.Log.d(r2, r1)
        L_0x00ae:
            r1 = 1
            goto L_0x00c5
        L_0x00b0:
            java.util.Queue<java.lang.String> r6 = f7476
            int r6 = r6.size()
            r10 = 10
            if (r6 < r10) goto L_0x00bf
            java.util.Queue<java.lang.String> r6 = f7476
            r6.remove()
        L_0x00bf:
            java.util.Queue<java.lang.String> r6 = f7476
            r6.add(r1)
            goto L_0x0085
        L_0x00c5:
            if (r1 != 0) goto L_0x01bf
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r13.getStringExtra(r1)
            java.lang.String r6 = "gcm"
            if (r1 != 0) goto L_0x00d2
            r1 = r6
        L_0x00d2:
            r10 = -1
            int r11 = r1.hashCode()
            switch(r11) {
                case -2062414158: goto L_0x00f6;
                case 102161: goto L_0x00ef;
                case 814694033: goto L_0x00e5;
                case 814800675: goto L_0x00db;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x0100
        L_0x00db:
            java.lang.String r6 = "send_event"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0100
            r9 = 2
            goto L_0x0101
        L_0x00e5:
            java.lang.String r6 = "send_error"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0100
            r9 = 3
            goto L_0x0101
        L_0x00ef:
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0100
            goto L_0x0101
        L_0x00f6:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0100
            r9 = 1
            goto L_0x0101
        L_0x0100:
            r9 = -1
        L_0x0101:
            if (r9 == 0) goto L_0x014b
            if (r9 == r7) goto L_0x0146
            if (r9 == r5) goto L_0x013d
            if (r9 == r8) goto L_0x0121
            java.lang.String r13 = "Received message with unknown type: "
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0116
            java.lang.String r13 = r13.concat(r1)
            goto L_0x011c
        L_0x0116:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13)
            r13 = r0
        L_0x011c:
            android.util.Log.w(r2, r13)
            goto L_0x01bf
        L_0x0121:
            java.lang.String r0 = r13.getStringExtra(r0)
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r13.getStringExtra(r0)
        L_0x012d:
            o.ɀȷ r1 = new o.ɀȷ
            java.lang.String r4 = "error"
            java.lang.String r13 = r13.getStringExtra(r4)
            r1.<init>(r13)
            r12.m8439(r0, r1)
            goto L_0x01bf
        L_0x013d:
            java.lang.String r13 = r13.getStringExtra(r0)
            r12.m8442((java.lang.String) r13)
            goto L_0x01bf
        L_0x0146:
            r12.m8440()
            goto L_0x01bf
        L_0x014b:
            boolean r0 = o.C1671.m9536(r13)
            if (r0 == 0) goto L_0x0154
            o.C1671.m9546(r13, r4)
        L_0x0154:
            boolean r0 = o.C1671.m9543(r13)
            if (r0 == 0) goto L_0x0177
            o.ͽı r0 = com.google.firebase.messaging.FirebaseMessaging.f998
            if (r0 == 0) goto L_0x0172
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r4 = "json"
            o.ͷ r4 = o.C1733.m9755(r4)
            o.ͼǃ r5 = o.C1838.f9434
            java.lang.String r6 = "FCM_CLIENT_EVENT_LOGGING"
            o.Ζ r0 = r0.m9834(r6, r1, r4, r5)
            o.C1671.m9546(r13, r0)
            goto L_0x0177
        L_0x0172:
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r2, r0)
        L_0x0177:
            android.os.Bundle r0 = r13.getExtras()
            if (r0 != 0) goto L_0x0182
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0182:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = o.C3575lq.m3644((android.os.Bundle) r0)
            if (r1 == 0) goto L_0x01b7
            o.lq r1 = new o.lq
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor()
            o.ɪа r5 = new o.ɪа
            r5.<init>(r12, r1, r4)
            boolean r1 = r5.m8549()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x01a5
            r4.shutdown()
            goto L_0x01bf
        L_0x01a5:
            r4.shutdown()
            boolean r1 = o.C1671.m9536(r13)
            if (r1 == 0) goto L_0x01b7
            o.C1671.m9532(r13)
            goto L_0x01b7
        L_0x01b2:
            r13 = move-exception
            r4.shutdown()
            throw r13
        L_0x01b7:
            o.ɟյ r13 = new o.ɟյ
            r13.<init>(r0)
            r12.m8445((o.C1170) r13)
        L_0x01bf:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x01d1, InterruptedException -> 0x01cf, TimeoutException -> 0x01cd }
            r0 = 1
            long r0 = r13.toMillis(r0)     // Catch:{ ExecutionException -> 0x01d1, InterruptedException -> 0x01cf, TimeoutException -> 0x01cd }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x01d1, InterruptedException -> 0x01cf, TimeoutException -> 0x01cd }
            o.C0309.m4372(r3, r0, r13)     // Catch:{ ExecutionException -> 0x01d1, InterruptedException -> 0x01cf, TimeoutException -> 0x01cd }
            return
        L_0x01cd:
            r13 = move-exception
            goto L_0x01d2
        L_0x01cf:
            r13 = move-exception
            goto L_0x01d2
        L_0x01d1:
            r13 = move-exception
        L_0x01d2:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r0 = r13.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            android.util.Log.w(r2, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1347.m8441(android.content.Intent):void");
    }
}
