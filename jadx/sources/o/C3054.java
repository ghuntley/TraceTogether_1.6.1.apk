package o;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: o.Ւı  reason: contains not printable characters */
public final class C3054 extends C3011<Time> {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2638 f13984 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m15601(C3122 r1, C3101<T> r2) {
            if (r2.getRawType() == Time.class) {
                return new C3054();
            }
            return null;
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    private final DateFormat f13985 = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public synchronized Time m15599(C0995 r4) {
        if (r4.m7095() == C0313.NULL) {
            r4.m7105();
            return null;
        }
        try {
            return new Time(this.f13985.parse(r4.m7101()).getTime());
        } catch (ParseException e) {
            throw new C1701((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public synchronized void m15600(C0815 r2, Time time) {
        r2.m6227(time == null ? null : this.f13985.format(time));
    }
}
