package o;

import android.app.job.JobParameters;

/* renamed from: o.ʭΙ  reason: contains not printable characters */
final /* synthetic */ class C1714 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2244 f8900;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1437 f8901;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final JobParameters f8902;

    C1714(C1437 r1, C2244 r2, JobParameters jobParameters) {
        this.f8901 = r1;
        this.f8900 = r2;
        this.f8902 = jobParameters;
    }

    public final void run() {
        this.f8901.m8692(this.f8900, this.f8902);
    }
}
