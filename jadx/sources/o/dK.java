package o;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001as\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000b\"\f\b\u0001\u0010\u000e*\u00060\fj\u0002`\r*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010\u001ai\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u0016\u0010\u0018\u001aC\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u001a\u0010\u0000\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0019j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001a¢\u0006\u0004\b\u0012\u0010\u001b\u001aA\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u001a\u0010\u0000\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0019j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001a¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"p0", "", "p1", "p2", "p3", "", "p4", "p5", "Lkotlin/Function1;", "p6", "", "T", "Ljava/lang/Appendable;", "Lo/Ι;", "A", "Ι", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/Appendable;", "", "ι", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/String;", "", "", "ǃ", "([C)C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lo/ɩ;", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "", "ı", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dM")
public class dK extends dJ {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final char m2066(char[] cArr) {
        fM.m2254(cArr, "");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> T m2067(T[] tArr) {
        fM.m2254(tArr, "");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final <T> T[] m2070(T[] tArr, Comparator<? super T> comparator) {
        fM.m2254(tArr, "");
        fM.m2254(comparator, "");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        fM.m2252((Object) copyOf, "");
        dM.m2063(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> List<T> m2065(T[] tArr, Comparator<? super T> comparator) {
        fM.m2254(tArr, "");
        fM.m2254(comparator, "");
        return dM.m2059(dM.m2070(tArr, comparator));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T, A extends Appendable> A m2068(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(tArr, "");
        fM.m2254(a, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            gK.m2339(a, t, foVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: ι$default  reason: contains not printable characters */
    public static /* synthetic */ String m2071$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo foVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        CharSequence charSequence6 = charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            foVar = null;
        }
        return dM.m2069(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, foVar);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final <T> String m2069(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(tArr, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        String sb = ((StringBuilder) dM.m2068(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, foVar)).toString();
        fM.m2252((Object) sb, "");
        return sb;
    }
}
