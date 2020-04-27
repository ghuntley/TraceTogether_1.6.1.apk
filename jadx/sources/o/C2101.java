package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* renamed from: o.κι  reason: contains not printable characters */
public final class C2101 extends C1912 implements C1426 {
    C2101(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void initialize(C2722 r2, C2193 r3, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        C2165.m11475(r0, r3);
        r0.writeLong(j);
        m10391(1, r0);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11475(r0, bundle);
        C2165.m11472(r0, z);
        C2165.m11472(r0, z2);
        r0.writeLong(j);
        m10391(2, r0);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C1818 r5, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11475(r0, bundle);
        C2165.m11476(r0, r5);
        r0.writeLong(j);
        m10391(3, r0);
    }

    public final void setUserProperty(String str, String str2, C2722 r4, boolean z, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11476(r0, r4);
        C2165.m11472(r0, z);
        r0.writeLong(j);
        m10391(4, r0);
    }

    public final void getUserProperties(String str, String str2, boolean z, C1818 r5) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11472(r0, z);
        C2165.m11476(r0, r5);
        m10391(5, r0);
    }

    public final void getMaxUserProperties(String str, C1818 r3) {
        Parcel r0 = m10390();
        r0.writeString(str);
        C2165.m11476(r0, r3);
        m10391(6, r0);
    }

    public final void setUserId(String str, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeLong(j);
        m10391(7, r0);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel r0 = m10390();
        C2165.m11475(r0, bundle);
        r0.writeLong(j);
        m10391(8, r0);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11475(r0, bundle);
        m10391(9, r0);
    }

    public final void getConditionalUserProperties(String str, String str2, C1818 r4) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11476(r0, r4);
        m10391(10, r0);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel r0 = m10390();
        C2165.m11472(r0, z);
        r0.writeLong(j);
        m10391(11, r0);
    }

    public final void resetAnalyticsData(long j) {
        Parcel r0 = m10390();
        r0.writeLong(j);
        m10391(12, r0);
    }

    public final void setMinimumSessionDuration(long j) {
        Parcel r0 = m10390();
        r0.writeLong(j);
        m10391(13, r0);
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel r0 = m10390();
        r0.writeLong(j);
        m10391(14, r0);
    }

    public final void setCurrentScreen(C2722 r2, String str, String str2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeString(str);
        r0.writeString(str2);
        r0.writeLong(j);
        m10391(15, r0);
    }

    public final void getCurrentScreenName(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(16, r0);
    }

    public final void getCurrentScreenClass(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(17, r0);
    }

    public final void setInstanceIdProvider(C2149 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(18, r0);
    }

    public final void getCachedAppInstanceId(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(19, r0);
    }

    public final void getAppInstanceId(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(20, r0);
    }

    public final void getGmpAppId(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(21, r0);
    }

    public final void generateEventId(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(22, r0);
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeLong(j);
        m10391(23, r0);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeLong(j);
        m10391(24, r0);
    }

    public final void onActivityStarted(C2722 r2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeLong(j);
        m10391(25, r0);
    }

    public final void onActivityStopped(C2722 r2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeLong(j);
        m10391(26, r0);
    }

    public final void onActivityCreated(C2722 r2, Bundle bundle, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        C2165.m11475(r0, bundle);
        r0.writeLong(j);
        m10391(27, r0);
    }

    public final void onActivityDestroyed(C2722 r2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeLong(j);
        m10391(28, r0);
    }

    public final void onActivityPaused(C2722 r2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeLong(j);
        m10391(29, r0);
    }

    public final void onActivityResumed(C2722 r2, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeLong(j);
        m10391(30, r0);
    }

    public final void onActivitySaveInstanceState(C2722 r2, C1818 r3, long j) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        C2165.m11476(r0, r3);
        r0.writeLong(j);
        m10391(31, r0);
    }

    public final void performAction(Bundle bundle, C1818 r3, long j) {
        Parcel r0 = m10390();
        C2165.m11475(r0, bundle);
        C2165.m11476(r0, r3);
        r0.writeLong(j);
        m10391(32, r0);
    }

    public final void logHealthData(int i, String str, C2722 r4, C2722 r5, C2722 r6) {
        Parcel r0 = m10390();
        r0.writeInt(i);
        r0.writeString(str);
        C2165.m11476(r0, r4);
        C2165.m11476(r0, r5);
        C2165.m11476(r0, r6);
        m10391(33, r0);
    }

    public final void setEventInterceptor(C2137 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(34, r0);
    }

    public final void registerOnMeasurementEventListener(C2137 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(35, r0);
    }

    public final void unregisterOnMeasurementEventListener(C2137 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(36, r0);
    }

    public final void initForTests(Map map) {
        Parcel r0 = m10390();
        r0.writeMap(map);
        m10391(37, r0);
    }

    public final void getTestFlag(C1818 r2, int i) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        r0.writeInt(i);
        m10391(38, r0);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel r0 = m10390();
        C2165.m11472(r0, z);
        m10391(39, r0);
    }

    public final void isDataCollectionEnabled(C1818 r2) {
        Parcel r0 = m10390();
        C2165.m11476(r0, r2);
        m10391(40, r0);
    }
}
