package o;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.HashMap;
import o.C1235;

/* renamed from: o.ɩɍ  reason: contains not printable characters */
public class C1253 extends Service {

    /* renamed from: ı  reason: contains not printable characters */
    int f7081 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1235.C1236 f7082 = new C1235.C1236() {
        /* renamed from: ι  reason: contains not printable characters */
        public final int m8082(C1217 r6, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (C1253.this.f7083) {
                C1253 r2 = C1253.this;
                int i = r2.f7081 + 1;
                r2.f7081 = i;
                if (C1253.this.f7083.register(r6, Integer.valueOf(i))) {
                    C1253.this.f7084.put(Integer.valueOf(i), str);
                    return i;
                }
                C1253 r62 = C1253.this;
                r62.f7081--;
                return 0;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m8084(C1217 r3, int i) {
            synchronized (C1253.this.f7083) {
                C1253.this.f7083.unregister(r3);
                C1253.this.f7084.remove(Integer.valueOf(i));
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m8083(int i, String[] strArr) {
            synchronized (C1253.this.f7083) {
                String str = C1253.this.f7084.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = C1253.this.f7083.beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) C1253.this.f7083.getBroadcastCookie(i2)).intValue();
                            String str2 = C1253.this.f7084.get(Integer.valueOf(intValue));
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    C1253.this.f7083.getBroadcastItem(i2).m7891(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            C1253.this.f7083.finishBroadcast();
                            throw th;
                        }
                    }
                    C1253.this.f7083.finishBroadcast();
                }
            }
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    final RemoteCallbackList<C1217> f7083 = new RemoteCallbackList<C1217>() {
        public final /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
            C1253.this.f7084.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    final HashMap<Integer, String> f7084 = new HashMap<>();

    public IBinder onBind(Intent intent) {
        return this.f7082;
    }
}
