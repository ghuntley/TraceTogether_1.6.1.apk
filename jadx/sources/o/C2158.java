package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ϧ  reason: contains not printable characters */
public final class C2158 extends C1698 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2128 f10324 = new C2128(this, m15904(), "google_app_measurement_local.db");

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f10325;

    C2158(C2658 r3) {
        super(r3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public final boolean m11435() {
        return false;
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public final void m11434() {
        m15903();
        y_();
        try {
            int delete = m11427().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                t_().m11713().m11603("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            t_().m11714().m11603("Error resetting local analytics data. error", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3 A[SYNTHETIC, Splitter:B:47:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0118 A[SYNTHETIC] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m11425(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.m15903()
            r16.y_()
            boolean r0 = r1.f10325
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x012b
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.m11427()     // Catch:{ SQLiteFullException -> 0x00fc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00bf, all -> 0x00bb }
            if (r9 != 0) goto L_0x0038
            r1.f10325 = r8     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b5 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b5 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b5 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x0120
        L_0x0053:
            r0 = move-exception
            goto L_0x00b7
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x00fe
        L_0x0059:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x00a0
            o.Іɛ r15 = r16.t_()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            o.ϵı r15 = r15.m11714()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r15.m11606(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            o.Іɛ r4 = r16.t_()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            o.ϵı r4 = r4.m11714()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            r4.m11604(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x00a0:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b3, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00ae
            r12.close()
        L_0x00ae:
            r9.close()
            r2 = 1
            return r2
        L_0x00b3:
            r7 = r12
            goto L_0x00eb
        L_0x00b5:
            r0 = move-exception
            r12 = r7
        L_0x00b7:
            r7 = r9
            goto L_0x00c1
        L_0x00b9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00bb:
            r0 = move-exception
            r9 = r7
            r12 = r9
            goto L_0x0120
        L_0x00bf:
            r0 = move-exception
            r12 = r7
        L_0x00c1:
            if (r7 == 0) goto L_0x00cc
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x00cc
            r7.endTransaction()     // Catch:{ all -> 0x00e7 }
        L_0x00cc:
            o.Іɛ r2 = r16.t_()     // Catch:{ all -> 0x00e7 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x00e7 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.m11603(r4, r0)     // Catch:{ all -> 0x00e7 }
            r2 = 1
            r1.f10325 = r2     // Catch:{ all -> 0x00e7 }
            if (r12 == 0) goto L_0x00e1
            r12.close()
        L_0x00e1:
            if (r7 == 0) goto L_0x0118
            r7.close()
            goto L_0x0118
        L_0x00e7:
            r0 = move-exception
            r9 = r7
            goto L_0x0120
        L_0x00ea:
            r9 = r7
        L_0x00eb:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x011e }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f6
            r7.close()
        L_0x00f6:
            if (r9 == 0) goto L_0x0118
            r9.close()
            goto L_0x0118
        L_0x00fc:
            r0 = move-exception
            r9 = r7
        L_0x00fe:
            o.Іɛ r2 = r16.t_()     // Catch:{ all -> 0x011e }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.m11603(r4, r0)     // Catch:{ all -> 0x011e }
            r2 = 1
            r1.f10325 = r2     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0113
            r7.close()
        L_0x0113:
            if (r9 == 0) goto L_0x0118
            r9.close()
        L_0x0118:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x011e:
            r0 = move-exception
            r12 = r7
        L_0x0120:
            if (r12 == 0) goto L_0x0125
            r12.close()
        L_0x0125:
            if (r9 == 0) goto L_0x012a
            r9.close()
        L_0x012a:
            throw r0
        L_0x012b:
            o.Іɛ r0 = r16.t_()
            o.ϵı r0 = r0.m11713()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.m11606(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2158.m11425(int, byte[]):boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11444(C2441 r4) {
        Parcel obtain = Parcel.obtain();
        r4.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m11425(0, marshall);
        }
        t_().m11718().m11606("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11443(C2113 r4) {
        Parcel obtain = Parcel.obtain();
        r4.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m11425(1, marshall);
        }
        t_().m11718().m11606("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m11429(C2527 r3) {
        m15901();
        byte[] r32 = C2151.m11347((Parcelable) r3);
        if (r32.length <= 131072) {
            return m11425(2, r32);
        }
        t_().m11718().m11606("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v14, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v45, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v46, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v47, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v48, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v49, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v50, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v52, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v55, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v58, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v59, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v60, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v61, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r24v13 */
    /* JADX WARNING: type inference failed for: r24v30 */
    /* JADX WARNING: type inference failed for: r24v53 */
    /* JADX WARNING: type inference failed for: r24v56 */
    /* JADX WARNING: type inference failed for: r24v57 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:90|91|92|93) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:62|63|64|65|195) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ea, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ef, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01f2, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f6, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r10 = null;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r10 = null;
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r10 = null;
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        t_().m11714().m11606("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        t_().m11714().m11606("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        t_().m11714().m11606("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x011e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0154 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0202 A[SYNTHETIC, Splitter:B:146:0x0202] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0250 A[SYNTHETIC] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o.C1519> m11436(int r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "Error reading entries from local database"
            r23.y_()
            r23.m15903()
            boolean r0 = r1.f10325
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r23.m11426()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0020:
            if (r7 >= r5) goto L_0x0260
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r23.m11427()     // Catch:{ SQLiteFullException -> 0x0236, SQLiteDatabaseLockedException -> 0x0223, SQLiteException -> 0x01fd, all -> 0x01f9 }
            if (r15 != 0) goto L_0x0040
            r1.f10325 = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0036, all -> 0x0031 }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x0255
        L_0x0036:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x0200
        L_0x003b:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x0239
        L_0x0040:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01f5, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x01ee, all -> 0x01e9 }
            o.ьɹ r0 = r23.r_()     // Catch:{ SQLiteFullException -> 0x01f5, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x01ee, all -> 0x01e9 }
            o.ιͱ<java.lang.Boolean> r10 = o.C2529.f11552     // Catch:{ SQLiteFullException -> 0x01f5, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x01ee, all -> 0x01e9 }
            boolean r0 = r0.m13372((o.C2019<java.lang.Boolean>) r10)     // Catch:{ SQLiteFullException -> 0x01f5, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x01ee, all -> 0x01e9 }
            r10 = 100
            java.lang.String r11 = "entry"
            java.lang.String r12 = "type"
            java.lang.String r13 = "rowid"
            r19 = -1
            if (r0 == 0) goto L_0x00a0
            long r16 = m11424((android.database.sqlite.SQLiteDatabase) r15)     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0096, all -> 0x0091 }
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0036, all -> 0x0031 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0036, all -> 0x0031 }
            r14[r6] = r16     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0036, all -> 0x0031 }
            goto L_0x006e
        L_0x006c:
            r0 = r3
            r14 = r0
        L_0x006e:
            java.lang.String r16 = "messages"
            java.lang.String[] r12 = new java.lang.String[]{r13, r12, r11}     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0096, all -> 0x0091 }
            r17 = 0
            r18 = 0
            java.lang.String r21 = "rowid asc"
            java.lang.String r22 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01f2, SQLiteException -> 0x0096, all -> 0x0091 }
            r10 = r15
            r11 = r16
            r13 = r0
            r24 = r15
            r15 = r17
            r16 = r18
            r17 = r21
            r18 = r22
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x01de, all -> 0x01da }
            goto L_0x00ba
        L_0x0091:
            r0 = move-exception
            r24 = r15
            goto L_0x01db
        L_0x0096:
            r0 = move-exception
            r24 = r15
            goto L_0x01df
        L_0x009b:
            r0 = move-exception
            r24 = r15
            goto L_0x01e6
        L_0x00a0:
            r24 = r15
            java.lang.String r0 = "messages"
            java.lang.String[] r12 = new java.lang.String[]{r13, r12, r11}     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x01de, all -> 0x01da }
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x01de, all -> 0x01da }
            r10 = r24
            r11 = r0
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x01e5, SQLiteDatabaseLockedException -> 0x01e2, SQLiteException -> 0x01de, all -> 0x01da }
        L_0x00ba:
            r10 = r0
        L_0x00bb:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            if (r0 == 0) goto L_0x0191
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            if (r0 != 0) goto L_0x0103
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            int r0 = r12.length     // Catch:{ ɩ -> 0x00ee }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ɩ -> 0x00ee }
            r11.setDataPosition(r6)     // Catch:{ ɩ -> 0x00ee }
            android.os.Parcelable$Creator<o.кǃ> r0 = o.C2441.CREATOR     // Catch:{ ɩ -> 0x00ee }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ɩ -> 0x00ee }
            o.кǃ r0 = (o.C2441) r0     // Catch:{ ɩ -> 0x00ee }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            if (r0 == 0) goto L_0x00bb
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x00ec:
            r0 = move-exception
            goto L_0x00ff
        L_0x00ee:
            o.Іɛ r0 = r23.t_()     // Catch:{ all -> 0x00ec }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x00ec }
            java.lang.String r12 = "Failed to load event from local database"
            r0.m11606(r12)     // Catch:{ all -> 0x00ec }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x00ff:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
        L_0x0103:
            if (r0 != r9) goto L_0x0139
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            int r0 = r12.length     // Catch:{ ɩ -> 0x011e }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ɩ -> 0x011e }
            r11.setDataPosition(r6)     // Catch:{ ɩ -> 0x011e }
            android.os.Parcelable$Creator<o.πı> r0 = o.C2113.CREATOR     // Catch:{ ɩ -> 0x011e }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ɩ -> 0x011e }
            o.πı r0 = (o.C2113) r0     // Catch:{ ɩ -> 0x011e }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x012f
        L_0x011c:
            r0 = move-exception
            goto L_0x0135
        L_0x011e:
            o.Іɛ r0 = r23.t_()     // Catch:{ all -> 0x011c }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x011c }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.m11606(r12)     // Catch:{ all -> 0x011c }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            r0 = r3
        L_0x012f:
            if (r0 == 0) goto L_0x00bb
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x0135:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
        L_0x0139:
            if (r0 != r11) goto L_0x0170
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            int r0 = r12.length     // Catch:{ ɩ -> 0x0154 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ɩ -> 0x0154 }
            r11.setDataPosition(r6)     // Catch:{ ɩ -> 0x0154 }
            android.os.Parcelable$Creator<o.эɪ> r0 = o.C2527.CREATOR     // Catch:{ ɩ -> 0x0154 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ɩ -> 0x0154 }
            o.эɪ r0 = (o.C2527) r0     // Catch:{ ɩ -> 0x0154 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x0165
        L_0x0152:
            r0 = move-exception
            goto L_0x016c
        L_0x0154:
            o.Іɛ r0 = r23.t_()     // Catch:{ all -> 0x0152 }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x0152 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.m11606(r12)     // Catch:{ all -> 0x0152 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            r0 = r3
        L_0x0165:
            if (r0 == 0) goto L_0x00bb
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x016c:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
        L_0x0170:
            r11 = 3
            if (r0 != r11) goto L_0x0182
            o.Іɛ r0 = r23.t_()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            o.ϵı r0 = r0.A_()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            java.lang.String r11 = "Skipping app launch break"
            r0.m11606(r11)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x0182:
            o.Іɛ r0 = r23.t_()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            o.ϵı r0 = r0.m11714()     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            java.lang.String r11 = "Unknown record type in local database"
            r0.m11606(r11)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            goto L_0x00bb
        L_0x0191:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x01d5, SQLiteDatabaseLockedException -> 0x01d1, SQLiteException -> 0x01cd, all -> 0x01c8 }
            r13 = r24
            int r0 = r13.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            if (r0 >= r11) goto L_0x01b6
            o.Іɛ r0 = r23.t_()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            o.ϵı r0 = r0.m11714()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.m11606(r11)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
        L_0x01b6:
            r13.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            r13.endTransaction()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x0225, SQLiteException -> 0x01c3 }
            r10.close()
            r13.close()
            return r4
        L_0x01c3:
            r0 = move-exception
            goto L_0x0200
        L_0x01c5:
            r0 = move-exception
            goto L_0x0239
        L_0x01c8:
            r0 = move-exception
            r13 = r24
            goto L_0x0255
        L_0x01cd:
            r0 = move-exception
            r13 = r24
            goto L_0x0200
        L_0x01d1:
            r13 = r24
            goto L_0x0225
        L_0x01d5:
            r0 = move-exception
            r13 = r24
            goto L_0x0239
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            r13 = r24
            goto L_0x01eb
        L_0x01de:
            r0 = move-exception
        L_0x01df:
            r13 = r24
            goto L_0x01f0
        L_0x01e2:
            r13 = r24
            goto L_0x01f3
        L_0x01e5:
            r0 = move-exception
        L_0x01e6:
            r13 = r24
            goto L_0x01f7
        L_0x01e9:
            r0 = move-exception
            r13 = r15
        L_0x01eb:
            r10 = r3
            goto L_0x0255
        L_0x01ee:
            r0 = move-exception
            r13 = r15
        L_0x01f0:
            r10 = r3
            goto L_0x0200
        L_0x01f2:
            r13 = r15
        L_0x01f3:
            r10 = r3
            goto L_0x0225
        L_0x01f5:
            r0 = move-exception
            r13 = r15
        L_0x01f7:
            r10 = r3
            goto L_0x0239
        L_0x01f9:
            r0 = move-exception
            r10 = r3
            r13 = r10
            goto L_0x0255
        L_0x01fd:
            r0 = move-exception
            r10 = r3
            r13 = r10
        L_0x0200:
            if (r13 == 0) goto L_0x020b
            boolean r11 = r13.inTransaction()     // Catch:{ all -> 0x0254 }
            if (r11 == 0) goto L_0x020b
            r13.endTransaction()     // Catch:{ all -> 0x0254 }
        L_0x020b:
            o.Іɛ r11 = r23.t_()     // Catch:{ all -> 0x0254 }
            o.ϵı r11 = r11.m11714()     // Catch:{ all -> 0x0254 }
            r11.m11603(r2, r0)     // Catch:{ all -> 0x0254 }
            r1.f10325 = r9     // Catch:{ all -> 0x0254 }
            if (r10 == 0) goto L_0x021d
            r10.close()
        L_0x021d:
            if (r13 == 0) goto L_0x0250
            r13.close()
            goto L_0x0250
        L_0x0223:
            r10 = r3
            r13 = r10
        L_0x0225:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0254 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x0230
            r10.close()
        L_0x0230:
            if (r13 == 0) goto L_0x0250
            r13.close()
            goto L_0x0250
        L_0x0236:
            r0 = move-exception
            r10 = r3
            r13 = r10
        L_0x0239:
            o.Іɛ r11 = r23.t_()     // Catch:{ all -> 0x0254 }
            o.ϵı r11 = r11.m11714()     // Catch:{ all -> 0x0254 }
            r11.m11603(r2, r0)     // Catch:{ all -> 0x0254 }
            r1.f10325 = r9     // Catch:{ all -> 0x0254 }
            if (r10 == 0) goto L_0x024b
            r10.close()
        L_0x024b:
            if (r13 == 0) goto L_0x0250
            r13.close()
        L_0x0250:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0254:
            r0 = move-exception
        L_0x0255:
            if (r10 == 0) goto L_0x025a
            r10.close()
        L_0x025a:
            if (r13 == 0) goto L_0x025f
            r13.close()
        L_0x025f:
            throw r0
        L_0x0260:
            o.Іɛ r0 = r23.t_()
            o.ϵı r0 = r0.A_()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.m11606(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2158.m11436(int):java.util.List");
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    public final boolean m11440() {
        return m11425(3, new byte[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: ǀ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m11432() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.y_()
            r11.m15903()
            boolean r1 = r11.f10325
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            boolean r1 = r11.m11426()
            if (r1 != 0) goto L_0x0015
            return r2
        L_0x0015:
            r1 = 5
            r3 = 0
            r4 = 5
        L_0x0018:
            if (r3 >= r1) goto L_0x0090
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.m11427()     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            if (r5 != 0) goto L_0x002a
            r11.f10325 = r6     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            if (r5 == 0) goto L_0x0029
            r5.close()
        L_0x0029:
            return r2
        L_0x002a:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r9[r2] = r10     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r5.delete(r7, r8, r9)     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0074, SQLiteDatabaseLockedException -> 0x0068, SQLiteException -> 0x0049 }
            r5.close()
            return r6
        L_0x0047:
            r0 = move-exception
            goto L_0x008a
        L_0x0049:
            r7 = move-exception
            if (r5 == 0) goto L_0x0055
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x0047 }
            if (r8 == 0) goto L_0x0055
            r5.endTransaction()     // Catch:{ all -> 0x0047 }
        L_0x0055:
            o.Іɛ r8 = r11.t_()     // Catch:{ all -> 0x0047 }
            o.ϵı r8 = r8.m11714()     // Catch:{ all -> 0x0047 }
            r8.m11603(r0, r7)     // Catch:{ all -> 0x0047 }
            r11.f10325 = r6     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x0087
            r5.close()
            goto L_0x0087
        L_0x0068:
            long r6 = (long) r4
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0047 }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x0087
            r5.close()
            goto L_0x0087
        L_0x0074:
            r7 = move-exception
            o.Іɛ r8 = r11.t_()     // Catch:{ all -> 0x0047 }
            o.ϵı r8 = r8.m11714()     // Catch:{ all -> 0x0047 }
            r8.m11603(r0, r7)     // Catch:{ all -> 0x0047 }
            r11.f10325 = r6     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x0087
            r5.close()
        L_0x0087:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x008a:
            if (r5 == 0) goto L_0x008f
            r5.close()
        L_0x008f:
            throw r0
        L_0x0090:
            o.Іɛ r0 = r11.t_()
            o.ϵı r0 = r0.A_()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.m11606(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2158.m11432():boolean");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static long m11424(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j = query.getLong(0);
                query.close();
                return j;
            }
            query.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ϳ  reason: contains not printable characters */
    private final SQLiteDatabase m11427() {
        if (this.f10325) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10324.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f10325 = true;
        return null;
    }

    /* renamed from: ͻ  reason: contains not printable characters */
    private final boolean m11426() {
        return m15904().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11430() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11446() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11445() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m11428() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m11441() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m11437() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m11442() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m11433() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m11439() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m11431() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m11447() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m11438() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
