package o;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Ҏ  reason: contains not printable characters */
public final class C2663 extends C0995 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final Object f12249 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Reader f12250 = new Reader() {
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public final void close() {
            throw new AssertionError();
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public int f12251 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    public Object[] f12252 = new Object[32];

    /* renamed from: і  reason: contains not printable characters */
    private String[] f12253 = new String[32];

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int[] f12254 = new int[32];

    public C2663(C1367 r3) {
        super(f12250);
        m14128(r3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14127() {
        m14134(C0313.BEGIN_ARRAY);
        m14128(((C3135) this.f12252[this.f12251 - 1]).iterator());
        this.f12254[this.f12251 - 1] = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14133() {
        m14134(C0313.END_ARRAY);
        this.f12251--;
        Object[] objArr = this.f12252;
        int i = this.f12251;
        objArr[i] = null;
        this.f12251 = i - 1;
        int i2 = this.f12251;
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.f12254;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14124() {
        m14134(C0313.BEGIN_OBJECT);
        m14128(((C1389) this.f12252[this.f12251 - 1]).f7635.entrySet().iterator());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14132() {
        m14134(C0313.END_OBJECT);
        this.f12251--;
        Object[] objArr = this.f12252;
        int i = this.f12251;
        objArr[i] = null;
        this.f12251 = i - 1;
        int i2 = this.f12251;
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.f12254;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14122() {
        C0313 r0 = m7095();
        return (r0 == C0313.END_OBJECT || r0 == C0313.END_ARRAY) ? false : true;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C0313 m14123() {
        while (true) {
            int i = this.f12251;
            if (i == 0) {
                return C0313.END_DOCUMENT;
            }
            Object[] objArr = this.f12252;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                boolean z = objArr[i - 2] instanceof C1389;
                Iterator it = (Iterator) obj;
                if (!it.hasNext()) {
                    return z ? C0313.END_OBJECT : C0313.END_ARRAY;
                }
                if (z) {
                    return C0313.NAME;
                }
                m14128(it.next());
            } else if (obj instanceof C1389) {
                return C0313.BEGIN_OBJECT;
            } else {
                if (obj instanceof C3135) {
                    return C0313.BEGIN_ARRAY;
                }
                if (obj instanceof C2159) {
                    C2159 r2 = (C2159) obj;
                    if (r2.f10327 instanceof String) {
                        return C0313.STRING;
                    }
                    if (r2.f10327 instanceof Boolean) {
                        return C0313.BOOLEAN;
                    }
                    if (r2.f10327 instanceof Number) {
                        return C0313.NUMBER;
                    }
                    throw new AssertionError();
                } else if (obj instanceof C0875) {
                    return C0313.NULL;
                } else {
                    if (obj == f12249) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14134(C0313 r4) {
        if (m7095() != r4) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(r4);
            sb.append(" but was ");
            sb.append(m7095());
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(m7108());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m14137() {
        m14134(C0313.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) this.f12252[this.f12251 - 1]).next();
        String str = (String) entry.getKey();
        this.f12253[this.f12251 - 1] = str;
        m14128(entry.getValue());
        return str;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m14130() {
        C0313 r0 = m7095();
        if (r0 == C0313.STRING || r0 == C0313.NUMBER) {
            Object[] objArr = this.f12252;
            int i = this.f12251 - 1;
            this.f12251 = i;
            Object obj = objArr[i];
            objArr[this.f12251] = null;
            String r02 = ((C2159) obj).m8483();
            int i2 = this.f12251;
            if (i2 > 0) {
                int[] iArr = this.f12254;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return r02;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C0313.STRING);
        sb.append(" but was ");
        sb.append(r0);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(m7108());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m14136() {
        m14134(C0313.BOOLEAN);
        Object[] objArr = this.f12252;
        int i = this.f12251 - 1;
        this.f12251 = i;
        Object obj = objArr[i];
        objArr[this.f12251] = null;
        boolean r0 = ((C2159) obj).m8485();
        int i2 = this.f12251;
        if (i2 > 0) {
            int[] iArr = this.f12254;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return r0;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m14135() {
        m14134(C0313.NULL);
        this.f12251--;
        Object[] objArr = this.f12252;
        int i = this.f12251;
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.f12254;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final double m14126() {
        C0313 r0 = m7095();
        if (r0 == C0313.NUMBER || r0 == C0313.STRING) {
            C2159 r02 = (C2159) this.f12252[this.f12251 - 1];
            double doubleValue = r02.f10327 instanceof Number ? r02.m8484().doubleValue() : Double.parseDouble(r02.m8483());
            if (this.f6050 || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                this.f12251--;
                Object[] objArr = this.f12252;
                int i = this.f12251;
                objArr[i] = null;
                if (i > 0) {
                    int[] iArr = this.f12254;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(doubleValue)));
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C0313.NUMBER);
        sb.append(" but was ");
        sb.append(r0);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(m7108());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final long m14129() {
        C0313 r0 = m7095();
        if (r0 == C0313.NUMBER || r0 == C0313.STRING) {
            C2159 r02 = (C2159) this.f12252[this.f12251 - 1];
            long longValue = r02.f10327 instanceof Number ? r02.m8484().longValue() : Long.parseLong(r02.m8483());
            this.f12251--;
            Object[] objArr = this.f12252;
            int i = this.f12251;
            objArr[i] = null;
            if (i > 0) {
                int[] iArr = this.f12254;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return longValue;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C0313.NUMBER);
        sb.append(" but was ");
        sb.append(r0);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(m7108());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final int m14131() {
        C0313 r0 = m7095();
        if (r0 == C0313.NUMBER || r0 == C0313.STRING) {
            C2159 r02 = (C2159) this.f12252[this.f12251 - 1];
            int intValue = r02.f10327 instanceof Number ? r02.m8484().intValue() : Integer.parseInt(r02.m8483());
            this.f12251--;
            Object[] objArr = this.f12252;
            int i = this.f12251;
            objArr[i] = null;
            if (i > 0) {
                int[] iArr = this.f12254;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return intValue;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C0313.NUMBER);
        sb.append(" but was ");
        sb.append(r0);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(m7108());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    public final void close() {
        this.f12252 = new Object[]{f12249};
        this.f12251 = 1;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m14125() {
        if (m7095() == C0313.NAME) {
            m7107();
            this.f12253[this.f12251 - 2] = "null";
        } else {
            this.f12251--;
            Object[] objArr = this.f12252;
            int i = this.f12251;
            objArr[i] = null;
            if (i > 0) {
                this.f12253[i - 1] = "null";
            }
        }
        int i2 = this.f12251;
        if (i2 > 0) {
            int[] iArr = this.f12254;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14128(Object obj) {
        int i = this.f12251;
        Object[] objArr = this.f12252;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i << 1)];
            int[] iArr = new int[(i << 1)];
            String[] strArr = new String[(i << 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f12254, 0, iArr, 0, this.f12251);
            System.arraycopy(this.f12253, 0, strArr, 0, this.f12251);
            this.f12252 = objArr2;
            this.f12254 = iArr;
            this.f12253 = strArr;
        }
        Object[] objArr3 = this.f12252;
        int i2 = this.f12251;
        this.f12251 = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m14138() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f12251) {
            Object[] objArr = this.f12252;
            if (objArr[i] instanceof C3135) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f12254[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C1389) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f12253;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }
}
