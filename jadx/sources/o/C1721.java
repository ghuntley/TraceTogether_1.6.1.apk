package o;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: o.ͱ  reason: contains not printable characters */
final class C1721 implements C1680 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Locale f8918 = new Locale("ar", "XB");

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final Locale f8919 = C1850.m10208("en-Latn");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Locale[] f8920 = new Locale[0];

    /* renamed from: ι  reason: contains not printable characters */
    private static final Locale f8921 = new Locale("en", "XA");

    /* renamed from: ı  reason: contains not printable characters */
    private final Locale[] f8922;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f8923;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m9705() {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Locale m9706(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.f8922;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1721)) {
            return false;
        }
        Locale[] localeArr = ((C1721) obj).f8922;
        if (this.f8922.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f8922;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f8922;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f8922;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f8922.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    C1721(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f8922 = f8920;
            this.f8923 = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale == null) {
                StringBuilder sb2 = new StringBuilder("list[");
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                m9704(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder("list[");
                sb3.append(i);
                sb3.append("] is a repetition");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        this.f8922 = localeArr2;
        this.f8923 = sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m9704(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }
}
