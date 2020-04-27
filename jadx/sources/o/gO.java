package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007*\u00060\u0005j\u0002`\u00062\u0006\u0010\u0000\u001a\u00028\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"p0", "Lkotlin/Function1;", "", "p1", "", "Ljava/lang/Appendable;", "Lo/Ι;", "T", "ı", "(Ljava/lang/Appendable;Ljava/lang/Object;Lo/fo;)V"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
public class gO extends gN {
    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> void m2339(Appendable appendable, T t, C3413fo<? super T, ? extends CharSequence> foVar) {
        fM.m2254(appendable, "");
        if (foVar != null) {
            appendable.append((CharSequence) foVar.m2298(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
