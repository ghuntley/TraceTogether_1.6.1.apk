package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: o.ƺı  reason: contains not printable characters */
public final class C0815 implements Closeable, Flushable {

    /* renamed from: і  reason: contains not printable characters */
    private static final String[] f5311;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final String[] f5312 = new String[128];

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f5313;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int[] f5314 = new int[32];

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Writer f5315;

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f5316;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f5317;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f5318;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f5319;

    /* renamed from: І  reason: contains not printable characters */
    private int f5320 = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            f5312[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f5312;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f5311 = strArr2;
        strArr2[60] = "\\u003c";
        String[] strArr3 = f5311;
        strArr3[62] = "\\u003e";
        strArr3[38] = "\\u0026";
        strArr3[61] = "\\u003d";
        strArr3[39] = "\\u0027";
    }

    public C0815(Writer writer) {
        m6223(6);
        this.f5317 = ":";
        this.f5316 = true;
        if (writer != null) {
            this.f5315 = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6223(int i) {
        int i2 = this.f5320;
        int[] iArr = this.f5314;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5314 = iArr2;
        }
        int[] iArr3 = this.f5314;
        int i3 = this.f5320;
        this.f5320 = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0815 m6233(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f5318 != null) {
            throw new IllegalStateException();
        } else if (this.f5320 != 0) {
            this.f5318 = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0815 m6227(String str) {
        if (str == null) {
            return m6224();
        }
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        m6231();
        m6235(str);
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0815 m6224() {
        String str = this.f5318;
        if (str != null) {
            if (!this.f5316) {
                this.f5318 = null;
                return this;
            } else if (str != null) {
                m6229();
                m6235(this.f5318);
                this.f5318 = null;
            }
        }
        m6231();
        this.f5315.write("null");
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0815 m6230(Number number) {
        if (number == null) {
            return m6224();
        }
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        String obj = number.toString();
        if (this.f5313 || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m6231();
            this.f5315.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    public final void flush() {
        if (this.f5320 != 0) {
            this.f5315.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void close() {
        this.f5315.close();
        int i = this.f5320;
        if (i > 1 || (i == 1 && this.f5314[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f5320 = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m6235(String str) {
        String str2;
        String[] strArr = this.f5319 ? f5311 : f5312;
        this.f5315.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f5315.write(str, i, i2 - i);
            }
            this.f5315.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f5315.write(str, i, length - i);
        }
        this.f5315.write("\"");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0815 m6232() {
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        m6231();
        m6223(1);
        this.f5315.write("[");
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0815 m6234() {
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        m6231();
        m6223(3);
        this.f5315.write("{");
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C0815 m6225(int i, int i2, String str) {
        int i3 = this.f5320;
        if (i3 != 0) {
            int i4 = this.f5314[i3 - 1];
            if (i4 != i2 && i4 != i) {
                throw new IllegalStateException("Nesting problem.");
            } else if (this.f5318 == null) {
                this.f5320--;
                this.f5315.write(str);
                return this;
            } else {
                StringBuilder sb = new StringBuilder("Dangling name: ");
                sb.append(this.f5318);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0815 m6228(boolean z) {
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        m6231();
        this.f5315.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0815 m6226(long j) {
        if (this.f5318 != null) {
            m6229();
            m6235(this.f5318);
            this.f5318 = null;
        }
        m6231();
        this.f5315.write(Long.toString(j));
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m6229() {
        int i = this.f5320;
        if (i != 0) {
            int i2 = this.f5314[i - 1];
            if (i2 == 5) {
                this.f5315.write(44);
            } else if (i2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f5314[this.f5320 - 1] = 4;
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m6231() {
        int i = this.f5320;
        if (i != 0) {
            int[] iArr = this.f5314;
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                iArr[i - 1] = 2;
            } else if (i2 == 2) {
                this.f5315.append(',');
            } else if (i2 != 4) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f5313) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f5314[this.f5320 - 1] = 7;
            } else {
                this.f5315.append(this.f5317);
                this.f5314[this.f5320 - 1] = 5;
            }
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
