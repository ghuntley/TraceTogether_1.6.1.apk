package sg.gov.tech.bluetrace.streetpass.persistence;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o.C1116;
import o.C1225;
import o.C1376;
import o.C1488;
import o.C1558;
import o.C1655;
import o.C3592me;
import o.C3597mj;
import o.lW;
import o.lX;

public final class StreetPassRecordDatabase_Impl extends StreetPassRecordDatabase {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private volatile lX f14731;

    /* renamed from: ɩ  reason: contains not printable characters */
    private volatile C3592me f14732;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1655 m16320(C1116 r5) {
        C1376 r0 = new C1376(r5, new C1376.C1377() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m16326(C1558 r2) {
                r2.m9178("CREATE TABLE IF NOT EXISTS `record_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `v` INTEGER NOT NULL, `msg` TEXT NOT NULL, `org` TEXT NOT NULL, `modelP` TEXT NOT NULL, `modelC` TEXT NOT NULL, `rssi` INTEGER NOT NULL, `txPower` INTEGER)");
                r2.m9178("CREATE TABLE IF NOT EXISTS `status_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                r2.m9178("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                r2.m9178("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a95fc8ad88c160bf76c0ba4747db316')");
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m16327(C1558 r3) {
                r3.m9178("DROP TABLE IF EXISTS `record_table`");
                r3.m9178("DROP TABLE IF EXISTS `status_table`");
                if (StreetPassRecordDatabase_Impl.this.f7038 != null) {
                    int size = StreetPassRecordDatabase_Impl.this.f7038.size();
                    for (int i = 0; i < size; i++) {
                        StreetPassRecordDatabase_Impl.this.f7038.get(i);
                    }
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m16325() {
                if (StreetPassRecordDatabase_Impl.this.f7038 != null) {
                    int size = StreetPassRecordDatabase_Impl.this.f7038.size();
                    for (int i = 0; i < size; i++) {
                        StreetPassRecordDatabase_Impl.this.f7038.get(i);
                    }
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m16329(C1558 r3) {
                C1558 unused = StreetPassRecordDatabase_Impl.this.f7034 = r3;
                StreetPassRecordDatabase_Impl.this.m8028(r3);
                if (StreetPassRecordDatabase_Impl.this.f7038 != null) {
                    int size = StreetPassRecordDatabase_Impl.this.f7038.size();
                    for (int i = 0; i < size; i++) {
                        StreetPassRecordDatabase_Impl.this.f7038.get(i);
                    }
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C1376.C1378 m16328(C1558 r23) {
                C1558 r0 = r23;
                HashMap hashMap = new HashMap(9);
                hashMap.put("id", new C1488.If("id", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("timestamp", new C1488.If("timestamp", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("v", new C1488.If("v", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("msg", new C1488.If("msg", "TEXT", true, 0, (String) null, 1));
                hashMap.put("org", new C1488.If("org", "TEXT", true, 0, (String) null, 1));
                hashMap.put("modelP", new C1488.If("modelP", "TEXT", true, 0, (String) null, 1));
                hashMap.put("modelC", new C1488.If("modelC", "TEXT", true, 0, (String) null, 1));
                hashMap.put("rssi", new C1488.If("rssi", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("txPower", new C1488.If("txPower", "INTEGER", false, 0, (String) null, 1));
                C1488 r8 = new C1488("record_table", hashMap, new HashSet(0), new HashSet(0));
                C1488 r10 = new C1488("record_table", C1488.m8881(r0, "record_table"), C1488.m8880(r0, "record_table"), C1488.m8882(r0, "record_table"));
                if (!r8.equals(r10)) {
                    StringBuilder sb = new StringBuilder("record_table(sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord).\n Expected:\n");
                    sb.append(r8);
                    sb.append("\n Found:\n");
                    sb.append(r10);
                    return new C1376.C1378(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("id", new C1488.If("id", "INTEGER", true, 1, (String) null, 1));
                hashMap2.put("timestamp", new C1488.If("timestamp", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("msg", new C1488.If("msg", "TEXT", true, 0, (String) null, 1));
                C1488 r5 = new C1488("status_table", hashMap2, new HashSet(0), new HashSet(0));
                C1488 r4 = new C1488("status_table", C1488.m8881(r0, "status_table"), C1488.m8880(r0, "status_table"), C1488.m8882(r0, "status_table"));
                if (r5.equals(r4)) {
                    return new C1376.C1378(true, (String) null);
                }
                StringBuilder sb2 = new StringBuilder("status_table(sg.gov.tech.bluetrace.status.persistence.StatusRecord).\n Expected:\n");
                sb2.append(r5);
                sb2.append("\n Found:\n");
                sb2.append(r4);
                return new C1376.C1378(false, sb2.toString());
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: ı  reason: contains not printable characters */
            public final void m16324(C1558 r4) {
                ArrayList<String> arrayList = new ArrayList<>();
                Cursor r1 = r4.m9171("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (r1.moveToNext()) {
                    try {
                        arrayList.add(r1.getString(0));
                    } catch (Throwable th) {
                        r1.close();
                        throw th;
                    }
                }
                r1.close();
                for (String str : arrayList) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        r4.m9178("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }
        }, "9a95fc8ad88c160bf76c0ba4747db316", "336ef522c4c1738f91b0cd0ef01687c8");
        C1655.C1657.C1658 r2 = new C1655.C1657.C1658(r5.f6613);
        r2.f8659 = r5.f6604;
        r2.f8658 = r0;
        if (r2.f8658 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (r2.f8660 != null) {
            return r5.f6614.m9515(new C1655.C1657(r2.f8660, r2.f8659, r2.f8658));
        } else {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1225 m16322() {
        return new C1225(this, new HashMap(0), new HashMap(0), "record_table", "status_table");
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final C3592me m16321() {
        C3592me meVar;
        if (this.f14732 != null) {
            return this.f14732;
        }
        synchronized (this) {
            if (this.f14732 == null) {
                this.f14732 = new C3597mj(this);
            }
            meVar = this.f14732;
        }
        return meVar;
    }

    /* renamed from: г  reason: contains not printable characters */
    public final lX m16323() {
        lX lXVar;
        if (this.f14731 != null) {
            return this.f14731;
        }
        synchronized (this) {
            if (this.f14731 == null) {
                this.f14731 = new lW(this);
            }
            lXVar = this.f14731;
        }
        return lXVar;
    }
}
