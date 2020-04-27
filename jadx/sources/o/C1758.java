package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ͽǃ  reason: contains not printable characters */
public final class C1758 implements C2231 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C1758 f9065 = new C1758(f9066, f9069);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static String f9066 = C2745.m14526("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Set<C1733> f9067 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1733[]{new C1733("proto"), new C1733("json")})));

    /* renamed from: ι  reason: contains not printable characters */
    static final String f9068 = C2745.m14526("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: І  reason: contains not printable characters */
    private static final String f9069 = C2745.m14526("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f9070;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f9071;

    static {
        new C1758(f9068, (String) null);
    }

    public C1758(String str, String str2) {
        this.f9070 = str;
        this.f9071 = str2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m9835() {
        return "cct";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Set<C1733> m9837() {
        return f9067;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte[] m9836() {
        if (this.f9071 == null && this.f9070 == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f9070;
        objArr[2] = "\\";
        String str = this.f9071;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
