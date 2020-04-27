package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0987;
import o.C2274;
import o.C2477;
import o.C2745;

/* renamed from: o.Іє  reason: contains not printable characters */
final class C2309 extends C2042 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public static final String[] f10721 = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final String[] f10722 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String[] f10723 = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public static final String[] f10724 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String[] f10725 = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public static final String[] f10726 = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public static final String[] f10727 = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final String[] f10728 = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public final C1883 f10729 = new C1883(w_());

    /* renamed from: І  reason: contains not printable characters */
    private final C2289 f10730 = new C2289(this, m15904(), "google_app_measurement.db");

    C2309(C1924 r3) {
        super(r3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m12040() {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12045() {
        m10931();
        m12047().beginTransaction();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12030() {
        m10931();
        m12047().setTransactionSuccessful();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12018() {
        m10931();
        m12047().endTransaction();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final long m11998(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = m12047().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            t_().m11714().m11605("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final long m11999(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = m12047().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final SQLiteDatabase m12047() {
        y_();
        try {
            return this.f10730.getWritableDatabase();
        } catch (SQLiteException e) {
            t_().A_().m11603("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2440 m12050(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r15 = r27
            r14 = r28
            o.C2745.C2746.m14562((java.lang.String) r27)
            o.C2745.C2746.m14562((java.lang.String) r28)
            r26.y_()
            r26.m10931()
            o.ьɹ r0 = r26.r_()
            o.ιͱ<java.lang.Boolean> r1 = o.C2529.f11506
            boolean r0 = r0.m13384(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = "current_session_count"
            r1.add(r2)
        L_0x003e:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r2 = r26.m12047()     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r4 = r1
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            java.lang.String r5 = "app_id=? and name=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r6[r10] = r15     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r11 = 1
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012c }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r2 != 0) goto L_0x006b
            r12.close()
            return r18
        L_0x006b:
            long r4 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            long r6 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            long r16 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r1 = 3
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r8 = 0
            if (r2 == 0) goto L_0x0083
            r19 = r8
            goto L_0x0089
        L_0x0083:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r19 = r1
        L_0x0089:
            r1 = 4
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r2 == 0) goto L_0x0093
            r21 = r18
            goto L_0x009d
        L_0x0093:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r21 = r1
        L_0x009d:
            r1 = 5
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r2 == 0) goto L_0x00a7
            r22 = r18
            goto L_0x00b1
        L_0x00a7:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r22 = r1
        L_0x00b1:
            r1 = 6
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r2 == 0) goto L_0x00bb
            r23 = r18
            goto L_0x00c5
        L_0x00bb:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r23 = r1
        L_0x00c5:
            r1 = 7
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r2 != 0) goto L_0x00de
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r24 = 1
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00d7
            r10 = 1
        L_0x00d7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r24 = r1
            goto L_0x00e0
        L_0x00de:
            r24 = r18
        L_0x00e0:
            if (r0 == 0) goto L_0x00ef
            r0 = 8
            boolean r1 = r12.isNull(r0)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            if (r1 != 0) goto L_0x00ef
            long r0 = r12.getLong(r0)     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r8 = r0
        L_0x00ef:
            o.кı r0 = new o.кı     // Catch:{ SQLiteException -> 0x0128, all -> 0x0124 }
            r1 = r0
            r2 = r27
            r3 = r28
            r10 = r16
            r25 = r12
            r12 = r19
            r14 = r21
            r15 = r22
            r16 = r23
            r17 = r24
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0122 }
            boolean r1 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0122 }
            if (r1 == 0) goto L_0x011e
            o.Іɛ r1 = r26.t_()     // Catch:{ SQLiteException -> 0x0122 }
            o.ϵı r1 = r1.m11714()     // Catch:{ SQLiteException -> 0x0122 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = o.C2244.m11698(r27)     // Catch:{ SQLiteException -> 0x0122 }
            r1.m11603(r2, r3)     // Catch:{ SQLiteException -> 0x0122 }
        L_0x011e:
            r25.close()
            return r0
        L_0x0122:
            r0 = move-exception
            goto L_0x0133
        L_0x0124:
            r0 = move-exception
            r25 = r12
            goto L_0x0155
        L_0x0128:
            r0 = move-exception
            r25 = r12
            goto L_0x0133
        L_0x012c:
            r0 = move-exception
            r25 = r18
            goto L_0x0155
        L_0x0130:
            r0 = move-exception
            r25 = r18
        L_0x0133:
            o.Іɛ r1 = r26.t_()     // Catch:{ all -> 0x0154 }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x0154 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = o.C2244.m11698(r27)     // Catch:{ all -> 0x0154 }
            o.κІ r4 = r26.v_()     // Catch:{ all -> 0x0154 }
            r5 = r28
            java.lang.String r4 = r4.m11216((java.lang.String) r5)     // Catch:{ all -> 0x0154 }
            r1.m11604(r2, r3, r4, r0)     // Catch:{ all -> 0x0154 }
            if (r25 == 0) goto L_0x0153
            r25.close()
        L_0x0153:
            return r18
        L_0x0154:
            r0 = move-exception
        L_0x0155:
            if (r25 == 0) goto L_0x015a
            r25.close()
        L_0x015a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12050(java.lang.String, java.lang.String):o.кı");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12020(C2440 r6) {
        C2745.C2746.m14555(r6);
        y_();
        m10931();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r6.f11083);
        contentValues.put("name", r6.f11084);
        contentValues.put("lifetime_count", Long.valueOf(r6.f11079));
        contentValues.put("current_bundle_count", Long.valueOf(r6.f11077));
        contentValues.put("last_fire_timestamp", Long.valueOf(r6.f11086));
        contentValues.put("last_bundled_timestamp", Long.valueOf(r6.f11087));
        contentValues.put("last_bundled_day", r6.f11082);
        contentValues.put("last_sampled_complex_event_id", r6.f11078);
        contentValues.put("last_sampling_rate", r6.f11085);
        if (r_().m13384(r6.f11083, C2529.f11506)) {
            contentValues.put("current_session_count", Long.valueOf(r6.f11081));
        }
        contentValues.put("last_exempt_from_sampling", (r6.f11080 == null || !r6.f11080.booleanValue()) ? null : 1L);
        try {
            if (m12047().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                t_().m11714().m11603("Failed to insert/update event aggregates (got -1). appId", C2244.m11698(r6.f11083));
            }
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing event aggregates. appId", C2244.m11698(r6.f11083), e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12046(String str, String str2) {
        C2745.C2746.m14562(str);
        C2745.C2746.m14562(str2);
        y_();
        m10931();
        try {
            int delete = m12047().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (!C1140.m7582() || !this.f10106.m10497().m13384(str, C2529.f11567)) {
                t_().m11713().m11603("Deleted user attribute rows", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            if (!C1140.m7582() || !this.f10106.m10497().m13384(str, C2529.f11567)) {
                t_().m11714().m11604("Error deleting user attribute. appId", C2244.m11698(str), v_().m11222(str2), e);
            } else {
                t_().m11714().m11604("Error deleting user property. appId", C2244.m11698(str), v_().m11222(str2), e);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12021(C2152 r9) {
        C2745.C2746.m14555(r9);
        y_();
        m10931();
        if (m12029(r9.f10316, r9.f10313) == null) {
            if (C2151.m11345(r9.f10313)) {
                if (m11998("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{r9.f10316}) >= ((long) r_().m13391(r9.f10316))) {
                    return false;
                }
            } else if (!r_().m13384(r9.f10316, C2529.f11526)) {
                if (m11998("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r9.f10316, r9.f10315}) >= 25) {
                    return false;
                }
            } else if (!"_npa".equals(r9.f10313)) {
                if (m11998("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r9.f10316, r9.f10315}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r9.f10316);
        contentValues.put("origin", r9.f10315);
        contentValues.put("name", r9.f10313);
        contentValues.put("set_timestamp", Long.valueOf(r9.f10317));
        m12008(contentValues, "value", r9.f10314);
        try {
            if (m12047().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                t_().m11714().m11603("Failed to insert/update user property (got -1). appId", C2244.m11698(r9.f10316));
            }
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing user property. appId", C2244.m11698(r9.f10316), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2152 m12029(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            o.C2745.C2746.m14562((java.lang.String) r19)
            o.C2745.C2746.m14562((java.lang.String) r20)
            r18.y_()
            r18.m10931()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.m12047()     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007a }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0076, all -> 0x0072 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0072 }
            r11 = r18
            java.lang.Object r7 = r11.m12003((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0070 }
            o.ϜІ r0 = new o.ϜІ     // Catch:{ SQLiteException -> 0x0070 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0070 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0070 }
            if (r1 == 0) goto L_0x006c
            o.Іɛ r1 = r18.t_()     // Catch:{ SQLiteException -> 0x0070 }
            o.ϵı r1 = r1.m11714()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = o.C2244.m11698(r19)     // Catch:{ SQLiteException -> 0x0070 }
            r1.m11603(r2, r3)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x006c:
            r10.close()
            return r0
        L_0x0070:
            r0 = move-exception
            goto L_0x0083
        L_0x0072:
            r0 = move-exception
            r11 = r18
            goto L_0x00a3
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x0083
        L_0x007a:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a3
        L_0x007f:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0083:
            o.Іɛ r1 = r18.t_()     // Catch:{ all -> 0x00a2 }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = o.C2244.m11698(r19)     // Catch:{ all -> 0x00a2 }
            o.κІ r4 = r18.v_()     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = r4.m11222((java.lang.String) r8)     // Catch:{ all -> 0x00a2 }
            r1.m11604(r2, r3, r4, r0)     // Catch:{ all -> 0x00a2 }
            if (r10 == 0) goto L_0x00a1
            r10.close()
        L_0x00a1:
            return r9
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12029(java.lang.String, java.lang.String):o.ϜІ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o.C2152> m12017(java.lang.String r14) {
        /*
            r13 = this;
            o.C2745.C2746.m14562((java.lang.String) r14)
            r13.y_()
            r13.m10931()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.m12047()     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x003d:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = ""
        L_0x0049:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x007c }
            r3 = 3
            java.lang.Object r10 = r13.m12003((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r10 != 0) goto L_0x0068
            o.Іɛ r3 = r13.t_()     // Catch:{ SQLiteException -> 0x007c }
            o.ϵı r3 = r3.m11714()     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = o.C2244.m11698(r14)     // Catch:{ SQLiteException -> 0x007c }
            r3.m11603(r4, r5)     // Catch:{ SQLiteException -> 0x007c }
            goto L_0x0072
        L_0x0068:
            o.ϜІ r3 = new o.ϜІ     // Catch:{ SQLiteException -> 0x007c }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x007c }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x007c }
        L_0x0072:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x007c:
            r0 = move-exception
            goto L_0x0083
        L_0x007e:
            r14 = move-exception
            r2 = r1
            goto L_0x009b
        L_0x0081:
            r0 = move-exception
            r2 = r1
        L_0x0083:
            o.Іɛ r3 = r13.t_()     // Catch:{ all -> 0x009a }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = o.C2244.m11698(r14)     // Catch:{ all -> 0x009a }
            r3.m11605(r4, r14, r0)     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0099
            r2.close()
        L_0x0099:
            return r1
        L_0x009a:
            r14 = move-exception
        L_0x009b:
            if (r2 == 0) goto L_0x00a0
            r2.close()
        L_0x00a0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12017(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o.C2152> m12048(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            o.C2745.C2746.m14562((java.lang.String) r22)
            r21.y_()
            r21.m10931()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            android.database.sqlite.SQLiteDatabase r12 = r21.m12047()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            if (r4 != 0) goto L_0x0086
            r2.close()
            return r0
        L_0x0086:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a2
            o.Іɛ r3 = r21.t_()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            o.ϵı r3 = r3.m11714()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r3.m11603(r4, r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r12 = r21
            goto L_0x00e1
        L_0x00a2:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.m12003((android.database.Cursor) r2, (int) r4)     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ea }
            if (r10 != 0) goto L_0x00cd
            o.Іɛ r4 = r21.t_()     // Catch:{ SQLiteException -> 0x00e7 }
            o.ϵı r4 = r4.m11714()     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = o.C2244.m11698(r22)     // Catch:{ SQLiteException -> 0x00e7 }
            r14 = r24
            r4.m11604(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00e7 }
            goto L_0x00db
        L_0x00cd:
            r14 = r24
            o.ϜІ r15 = new o.ϜІ     // Catch:{ SQLiteException -> 0x00e7 }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00e7 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00e7 }
        L_0x00db:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00e7 }
            if (r4 != 0) goto L_0x00e5
        L_0x00e1:
            r2.close()
            return r0
        L_0x00e5:
            r5 = r13
            goto L_0x0086
        L_0x00e7:
            r0 = move-exception
            r5 = r13
            goto L_0x0108
        L_0x00ea:
            r0 = move-exception
            goto L_0x0108
        L_0x00ec:
            r0 = move-exception
            r12 = r21
            goto L_0x0120
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0108
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x0107
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x0105
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0121
        L_0x0100:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0105:
            r5 = r23
        L_0x0107:
            r2 = r1
        L_0x0108:
            o.Іɛ r3 = r21.t_()     // Catch:{ all -> 0x011f }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = o.C2244.m11698(r22)     // Catch:{ all -> 0x011f }
            r3.m11604(r4, r6, r5, r0)     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x011e
            r2.close()
        L_0x011e:
            return r1
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r1 = r2
        L_0x0121:
            if (r1 == 0) goto L_0x0126
            r1.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12048(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m12052(C2527 r9) {
        C2745.C2746.m14555(r9);
        y_();
        m10931();
        if (m12029(r9.f11486, r9.f11482.f10236) == null) {
            if (m11998("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{r9.f11486}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r9.f11486);
        contentValues.put("origin", r9.f11485);
        contentValues.put("name", r9.f11482.f10236);
        m12008(contentValues, "value", r9.f11482.m11268());
        contentValues.put("active", Boolean.valueOf(r9.f11481));
        contentValues.put("trigger_event_name", r9.f11484);
        contentValues.put("trigger_timeout", Long.valueOf(r9.f11488));
        m15901();
        contentValues.put("timed_out_event", C2151.m11347((Parcelable) r9.f11489));
        contentValues.put("creation_timestamp", Long.valueOf(r9.f11479));
        m15901();
        contentValues.put("triggered_event", C2151.m11347((Parcelable) r9.f11487));
        contentValues.put("triggered_timestamp", Long.valueOf(r9.f11482.f10232));
        contentValues.put("time_to_live", Long.valueOf(r9.f11480));
        m15901();
        contentValues.put("expired_event", C2151.m11347((Parcelable) r9.f11483));
        try {
            if (m12047().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                t_().m11714().m11603("Failed to insert/update conditional user property (got -1)", C2244.m11698(r9.f11486));
            }
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing conditional user property", C2244.m11698(r9.f11486), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2527 m12039(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            o.C2745.C2746.m14562((java.lang.String) r30)
            o.C2745.C2746.m14562((java.lang.String) r31)
            r29.y_()
            r29.m10931()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.m12047()     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fb, all -> 0x00f6 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ee }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ee }
            r10 = r29
            java.lang.Object r5 = r10.m12003((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00ec }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ec }
            if (r0 == 0) goto L_0x005f
            r20 = 1
            goto L_0x0061
        L_0x005f:
            r20 = 0
        L_0x0061:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ec }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec }
            o.ιս r0 = r29.p_()     // Catch:{ SQLiteException -> 0x00ec }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable$Creator<o.кǃ> r2 = o.C2441.CREATOR     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable r0 = r0.m11111((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ec }
            r22 = r0
            o.кǃ r22 = (o.C2441) r22     // Catch:{ SQLiteException -> 0x00ec }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec }
            o.ιս r0 = r29.p_()     // Catch:{ SQLiteException -> 0x00ec }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable$Creator<o.кǃ> r2 = o.C2441.CREATOR     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable r0 = r0.m11111((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ec }
            r25 = r0
            o.кǃ r25 = (o.C2441) r25     // Catch:{ SQLiteException -> 0x00ec }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ec }
            o.ιս r0 = r29.p_()     // Catch:{ SQLiteException -> 0x00ec }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable$Creator<o.кǃ> r2 = o.C2441.CREATOR     // Catch:{ SQLiteException -> 0x00ec }
            android.os.Parcelable r0 = r0.m11111((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ec }
            r28 = r0
            o.кǃ r28 = (o.C2441) r28     // Catch:{ SQLiteException -> 0x00ec }
            o.πı r17 = new o.πı     // Catch:{ SQLiteException -> 0x00ec }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ec }
            o.эɪ r0 = new o.эɪ     // Catch:{ SQLiteException -> 0x00ec }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ec }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ec }
            if (r1 == 0) goto L_0x00e8
            o.Іɛ r1 = r29.t_()     // Catch:{ SQLiteException -> 0x00ec }
            o.ϵı r1 = r1.m11714()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = o.C2244.m11698(r30)     // Catch:{ SQLiteException -> 0x00ec }
            o.κІ r4 = r29.v_()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r4 = r4.m11222((java.lang.String) r7)     // Catch:{ SQLiteException -> 0x00ec }
            r1.m11605(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00e8:
            r9.close()
            return r0
        L_0x00ec:
            r0 = move-exception
            goto L_0x00ff
        L_0x00ee:
            r0 = move-exception
            r10 = r29
            goto L_0x011f
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x00ff
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            r9 = r8
            goto L_0x011f
        L_0x00fb:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x00ff:
            o.Іɛ r1 = r29.t_()     // Catch:{ all -> 0x011e }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x011e }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = o.C2244.m11698(r30)     // Catch:{ all -> 0x011e }
            o.κІ r4 = r29.v_()     // Catch:{ all -> 0x011e }
            java.lang.String r4 = r4.m11222((java.lang.String) r7)     // Catch:{ all -> 0x011e }
            r1.m11604(r2, r3, r4, r0)     // Catch:{ all -> 0x011e }
            if (r9 == 0) goto L_0x011d
            r9.close()
        L_0x011d:
            return r8
        L_0x011e:
            r0 = move-exception
        L_0x011f:
            if (r9 == 0) goto L_0x0124
            r9.close()
        L_0x0124:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12039(java.lang.String, java.lang.String):o.эɪ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m12015(String str, String str2) {
        C2745.C2746.m14562(str);
        C2745.C2746.m14562(str2);
        y_();
        m10931();
        try {
            return m12047().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            t_().m11714().m11604("Error deleting conditional property", C2244.m11698(str), v_().m11222(str2), e);
            return 0;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C2527> m12028(String str, String str2, String str3) {
        C2745.C2746.m14562(str);
        y_();
        m10931();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m12036(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2527> m12036(String str, String[] strArr) {
        y_();
        m10931();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = m12047().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object r9 = m12003(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    long j2 = cursor.getLong(8);
                    long j3 = cursor.getLong(10);
                    boolean z2 = z;
                    C2527 r2 = r3;
                    C2527 r3 = new C2527(string, string2, new C2113(string3, j3, r9, string2), j2, z2, string4, (C2441) p_().m11111(cursor.getBlob(7), C2441.CREATOR), j, (C2441) p_().m11111(cursor.getBlob(9), C2441.CREATOR), cursor.getLong(11), (C2441) p_().m11111(cursor.getBlob(12), C2441.CREATOR));
                    arrayList.add(r2);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    t_().m11714().m11603("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e) {
            t_().m11714().m11603("Error querying conditional user property value", e);
            List<C2527> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0119 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011d A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0153 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0155 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0164 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0179 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0195 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a5 A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01db A[Catch:{ SQLiteException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021d  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2457 m12038(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            o.C2745.C2746.m14562((java.lang.String) r35)
            r34.y_()
            r34.m10931()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.m12047()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fa }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fa }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fa }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fa }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fa }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f2 }
            if (r4 != 0) goto L_0x0069
            r3.close()
            return r2
        L_0x0069:
            o.пı r4 = new o.пı     // Catch:{ SQLiteException -> 0x01f6, all -> 0x01f2 }
            r5 = r34
            o.Ψ r6 = r5.f10106     // Catch:{ SQLiteException -> 0x01f0 }
            o.ѵı r6 = r6.m10495()     // Catch:{ SQLiteException -> 0x01f0 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x01f0 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12623((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12613((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12641((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12649((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12611((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12643((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12656((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12650((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12622((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12598((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r7 != 0) goto L_0x00d7
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r6 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r6 = 0
            goto L_0x00d8
        L_0x00d7:
            r6 = 1
        L_0x00d8:
            r4.m12642((boolean) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12658((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12620(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12626(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12661(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12606(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12628((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r7 == 0) goto L_0x011d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0122
        L_0x011d:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x0122:
            r4.m12640((long) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12629((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12633(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12615(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12659((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r8 = 0
            if (r7 == 0) goto L_0x0155
            r6 = r8
            goto L_0x0159
        L_0x0155:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x0159:
            r4.m12637(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r7 != 0) goto L_0x016d
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r6 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r6 = 0
            goto L_0x016e
        L_0x016d:
            r6 = 1
        L_0x016e:
            r4.m12601((boolean) r6)     // Catch:{ SQLiteException -> 0x01f0 }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r7 != 0) goto L_0x0181
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r6 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r0 = 0
        L_0x0181:
            r4.m12624((boolean) r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12644((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r6 == 0) goto L_0x0196
            goto L_0x019a
        L_0x0196:
            long r8 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x019a:
            r4.m12655((long) r8)     // Catch:{ SQLiteException -> 0x01f0 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r6 != 0) goto L_0x01b7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01f0 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12600((java.util.List<java.lang.String>) r0)     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x01b7:
            boolean r0 = o.C1306.m8256()     // Catch:{ SQLiteException -> 0x01f0 }
            if (r0 == 0) goto L_0x01d2
            o.ьɹ r0 = r34.r_()     // Catch:{ SQLiteException -> 0x01f0 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11605     // Catch:{ SQLiteException -> 0x01f0 }
            boolean r0 = r0.m13384(r1, r6)     // Catch:{ SQLiteException -> 0x01f0 }
            if (r0 == 0) goto L_0x01d2
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f0 }
            r4.m12599((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x01d2:
            r4.m12639()     // Catch:{ SQLiteException -> 0x01f0 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01f0 }
            if (r0 == 0) goto L_0x01ec
            o.Іɛ r0 = r34.t_()     // Catch:{ SQLiteException -> 0x01f0 }
            o.ϵı r0 = r0.m11714()     // Catch:{ SQLiteException -> 0x01f0 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = o.C2244.m11698(r35)     // Catch:{ SQLiteException -> 0x01f0 }
            r0.m11603(r6, r7)     // Catch:{ SQLiteException -> 0x01f0 }
        L_0x01ec:
            r3.close()
            return r4
        L_0x01f0:
            r0 = move-exception
            goto L_0x0203
        L_0x01f2:
            r0 = move-exception
            r5 = r34
            goto L_0x021b
        L_0x01f6:
            r0 = move-exception
            r5 = r34
            goto L_0x0203
        L_0x01fa:
            r0 = move-exception
            r5 = r34
            r3 = r2
            goto L_0x021b
        L_0x01ff:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0203:
            o.Іɛ r4 = r34.t_()     // Catch:{ all -> 0x021a }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = o.C2244.m11698(r35)     // Catch:{ all -> 0x021a }
            r4.m11605(r6, r1, r0)     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0219
            r3.close()
        L_0x0219:
            return r2
        L_0x021a:
            r0 = move-exception
        L_0x021b:
            if (r3 == 0) goto L_0x0220
            r3.close()
        L_0x0220:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12038(java.lang.String):o.пı");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12051(C2457 r9) {
        C2745.C2746.m14555(r9);
        y_();
        m10931();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r9.m12610());
        contentValues.put("app_instance_id", r9.m12621());
        contentValues.put("gmp_app_id", r9.m12597());
        contentValues.put("resettable_device_id_hash", r9.m12654());
        contentValues.put("last_bundle_index", Long.valueOf(r9.m12602()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(r9.m12605()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(r9.m12619()));
        contentValues.put("app_version", r9.m12614());
        contentValues.put("app_store", r9.m12625());
        contentValues.put("gmp_version", Long.valueOf(r9.m12632()));
        contentValues.put("dev_cert_hash", Long.valueOf(r9.m12636()));
        contentValues.put("measurement_enabled", Boolean.valueOf(r9.m12603()));
        contentValues.put("day", Long.valueOf(r9.m12604()));
        contentValues.put("daily_public_events_count", Long.valueOf(r9.m12608()));
        contentValues.put("daily_events_count", Long.valueOf(r9.m12635()));
        contentValues.put("daily_conversions_count", Long.valueOf(r9.m12618()));
        contentValues.put("config_fetched_time", Long.valueOf(r9.m12634()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(r9.m12607()));
        contentValues.put("app_version_int", Long.valueOf(r9.m12660()));
        contentValues.put("firebase_instance_id", r9.m12627());
        contentValues.put("daily_error_events_count", Long.valueOf(r9.m12609()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(r9.m12617()));
        contentValues.put("health_monitor_sample", r9.m12631());
        contentValues.put("android_id", Long.valueOf(r9.m12653()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(r9.m12651()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(r9.m12646()));
        contentValues.put("admob_app_id", r9.m12657());
        contentValues.put("dynamite_version", Long.valueOf(r9.m12652()));
        if (r9.m12647() != null) {
            if (r9.m12647().size() == 0) {
                t_().A_().m11603("Safelisted events should not be an empty list. appId", r9.m12610());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", r9.m12647()));
            }
        }
        if (C1306.m8256() && r_().m13384(r9.m12610(), C2529.f11605)) {
            contentValues.put("ga_app_id", r9.m12648());
        }
        try {
            SQLiteDatabase r2 = m12047();
            if (((long) r2.update("apps", contentValues, "app_id = ?", new String[]{r9.m12610()})) == 0 && r2.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                t_().m11714().m11603("Failed to insert/update app (got -1). appId", C2244.m11698(r9.m12610()));
            }
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing app. appId", C2244.m11698(r9.m12610()), e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m12026(String str) {
        C2745.C2746.m14562(str);
        y_();
        m10931();
        try {
            return (long) m12047().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, r_().m13387(str, C2529.f11547))))});
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error deleting over the limit events. appId", C2244.m11698(str), e);
            return 0;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2307 m12037(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m12044(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2307 m12044(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2745.C2746.m14562(str);
        y_();
        m10931();
        String[] strArr = {str};
        C2307 r3 = new C2307();
        Cursor cursor = null;
        try {
            SQLiteDatabase r13 = m12047();
            cursor = r13.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                t_().A_().m11603("Not updating daily counts, app is not known. appId", C2244.m11698(str));
                cursor.close();
                return r3;
            }
            if (cursor.getLong(0) == j) {
                r3.f10718 = cursor.getLong(1);
                r3.f10717 = cursor.getLong(2);
                r3.f10716 = cursor.getLong(3);
                r3.f10719 = cursor.getLong(4);
                r3.f10715 = cursor.getLong(5);
            }
            if (z) {
                r3.f10718 += j2;
            }
            if (z2) {
                r3.f10717 += j2;
            }
            if (z3) {
                r3.f10716 += j2;
            }
            if (z4) {
                r3.f10719 += j2;
            }
            if (z5) {
                r3.f10715 += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(r3.f10717));
            contentValues.put("daily_events_count", Long.valueOf(r3.f10718));
            contentValues.put("daily_conversions_count", Long.valueOf(r3.f10716));
            contentValues.put("daily_error_events_count", Long.valueOf(r3.f10719));
            contentValues.put("daily_realtime_events_count", Long.valueOf(r3.f10715));
            r13.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return r3;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error updating daily counts. appId", C2244.m11698(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return r3;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] m12053(java.lang.String r11) {
        /*
            r10 = this;
            o.C2745.C2746.m14562((java.lang.String) r11)
            r10.y_()
            r10.m10931()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m12047()     // Catch:{ SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0053, all -> 0x0050 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0053, all -> 0x0050 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0053, all -> 0x0050 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x004e }
            if (r2 != 0) goto L_0x002f
            r1.close()
            return r0
        L_0x002f:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x004e }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x004e }
            if (r3 == 0) goto L_0x004a
            o.Іɛ r3 = r10.t_()     // Catch:{ SQLiteException -> 0x004e }
            o.ϵı r3 = r3.m11714()     // Catch:{ SQLiteException -> 0x004e }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = o.C2244.m11698(r11)     // Catch:{ SQLiteException -> 0x004e }
            r3.m11603(r4, r5)     // Catch:{ SQLiteException -> 0x004e }
        L_0x004a:
            r1.close()
            return r2
        L_0x004e:
            r2 = move-exception
            goto L_0x0055
        L_0x0050:
            r11 = move-exception
            r1 = r0
            goto L_0x006d
        L_0x0053:
            r2 = move-exception
            r1 = r0
        L_0x0055:
            o.Іɛ r3 = r10.t_()     // Catch:{ all -> 0x006c }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = o.C2244.m11698(r11)     // Catch:{ all -> 0x006c }
            r3.m11605(r4, r11, r2)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x006b
            r1.close()
        L_0x006b:
            return r0
        L_0x006c:
            r11 = move-exception
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()
        L_0x0072:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12053(java.lang.String):byte[]");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12023(C2477.aux aux, boolean z) {
        y_();
        m10931();
        C2745.C2746.m14555(aux);
        C2745.C2746.m14562(aux.m12911());
        C2745.C2746.m14557(aux.m12919());
        i_();
        long r0 = w_().m10846();
        if (aux.m12925() < r0 - C2518.m13366() || aux.m12925() > C2518.m13366() + r0) {
            t_().A_().m11604("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2244.m11698(aux.m12911()), Long.valueOf(r0), Long.valueOf(aux.m12925()));
        }
        try {
            byte[] r02 = p_().m11123(aux.m4781());
            t_().m11713().m11603("Saving bundle, size", Integer.valueOf(r02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", aux.m12911());
            contentValues.put("bundle_end_timestamp", Long.valueOf(aux.m12925()));
            contentValues.put("data", r02);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (aux.m12917()) {
                contentValues.put("retry_count", Integer.valueOf(aux.m12906()));
            }
            try {
                if (m12047().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                t_().m11714().m11603("Failed to insert bundle (got -1). appId", C2244.m11698(aux.m12911()));
                return false;
            } catch (SQLiteException e) {
                t_().m11714().m11605("Error storing bundle. appId", C2244.m11698(aux.m12911()), e);
                return false;
            }
        } catch (IOException e2) {
            t_().m11714().m11605("Data loss. Failed to serialize bundle. appId", C2244.m11698(aux.m12911()), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m12054() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m12047()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            o.Іɛ r3 = r6.t_()     // Catch:{ all -> 0x003a }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m11603(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12054():java.lang.String");
    }

    public final boolean h_() {
        return m11998("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<Pair<C2477.aux, Long>> m12027(String str, int i, int i2) {
        y_();
        m10931();
        C2745.C2746.m14563(i > 0);
        C2745.C2746.m14563(i2 > 0);
        C2745.C2746.m14562(str);
        Cursor cursor = null;
        try {
            cursor = m12047().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", String.valueOf(i));
            if (!cursor.moveToFirst()) {
                List<Pair<C2477.aux, Long>> emptyList = Collections.emptyList();
                cursor.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            do {
                long j = cursor.getLong(0);
                try {
                    byte[] r6 = p_().m11117(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && r6.length + i3 > i2) {
                        break;
                    }
                    try {
                        C2477.aux.Cif ifVar = (C2477.aux.Cif) C2090.m11100(C2477.aux.m12856(), r6);
                        if (!cursor.isNull(2)) {
                            ifVar.m13023(cursor.getInt(2));
                        }
                        i3 += r6.length;
                        arrayList.add(Pair.create((C2477.aux) ((C0987) ifVar.m7011()), Long.valueOf(j)));
                    } catch (IOException e) {
                        t_().m11714().m11605("Failed to merge queued bundle. appId", C2244.m11698(str), e);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e2) {
                    t_().m11714().m11605("Failed to unzip queued bundle. appId", C2244.m11698(str), e2);
                }
            } while (i3 <= i2);
            cursor.close();
            return arrayList;
        } catch (SQLiteException e3) {
            t_().m11714().m11605("Error querying bundles. appId", C2244.m11698(str), e3);
            List<Pair<C2477.aux, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void i_() {
        int delete;
        y_();
        m10931();
        if (m12011()) {
            long r0 = s_().f10794.m13399();
            long r2 = w_().m10847();
            if (Math.abs(r2 - r0) > C2529.f11512.m10833(null).longValue()) {
                s_().f10794.m13398(r2);
                y_();
                m10931();
                if (m12011() && (delete = m12047().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(w_().m10846()), String.valueOf(C2518.m13366())})) > 0) {
                    t_().m11713().m11603("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12019(List<Long> list) {
        y_();
        m10931();
        C2745.C2746.m14555(list);
        C2745.C2746.m14561(list.size());
        if (m12011()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m11998(sb3.toString(), (String[]) null) > 0) {
                t_().A_().m11606("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase r0 = m12047();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                r0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                t_().m11714().m11603("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m12004(String str, int i, C2274.If ifR) {
        m10931();
        y_();
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(ifR);
        Integer num = null;
        if (TextUtils.isEmpty(ifR.m11848())) {
            C2199 A_ = t_().A_();
            Object r6 = C2244.m11698(str);
            Integer valueOf = Integer.valueOf(i);
            if (ifR.m11851()) {
                num = Integer.valueOf(ifR.m11846());
            }
            A_.m11604("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r6, valueOf, String.valueOf(num));
            return false;
        }
        byte[] r0 = ifR.m4781();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", ifR.m11851() ? Integer.valueOf(ifR.m11846()) : null);
        contentValues.put("event_name", ifR.m11848());
        if (r_().m13384(str, C2529.f11594)) {
            contentValues.put("session_scoped", ifR.m11853() ? Boolean.valueOf(ifR.m11855()) : null);
        }
        contentValues.put("data", r0);
        try {
            if (m12047().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            t_().m11714().m11603("Failed to insert event filter (got -1). appId", C2244.m11698(str));
            return true;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing event filter. appId", C2244.m11698(str), e);
            return false;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean m12013(String str, int i, C2274.C2278 r8) {
        m10931();
        y_();
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(r8);
        Integer num = null;
        if (TextUtils.isEmpty(r8.m11916())) {
            C2199 A_ = t_().A_();
            Object r6 = C2244.m11698(str);
            Integer valueOf = Integer.valueOf(i);
            if (r8.m11918()) {
                num = Integer.valueOf(r8.m11913());
            }
            A_.m11604("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r6, valueOf, String.valueOf(num));
            return false;
        }
        byte[] r0 = r8.m4781();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", r8.m11918() ? Integer.valueOf(r8.m11913()) : null);
        contentValues.put("property_name", r8.m11916());
        if (r_().m13384(str, C2529.f11594)) {
            contentValues.put("session_scoped", r8.m11920() ? Boolean.valueOf(r8.m11921()) : null);
        }
        contentValues.put("data", r0);
        try {
            if (m12047().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            t_().m11714().m11603("Failed to insert property filter (got -1). appId", C2244.m11698(str));
            return false;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing property filter. appId", C2244.m11698(str), e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* renamed from: ɹ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<o.C2274.If>> m12042(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m10931()
            r12.y_()
            o.C2745.C2746.m14562((java.lang.String) r13)
            o.C2745.C2746.m14562((java.lang.String) r14)
            o.ıƖ r0 = new o.ıƖ
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m12047()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0092 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0092 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0092 }
            o.Іͽ$If$If r2 = o.C2274.If.m11840()     // Catch:{ IOException -> 0x0076 }
            o.ͽɹ r1 = o.C2090.m11100(r2, (byte[]) r1)     // Catch:{ IOException -> 0x0076 }
            o.Іͽ$If$If r1 = (o.C2274.If.C2275If) r1     // Catch:{ IOException -> 0x0076 }
            o.ʋΙ r1 = r1.m7011()     // Catch:{ IOException -> 0x0076 }
            o.ȽІ r1 = (o.C0987) r1     // Catch:{ IOException -> 0x0076 }
            o.Іͽ$If r1 = (o.C2274.If) r1     // Catch:{ IOException -> 0x0076 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0092 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0092 }
            if (r3 != 0) goto L_0x0072
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0092 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0092 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0072:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0092 }
            goto L_0x0088
        L_0x0076:
            r1 = move-exception
            o.Іɛ r2 = r12.t_()     // Catch:{ SQLiteException -> 0x0092 }
            o.ϵı r2 = r2.m11714()     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = o.C2244.m11698(r13)     // Catch:{ SQLiteException -> 0x0092 }
            r2.m11605(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0088:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0092 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0092:
            r0 = move-exception
            goto L_0x0099
        L_0x0094:
            r13 = move-exception
            r14 = r9
            goto L_0x00b1
        L_0x0097:
            r0 = move-exception
            r14 = r9
        L_0x0099:
            o.Іɛ r1 = r12.t_()     // Catch:{ all -> 0x00b0 }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = o.C2244.m11698(r13)     // Catch:{ all -> 0x00b0 }
            r1.m11605(r2, r13, r0)     // Catch:{ all -> 0x00b0 }
            if (r14 == 0) goto L_0x00af
            r14.close()
        L_0x00af:
            return r9
        L_0x00b0:
            r13 = move-exception
        L_0x00b1:
            if (r14 == 0) goto L_0x00b6
            r14.close()
        L_0x00b6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12042(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<Integer, List<C2274.If>> m12043(String str) {
        C2745.C2746.m14562(str);
        C0299 r0 = new C0299();
        Cursor cursor = null;
        try {
            cursor = m12047().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<C2274.If>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    C2274.If ifR = (C2274.If) ((C0987) ((C2274.If.C2275If) C2090.m11100(C2274.If.m11840(), cursor.getBlob(1))).m7011());
                    if (ifR.m11854()) {
                        int i = cursor.getInt(0);
                        List list = (List) r0.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            r0.put(Integer.valueOf(i), list);
                        }
                        list.add(ifR);
                    }
                } catch (IOException e) {
                    t_().m11714().m11605("Failed to merge filter. appId", C2244.m11698(str), e);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return r0;
        } catch (SQLiteException e2) {
            t_().m11714().m11605("Database error querying filters. appId", C2244.m11698(str), e2);
            Map<Integer, List<C2274.If>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<o.C2274.C2278>> m12055(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m10931()
            r12.y_()
            o.C2745.C2746.m14562((java.lang.String) r13)
            o.C2745.C2746.m14562((java.lang.String) r14)
            o.ıƖ r0 = new o.ıƖ
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m12047()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0097, all -> 0x0094 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0092 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0092 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0092 }
            o.Іͽ$ǃ$If r2 = o.C2274.C2278.m11912()     // Catch:{ IOException -> 0x0076 }
            o.ͽɹ r1 = o.C2090.m11100(r2, (byte[]) r1)     // Catch:{ IOException -> 0x0076 }
            o.Іͽ$ǃ$If r1 = (o.C2274.C2278.If) r1     // Catch:{ IOException -> 0x0076 }
            o.ʋΙ r1 = r1.m7011()     // Catch:{ IOException -> 0x0076 }
            o.ȽІ r1 = (o.C0987) r1     // Catch:{ IOException -> 0x0076 }
            o.Іͽ$ǃ r1 = (o.C2274.C2278) r1     // Catch:{ IOException -> 0x0076 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0092 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0092 }
            if (r3 != 0) goto L_0x0072
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0092 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0092 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0072:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0092 }
            goto L_0x0088
        L_0x0076:
            r1 = move-exception
            o.Іɛ r2 = r12.t_()     // Catch:{ SQLiteException -> 0x0092 }
            o.ϵı r2 = r2.m11714()     // Catch:{ SQLiteException -> 0x0092 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = o.C2244.m11698(r13)     // Catch:{ SQLiteException -> 0x0092 }
            r2.m11605(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0092 }
        L_0x0088:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0092 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0092:
            r0 = move-exception
            goto L_0x0099
        L_0x0094:
            r13 = move-exception
            r14 = r9
            goto L_0x00b1
        L_0x0097:
            r0 = move-exception
            r14 = r9
        L_0x0099:
            o.Іɛ r1 = r12.t_()     // Catch:{ all -> 0x00b0 }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = o.C2244.m11698(r13)     // Catch:{ all -> 0x00b0 }
            r1.m11605(r2, r13, r0)     // Catch:{ all -> 0x00b0 }
            if (r14 == 0) goto L_0x00af
            r14.close()
        L_0x00af:
            return r9
        L_0x00b0:
            r13 = move-exception
        L_0x00b1:
            if (r14 == 0) goto L_0x00b6
            r14.close()
        L_0x00b6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12055(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m12049(java.lang.String r13, java.util.List<java.lang.String> r14) {
        /*
            r12 = this;
            r12.m10931()
            r12.y_()
            o.C2745.C2746.m14562((java.lang.String) r13)
            o.C2745.C2746.m14555(r14)
            o.ıƖ r0 = new o.ıƖ
            r0.<init>()
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L_0x0024:
            int r4 = r14.size()
            if (r3 >= r4) goto L_0x0039
            if (r3 <= 0) goto L_0x0031
            java.lang.String r4 = ","
            r1.append(r4)
        L_0x0031:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0039:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r14)
            r3.add(r2, r13)
            android.database.sqlite.SQLiteDatabase r4 = r12.m12047()
            r14 = 0
            java.lang.String r5 = "property_filters"
            java.lang.String r6 = "audience_id"
            java.lang.String r7 = "filter_id"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            java.lang.String r7 = r1.toString()     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00aa, all -> 0x00a7 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00a5 }
            if (r3 != 0) goto L_0x0073
            r1.close()
            return r0
        L_0x0073:
            int r3 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x00a5 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x00a5 }
            if (r4 != 0) goto L_0x008f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00a5 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a5 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a5 }
        L_0x008f:
            r3 = 1
            int r3 = r1.getInt(r3)     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a5 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x00a5 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00a5 }
            if (r3 != 0) goto L_0x0073
            r1.close()
            return r0
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a7:
            r13 = move-exception
            r1 = r14
            goto L_0x00c4
        L_0x00aa:
            r0 = move-exception
            r1 = r14
        L_0x00ac:
            o.Іɛ r2 = r12.t_()     // Catch:{ all -> 0x00c3 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r13 = o.C2244.m11698(r13)     // Catch:{ all -> 0x00c3 }
            r2.m11605(r3, r13, r0)     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x00c2
            r1.close()
        L_0x00c2:
            return r14
        L_0x00c3:
            r13 = move-exception
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r1.close()
        L_0x00c9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12049(java.lang.String, java.util.List):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: Ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m12025(java.lang.String r8) {
        /*
            r7 = this;
            r7.m10931()
            r7.y_()
            o.C2745.C2746.m14562((java.lang.String) r8)
            o.ıƖ r0 = new o.ıƖ
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.m12047()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0066, all -> 0x0063 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0066, all -> 0x0063 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0066, all -> 0x0063 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0066, all -> 0x0063 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0061 }
            if (r3 != 0) goto L_0x0030
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0061 }
            r1.close()
            return r8
        L_0x0030:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0061 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0061 }
            if (r4 != 0) goto L_0x004c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0061 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0061 }
        L_0x004c:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0061 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0061 }
            if (r3 != 0) goto L_0x0030
            r1.close()
            return r0
        L_0x0061:
            r0 = move-exception
            goto L_0x0068
        L_0x0063:
            r8 = move-exception
            r1 = r2
            goto L_0x0080
        L_0x0066:
            r0 = move-exception
            r1 = r2
        L_0x0068:
            o.Іɛ r3 = r7.t_()     // Catch:{ all -> 0x007f }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = o.C2244.m11698(r8)     // Catch:{ all -> 0x007f }
            r3.m11605(r4, r8, r0)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x007e
            r1.close()
        L_0x007e:
            return r2
        L_0x007f:
            r8 = move-exception
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12025(java.lang.String):java.util.Map");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean m12000(String str, List<Integer> list) {
        C2745.C2746.m14562(str);
        m10931();
        y_();
        SQLiteDatabase r0 = m12047();
        try {
            long r4 = m11998("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, r_().m13387(str, C2529.f11590)));
            if (r4 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return r0.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Database error querying filters. appId", C2244.m11698(str), e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: і  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, o.C2477.IF> m12056(java.lang.String r12) {
        /*
            r11 = this;
            r11.m10931()
            r11.y_()
            o.C2745.C2746.m14562((java.lang.String) r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.m12047()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r1 != 0) goto L_0x0031
            r0.close()
            return r8
        L_0x0031:
            o.ıƖ r1 = new o.ıƖ     // Catch:{ SQLiteException -> 0x0078 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0078 }
        L_0x0036:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0078 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0078 }
            o.хɪ$IF$if r4 = o.C2477.IF.m12746()     // Catch:{ IOException -> 0x0058 }
            o.ͽɹ r3 = o.C2090.m11100(r4, (byte[]) r3)     // Catch:{ IOException -> 0x0058 }
            o.хɪ$IF$if r3 = (o.C2477.IF.Cif) r3     // Catch:{ IOException -> 0x0058 }
            o.ʋΙ r3 = r3.m7011()     // Catch:{ IOException -> 0x0058 }
            o.ȽІ r3 = (o.C0987) r3     // Catch:{ IOException -> 0x0058 }
            o.хɪ$IF r3 = (o.C2477.IF) r3     // Catch:{ IOException -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
            goto L_0x006e
        L_0x0058:
            r3 = move-exception
            o.Іɛ r4 = r11.t_()     // Catch:{ SQLiteException -> 0x0078 }
            o.ϵı r4 = r4.m11714()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = o.C2244.m11698(r12)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r4.m11604(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x006e:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r2 != 0) goto L_0x0036
            r0.close()
            return r1
        L_0x0078:
            r1 = move-exception
            goto L_0x007f
        L_0x007a:
            r12 = move-exception
            r0 = r8
            goto L_0x0097
        L_0x007d:
            r1 = move-exception
            r0 = r8
        L_0x007f:
            o.Іɛ r2 = r11.t_()     // Catch:{ all -> 0x0096 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = o.C2244.m11698(r12)     // Catch:{ all -> 0x0096 }
            r2.m11605(r3, r12, r1)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0095
            r0.close()
        L_0x0095:
            return r8
        L_0x0096:
            r12 = move-exception
        L_0x0097:
            if (r0 == 0) goto L_0x009c
            r0.close()
        L_0x009c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12056(java.lang.String):java.util.Map");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m12008(ContentValues contentValues, String str, Object obj) {
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object m12003(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            t_().m11714().m11606("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                t_().m11714().m11603("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            t_().m11714().m11606("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    public final long j_() {
        return m11999("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long m12024(String str, String str2) {
        long j;
        String str3 = str;
        String str4 = str2;
        C2745.C2746.m14562(str);
        C2745.C2746.m14562(str2);
        y_();
        m10931();
        SQLiteDatabase r3 = m12047();
        r3.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                j = m11999(sb.toString(), new String[]{str3}, -1);
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (r3.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        t_().m11714().m11605("Failed to insert column (got -1). appId", C2244.m11698(str), str4);
                        r3.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                j = 0;
                try {
                    t_().m11714().m11604("Error inserting column. appId", C2244.m11698(str), str4, e);
                    r3.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    r3.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + j));
                if (((long) r3.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    t_().m11714().m11605("Failed to update column (got 0). appId", C2244.m11698(str), str4);
                    r3.endTransaction();
                    return -1;
                }
                r3.setTransactionSuccessful();
                r3.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                t_().m11714().m11604("Error inserting column. appId", C2244.m11698(str), str4, e);
                r3.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            j = 0;
            t_().m11714().m11604("Error inserting column. appId", C2244.m11698(str), str4, e);
            r3.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            r3.endTransaction();
            throw th;
        }
    }

    public final long k_() {
        return m11999("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m12034(C2477.aux aux) {
        y_();
        m10931();
        C2745.C2746.m14555(aux);
        C2745.C2746.m14562(aux.m12911());
        byte[] r0 = aux.m4781();
        long r1 = p_().m11110(r0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aux.m12911());
        contentValues.put("metadata_fingerprint", Long.valueOf(r1));
        contentValues.put("metadata", r0);
        try {
            m12047().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return r1;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing raw event metadata. appId", C2244.m11698(aux.m12911()), e);
            throw e;
        }
    }

    public final boolean l_() {
        return m11998("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean m_() {
        return m11998("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long m12041(String str) {
        C2745.C2746.m14562(str);
        return m11999("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m12016(long r5) {
        /*
            r4 = this;
            r4.y_()
            r4.m10931()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.m12047()     // Catch:{ SQLiteException -> 0x003f, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003f, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003f, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003f, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003f, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            o.Іɛ r6 = r4.t_()     // Catch:{ SQLiteException -> 0x003a }
            o.ϵı r6 = r6.m11713()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.m11606(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0041
        L_0x003c:
            r6 = move-exception
            r5 = r0
            goto L_0x0055
        L_0x003f:
            r6 = move-exception
            r5 = r0
        L_0x0041:
            o.Іɛ r1 = r4.t_()     // Catch:{ all -> 0x0054 }
            o.ϵı r1 = r1.m11714()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.m11603(r2, r6)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r0
        L_0x0054:
            r6 = move-exception
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12016(long):java.lang.String");
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final long m12033() {
        Cursor cursor = null;
        try {
            cursor = m12047().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        } catch (SQLiteException e) {
            t_().m11714().m11603("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<o.C2477.C2481, java.lang.Long> m12035(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.y_()
            r7.m10931()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m12047()     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r2 != 0) goto L_0x0035
            o.Іɛ r8 = r7.t_()     // Catch:{ SQLiteException -> 0x0071 }
            o.ϵı r8 = r8.m11713()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r9 = "Main event not found"
            r8.m11606(r9)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0071 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0071 }
            o.хɪ$ı$ı r4 = o.C2477.C2481.m13050()     // Catch:{ IOException -> 0x005b }
            o.ͽɹ r2 = o.C2090.m11100(r4, (byte[]) r2)     // Catch:{ IOException -> 0x005b }
            o.хɪ$ı$ı r2 = (o.C2477.C2481.C2482) r2     // Catch:{ IOException -> 0x005b }
            o.ʋΙ r2 = r2.m7011()     // Catch:{ IOException -> 0x005b }
            o.ȽІ r2 = (o.C0987) r2     // Catch:{ IOException -> 0x005b }
            o.хɪ$ı r2 = (o.C2477.C2481) r2     // Catch:{ IOException -> 0x005b }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r8
        L_0x005b:
            r2 = move-exception
            o.Іɛ r3 = r7.t_()     // Catch:{ SQLiteException -> 0x0071 }
            o.ϵı r3 = r3.m11714()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = o.C2244.m11698(r8)     // Catch:{ SQLiteException -> 0x0071 }
            r3.m11604(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0071:
            r8 = move-exception
            goto L_0x0078
        L_0x0073:
            r8 = move-exception
            r1 = r0
            goto L_0x008c
        L_0x0076:
            r8 = move-exception
            r1 = r0
        L_0x0078:
            o.Іɛ r9 = r7.t_()     // Catch:{ all -> 0x008b }
            o.ϵı r9 = r9.m11714()     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "Error selecting main event"
            r9.m11603(r2, r8)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x008a
            r1.close()
        L_0x008a:
            return r0
        L_0x008b:
            r8 = move-exception
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            r1.close()
        L_0x0091:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2309.m12035(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12032(String str, Long l, long j, C2477.C2481 r9) {
        y_();
        m10931();
        C2745.C2746.m14555(r9);
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(l);
        byte[] r92 = r9.m4781();
        t_().m11713().m11605("Saving complex main event, appId, data size", v_().m11216(str), Integer.valueOf(r92.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", r92);
        try {
            if (m12047().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            t_().m11714().m11603("Failed to insert complex main event (got -1). appId", C2244.m11698(str));
            return false;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing complex main event. appId", C2244.m11698(str), e);
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12022(C2381 r6, long j, boolean z) {
        y_();
        m10931();
        C2745.C2746.m14555(r6);
        C2745.C2746.m14562(r6.f10915);
        C2477.C2481.C2482 r0 = C2477.C2481.m13050().m13084(r6.f10914);
        Iterator<String> it = r6.f10913.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C2477.C2483.C2484 r3 = C2477.C2483.m13106().m13132(next);
            p_().m11120(r3, r6.f10913.m12532(next));
            r0.m13078(r3);
        }
        byte[] r02 = ((C2477.C2481) ((C0987) r0.m7011())).m4781();
        if (!C1140.m7582() || !r_().m13384(r6.f10915, C2529.f11567)) {
            t_().m11713().m11605("Saving event, name, data size", v_().m11216(r6.f10912), Integer.valueOf(r02.length));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r6.f10915);
        contentValues.put("name", r6.f10912);
        contentValues.put("timestamp", Long.valueOf(r6.f10910));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", r02);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m12047().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            t_().m11714().m11603("Failed to insert raw event (got -1). appId", C2244.m11698(r6.f10915));
            return false;
        } catch (SQLiteException e) {
            t_().m11714().m11605("Error storing raw event. appId", C2244.m11698(r6.f10915), e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12031(String str, List<C2274.Cif> list) {
        boolean z;
        boolean z2;
        String str2 = str;
        List<C2274.Cif> list2 = list;
        C2745.C2746.m14555(list);
        for (int i = 0; i < list.size(); i++) {
            C2274.Cif.C2276 r9 = (C2274.Cif.C2276) list2.get(i).m6992();
            if (r9.m11892() != 0) {
                C2274.Cif.C2276 r11 = r9;
                for (int i2 = 0; i2 < r11.m11892(); i2++) {
                    C2274.If.C2275If ifR = (C2274.If.C2275If) r11.m11893(i2).m6992();
                    C2274.If.C2275If ifR2 = (C2274.If.C2275If) ((C0987.C0989) ifR.clone());
                    String r14 = C2983.m15307(ifR.m11856());
                    if (r14 != null) {
                        ifR2.m11860(r14);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z3 = z2;
                    for (int i3 = 0; i3 < ifR.m11859(); i3++) {
                        C2274.C2277 r7 = ifR.m11857(i3);
                        String r10 = C3209.m16159(r7.m11906());
                        if (r10 != null) {
                            ifR2.m11858(i3, (C2274.C2277) ((C0987) ((C2274.C2277.Cif) r7.m6992()).m11908(r10).m7011()));
                            z3 = true;
                        }
                    }
                    if (z3) {
                        r11 = r11.m11889(i2, ifR2);
                        list2.set(i, (C2274.Cif) ((C0987) r11.m7011()));
                    }
                }
                r9 = r11;
            }
            if (r9.m11890() != 0) {
                for (int i4 = 0; i4 < r9.m11890(); i4++) {
                    C2274.C2278 r102 = r9.m11894(i4);
                    String r112 = C3181.m16054(r102.m11916());
                    if (r112 != null) {
                        r9 = r9.m11891(i4, ((C2274.C2278.If) r102.m6992()).m11922(r112));
                        list2.set(i, (C2274.Cif) ((C0987) r9.m7011()));
                    }
                }
            }
        }
        m10931();
        y_();
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(list);
        SQLiteDatabase r72 = m12047();
        r72.beginTransaction();
        try {
            m10931();
            y_();
            C2745.C2746.m14562(str);
            SQLiteDatabase r8 = m12047();
            r8.delete("property_filters", "app_id=?", new String[]{str2});
            r8.delete("event_filters", "app_id=?", new String[]{str2});
            for (C2274.Cif next : list) {
                m10931();
                y_();
                C2745.C2746.m14562(str);
                C2745.C2746.m14555(next);
                if (!next.m11886()) {
                    t_().A_().m11603("Audience with no ID. appId", C2244.m11698(str));
                } else {
                    int r92 = next.m11887();
                    Iterator<C2274.If> it = next.m11880().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().m11851()) {
                                t_().A_().m11605("Event filter with no ID. Audience definition ignored. appId, audienceId", C2244.m11698(str), Integer.valueOf(r92));
                                break;
                            }
                        } else {
                            Iterator<C2274.C2278> it2 = next.m11884().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().m11918()) {
                                        t_().A_().m11605("Property filter with no ID. Audience definition ignored. appId, audienceId", C2244.m11698(str), Integer.valueOf(r92));
                                        break;
                                    }
                                } else {
                                    Iterator<C2274.If> it3 = next.m11880().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m12004(str2, r92, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<C2274.C2278> it4 = next.m11884().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!m12013(str2, r92, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        m10931();
                                        y_();
                                        C2745.C2746.m14562(str);
                                        SQLiteDatabase r82 = m12047();
                                        r82.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(r92)});
                                        r82.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(r92)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C2274.Cif next2 : list) {
                arrayList.add(next2.m11886() ? Integer.valueOf(next2.m11887()) : null);
            }
            m12000(str2, (List<Integer>) arrayList);
            r72.setTransactionSuccessful();
        } finally {
            r72.endTransaction();
        }
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    private final boolean m12011() {
        return m15904().getDatabasePath("google_app_measurement.db").exists();
    }
}
