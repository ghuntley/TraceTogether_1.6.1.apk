package o;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.ʭ  reason: contains not printable characters */
final class C1705 implements C1680 {

    /* renamed from: ι  reason: contains not printable characters */
    private final LocaleList f8881;

    C1705(LocaleList localeList) {
        this.f8881 = localeList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m9678() {
        return this.f8881;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Locale m9679(int i) {
        return this.f8881.get(i);
    }

    public final boolean equals(Object obj) {
        return this.f8881.equals(((C1680) obj).m9556());
    }

    public final int hashCode() {
        return this.f8881.hashCode();
    }

    public final String toString() {
        return this.f8881.toString();
    }
}
