package o;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import java.io.UnsupportedEncodingException;

/* renamed from: o.ȣΙ  reason: contains not printable characters */
public class C0949 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static /* synthetic */ boolean f5940 = (!C0949.class.desiredAssertionStatus());

    /* renamed from: ı  reason: contains not printable characters */
    long f5941 = 600000;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f5942;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C2841<C0367> f5943;

    /* renamed from: ι  reason: contains not printable characters */
    final FirebaseApp f5944;

    C0949(String str, FirebaseApp firebaseApp, C2841<C0367> r5) {
        this.f5942 = str;
        this.f5944 = firebaseApp;
        this.f5943 = r5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0949 m6849(String str) {
        FirebaseApp instance = FirebaseApp.getInstance();
        if (!(instance != null)) {
            throw new IllegalArgumentException("You must call FirebaseApp.initialize() first.");
        } else if (f5940 || instance != null) {
            return m6850(instance, str);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C0949 m6850(FirebaseApp firebaseApp, String str) {
        boolean z = true;
        if (firebaseApp != null) {
            if (str == null) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Null is not a valid value for the Firebase Storage URL.");
            } else if (str.toLowerCase().startsWith("gs://")) {
                try {
                    Uri r4 = C3060.m15612(str);
                    String host = r4 != null ? r4.getHost() : null;
                    if (r4 != null) {
                        if (!TextUtils.isEmpty(r4.getPath())) {
                            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
                        }
                    }
                    if (firebaseApp != null) {
                        C3157 r3 = (C3157) firebaseApp.m1077(C3157.class);
                        if (r3 != null) {
                            return r3.m15968(host);
                        }
                        throw new NullPointerException("Firebase Storage component is not present.");
                    }
                    throw new NullPointerException("Provided FirebaseApp must not be null.");
                } catch (UnsupportedEncodingException unused) {
                    throw new IllegalArgumentException("The storage Uri could not be parsed.");
                }
            } else {
                throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
            }
        } else {
            throw new IllegalArgumentException("Null is not a valid value for the FirebaseApp.");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0950 m6851(String str) {
        boolean z = true;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
                try {
                    Uri r5 = C3060.m15612(str);
                    if (r5 != null) {
                        String str2 = this.f5942;
                        if (!TextUtils.isEmpty(str2)) {
                            if (!r5.getAuthority().equalsIgnoreCase(str2)) {
                                z = false;
                            }
                        }
                        if (z) {
                            return new C0950(r5, this);
                        }
                        throw new IllegalArgumentException("The supplied bucketname does not match the storage bucket of the current instance.");
                    }
                    throw new IllegalArgumentException("The storage Uri could not be parsed.");
                } catch (UnsupportedEncodingException unused) {
                    throw new IllegalArgumentException("The storage Uri could not be parsed.");
                }
            } else {
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        } else {
            throw new IllegalArgumentException("location must not be null or empty");
        }
    }
}
