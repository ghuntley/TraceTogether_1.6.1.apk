package o;

/* renamed from: o.ſŀ  reason: contains not printable characters */
public abstract class C0579 {
    protected C0579() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m5202(char c);

    /* renamed from: ı  reason: contains not printable characters */
    public int m5201(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C0672.m5544(i, length, "index");
        while (i < length) {
            if (m5202(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m5199(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
