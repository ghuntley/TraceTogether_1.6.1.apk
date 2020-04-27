package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C1855;

/* renamed from: o.ΙԐ  reason: contains not printable characters */
public class C1895 implements C1855 {

    /* renamed from: ı  reason: contains not printable characters */
    private static volatile C1855 f9612;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final AppMeasurement f9613;

    private C1895(AppMeasurement appMeasurement) {
        if (appMeasurement != null) {
            this.f9613 = appMeasurement;
            new ConcurrentHashMap();
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1855 m10323(FirebaseApp firebaseApp, Context context, C3121 r7) {
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        } else if (context == null) {
            throw new NullPointerException("null reference");
        } else if (r7 == null) {
            throw new NullPointerException("null reference");
        } else if (context.getApplicationContext() != null) {
            if (f9612 == null) {
                synchronized (C1895.class) {
                    if (f9612 == null) {
                        Bundle bundle = new Bundle(1);
                        if ("[DEFAULT]".equals(firebaseApp.m1076())) {
                            r7.m15824(C1725.class, C1995.f9936, C1985.f9929);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        f9612 = new C1895(AppMeasurement.m807(context, bundle));
                    }
                }
            }
            return f9612;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10330(String str, String str2, Bundle bundle) {
        if (C2002.m10802(str) && C2002.m10806(str2, bundle) && C2002.m10808(str, str2, bundle)) {
            C2002.m10805(str, str2, bundle);
            this.f9613.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10328(String str, String str2, Object obj) {
        if (C2002.m10802(str) && C2002.m10807(str, str2)) {
            AppMeasurement appMeasurement = this.f9613;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Given String is empty or null");
            } else if (appMeasurement.f594) {
                appMeasurement.f595.m6197(str, str2, obj);
            } else {
                appMeasurement.f593.m14100().m4345(str, str2, obj, true);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<String, Object> m10327() {
        AppMeasurement appMeasurement = this.f9613;
        if (appMeasurement.f594) {
            return appMeasurement.f595.m6195((String) null, (String) null, false);
        }
        List<C2113> r0 = appMeasurement.f593.m14100().m4313(false);
        C0299 r1 = new C0299(r0.size());
        for (C2113 next : r0) {
            r1.put(next.f10236, next.m11268());
        }
        return r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m10324(C1855.C1856 r2) {
        if (C2002.m10803(r2)) {
            this.f9613.setConditionalUserProperty(C2002.m10804(r2));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10329(String str) {
        this.f9613.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<C1855.C1856> m10326(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (AppMeasurement.ConditionalUserProperty r4 : this.f9613.getConditionalUserProperties(str, str2)) {
            arrayList.add(C2002.m10801(r4));
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m10325(String str) {
        return this.f9613.getMaxUserProperties(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static final /* synthetic */ void m10322() {
        boolean z = null.f8936;
        synchronized (C1895.class) {
            AppMeasurement appMeasurement = ((C1895) f9612).f9613;
            if (appMeasurement.f594) {
                appMeasurement.f595.m6187(z);
            } else {
                appMeasurement.f593.m14100().m4346(z);
            }
        }
    }
}
