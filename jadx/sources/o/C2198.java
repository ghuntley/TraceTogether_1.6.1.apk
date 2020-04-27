package o;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u000fB\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\b\u001a\u00020\f¢\u0006\u0004\b\b\u0010\rJ\r\u0010\u0002\u001a\u00020\f¢\u0006\u0004\b\u0002\u0010\rJ\r\u0010\n\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rJ\r\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/ϵ;", "", "Ι", "Z", "ɩ", "ι", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "ı", "Ljava/util/Queue;", "ǃ", "()Z", "", "()V", "<init>", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ϵ  reason: contains not printable characters */
public final class C2198 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Queue<Runnable> f10442 = new ArrayDeque();

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f10443;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f10444;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f10445 = true;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11600() {
        this.f10445 = true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11602() {
        if (this.f10445) {
            if (!this.f10444) {
                this.f10445 = false;
                m11599();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11601() {
        this.f10444 = true;
        m11599();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11599() {
        if (!this.f10443) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.f10442.isEmpty() ^ z)) {
                        break;
                    } else if (!m11598()) {
                        break;
                    } else {
                        Runnable poll = this.f10442.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f10443 = z;
            } finally {
                this.f10443 = z;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m11598() {
        return this.f10444 || !this.f10445;
    }
}
