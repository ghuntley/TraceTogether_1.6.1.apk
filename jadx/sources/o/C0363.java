package o;

import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: o.ıʌ  reason: contains not printable characters */
public class C0363 extends C0320<C0363> {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f3815 = "itemType";

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f3816 = "purchase";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final BigDecimal f3817 = BigDecimal.valueOf(1000000);

    /* renamed from: ɪ  reason: contains not printable characters */
    static final String f3818 = "success";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f3819 = "itemName";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f3820 = "itemId";

    /* renamed from: І  reason: contains not printable characters */
    static final String f3821 = "currency";

    /* renamed from: і  reason: contains not printable characters */
    static final String f3822 = "itemPrice";

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public String m4547() {
        return f3816;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C0363 m4549(String str) {
        this.f3661.m14120(f3820, str);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0363 m4548(String str) {
        this.f3661.m14120(f3819, str);
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0363 m4542(String str) {
        this.f3661.m14120(f3815, str);
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0363 m4544(BigDecimal bigDecimal) {
        if (!this.f12581.m14018((Object) bigDecimal, f3822)) {
            this.f3661.m14119(f3822, Long.valueOf(m4546(bigDecimal)));
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0363 m4545(Currency currency) {
        if (!this.f12581.m14018((Object) currency, f3821)) {
            this.f3661.m14120(f3821, currency.getCurrencyCode());
        }
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0363 m4543(boolean z) {
        this.f3661.m14120(f3818, Boolean.toString(z));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public long m4546(BigDecimal bigDecimal) {
        return f3817.multiply(bigDecimal).longValue();
    }
}
