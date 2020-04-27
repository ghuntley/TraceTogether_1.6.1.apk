package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import o.C1655;

/* renamed from: o.ʟі  reason: contains not printable characters */
final class C1690 implements C1655 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1691 f8765;

    C1690(Context context, String str, C1655.C1659 r5) {
        this.f8765 = new C1691(context, str, new C1575[1], r5);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m9604() {
        return this.f8765.getDatabaseName();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9603(boolean z) {
        this.f8765.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1558 m9602() {
        return this.f8765.m9606();
    }

    /* renamed from: o.ʟі$ɩ  reason: contains not printable characters */
    static class C1691 extends SQLiteOpenHelper {

        /* renamed from: ı  reason: contains not printable characters */
        final C1655.C1659 f8766;

        /* renamed from: ɩ  reason: contains not printable characters */
        final C1575[] f8767;

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f8768;

        C1691(Context context, String str, final C1575[] r9, final C1655.C1659 r10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, r10.f8661, new DatabaseErrorHandler() {
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
                    if (r0 != null) goto L_0x0038;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
                    r4 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
                    if (r4.hasNext() != false) goto L_0x0042;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
                    o.C1655.C1659.m9516((java.lang.String) r4.next().second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
                    o.C1655.C1659.m9516(r4.m9183());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
                    if ((r2.f8373 == r4) == false) goto L_0x0010;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0032 */
                /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[ExcHandler: all (r1v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
  PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:13:0x002b, B:16:0x0032, B:17:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:13:0x002b] */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                    /*
                        r3 = this;
                        o.ɿі[] r0 = r9
                        r1 = 0
                        r2 = r0[r1]
                        if (r2 == 0) goto L_0x0010
                        android.database.sqlite.SQLiteDatabase r2 = r2.f8373
                        if (r2 != r4) goto L_0x000d
                        r2 = 1
                        goto L_0x000e
                    L_0x000d:
                        r2 = 0
                    L_0x000e:
                        if (r2 != 0) goto L_0x0017
                    L_0x0010:
                        o.ɿі r2 = new o.ɿі
                        r2.<init>(r4)
                        r0[r1] = r2
                    L_0x0017:
                        r4 = r0[r1]
                        r4.m9183()
                        boolean r0 = r4.m9180()
                        if (r0 != 0) goto L_0x002a
                        java.lang.String r4 = r4.m9183()
                        o.C1655.C1659.m9516((java.lang.String) r4)
                        return
                    L_0x002a:
                        r0 = 0
                        java.util.List r0 = r4.m9173()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0030 }
                        goto L_0x0032
                    L_0x0030:
                        r1 = move-exception
                        goto L_0x0036
                    L_0x0032:
                        r4.close()     // Catch:{ IOException -> 0x0058, all -> 0x0030 }
                        goto L_0x0059
                    L_0x0036:
                        if (r0 == 0) goto L_0x0050
                        java.util.Iterator r4 = r0.iterator()
                    L_0x003c:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0057
                        java.lang.Object r0 = r4.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        o.C1655.C1659.m9516((java.lang.String) r0)
                        goto L_0x003c
                    L_0x0050:
                        java.lang.String r4 = r4.m9183()
                        o.C1655.C1659.m9516((java.lang.String) r4)
                    L_0x0057:
                        throw r1
                    L_0x0058:
                    L_0x0059:
                        if (r0 == 0) goto L_0x0074
                        java.util.Iterator r4 = r0.iterator()
                    L_0x005f:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0073
                        java.lang.Object r0 = r4.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        o.C1655.C1659.m9516((java.lang.String) r0)
                        goto L_0x005f
                    L_0x0073:
                        return
                    L_0x0074:
                        java.lang.String r4 = r4.m9183()
                        o.C1655.C1659.m9516((java.lang.String) r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.C1690.C1691.AnonymousClass2.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.f8766 = r10;
            this.f8767 = r9;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            if ((r3.f8373 == r1) == false) goto L_0x0024;
         */
        /* renamed from: ǃ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized o.C1558 m9606() {
            /*
                r4 = this;
                monitor-enter(r4)
                r0 = 0
                r4.f8768 = r0     // Catch:{ all -> 0x002f }
                android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x002f }
                boolean r2 = r4.f8768     // Catch:{ all -> 0x002f }
                if (r2 == 0) goto L_0x0015
                r4.close()     // Catch:{ all -> 0x002f }
                o.ɾӀ r0 = r4.m9606()     // Catch:{ all -> 0x002f }
                monitor-exit(r4)
                return r0
            L_0x0015:
                o.ɿі[] r2 = r4.f8767     // Catch:{ all -> 0x002f }
                r3 = r2[r0]     // Catch:{ all -> 0x002f }
                if (r3 == 0) goto L_0x0024
                android.database.sqlite.SQLiteDatabase r3 = r3.f8373     // Catch:{ all -> 0x002f }
                if (r3 != r1) goto L_0x0021
                r3 = 1
                goto L_0x0022
            L_0x0021:
                r3 = 0
            L_0x0022:
                if (r3 != 0) goto L_0x002b
            L_0x0024:
                o.ɿі r3 = new o.ɿі     // Catch:{ all -> 0x002f }
                r3.<init>(r1)     // Catch:{ all -> 0x002f }
                r2[r0] = r3     // Catch:{ all -> 0x002f }
            L_0x002b:
                r0 = r2[r0]     // Catch:{ all -> 0x002f }
                monitor-exit(r4)
                return r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1690.C1691.m9606():o.ɾӀ");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if ((r2.f8373 == r4) == false) goto L_0x0010;
         */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private o.C1575 m9605(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                o.ɿі[] r0 = r3.f8767
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L_0x0010
                android.database.sqlite.SQLiteDatabase r2 = r2.f8373
                if (r2 != r4) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                if (r2 != 0) goto L_0x0017
            L_0x0010:
                o.ɿі r2 = new o.ɿі
                r2.<init>(r4)
                r0[r1] = r2
            L_0x0017:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1690.C1691.m9605(android.database.sqlite.SQLiteDatabase):o.ɿі");
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f8766.m9518(m9605(sQLiteDatabase));
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f8768 = true;
            this.f8766.m9520(m9605(sQLiteDatabase), i, i2);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            m9605(sQLiteDatabase);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f8768 = true;
            this.f8766.m9517(m9605(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f8768) {
                this.f8766.m9519((C1558) m9605(sQLiteDatabase));
            }
        }

        public final synchronized void close() {
            super.close();
            this.f8767[0] = null;
        }
    }
}
