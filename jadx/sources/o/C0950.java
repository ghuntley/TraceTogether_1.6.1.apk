package o;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: o.ȣІ  reason: contains not printable characters */
public final class C0950 implements Comparable<C0950> {

    /* renamed from: ǃ  reason: contains not printable characters */
    final C0949 f5945;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Uri f5946;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5946.compareTo(((C0950) obj).f5946);
    }

    C0950(Uri uri, C0949 r5) {
        boolean z = true;
        if (uri != null) {
            if (r5 == null ? false : z) {
                this.f5946 = uri;
                this.f5945 = r5;
                return;
            }
            throw new IllegalArgumentException("FirebaseApp cannot be null");
        }
        throw new IllegalArgumentException("storageUri cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0950 m6853(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C0950(this.f5946.buildUpon().appendEncodedPath(C2864.m14861(C2864.m14860(str))).build(), this.f5945);
        }
        throw new IllegalArgumentException("childName cannot be null or empty");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2424 m6852(Uri uri) {
        if (uri != null) {
            C2424 r2 = new C2424(this, uri);
            if (r2.m7053(new int[]{2})) {
                r2.m7060();
            }
            return r2;
        }
        throw new IllegalArgumentException("uri cannot be null");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        sb.append(this.f5946.getAuthority());
        sb.append(this.f5946.getEncodedPath());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0950)) {
            return false;
        }
        return ((C0950) obj).toString().equals(toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}
