package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

public class mP implements aC {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Method f3129;

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f3130;

    mP() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m3773(Context context, Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static File m3772(File file, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return new File(file, sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    static File m3767(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getCacheDir().getAbsolutePath());
        sb2.append(File.separator);
        sb2.append("belvedere-data-v2");
        sb2.append(File.separator);
        sb2.append(str2);
        File file = new File(sb2.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static String m3768(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if (!"content".equals(scheme)) {
            return "file".equals(scheme) ? uri.getLastPathSegment() : str;
        }
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return str;
        }
        try {
            if (query.moveToFirst()) {
                str = query.getString(0);
            }
            return str;
        } finally {
            query.close();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static mF m3770(Context context, Uri uri) {
        long j;
        String str;
        String str2;
        String str3 = "";
        long j2 = -1;
        if ("content".equals(uri.getScheme())) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri2 = uri;
            Cursor query = contentResolver.query(uri2, new String[]{"_size", "_display_name"}, (String) null, (String[]) null, (String) null);
            String type = contentResolver.getType(uri2);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        j2 = query.getLong(query.getColumnIndex("_size"));
                        str3 = query.getString(query.getColumnIndex("_display_name"));
                    }
                } finally {
                    query.close();
                }
            }
            str2 = str3;
            j = j2;
            str = type;
        } else {
            Uri uri3 = uri;
            str2 = str3;
            str = str2;
            j = -1;
        }
        return new mF((File) null, uri, uri, str2, str, j, -1, -1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Uri m3771(Context context, File file) {
        String format = String.format(Locale.US, "%s%s", new Object[]{context.getPackageName(), ".belvedere2.attachments"});
        try {
            return C3605mr.m6107(context, format, file);
        } catch (IllegalArgumentException unused) {
            new Object[1][0] = file.toString();
            return null;
        } catch (NullPointerException unused2) {
            new Object[1][0] = format;
            throw new RuntimeException("Please specify your application id");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static aC m3769(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new mP(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C3263ac.m1563();
            return null;
        } catch (NoSuchMethodException e) {
            C3263ac.m1563();
            e.getMessage();
            return null;
        } catch (Exception unused2) {
            C3263ac.m1563();
            return null;
        }
    }

    private mP(Class cls, Object obj) {
        this.f3130 = obj;
        this.f3129 = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m3774() {
        try {
            return ((Boolean) this.f3129.invoke(this.f3130, new Object[0])).booleanValue();
        } catch (Exception unused) {
            C3263ac.m1563();
            return false;
        }
    }
}
