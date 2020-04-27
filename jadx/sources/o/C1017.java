package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o.C0506;

/* renamed from: o.ɂɩ  reason: contains not printable characters */
abstract class C1017<T> extends C0680 {

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final C3203<T> f6217;

    public C1017(int i, C3203<T> r2) {
        super(i);
        this.f6217 = r2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m7250(C0506.C0507<?> r1);

    /* renamed from: ι  reason: contains not printable characters */
    public void m7253(C1082 r1, boolean z) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7252(Status status) {
        this.f6217.m16151((Exception) new C2929(status));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m7249(RuntimeException runtimeException) {
        this.f6217.m16151((Exception) runtimeException);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7251(C0506.C0507<?> r2) {
        try {
            m7250(r2);
        } catch (DeadObjectException e) {
            m6035(C0758.m6031(e));
            throw e;
        } catch (RemoteException e2) {
            m6035(C0758.m6031(e2));
        } catch (RuntimeException e3) {
            m6033(e3);
        }
    }
}
