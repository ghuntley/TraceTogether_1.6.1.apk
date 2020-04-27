package o;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o.C0506;
import o.C3024;

/* renamed from: o.Ƚı  reason: contains not printable characters */
public final class C0984<ResultT> extends C0680 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0539 f6009;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3203<ResultT> f6010;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0661<C3024.C3028, ResultT> f6011;

    public C0984(int i, C0661<C3024.C3028, ResultT> r2, C3203<ResultT> r3, C0539 r4) {
        super(i);
        this.f6010 = r3;
        this.f6011 = r2;
        this.f6009 = r4;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6964(C0506.C0507<?> r3) {
        try {
            this.f6011.m5487(r3.m4941(), this.f6010);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            m6035(C0758.m6031(e2));
        } catch (RuntimeException e3) {
            m6033(e3);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6965(Status status) {
        this.f6010.m16151(this.f6009.m5106(status));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6962(RuntimeException runtimeException) {
        this.f6010.m16151((Exception) runtimeException);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6966(C1082 r2, boolean z) {
        r2.m7438(this.f6010, z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2847[] m6967(C0506.C0507<?> r1) {
        return this.f6011.m5488();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m6963(C0506.C0507<?> r1) {
        return this.f6011.m5489();
    }
}
