package o;

import android.net.Uri;
import com.google.firebase.FirebaseApp;

/* renamed from: o.լł  reason: contains not printable characters */
public final class C3093 extends C3052 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Uri f14167;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m15723() {
        return "POST";
    }

    public C3093(Uri uri, FirebaseApp firebaseApp, Uri uri2) {
        super(uri, firebaseApp);
        this.f14167 = uri2;
        super.m15184("X-Goog-Upload-Protocol", "resumable");
        super.m15184("X-Goog-Upload-Command", "cancel");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m15722() {
        return this.f14167;
    }
}
