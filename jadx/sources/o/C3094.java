package o;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.լƚ  reason: contains not printable characters */
public final class C3094 extends C3052 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final JSONObject f14168;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f14169;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m15726() {
        return "POST";
    }

    public C3094(Uri uri, FirebaseApp firebaseApp, JSONObject jSONObject, String str) {
        super(uri, firebaseApp);
        this.f14168 = jSONObject;
        this.f14169 = str;
        if (TextUtils.isEmpty(this.f14169)) {
            this.f13650 = new IllegalArgumentException("mContentType is null or empty");
        }
        super.m15184("X-Goog-Upload-Protocol", "resumable");
        super.m15184("X-Goog-Upload-Command", "start");
        super.m15184("X-Goog-Upload-Header-Content-Type", this.f14169);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m15724() {
        Uri.Builder buildUpon = f13647.buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(this.f13655.getAuthority());
        buildUpon.appendPath("o");
        return buildUpon.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Map<String, String> m15727() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", m15186());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final JSONObject m15725() {
        return this.f14168;
    }
}
