package o;

/* renamed from: o.Ӌ  reason: contains not printable characters */
public class C2863 extends C2720<C2863> {

    /* renamed from: ι  reason: contains not printable characters */
    private final String f13328;

    public C2863(String str) {
        if (str != null) {
            this.f13328 = this.f12581.m14017(str);
            return;
        }
        throw new NullPointerException("eventName must not be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public String m14859() {
        return this.f13328;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{eventName:\"");
        sb.append(this.f13328);
        sb.append('\"');
        sb.append(", customAttributes:");
        sb.append(this.f12580);
        sb.append("}");
        return sb.toString();
    }
}
