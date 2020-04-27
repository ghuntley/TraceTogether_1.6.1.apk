package o;

import com.google.firebase.FirebaseApp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.լȷ  reason: contains not printable characters */
public final class C3100 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final FirebaseApp f14193;

    /* renamed from: ι  reason: contains not printable characters */
    private final File f14194;

    /* renamed from: o.լȷ$If */
    public enum If {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C3100(FirebaseApp firebaseApp) {
        File filesDir = firebaseApp.m1074().getFilesDir();
        StringBuilder sb = new StringBuilder("PersistedInstallation.");
        sb.append(firebaseApp.m1078());
        sb.append(".json");
        this.f14194 = new File(filesDir, sb.toString());
        this.f14193 = firebaseApp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002e */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject m15739() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002f }
            java.io.File r4 = r6.f14194     // Catch:{ IOException | JSONException -> 0x002f }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 < 0) goto L_0x001b
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x001b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002f }
            return r1
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x002f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3100.m15739():org.json.JSONObject");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0399 m15738(C0399 r5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", r5.m4666());
            jSONObject.put("Status", r5.m4667().ordinal());
            jSONObject.put("AuthToken", r5.m4668());
            jSONObject.put("RefreshToken", r5.m4671());
            jSONObject.put("TokenCreationEpochInSecs", r5.m4673());
            jSONObject.put("ExpiresInSecs", r5.m4670());
            jSONObject.put("FisError", r5.m4669());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f14193.m1074().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f14194)) {
                return r5;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }
}
