package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a}\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000b\"\f\b\u0001\u0010\u000e*\u00060\fj\u0002`\r*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010\u001ag\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0014*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u000f\u0010\u001c\u001a?\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u001a\u0010\u0000\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u001dj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001e¢\u0006\u0004\b\u001a\u0010\u001f\u001a7\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000b\"\u0010\b\u0001\u0010!*\n\u0012\u0006\b\u0000\u0012\u00028\u00000 *\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\"\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000f\u0010\u0019\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&\u001a#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0012\u0010\u0019\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b(\u0010)\u001a#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b%\u0010)\u001a4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0004¢\u0006\u0004\b\u000f\u0010+"}, d2 = {"p0", "", "p1", "p2", "p3", "", "p4", "p5", "Lkotlin/Function1;", "p6", "", "T", "Ljava/lang/Appendable;", "Lo/Ι;", "A", "ı", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/Appendable;", "", "ǃ", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/String;", "", "І", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "", "ι", "(Ljava/lang/Iterable;)Ljava/util/List;", "ɩ", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "(Ljava/util/List;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lo/ɩ;", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "C", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "", "", "Ι", "(Ljava/util/Collection;)Ljava/util/List;", "", "і", "(Ljava/lang/Iterable;)Ljava/util/Set;", "", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dN")
/* renamed from: o.eb  reason: case insensitive filesystem */
public class C3374eb extends dS {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> T m2194(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if (iterable instanceof List) {
            return dN.m2186((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> T m2186(List<? extends T> list) {
        fM.m2254(list, "");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final <T> List<T> m2198(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return dN.m2188(iterable);
        }
        List<T> r2 = dN.m2192(iterable);
        dN.m2079(r2);
        return r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> List<T> m2195(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        fM.m2254(iterable, "");
        fM.m2254(comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return dN.m2188(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array != null) {
                dM.m2063(array, comparator);
                return dM.m2059(array);
            }
            throw new dA("null cannot be cast to non-null type kotlin.Array<T>");
        }
        List<T> r3 = dN.m2192(iterable);
        dN.m2080(r3, comparator);
        return r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m2187(Iterable<? extends T> iterable, C c) {
        fM.m2254(iterable, "");
        fM.m2254(c, "");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> List<T> m2188(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if (!(iterable instanceof Collection)) {
            return dN.m2076(dN.m2192(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return dN.m2075();
        }
        if (size != 1) {
            return dN.m2196(collection);
        }
        return dN.m2073(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> List<T> m2192(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if (iterable instanceof Collection) {
            return dN.m2196((Collection) iterable);
        }
        return (List) dN.m2187(iterable, new ArrayList());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T> List<T> m2196(Collection<? extends T> collection) {
        fM.m2254(collection, "");
        return new ArrayList<>(collection);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T> Set<T> m2197(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if (!(iterable instanceof Collection)) {
            return C3380eh.m2209((Set) dN.m2187(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3380eh.m2210();
        }
        if (size != 1) {
            return (Set) dN.m2187(iterable, new LinkedHashSet(C3377ee.m2205(collection.size())));
        }
        return C3380eh.m2211(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: і  reason: contains not printable characters */
    public static final <T> Set<T> m2200(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        return (Set) dN.m2187(iterable, new LinkedHashSet());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> Set<T> m2189(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        fM.m2254(iterable, "");
        fM.m2254(iterable2, "");
        Set<T> r1 = dN.m2200(iterable);
        dN.m2081(r1, iterable2);
        return r1;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m2199(Iterable<? extends T> iterable) {
        fM.m2254(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ Appendable m2190$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo foVar, int i2, Object obj) {
        return dN.m2185(iterable, appendable, (i2 & 2) != 0 ? ", " : charSequence, (i2 & 4) != 0 ? "" : charSequence2, (i2 & 8) != 0 ? "" : charSequence3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : foVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T, A extends Appendable> A m2185(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(iterable, "");
        fM.m2254(a, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            gK.m2339(a, next, foVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ String m2193$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo foVar, int i2, Object obj) {
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
        return dN.m2191(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, foVar);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> String m2191(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(iterable, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        String sb = ((StringBuilder) dN.m2185(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, foVar)).toString();
        fM.m2252((Object) sb, "");
        return sb;
    }
}
