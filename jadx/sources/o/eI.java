package o;

import java.lang.reflect.Field;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "p0", "p1", "", "ɩ", "(II)V", "Lo/eK;", "Lo/eD;", "(Lo/eD;)Lo/eK;", "ǃ", "(Lo/eD;)I", "Ljava/lang/StackTraceElement;", "Ι", "(Lo/eD;)Ljava/lang/StackTraceElement;"}, k = 2, mv = {1, 1, 15})
public final class eI {
    /* renamed from: Ι  reason: contains not printable characters */
    public static final StackTraceElement m2143(eD eDVar) {
        int i;
        String str;
        fM.m2254(eDVar, "");
        eK r0 = m2141(eDVar);
        if (r0 == null) {
            return null;
        }
        m2142(1, r0.m2151());
        int r1 = m2140(eDVar);
        if (r1 < 0) {
            i = -1;
        } else {
            i = r0.m2150()[r1];
        }
        String r4 = eP.f2087.m2158(eDVar);
        if (r4 == null) {
            str = r0.m2147();
        } else {
            str = r4 + '/' + r0.m2147();
        }
        return new StackTraceElement(str, r0.m2148(), r0.m2149(), i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final eK m2141(eD eDVar) {
        return (eK) eDVar.getClass().getAnnotation(eK.class);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int m2140(eD eDVar) {
        try {
            Field declaredField = eDVar.getClass().getDeclaredField("label");
            fM.m2252((Object) declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(eDVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final void m2142(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }
}
