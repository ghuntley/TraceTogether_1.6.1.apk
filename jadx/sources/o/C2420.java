package o;

import java.io.EOFException;
import o.C2383;

/* renamed from: o.гӏ  reason: contains not printable characters */
final class C2420 extends C2383 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final jM f11012 = jM.m2946("'\\");

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final jM f11013 = jM.m2946("\"\\");

    /* renamed from: І  reason: contains not printable characters */
    private static final jM f11014 = jM.m2946("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final jI f11015;

    /* renamed from: ȷ  reason: contains not printable characters */
    private long f11016;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f11017;

    /* renamed from: і  reason: contains not printable characters */
    private int f11018 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final jH f11019;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String f11020;

    static {
        jM.m2946("\n\r");
        jM.m2946("*/");
    }

    C2420(jI jIVar) {
        if (jIVar != null) {
            this.f11015 = jIVar;
            this.f11019 = jIVar.m2908();
            m12382(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12497() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 3) {
            m12382(1);
            this.f10919[this.f10918 - 1] = 0;
            this.f11018 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(m12390());
        sb.append(" at path ");
        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
        throw new C2224(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12495() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 4) {
            this.f10918--;
            int[] iArr = this.f10919;
            int i2 = this.f10918 - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f11018 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(m12390());
        sb.append(" at path ");
        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
        throw new C2224(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12500() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 1) {
            m12382(3);
            this.f11018 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(m12390());
        sb.append(" at path ");
        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
        throw new C2224(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12501() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 2) {
            this.f10918--;
            this.f10917[this.f10918] = null;
            int[] iArr = this.f10919;
            int i2 = this.f10918 - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f11018 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(m12390());
        sb.append(" at path ");
        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
        throw new C2224(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12492() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C2383.C2384 m12499() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        switch (i) {
            case 1:
                return C2383.C2384.BEGIN_OBJECT;
            case 2:
                return C2383.C2384.END_OBJECT;
            case 3:
                return C2383.C2384.BEGIN_ARRAY;
            case 4:
                return C2383.C2384.END_ARRAY;
            case 5:
            case 6:
                return C2383.C2384.BOOLEAN;
            case 7:
                return C2383.C2384.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C2383.C2384.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C2383.C2384.NAME;
            case 16:
            case 17:
                return C2383.C2384.NUMBER;
            case 18:
                return C2383.C2384.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private int m12487() {
        int i = this.f10920[this.f10918 - 1];
        if (i == 1) {
            this.f10920[this.f10918 - 1] = 2;
        } else if (i == 2) {
            int r11 = m12481(true);
            this.f11019.m2868();
            if (r11 != 44) {
                if (r11 == 59) {
                    throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
                } else if (r11 == 93) {
                    this.f11018 = 4;
                    return 4;
                } else {
                    throw m12381("Unterminated array");
                }
            }
        } else if (i == 3 || i == 5) {
            this.f10920[this.f10918 - 1] = 4;
            if (i == 5) {
                int r5 = m12481(true);
                this.f11019.m2868();
                if (r5 != 44) {
                    if (r5 == 59) {
                        throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
                    } else if (r5 == 125) {
                        this.f11018 = 2;
                        return 2;
                    } else {
                        throw m12381("Unterminated object");
                    }
                }
            }
            int r2 = m12481(true);
            if (r2 == 34) {
                this.f11019.m2868();
                this.f11018 = 13;
                return 13;
            } else if (r2 == 39) {
                this.f11019.m2868();
                throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (r2 != 125) {
                throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (i != 5) {
                this.f11019.m2868();
                this.f11018 = 2;
                return 2;
            } else {
                throw m12381("Expected name");
            }
        } else if (i == 4) {
            this.f10920[this.f10918 - 1] = 5;
            int r112 = m12481(true);
            this.f11019.m2868();
            if (r112 != 58) {
                if (r112 != 61) {
                    throw m12381("Expected ':'");
                }
                throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (i == 6) {
            this.f10920[this.f10918 - 1] = 7;
        } else if (i == 7) {
            if (m12481(false) == -1) {
                this.f11018 = 18;
                return 18;
            }
            throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int r113 = m12481(true);
        if (r113 == 34) {
            this.f11019.m2868();
            this.f11018 = 9;
            return 9;
        } else if (r113 != 39) {
            if (!(r113 == 44 || r113 == 59)) {
                if (r113 == 91) {
                    this.f11019.m2868();
                    this.f11018 = 3;
                    return 3;
                } else if (r113 != 93) {
                    if (r113 != 123) {
                        int r0 = m12484();
                        if (r0 != 0) {
                            return r0;
                        }
                        int r02 = m12483();
                        if (r02 != 0) {
                            return r02;
                        }
                        if (!m12490(this.f11019.m2847(0))) {
                            throw m12381("Expected value");
                        }
                        throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                    this.f11019.m2868();
                    this.f11018 = 1;
                    return 1;
                } else if (i == 1) {
                    this.f11019.m2868();
                    this.f11018 = 4;
                    return 4;
                }
            }
            if (i == 1 || i == 2) {
                throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            throw m12381("Unexpected value");
        } else {
            throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private int m12484() {
        String str;
        String str2;
        int i;
        byte r0 = this.f11019.m2847(0);
        if (r0 == 116 || r0 == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (r0 == 102 || r0 == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (r0 != 110 && r0 != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f11015.m2920((long) i3)) {
                return 0;
            }
            byte r6 = this.f11019.m2847((long) i2);
            if (r6 != str2.charAt(i2) && r6 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f11015.m2920((long) (length + 1)) && m12490(this.f11019.m2847((long) length))) {
            return 0;
        }
        this.f11019.m2896((long) length);
        this.f11018 = i;
        return i;
    }

    /* renamed from: ł  reason: contains not printable characters */
    private int m12483() {
        byte r11;
        long j = 0;
        long j2 = 0;
        int i = 0;
        char c = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.f11015.m2920((long) i2)) {
                break;
            }
            r11 = this.f11019.m2847((long) i);
            if (r11 != 43) {
                if (r11 != 69 && r11 != 101) {
                    if (r11 != 45) {
                        if (r11 != 46) {
                            if (r11 >= 48 && r11 <= 57) {
                                if (c == 1 || c == 0) {
                                    j2 = (long) (-(r11 - 48));
                                    c = 2;
                                } else if (c == 2) {
                                    if (j2 == j) {
                                        return 0;
                                    }
                                    long j3 = (10 * j2) - ((long) (r11 - 48));
                                    int i3 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                                    z2 = (i3 > 0 || (i3 == 0 && j3 < j2)) & z2;
                                    j2 = j3;
                                } else if (c == 3) {
                                    c = 4;
                                } else if (c == 5 || c == 6) {
                                    c = 7;
                                }
                            }
                        } else if (c != 2) {
                            return 0;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z = true;
                    } else if (c != 5) {
                        return 0;
                    }
                    i = i2;
                    j = 0;
                } else if (c != 2 && c != 4) {
                    return 0;
                } else {
                    c = 5;
                    i = i2;
                    j = 0;
                }
            } else if (c != 5) {
                return 0;
            }
            c = 6;
            i = i2;
            j = 0;
        }
        if (m12490(r11)) {
            return 0;
        }
        if (c == 2 && z2 && ((j2 != Long.MIN_VALUE || z) && (j2 != 0 || !z))) {
            if (!z) {
                j2 = -j2;
            }
            this.f11016 = j2;
            this.f11019.m2896((long) i);
            this.f11018 = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f11017 = i;
            this.f11018 = 17;
            return 17;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m12504() {
        String str;
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 14) {
            str = m12482();
        } else if (i == 13) {
            str = m12486(f11013);
        } else if (i == 12) {
            str = m12486(f11012);
        } else if (i == 15) {
            str = this.f11020;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(m12390());
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
        this.f11018 = 0;
        this.f10917[this.f10918 - 1] = str;
        return str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m12494(C2383.C2385 r5) {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m12485(this.f11020, r5);
        }
        int r0 = this.f11015.m2911(r5.f10933);
        if (r0 != -1) {
            this.f11018 = 0;
            this.f10917[this.f10918 - 1] = r5.f10932[r0];
            return r0;
        }
        String str = this.f10917[this.f10918 - 1];
        String r3 = m12395();
        int r52 = m12485(r3, r5);
        if (r52 == -1) {
            this.f11018 = 15;
            this.f11020 = r3;
            this.f10917[this.f10918 - 1] = str;
        }
        return r52;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m12502() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 14) {
            m12491();
        } else if (i == 13) {
            m12489(f11013);
        } else if (i == 12) {
            m12489(f11012);
        } else if (i != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(m12390());
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
        this.f11018 = 0;
        this.f10917[this.f10918 - 1] = "null";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m12485(String str, C2383.C2385 r6) {
        int length = r6.f10932.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(r6.f10932[i])) {
                this.f11018 = 0;
                this.f10917[this.f10918 - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final String m12493() {
        String str;
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 10) {
            str = m12482();
        } else if (i == 9) {
            str = m12486(f11013);
        } else if (i == 8) {
            str = m12486(f11012);
        } else if (i == 11) {
            str = this.f11020;
            this.f11020 = null;
        } else if (i == 16) {
            str = Long.toString(this.f11016);
        } else if (i == 17) {
            str = this.f11019.m2884((long) this.f11017, jX.f2464);
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(m12390());
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
        this.f11018 = 0;
        int[] iArr = this.f10919;
        int i2 = this.f10918 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m12503() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 5) {
            this.f11018 = 0;
            int[] iArr = this.f10919;
            int i2 = this.f10918 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f11018 = 0;
            int[] iArr2 = this.f10919;
            int i3 = this.f10918 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(m12390());
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final double m12496() {
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 16) {
            this.f11018 = 0;
            int[] iArr = this.f10919;
            int i2 = this.f10918 - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f11016;
        }
        if (i == 17) {
            this.f11020 = this.f11019.m2884((long) this.f11017, jX.f2464);
        } else if (i == 9) {
            this.f11020 = m12486(f11013);
        } else if (i == 8) {
            this.f11020 = m12486(f11012);
        } else if (i == 10) {
            this.f11020 = m12482();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(m12390());
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
        this.f11018 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f11020);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                throw new C2354(sb2.toString());
            }
            this.f11020 = null;
            this.f11018 = 0;
            int[] iArr2 = this.f10919;
            int i3 = this.f10918 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.f11020);
            sb3.append(" at path ");
            sb3.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb3.toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private String m12486(jM jMVar) {
        StringBuilder sb = null;
        while (true) {
            long r1 = this.f11015.m2902(jMVar);
            if (r1 == -1) {
                throw m12381("Unterminated string");
            } else if (this.f11019.m2847(r1) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f11019.m2884(r1, jX.f2464));
                this.f11019.m2868();
                sb.append(m12488());
            } else if (sb == null) {
                String r7 = this.f11019.m2884(r1, jX.f2464);
                this.f11019.m2868();
                return r7;
            } else {
                sb.append(this.f11019.m2884(r1, jX.f2464));
                this.f11019.m2868();
                return sb.toString();
            }
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private String m12482() {
        long r0 = this.f11015.m2902(f11014);
        return r0 != -1 ? this.f11019.m2884(r0, jX.f2464) : this.f11019.m2873();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m12489(jM jMVar) {
        while (true) {
            long r0 = this.f11015.m2902(jMVar);
            if (r0 == -1) {
                throw m12381("Unterminated string");
            } else if (this.f11019.m2847(r0) == 92) {
                this.f11019.m2896(r0 + 1);
                m12488();
            } else {
                this.f11019.m2896(r0 + 1);
                return;
            }
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m12491() {
        long r0 = this.f11015.m2902(f11014);
        jH jHVar = this.f11019;
        if (r0 == -1) {
            r0 = jHVar.f2411;
        }
        jHVar.m2896(r0);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final int m12498() {
        String str;
        int i = this.f11018;
        if (i == 0) {
            i = m12487();
        }
        if (i == 16) {
            long j = this.f11016;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f11018 = 0;
                int[] iArr = this.f10919;
                int i3 = this.f10918 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.f11016);
            sb.append(" at path ");
            sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb.toString());
        }
        if (i == 17) {
            this.f11020 = this.f11019.m2884((long) this.f11017, jX.f2464);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m12486(f11013);
            } else {
                str = m12486(f11012);
            }
            this.f11020 = str;
            try {
                int parseInt = Integer.parseInt(this.f11020);
                this.f11018 = 0;
                int[] iArr2 = this.f10919;
                int i4 = this.f10918 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(m12390());
            sb2.append(" at path ");
            sb2.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb2.toString());
        }
        this.f11018 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f11020);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f11020 = null;
                this.f11018 = 0;
                int[] iArr3 = this.f10919;
                int i6 = this.f10918 - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(this.f11020);
            sb3.append(" at path ");
            sb3.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.f11020);
            sb4.append(" at path ");
            sb4.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
            throw new C2224(sb4.toString());
        }
    }

    public final void close() {
        this.f11018 = 0;
        this.f10920[0] = 8;
        this.f10918 = 1;
        jH jHVar = this.f11019;
        try {
            jHVar.m2896(jHVar.f2411);
            this.f11015.close();
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m12505() {
        int i = 0;
        do {
            int i2 = this.f11018;
            if (i2 == 0) {
                i2 = m12487();
            }
            if (i2 == 3) {
                m12382(1);
            } else if (i2 == 1) {
                m12382(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f10918--;
                    } else {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(m12390());
                        sb.append(" at path ");
                        sb.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                        throw new C2224(sb.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f10918--;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(m12390());
                        sb2.append(" at path ");
                        sb2.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                        throw new C2224(sb2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    m12491();
                } else if (i2 == 9 || i2 == 13) {
                    m12489(f11013);
                } else if (i2 == 8 || i2 == 12) {
                    m12489(f11012);
                } else if (i2 == 17) {
                    this.f11019.m2896((long) this.f11017);
                } else if (i2 == 18) {
                    StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                    sb3.append(m12390());
                    sb3.append(" at path ");
                    sb3.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                    throw new C2224(sb3.toString());
                }
                this.f11018 = 0;
            }
            i++;
            this.f11018 = 0;
        } while (i != 0);
        int[] iArr = this.f10919;
        int i3 = this.f10918 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f10917[this.f10918 - 1] = "null";
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m12481(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f11015.m2920((long) i2)) {
                byte r0 = this.f11019.m2847((long) i);
                if (r0 == 10 || r0 == 32 || r0 == 13 || r0 == 9) {
                    i = i2;
                } else {
                    this.f11019.m2896((long) (i2 - 1));
                    if (r0 == 47) {
                        if (!this.f11015.m2920(2)) {
                            return r0;
                        }
                        throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
                    } else if (r0 != 35) {
                        return r0;
                    } else {
                        throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.f11015);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    private char m12488() {
        int i;
        int i2;
        if (this.f11015.m2920(1)) {
            byte r0 = this.f11019.m2868();
            if (r0 == 10 || r0 == 34 || r0 == 39 || r0 == 47 || r0 == 92) {
                return (char) r0;
            }
            if (r0 == 98) {
                return 8;
            }
            if (r0 == 102) {
                return 12;
            }
            if (r0 == 110) {
                return 10;
            }
            if (r0 == 114) {
                return 13;
            }
            if (r0 == 116) {
                return 9;
            }
            if (r0 != 117) {
                StringBuilder sb = new StringBuilder("Invalid escape sequence: \\");
                sb.append((char) r0);
                throw m12381(sb.toString());
            } else if (this.f11015.m2920(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte r6 = this.f11019.m2847((long) i3);
                    char c2 = (char) (c << 4);
                    if (r6 < 48 || r6 > 57) {
                        if (r6 >= 97 && r6 <= 102) {
                            i = r6 - 97;
                        } else if (r6 < 65 || r6 > 70) {
                            StringBuilder sb2 = new StringBuilder("\\u");
                            sb2.append(this.f11019.m2884(4, jX.f2464));
                            throw m12381(sb2.toString());
                        } else {
                            i = r6 - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = r6 - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f11019.m2896(4);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder("Unterminated escape sequence at path ");
                sb3.append(C2745.m14501(this.f10918, this.f10920, this.f10917, this.f10919));
                throw new EOFException(sb3.toString());
            }
        } else {
            throw m12381("Unterminated escape sequence");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m12490(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw m12381("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}
