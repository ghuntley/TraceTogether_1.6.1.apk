package o;

import android.os.Bundle;

/* renamed from: o.ɪҹ  reason: contains not printable characters */
public abstract class C1404<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f7667;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3203<T> f7668 = new C3203<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public final Bundle f7669;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f7670;

    C1404(int i, int i2, Bundle bundle) {
        this.f7667 = i;
        this.f7670 = i2;
        this.f7669 = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m8581(Bundle bundle);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m8582();

    public String toString() {
        int i = this.f7670;
        int i2 = this.f7667;
        boolean r2 = m8582();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(r2);
        sb.append("}");
        return sb.toString();
    }
}
