package o;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import o.C0993;

/* renamed from: o.ж  reason: contains not printable characters */
public final class C2424 extends C0993<If> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2402 f11025;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f11026;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Uri f11027;

    /* renamed from: ȷ  reason: contains not printable characters */
    private volatile Exception f11028 = null;

    /* renamed from: ɨ  reason: contains not printable characters */
    private volatile Exception f11029 = null;

    /* renamed from: ɪ  reason: contains not printable characters */
    private volatile int f11030 = 0;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final AtomicLong f11031 = new AtomicLong(0);

    /* renamed from: ɾ  reason: contains not printable characters */
    private volatile Uri f11032 = null;

    /* renamed from: ɿ  reason: contains not printable characters */
    private volatile String f11033;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C0950 f11034;

    /* renamed from: І  reason: contains not printable characters */
    private C2775 f11035;

    /* renamed from: і  reason: contains not printable characters */
    private int f11036 = 262144;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C0367 f11037;

    /* renamed from: ӏ  reason: contains not printable characters */
    private volatile C1450 f11038;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:7|8|9|(3:10|11|(8:13|14|15|18|19|(5:21|(2:23|24)|25|26|32)|33|34))|16|18|19|(0)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2424(o.C0950 r7, android.net.Uri r8) {
        /*
            r6 = this;
            r6.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r6.f11031 = r0
            r0 = 262144(0x40000, float:3.67342E-40)
            r6.f11036 = r0
            r0 = 0
            r6.f11032 = r0
            r6.f11029 = r0
            r6.f11028 = r0
            r1 = 0
            r6.f11030 = r1
            if (r8 == 0) goto L_0x0098
            o.ȣΙ r1 = r7.f5945
            r6.f11034 = r7
            r6.f11038 = r0
            o.Ӏя<o.ıʚ> r7 = r1.f5943
            if (r7 == 0) goto L_0x002f
            o.Ӏя<o.ıʚ> r7 = r1.f5943
            java.lang.Object r7 = r7.m14812()
            o.ıʚ r7 = (o.C0367) r7
            goto L_0x0030
        L_0x002f:
            r7 = r0
        L_0x0030:
            r6.f11037 = r7
            r6.f11027 = r8
            o.Ӏȣ r7 = new o.Ӏȣ
            o.ȣІ r8 = r6.f11034
            o.ȣΙ r8 = r8.f5945
            com.google.firebase.FirebaseApp r8 = r8.f5944
            android.content.Context r8 = r8.m1074()
            o.ıʚ r2 = r6.f11037
            long r3 = r1.f5941
            r7.<init>(r8, r2, r3)
            r6.f11035 = r7
            o.ȣІ r7 = r6.f11034     // Catch:{ FileNotFoundException -> 0x0086 }
            o.ȣΙ r7 = r7.f5945     // Catch:{ FileNotFoundException -> 0x0086 }
            com.google.firebase.FirebaseApp r7 = r7.f5944     // Catch:{ FileNotFoundException -> 0x0086 }
            android.content.Context r7 = r7.m1074()     // Catch:{ FileNotFoundException -> 0x0086 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0086 }
            r1 = -1
            android.net.Uri r8 = r6.f11027     // Catch:{ IOException | NullPointerException -> 0x006b }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r8 = r7.openFileDescriptor(r8, r3)     // Catch:{ IOException | NullPointerException -> 0x006b }
            if (r8 == 0) goto L_0x006b
            long r3 = r8.getStatSize()     // Catch:{ IOException | NullPointerException -> 0x006b }
            r8.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x006c
        L_0x006b:
            r3 = r1
        L_0x006c:
            android.net.Uri r8 = r6.f11027     // Catch:{ FileNotFoundException -> 0x0086 }
            java.io.InputStream r7 = r7.openInputStream(r8)     // Catch:{ FileNotFoundException -> 0x0086 }
            if (r7 == 0) goto L_0x008b
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x007b
            r7.available()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0081 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0081 }
            goto L_0x008a
        L_0x0081:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0088
        L_0x0086:
            r7 = move-exception
            r8 = r0
        L_0x0088:
            r6.f11029 = r7
        L_0x008a:
            r7 = r8
        L_0x008b:
            o.вɹ r8 = new o.вɹ
            r8.<init>(r7)
            r6.f11025 = r8
            r7 = 1
            r6.f11026 = r7
            r6.f11032 = r0
            return
        L_0x0098:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null reference"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2424.<init>(o.ȣІ, android.net.Uri):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C0950 m12516() {
        return this.f11034;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m12514() {
        C1666.m9526();
        C1666.m9527(new mT(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* renamed from: ɪ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m12513() {
        /*
            r14 = this;
            o.Ӏȣ r0 = r14.f11035
            r1 = 0
            r0.f13151 = r1
            r0 = 1
            int[] r2 = new int[r0]
            r3 = 4
            r2[r1] = r3
            boolean r2 = r14.m7053((int[]) r2)
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            o.ȣІ r2 = r14.f11034
            android.net.Uri r4 = r2.f5946
            java.lang.String r4 = r4.getPath()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            if (r5 != 0) goto L_0x004e
            java.lang.String r5 = "/"
            boolean r7 = r4.equals(r5)
            if (r7 == 0) goto L_0x002a
            goto L_0x004e
        L_0x002a:
            r7 = 47
            int r7 = r4.lastIndexOf(r7)
            r8 = -1
            if (r7 != r8) goto L_0x0034
            goto L_0x0038
        L_0x0034:
            java.lang.String r5 = r4.substring(r1, r7)
        L_0x0038:
            android.net.Uri r4 = r2.f5946
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r5)
            android.net.Uri r4 = r4.build()
            o.ȣІ r5 = new o.ȣІ
            o.ȣΙ r2 = r2.f5945
            r5.<init>(r4, r2)
            goto L_0x004f
        L_0x004e:
            r5 = r6
        L_0x004f:
            if (r5 != 0) goto L_0x005a
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile..."
            r2.<init>(r4)
            r14.f11029 = r2
        L_0x005a:
            java.lang.Exception r2 = r14.f11029
            if (r2 == 0) goto L_0x005f
            return
        L_0x005f:
            android.net.Uri r2 = r14.f11032
            if (r2 != 0) goto L_0x013f
            o.ɭյ r2 = r14.f11038
            if (r2 == 0) goto L_0x0070
            o.ɭյ r2 = r14.f11038
            o.ɭյ$if<java.lang.String> r2 = r2.f7806
            T r2 = r2.f7812
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0071
        L_0x0070:
            r2 = r6
        L_0x0071:
            android.net.Uri r4 = r14.f11027
            if (r4 == 0) goto L_0x008f
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x008f
            o.ȣІ r2 = r14.f11034
            o.ȣΙ r2 = r2.f5945
            com.google.firebase.FirebaseApp r2 = r2.f5944
            android.content.Context r2 = r2.m1074()
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r4 = r14.f11027
            java.lang.String r2 = r2.getType(r4)
        L_0x008f:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0097
            java.lang.String r2 = "application/octet-stream"
        L_0x0097:
            o.լƚ r4 = new o.լƚ
            o.ȣІ r5 = r14.f11034
            android.net.Uri r5 = r5.f5946
            o.ȣІ r7 = r14.f11034
            o.ȣΙ r7 = r7.f5945
            com.google.firebase.FirebaseApp r7 = r7.f5944
            o.ɭյ r8 = r14.f11038
            if (r8 == 0) goto L_0x011e
            o.ɭյ r6 = r14.f11038
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            o.ɭյ$if<java.lang.String> r9 = r6.f7806
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x00bf
            o.ɭյ$if<java.lang.String> r9 = r6.f7806
            T r9 = r9.f7812
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentType"
            r8.put(r10, r9)
        L_0x00bf:
            o.ɭյ$if<java.util.Map<java.lang.String, java.lang.String>> r9 = r6.f7800
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x00d5
            org.json.JSONObject r9 = new org.json.JSONObject
            o.ɭյ$if<java.util.Map<java.lang.String, java.lang.String>> r10 = r6.f7800
            T r10 = r10.f7812
            java.util.Map r10 = (java.util.Map) r10
            r9.<init>(r10)
            java.lang.String r10 = "metadata"
            r8.put(r10, r9)
        L_0x00d5:
            o.ɭյ$if<java.lang.String> r9 = r6.f7805
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x00e6
            o.ɭյ$if<java.lang.String> r9 = r6.f7805
            T r9 = r9.f7812
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "cacheControl"
            r8.put(r10, r9)
        L_0x00e6:
            o.ɭյ$if<java.lang.String> r9 = r6.f7801
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x00f7
            o.ɭյ$if<java.lang.String> r9 = r6.f7801
            T r9 = r9.f7812
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentDisposition"
            r8.put(r10, r9)
        L_0x00f7:
            o.ɭյ$if<java.lang.String> r9 = r6.f7811
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x0108
            o.ɭյ$if<java.lang.String> r9 = r6.f7811
            T r9 = r9.f7812
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentEncoding"
            r8.put(r10, r9)
        L_0x0108:
            o.ɭյ$if<java.lang.String> r9 = r6.f7803
            boolean r9 = r9.f7813
            if (r9 == 0) goto L_0x0119
            o.ɭյ$if<java.lang.String> r6 = r6.f7803
            T r6 = r6.f7812
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = "contentLanguage"
            r8.put(r9, r6)
        L_0x0119:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r8)
        L_0x011e:
            r4.<init>(r5, r7, r6, r2)
            o.Ӏȣ r2 = r14.f11035
            r2.m14665(r4)
            boolean r2 = r14.m12510(r4)
            if (r2 == 0) goto L_0x0142
            java.lang.String r2 = "X-Goog-Upload-URL"
            java.lang.String r2 = r4.m15181((java.lang.String) r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0142
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r14.f11032 = r2
            goto L_0x0142
        L_0x013f:
            r14.m12509(r1)
        L_0x0142:
            boolean r2 = r14.m12508()
        L_0x0146:
            if (r2 == 0) goto L_0x01f2
            o.вɹ r2 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            int r4 = r14.f11036     // Catch:{ IOException -> 0x01e0 }
            r2.m12427(r4)     // Catch:{ IOException -> 0x01e0 }
            int r2 = r14.f11036     // Catch:{ IOException -> 0x01e0 }
            o.вɹ r4 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            int r4 = r4.f10970     // Catch:{ IOException -> 0x01e0 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ IOException -> 0x01e0 }
            o.Ә r4 = new o.Ә     // Catch:{ IOException -> 0x01e0 }
            o.ȣІ r5 = r14.f11034     // Catch:{ IOException -> 0x01e0 }
            android.net.Uri r6 = r5.f5946     // Catch:{ IOException -> 0x01e0 }
            o.ȣІ r5 = r14.f11034     // Catch:{ IOException -> 0x01e0 }
            o.ȣΙ r5 = r5.f5945     // Catch:{ IOException -> 0x01e0 }
            com.google.firebase.FirebaseApp r7 = r5.f5944     // Catch:{ IOException -> 0x01e0 }
            android.net.Uri r8 = r14.f11032     // Catch:{ IOException -> 0x01e0 }
            o.вɹ r5 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            byte[] r9 = r5.f10969     // Catch:{ IOException -> 0x01e0 }
            java.util.concurrent.atomic.AtomicLong r5 = r14.f11031     // Catch:{ IOException -> 0x01e0 }
            long r10 = r5.get()     // Catch:{ IOException -> 0x01e0 }
            o.вɹ r5 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            boolean r13 = r5.f10968     // Catch:{ IOException -> 0x01e0 }
            r5 = r4
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r12, r13)     // Catch:{ IOException -> 0x01e0 }
            o.ıʚ r5 = r14.f11037     // Catch:{ IOException -> 0x01e0 }
            java.lang.String r5 = o.C3060.m15613((o.C0367) r5)     // Catch:{ IOException -> 0x01e0 }
            o.ȣІ r6 = r14.f11034     // Catch:{ IOException -> 0x01e0 }
            o.ȣΙ r6 = r6.f5945     // Catch:{ IOException -> 0x01e0 }
            com.google.firebase.FirebaseApp r6 = r6.f5944     // Catch:{ IOException -> 0x01e0 }
            android.content.Context r6 = r6.m1074()     // Catch:{ IOException -> 0x01e0 }
            r4.m15183((java.lang.String) r5, (android.content.Context) r6)     // Catch:{ IOException -> 0x01e0 }
            boolean r5 = r14.m12510(r4)     // Catch:{ IOException -> 0x01e0 }
            if (r5 != 0) goto L_0x0198
            r2 = 262144(0x40000, float:3.67342E-40)
            r14.f11036 = r2     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e3
        L_0x0198:
            java.util.concurrent.atomic.AtomicLong r5 = r14.f11031     // Catch:{ IOException -> 0x01e0 }
            long r6 = (long) r2     // Catch:{ IOException -> 0x01e0 }
            r5.getAndAdd(r6)     // Catch:{ IOException -> 0x01e0 }
            o.вɹ r5 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            boolean r5 = r5.f10968     // Catch:{ IOException -> 0x01e0 }
            if (r5 != 0) goto L_0x01b5
            o.вɹ r4 = r14.f11025     // Catch:{ IOException -> 0x01e0 }
            r4.m12428(r2)     // Catch:{ IOException -> 0x01e0 }
            int r2 = r14.f11036     // Catch:{ IOException -> 0x01e0 }
            r4 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 >= r4) goto L_0x01e3
            int r2 = r14.f11036     // Catch:{ IOException -> 0x01e0 }
            int r2 = r2 << r0
            r14.f11036 = r2     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e3
        L_0x01b5:
            o.ɭյ$ǃ r2 = new o.ɭյ$ǃ     // Catch:{ JSONException -> 0x01dc }
            org.json.JSONObject r4 = r4.m15188()     // Catch:{ JSONException -> 0x01dc }
            o.ȣІ r5 = r14.f11034     // Catch:{ JSONException -> 0x01dc }
            r2.<init>(r4, r5)     // Catch:{ JSONException -> 0x01dc }
            o.ɭյ r4 = new o.ɭյ     // Catch:{ JSONException -> 0x01dc }
            o.ɭյ r5 = r2.f7814     // Catch:{ JSONException -> 0x01dc }
            boolean r2 = r2.f7815     // Catch:{ JSONException -> 0x01dc }
            r4.<init>(r5, r2, r1)     // Catch:{ JSONException -> 0x01dc }
            r14.f11038 = r4     // Catch:{ JSONException -> 0x01dc }
            int[] r2 = new int[r0]     // Catch:{ IOException -> 0x01e0 }
            r2[r1] = r3     // Catch:{ IOException -> 0x01e0 }
            r14.m7053((int[]) r2)     // Catch:{ IOException -> 0x01e0 }
            int[] r2 = new int[r0]     // Catch:{ IOException -> 0x01e0 }
            r4 = 128(0x80, float:1.794E-43)
            r2[r1] = r4     // Catch:{ IOException -> 0x01e0 }
            r14.m7053((int[]) r2)     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e3
        L_0x01dc:
            r2 = move-exception
            r14.f11029 = r2     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e3
        L_0x01e0:
            r2 = move-exception
            r14.f11029 = r2
        L_0x01e3:
            boolean r2 = r14.m12508()
            if (r2 == 0) goto L_0x0146
            int[] r4 = new int[r0]
            r4[r1] = r3
            r14.m7053((int[]) r4)
            goto L_0x0146
        L_0x01f2:
            boolean r0 = r14.f11026
            if (r0 == 0) goto L_0x0203
            int r0 = r14.f6041
            r1 = 16
            if (r0 == r1) goto L_0x0203
            o.вɹ r0 = r14.f11025     // Catch:{ IOException -> 0x0203 }
            java.io.InputStream r0 = r0.f10971     // Catch:{ IOException -> 0x0203 }
            r0.close()     // Catch:{ IOException -> 0x0203 }
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2424.m12513():void");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean m12511() {
        if (!"final".equals(this.f11033)) {
            return true;
        }
        if (this.f11029 == null) {
            this.f11029 = new IOException("The server has terminated the upload session", this.f11028);
        }
        m7053(new int[]{64});
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m12509(boolean z) {
        C3104 r0 = new C3104(this.f11034.f5946, this.f11034.f5945.f5944, this.f11032);
        if ("final".equals(this.f11033)) {
            return false;
        }
        if (z) {
            this.f11035.m14665(r0);
            if (!m12510(r0)) {
                return false;
            }
        } else {
            r0.m15183(C3060.m15613(this.f11037), this.f11034.f5945.f5944.m1074());
            if (!m12510(r0)) {
                return false;
            }
        }
        if ("final".equals(r0.m15181("X-Goog-Upload-Status"))) {
            this.f11029 = new IOException("The server has terminated the upload session");
            return false;
        }
        String r11 = r0.m15181("X-Goog-Upload-Size-Received");
        long parseLong = !TextUtils.isEmpty(r11) ? Long.parseLong(r11) : 0;
        long j = this.f11031.get();
        int i = (j > parseLong ? 1 : (j == parseLong ? 0 : -1));
        if (i > 0) {
            this.f11029 = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        } else if (i >= 0) {
            return true;
        } else {
            try {
                long j2 = parseLong - j;
                if (((long) this.f11025.m12428((int) j2)) != j2) {
                    this.f11029 = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (this.f11031.compareAndSet(j, parseLong)) {
                    return true;
                } else {
                    this.f11029 = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e) {
                this.f11029 = e;
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m12512() {
        this.f11035.f13151 = true;
        final C3093 r0 = this.f11032 != null ? new C3093(this.f11034.f5946, this.f11034.f5945.f5944, this.f11032) : null;
        if (r0 != null) {
            C1666.m9526();
            C1666.m9528(new Runnable() {
                public final void run() {
                    r0.m15183(C3060.m15613(C2424.this.f11037), C2424.this.f11034.f5945.f5944.m1074());
                }
            });
        }
        this.f11029 = C1398.m8574(Status.f531);
        super.m7049();
    }

    /* renamed from: o.ж$If */
    public class If extends C0993<If>.if {
        If(C2424 r1, Exception exc) {
            super(r1, exc);
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean m12508() {
        if (this.f6041 == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f11029 = new InterruptedException();
            m7053(new int[]{64});
            return false;
        } else if (this.f6041 == 32) {
            m7053(new int[]{256});
            return false;
        } else if (this.f6041 == 8) {
            m7053(new int[]{16});
            return false;
        } else if (!m12511()) {
            return false;
        } else {
            if (this.f11032 == null) {
                if (this.f11029 == null) {
                    this.f11029 = new IllegalStateException("Unable to obtain an upload URL.");
                }
                m7053(new int[]{64});
                return false;
            } else if (this.f11029 != null) {
                m7053(new int[]{64});
                return false;
            } else {
                if (!(this.f11028 != null || this.f11030 < 200 || this.f11030 >= 300) || m12509(true)) {
                    return true;
                }
                if (m12511()) {
                    m7053(new int[]{64});
                }
                return false;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m12510(C2940 r4) {
        int i = r4.f13654;
        if (C2775.m14664(i)) {
            i = -2;
        }
        this.f11030 = i;
        this.f11028 = r4.m15180();
        this.f11033 = r4.m15181("X-Goog-Upload-Status");
        int i2 = this.f11030;
        return (i2 == 308 || (i2 >= 200 && i2 < 300)) && this.f11028 == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final /* synthetic */ C0993.C0994 m12515() {
        C1398 r0;
        Exception exc = this.f11029 != null ? this.f11029 : this.f11028;
        int i = this.f11030;
        if (exc instanceof C1398) {
            r0 = (C1398) exc;
        } else {
            if (!(i == 0 || (i >= 200 && i < 300)) || exc != null) {
                r0 = new C1398(exc instanceof C3159 ? -13040 : i != -2 ? i != 401 ? i != 409 ? i != 403 ? i != 404 ? -13000 : -13010 : -13021 : -13031 : -13020 : -13030, exc);
            } else {
                r0 = null;
            }
        }
        this.f11031.get();
        Uri uri = this.f11032;
        C1450 r2 = this.f11038;
        return new If(this, r0);
    }
}
