package o;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɩч  reason: contains not printable characters */
public interface C1304 extends IInterface {

    /* renamed from: o.ɩч$if  reason: invalid class name */
    public static abstract class Cif extends C0495 implements C1304 {
        public Cif() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        /* renamed from: o.ɩч$if$ɩ  reason: contains not printable characters */
        public static class C1305 extends C0480 implements C1304 {
            C1305(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Account m8254() {
                Parcel r0 = m4821(2, m4820());
                Account account = (Account) C0476.m4810(r0, Account.CREATOR);
                r0.recycle();
                return account;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C1304 m8252(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C1304) {
                return (C1304) queryLocalInterface;
            }
            return new C1305(iBinder);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m8253(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Account r1 = m8251();
            parcel2.writeNoException();
            C0476.m4811(parcel2, (Parcelable) r1);
            return true;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    Account m8251();
}
