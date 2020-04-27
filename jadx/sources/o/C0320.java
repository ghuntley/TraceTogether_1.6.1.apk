package o;

import java.util.Map;
import o.C0320;

/* renamed from: o.ıɉ  reason: contains not printable characters */
public abstract class C0320<T extends C0320> extends C2720<T> {

    /* renamed from: ɾ  reason: contains not printable characters */
    final C2662 f3661 = new C2662(this.f12581);

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m4388();

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public Map<String, Object> m4387() {
        return this.f3661.f12247;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{type:\"");
        sb.append(m4388());
        sb.append('\"');
        sb.append(", predefinedAttributes:");
        sb.append(this.f3661);
        sb.append(", customAttributes:");
        sb.append(this.f12580);
        sb.append("}");
        return sb.toString();
    }
}
