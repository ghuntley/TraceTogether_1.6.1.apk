package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import zendesk.support.request.ComponentPersistence;

public final class RequestModule_ProvidesDiskQueueFactory implements M<ComponentPersistence.PersistenceQueue> {
    private final C3351dc<ExecutorService> executorServiceProvider;

    public RequestModule_ProvidesDiskQueueFactory(C3351dc<ExecutorService> dcVar) {
        this.executorServiceProvider = dcVar;
    }

    public final ComponentPersistence.PersistenceQueue get() {
        ComponentPersistence.PersistenceQueue providesDiskQueue = RequestModule.providesDiskQueue(this.executorServiceProvider.get());
        if (providesDiskQueue != null) {
            return providesDiskQueue;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ComponentPersistence.PersistenceQueue> create(C3351dc<ExecutorService> dcVar) {
        return new RequestModule_ProvidesDiskQueueFactory(dcVar);
    }
}
