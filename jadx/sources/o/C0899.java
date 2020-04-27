package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.ǃȷ  reason: contains not printable characters */
public final class C0899 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0336 f5742;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f5743;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f5744;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0558 m6668(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0558.m5159(typedValue.data);
            }
            C0558 r2 = C0558.m5160(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (r2 != null) {
                return r2;
            }
        }
        return C0558.m5159(0);
    }

    public C0899(Context context, String str, String str2) {
        this.f5744 = context.getApplicationContext();
        this.f5743 = str;
        if (str2 == null) {
            this.f5742 = null;
        } else {
            this.f5742 = new C0336(this.f5744);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0364<C0343> m6670() {
        try {
            return m6669();
        } catch (IOException e) {
            return new C0364<>((Throwable) e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C0364<C0343> m6669() {
        C0364<C0343> r2;
        C1738 r1;
        C2414.m12459();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f5743).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    if (contentType == null) {
                        contentType = C3273am.f1530;
                    }
                    if (contentType.contains("application/zip")) {
                        C2414.m12459();
                        r1 = C1738.ZIP;
                        if (this.f5742 == null) {
                            r2 = C3048.m15547(new ZipInputStream(httpURLConnection.getInputStream()), (String) null);
                        } else {
                            r2 = C3048.m15547(new ZipInputStream(new FileInputStream(this.f5742.m4443(this.f5743, httpURLConnection.getInputStream(), r1))), this.f5743);
                        }
                    } else {
                        C2414.m12459();
                        r1 = C1738.JSON;
                        if (this.f5742 == null) {
                            r2 = C3048.m15546(httpURLConnection.getInputStream(), (String) null);
                        } else {
                            r2 = C3048.m15546((InputStream) new FileInputStream(new File(this.f5742.m4443(this.f5743, httpURLConnection.getInputStream(), r1).getAbsolutePath())), this.f5743);
                        }
                    }
                    if (!(this.f5742 == null || r2.f3823 == null)) {
                        C0336 r3 = this.f5742;
                        File file = new File(r3.m4442(), C0336.m4437(this.f5743, r1, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean renameTo = file.renameTo(file2);
                        C2414.m12459();
                        if (!renameTo) {
                            StringBuilder sb = new StringBuilder("Unable to rename cache file ");
                            sb.append(file.getAbsolutePath());
                            sb.append(" to ");
                            sb.append(file2.getAbsolutePath());
                            sb.append(".");
                            C2414.m12460(sb.toString());
                        }
                    }
                    C2414.m12459();
                    httpURLConnection.disconnect();
                    return r2;
                }
            }
            String r12 = m6667(httpURLConnection);
            StringBuilder sb2 = new StringBuilder("Unable to fetch ");
            sb2.append(this.f5743);
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append("\n");
            sb2.append(r12);
            return new C0364<>((Throwable) new IllegalArgumentException(sb2.toString()));
        } catch (Exception e) {
            return new C0364<>((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m6667(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public C0899() {
    }
}
