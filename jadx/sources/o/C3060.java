package o;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.Ֆ  reason: contains not printable characters */
public final class C3060 implements Callable {

    /* renamed from: ι  reason: contains not printable characters */
    private final Intent f13993;

    public C3060() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if ((r0 == "https" || (r0 != null && r0.equals("https"))) != false) goto L_0x0066;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m15612(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            java.lang.String r0 = r7.toLowerCase()
            java.lang.String r1 = "gs://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x002e
            r0 = 5
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r7 = o.C2864.m14860(r7)
            java.lang.String r7 = o.C2864.m14861(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            android.net.Uri r7 = android.net.Uri.parse(r7)
            return r7
        L_0x002e:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getScheme()
            if (r0 == 0) goto L_0x0102
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x004d
            if (r1 == 0) goto L_0x004b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r1 = 0
            goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            if (r1 != 0) goto L_0x0066
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "https"
            if (r0 == r1) goto L_0x0063
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r0 = 0
            goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            if (r0 == 0) goto L_0x0102
        L_0x0066:
            java.lang.String r0 = r7.getAuthority()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = o.C2940.m15171()     // Catch:{ RemoteException -> 0x00fa }
            int r0 = r0.indexOf(r1)     // Catch:{ RemoteException -> 0x00fa }
            java.lang.String r1 = r7.getEncodedPath()
            if (r1 == 0) goto L_0x00f2
            java.lang.String r2 = "/"
            java.lang.String r5 = "%2F"
            java.lang.String r1 = r1.replace(r5, r2)
            java.lang.String r5 = "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl()."
            if (r0 != 0) goto L_0x00bb
            boolean r6 = r1.startsWith(r2)
            if (r6 == 0) goto L_0x00bb
            java.lang.String r7 = "/b/"
            int r7 = r1.indexOf(r7, r4)
            int r0 = r7 + 3
            int r2 = r1.indexOf(r2, r0)
            java.lang.String r3 = "/o/"
            int r3 = r1.indexOf(r3, r4)
            r4 = -1
            if (r7 == r4) goto L_0x00b5
            if (r2 == r4) goto L_0x00b5
            java.lang.String r7 = r1.substring(r0, r2)
            if (r3 == r4) goto L_0x00b2
            int r3 = r3 + 3
            java.lang.String r1 = r1.substring(r3)
            goto L_0x00c6
        L_0x00b2:
            java.lang.String r1 = ""
            goto L_0x00c6
        L_0x00b5:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L_0x00bb:
            if (r0 <= r3) goto L_0x00ec
            java.lang.String r7 = r7.getAuthority()
            int r0 = r0 - r3
            java.lang.String r7 = r7.substring(r4, r0)
        L_0x00c6:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00e4
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r2 = "gs"
            android.net.Uri$Builder r0 = r0.scheme(r2)
            android.net.Uri$Builder r7 = r0.authority(r7)
            android.net.Uri$Builder r7 = r7.encodedPath(r1)
            android.net.Uri r7 = r7.build()
            return r7
        L_0x00e4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No bucket specified"
            r7.<init>(r0)
            throw r7
        L_0x00ec:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L_0x00f2:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null reference"
            r7.<init>(r0)
            throw r7
        L_0x00fa:
            java.io.UnsupportedEncodingException r7 = new java.io.UnsupportedEncodingException
            java.lang.String r0 = "Could not parse Url because the Storage network layer did not load"
            r7.<init>(r0)
            throw r7
        L_0x0102:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Uri scheme"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3060.m15612(java.lang.String):android.net.Uri");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m15613(C0367 r4) {
        String str;
        if (r4 != null) {
            try {
                str = ((C2552) C0309.m4372(r4.m4556(), 30000, TimeUnit.MILLISECONDS)).f11653;
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public C3060(Intent intent) {
        this.f13993 = intent;
    }

    public final Object call() {
        Intent intent = this.f13993;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                intent.getExtras();
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m1106().m1120();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId r0 = FirebaseInstanceId.m1106();
                FirebaseInstanceId.f978.m10282("");
                r0.m1115();
            }
        }
        return -1;
    }
}
