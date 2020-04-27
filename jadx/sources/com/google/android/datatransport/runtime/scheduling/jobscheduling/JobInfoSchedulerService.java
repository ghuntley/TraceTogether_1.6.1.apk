package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import o.C0778;
import o.C0818;
import o.C2243;
import o.C2291;
import o.C2302;
import o.C2498;
import o.C2745;

public class JobInfoSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C2243.m11696(getApplicationContext());
        C2291.C2292 r0 = C2291.m11958().m11963(string).m11964(C2745.C3657iF.m14549(i));
        if (string2 != null) {
            r0.m11965(Base64.decode(string2, 0));
        }
        C2302 r1 = C2243.f10531;
        if (r1 != null) {
            C2498 r12 = r1.m11989().f10532;
            r12.f11312.execute(new C0818(r12, r0.m11962(), i2, new C0778(this, jobParameters)));
            return true;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
