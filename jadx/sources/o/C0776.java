package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import o.C2745;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Ʃ  reason: contains not printable characters */
class C0776 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f5182 = "/data";

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f5183;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0777 f5184;

    /* renamed from: o.Ʃ$ǃ  reason: contains not printable characters */
    interface C0777 {
        /* renamed from: ǃ  reason: contains not printable characters */
        String m6105(File file);
    }

    C0776(Context context, C0777 r2) {
        this.f5183 = context;
        this.f5184 = r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public byte[] m6104(String str) {
        return m6100(m6094(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public byte[] m6103(BufferedReader bufferedReader) {
        return m6100(m6099(bufferedReader));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private JSONArray m6099(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject r1 = m6101(readLine);
            if (r1 != null) {
                jSONArray.put(r1);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private JSONArray m6094(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = m6097(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String r2 : split) {
                JSONObject r22 = m6101(r2);
                if (r22 != null) {
                    jSONArray.put(r22);
                }
            }
            return jSONArray;
        } catch (JSONException unused) {
            C3263ac.m1563();
            return jSONArray;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private JSONObject m6101(String str) {
        C1362 r4 = C1363.m8473(str);
        if (r4 != null && m6102(r4)) {
            try {
                try {
                    return m6095(this.f5184.m6105(m6096(r4.f7546)), r4);
                } catch (JSONException unused) {
                    C3263ac.m1563();
                    return null;
                }
            } catch (IOException unused2) {
                C3263ac.m1563();
            }
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private File m6096(String str) {
        File file = new File(str);
        return !file.exists() ? m6098(file) : file;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private File m6098(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith(f5182)) {
            return file;
        }
        try {
            return new File(this.f5183.getPackageManager().getApplicationInfo(this.f5183.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException unused) {
            C3263ac.m1563();
            return file;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static byte[] m6100(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException unused) {
            C3263ac.m1563();
            return new byte[0];
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static JSONObject m6095(String str, C1362 r5) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", r5.f7547);
        jSONObject.put("size", r5.f7548);
        jSONObject.put("name", r5.f7546);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m6097(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m6102(C1362 r2) {
        return (r2.f7549.indexOf(C2745.aux.f12794) == -1 || r2.f7546.indexOf(47) == -1) ? false : true;
    }
}
