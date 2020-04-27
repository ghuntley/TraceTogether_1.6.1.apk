package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: o.іſ  reason: contains not printable characters */
public class C2564 extends ContentProvider {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f11683 = "firebase_crashlytics_ndk_enabled";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f11684 = "CrashlyticsInitProvider";

    /* renamed from: o.іſ$ǃ  reason: contains not printable characters */
    interface C2565 {
        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m13646(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (m13645(context, new aA(), new C2569())) {
            try {
                C3263ac.m1562(context, m13644(context.getApplicationContext()));
                C3263ac.m1563();
                return true;
            } catch (IllegalStateException unused) {
                C3263ac.m1563();
                return false;
            }
        } else {
            C3263ac.m1563();
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[SYNTHETIC, Splitter:B:12:0x0029] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.C3269ai[] m13644(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x001e }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x001e }
            if (r5 == 0) goto L_0x0021
            java.lang.String r2 = "firebase_crashlytics_ndk_enabled"
            boolean r5 = r5.getBoolean(r2, r1)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r5 == 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x001e:
            o.C3263ac.m1563()
        L_0x0021:
            r5 = 0
        L_0x0022:
            com.crashlytics.android.Crashlytics r2 = new com.crashlytics.android.Crashlytics
            r2.<init>()
            if (r5 == 0) goto L_0x003c
            o.C3263ac.m1563()     // Catch:{ all -> 0x0039 }
            r5 = 2
            o.ai[] r5 = new o.C3269ai[r5]     // Catch:{ all -> 0x0039 }
            r5[r1] = r2     // Catch:{ all -> 0x0039 }
            com.crashlytics.android.ndk.CrashlyticsNdk r3 = new com.crashlytics.android.ndk.CrashlyticsNdk     // Catch:{ all -> 0x0039 }
            r3.<init>()     // Catch:{ all -> 0x0039 }
            r5[r0] = r3     // Catch:{ all -> 0x0039 }
            return r5
        L_0x0039:
            o.C3263ac.m1563()
        L_0x003c:
            o.ai[] r5 = new o.C3269ai[r0]
            r5[r1] = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2564.m13644(android.content.Context):o.ai[]");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m13645(Context context, aA aAVar, C2565 r3) {
        if (aA.m1450(context)) {
            return r3.m13646(context);
        }
        int r2 = C3285aw.m1672(context, "io.fabric.auto_initialize", "bool");
        if (r2 == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(r2);
        if (z) {
            C3263ac.m1563();
        }
        return z;
    }
}
