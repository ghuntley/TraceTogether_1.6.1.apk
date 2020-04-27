package zendesk.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements M<CoreModule> {
    private final C3351dc<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final C3351dc<AuthenticationProvider> authenticationProvider;
    private final C3351dc<BlipsProvider> blipsProvider;
    private final C3351dc<Context> contextProvider;
    private final C3351dc<ExecutorService> executorProvider;
    private final C3351dc<MemoryCache> memoryCacheProvider;
    private final C3351dc<NetworkInfoProvider> networkInfoProvider;
    private final C3351dc<PushRegistrationProvider> pushRegistrationProvider;
    private final C3351dc<RestServiceProvider> restServiceProvider;
    private final C3351dc<SessionStorage> sessionStorageProvider;
    private final C3351dc<SettingsProvider> settingsProvider;
    private final C3351dc<ApplicationConfiguration> zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(C3351dc<SettingsProvider> dcVar, C3351dc<RestServiceProvider> dcVar2, C3351dc<BlipsProvider> dcVar3, C3351dc<SessionStorage> dcVar4, C3351dc<NetworkInfoProvider> dcVar5, C3351dc<MemoryCache> dcVar6, C3351dc<ActionHandlerRegistry> dcVar7, C3351dc<ExecutorService> dcVar8, C3351dc<Context> dcVar9, C3351dc<AuthenticationProvider> dcVar10, C3351dc<ApplicationConfiguration> dcVar11, C3351dc<PushRegistrationProvider> dcVar12) {
        this.settingsProvider = dcVar;
        this.restServiceProvider = dcVar2;
        this.blipsProvider = dcVar3;
        this.sessionStorageProvider = dcVar4;
        this.networkInfoProvider = dcVar5;
        this.memoryCacheProvider = dcVar6;
        this.actionHandlerRegistryProvider = dcVar7;
        this.executorProvider = dcVar8;
        this.contextProvider = dcVar9;
        this.authenticationProvider = dcVar10;
        this.zendeskConfigurationProvider = dcVar11;
        this.pushRegistrationProvider = dcVar12;
    }

    public final CoreModule get() {
        CoreModule provideCoreSdkModule = ZendeskProvidersModule.provideCoreSdkModule(this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.sessionStorageProvider.get(), this.networkInfoProvider.get(), this.memoryCacheProvider.get(), this.actionHandlerRegistryProvider.get(), this.executorProvider.get(), this.contextProvider.get(), this.authenticationProvider.get(), this.zendeskConfigurationProvider.get(), this.pushRegistrationProvider.get());
        if (provideCoreSdkModule != null) {
            return provideCoreSdkModule;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<CoreModule> create(C3351dc<SettingsProvider> dcVar, C3351dc<RestServiceProvider> dcVar2, C3351dc<BlipsProvider> dcVar3, C3351dc<SessionStorage> dcVar4, C3351dc<NetworkInfoProvider> dcVar5, C3351dc<MemoryCache> dcVar6, C3351dc<ActionHandlerRegistry> dcVar7, C3351dc<ExecutorService> dcVar8, C3351dc<Context> dcVar9, C3351dc<AuthenticationProvider> dcVar10, C3351dc<ApplicationConfiguration> dcVar11, C3351dc<PushRegistrationProvider> dcVar12) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7, dcVar8, dcVar9, dcVar10, dcVar11, dcVar12);
    }
}
