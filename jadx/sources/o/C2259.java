package o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Іɾ  reason: contains not printable characters */
public final class C2259 {

    /* renamed from: ı  reason: contains not printable characters */
    final ArrayList<C1976> f10583 = new ArrayList<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public View f10584;

    /* renamed from: ι  reason: contains not printable characters */
    public final Map<String, Object> f10585 = new HashMap();

    @Deprecated
    public C2259() {
    }

    public C2259(View view) {
        this.f10584 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2259)) {
            return false;
        }
        C2259 r3 = (C2259) obj;
        return this.f10584 == r3.f10584 && this.f10585.equals(r3.f10585);
    }

    public final int hashCode() {
        return (this.f10584.hashCode() * 31) + this.f10585.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.f10584);
        sb2.append("\n");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        String obj3 = sb3.toString();
        for (String next : this.f10585.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(next);
            sb4.append(": ");
            sb4.append(this.f10585.get(next));
            sb4.append("\n");
            obj3 = sb4.toString();
        }
        return obj3;
    }
}
