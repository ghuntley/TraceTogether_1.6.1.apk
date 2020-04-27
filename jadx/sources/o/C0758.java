package o;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import o.C0506;

/* renamed from: o.ƛ  reason: contains not printable characters */
public abstract class C0758 {

    /* renamed from: ι  reason: contains not printable characters */
    private final int f5108;

    public C0758(int i) {
        this.f5108 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m6033(RuntimeException runtimeException);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m6034(C0506.C0507<?> r1);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m6035(Status status);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m6036(C1082 r1, boolean z);

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static Status m6031(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C2134.m11306() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
