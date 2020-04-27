package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import o.C0299;
import o.C0305;
import o.C0316;
import o.C0571;
import o.C1033;
import o.C1130;
import o.C1716;
import o.C1818;
import o.C2137;
import o.C2149;
import o.C2151;
import o.C2153;
import o.C2193;
import o.C2433;
import o.C2441;
import o.C2658;
import o.C2722;
import o.C2813;
import o.C2852;
import o.C3173;
import o.C3211;

@DynamiteApi
public class AppMeasurementDynamiteService extends C1130 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private Map<Integer, C3211> f600 = new C0299();

    /* renamed from: ι  reason: contains not printable characters */
    public C2658 f601 = null;

    class If implements C3173 {

        /* renamed from: ı  reason: contains not printable characters */
        private C2137 f602;

        If(C2137 r2) {
            this.f602 = r2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m821(String str, String str2, Bundle bundle, long j) {
            try {
                this.f602.m11311(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f601.t_().A_().m11603("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$ɩ  reason: contains not printable characters */
    class C0057 implements C3211 {

        /* renamed from: ı  reason: contains not printable characters */
        private C2137 f604;

        C0057(C2137 r2) {
            this.f604 = r2;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.f604.m11311(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f601.t_().A_().m11603("Event listener threw exception", e);
            }
        }
    }

    public void initialize(C2722 r1, C2193 r2, long j) {
        Context context = (Context) C2813.m14731(r1);
        C2658 r3 = this.f601;
        if (r3 == null) {
            this.f601 = C2658.m14078(context, r2);
        } else {
            r3.t_().A_().m11606("Attempting to initialize multiple times");
        }
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        C2658 r1 = this.f601;
        if (r1 != null) {
            r1.m14100().m4351(str, str2, bundle, z, z2, j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setUserProperty(String str, String str2, C2722 r11, boolean z, long j) {
        if (this.f601 != null) {
            this.f601.m14100().m4352(str, str2, C2813.m14731(r11), z, j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setUserId(String str, long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4352((String) null, "_id", str, true, j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setCurrentScreen(C2722 r1, String str, String str2, long j) {
        C2658 r4 = this.f601;
        if (r4 != null) {
            r4.m14085().m6334((Activity) C2813.m14731(r1), str, str2);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setMeasurementEnabled(boolean z, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            r2.m14100().m4354(z);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void resetAnalyticsData(long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4332(j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setMinimumSessionDuration(long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4340(j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setSessionTimeoutDuration(long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4349(j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getMaxUserProperties(String str, C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100();
            if (!TextUtils.isEmpty(str)) {
                this.f601.m14116().m11383(r3, 25);
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getCurrentScreenName(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            this.f601.m14116().m11397(r3, r0.m14100().m4360());
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getCurrentScreenClass(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            this.f601.m14116().m11397(r3, r0.m14100().m4362());
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getCachedAppInstanceId(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            this.f601.m14116().m11397(r3, r0.m14100().m4338());
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getAppInstanceId(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.u_().m13668((Runnable) new C0571(this, r3));
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getGmpAppId(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            this.f601.m14116().m11397(r3, r0.m14100().m4359());
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void generateEventId(C1818 r4) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            this.f601.m14116().m11404(r4, r0.m14116().m11378());
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void beginAdUnitExposure(String str, long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14095().m13585(str, j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void endAdUnitExposure(String str, long j) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14095().m13589(str, j);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void initForTests(Map map) {
        if (this.f601 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C1818 r11, long j) {
        Bundle bundle2;
        if (this.f601 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        } else if (!TextUtils.isEmpty(str2)) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", "app");
            this.f601.u_().m13668((Runnable) new C2852(this, r11, new C2441(str2, new C2433(bundle), "app", j), str));
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public void onActivityStarted(C2722 r1, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            C0620 r22 = r2.m14100().f3598;
            if (r22 != null) {
                this.f601.m14100().m4337();
                r22.onActivityStarted((Activity) C2813.m14731(r1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivityStopped(C2722 r1, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            C0620 r22 = r2.m14100().f3598;
            if (r22 != null) {
                this.f601.m14100().m4337();
                r22.onActivityStopped((Activity) C2813.m14731(r1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivityCreated(C2722 r1, Bundle bundle, long j) {
        C2658 r3 = this.f601;
        if (r3 != null) {
            C0620 r32 = r3.m14100().f3598;
            if (r32 != null) {
                this.f601.m14100().m4337();
                r32.onActivityCreated((Activity) C2813.m14731(r1), bundle);
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivityDestroyed(C2722 r1, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            C0620 r22 = r2.m14100().f3598;
            if (r22 != null) {
                this.f601.m14100().m4337();
                r22.onActivityDestroyed((Activity) C2813.m14731(r1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivityPaused(C2722 r1, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            C0620 r22 = r2.m14100().f3598;
            if (r22 != null) {
                this.f601.m14100().m4337();
                r22.onActivityPaused((Activity) C2813.m14731(r1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivityResumed(C2722 r1, long j) {
        C2658 r2 = this.f601;
        if (r2 != null) {
            C0620 r22 = r2.m14100().f3598;
            if (r22 != null) {
                this.f601.m14100().m4337();
                r22.onActivityResumed((Activity) C2813.m14731(r1));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void onActivitySaveInstanceState(C2722 r2, C1818 r3, long j) {
        C2658 r4 = this.f601;
        if (r4 != null) {
            C0620 r42 = r4.m14100().f3598;
            Bundle bundle = new Bundle();
            if (r42 != null) {
                this.f601.m14100().m4337();
                r42.onActivitySaveInstanceState((Activity) C2813.m14731(r2), bundle);
            }
            try {
                r3.m10015(bundle);
            } catch (RemoteException e) {
                this.f601.t_().A_().m11603("Error returning bundle value to wrapper", e);
            }
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void performAction(Bundle bundle, C1818 r2, long j) {
        if (this.f601 != null) {
            r2.m10015((Bundle) null);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getUserProperties(String str, String str2, boolean z, C1818 r12) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.u_().m13668((Runnable) new C1716(this, r12, str, str2, z));
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void logHealthData(int i, String str, C2722 r12, C2722 r13, C2722 r14) {
        Object obj;
        if (this.f601 != null) {
            Object obj2 = null;
            Object r6 = r12 == null ? null : C2813.m14731(r12);
            if (r13 == null) {
                obj = null;
            } else {
                obj = C2813.m14731(r13);
            }
            if (r14 != null) {
                obj2 = C2813.m14731(r14);
            }
            this.f601.t_().m11719(i, true, false, str, r6, obj, obj2);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setEventInterceptor(C2137 r4) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            C0305 r02 = r0.m14100();
            If ifR = new If(r4);
            r02.m15903();
            r02.m9662();
            r02.u_().m13668((Runnable) new C0316(r02, ifR));
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void registerOnMeasurementEventListener(C2137 r3) {
        if (this.f601 != null) {
            C3211 r0 = this.f600.get(Integer.valueOf(r3.m11310()));
            if (r0 == null) {
                r0 = new C0057(r3);
                this.f600.put(Integer.valueOf(r3.m11310()), r0);
            }
            this.f601.m14100().m4353(r0);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void unregisterOnMeasurementEventListener(C2137 r3) {
        if (this.f601 != null) {
            C3211 remove = this.f600.remove(Integer.valueOf(r3.m11310()));
            if (remove == null) {
                remove = new C0057(r3);
            }
            this.f601.m14100().m4327(remove);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void setInstanceIdProvider(C2149 r2) {
        if (this.f601 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        C2658 r0 = this.f601;
        if (r0 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        } else if (bundle == null) {
            r0.t_().m11714().m11606("Conditional user property must not be null");
        } else {
            r0.m14100().m4341(bundle, j);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4323(str, str2, bundle);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getConditionalUserProperties(String str, String str2, C1818 r5) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.u_().m13668((Runnable) new C1033(this, r5, str, str2));
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void getTestFlag(C1818 r5, int i) {
        C2658 r0 = this.f601;
        if (r0 == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        } else if (i == 0) {
            r0.m14116().m11397(r5, this.f601.m14100().m4328());
        } else if (i == 1) {
            r0.m14116().m11404(r5, this.f601.m14100().m4355().longValue());
        } else if (i == 2) {
            C2151 r6 = r0.m14116();
            double doubleValue = this.f601.m14100().m4356().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                r5.m10015(bundle);
            } catch (RemoteException e) {
                r6.f14314.t_().A_().m11603("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            r0.m14116().m11383(r5, this.f601.m14100().m4357().intValue());
        } else if (i == 4) {
            r0.m14116().m11385(r5, this.f601.m14100().m4319().booleanValue());
        }
    }

    public void setDataCollectionEnabled(boolean z) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.m14100().m4346(z);
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    public void isDataCollectionEnabled(C1818 r3) {
        C2658 r0 = this.f601;
        if (r0 != null) {
            r0.u_().m13668((Runnable) new C2153(this, r3));
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
}
