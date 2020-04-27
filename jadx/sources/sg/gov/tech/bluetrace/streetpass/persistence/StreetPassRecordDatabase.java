package sg.gov.tech.bluetrace.streetpass.persistence;

import android.content.Context;
import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C1238;
import o.C1242;
import o.C1549;
import o.C1558;
import o.C3592me;
import o.fL;
import o.fM;
import o.lX;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b&\u0018\u0000 \u00012\u00020\n:\u0001\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase;", "If", "Lo/me;", "ɾ", "()Lo/me;", "Lo/lX;", "г", "()Lo/lX;", "<init>", "()V", "Lo/ɩƚ;"}, k = 1, mv = {1, 1, 16})
public abstract class StreetPassRecordDatabase extends C1242 {
    public static final If If = new If((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public static volatile StreetPassRecordDatabase f14729;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final C1549 f14730 = new C3232(1, 2);

    /* renamed from: ɾ  reason: contains not printable characters */
    public abstract C3592me m16303();

    /* renamed from: г  reason: contains not printable characters */
    public abstract lX m16304();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0016B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0019\u0010\t\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0002\u0010\b"}, d2 = {"Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase$If;", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase;", "ɩ", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase;", "Ι", "Lo/ɾΙ;", "Ӏ", "Lo/ɾΙ;", "()Lo/ɾΙ;", "ι", "Landroid/content/Context;", "p0", "(Landroid/content/Context;)Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase;", "Lo/ɾӀ;", "", "p1", "p2", "", "ı", "(Lo/ɾӀ;Ljava/lang/String;Ljava/lang/String;)Z", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    public static final class If {
        private If() {
        }

        public /* synthetic */ If(fL fLVar) {
            this();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final StreetPassRecordDatabase m16307(Context context) {
            StreetPassRecordDatabase streetPassRecordDatabase;
            fM.m2254(context, "");
            StreetPassRecordDatabase r0 = StreetPassRecordDatabase.f14729;
            if (r0 != null) {
                return r0;
            }
            synchronized (this) {
                StreetPassRecordDatabase r4 = C1238.m7991(context, StreetPassRecordDatabase.class, "record_database").m8050(StreetPassRecordDatabase.If.m16306()).m8051();
                fM.m2252((Object) r4, "");
                streetPassRecordDatabase = r4;
                StreetPassRecordDatabase.f14729 = streetPassRecordDatabase;
            }
            return streetPassRecordDatabase;
        }

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1549 m16306() {
            return StreetPassRecordDatabase.f14730;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m16305(C1558 r3, String str, String str2) {
            fM.m2254(r3, "");
            fM.m2254(str, "");
            fM.m2254(str2, "");
            Cursor r32 = r3.m9179("PRAGMA table_info(" + str + ')', (Object[]) null);
            r32.moveToFirst();
            boolean z = false;
            do {
                if (fM.m2257(r32.getString(1), str2)) {
                    z = true;
                }
            } while (r32.moveToNext());
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordDatabase$ı;", "Lo/ɾӀ;", "p0", "", "ι", "(Lo/ɾӀ;)V", "Lo/ɾΙ;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecordDatabase$ı  reason: contains not printable characters */
    public static final class C3232 extends C1549 {
        C3232(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m16308(C1558 r4) {
            fM.m2254(r4, "");
            r4.m9178("CREATE TABLE IF NOT EXISTS `status_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
            if (!StreetPassRecordDatabase.If.m16305(r4, "record_table", "v")) {
                r4.m9178("ALTER TABLE `record_table` ADD COLUMN `v` INTEGER NOT NULL DEFAULT 1");
            }
            if (!StreetPassRecordDatabase.If.m16305(r4, "record_table", "org")) {
                r4.m9178("ALTER TABLE `record_table` ADD COLUMN `org` TEXT NOT NULL DEFAULT 'SG_MOH'");
            }
        }
    }
}
