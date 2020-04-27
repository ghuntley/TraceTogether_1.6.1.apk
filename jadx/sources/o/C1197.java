package o;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import o.C1304;

/* renamed from: o.ɨł  reason: contains not printable characters */
public final class C1197 extends C1304.Cif {
    /* renamed from: ι  reason: contains not printable characters */
    public static Account m7808(C1304 r2) {
        if (r2 != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return r2.m8251();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Account m7809() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
