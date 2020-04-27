package o;

import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0006\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0013\u0010\u0005\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003R\u0013\u0010\u0007\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\b\u0010\u0003R\u0013\u0010\b\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0013\u0010\u0002\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003"}, d2 = {"Lo/gL;", "Ljava/nio/charset/Charset;", "Ӏ", "Ljava/nio/charset/Charset;", "ǃ", "ı", "Ι", "ɩ", "ι", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public final class gL {

    /* renamed from: ı  reason: contains not printable characters */
    public static final Charset f2201;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Charset f2202;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Charset f2203;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Charset f2204;

    /* renamed from: ι  reason: contains not printable characters */
    public static final Charset f2205;

    /* renamed from: І  reason: contains not printable characters */
    public static final gL f2206 = new gL();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final Charset f2207;

    static {
        Charset forName = Charset.forName("UTF-8");
        fM.m2252((Object) forName, "");
        f2204 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        fM.m2252((Object) forName2, "");
        f2203 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        fM.m2252((Object) forName3, "");
        f2205 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        fM.m2252((Object) forName4, "");
        f2202 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        fM.m2252((Object) forName5, "");
        f2201 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        fM.m2252((Object) forName6, "");
        f2207 = forName6;
    }

    private gL() {
    }
}
