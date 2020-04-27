package o;

import android.os.RemoteException;

/* renamed from: o.ɉј  reason: contains not printable characters */
final class C1054 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6324;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6325;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C1818 f6326;

    C1054(C0848 r1, C2270 r2, C1818 r3) {
        this.f6324 = r1;
        this.f6325 = r2;
        this.f6326 = r3;
    }

    public final void run() {
        try {
            C2082 r2 = this.f6324.f5552;
            if (r2 == null) {
                this.f6324.t_().m11714().m11606("Failed to get app instance id");
                return;
            }
            String r1 = r2.m11056(this.f6325);
            if (r1 != null) {
                this.f6324.m11088().m4342(r1);
                this.f6324.s_().f10791.m12587(r1);
            }
            this.f6324.m6359();
            this.f6324.m15901().m11397(this.f6326, r1);
        } catch (RemoteException e) {
            this.f6324.t_().m11714().m11603("Failed to get app instance id", e);
        } finally {
            this.f6324.m15901().m11397(this.f6326, (String) null);
        }
    }
}
