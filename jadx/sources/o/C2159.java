package o;

import java.math.BigInteger;

/* renamed from: o.ϧı  reason: contains not printable characters */
public final class C2159 extends C1367 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Class<?>[] f10326 = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: ɩ  reason: contains not printable characters */
    public Object f10327;

    public C2159(Boolean bool) {
        m11449(bool);
    }

    public C2159(Number number) {
        m11449(number);
    }

    public C2159(String str) {
        m11449(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m11449(Object obj) {
        if (obj instanceof Character) {
            this.f10327 = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || m11448(obj)) {
            this.f10327 = obj;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Number m11452() {
        Object obj = this.f10327;
        return obj instanceof String ? new C0442((String) obj) : (Number) obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m11448(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f10326) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f10327 == null) {
            return 31;
        }
        if (m11450(this)) {
            doubleToLongBits = m8484().longValue();
        } else {
            Object obj = this.f10327;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m8484().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2159 r7 = (C2159) obj;
        if (this.f10327 == null) {
            return r7.f10327 == null;
        }
        if (m11450(this) && m11450(r7)) {
            return m8484().longValue() == r7.m8484().longValue();
        }
        if (!(this.f10327 instanceof Number) || !(r7.f10327 instanceof Number)) {
            return this.f10327.equals(r7.f10327);
        }
        double doubleValue = m8484().doubleValue();
        double doubleValue2 = r7.m8484().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m11450(C2159 r2) {
        Object obj = r2.f10327;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11453() {
        Object obj = this.f10327;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(m8483());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m11451() {
        Object obj = this.f10327;
        if (obj instanceof Number) {
            return m8484().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }
}
