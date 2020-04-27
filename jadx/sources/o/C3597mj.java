package o;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

/* renamed from: o.mj  reason: case insensitive filesystem */
public final class C3597mj implements C3592me {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1474 f3263;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1474 f3264;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1242 f3265;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C1221<StreetPassRecord> f3266;

    public C3597mj(C1242 r2) {
        this.f3265 = r2;
        this.f3266 = new C1221<StreetPassRecord>(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3898() {
                return "INSERT OR IGNORE INTO `record_table` (`id`,`timestamp`,`v`,`msg`,`org`,`modelP`,`modelC`,`rssi`,`txPower`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final /* synthetic */ void m3897(C1647 r5, Object obj) {
                StreetPassRecord streetPassRecord = (StreetPassRecord) obj;
                r5.m9242(1, (long) streetPassRecord.getId());
                r5.m9242(2, streetPassRecord.getTimestamp());
                r5.m9242(3, (long) streetPassRecord.getV());
                if (streetPassRecord.getMsg() == null) {
                    r5.m9243(4);
                } else {
                    r5.m9245(4, streetPassRecord.getMsg());
                }
                if (streetPassRecord.getOrg() == null) {
                    r5.m9243(5);
                } else {
                    r5.m9245(5, streetPassRecord.getOrg());
                }
                if (streetPassRecord.getModelP() == null) {
                    r5.m9243(6);
                } else {
                    r5.m9245(6, streetPassRecord.getModelP());
                }
                if (streetPassRecord.getModelC() == null) {
                    r5.m9243(7);
                } else {
                    r5.m9245(7, streetPassRecord.getModelC());
                }
                r5.m9242(8, (long) streetPassRecord.getRssi());
                if (streetPassRecord.getTxPower() == null) {
                    r5.m9243(9);
                } else {
                    r5.m9242(9, (long) streetPassRecord.getTxPower().intValue());
                }
            }
        };
        this.f3263 = new C1474(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3894() {
                return "DELETE FROM record_table";
            }
        };
        this.f3264 = new C1474(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3892() {
                return "DELETE FROM record_table WHERE timestamp < ?";
            }
        };
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m3887(final StreetPassRecord streetPassRecord, C3390er<? super dF> erVar) {
        return C1148.m7603(this.f3265, true, new Callable<dF>() {
            /* access modifiers changed from: private */
            /* renamed from: ǃ  reason: contains not printable characters */
            public dF call() {
                C3597mj.this.f3265.m8037();
                try {
                    C3597mj.this.f3266.m7898(streetPassRecord);
                    C3597mj.this.f3265.m8033();
                    return dF.f2032;
                } finally {
                    C3597mj.this.f3265.m8034();
                }
            }
        }, erVar);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3888() {
        this.f3265.m8038();
        C1647 r0 = this.f3263.m8840();
        this.f3265.m8037();
        try {
            r0.m9482();
            this.f3265.m8033();
        } finally {
            this.f3265.m8034();
            C1474 r3 = this.f3263;
            if (r0 == r3.f7911) {
                r3.f7910.set(false);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m3890(final long j, C3390er<? super dF> erVar) {
        return C1148.m7603(this.f3265, true, new Callable<dF>() {
            /* access modifiers changed from: private */
            /* renamed from: Ι  reason: contains not printable characters */
            public dF call() {
                C1647 r0 = C3597mj.this.f3264.m8840();
                r0.m9242(1, j);
                C3597mj.this.f3265.m8037();
                try {
                    r0.m9482();
                    C3597mj.this.f3265.m8033();
                    return dF.f2032;
                } finally {
                    C3597mj.this.f3265.m8034();
                    C1474 r3 = C3597mj.this.f3264;
                    if (r0 == r3.f7911) {
                        r3.f7910.set(false);
                    }
                }
            }
        }, erVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final LiveData<List<StreetPassRecord>> m3889() {
        final C1241 r0 = C1241.m8011("SELECT * from record_table ORDER BY timestamp ASC", 0);
        return this.f3265.m8029().m7910(new String[]{"record_table"}, new Callable<List<StreetPassRecord>>() {
            /* access modifiers changed from: private */
            /* renamed from: ɩ  reason: contains not printable characters */
            public List<StreetPassRecord> call() {
                Integer num;
                Cursor r2 = C3597mj.this.f3265.m8026(r0, (CancellationSignal) null);
                try {
                    int r0 = C2745.m14500(r2, "id");
                    int r4 = C2745.m14500(r2, "timestamp");
                    int r5 = C2745.m14500(r2, "v");
                    int r6 = C2745.m14500(r2, "msg");
                    int r7 = C2745.m14500(r2, "org");
                    int r8 = C2745.m14500(r2, "modelP");
                    int r9 = C2745.m14500(r2, "modelC");
                    int r10 = C2745.m14500(r2, "rssi");
                    int r11 = C2745.m14500(r2, "txPower");
                    ArrayList arrayList = new ArrayList(r2.getCount());
                    while (r2.moveToNext()) {
                        int i = r2.getInt(r5);
                        String string = r2.getString(r6);
                        String string2 = r2.getString(r7);
                        String string3 = r2.getString(r8);
                        String string4 = r2.getString(r9);
                        int i2 = r2.getInt(r10);
                        if (r2.isNull(r11)) {
                            num = null;
                        } else {
                            num = Integer.valueOf(r2.getInt(r11));
                        }
                        StreetPassRecord streetPassRecord = new StreetPassRecord(i, string, string2, string3, string4, i2, num);
                        streetPassRecord.setId(r2.getInt(r0));
                        streetPassRecord.setTimestamp(r2.getLong(r4));
                        arrayList.add(streetPassRecord);
                    }
                    return arrayList;
                } finally {
                    r2.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                r0.m8014();
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final LiveData<StreetPassRecord> m3891() {
        final C1241 r0 = C1241.m8011("SELECT * from record_table ORDER BY timestamp DESC LIMIT 1", 0);
        return this.f3265.m8029().m7910(new String[]{"record_table"}, new Callable<StreetPassRecord>() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Integer} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
            /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Integer] */
            /* access modifiers changed from: private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: ı  reason: contains not printable characters */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord call() {
                /*
                    r21 = this;
                    r1 = r21
                    o.mj r0 = o.C3597mj.this
                    o.ɩƚ r0 = r0.f3265
                    o.ɩƗ r2 = r0
                    r3 = 0
                    android.database.Cursor r2 = r0.m8026(r2, r3)
                    java.lang.String r0 = "id"
                    int r0 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r0)     // Catch:{ all -> 0x008d }
                    java.lang.String r4 = "timestamp"
                    int r4 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r4)     // Catch:{ all -> 0x008d }
                    java.lang.String r5 = "v"
                    int r5 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r5)     // Catch:{ all -> 0x008d }
                    java.lang.String r6 = "msg"
                    int r6 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r6)     // Catch:{ all -> 0x008d }
                    java.lang.String r7 = "org"
                    int r7 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r7)     // Catch:{ all -> 0x008d }
                    java.lang.String r8 = "modelP"
                    int r8 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r8)     // Catch:{ all -> 0x008d }
                    java.lang.String r9 = "modelC"
                    int r9 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r9)     // Catch:{ all -> 0x008d }
                    java.lang.String r10 = "rssi"
                    int r10 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r10)     // Catch:{ all -> 0x008d }
                    java.lang.String r11 = "txPower"
                    int r11 = o.C2745.m14500((android.database.Cursor) r2, (java.lang.String) r11)     // Catch:{ all -> 0x008d }
                    boolean r12 = r2.moveToFirst()     // Catch:{ all -> 0x008d }
                    if (r12 == 0) goto L_0x0089
                    int r14 = r2.getInt(r5)     // Catch:{ all -> 0x008d }
                    java.lang.String r15 = r2.getString(r6)     // Catch:{ all -> 0x008d }
                    java.lang.String r16 = r2.getString(r7)     // Catch:{ all -> 0x008d }
                    java.lang.String r17 = r2.getString(r8)     // Catch:{ all -> 0x008d }
                    java.lang.String r18 = r2.getString(r9)     // Catch:{ all -> 0x008d }
                    int r19 = r2.getInt(r10)     // Catch:{ all -> 0x008d }
                    boolean r5 = r2.isNull(r11)     // Catch:{ all -> 0x008d }
                    if (r5 == 0) goto L_0x006c
                L_0x0069:
                    r20 = r3
                    goto L_0x0075
                L_0x006c:
                    int r3 = r2.getInt(r11)     // Catch:{ all -> 0x008d }
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008d }
                    goto L_0x0069
                L_0x0075:
                    sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r3 = new sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord     // Catch:{ all -> 0x008d }
                    r13 = r3
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x008d }
                    int r0 = r2.getInt(r0)     // Catch:{ all -> 0x008d }
                    r3.setId(r0)     // Catch:{ all -> 0x008d }
                    long r4 = r2.getLong(r4)     // Catch:{ all -> 0x008d }
                    r3.setTimestamp(r4)     // Catch:{ all -> 0x008d }
                L_0x0089:
                    r2.close()
                    return r3
                L_0x008d:
                    r0 = move-exception
                    r2.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C3597mj.AnonymousClass7.call():sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord");
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                r0.m8014();
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<StreetPassRecord> m3886() {
        Integer num;
        C1241 r2 = C1241.m8011("SELECT * from record_table ORDER BY timestamp ASC", 0);
        this.f3265.m8038();
        Cursor r4 = this.f3265.m8026(r2, (CancellationSignal) null);
        try {
            int r0 = C2745.m14500(r4, "id");
            int r5 = C2745.m14500(r4, "timestamp");
            int r6 = C2745.m14500(r4, "v");
            int r7 = C2745.m14500(r4, "msg");
            int r8 = C2745.m14500(r4, "org");
            int r9 = C2745.m14500(r4, "modelP");
            int r10 = C2745.m14500(r4, "modelC");
            int r11 = C2745.m14500(r4, "rssi");
            int r12 = C2745.m14500(r4, "txPower");
            ArrayList arrayList = new ArrayList(r4.getCount());
            while (r4.moveToNext()) {
                int i = r4.getInt(r6);
                String string = r4.getString(r7);
                String string2 = r4.getString(r8);
                String string3 = r4.getString(r9);
                String string4 = r4.getString(r10);
                int i2 = r4.getInt(r11);
                if (r4.isNull(r12)) {
                    num = null;
                } else {
                    num = Integer.valueOf(r4.getInt(r12));
                }
                StreetPassRecord streetPassRecord = new StreetPassRecord(i, string, string2, string3, string4, i2, num);
                streetPassRecord.setId(r4.getInt(r0));
                int i3 = r0;
                streetPassRecord.setTimestamp(r4.getLong(r5));
                arrayList.add(streetPassRecord);
                r0 = i3;
            }
            return arrayList;
        } finally {
            r4.close();
            r2.m8014();
        }
    }
}
