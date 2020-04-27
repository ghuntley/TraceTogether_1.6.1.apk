package o;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import o.lR;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u00002\u00020\u0019B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0016J\r\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\bR\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/lQ;", "Ljava/lang/ref/WeakReference;", "Lo/lR;", "Ι", "Ljava/lang/ref/WeakReference;", "ı", "", "ǃ", "()V", "Landroid/os/Message;", "p0", "handleMessage", "(Landroid/os/Message;)V", "", "ι", "()Z", "ɩ", "", "(J)V", "Lo/lR$if;", "(Lo/lR$if;)V", "p1", "(Lo/lR$if;J)V", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Landroid/os/Handler;"}, k = 1, mv = {1, 1, 16})
public final class lQ extends Handler {

    /* renamed from: Ι  reason: contains not printable characters */
    public final WeakReference<lR> f2760;

    public lQ(WeakReference<lR> weakReference) {
        fM.m2254(weakReference, "");
        this.f2760 = weakReference;
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            int i = message.what;
            lR lRVar = (lR) this.f2760.get();
            if (lRVar != null) {
                lRVar.m3478(lR.Cif.If.m3500(i));
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3416(lR.Cif ifVar, long j) {
        fM.m2254(ifVar, "");
        sendMessageDelayed(Message.obtain(this, ifVar.m3499()), j);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3412(lR.Cif ifVar) {
        fM.m2254(ifVar, "");
        Message obtainMessage = obtainMessage(ifVar.m3499());
        obtainMessage.arg1 = ifVar.m3499();
        sendMessage(obtainMessage);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3409() {
        m3412(lR.Cif.ACTION_START);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3415(long j) {
        m3414();
        m3416(lR.Cif.ACTION_SCAN, j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3414() {
        removeMessages(lR.Cif.ACTION_SCAN.m3499());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m3413() {
        return hasMessages(lR.Cif.ACTION_SCAN.m3499());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3411(long j) {
        m3410();
        m3416(lR.Cif.ACTION_ADVERTISE, j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3410() {
        removeMessages(lR.Cif.ACTION_ADVERTISE.m3499());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m3417() {
        return hasMessages(lR.Cif.ACTION_ADVERTISE.m3499());
    }
}
