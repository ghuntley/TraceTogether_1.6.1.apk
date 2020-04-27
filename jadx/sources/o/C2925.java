package o;

import android.net.Uri;
import com.google.firebase.FirebaseApp;

/* renamed from: o.Ә  reason: contains not printable characters */
public final class C2925 extends C3052 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final byte[] f13553;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Uri f13554;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final long f13555;

    /* renamed from: І  reason: contains not printable characters */
    private final int f13556;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final boolean f13557;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m15090() {
        return "POST";
    }

    public C2925(Uri uri, FirebaseApp firebaseApp, Uri uri2, byte[] bArr, long j, int i, boolean z) {
        super(uri, firebaseApp);
        if (bArr == null && i != -1) {
            this.f13650 = new IllegalArgumentException("contentType is null or empty");
        }
        if (j < 0) {
            this.f13650 = new IllegalArgumentException("offset cannot be negative");
        }
        this.f13556 = i;
        this.f13554 = uri2;
        this.f13553 = i <= 0 ? null : bArr;
        this.f13555 = j;
        this.f13557 = z;
        super.m15184("X-Goog-Upload-Protocol", "resumable");
        if (this.f13557 && this.f13556 > 0) {
            super.m15184("X-Goog-Upload-Command", "upload, finalize");
        } else if (this.f13557) {
            super.m15184("X-Goog-Upload-Command", "finalize");
        } else {
            super.m15184("X-Goog-Upload-Command", "upload");
        }
        super.m15184("X-Goog-Upload-Offset", Long.toString(this.f13555));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m15088() {
        return this.f13554;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte[] m15089() {
        return this.f13553;
    }

    /* access modifiers changed from: protected */
    /* renamed from: і  reason: contains not printable characters */
    public final int m15091() {
        int i = this.f13556;
        if (i > 0) {
            return i;
        }
        return 0;
    }
}
