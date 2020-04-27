package o;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: o.ƪ  reason: contains not printable characters */
public final class C0778 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final JobInfoSchedulerService f5185;

    /* renamed from: ι  reason: contains not printable characters */
    private final JobParameters f5186;

    /* renamed from: o.ƪ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f5187 = 1;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f5188 = 0;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f5189 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int[] f5190 = {R.attr.f154342130969252};

        /* renamed from: ι  reason: contains not printable characters */
        public static final int[] f5191 = {16842753, 16842960};
    }

    public C0778(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5185 = jobInfoSchedulerService;
        this.f5186 = jobParameters;
    }

    public final void run() {
        this.f5185.jobFinished(this.f5186, false);
    }
}
