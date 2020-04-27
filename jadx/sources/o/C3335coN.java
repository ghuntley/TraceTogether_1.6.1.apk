package o;

import android.database.sqlite.SQLiteProgram;

/* renamed from: o.coN  reason: case insensitive filesystem */
public final class C3335coN implements C1611 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Object[] f1973;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f1974;

    /* renamed from: o.coN$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f1976 = 2;

        /* renamed from: ŀ  reason: contains not printable characters */
        public static final int[] f1977 = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

        /* renamed from: ł  reason: contains not printable characters */
        public static final int f1978 = 0;

        /* renamed from: ſ  reason: contains not printable characters */
        public static final int f1979 = 0;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int[] f1980 = {16842960, 16843161};

        /* renamed from: Ɨ  reason: contains not printable characters */
        public static final int f1981 = 5;

        /* renamed from: ƚ  reason: contains not printable characters */
        public static final int[] f1982 = {16843161};

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f1983 = 0;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f1984 = 2;

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final int f1985 = 3;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int[] f1986 = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final int f1987 = 1;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f1988 = 1;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int[] f1989 = {16843161, 16843849, 16843850, 16843851};

        /* renamed from: ɿ  reason: contains not printable characters */
        public static final int f1990 = 1;

        /* renamed from: ʅ  reason: contains not printable characters */
        public static final int f1991 = 4;

        /* renamed from: ʟ  reason: contains not printable characters */
        public static final int f1992 = 3;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f1993 = 1;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f1994 = 3;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f1995 = 4;

        /* renamed from: г  reason: contains not printable characters */
        public static final int f1996 = 2;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f1997 = 5;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f1998 = 0;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f1999 = 0;
    }

    /* renamed from: o.coN$If */
    public static final class If implements C1576 {

        /* renamed from: ı  reason: contains not printable characters */
        private final SQLiteProgram f1975;

        public If(SQLiteProgram sQLiteProgram) {
            this.f1975 = sQLiteProgram;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1977(int i) {
            this.f1975.bindNull(i);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1976(int i, long j) {
            this.f1975.bindLong(i, j);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1975(int i, double d) {
            this.f1975.bindDouble(i, d);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1979(int i, String str) {
            this.f1975.bindString(i, str);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1978(int i, byte[] bArr) {
            this.f1975.bindBlob(i, bArr);
        }

        public void close() {
            this.f1975.close();
        }

        public If() {
        }
    }

    public C3335coN(String str, byte b) {
        this.f1974 = str;
        this.f1973 = null;
    }

    public C3335coN(String str) {
        this(str, (byte) 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m1974() {
        return this.f1974;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1973(C1576 r6) {
        Object[] objArr = this.f1973;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    r6.m9243(i);
                } else if (obj instanceof byte[]) {
                    r6.m9244(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    r6.m9241(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    r6.m9241(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    r6.m9242(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    r6.m9242(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    r6.m9242(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    r6.m9242(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    r6.m9245(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    r6.m9242(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public C3335coN() {
    }
}
