package o;

import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: o.łӏ  reason: contains not printable characters */
public class C0553 extends C0320<C0553> {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f4438 = "currency";

    /* renamed from: ǃ  reason: contains not printable characters */
    static final BigDecimal f4439 = BigDecimal.valueOf(1000000);

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f4440 = "totalPrice";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f4441 = "itemCount";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f4442 = "startCheckout";

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public String m5141() {
        return f4442;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0553 m5142(int i) {
        this.f3661.m14119(f4441, Integer.valueOf(i));
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0553 m5143(BigDecimal bigDecimal) {
        if (!this.f12581.m14018((Object) bigDecimal, f4440)) {
            this.f3661.m14119(f4440, Long.valueOf(m5139(bigDecimal)));
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C0553 m5140(Currency currency) {
        if (!this.f12581.m14018((Object) currency, f4438)) {
            this.f3661.m14120(f4438, currency.getCurrencyCode());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public long m5139(BigDecimal bigDecimal) {
        return f4439.multiply(bigDecimal).longValue();
    }
}
