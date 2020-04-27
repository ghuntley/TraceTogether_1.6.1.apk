package o;

import android.app.Activity;
import android.os.Build;
import java.util.Arrays;

/* renamed from: o.kf  reason: case insensitive filesystem */
public final class C3537kf {

    /* renamed from: ı  reason: contains not printable characters */
    final C3546ko f2637;

    /* renamed from: ǃ  reason: contains not printable characters */
    final String f2638;

    /* renamed from: ɩ  reason: contains not printable characters */
    final int f2639;

    /* renamed from: ɹ  reason: contains not printable characters */
    final int f2640;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f2641;

    /* renamed from: ι  reason: contains not printable characters */
    final String f2642;

    /* renamed from: І  reason: contains not printable characters */
    private final String[] f2643;

    /* synthetic */ C3537kf(C3546ko koVar, String[] strArr, int i, String str, String str2, String str3, int i2, byte b) {
        this(koVar, strArr, i, str, str2, str3, i2);
    }

    private C3537kf(C3546ko koVar, String[] strArr, int i, String str, String str2, String str3, int i2) {
        this.f2637 = koVar;
        this.f2643 = (String[]) strArr.clone();
        this.f2639 = i;
        this.f2641 = str;
        this.f2638 = str2;
        this.f2642 = str3;
        this.f2640 = i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String[] m3262() {
        return (String[]) this.f2643.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3537kf kfVar = (C3537kf) obj;
            return Arrays.equals(this.f2643, kfVar.f2643) && this.f2639 == kfVar.f2639;
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2643) * 31) + this.f2639;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequest{mHelper=");
        sb.append(this.f2637);
        sb.append(", mPerms=");
        sb.append(Arrays.toString(this.f2643));
        sb.append(", mRequestCode=");
        sb.append(this.f2639);
        sb.append(", mRationale='");
        sb.append(this.f2641);
        sb.append('\'');
        sb.append(", mPositiveButtonText='");
        sb.append(this.f2638);
        sb.append('\'');
        sb.append(", mNegativeButtonText='");
        sb.append(this.f2642);
        sb.append('\'');
        sb.append(", mTheme=");
        sb.append(this.f2640);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: o.kf$ǃ  reason: contains not printable characters */
    public static final class C0197 {

        /* renamed from: ı  reason: contains not printable characters */
        private final String[] f2644;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f2645;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f2646;

        /* renamed from: Ι  reason: contains not printable characters */
        String f2647;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3546ko f2648;

        /* renamed from: і  reason: contains not printable characters */
        private int f2649 = -1;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private String f2650;

        public C0197(Activity activity, int i, String... strArr) {
            this.f2648 = C3546ko.m3292(activity);
            this.f2646 = i;
            this.f2644 = strArr;
        }

        public C0197(C1277 r3, String... strArr) {
            C3546ko koVar;
            if (Build.VERSION.SDK_INT < 23) {
                koVar = new C3547kp(r3);
            } else {
                koVar = new C3548kq(r3);
            }
            this.f2648 = koVar;
            this.f2646 = 456;
            this.f2644 = strArr;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3537kf m3263() {
            if (this.f2647 == null) {
                this.f2648.m3297();
                this.f2647 = "This app may not work correctly without the requested permissions.";
            }
            if (this.f2645 == null) {
                this.f2645 = this.f2648.m3297().getString(17039370);
            }
            if (this.f2650 == null) {
                this.f2650 = this.f2648.m3297().getString(17039360);
            }
            return new C3537kf(this.f2648, this.f2644, this.f2646, this.f2647, this.f2645, this.f2650, this.f2649, (byte) 0);
        }
    }
}
