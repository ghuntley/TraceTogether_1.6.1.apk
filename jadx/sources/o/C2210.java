package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import o.C3260aUx;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o.І  reason: contains not printable characters */
public class C2210 implements Parcelable {
    public static final Parcelable.Creator<C2210> CREATOR = new Parcelable.Creator<C2210>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C2210[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C2210(parcel);
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    C3260aUx f10468;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Handler f10469;

    /* renamed from: Ι  reason: contains not printable characters */
    final boolean f10470 = false;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m11649(int i, Bundle bundle) {
    }

    /* renamed from: o.І$ı  reason: contains not printable characters */
    class C2211 implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        final Bundle f10472;

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f10473;

        C2211(int i, Bundle bundle) {
            this.f10473 = i;
            this.f10472 = bundle;
        }

        public final void run() {
            C2210.this.m11649(this.f10473, this.f10472);
        }
    }

    /* renamed from: o.І$If */
    class If extends C3260aUx.C0115 {
        If() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m11650(int i, Bundle bundle) {
            if (C2210.this.f10469 != null) {
                C2210.this.f10469.post(new C2211(i, bundle));
            } else {
                C2210.this.m11649(i, bundle);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f10468 == null) {
                this.f10468 = new If();
            }
            parcel.writeStrongBinder(this.f10468.asBinder());
        }
    }

    C2210(Parcel parcel) {
        C3260aUx aux = null;
        this.f10469 = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3260aUx)) {
                aux = new C3260aUx.C0115.C0116(readStrongBinder);
            } else {
                aux = (C3260aUx) queryLocalInterface;
            }
        }
        this.f10468 = aux;
    }
}
