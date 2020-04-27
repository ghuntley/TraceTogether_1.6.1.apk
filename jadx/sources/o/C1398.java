package o;

import com.google.android.gms.common.api.Status;

/* renamed from: o.ɪя  reason: contains not printable characters */
public final class C1398 extends C1590 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private Throwable f7656;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m8575(int i) {
        if (i == -13040) {
            return "The operation was cancelled.";
        }
        if (i == -13000) {
            return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
        if (i == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    C1398(int i, Throwable th) {
        super(m8575(i));
        this.f7656 = th;
        m8575(i);
        Throwable th2 = this.f7656;
        if (th2 != null) {
            th2.getMessage();
        }
    }

    public final synchronized Throwable getCause() {
        if (this.f7656 == this) {
            return null;
        }
        return this.f7656;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1398 m8574(Status status) {
        int i;
        if (status != null) {
            boolean z = false;
            if (!(status.f536 <= 0)) {
                if (status.f536 == 16) {
                    z = true;
                }
                if (z) {
                    i = -13040;
                } else {
                    i = status.equals(Status.f534) ? -13030 : -13000;
                }
                return new C1398(i, (Throwable) null);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException("null reference");
    }
}
