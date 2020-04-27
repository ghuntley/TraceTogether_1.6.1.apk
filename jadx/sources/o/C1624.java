package o;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.C2864;

/* renamed from: o.ʇյ  reason: contains not printable characters */
public final class C1624 extends C3011<Date> {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2638 f8542 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m9385(C3122 r1, C3101<T> r2) {
            if (r2.getRawType() == Date.class) {
                return new C1624();
            }
            return null;
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    private final List<DateFormat> f8543 = new ArrayList();

    public C1624() {
        this.f8543.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f8543.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C3020.m15467()) {
            this.f8543.add(C2864.If.m14863(2, 2));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private synchronized Date m9381(String str) {
        for (DateFormat parse : this.f8543) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C3183.m16058(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C1701(str, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public synchronized void m9384(C0815 r3, Date date) {
        if (date == null) {
            r3.m6224();
        } else {
            r3.m6227(this.f8543.get(0).format(date));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m9383(C0995 r3) {
        if (r3.m7095() != C0313.NULL) {
            return m9381(r3.m7101());
        }
        r3.m7105();
        return null;
    }
}
