package o;

import android.text.TextUtils;
import java.util.Arrays;
import o.C0858;

/* renamed from: o.ն  reason: contains not printable characters */
public final class C3167 extends C2322 implements C3132 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final String f14422;

    private C3167(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f14422 = str;
            return;
        }
        throw new IllegalArgumentException("A valid API key must be provided");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3167)) {
            return false;
        }
        String str = this.f14422;
        String str2 = ((C3167) obj).f14422;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14422});
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ C2322 m16014() {
        return (C3167) clone();
    }

    public final /* synthetic */ Object clone() {
        return new C3167(new C0858.Aux(this.f14422).f5618, (byte) 0);
    }

    public /* synthetic */ C3167(String str, byte b) {
        this(str);
    }
}
