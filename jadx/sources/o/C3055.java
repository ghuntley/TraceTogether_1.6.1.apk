package o;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: o.Ւǃ  reason: contains not printable characters */
public final class C3055 extends C3011<Date> {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2638 f13986 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m15606(C3122 r1, C3101<T> r2) {
            if (r2.getRawType() == Date.class) {
                return new C3055();
            }
            return null;
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private final DateFormat f13987 = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public synchronized Date m15604(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7105();
            return null;
        }
        try {
            return new Date(this.f13987.parse(r3.m7101()).getTime());
        } catch (ParseException e) {
            throw new C1701((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public synchronized void m15605(C0815 r2, Date date) {
        r2.m6227(date == null ? null : this.f13987.format(date));
    }
}
