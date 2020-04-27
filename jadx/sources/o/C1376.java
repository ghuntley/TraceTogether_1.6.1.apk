package o;

import android.database.Cursor;
import o.C1655;

/* renamed from: o.ɪΙ  reason: contains not printable characters */
public final class C1376 extends C1655.C1659 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1377 f7568;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7569;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f7570;

    /* renamed from: ι  reason: contains not printable characters */
    private C1116 f7571;

    public C1376(C1116 r2, C1377 r3, String str, String str2) {
        super(r3.f7572);
        this.f7571 = r2;
        this.f7568 = r3;
        this.f7569 = str;
        this.f7570 = str2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8511(C1558 r4) {
        boolean r0 = m8509(r4);
        this.f7568.m8516(r4);
        if (!r0) {
            C1378 r02 = this.f7568.m8518(r4);
            if (!r02.f7573) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(r02.f7574);
                throw new IllegalStateException(sb.toString());
            }
        }
        r4.m9178("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f7569;
        StringBuilder sb2 = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb2.append(str);
        sb2.append("')");
        r4.m9178(sb2.toString());
        this.f7568.m8515();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af A[RETURN] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8513(o.C1558 r6, int r7, int r8) {
        /*
            r5 = this;
            o.ɕ r0 = r5.f7571
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0076
            o.ɩƚ$if r0 = r0.f6606
            if (r7 != r8) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x001d
        L_0x000f:
            if (r8 <= r7) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r0.m8041(r4, r3, r7, r8)
        L_0x001d:
            if (r0 == 0) goto L_0x0076
            o.ɪΙ$ı r2 = r5.f7568
            r2.m8514(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r0.next()
            o.ɾΙ r2 = (o.C1549) r2
            r2.m9059(r6)
            goto L_0x0028
        L_0x0038:
            o.ɪΙ$ı r0 = r5.f7568
            o.ɪΙ$ǃ r0 = r0.m8518(r6)
            boolean r2 = r0.f7573
            if (r2 == 0) goto L_0x0060
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.m9178(r0)
            java.lang.String r0 = r5.f7569
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "')"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.m9178(r0)
            goto L_0x0077
        L_0x0060:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Migration didn't properly handle: "
            r7.<init>(r8)
            java.lang.String r8 = r0.f7574
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 != 0) goto L_0x00af
            o.ɕ r0 = r5.f7571
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.m7528(r7, r8)
            if (r0 != 0) goto L_0x008e
            o.ɪΙ$ı r7 = r5.f7568
            r7.m8517(r6)
            o.ɪΙ$ı r7 = r5.f7568
            r7.m8516(r6)
            return
        L_0x008e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " to "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1376.m8513(o.ɾӀ, int, int):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8510(C1558 r1, int i, int i2) {
        m9520(r1, i, i2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8512(C1558 r5) {
        super.m9519(r5);
        if (m8508(r5)) {
            Cursor r0 = r5.m9181(new C3335coN("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = r0.moveToFirst() ? r0.getString(0) : null;
                r0.close();
                if (!this.f7569.equals(string) && !this.f7570.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                r0.close();
                throw th;
            }
        } else {
            C1378 r02 = this.f7568.m8518(r5);
            if (r02.f7573) {
                r5.m9178("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                String str = this.f7569;
                StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
                sb.append(str);
                sb.append("')");
                r5.m9178(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb2.append(r02.f7574);
                throw new IllegalStateException(sb2.toString());
            }
        }
        this.f7568.m8519(r5);
        this.f7571 = null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m8508(C1558 r2) {
        Cursor r22 = r2.m9171("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (r22.moveToFirst() && r22.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            r22.close();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m8509(C1558 r2) {
        Cursor r22 = r2.m9171("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (r22.moveToFirst() && r22.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            r22.close();
        }
    }

    /* renamed from: o.ɪΙ$ǃ  reason: contains not printable characters */
    public static class C1378 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean f7573;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f7574;

        public C1378(boolean z, String str) {
            this.f7573 = z;
            this.f7574 = str;
        }
    }

    /* renamed from: o.ɪΙ$ı  reason: contains not printable characters */
    public static abstract class C1377 {

        /* renamed from: Ι  reason: contains not printable characters */
        public final int f7572 = 2;

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public void m8514(C1558 r1) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m8515();

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m8516(C1558 r1);

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m8517(C1558 r1);

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract void m8519(C1558 r1);

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public C1378 m8518(C1558 r2) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }
}
