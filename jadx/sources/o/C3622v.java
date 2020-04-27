package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: o.v  reason: case insensitive filesystem */
final class C3622v {

    /* renamed from: ı  reason: contains not printable characters */
    long f3501;

    /* renamed from: Ɩ  reason: contains not printable characters */
    long f3502;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C3259a f3503;

    /* renamed from: ȷ  reason: contains not printable characters */
    private HandlerThread f3504 = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: ɨ  reason: contains not printable characters */
    int f3505;

    /* renamed from: ɩ  reason: contains not printable characters */
    long f3506;

    /* renamed from: ɪ  reason: contains not printable characters */
    int f3507;

    /* renamed from: ɹ  reason: contains not printable characters */
    long f3508;

    /* renamed from: ɾ  reason: contains not printable characters */
    int f3509;

    /* renamed from: Ι  reason: contains not printable characters */
    final Handler f3510;

    /* renamed from: ι  reason: contains not printable characters */
    long f3511;

    /* renamed from: І  reason: contains not printable characters */
    long f3512;

    /* renamed from: і  reason: contains not printable characters */
    long f3513;

    /* renamed from: Ӏ  reason: contains not printable characters */
    long f3514;

    C3622v(C3259a aVar) {
        this.f3503 = aVar;
        this.f3504.start();
        C3626z.m4087(this.f3504.getLooper());
        this.f3510 = new C0276(this.f3504.getLooper(), this);
    }

    /* renamed from: o.v$ɩ  reason: contains not printable characters */
    static class C0276 extends Handler {

        /* renamed from: ι  reason: contains not printable characters */
        private final C3622v f3515;

        public C0276(Looper looper, C3622v vVar) {
            super(looper);
            this.f3515 = vVar;
        }

        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.f3515.f3506++;
            } else if (i == 1) {
                this.f3515.f3501++;
            } else if (i == 2) {
                C3622v vVar = this.f3515;
                long j = (long) message.arg1;
                vVar.f3509++;
                vVar.f3508 += j;
                vVar.f3502 = vVar.f3508 / ((long) vVar.f3509);
            } else if (i == 3) {
                C3622v vVar2 = this.f3515;
                long j2 = (long) message.arg1;
                vVar2.f3507++;
                vVar2.f3512 += j2;
                vVar2.f3513 = vVar2.f3512 / ((long) vVar2.f3509);
            } else if (i != 4) {
                C3616p.f3442.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Unhandled stats message.");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
            } else {
                C3622v vVar3 = this.f3515;
                vVar3.f3505++;
                vVar3.f3511 += ((Long) message.obj).longValue();
                vVar3.f3514 = vVar3.f3511 / ((long) vVar3.f3505);
            }
        }
    }
}
