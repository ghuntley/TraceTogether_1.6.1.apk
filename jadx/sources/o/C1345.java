package o;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ɪɍ  reason: contains not printable characters */
public final class C1345 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Object f7472 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static volatile C1345 f7473;

    /* renamed from: o.ɪɍ$ǃ  reason: contains not printable characters */
    public static final class C1346 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final List<String> f7474;

        /* renamed from: ι  reason: contains not printable characters */
        private final Object f7475;

        private C1346(Object obj) {
            if (obj != null) {
                this.f7475 = obj;
                this.f7474 = new ArrayList();
                return;
            }
            throw new NullPointerException("null reference");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1346 m8437(String str, Object obj) {
            List<String> list = this.f7474;
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + valueOf.length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f7475.getClass().getSimpleName());
            sb.append('{');
            int size = this.f7474.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f7474.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public /* synthetic */ C1346(Object obj, byte b) {
            this(obj);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1345 m8433() {
        if (f7473 == null) {
            synchronized (f7472) {
                if (f7473 == null) {
                    f7473 = new C1345();
                }
            }
        }
        return f7473;
    }

    private C1345() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m8435(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C2059.m10960(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8436(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m8435(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: ı  reason: contains not printable characters */
    public final void m8434(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
