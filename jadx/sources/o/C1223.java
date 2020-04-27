package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C1217;
import o.C1225;
import o.C1235;

/* renamed from: o.ɨі  reason: contains not printable characters */
final class C1223 implements ServiceConnection, Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    final C1225.If f6913;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C1217 f6914 = new C1217.C1218() {
        /* renamed from: ι  reason: contains not printable characters */
        public final void m7904(final String[] strArr) {
            C1223.this.f6924.execute(new Runnable() {
                public final void run() {
                    C1225 r0 = C1223.this.f6915;
                    String[] strArr = strArr;
                    synchronized (r0.f6941) {
                        Iterator<Map.Entry<C1225.If, C1225.Cif>> it = r0.f6941.iterator();
                        while (it.hasNext()) {
                            Map.Entry next = it.next();
                            if (!((C1225.If) next.getKey()).m7919()) {
                                C1225.Cif ifVar = (C1225.Cif) next.getValue();
                                Set<String> set = null;
                                if (ifVar.f6949.length == 1) {
                                    int length = strArr.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        } else if (strArr[i].equalsIgnoreCase(ifVar.f6949[0])) {
                                            set = ifVar.f6948;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    HashSet hashSet = new HashSet();
                                    for (String str : strArr) {
                                        String[] strArr2 = ifVar.f6949;
                                        int length2 = strArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                break;
                                            }
                                            String str2 = strArr2[i2];
                                            if (str2.equalsIgnoreCase(str)) {
                                                hashSet.add(str2);
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    if (hashSet.size() > 0) {
                                        set = hashSet;
                                    }
                                }
                                if (set != null) {
                                    ifVar.f6947.m7918(set);
                                }
                            }
                        }
                    }
                }
            });
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1225 f6915;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Runnable f6916 = new Runnable() {
        public final void run() {
            C1223.this.f6915.m7911(C1223.this.f6913);
            try {
                C1235 r0 = C1223.this.f6923;
                if (r0 != null) {
                    r0.m7986(C1223.this.f6914, C1223.this.f6920);
                }
            } catch (RemoteException unused) {
            }
            C1223.this.f6921.unbindService(C1223.this.f6922);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f6917;

    /* renamed from: ɹ  reason: contains not printable characters */
    final AtomicBoolean f6918 = new AtomicBoolean(false);

    /* renamed from: ɾ  reason: contains not printable characters */
    final Runnable f6919 = new Runnable() {
        public final void run() {
            C1223.this.f6915.m7911(C1223.this.f6913);
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    int f6920;

    /* renamed from: ι  reason: contains not printable characters */
    final Context f6921;

    /* renamed from: І  reason: contains not printable characters */
    final ServiceConnection f6922 = this;

    /* renamed from: і  reason: contains not printable characters */
    C1235 f6923;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final Executor f6924;

    /* renamed from: ӏ  reason: contains not printable characters */
    final Runnable f6925 = this;

    C1223(Context context, String str, C1225 r5, Executor executor) {
        this.f6921 = context.getApplicationContext();
        this.f6917 = str;
        this.f6915 = r5;
        this.f6924 = executor;
        this.f6913 = new C1225.If(r5.f6933) {
            /* access modifiers changed from: package-private */
            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m7906() {
                return true;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m7905(Set<String> set) {
                if (!C1223.this.f6918.get()) {
                    try {
                        C1235 r0 = C1223.this.f6923;
                        if (r0 != null) {
                            r0.m7985(C1223.this.f6920, (String[]) set.toArray(new String[0]));
                        }
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        this.f6921.bindService(new Intent(this.f6921, C1253.class), this.f6922, 1);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1235 r2;
        if (iBinder == null) {
            r2 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1235)) {
                r2 = new C1235.C1236.C1237(iBinder);
            } else {
                r2 = (C1235) queryLocalInterface;
            }
        }
        this.f6923 = r2;
        this.f6924.execute(this.f6925);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6924.execute(this.f6919);
        this.f6923 = null;
    }

    public final void run() {
        try {
            C1235 r0 = this.f6923;
            if (r0 != null) {
                this.f6920 = r0.m7984(this.f6914, this.f6917);
                this.f6915.m7912(this.f6913);
            }
        } catch (RemoteException unused) {
        }
    }
}
