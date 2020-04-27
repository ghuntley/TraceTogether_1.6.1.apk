package zendesk.support.request;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.C3602mo;
import o.M;
import zendesk.core.AuthenticationProvider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;

public final class RequestModule_ProvidesActionFactoryFactory implements M<ActionFactory> {
    private final C3351dc<AuthenticationProvider> authProvider;
    private final C3351dc<C3602mo> belvedereProvider;
    private final C3351dc<SupportBlipsProvider> blipsProvider;
    private final C3351dc<ExecutorService> executorProvider;
    private final C3351dc<Executor> mainThreadExecutorProvider;
    private final C3351dc<RequestProvider> requestProvider;
    private final C3351dc<SupportSettingsProvider> settingsProvider;
    private final C3351dc<SupportUiStorage> supportUiStorageProvider;
    private final C3351dc<UploadProvider> uploadProvider;

    public RequestModule_ProvidesActionFactoryFactory(C3351dc<RequestProvider> dcVar, C3351dc<SupportSettingsProvider> dcVar2, C3351dc<UploadProvider> dcVar3, C3351dc<C3602mo> dcVar4, C3351dc<SupportUiStorage> dcVar5, C3351dc<ExecutorService> dcVar6, C3351dc<Executor> dcVar7, C3351dc<AuthenticationProvider> dcVar8, C3351dc<SupportBlipsProvider> dcVar9) {
        this.requestProvider = dcVar;
        this.settingsProvider = dcVar2;
        this.uploadProvider = dcVar3;
        this.belvedereProvider = dcVar4;
        this.supportUiStorageProvider = dcVar5;
        this.executorProvider = dcVar6;
        this.mainThreadExecutorProvider = dcVar7;
        this.authProvider = dcVar8;
        this.blipsProvider = dcVar9;
    }

    public final ActionFactory get() {
        ActionFactory providesActionFactory = RequestModule.providesActionFactory(this.requestProvider.get(), this.settingsProvider.get(), this.uploadProvider.get(), this.belvedereProvider.get(), this.supportUiStorageProvider.get(), this.executorProvider.get(), this.mainThreadExecutorProvider.get(), this.authProvider.get(), this.blipsProvider.get());
        if (providesActionFactory != null) {
            return providesActionFactory;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ActionFactory> create(C3351dc<RequestProvider> dcVar, C3351dc<SupportSettingsProvider> dcVar2, C3351dc<UploadProvider> dcVar3, C3351dc<C3602mo> dcVar4, C3351dc<SupportUiStorage> dcVar5, C3351dc<ExecutorService> dcVar6, C3351dc<Executor> dcVar7, C3351dc<AuthenticationProvider> dcVar8, C3351dc<SupportBlipsProvider> dcVar9) {
        return new RequestModule_ProvidesActionFactoryFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7, dcVar8, dcVar9);
    }
}
