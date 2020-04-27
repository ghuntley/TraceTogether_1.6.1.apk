package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: o.լΙ  reason: contains not printable characters */
public final class C3116 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C3119<Boolean> f14229 = C3045.m15538();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Cif f14230 = new Cif((byte) 0);

    /* renamed from: ι  reason: contains not printable characters */
    private static final C3119<String> f14231 = C3044.m15536();
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final Map<Class<?>, C2856<?>> f14232 = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Map<Class<?>, C3119<?>> f14233 = new HashMap();

    /* renamed from: o.լΙ$if  reason: invalid class name */
    static final class Cif implements C3119<Date> {

        /* renamed from: Ι  reason: contains not printable characters */
        private static final DateFormat f14235;

        private Cif() {
        }

        /* synthetic */ Cif(byte b) {
            this();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m15799(Object obj, Object obj2) {
            ((C3061) obj2).m15615(f14235.format((Date) obj));
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f14235 = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    public C3116() {
        m15792(String.class, f14231);
        m15792(Boolean.class, f14229);
        m15792(Date.class, f14230);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> C3116 m15796(Class<T> cls, C2856<? super T> r4) {
        if (!this.f14232.containsKey(cls)) {
            this.f14232.put(cls, r4);
            return this;
        }
        StringBuilder sb = new StringBuilder("Encoder already registered for ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private <T> C3116 m15792(Class<T> cls, C3119<? super T> r4) {
        if (!this.f14233.containsKey(cls)) {
            this.f14233.put(cls, r4);
            return this;
        }
        StringBuilder sb = new StringBuilder("Encoder already registered for ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}
