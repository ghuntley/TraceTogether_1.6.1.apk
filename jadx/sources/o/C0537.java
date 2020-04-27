package o;

/* renamed from: o.łɍ  reason: contains not printable characters */
final class C0537 extends C0529 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final char f4370 = '.';

    C0537(char c) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5104(char c) {
        return c == this.f4370;
    }

    public final String toString() {
        String r0 = C0579.m5199(this.f4370);
        StringBuilder sb = new StringBuilder(String.valueOf(r0).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(r0);
        sb.append("')");
        return sb.toString();
    }
}
