package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.api.Status;

/* renamed from: o.ƚŧ  reason: contains not printable characters */
public final class C0718 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0718 f4925 = new C0718();

    /* renamed from: ι  reason: contains not printable characters */
    private static final C0719<String> f4926 = C0719.m5840("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    private C0718() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0718 m5835() {
        return f4925;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m5836(Context context, C1522 r3, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel obtain = Parcel.obtain();
        r3.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        edit.putString("verifyAssertionRequest", marshall == null ? null : Base64.encodeToString(marshall, 10));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", C2022.f9992.m10846());
        edit.commit();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m5838(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f536);
        edit.putString("statusMessage", status.f537);
        edit.putLong("timestamp", C2022.f9992.m10846());
        edit.commit();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m5839(Context context) {
        m5837(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m5837(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C0719 r0 = f4926;
        int size = r0.size();
        int i = 0;
        while (i < size) {
            Object obj = r0.get(i);
            i++;
            edit.remove((String) obj);
        }
        edit.commit();
    }
}
