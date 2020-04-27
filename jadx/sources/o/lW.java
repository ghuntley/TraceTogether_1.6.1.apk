package o;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;

public final class lW implements lX {
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1221<StatusRecord> f2864;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1474 f2865;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1242 f2866;

    public lW(C1242 r2) {
        this.f2866 = r2;
        this.f2864 = new C1221<StatusRecord>(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3541() {
                return "INSERT OR IGNORE INTO `status_table` (`id`,`timestamp`,`msg`) VALUES (nullif(?, 0),?,?)";
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final /* synthetic */ void m3540(C1647 r4, Object obj) {
                StatusRecord statusRecord = (StatusRecord) obj;
                r4.m9242(1, (long) statusRecord.getId());
                r4.m9242(2, statusRecord.getTimestamp());
                if (statusRecord.getMsg() == null) {
                    r4.m9243(3);
                } else {
                    r4.m9245(3, statusRecord.getMsg());
                }
            }
        };
        new C1474(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3538() {
                return "DELETE FROM status_table";
            }
        };
        this.f2865 = new C1474(r2) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m3537() {
                return "DELETE FROM status_table WHERE timestamp < ?";
            }
        };
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Object m3535(final StatusRecord statusRecord, C3390er<? super dF> erVar) {
        return C1148.m7603(this.f2866, true, new Callable<dF>() {
            /* access modifiers changed from: private */
            /* renamed from: ǃ  reason: contains not printable characters */
            public dF call() {
                lW.this.f2866.m8037();
                try {
                    lW.this.f2864.m7898(statusRecord);
                    lW.this.f2866.m8033();
                    return dF.f2032;
                } finally {
                    lW.this.f2866.m8034();
                }
            }
        }, erVar);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m3534(final long j, C3390er<? super dF> erVar) {
        return C1148.m7603(this.f2866, true, new Callable<dF>() {
            /* access modifiers changed from: private */
            /* renamed from: ɩ  reason: contains not printable characters */
            public dF call() {
                C1647 r0 = lW.this.f2865.m8840();
                r0.m9242(1, j);
                lW.this.f2866.m8037();
                try {
                    r0.m9482();
                    lW.this.f2866.m8033();
                    return dF.f2032;
                } finally {
                    lW.this.f2866.m8034();
                    C1474 r3 = lW.this.f2865;
                    if (r0 == r3.f7911) {
                        r3.f7910.set(false);
                    }
                }
            }
        }, erVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<StatusRecord> m3533() {
        C1241 r0 = C1241.m8011("SELECT * from status_table ORDER BY timestamp ASC", 0);
        this.f2866.m8038();
        Cursor r1 = this.f2866.m8026(r0, (CancellationSignal) null);
        try {
            int r2 = C2745.m14500(r1, "id");
            int r3 = C2745.m14500(r1, "timestamp");
            int r4 = C2745.m14500(r1, "msg");
            ArrayList arrayList = new ArrayList(r1.getCount());
            while (r1.moveToNext()) {
                StatusRecord statusRecord = new StatusRecord(r1.getString(r4));
                statusRecord.setId(r1.getInt(r2));
                statusRecord.setTimestamp(r1.getLong(r3));
                arrayList.add(statusRecord);
            }
            return arrayList;
        } finally {
            r1.close();
            r0.m8014();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final LiveData<StatusRecord> m3532(String str) {
        final C1241 r1 = C1241.m8011("SELECT * from status_table where msg = ? ORDER BY timestamp DESC LIMIT 1", 1);
        if (str == null) {
            r1.f7028[1] = 1;
        } else {
            r1.f7028[1] = 4;
            r1.f7026[1] = str;
        }
        return this.f2866.m8029().m7910(new String[]{"status_table"}, new Callable<StatusRecord>() {
            /* access modifiers changed from: private */
            /* renamed from: ǃ  reason: contains not printable characters */
            public StatusRecord call() {
                StatusRecord statusRecord = null;
                Cursor r0 = lW.this.f2866.m8026(r1, (CancellationSignal) null);
                try {
                    int r1 = C2745.m14500(r0, "id");
                    int r3 = C2745.m14500(r0, "timestamp");
                    int r4 = C2745.m14500(r0, "msg");
                    if (r0.moveToFirst()) {
                        StatusRecord statusRecord2 = new StatusRecord(r0.getString(r4));
                        statusRecord2.setId(r0.getInt(r1));
                        statusRecord2.setTimestamp(r0.getLong(r3));
                        statusRecord = statusRecord2;
                    }
                    return statusRecord;
                } finally {
                    r0.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                r1.m8014();
            }
        });
    }
}
