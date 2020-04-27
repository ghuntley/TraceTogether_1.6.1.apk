package zendesk.support;

import java.util.concurrent.Executor;
import o.M;

public final class SupportSdkModule_MainThreadExecutorFactory implements M<Executor> {
    private final SupportSdkModule module;

    public SupportSdkModule_MainThreadExecutorFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public final Executor get() {
        Executor mainThreadExecutor = this.module.mainThreadExecutor();
        if (mainThreadExecutor != null) {
            return mainThreadExecutor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Executor> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_MainThreadExecutorFactory(supportSdkModule);
    }
}
