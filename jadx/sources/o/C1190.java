package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o.C1283;
import o.C1284;
import o.C1329;
import o.C2745;

/* renamed from: o.ɨŀ  reason: contains not printable characters */
public abstract class C1190<T extends IInterface> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final String[] f6809 = {"service_esmobile", "service_googleme"};

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2847[] f6810 = new C2847[0];
    /* access modifiers changed from: private */

    /* renamed from: ŀ  reason: contains not printable characters */
    public C1284 f6811;

    /* renamed from: ł  reason: contains not printable characters */
    private T f6812;
    /* access modifiers changed from: private */

    /* renamed from: ſ  reason: contains not printable characters */
    public final C1191 f6813;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f6814;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C3640iF f6815;

    /* renamed from: ƚ  reason: contains not printable characters */
    private final int f6816;

    /* renamed from: ǀ  reason: contains not printable characters */
    private final String f6817;

    /* renamed from: ǃ  reason: contains not printable characters */
    protected AtomicInteger f6818;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Looper f6819;

    /* renamed from: ɍ  reason: contains not printable characters */
    private int f6820;
    /* access modifiers changed from: private */

    /* renamed from: ɟ  reason: contains not printable characters */
    public C2822 f6821;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C2837 f6822;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Handler f6823;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Context f6824;

    /* renamed from: ɹ  reason: contains not printable characters */
    private long f6825;
    /* access modifiers changed from: private */

    /* renamed from: ɺ  reason: contains not printable characters */
    public boolean f6826;

    /* renamed from: ɼ  reason: contains not printable characters */
    private volatile C1633 f6827;

    /* renamed from: ɾ  reason: contains not printable characters */
    private C1720 f6828;
    /* access modifiers changed from: private */

    /* renamed from: ɿ  reason: contains not printable characters */
    public final ArrayList<C1195<?>> f6829;
    /* access modifiers changed from: private */

    /* renamed from: ʅ  reason: contains not printable characters */
    public final C1193 f6830;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final Object f6831;

    /* renamed from: ι  reason: contains not printable characters */
    protected C3638If f6832;

    /* renamed from: І  reason: contains not printable characters */
    private int f6833;
    /* access modifiers changed from: private */

    /* renamed from: г  reason: contains not printable characters */
    public final Object f6834;

    /* renamed from: і  reason: contains not printable characters */
    private long f6835;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private long f6836;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C1283 f6837;

    /* renamed from: o.ɨŀ$If  reason: case insensitive filesystem */
    public interface C3638If {
        /* renamed from: ı  reason: contains not printable characters */
        void m7791(C2822 r1);
    }

    /* renamed from: o.ɨŀ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m7794();
    }

    /* renamed from: o.ɨŀ$ı  reason: contains not printable characters */
    public interface C1191 {
        /* renamed from: ı  reason: contains not printable characters */
        void m7795(Bundle bundle);

        /* renamed from: ι  reason: contains not printable characters */
        void m7796(int i);
    }

    /* renamed from: o.ɨŀ$ɩ  reason: contains not printable characters */
    public interface C1193 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m7798(C2822 r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7754(int i, T t) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7756() {
        return false;
    }

    /* renamed from: ł  reason: contains not printable characters */
    public Account m7758() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ſ  reason: contains not printable characters */
    public boolean m7759() {
        return false;
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public boolean m7761() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɨ  reason: contains not printable characters */
    public String m7769() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɪ  reason: contains not printable characters */
    public String m7773() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public abstract String m7774();

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract T m7778(IBinder iBinder);

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m7781() {
        return true;
    }

    /* renamed from: г  reason: contains not printable characters */
    public Bundle m7784() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ӏ  reason: contains not printable characters */
    public abstract String m7787();

    public C1190(Context context, Looper looper, int i, C1191 r13, C1193 r14, String str) {
        this(context, looper, C1283.m8197(context), C2837.m14802(), i, (C1191) C2745.C2746.m14555(r13), (C1193) C2745.C2746.m14555(r14), str);
    }

    /* renamed from: o.ɨŀ$aUx */
    public final class aUx extends IF {
        public aUx(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m7792(C2822 r2) {
            if (!C1190.this.m7759() || !C1190.this.m7742()) {
                C1190.this.f6832.m7791(r2);
                C1190.this.m7771(r2);
                return;
            }
            C1190.this.m7747(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m7793() {
            C1190.this.f6832.m7791(C2822.f13245);
            return true;
        }
    }

    /* renamed from: o.ɨŀ$aux  reason: case insensitive filesystem */
    final class C3639aux extends C0527 {
        public C3639aux(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                o.ɨŀ r0 = o.C1190.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f6818
                int r0 = r0.get()
                int r1 = r11.arg1
                r2 = 0
                r3 = 7
                r4 = 2
                r5 = 1
                if (r0 == r1) goto L_0x0027
                int r0 = r11.what
                if (r0 == r4) goto L_0x001c
                int r0 = r11.what
                if (r0 == r5) goto L_0x001c
                int r0 = r11.what
                if (r0 != r3) goto L_0x001d
            L_0x001c:
                r2 = 1
            L_0x001d:
                if (r2 == 0) goto L_0x0026
                java.lang.Object r11 = r11.obj
                o.ɨŀ$ι r11 = (o.C1190.C1195) r11
                r11.m7802()
            L_0x0026:
                return
            L_0x0027:
                int r0 = r11.what
                r1 = 4
                r6 = 5
                if (r0 == r5) goto L_0x0041
                int r0 = r11.what
                if (r0 == r3) goto L_0x0041
                int r0 = r11.what
                if (r0 != r1) goto L_0x003d
                o.ɨŀ r0 = o.C1190.this
                boolean r0 = r0.m7759()
                if (r0 == 0) goto L_0x0041
            L_0x003d:
                int r0 = r11.what
                if (r0 != r6) goto L_0x0051
            L_0x0041:
                o.ɨŀ r0 = o.C1190.this
                boolean r0 = r0.m7772()
                if (r0 != 0) goto L_0x0051
                java.lang.Object r11 = r11.obj
                o.ɨŀ$ι r11 = (o.C1190.C1195) r11
                r11.m7802()
                return
            L_0x0051:
                int r0 = r11.what
                r7 = 8
                r8 = 3
                r9 = 0
                if (r0 != r1) goto L_0x009c
                o.ɨŀ r0 = o.C1190.this
                o.Ӏϲ r1 = new o.Ӏϲ
                int r11 = r11.arg2
                r1.<init>(r11)
                o.C2822 unused = r0.f6821 = r1
                o.ɨŀ r11 = o.C1190.this
                boolean r11 = r11.m7742()
                if (r11 == 0) goto L_0x007b
                o.ɨŀ r11 = o.C1190.this
                boolean r11 = r11.f6826
                if (r11 != 0) goto L_0x007b
                o.ɨŀ r11 = o.C1190.this
                r11.m7748((int) r8, null)
                return
            L_0x007b:
                o.ɨŀ r11 = o.C1190.this
                o.Ӏϲ r11 = r11.f6821
                if (r11 == 0) goto L_0x008a
                o.ɨŀ r11 = o.C1190.this
                o.Ӏϲ r11 = r11.f6821
                goto L_0x008f
            L_0x008a:
                o.Ӏϲ r11 = new o.Ӏϲ
                r11.<init>(r7)
            L_0x008f:
                o.ɨŀ r0 = o.C1190.this
                o.ɨŀ$If r0 = r0.f6832
                r0.m7791(r11)
                o.ɨŀ r0 = o.C1190.this
                r0.m7771((o.C2822) r11)
                return
            L_0x009c:
                int r0 = r11.what
                if (r0 != r6) goto L_0x00c1
                o.ɨŀ r11 = o.C1190.this
                o.Ӏϲ r11 = r11.f6821
                if (r11 == 0) goto L_0x00af
                o.ɨŀ r11 = o.C1190.this
                o.Ӏϲ r11 = r11.f6821
                goto L_0x00b4
            L_0x00af:
                o.Ӏϲ r11 = new o.Ӏϲ
                r11.<init>(r7)
            L_0x00b4:
                o.ɨŀ r0 = o.C1190.this
                o.ɨŀ$If r0 = r0.f6832
                r0.m7791(r11)
                o.ɨŀ r0 = o.C1190.this
                r0.m7771((o.C2822) r11)
                return
            L_0x00c1:
                int r0 = r11.what
                if (r0 != r8) goto L_0x00e4
                java.lang.Object r0 = r11.obj
                boolean r0 = r0 instanceof android.app.PendingIntent
                if (r0 == 0) goto L_0x00d0
                java.lang.Object r0 = r11.obj
                r9 = r0
                android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            L_0x00d0:
                o.Ӏϲ r0 = new o.Ӏϲ
                int r11 = r11.arg2
                r0.<init>(r11, r9)
                o.ɨŀ r11 = o.C1190.this
                o.ɨŀ$If r11 = r11.f6832
                r11.m7791(r0)
                o.ɨŀ r11 = o.C1190.this
                r11.m7771((o.C2822) r0)
                return
            L_0x00e4:
                int r0 = r11.what
                r1 = 6
                if (r0 != r1) goto L_0x010e
                o.ɨŀ r0 = o.C1190.this
                r0.m7748((int) r6, null)
                o.ɨŀ r0 = o.C1190.this
                o.ɨŀ$ı r0 = r0.f6813
                if (r0 == 0) goto L_0x0101
                o.ɨŀ r0 = o.C1190.this
                o.ɨŀ$ı r0 = r0.f6813
                int r1 = r11.arg2
                r0.m7796(r1)
            L_0x0101:
                o.ɨŀ r0 = o.C1190.this
                int r11 = r11.arg2
                r0.m7782((int) r11)
                o.ɨŀ r11 = o.C1190.this
                boolean unused = r11.m7749((int) r6, (int) r5, r9)
                return
            L_0x010e:
                int r0 = r11.what
                if (r0 != r4) goto L_0x0122
                o.ɨŀ r0 = o.C1190.this
                boolean r0 = r0.m7783()
                if (r0 != 0) goto L_0x0122
                java.lang.Object r11 = r11.obj
                o.ɨŀ$ι r11 = (o.C1190.C1195) r11
                r11.m7802()
                return
            L_0x0122:
                int r0 = r11.what
                if (r0 == r4) goto L_0x012e
                int r0 = r11.what
                if (r0 == r5) goto L_0x012e
                int r0 = r11.what
                if (r0 != r3) goto L_0x012f
            L_0x012e:
                r2 = 1
            L_0x012f:
                if (r2 == 0) goto L_0x0139
                java.lang.Object r11 = r11.obj
                o.ɨŀ$ι r11 = (o.C1190.C1195) r11
                r11.m7803()
                return
            L_0x0139:
                int r11 = r11.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r11, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1190.C3639aux.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: o.ɨŀ$iF  reason: case insensitive filesystem */
    public final class C3640iF implements ServiceConnection {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f6843;

        public C3640iF(int i) {
            this.f6843 = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1284 r1;
            if (iBinder == null) {
                C1190.this.m7747(16);
                return;
            }
            synchronized (C1190.this.f6834) {
                C1190 r0 = C1190.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C1284)) {
                    r1 = new C1284.C1285.If(iBinder);
                } else {
                    r1 = (C1284) queryLocalInterface;
                }
                C1284 unused = r0.f6811 = r1;
            }
            C1190.this.m7753(0, (Bundle) null, this.f6843);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C1190.this.f6834) {
                C1284 unused = C1190.this.f6811 = null;
            }
            C1190.this.f6823.sendMessage(C1190.this.f6823.obtainMessage(6, this.f6843, 1));
        }
    }

    /* renamed from: o.ɨŀ$Ι  reason: contains not printable characters */
    public static final class C1194 extends C1329.C1330 {

        /* renamed from: ı  reason: contains not printable characters */
        private C1190 f6846;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f6847;

        public C1194(C1190 r1, int i) {
            this.f6846 = r1;
            this.f6847 = i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7799(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7801(int i, IBinder iBinder, Bundle bundle) {
            C1190 r0 = this.f6846;
            if (r0 != null) {
                r0.m7779(i, iBinder, bundle, this.f6847);
                this.f6846 = null;
                return;
            }
            throw new NullPointerException("onPostInitComplete can be called only once per call to getRemoteService");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7800(int i, IBinder iBinder, C1633 r4) {
            C1190 r0 = this.f6846;
            if (r0 == null) {
                throw new NullPointerException("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            } else if (r4 != null) {
                r0.m7736(r4);
                m7801(i, iBinder, r4.f8593);
            } else {
                throw new NullPointerException("null reference");
            }
        }
    }

    /* renamed from: o.ɨŀ$ι  reason: contains not printable characters */
    public abstract class C1195<TListener> {

        /* renamed from: ɩ  reason: contains not printable characters */
        private TListener f6849;

        public C1195(TListener tlistener) {
            this.f6849 = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public abstract void m7805(TListener tlistener);

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7803() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6849;
            }
            if (tlistener != null) {
                try {
                    m7805(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
            }
            m7802();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m7804() {
            synchronized (this) {
                this.f6849 = null;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7802() {
            synchronized (this) {
                this.f6849 = null;
            }
            synchronized (C1190.this.f6829) {
                C1190.this.f6829.remove(this);
            }
        }
    }

    /* renamed from: o.ɨŀ$і  reason: contains not printable characters */
    public final class C1196 extends IF {

        /* renamed from: ι  reason: contains not printable characters */
        private final IBinder f6851;

        public C1196(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f6851 = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m7806(C2822 r2) {
            if (C1190.this.f6830 != null) {
                C1190.this.f6830.m7798(r2);
            }
            C1190.this.m7771(r2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m7807() {
            try {
                if (!C1190.this.m7787().equals(this.f6851.getInterfaceDescriptor())) {
                    C1190.this.m7787();
                    return false;
                }
                IInterface r1 = C1190.this.m7778(this.f6851);
                if (r1 == null) {
                    return false;
                }
                if (!C1190.this.m7749(2, 4, r1) && !C1190.this.m7749(3, 4, r1)) {
                    return false;
                }
                C2822 unused = C1190.this.f6821 = null;
                Bundle r0 = C1190.this.m7784();
                if (C1190.this.f6813 != null) {
                    C1190.this.f6813.m7795(r0);
                }
                return true;
            } catch (RemoteException unused2) {
                return false;
            }
        }
    }

    /* renamed from: o.ɨŀ$IF */
    abstract class IF extends C1195<Boolean> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f6838;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Bundle f6839;

        protected IF(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f6838 = i;
            this.f6839 = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m7788(C2822 r1);

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public abstract boolean m7790();

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void m7789(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                o.ɨŀ r5 = o.C1190.this
                r5.m7748((int) r0, null)
                return
            L_0x000c:
                int r5 = r4.f6838
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                o.ɨŀ r5 = o.C1190.this
                r5.m7748((int) r0, null)
                android.os.Bundle r5 = r4.f6839
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                o.Ӏϲ r5 = new o.Ӏϲ
                int r0 = r4.f6838
                r5.<init>(r0, r1)
                r4.m7788(r5)
                goto L_0x0076
            L_0x0031:
                o.ɨŀ r5 = o.C1190.this
                r5.m7748((int) r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                o.ɨŀ r2 = o.C1190.this
                java.lang.String r2 = r2.m7774()
                r1[r0] = r2
                r0 = 2
                o.ɨŀ r2 = o.C1190.this
                java.lang.String r2 = r2.m7787()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.m7790()
                if (r5 != 0) goto L_0x0076
                o.ɨŀ r5 = o.C1190.this
                r5.m7748((int) r0, null)
                o.Ӏϲ r5 = new o.Ӏϲ
                r0 = 8
                r5.<init>(r0, r1)
                r4.m7788(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1190.IF.m7789(java.lang.Object):void");
        }
    }

    protected C1190(Context context, Looper looper, C1283 r5, C2837 r6, int i, C1191 r8, C1193 r9, String str) {
        this.f6831 = new Object();
        this.f6834 = new Object();
        this.f6829 = new ArrayList<>();
        this.f6820 = 1;
        this.f6821 = null;
        this.f6826 = false;
        this.f6827 = null;
        this.f6818 = new AtomicInteger(0);
        this.f6824 = (Context) C2745.C2746.m14559(context, "Context must not be null");
        this.f6819 = (Looper) C2745.C2746.m14559(looper, "Looper must not be null");
        this.f6837 = (C1283) C2745.C2746.m14559(r5, "Supervisor must not be null");
        this.f6822 = (C2837) C2745.C2746.m14559(r6, "API availability must not be null");
        this.f6823 = new C3639aux(looper);
        this.f6816 = i;
        this.f6813 = r8;
        this.f6830 = r9;
        this.f6817 = str;
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    private final String m7743() {
        String str = this.f6817;
        return str == null ? this.f6824.getClass().getName() : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7736(C1633 r1) {
        this.f6827 = r1;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2847[] m7760() {
        C1633 r0 = this.f6827;
        if (r0 == null) {
            return null;
        }
        return r0.f8594;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7755(T t) {
        this.f6836 = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m7782(int i) {
        this.f6833 = i;
        this.f6825 = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7771(C2822 r3) {
        this.f6814 = r3.m14747();
        this.f6835 = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7748(int i, T t) {
        C1720 r14;
        C2745.C2746.m14563((i == 4) == (t != null));
        synchronized (this.f6831) {
            this.f6820 = i;
            this.f6812 = t;
            m7754(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f6815 == null || this.f6828 == null)) {
                        String r15 = this.f6828.m9702();
                        String r0 = this.f6828.m9703();
                        StringBuilder sb = new StringBuilder(String.valueOf(r15).length() + 70 + String.valueOf(r0).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(r15);
                        sb.append(" on ");
                        sb.append(r0);
                        Log.e("GmsClient", sb.toString());
                        this.f6837.m8199(this.f6828.m9702(), this.f6828.m9703(), this.f6828.m9701(), this.f6815, m7743());
                        this.f6818.incrementAndGet();
                    }
                    this.f6815 = new C3640iF(this.f6818.get());
                    if (this.f6820 != 3 || m7769() == null) {
                        r14 = new C1720(m7773(), m7774(), false, 129);
                    } else {
                        r14 = new C1720(m7775().getPackageName(), m7769(), true, 129);
                    }
                    this.f6828 = r14;
                    if (!this.f6837.m8198(new C1283.If(this.f6828.m9702(), this.f6828.m9703(), this.f6828.m9701()), this.f6815, m7743())) {
                        String r152 = this.f6828.m9702();
                        String r02 = this.f6828.m9703();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(r152).length() + 34 + String.valueOf(r02).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(r152);
                        sb2.append(" on ");
                        sb2.append(r02);
                        Log.e("GmsClient", sb2.toString());
                        m7753(16, (Bundle) null, this.f6818.get());
                    }
                } else if (i == 4) {
                    m7755(t);
                }
            } else if (this.f6815 != null) {
                this.f6837.m8199(this.f6828.m9702(), this.f6828.m9703(), this.f6828.m9701(), this.f6815, m7743());
                this.f6815 = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7749(int i, int i2, T t) {
        synchronized (this.f6831) {
            if (this.f6820 != i) {
                return false;
            }
            m7748(i2, t);
            return true;
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public void m7767() {
        int r0 = this.f6822.m14807(this.f6824, m7786());
        if (r0 != 0) {
            m7748(1, (IInterface) null);
            m7780((C3638If) new C1192(), r0, (PendingIntent) null);
            return;
        }
        m7765((C3638If) new C1192());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7765(C3638If ifR) {
        this.f6832 = (C3638If) C2745.C2746.m14559(ifR, "Connection progress callbacks cannot be null.");
        m7748(2, (IInterface) null);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m7783() {
        boolean z;
        synchronized (this.f6831) {
            z = this.f6820 == 4;
        }
        return z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m7772() {
        boolean z;
        synchronized (this.f6831) {
            if (this.f6820 != 2) {
                if (this.f6820 != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    private final boolean m7740() {
        boolean z;
        synchronized (this.f6831) {
            z = this.f6820 == 3;
        }
        return z;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7763() {
        this.f6818.incrementAndGet();
        synchronized (this.f6829) {
            int size = this.f6829.size();
            for (int i = 0; i < size; i++) {
                this.f6829.get(i).m7804();
            }
            this.f6829.clear();
        }
        synchronized (this.f6834) {
            this.f6811 = null;
        }
        m7748(1, (IInterface) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7764(int i) {
        Handler handler = this.f6823;
        handler.sendMessage(handler.obtainMessage(6, this.f6818.get(), i));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7747(int i) {
        int i2;
        if (m7740()) {
            i2 = 5;
            this.f6826 = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f6823;
        handler.sendMessage(handler.obtainMessage(i2, this.f6818.get(), 16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7780(C3638If ifR, int i, PendingIntent pendingIntent) {
        this.f6832 = (C3638If) C2745.C2746.m14559(ifR, "Connection progress callbacks cannot be null.");
        Handler handler = this.f6823;
        handler.sendMessage(handler.obtainMessage(3, this.f6818.get(), i, pendingIntent));
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final Context m7775() {
        return this.f6824;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public C2847[] m7776() {
        return f6810;
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public Bundle m7777() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7779(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f6823;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C1196(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7753(int i, Bundle bundle, int i2) {
        Handler handler = this.f6823;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new aUx(i, (Bundle) null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ŀ  reason: contains not printable characters */
    public final void m7757() {
        if (!m7783()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public final T m7768() {
        T t;
        synchronized (this.f6831) {
            if (this.f6820 != 5) {
                m7757();
                C2745.C2746.m14558(this.f6812 != null, "Client is connected but service is null");
                t = this.f6812;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7770(C1304 r4, Set<Scope> set) {
        Bundle r0 = m7777();
        C1209 r1 = new C1209(this.f6816);
        r1.f6863 = this.f6824.getPackageName();
        r1.f6861 = r0;
        if (set != null) {
            r1.f6866 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (m7756()) {
            r1.f6864 = m7758() != null ? m7758() : new Account("<<default account>>", "com.google");
            if (r4 != null) {
                r1.f6867 = r4.asBinder();
            }
        } else if (m7761()) {
            r1.f6864 = m7758();
        }
        r1.f6869 = f6810;
        r1.f6870 = m7776();
        try {
            synchronized (this.f6834) {
                if (this.f6811 != null) {
                    this.f6811.m8205(new C1194(this, this.f6818.get()), r1);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m7764(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            m7779(8, (IBinder) null, (Bundle) null, this.f6818.get());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7766(Cif ifVar) {
        ifVar.m7794();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ƚ  reason: contains not printable characters */
    public Set<Scope> m7762() {
        return Collections.EMPTY_SET;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɼ  reason: contains not printable characters */
    public final boolean m7742() {
        if (this.f6826 || TextUtils.isEmpty(m7787()) || TextUtils.isEmpty(m7769())) {
            return false;
        }
        try {
            Class.forName(m7787());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public String m7785() {
        C1720 r0;
        if (m7783() && (r0 = this.f6828) != null) {
            return r0.m9703();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m7786() {
        return C2837.f13285;
    }

    /* renamed from: o.ɨŀ$ǃ  reason: contains not printable characters */
    public class C1192 implements C3638If {
        public C1192() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7797(C2822 r3) {
            if (r3.f13249 == 0) {
                C1190 r32 = C1190.this;
                r32.m7770((C1304) null, r32.m7762());
            } else if (C1190.this.f6830 != null) {
                C1190.this.f6830.m7798(r3);
            }
        }
    }
}
