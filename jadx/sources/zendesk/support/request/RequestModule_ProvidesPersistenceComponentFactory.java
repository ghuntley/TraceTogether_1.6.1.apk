package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.ComponentPersistence;

public final class RequestModule_ProvidesPersistenceComponentFactory implements M<ComponentPersistence> {
    private final C3351dc<ExecutorService> executorServiceProvider;
    private final C3351dc<ComponentPersistence.PersistenceQueue> queueProvider;
    private final C3351dc<SupportUiStorage> supportUiStorageProvider;

    public RequestModule_ProvidesPersistenceComponentFactory(C3351dc<SupportUiStorage> dcVar, C3351dc<ComponentPersistence.PersistenceQueue> dcVar2, C3351dc<ExecutorService> dcVar3) {
        this.supportUiStorageProvider = dcVar;
        this.queueProvider = dcVar2;
        this.executorServiceProvider = dcVar3;
    }

    public final ComponentPersistence get() {
        ComponentPersistence providesPersistenceComponent = RequestModule.providesPersistenceComponent(this.supportUiStorageProvider.get(), this.queueProvider.get(), this.executorServiceProvider.get());
        if (providesPersistenceComponent != null) {
            return providesPersistenceComponent;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ComponentPersistence> create(C3351dc<SupportUiStorage> dcVar, C3351dc<ComponentPersistence.PersistenceQueue> dcVar2, C3351dc<ExecutorService> dcVar3) {
        return new RequestModule_ProvidesPersistenceComponentFactory(dcVar, dcVar2, dcVar3);
    }
}
