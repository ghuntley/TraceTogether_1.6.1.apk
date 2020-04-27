package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C0801;
import o.C2658;
import o.C3146;
import o.C3181;
import o.C3211;

@Deprecated
public class AppMeasurement {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static volatile AppMeasurement f592;

    /* renamed from: ı  reason: contains not printable characters */
    public final C2658 f593;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean f594;

    /* renamed from: ι  reason: contains not printable characters */
    public final C0801 f595;

    public interface OnEventListener extends C3211 {
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$ı  reason: contains not printable characters */
    public static final class C0056 extends C3181 {
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return m808(context);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static AppMeasurement m808(Context context) {
        if (f592 == null) {
            synchronized (AppMeasurement.class) {
                if (f592 == null) {
                    C0801 r2 = m809(context, (Bundle) null);
                    if (r2 != null) {
                        f592 = new AppMeasurement(r2);
                    } else {
                        f592 = new AppMeasurement(C2658.m14077(context, (String) null, (String) null, (Bundle) null));
                    }
                }
            }
        }
        return f592;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static AppMeasurement m807(Context context, Bundle bundle) {
        if (f592 == null) {
            synchronized (AppMeasurement.class) {
                if (f592 == null) {
                    C0801 r1 = m809(context, bundle);
                    if (r1 != null) {
                        f592 = new AppMeasurement(r1);
                    } else {
                        f592 = new AppMeasurement(C2658.m14077(context, (String) null, (String) null, bundle));
                    }
                }
            }
        }
        return f592;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.C0801 m809(android.content.Context r8, android.os.Bundle r9) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch:{  }
            o.ƶı r8 = (o.C0801) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m809(android.content.Context, android.os.Bundle):o.ƶı");
    }

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        private ConditionalUserProperty(Bundle bundle) {
            if (bundle != null) {
                this.mAppId = (String) C3146.m15933(bundle, "app_id", String.class, null);
                this.mOrigin = (String) C3146.m15933(bundle, "origin", String.class, null);
                this.mName = (String) C3146.m15933(bundle, "name", String.class, null);
                this.mValue = C3146.m15933(bundle, "value", Object.class, null);
                this.mTriggerEventName = (String) C3146.m15933(bundle, "trigger_event_name", String.class, null);
                this.mTriggerTimeout = ((Long) C3146.m15933(bundle, "trigger_timeout", Long.class, 0L)).longValue();
                this.mTimedOutEventName = (String) C3146.m15933(bundle, "timed_out_event_name", String.class, null);
                this.mTimedOutEventParams = (Bundle) C3146.m15933(bundle, "timed_out_event_params", Bundle.class, null);
                this.mTriggeredEventName = (String) C3146.m15933(bundle, "triggered_event_name", String.class, null);
                this.mTriggeredEventParams = (Bundle) C3146.m15933(bundle, "triggered_event_params", Bundle.class, null);
                this.mTimeToLive = ((Long) C3146.m15933(bundle, "time_to_live", Long.class, 0L)).longValue();
                this.mExpiredEventName = (String) C3146.m15933(bundle, "expired_event_name", String.class, null);
                this.mExpiredEventParams = (Bundle) C3146.m15933(bundle, "expired_event_params", Bundle.class, null);
                return;
            }
            throw new NullPointerException("null reference");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final Bundle m810() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C3146.m15932(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        /* synthetic */ ConditionalUserProperty(Bundle bundle, byte b) {
            this(bundle);
        }
    }

    private AppMeasurement(C2658 r2) {
        if (r2 != null) {
            this.f593 = r2;
            this.f595 = null;
            this.f594 = false;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private AppMeasurement(C0801 r2) {
        if (r2 != null) {
            this.f595 = r2;
            this.f593 = null;
            this.f594 = true;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f594) {
            this.f595.m6199(str, str2, bundle);
        } else {
            this.f593.m14100().m4344(str, str2, bundle);
        }
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.f594) {
            this.f595.m6191((C3211) onEventListener);
        } else {
            this.f593.m14100().m4353((C3211) onEventListener);
        }
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.f594) {
            return this.f595.m6188();
        }
        return this.f593.m14100().m4360();
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.f594) {
            return this.f595.m6193();
        }
        return this.f593.m14100().m4362();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.f594) {
            return this.f595.m6198();
        }
        return this.f593.m14100().m4338();
    }

    @Keep
    public String getGmpAppId() {
        if (this.f594) {
            return this.f595.m6184();
        }
        return this.f593.m14100().m4359();
    }

    @Keep
    public long generateEventId() {
        if (this.f594) {
            return this.f595.m6186();
        }
        return this.f593.m14116().m11378();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f594) {
            this.f595.m6190(str);
        } else {
            this.f593.m14095().m13585(str, this.f593.w_().m10847());
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f594) {
            this.f595.m6185(str);
        } else {
            this.f593.m14095().m13589(str, this.f593.w_().m10847());
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty == null) {
            throw new NullPointerException("null reference");
        } else if (this.f594) {
            this.f595.m6189(conditionalUserProperty.m810());
        } else {
            this.f593.m14100().m4333(conditionalUserProperty.m810());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty == null) {
            throw new NullPointerException("null reference");
        } else if (!this.f594) {
            this.f593.m14100().m4322(conditionalUserProperty.m810());
        } else {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f594) {
            this.f595.m6196(str, str2, bundle);
        } else {
            this.f593.m14100().m4323(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.f594) {
            this.f593.m14100().m4326(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f594) {
            return this.f595.m6195(str, str2, z);
        }
        return this.f593.m14100().m4330(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.f594) {
            return this.f593.m14100().m4314(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.f594) {
            list = this.f595.m6194(str, str2);
        } else {
            list = this.f593.m14100().m4320(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty, (byte) 0));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        int i;
        if (!this.f594) {
            ArrayList<Bundle> r5 = this.f593.m14100().m4347(str, str2, str3);
            if (r5 == null) {
                i = 0;
            } else {
                i = r5.size();
            }
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = r5;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                arrayList.add(new ConditionalUserProperty((Bundle) obj, (byte) 0));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f594) {
            return this.f595.m6192(str);
        }
        this.f593.m14100();
        if (!TextUtils.isEmpty(str)) {
            return 25;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
}
