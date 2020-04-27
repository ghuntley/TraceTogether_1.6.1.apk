package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: o.Ӏс  reason: contains not printable characters */
public final class C2835 extends C2837 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Object f13280 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2835 f13281 = new C2835();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2835 m14786() {
        return f13281;
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: o.Ӏс$ɩ  reason: contains not printable characters */
    public class C2836 extends C0469 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Context f13282;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2836(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f13282 = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                return;
            }
            int r3 = C2835.this.m14806(this.f13282);
            if (C2835.this.m14809(r3)) {
                C2835.this.m14795(this.f13282, r3);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Dialog m14785(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C1252.m8075(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m14788(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0738 m14796(Context context, C0694 r4) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C0738 r1 = new C0738(r4);
        context.registerReceiver(r1, intentFilter);
        r1.m5916(context);
        if (C2877.isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return r1;
        }
        r4.m5741();
        r1.m5915();
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m14793(Context context) {
        return super.m14806(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m14798(Context context, int i) {
        return super.m14807(context, i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14800(int i) {
        return super.m14809(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Intent m14799(Context context, int i, String str) {
        return super.m14808(context, i, str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final PendingIntent m14789(Context context, int i, int i2) {
        return super.m14804(context, i, i2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m14790(int i) {
        return super.m14805(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Dialog m14784(Context context, int i, C1201 r7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1252.m8075(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String r8 = C1252.m8077(context, i);
        if (r8 != null) {
            builder.setPositiveButton(r8, r7);
        }
        String r5 = C1252.m8080(context, i);
        if (r5 != null) {
            builder.setTitle(r5);
        }
        return builder.create();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m14788(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof C1269) {
            SupportErrorDialogFragment.m745(dialog, onCancelListener).m171(((C1269) activity).getSupportFragmentManager(), str);
            return;
        }
        C2872.m14933(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Dialog m14794(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m14784((Context) activity, i, C1201.m7814(activity, super.m14808(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m14797(Activity activity, C0485 r3, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog r32 = m14784((Context) activity, i, C1201.m7813(r3, super.m14808(activity, i, "d"), 2), onCancelListener);
        if (r32 == null) {
            return false;
        }
        m14788(activity, r32, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14791(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog r3 = m14784((Context) activity, i, C1201.m7814(activity, super.m14808(activity, i, "d"), i2), onCancelListener);
        if (r3 == null) {
            return false;
        }
        m14788(activity, r3, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14795(Context context, int i) {
        PendingIntent pendingIntent;
        Intent r0 = m14808(context, i, "n");
        if (r0 == null) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0, r0, 134217728);
        }
        m14787(context, i, pendingIntent);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m14792(Context context, C2822 r5, int i) {
        PendingIntent pendingIntent;
        if ((r5.f13249 == 0 || r5.f13246 == null) ? false : true) {
            pendingIntent = r5.f13246;
        } else {
            pendingIntent = super.m14804(context, r5.f13249, 0);
        }
        if (pendingIntent == null) {
            return false;
        }
        m14787(context, r5.f13249, PendingIntent.getActivity(context, 0, GoogleApiActivity.m748(context, pendingIntent, i, true), 134217728));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 26) == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    @android.annotation.TargetApi(20)
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14787(android.content.Context r12, int r13, android.app.PendingIntent r14) {
        /*
            r11 = this;
            r0 = 1
            r1 = 18
            if (r13 != r1) goto L_0x0011
            o.Ӏс$ɩ r13 = new o.Ӏс$ɩ
            r13.<init>(r12)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r13.sendEmptyMessageDelayed(r0, r1)
            return
        L_0x0011:
            if (r14 != 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r1 = o.C1252.m8076(r12, r13)
            r2 = 6
            if (r13 == r2) goto L_0x0025
            r2 = 19
            if (r13 != r2) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            java.lang.String r2 = o.C1252.m8075(r12, r13)
            goto L_0x002f
        L_0x0025:
            java.lang.String r2 = o.C1252.m8079(r12)
            java.lang.String r3 = "common_google_play_services_resolution_required_text"
            java.lang.String r2 = o.C1252.m8078(r12, r3, r2)
        L_0x002f:
            android.content.res.Resources r3 = r12.getResources()
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r12.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            o.ւ$if r5 = new o.ւ$if
            r5.<init>(r12)
            o.ւ$if r5 = r5.m16087((boolean) r0)
            o.ւ$if r5 = r5.m16074((boolean) r0)
            o.ւ$if r1 = r5.m16079((java.lang.CharSequence) r1)
            o.ւ$ǃ r5 = new o.ւ$ǃ
            r5.<init>()
            o.ւ$ǃ r5 = r5.m16105(r2)
            o.ւ$if r1 = r1.m16080((o.C3185.If) r5)
            boolean r5 = o.C2173.m11531(r12)
            r6 = 2
            r7 = 26
            r8 = 0
            if (r5 == 0) goto L_0x00b8
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 20
            if (r2 < r5) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x00b2
            android.content.pm.ApplicationInfo r2 = r12.getApplicationInfo()
            int r2 = r2.icon
            o.ւ$if r2 = r1.m16088((int) r2)
            r2.m16076((int) r6)
            boolean r2 = o.C2173.m11531(r12)
            if (r2 == 0) goto L_0x009d
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r2 < r5) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x009b
            boolean r2 = o.C2173.m11530(r12)
            if (r2 == 0) goto L_0x009d
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r7) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            if (r2 != 0) goto L_0x009d
        L_0x009b:
            r2 = 1
            goto L_0x009e
        L_0x009d:
            r2 = 0
        L_0x009e:
            if (r2 == 0) goto L_0x00ae
            r2 = 2131230846(0x7f08007e, float:1.8077756E38)
            r5 = 2131886166(0x7f120056, float:1.9406903E38)
            java.lang.String r3 = r3.getString(r5)
            r1.m16077(r2, r3, r14)
            goto L_0x00d9
        L_0x00ae:
            r1.m16092((android.app.PendingIntent) r14)
            goto L_0x00d9
        L_0x00b2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00b8:
            r5 = 17301642(0x108008a, float:2.4979642E-38)
            o.ւ$if r5 = r1.m16088((int) r5)
            r9 = 2131886158(0x7f12004e, float:1.9406887E38)
            java.lang.String r3 = r3.getString(r9)
            o.ւ$if r3 = r5.m16073((java.lang.CharSequence) r3)
            long r9 = java.lang.System.currentTimeMillis()
            o.ւ$if r3 = r3.m16078((long) r9)
            o.ւ$if r14 = r3.m16092((android.app.PendingIntent) r14)
            r14.m16086((java.lang.CharSequence) r2)
        L_0x00d9:
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto L_0x00df
            r14 = 1
            goto L_0x00e0
        L_0x00df:
            r14 = 0
        L_0x00e0:
            if (r14 == 0) goto L_0x0126
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto L_0x00e8
            r14 = 1
            goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            if (r14 == 0) goto L_0x0120
            java.lang.Object r14 = f13280
            monitor-enter(r14)
            monitor-exit(r14)
            java.lang.String r14 = "com.google.android.gms.availability"
            android.app.NotificationChannel r2 = r4.getNotificationChannel(r14)
            android.content.res.Resources r12 = r12.getResources()
            r3 = 2131886157(0x7f12004d, float:1.9406885E38)
            java.lang.String r12 = r12.getString(r3)
            if (r2 != 0) goto L_0x010c
            android.app.NotificationChannel r2 = new android.app.NotificationChannel
            r3 = 4
            r2.<init>(r14, r12, r3)
            r4.createNotificationChannel(r2)
            goto L_0x011c
        L_0x010c:
            java.lang.CharSequence r3 = r2.getName()
            boolean r3 = r12.contentEquals(r3)
            if (r3 != 0) goto L_0x011c
            r2.setName(r12)
            r4.createNotificationChannel(r2)
        L_0x011c:
            r1.m16089((java.lang.String) r14)
            goto L_0x0126
        L_0x0120:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0126:
            android.app.Notification r12 = r1.m16075()
            if (r13 == r0) goto L_0x0135
            if (r13 == r6) goto L_0x0135
            r14 = 3
            if (r13 == r14) goto L_0x0135
            r13 = 39789(0x9b6d, float:5.5756E-41)
            goto L_0x013c
        L_0x0135:
            r13 = 10436(0x28c4, float:1.4624E-41)
            java.util.concurrent.atomic.AtomicBoolean r14 = o.C2877.sCanceledAvailabilityNotification
            r14.set(r8)
        L_0x013c:
            r4.notify(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2835.m14787(android.content.Context, int, android.app.PendingIntent):void");
    }
}
