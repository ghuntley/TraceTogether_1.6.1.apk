package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import o.C2745;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\b\u0010\n"}, d2 = {"", "p0", "Lkotlin/Function1;", "ı", "(Ljava/lang/String;)Lo/fo;", "", "Ι", "(Ljava/lang/String;)I", "ǃ", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
public class gM {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String m2332(String str) {
        fM.m2254(str, "");
        return gK.m2333(str, "");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String m2333(String str, String str2) {
        String r5;
        String str3 = str;
        fM.m2254(str3, "");
        fM.m2254(str2, "");
        List<String> r3 = gK.m2378(str3);
        Collection arrayList = new ArrayList();
        for (Object next : r3) {
            if (!gK.m2340((String) next)) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(dN.m2074(iterable, 10));
        for (String r6 : iterable) {
            arrayList2.add(Integer.valueOf(m2334(r6)));
        }
        Integer num = (Integer) dN.m2199((List) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * r3.size());
        C3413fo<String, String> r2 = m2331(str2);
        int r62 = dN.m2078(r3);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : r3) {
            int i2 = i + 1;
            if (i < 0) {
                dN.m2077();
            }
            String str4 = (String) next2;
            if ((i == 0 || i == r62) && gK.m2340(str4)) {
                str4 = null;
            } else {
                String r52 = gK.m2383(str4, intValue);
                if (!(r52 == null || (r5 = r2.m2298(r52)) == null)) {
                    str4 = r5;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        String sb = ((StringBuilder) dN.m2190$default((List) arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, C2745.aux.f13019, (Object) null)).toString();
        fM.m2252((Object) sb, "");
        return sb;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int m2334(String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!gD.m2321(charSequence.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static final C3413fo<String, String> m2331(final String str) {
        if (str.length() == 0) {
            return AnonymousClass5.f2209;
        }
        return new C3413fo<String, String>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final String m2335(String str) {
                fM.m2254(str, "");
                return str + str;
            }
        };
    }
}
