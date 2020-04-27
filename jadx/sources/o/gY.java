package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "ı", "(Ljava/lang/String;I)Ljava/lang/String;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
class gY extends gS {
    /* renamed from: ı  reason: contains not printable characters */
    public static final String m2383(String str, int i) {
        fM.m2254(str, "");
        if (i >= 0) {
            String substring = str.substring(C3435gj.m2408(i, str.length()));
            fM.m2252((Object) substring, "");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
