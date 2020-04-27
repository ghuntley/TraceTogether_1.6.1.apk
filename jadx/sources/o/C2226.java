package o;

import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceId;
import o.X;

/* renamed from: o.ІƩ  reason: contains not printable characters */
public class C2226 implements Parcelable {
    public static final Parcelable.Creator<C2226> CREATOR = new C2733();

    /* renamed from: ǃ  reason: contains not printable characters */
    public Messenger f10509;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2855 f10510;

    /* renamed from: o.ІƩ$ǃ  reason: contains not printable characters */
    public static final class C2227 extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m1108();
            return C2226.class;
        }
    }

    public C2226(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10509 = new Messenger(iBinder);
        } else {
            this.f10510 = new X.C0105(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f10509;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f10510.asBinder());
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            C2226 r4 = (C2226) obj;
            return (this.f10509 != null ? this.f10509.getBinder() : this.f10510.asBinder()).equals(r4.f10509 != null ? r4.f10509.getBinder() : r4.f10510.asBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        Messenger messenger = this.f10509;
        return (messenger != null ? messenger.getBinder() : this.f10510.asBinder()).hashCode();
    }
}
