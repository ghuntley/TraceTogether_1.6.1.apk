package o;

/* renamed from: o.ʙΙ  reason: contains not printable characters */
final class C1668 extends C1872 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f8679;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f8680;

    C1668(String str, String str2) {
        if (str != null) {
            this.f8680 = str;
            if (str2 != null) {
                this.f8679 = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m9530() {
        return this.f8680;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m9531() {
        return this.f8679;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f8680);
        sb.append(", version=");
        sb.append(this.f8679);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1872) {
            C1872 r5 = (C1872) obj;
            return this.f8680.equals(r5.m10258()) && this.f8679.equals(r5.m10259());
        }
    }

    public final int hashCode() {
        return ((this.f8680.hashCode() ^ 1000003) * 1000003) ^ this.f8679.hashCode();
    }
}
