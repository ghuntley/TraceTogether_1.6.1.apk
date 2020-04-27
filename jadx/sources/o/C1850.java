package o;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.ΙΙ  reason: contains not printable characters */
public final class C1850 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C1850 f9470 = m10209(new Locale[0]);

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1680 f9471;

    private C1850(C1680 r1) {
        this.f9471 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1850 m10207(LocaleList localeList) {
        return new C1850(new C1705(localeList));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1850 m10209(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m10207(new LocaleList(localeArr));
        }
        return new C1850(new C1721(localeArr));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Locale m10210(int i) {
        return this.f9471.m9557(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Locale m10208(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains(C3292bc.f1729)) {
            return new Locale(str);
        } else {
            String[] split2 = str.split(C3292bc.f1729, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1850) && this.f9471.equals(((C1850) obj).f9471);
    }

    public final int hashCode() {
        return this.f9471.hashCode();
    }

    public final String toString() {
        return this.f9471.toString();
    }
}
