package o;

import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: o.іƗ  reason: contains not printable characters */
public class C2568 extends C0320<C2568> {

    /* renamed from: ı  reason: contains not printable characters */
    static final BigDecimal f11686 = BigDecimal.valueOf(1000000);

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f11687 = "itemType";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f11688 = "addToCart";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f11689 = "itemName";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f11690 = "itemId";

    /* renamed from: І  reason: contains not printable characters */
    static final String f11691 = "itemPrice";

    /* renamed from: і  reason: contains not printable characters */
    static final String f11692 = "currency";

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public String m13652() {
        return f11688;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2568 m13650(String str) {
        this.f3661.m14120(f11690, str);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C2568 m13653(String str) {
        this.f3661.m14120(f11689, str);
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C2568 m13654(String str) {
        this.f3661.m14120(f11687, str);
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2568 m13649(BigDecimal bigDecimal) {
        if (!this.f12581.m14018((Object) bigDecimal, f11691)) {
            this.f3661.m14119(f11691, Long.valueOf(m13648(bigDecimal)));
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2568 m13651(Currency currency) {
        if (!this.f12581.m14018((Object) currency, f11692)) {
            this.f3661.m14120(f11692, currency.getCurrencyCode());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public long m13648(BigDecimal bigDecimal) {
        return f11686.multiply(bigDecimal).longValue();
    }
}
