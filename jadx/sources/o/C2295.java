package o;

import java.io.Writer;

/* renamed from: o.ІІ  reason: contains not printable characters */
public final class C2295 extends Writer {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f10692;

    /* renamed from: ɩ  reason: contains not printable characters */
    private StringBuilder f10693 = new StringBuilder(128);

    public C2295(String str) {
        this.f10692 = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c != 10) {
                this.f10693.append(c);
            } else if (this.f10693.length() > 0) {
                StringBuilder sb = this.f10693;
                sb.delete(0, sb.length());
            }
        }
    }

    public final void close() {
        if (this.f10693.length() > 0) {
            StringBuilder sb = this.f10693;
            sb.delete(0, sb.length());
        }
    }

    public final void flush() {
        if (this.f10693.length() > 0) {
            StringBuilder sb = this.f10693;
            sb.delete(0, sb.length());
        }
    }
}
