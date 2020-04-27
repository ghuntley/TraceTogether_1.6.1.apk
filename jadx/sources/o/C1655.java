package o;

import android.content.Context;
import android.database.sqlite.SQLiteException;

/* renamed from: o.ʗ  reason: contains not printable characters */
public interface C1655 {

    /* renamed from: o.ʗ$ı  reason: contains not printable characters */
    public interface C1656 {
        /* renamed from: ɩ  reason: contains not printable characters */
        C1655 m9515(C1657 r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    C1558 m9512();

    /* renamed from: Ι  reason: contains not printable characters */
    void m9513(boolean z);

    /* renamed from: ι  reason: contains not printable characters */
    String m9514();

    /* renamed from: o.ʗ$ɩ  reason: contains not printable characters */
    public static abstract class C1659 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int f8661;

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m9518(C1558 r1);

        /* renamed from: Ι  reason: contains not printable characters */
        public void m9519(C1558 r1) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public abstract void m9520(C1558 r1, int i, int i2);

        public C1659(int i) {
            this.f8661 = i;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m9517(C1558 r3, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m9516(java.lang.String r2) {
            /*
                java.lang.String r0 = ":memory:"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 != 0) goto L_0x002a
                java.lang.String r0 = r2.trim()
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0013
                goto L_0x002a
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x002a }
                r1 = 16
                if (r0 < r1) goto L_0x0022
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x002a }
                r0.<init>(r2)     // Catch:{ Exception -> 0x002a }
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch:{ Exception -> 0x002a }
                return
            L_0x0022:
                java.io.File r0 = new java.io.File     // Catch:{  }
                r0.<init>(r2)     // Catch:{  }
                r0.delete()     // Catch:{  }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1655.C1659.m9516(java.lang.String):void");
        }
    }

    /* renamed from: o.ʗ$ǃ  reason: contains not printable characters */
    public static class C1657 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Context f8655;

        /* renamed from: Ι  reason: contains not printable characters */
        public final String f8656;

        /* renamed from: ι  reason: contains not printable characters */
        public final C1659 f8657;

        public C1657(Context context, String str, C1659 r3) {
            this.f8655 = context;
            this.f8656 = str;
            this.f8657 = r3;
        }

        /* renamed from: o.ʗ$ǃ$ı  reason: contains not printable characters */
        public static class C1658 {

            /* renamed from: ı  reason: contains not printable characters */
            public C1659 f8658;

            /* renamed from: ɩ  reason: contains not printable characters */
            public String f8659;

            /* renamed from: Ι  reason: contains not printable characters */
            public Context f8660;

            public C1658(Context context) {
                this.f8660 = context;
            }
        }
    }
}
