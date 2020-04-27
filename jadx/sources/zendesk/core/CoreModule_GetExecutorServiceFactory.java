package zendesk.core;

import java.util.concurrent.ExecutorService;
import o.M;

public final class CoreModule_GetExecutorServiceFactory implements M<ExecutorService> {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final ExecutorService get() {
        ExecutorService executorService = this.module.getExecutorService();
        if (executorService != null) {
            return executorService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ExecutorService> create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }
}
