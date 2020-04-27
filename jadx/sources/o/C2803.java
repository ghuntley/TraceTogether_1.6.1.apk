package o;

import android.net.Uri;

/* renamed from: o.Ӏʌ  reason: contains not printable characters */
public final class C2803 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C0299<String, Uri> f13219 = new C0299<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public static synchronized Uri m14714(String str) {
        Uri uri;
        synchronized (C2803.class) {
            uri = f13219.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f13219.put(str, uri);
            }
        }
        return uri;
    }
}
