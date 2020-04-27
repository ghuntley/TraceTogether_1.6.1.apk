package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ǀʄ  reason: contains not printable characters */
public final class C0857 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Map<String, String> f5575;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m6410(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
        }
        throw new NullPointerException("null reference");
    }

    static {
        HashMap hashMap = new HashMap();
        f5575 = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f5575.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f5575.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f5575.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f5575.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m6412(Intent intent, Status status) {
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Status m6411(Intent intent) {
        C1511 r2;
        if (intent == null) {
            throw new NullPointerException("null reference");
        } else if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
            Parcelable.Creator creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            if (byteArrayExtra == null) {
                r2 = null;
            } else {
                r2 = C1544.m9040(byteArrayExtra, creator);
            }
            return (Status) r2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
