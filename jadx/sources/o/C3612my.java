package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: o.my  reason: case insensitive filesystem */
final class C3612my {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String[] f3364 = {"_id", "_display_name", "_size", "width", "height"};

    /* renamed from: ι  reason: contains not printable characters */
    final Context f3365;

    C3612my(Context context) {
        this.f3365 = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final List<mF> m3958() {
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f3365.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f3364, (String) null, (String[]) null, String.format(Locale.US, "%s DESC LIMIT %s", new Object[]{"datetaken", 500}));
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    Uri contentUri = MediaStore.Files.getContentUri("external", query.getLong(query.getColumnIndex("_id")));
                    long j = query.getLong(query.getColumnIndex("_size"));
                    long j2 = query.getLong(query.getColumnIndex("width"));
                    long j3 = query.getLong(query.getColumnIndex("height"));
                    String string = query.getString(query.getColumnIndex("_display_name"));
                    String str = "image/jpeg";
                    if (!TextUtils.isEmpty(string) && (lastIndexOf = string.lastIndexOf(".")) != -1) {
                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string.substring(lastIndexOf + 1));
                    }
                    arrayList.add(new mF((File) null, contentUri, contentUri, string, str, j, j2, j3));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }
}
