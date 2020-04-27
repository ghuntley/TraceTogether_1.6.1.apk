package o;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: o.ɬі  reason: contains not printable characters */
public interface C1426 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C1818 r1);

    void getAppInstanceId(C1818 r1);

    void getCachedAppInstanceId(C1818 r1);

    void getConditionalUserProperties(String str, String str2, C1818 r3);

    void getCurrentScreenClass(C1818 r1);

    void getCurrentScreenName(C1818 r1);

    void getGmpAppId(C1818 r1);

    void getMaxUserProperties(String str, C1818 r2);

    void getTestFlag(C1818 r1, int i);

    void getUserProperties(String str, String str2, boolean z, C1818 r4);

    void initForTests(Map map);

    void initialize(C2722 r1, C2193 r2, long j);

    void isDataCollectionEnabled(C1818 r1);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C1818 r4, long j);

    void logHealthData(int i, String str, C2722 r3, C2722 r4, C2722 r5);

    void onActivityCreated(C2722 r1, Bundle bundle, long j);

    void onActivityDestroyed(C2722 r1, long j);

    void onActivityPaused(C2722 r1, long j);

    void onActivityResumed(C2722 r1, long j);

    void onActivitySaveInstanceState(C2722 r1, C1818 r2, long j);

    void onActivityStarted(C2722 r1, long j);

    void onActivityStopped(C2722 r1, long j);

    void performAction(Bundle bundle, C1818 r2, long j);

    void registerOnMeasurementEventListener(C2137 r1);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(C2722 r1, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(C2137 r1);

    void setInstanceIdProvider(C2149 r1);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C2722 r3, boolean z, long j);

    void unregisterOnMeasurementEventListener(C2137 r1);
}
