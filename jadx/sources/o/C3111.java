package o;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.C2864;

/* renamed from: o.լʅ  reason: contains not printable characters */
public final class C3111 extends C3011<Date> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final List<DateFormat> f14224 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    private final Class<? extends Date> f14225;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ void m15774(C0815 r4, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            r4.m6224();
            return;
        }
        synchronized (this.f14224) {
            r4.m6227(this.f14224.get(0).format(date));
        }
    }

    public C3111(Class<? extends Date> cls, int i, int i2) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f14225 = cls;
            this.f14224.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
            if (!Locale.getDefault().equals(Locale.US)) {
                this.f14224.add(DateFormat.getDateTimeInstance(i, i2));
            }
            if (C3020.m15467()) {
                this.f14224.add(C2864.If.m14863(i, i2));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Date m15772(String str) {
        synchronized (this.f14224) {
            for (DateFormat parse : this.f14224) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date r4 = C3183.m16058(str, new ParsePosition(0));
                return r4;
            } catch (ParseException e) {
                throw new C1701(str, e);
            }
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f14224.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m15773(C0995 r4) {
        if (r4.m7095() == C0313.NULL) {
            r4.m7105();
            return null;
        }
        Date r42 = m15772(r4.m7101());
        Class<? extends Date> cls = this.f14225;
        if (cls == Date.class) {
            return r42;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(r42.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(r42.getTime());
        }
        throw new AssertionError();
    }
}
