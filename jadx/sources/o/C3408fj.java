package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\"-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00008G@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007"}, d2 = {"Ljava/lang/Class;", "Lo/gp;", "", "T", "ɩ", "(Lo/gp;)Ljava/lang/Class;", "Ι", "(Ljava/lang/Class;)Lo/gp;", "ι"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.fj  reason: case insensitive filesystem */
public final class C3408fj {
    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> Class<T> m2296(C3441gp<T> gpVar) {
        fM.m2254(gpVar, "");
        Class<?> r2 = ((fI) gpVar).m2247();
        if (!r2.isPrimitive()) {
            return r2;
        }
        String name = r2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : r2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return r2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return r2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return r2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return r2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return r2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return r2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return r2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return r2;
            default:
                return r2;
        }
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> C3441gp<T> m2297(Class<T> cls) {
        fM.m2254(cls, "");
        return C3428gc.m2389((Class) cls);
    }
}
