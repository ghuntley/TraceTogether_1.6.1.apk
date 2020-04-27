package o;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C2887;

/* renamed from: o.ІƐ  reason: contains not printable characters */
public final class C2219 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private FirebaseAuth f10497;

    private C2219(FirebaseAuth firebaseAuth) {
        this.f10497 = firebaseAuth;
    }

    /* renamed from: o.ІƐ$ı  reason: contains not printable characters */
    public static abstract class C2220 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static final C2887.Cif f10498 = new C2887.Cif("PhoneAuthProvider", new String[0]);

        /* renamed from: ı  reason: contains not printable characters */
        public abstract void m11666(C2288 r1);

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m11667(String str, C2221 r2) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m11668(C1590 r1);

        /* renamed from: ı  reason: contains not printable characters */
        public void m11665(String str) {
            f10498.m14963("Sms auto retrieval timed-out.", new Object[0]);
        }
    }

    /* renamed from: o.ІƐ$ǃ  reason: contains not printable characters */
    public static class C2221 extends C1519 {
        public static final Parcelable.Creator<C2221> CREATOR = new C1926();

        C2221() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C2221 m11669() {
            return new C2221();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(-45243);
            parcel.writeInt(0);
            C2745.m14531(parcel, parcel.dataPosition());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C2219 m11662() {
        return new C2219(FirebaseAuth.getInstance(FirebaseApp.getInstance()));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2288 m11661(String str, String str2) {
        return new C2288(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11663(String str, long j, TimeUnit timeUnit, Activity activity, C2220 r13) {
        if (!TextUtils.isEmpty(str)) {
            Activity activity2 = activity;
            Executor executor = C0322.f3663;
            if (r13 != null) {
                this.f10497.m1091(str, timeUnit, r13, activity2, executor, false);
                return;
            }
            throw new NullPointerException("null reference");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11664(String str, long j, TimeUnit timeUnit, Activity activity, C2220 r13, C2221 r14) {
        if (!TextUtils.isEmpty(str)) {
            Activity activity2 = activity;
            Executor executor = C0322.f3663;
            if (r13 != null) {
                this.f10497.m1091(str, timeUnit, r13, activity2, executor, r14 != null);
                return;
            }
            throw new NullPointerException("null reference");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
}
