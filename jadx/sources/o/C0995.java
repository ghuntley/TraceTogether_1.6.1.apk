package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ȿȷ  reason: contains not printable characters */
public class C0995 implements Closeable {

    /* renamed from: ι  reason: contains not printable characters */
    private static final char[] f6047 = ")]}'\n".toCharArray();

    /* renamed from: ı  reason: contains not printable characters */
    int f6048 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f6049 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f6050 = false;

    /* renamed from: ȷ  reason: contains not printable characters */
    private String f6051;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f6052 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Reader f6053;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int[] f6054 = new int[32];

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f6055 = 0;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f6056;

    /* renamed from: Ι  reason: contains not printable characters */
    private final char[] f6057 = new char[1024];

    /* renamed from: І  reason: contains not printable characters */
    private int f6058 = 0;

    /* renamed from: г  reason: contains not printable characters */
    private int[] f6059;

    /* renamed from: і  reason: contains not printable characters */
    private int f6060 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private long f6061;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String[] f6062;

    static {
        C0458.f4075 = new C0458() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m7109(C0995 r4) {
                if (r4 instanceof C2663) {
                    C2663 r42 = (C2663) r4;
                    r42.m14134(C0313.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) r42.f12252[r42.f12251 - 1]).next();
                    r42.m14128(entry.getValue());
                    r42.m14128(new C2159((String) entry.getKey()));
                    return;
                }
                int i = r4.f6048;
                if (i == 0) {
                    i = r4.m7094();
                }
                if (i == 13) {
                    r4.f6048 = 9;
                } else if (i == 12) {
                    r4.f6048 = 8;
                } else if (i == 14) {
                    r4.f6048 = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(r4.m7095());
                    sb.append(r4.m7093());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    public C0995(Reader reader) {
        int[] iArr = this.f6054;
        int i = this.f6052;
        this.f6052 = i + 1;
        iArr[i] = 6;
        this.f6062 = new String[32];
        this.f6059 = new int[32];
        if (reader != null) {
            this.f6053 = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7099() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 3) {
            m7084(1);
            this.f6059[this.f6052 - 1] = 0;
            this.f6048 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(m7095());
        sb.append(m7093());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7104() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 4) {
            this.f6052--;
            int[] iArr = this.f6059;
            int i2 = this.f6052 - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6048 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(m7095());
        sb.append(m7093());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7096() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 1) {
            m7084(3);
            this.f6048 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(m7095());
        sb.append(m7093());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7103() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 2) {
            this.f6052--;
            String[] strArr = this.f6062;
            int i2 = this.f6052;
            strArr[i2] = null;
            int[] iArr = this.f6059;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6048 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(m7095());
        sb.append(m7093());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7092() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public C0313 m7095() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        switch (i) {
            case 1:
                return C0313.BEGIN_OBJECT;
            case 2:
                return C0313.END_OBJECT;
            case 3:
                return C0313.BEGIN_ARRAY;
            case 4:
                return C0313.END_ARRAY;
            case 5:
            case 6:
                return C0313.BOOLEAN;
            case 7:
                return C0313.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C0313.STRING;
            case 12:
            case 13:
            case 14:
                return C0313.NAME;
            case 15:
            case 16:
                return C0313.NUMBER;
            case 17:
                return C0313.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ł  reason: contains not printable characters */
    public final int m7094() {
        int r2;
        int[] iArr = this.f6054;
        int i = this.f6052;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int r1 = m7085(true);
            if (r1 != 44) {
                if (r1 != 59) {
                    if (r1 == 93) {
                        this.f6048 = 4;
                        return 4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unterminated array");
                    sb.append(m7093());
                    throw new C3217(sb.toString());
                } else if (!this.f6050) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb2.append(m7093());
                    throw new C3217(sb2.toString());
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f6054[this.f6052 - 1] = 4;
            if (i2 == 5 && (r2 = m7085(true)) != 44) {
                if (r2 != 59) {
                    if (r2 == 125) {
                        this.f6048 = 2;
                        return 2;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unterminated object");
                    sb3.append(m7093());
                    throw new C3217(sb3.toString());
                } else if (!this.f6050) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb4.append(m7093());
                    throw new C3217(sb4.toString());
                }
            }
            int r22 = m7085(true);
            if (r22 == 34) {
                this.f6048 = 13;
                return 13;
            } else if (r22 != 39) {
                if (r22 != 125) {
                    if (this.f6050) {
                        this.f6058--;
                        if (m7088((char) r22)) {
                            this.f6048 = 14;
                            return 14;
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Expected name");
                        sb5.append(m7093());
                        throw new C3217(sb5.toString());
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb6.append(m7093());
                    throw new C3217(sb6.toString());
                } else if (i2 != 5) {
                    this.f6048 = 2;
                    return 2;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("Expected name");
                    sb7.append(m7093());
                    throw new C3217(sb7.toString());
                }
            } else if (this.f6050) {
                this.f6048 = 12;
                return 12;
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                sb8.append(m7093());
                throw new C3217(sb8.toString());
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int r12 = m7085(true);
            if (r12 != 58) {
                if (r12 != 61) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Expected ':'");
                    sb9.append(m7093());
                    throw new C3217(sb9.toString());
                } else if (!this.f6050) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb10.append(m7093());
                    throw new C3217(sb10.toString());
                } else if (this.f6058 < this.f6049 || m7089(1)) {
                    char[] cArr = this.f6057;
                    int i3 = this.f6058;
                    if (cArr[i3] == '>') {
                        this.f6058 = i3 + 1;
                    }
                }
            }
        } else if (i2 == 6) {
            if (this.f6050) {
                m7080();
            }
            this.f6054[this.f6052 - 1] = 7;
        } else if (i2 == 7) {
            if (m7085(false) == -1) {
                this.f6048 = 17;
                return 17;
            } else if (this.f6050) {
                this.f6058--;
            } else {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                sb11.append(m7093());
                throw new C3217(sb11.toString());
            }
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int r13 = m7085(true);
        if (r13 == 34) {
            this.f6048 = 9;
            return 9;
        } else if (r13 != 39) {
            if (!(r13 == 44 || r13 == 59)) {
                if (r13 == 91) {
                    this.f6048 = 3;
                    return 3;
                } else if (r13 != 93) {
                    if (r13 != 123) {
                        this.f6058--;
                        int r14 = m7091();
                        if (r14 != 0) {
                            return r14;
                        }
                        int r15 = m7086();
                        if (r15 != 0) {
                            return r15;
                        }
                        if (!m7088(this.f6057[this.f6058])) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("Expected value");
                            sb12.append(m7093());
                            throw new C3217(sb12.toString());
                        } else if (this.f6050) {
                            this.f6048 = 10;
                            return 10;
                        } else {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                            sb13.append(m7093());
                            throw new C3217(sb13.toString());
                        }
                    } else {
                        this.f6048 = 1;
                        return 1;
                    }
                } else if (i2 == 1) {
                    this.f6048 = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append("Unexpected value");
                sb14.append(m7093());
                throw new C3217(sb14.toString());
            } else if (this.f6050) {
                this.f6058--;
                this.f6048 = 7;
                return 7;
            } else {
                StringBuilder sb15 = new StringBuilder();
                sb15.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                sb15.append(m7093());
                throw new C3217(sb15.toString());
            }
        } else if (this.f6050) {
            this.f6048 = 8;
            return 8;
        } else {
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Use JsonReader.setLenient(true) to accept malformed JSON");
            sb16.append(m7093());
            throw new C3217(sb16.toString());
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    private int m7091() {
        String str;
        String str2;
        int i;
        char c = this.f6057[this.f6058];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f6058 + i2 >= this.f6049 && !m7089(i2 + 1)) {
                return 0;
            }
            char c2 = this.f6057[this.f6058 + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f6058 + length < this.f6049 || m7089(length + 1)) && m7088(this.f6057[this.f6058 + length])) {
            return 0;
        }
        this.f6058 += length;
        this.f6048 = i;
        return i;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    private int m7086() {
        char c;
        char[] cArr = this.f6057;
        int i = this.f6058;
        int i2 = 0;
        int i3 = this.f6049;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i3) {
                if (i4 != cArr.length) {
                    if (!m7089(i4 + 1)) {
                        break;
                    }
                    i = this.f6058;
                    i3 = this.f6049;
                } else {
                    return i2;
                }
            }
            c = cArr[i + i4];
            if (c == '+') {
                i2 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i2 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i2 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i2 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i2 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            boolean z3 = i5 > 0 || (i5 == 0 && j2 < j);
                            j = j2;
                            z = z3 & z;
                        } else if (c2 == 3) {
                            i2 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i2 = 0;
                            c2 = 7;
                        }
                        i2 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m7088(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f6061 = j;
            this.f6058 += i4;
            this.f6048 = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f6056 = i4;
            this.f6048 = 16;
            return 16;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public String m7107() {
        String str;
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 14) {
            str = m7087();
        } else if (i == 12) {
            str = m7079('\'');
        } else if (i == 13) {
            str = m7079('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(m7095());
            sb.append(m7093());
            throw new IllegalStateException(sb.toString());
        }
        this.f6048 = 0;
        this.f6062[this.f6052 - 1] = str;
        return str;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public String m7101() {
        String str;
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 10) {
            str = m7087();
        } else if (i == 8) {
            str = m7079('\'');
        } else if (i == 9) {
            str = m7079('\"');
        } else if (i == 11) {
            str = this.f6051;
            this.f6051 = null;
        } else if (i == 15) {
            str = Long.toString(this.f6061);
        } else if (i == 16) {
            str = new String(this.f6057, this.f6058, this.f6056);
            this.f6058 += this.f6056;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(m7095());
            sb.append(m7093());
            throw new IllegalStateException(sb.toString());
        }
        this.f6048 = 0;
        int[] iArr = this.f6059;
        int i2 = this.f6052 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: і  reason: contains not printable characters */
    public boolean m7106() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 5) {
            this.f6048 = 0;
            int[] iArr = this.f6059;
            int i2 = this.f6052 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6048 = 0;
            int[] iArr2 = this.f6059;
            int i3 = this.f6052 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(m7095());
            sb.append(m7093());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m7105() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 7) {
            this.f6048 = 0;
            int[] iArr = this.f6059;
            int i2 = this.f6052 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(m7095());
        sb.append(m7093());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public double m7098() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 15) {
            this.f6048 = 0;
            int[] iArr = this.f6059;
            int i2 = this.f6052 - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6061;
        }
        if (i == 16) {
            this.f6051 = new String(this.f6057, this.f6058, this.f6056);
            this.f6058 += this.f6056;
        } else if (i == 8 || i == 9) {
            this.f6051 = m7079(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f6051 = m7087();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(m7095());
            sb.append(m7093());
            throw new IllegalStateException(sb.toString());
        }
        this.f6048 = 11;
        double parseDouble = Double.parseDouble(this.f6051);
        if (this.f6050 || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f6051 = null;
            this.f6048 = 0;
            int[] iArr2 = this.f6059;
            int i3 = this.f6052 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(m7093());
        throw new C3217(sb2.toString());
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public long m7100() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 15) {
            this.f6048 = 0;
            int[] iArr = this.f6059;
            int i2 = this.f6052 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f6061;
        }
        if (i == 16) {
            this.f6051 = new String(this.f6057, this.f6058, this.f6056);
            this.f6058 += this.f6056;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f6051 = m7087();
            } else {
                this.f6051 = m7079(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f6051);
                this.f6048 = 0;
                int[] iArr2 = this.f6059;
                int i3 = this.f6052 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(m7095());
            sb.append(m7093());
            throw new IllegalStateException(sb.toString());
        }
        this.f6048 = 11;
        double parseDouble = Double.parseDouble(this.f6051);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f6051 = null;
            this.f6048 = 0;
            int[] iArr3 = this.f6059;
            int i4 = this.f6052 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder("Expected a long but was ");
        sb2.append(this.f6051);
        sb2.append(m7093());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private String m7079(char c) {
        char[] cArr = this.f6057;
        StringBuilder sb = null;
        while (true) {
            int i = this.f6058;
            int i2 = this.f6049;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f6058 = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f6058 = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) << 1, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(m7082());
                    } else {
                        if (c2 == 10) {
                            this.f6060++;
                            this.f6055 = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.f6058 = i3;
                    if (!m7089(1)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unterminated string");
                        sb2.append(m7093());
                        throw new C3217(sb2.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r6.f6050 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Use JsonReader.setLenient(true) to accept malformed JSON");
        r1.append(m7093());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        throw new o.C3217(r1.toString());
     */
    /* renamed from: ʟ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m7087() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f6058
            int r4 = r3 + r1
            int r5 = r6.f6049
            if (r4 >= r5) goto L_0x006b
            char[] r4 = r6.f6057
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x0079
            r4 = 10
            if (r3 == r4) goto L_0x0079
            r4 = 12
            if (r3 == r4) goto L_0x0079
            r4 = 13
            if (r3 == r4) goto L_0x0079
            r4 = 32
            if (r3 == r4) goto L_0x0079
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x0079
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x0079
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x0079
            r4 = 58
            if (r3 == r4) goto L_0x0079
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x0079;
                case 92: goto L_0x004b;
                case 93: goto L_0x0079;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            boolean r0 = r6.f6050
            if (r0 == 0) goto L_0x0050
            goto L_0x0079
        L_0x0050:
            o.ււ r0 = new o.ււ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r1.append(r2)
            java.lang.String r2 = r6.m7093()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006b:
            char[] r3 = r6.f6057
            int r3 = r3.length
            if (r1 >= r3) goto L_0x007b
            int r3 = r1 + 1
            boolean r3 = r6.m7089((int) r3)
            if (r3 == 0) goto L_0x0079
            goto L_0x0004
        L_0x0079:
            r0 = r1
            goto L_0x009b
        L_0x007b:
            if (r2 != 0) goto L_0x0088
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x0088:
            char[] r3 = r6.f6057
            int r4 = r6.f6058
            r2.append(r3, r4, r1)
            int r3 = r6.f6058
            int r3 = r3 + r1
            r6.f6058 = r3
            r1 = 1
            boolean r1 = r6.m7089((int) r1)
            if (r1 != 0) goto L_0x0003
        L_0x009b:
            if (r2 != 0) goto L_0x00a7
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f6057
            int r3 = r6.f6058
            r1.<init>(r2, r3, r0)
            goto L_0x00b2
        L_0x00a7:
            char[] r1 = r6.f6057
            int r3 = r6.f6058
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x00b2:
            int r2 = r6.f6058
            int r2 = r2 + r0
            r6.f6058 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0995.m7087():java.lang.String");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7083(char c) {
        char[] cArr = this.f6057;
        while (true) {
            int i = this.f6058;
            int i2 = this.f6049;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f6058 = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f6058 = i3;
                        m7082();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f6060++;
                            this.f6055 = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f6058 = i;
                    if (!m7089(1)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unterminated string");
                        sb.append(m7093());
                        throw new C3217(sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public int m7102() {
        int i = this.f6048;
        if (i == 0) {
            i = m7094();
        }
        if (i == 15) {
            long j = this.f6061;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6048 = 0;
                int[] iArr = this.f6059;
                int i3 = this.f6052 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.f6061);
            sb.append(m7093());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f6051 = new String(this.f6057, this.f6058, this.f6056);
            this.f6058 += this.f6056;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f6051 = m7087();
            } else {
                this.f6051 = m7079(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f6051);
                this.f6048 = 0;
                int[] iArr2 = this.f6059;
                int i4 = this.f6052 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(m7095());
            sb2.append(m7093());
            throw new IllegalStateException(sb2.toString());
        }
        this.f6048 = 11;
        double parseDouble = Double.parseDouble(this.f6051);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f6051 = null;
            this.f6048 = 0;
            int[] iArr3 = this.f6059;
            int i6 = this.f6052 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder("Expected an int but was ");
        sb3.append(this.f6051);
        sb3.append(m7093());
        throw new NumberFormatException(sb3.toString());
    }

    public void close() {
        this.f6048 = 0;
        this.f6054[0] = 8;
        this.f6052 = 1;
        this.f6053.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a8, code lost:
        if (r11.f6050 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ab, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Use JsonReader.setLenient(true) to accept malformed JSON");
        r1.append(m7093());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c5, code lost:
        throw new o.C3217(r1.toString());
     */
    /* renamed from: ȷ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7097() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r11.f6048
            if (r2 != 0) goto L_0x000a
            int r2 = r11.m7094()
        L_0x000a:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            r11.m7084((int) r4)
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x0015:
            if (r2 != r4) goto L_0x001b
            r11.m7084((int) r3)
            goto L_0x0011
        L_0x001b:
            r3 = 4
            if (r2 != r3) goto L_0x0027
            int r2 = r11.f6052
            int r2 = r2 - r4
            r11.f6052 = r2
        L_0x0023:
            int r1 = r1 + -1
            goto L_0x00d5
        L_0x0027:
            r3 = 2
            if (r2 != r3) goto L_0x0030
            int r2 = r11.f6052
            int r2 = r2 - r4
            r11.f6052 = r2
            goto L_0x0023
        L_0x0030:
            r3 = 14
            r5 = 13
            r6 = 9
            r7 = 12
            r8 = 10
            if (r2 == r3) goto L_0x0066
            if (r2 != r8) goto L_0x003f
            goto L_0x0066
        L_0x003f:
            r3 = 8
            if (r2 == r3) goto L_0x005f
            if (r2 != r7) goto L_0x0046
            goto L_0x005f
        L_0x0046:
            if (r2 == r6) goto L_0x0058
            if (r2 != r5) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            r3 = 16
            if (r2 != r3) goto L_0x00d5
            int r2 = r11.f6058
            int r3 = r11.f6056
            int r2 = r2 + r3
            r11.f6058 = r2
            goto L_0x00d5
        L_0x0058:
            r2 = 34
            r11.m7083((char) r2)
            goto L_0x00d5
        L_0x005f:
            r2 = 39
            r11.m7083((char) r2)
            goto L_0x00d5
        L_0x0066:
            r2 = 0
        L_0x0067:
            int r3 = r11.f6058
            int r9 = r3 + r2
            int r10 = r11.f6049
            if (r9 >= r10) goto L_0x00cc
            char[] r9 = r11.f6057
            int r3 = r3 + r2
            char r3 = r9[r3]
            if (r3 == r6) goto L_0x00c6
            if (r3 == r8) goto L_0x00c6
            if (r3 == r7) goto L_0x00c6
            if (r3 == r5) goto L_0x00c6
            r9 = 32
            if (r3 == r9) goto L_0x00c6
            r9 = 35
            if (r3 == r9) goto L_0x00a6
            r9 = 44
            if (r3 == r9) goto L_0x00c6
            r9 = 47
            if (r3 == r9) goto L_0x00a6
            r9 = 61
            if (r3 == r9) goto L_0x00a6
            r9 = 123(0x7b, float:1.72E-43)
            if (r3 == r9) goto L_0x00c6
            r9 = 125(0x7d, float:1.75E-43)
            if (r3 == r9) goto L_0x00c6
            r9 = 58
            if (r3 == r9) goto L_0x00c6
            r9 = 59
            if (r3 == r9) goto L_0x00a6
            switch(r3) {
                case 91: goto L_0x00c6;
                case 92: goto L_0x00a6;
                case 93: goto L_0x00c6;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            int r2 = r2 + 1
            goto L_0x0067
        L_0x00a6:
            boolean r3 = r11.f6050
            if (r3 == 0) goto L_0x00ab
            goto L_0x00c6
        L_0x00ab:
            o.ււ r0 = new o.ււ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r1.append(r2)
            java.lang.String r2 = r11.m7093()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            int r3 = r11.f6058
            int r3 = r3 + r2
            r11.f6058 = r3
            goto L_0x00d5
        L_0x00cc:
            int r3 = r3 + r2
            r11.f6058 = r3
            boolean r2 = r11.m7089((int) r4)
            if (r2 != 0) goto L_0x0066
        L_0x00d5:
            r11.f6048 = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r11.f6059
            int r1 = r11.f6052
            int r2 = r1 + -1
            r3 = r0[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            java.lang.String[] r0 = r11.f6062
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0995.m7097():void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7084(int i) {
        int i2 = this.f6052;
        int[] iArr = this.f6054;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            int[] iArr3 = new int[(i2 << 1)];
            String[] strArr = new String[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f6059, 0, iArr3, 0, this.f6052);
            System.arraycopy(this.f6062, 0, strArr, 0, this.f6052);
            this.f6054 = iArr2;
            this.f6059 = iArr3;
            this.f6062 = strArr;
        }
        int[] iArr4 = this.f6054;
        int i3 = this.f6052;
        this.f6052 = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m7089(int i) {
        int i2;
        char[] cArr = this.f6057;
        int i3 = this.f6055;
        int i4 = this.f6058;
        this.f6055 = i3 - i4;
        int i5 = this.f6049;
        if (i5 != i4) {
            this.f6049 = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.f6049);
        } else {
            this.f6049 = 0;
        }
        this.f6058 = 0;
        do {
            Reader reader = this.f6053;
            int i6 = this.f6049;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            this.f6049 += read;
            if (this.f6060 == 0 && (i2 = this.f6055) == 0 && this.f6049 > 0 && cArr[0] == 65279) {
                this.f6058++;
                this.f6055 = i2 + 1;
                i++;
            }
        } while (this.f6049 < i);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m7085(boolean z) {
        char[] cArr = this.f6057;
        int i = this.f6058;
        int i2 = this.f6049;
        while (true) {
            if (i == i2) {
                this.f6058 = i;
                if (m7089(1)) {
                    i = this.f6058;
                    i2 = this.f6049;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(m7093());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f6060++;
                this.f6055 = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f6058 = i3;
                    if (i3 == i2) {
                        this.f6058--;
                        boolean r2 = m7089(2);
                        this.f6058++;
                        if (!r2) {
                            return c;
                        }
                    }
                    if (this.f6050) {
                        int i4 = this.f6058;
                        char c2 = cArr[i4];
                        if (c2 == '*') {
                            this.f6058 = i4 + 1;
                            if (m7090("*/")) {
                                i = this.f6058 + 2;
                                i2 = this.f6049;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unterminated comment");
                                sb2.append(m7093());
                                throw new C3217(sb2.toString());
                            }
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.f6058 = i4 + 1;
                            m7081();
                            i = this.f6058;
                            i2 = this.f6049;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb3.append(m7093());
                        throw new C3217(sb3.toString());
                    }
                } else if (c == '#') {
                    this.f6058 = i3;
                    if (this.f6050) {
                        m7081();
                        i = this.f6058;
                        i2 = this.f6049;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb4.append(m7093());
                        throw new C3217(sb4.toString());
                    }
                } else {
                    this.f6058 = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    private void m7081() {
        char c;
        do {
            if (this.f6058 < this.f6049 || m7089(1)) {
                char[] cArr = this.f6057;
                int i = this.f6058;
                this.f6058 = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f6060++;
                    this.f6055 = this.f6058;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m7090(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f6058 + length > this.f6049 && !m7089(length)) {
                return false;
            }
            char[] cArr = this.f6057;
            int i2 = this.f6058;
            if (cArr[i2] == 10) {
                this.f6060++;
                this.f6055 = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f6057[this.f6058 + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f6058++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(m7093());
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ŀ  reason: contains not printable characters */
    public final String m7093() {
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(this.f6060 + 1);
        sb.append(" column ");
        sb.append((this.f6058 - this.f6055) + 1);
        sb.append(" path ");
        sb.append(m7108());
        return sb.toString();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public String m7108() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f6052;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f6054[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f6059[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f6062;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    private char m7082() {
        int i;
        int i2;
        if (this.f6058 != this.f6049 || m7089(1)) {
            char[] cArr = this.f6057;
            int i3 = this.f6058;
            this.f6058 = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f6060++;
                this.f6055 = this.f6058;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid escape sequence");
                    sb.append(m7093());
                    throw new C3217(sb.toString());
                } else if (this.f6058 + 4 <= this.f6049 || m7089(4)) {
                    char c2 = 0;
                    int i4 = this.f6058;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f6057[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb2 = new StringBuilder("\\u");
                                sb2.append(new String(this.f6057, this.f6058, 4));
                                throw new NumberFormatException(sb2.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f6058 += 4;
                    return c2;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unterminated escape sequence");
                    sb3.append(m7093());
                    throw new C3217(sb3.toString());
                }
            }
            return c;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unterminated escape sequence");
        sb4.append(m7093());
        throw new C3217(sb4.toString());
    }

    /* renamed from: ſ  reason: contains not printable characters */
    private void m7080() {
        m7085(true);
        this.f6058--;
        int i = this.f6058;
        char[] cArr = f6047;
        if (i + cArr.length <= this.f6049 || m7089(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f6047;
                if (i2 >= cArr2.length) {
                    this.f6058 += cArr2.length;
                    return;
                } else if (this.f6057[this.f6058 + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m7088(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.f6050) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Use JsonReader.setLenient(true) to accept malformed JSON");
        sb.append(m7093());
        throw new C3217(sb.toString());
    }
}
