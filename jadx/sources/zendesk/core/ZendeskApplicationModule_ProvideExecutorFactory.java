package zendesk.core;

import java.util.concurrent.ExecutorService;
import o.M;

public final class ZendeskApplicationModule_ProvideExecutorFactory implements M<ExecutorService> {
    private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

    public final ExecutorService get() {
        ExecutorService provideExecutor = ZendeskApplicationModule.provideExecutor();
        if (provideExecutor != null) {
            return provideExecutor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ExecutorService> create() {
        return INSTANCE;
    }
}
