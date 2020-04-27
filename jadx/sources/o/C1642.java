package o;

/* renamed from: o.ʌı  reason: contains not printable characters */
public final class C1642 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f8609;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f8610;

    public C1642() {
    }

    public C1642(String str, String str2) {
        if (str != null) {
            Object[] objArr = {str, 23};
            if (str.length() <= 23) {
                this.f8609 = str;
                if (str2 == null || str2.length() <= 0) {
                    this.f8610 = null;
                } else {
                    this.f8610 = str2;
                }
            } else {
                throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
            }
        } else {
            throw new NullPointerException("log tag cannot be null");
        }
    }

    public C1642(String str) {
        this(str, (String) null);
    }
}
