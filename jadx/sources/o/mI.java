package o;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;

public final class mI extends AsyncTask<Uri, Void, List<mF>> {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f3104;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f3105;

    /* renamed from: Ι  reason: contains not printable characters */
    private final WeakReference<C3607mt<List<mF>>> f3106;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        super.onPostExecute(list);
        C3607mt mtVar = this.f3106.get();
        if (mtVar != null) {
            mtVar.internalSuccess(list);
        }
    }

    public mI(Context context, C3607mt<List<mF>> mtVar, String str) {
        this.f3105 = context;
        this.f3104 = str;
        this.f3106 = new WeakReference<>(mtVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:35|34|116|117|(2:119|120)|(2:123|124)|125|140|127) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ac, code lost:
        r24 = r3;
        r25 = r4;
        r22 = r7;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b9, code lost:
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c8, code lost:
        if (r17 != null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r22 = r7;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        r22 = r7;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r26 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0193, code lost:
        if (r17 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a0, code lost:
        r24 = r3;
        r25 = r4;
        r22 = r7;
        r17 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x01d1 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b8 A[ExcHandler: all (th java.lang.Throwable), PHI: r8 r9 
  PHI: (r8v7 java.io.FileOutputStream) = (r8v1 java.io.FileOutputStream), (r8v11 java.io.FileOutputStream), (r8v11 java.io.FileOutputStream), (r8v1 java.io.FileOutputStream), (r8v1 java.io.FileOutputStream) binds: [B:3:0x0016, B:50:0x010a, B:51:?, B:13:0x0057, B:14:?] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r9v9 java.io.InputStream) = (r9v1 java.io.InputStream), (r9v12 java.io.InputStream), (r9v12 java.io.InputStream), (r9v12 java.io.InputStream), (r9v12 java.io.InputStream) binds: [B:3:0x0016, B:50:0x010a, B:51:?, B:13:0x0057, B:14:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x0016] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c3 A[SYNTHETIC, Splitter:B:108:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d8 A[SYNTHETIC, Splitter:B:119:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01df A[SYNTHETIC, Splitter:B:123:0x01df] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f3 A[SYNTHETIC, Splitter:B:130:0x01f3] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01fa A[SYNTHETIC, Splitter:B:134:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x0103] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<o.mF> doInBackground(android.net.Uri... r29) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1048576(0x100000, float:1.469368E-39)
            byte[] r3 = new byte[r3]
            int r4 = r0.length
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0011:
            if (r7 >= r4) goto L_0x01fe
            r15 = r0[r7]
            r14 = 1
            android.content.Context r10 = r1.f3105     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            java.io.InputStream r9 = r10.openInputStream(r15)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            android.content.Context r10 = r1.f3105     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            java.lang.String r11 = r1.f3104     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            if (r12 != 0) goto L_0x003e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            java.lang.String r13 = "user"
            r12.<init>(r13)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            java.lang.String r13 = java.io.File.separator     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            r12.append(r13)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            r12.append(r11)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            java.lang.String r11 = r12.toString()     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            goto L_0x0040
        L_0x003e:
            java.lang.String r11 = "media"
        L_0x0040:
            java.io.File r11 = o.mP.m3767((android.content.Context) r10, (java.lang.String) r11)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            if (r11 != 0) goto L_0x004d
            r22 = r7
            r17 = r8
            r11 = 0
            goto L_0x00f1
        L_0x004d:
            java.lang.String r12 = o.mP.m3768((android.content.Context) r10, (android.net.Uri) r15)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ FileNotFoundException -> 0x01ac, IOException -> 0x01a0, all -> 0x01b8 }
            if (r13 == 0) goto L_0x00e7
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            java.lang.String r13 = "yyyyMMddHHmmssSSS"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            r12.<init>(r13, r5)     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            java.lang.String r13 = "attachment_%s"
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            java.util.Date r14 = new java.util.Date     // Catch:{ FileNotFoundException -> 0x00e1, IOException -> 0x00db, all -> 0x01b8 }
            r22 = r7
            r17 = r8
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r14.<init>(r7)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r7 = r12.format(r14)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r8 = 0
            r6[r8] = r7     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r12 = java.lang.String.format(r5, r13, r6)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            android.webkit.MimeTypeMap r5 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r6 = r15.getScheme()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r7 = "tmp"
            java.lang.String r8 = "content"
            boolean r8 = r8.equals(r6)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            if (r8 == 0) goto L_0x009d
            android.content.ContentResolver r6 = r10.getContentResolver()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r6 = r6.getType(r15)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r7 = r5.getExtensionFromMimeType(r6)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            goto L_0x00bc
        L_0x009d:
            java.lang.String r5 = "file"
            boolean r5 = r5.equals(r6)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            if (r5 == 0) goto L_0x00bc
            java.lang.String r5 = r15.getLastPathSegment()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r6 = "."
            int r6 = r5.lastIndexOf(r6)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r8 = -1
            if (r6 == r8) goto L_0x00bc
            int r6 = r6 + 1
            int r7 = r5.length()     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r7 = r5.substring(r6, r7)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
        L_0x00bc:
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r6 = ".%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ FileNotFoundException -> 0x00d3, IOException -> 0x00cb }
            r8 = 0
            r10[r8] = r7     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.lang.String r5 = java.lang.String.format(r5, r6, r10)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            goto L_0x00ec
        L_0x00cb:
            r24 = r3
            r25 = r4
            r27 = r15
            goto L_0x01bc
        L_0x00d3:
            r24 = r3
            r25 = r4
            r27 = r15
            goto L_0x01d1
        L_0x00db:
            r22 = r7
            r17 = r8
            goto L_0x0196
        L_0x00e1:
            r22 = r7
            r17 = r8
            goto L_0x019b
        L_0x00e7:
            r22 = r7
            r17 = r8
            r5 = 0
        L_0x00ec:
            java.io.File r5 = o.mP.m3772((java.io.File) r11, (java.lang.String) r12, (java.lang.String) r5)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r11 = r5
        L_0x00f1:
            r5 = 2
            if (r9 == 0) goto L_0x016c
            if (r11 == 0) goto L_0x016c
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r6 = 0
            r5[r6] = r15     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r6 = 1
            r5[r6] = r11     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
            r8.<init>(r11)     // Catch:{ FileNotFoundException -> 0x019b, IOException -> 0x0196 }
        L_0x0103:
            int r5 = r9.read(r3)     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            if (r5 <= 0) goto L_0x010e
            r7 = 0
            r8.write(r3, r7, r5)     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x01b8 }
            goto L_0x0103
        L_0x010e:
            android.content.Context r5 = r1.f3105     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            o.mF r5 = o.mP.m3770(r5, r15)     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            o.mF r7 = new o.mF     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            android.content.Context r10 = r1.f3105     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            android.net.Uri r12 = o.mP.m3771(r10, r11)     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            java.lang.String r14 = r11.getName()     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            java.lang.String r13 = r5.f3089     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            r23 = r7
            long r6 = r5.f3091     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            long r0 = r5.f3088     // Catch:{ FileNotFoundException -> 0x015f, IOException -> 0x0152, all -> 0x014b }
            r24 = r3
            r25 = r4
            long r3 = r5.f3094     // Catch:{ FileNotFoundException -> 0x0163, IOException -> 0x0156, all -> 0x014b }
            r10 = r23
            r5 = r13
            r13 = r15
            r26 = r8
            r8 = 1
            r27 = r15
            r15 = r5
            r16 = r6
            r18 = r0
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20)     // Catch:{ FileNotFoundException -> 0x0168, IOException -> 0x015b, all -> 0x0149 }
            r0 = r23
            r2.add(r0)     // Catch:{ FileNotFoundException -> 0x0168, IOException -> 0x015b, all -> 0x0149 }
            r17 = r26
            goto L_0x018c
        L_0x0149:
            r0 = move-exception
            goto L_0x014e
        L_0x014b:
            r0 = move-exception
            r26 = r8
        L_0x014e:
            r17 = r26
            goto L_0x01f1
        L_0x0152:
            r24 = r3
            r25 = r4
        L_0x0156:
            r26 = r8
            r27 = r15
            r8 = 1
        L_0x015b:
            r17 = r26
            goto L_0x01bc
        L_0x015f:
            r24 = r3
            r25 = r4
        L_0x0163:
            r26 = r8
            r27 = r15
            r8 = 1
        L_0x0168:
            r17 = r26
            goto L_0x01d1
        L_0x016c:
            r24 = r3
            r25 = r4
            r27 = r15
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x01d1, IOException -> 0x01bc }
            if (r9 != 0) goto L_0x0179
            r1 = 1
            goto L_0x017a
        L_0x0179:
            r1 = 0
        L_0x017a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x01d1, IOException -> 0x01bc }
            r3 = 0
            r0[r3] = r1     // Catch:{ FileNotFoundException -> 0x01d1, IOException -> 0x01bc }
            if (r11 != 0) goto L_0x0185
            r1 = 1
            goto L_0x0186
        L_0x0185:
            r1 = 0
        L_0x0186:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x01d1, IOException -> 0x01bc }
            r0[r8] = r1     // Catch:{ FileNotFoundException -> 0x01d1, IOException -> 0x01bc }
        L_0x018c:
            if (r9 == 0) goto L_0x0193
            r9.close()     // Catch:{ IOException -> 0x0192 }
            goto L_0x0193
        L_0x0192:
        L_0x0193:
            if (r17 == 0) goto L_0x01cd
            goto L_0x01ca
        L_0x0196:
            r24 = r3
            r25 = r4
            goto L_0x01a8
        L_0x019b:
            r24 = r3
            r25 = r4
            goto L_0x01b4
        L_0x01a0:
            r24 = r3
            r25 = r4
            r22 = r7
            r17 = r8
        L_0x01a8:
            r27 = r15
            r8 = 1
            goto L_0x01bc
        L_0x01ac:
            r24 = r3
            r25 = r4
            r22 = r7
            r17 = r8
        L_0x01b4:
            r27 = r15
            r8 = 1
            goto L_0x01d1
        L_0x01b8:
            r0 = move-exception
            r17 = r8
            goto L_0x01f1
        L_0x01bc:
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x01f0 }
            r1 = 0
            r0[r1] = r27     // Catch:{ all -> 0x01f0 }
            if (r9 == 0) goto L_0x01c8
            r9.close()     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01c8
        L_0x01c7:
        L_0x01c8:
            if (r17 == 0) goto L_0x01cd
        L_0x01ca:
            r17.close()     // Catch:{ IOException -> 0x01cd }
        L_0x01cd:
            r8 = r17
            r1 = 0
            goto L_0x01e4
        L_0x01d1:
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x01f0 }
            r1 = 0
            r0[r1] = r27     // Catch:{ all -> 0x01f0 }
            if (r9 == 0) goto L_0x01dd
            r9.close()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01dd
        L_0x01dc:
        L_0x01dd:
            if (r17 == 0) goto L_0x01e2
            r17.close()     // Catch:{ IOException -> 0x01e2 }
        L_0x01e2:
            r8 = r17
        L_0x01e4:
            int r7 = r22 + 1
            r1 = r28
            r0 = r29
            r3 = r24
            r4 = r25
            goto L_0x0011
        L_0x01f0:
            r0 = move-exception
        L_0x01f1:
            if (r9 == 0) goto L_0x01f8
            r9.close()     // Catch:{ IOException -> 0x01f7 }
            goto L_0x01f8
        L_0x01f7:
        L_0x01f8:
            if (r17 == 0) goto L_0x01fd
            r17.close()     // Catch:{ IOException -> 0x01fd }
        L_0x01fd:
            throw r0
        L_0x01fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mI.doInBackground(android.net.Uri[]):java.util.List");
    }
}
