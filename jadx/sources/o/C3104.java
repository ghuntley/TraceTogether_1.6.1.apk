package o;

import android.net.Uri;
import com.google.firebase.FirebaseApp;

/* renamed from: o.լɟ  reason: contains not printable characters */
public final class C3104 extends C3052 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Uri f14201;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m15743() {
        return "POST";
    }

    public C3104(Uri uri, FirebaseApp firebaseApp, Uri uri2) {
        super(uri, firebaseApp);
        this.f14201 = uri2;
        super.m15184("X-Goog-Upload-Protocol", "resumable");
        super.m15184("X-Goog-Upload-Command", "query");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m15742() {
        return this.f14201;
    }
}
