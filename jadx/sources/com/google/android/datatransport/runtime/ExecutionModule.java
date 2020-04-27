package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o.C3356di;

public abstract class ExecutionModule {
    ExecutionModule() {
    }

    @C3356di
    /* renamed from: ι  reason: contains not printable characters */
    public static Executor m732() {
        return Executors.newSingleThreadExecutor();
    }
}
