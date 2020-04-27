package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001c\u0010\u0005\u001a\u00020\u00008\u0001@\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ɩ", "I", "ι", "()I", "ı", "", "p0", "Ι", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 5, mv = {1, 1, 15}, xs = "o/jf")
/* renamed from: o.jg  reason: case insensitive filesystem */
final /* synthetic */ class C3512jg {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int f2469 = Runtime.getRuntime().availableProcessors();

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public static final int m3078() {
        return f2469;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m3077(String str) {
        fM.m2254(str, "");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
