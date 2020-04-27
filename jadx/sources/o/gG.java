package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001aq\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000b\"\f\b\u0001\u0010\u000e*\u00060\fj\u0002`\r*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010\u001ag\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a7\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000b\"\u0010\b\u0001\u0010\u0017*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0016*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0018\u001a#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001d\u0010\u001b"}, d2 = {"p0", "", "p1", "p2", "p3", "", "p4", "p5", "Lkotlin/Function1;", "p6", "Lo/gB;", "T", "Ljava/lang/Appendable;", "Lo/Ι;", "A", "Ι", "(Lo/gB;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/Appendable;", "", "ı", "(Lo/gB;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo/fo;)Ljava/lang/String;", "R", "(Lo/gB;Lo/fo;)Lo/gB;", "", "C", "(Lo/gB;Ljava/util/Collection;)Ljava/util/Collection;", "", "ι", "(Lo/gB;)Ljava/util/List;", "", "ɩ"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gy")
public class gG extends gC {
    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m2318(gB<? extends T> gBVar, C c) {
        fM.m2254(gBVar, "");
        fM.m2254(c, "");
        Iterator<? extends T> r1 = gBVar.m2305();
        while (r1.hasNext()) {
            c.add(r1.next());
        }
        return c;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final <T> List<T> m2319(gB<? extends T> gBVar) {
        fM.m2254(gBVar, "");
        return dN.m2076(C3450gy.m2316(gBVar));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> List<T> m2316(gB<? extends T> gBVar) {
        fM.m2254(gBVar, "");
        return (List) C3450gy.m2318(gBVar, new ArrayList());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T, R> gB<R> m2314(gB<? extends T> gBVar, C3413fo<? super T, ? extends R> foVar) {
        fM.m2254(gBVar, "");
        fM.m2254(foVar, "");
        return new gF<>(gBVar, foVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T, A extends Appendable> A m2317(gB<? extends T> gBVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(gBVar, "");
        fM.m2254(a, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        a.append(charSequence2);
        Iterator<? extends T> r2 = gBVar.m2305();
        int i2 = 0;
        while (r2.hasNext()) {
            Object next = r2.next();
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

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ String m2315$default(gB gBVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo foVar, int i2, Object obj) {
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
        return C3450gy.m2313(gBVar, charSequence, charSequence5, charSequence6, i3, charSequence7, foVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> String m2313(gB<? extends T> gBVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(gBVar, "");
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        fM.m2254(charSequence3, "");
        fM.m2254(charSequence4, "");
        String sb = ((StringBuilder) C3450gy.m2317(gBVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, foVar)).toString();
        fM.m2252((Object) sb, "");
        return sb;
    }
}
