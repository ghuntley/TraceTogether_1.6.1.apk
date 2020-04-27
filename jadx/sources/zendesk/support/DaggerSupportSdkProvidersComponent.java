package zendesk.support;

import android.content.Context;
import java.util.Locale;
import o.C3351dc;
import o.N;
import o.R;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.MemoryCache;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;

public final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private CoreModule coreModule;
    private C3351dc<Context> getApplicationContextProvider;
    private C3351dc<AuthenticationProvider> getAuthenticationProvider;
    private C3351dc<BlipsProvider> getBlipsProvider;
    private C3351dc<MemoryCache> getMemoryCacheProvider;
    private C3351dc<RestServiceProvider> getRestServiceProvider;
    private C3351dc<SessionStorage> getSessionStorageProvider;
    private C3351dc<SettingsProvider> getSettingsProvider;
    private C3351dc<ArticleVoteStorage> provideArticleVoteStorageProvider;
    private C3351dc<HelpCenterCachingNetworkConfig> provideCustomNetworkConfigProvider;
    private C3351dc<HelpCenterCachingInterceptor> provideHelpCenterCachingInterceptorProvider;
    private C3351dc<HelpCenterLocaleConverter> provideHelpCenterLocaleConverterProvider;
    private C3351dc<HelpCenterProvider> provideHelpCenterProvider;
    private C3351dc<HelpCenterSessionCache> provideHelpCenterSessionCacheProvider;
    private C3351dc<Locale> provideLocaleProvider;
    private C3351dc<SupportSdkMetadata> provideMetadataProvider;
    private C3351dc<ProviderStore> provideProviderStoreProvider;
    private C3351dc<RequestMigrator> provideRequestMigratorProvider;
    private C3351dc<RequestProvider> provideRequestProvider;
    private C3351dc<RequestSessionCache> provideRequestSessionCacheProvider;
    private C3351dc<RequestStorage> provideRequestStorageProvider;
    private C3351dc<SupportSettingsProvider> provideSdkSettingsProvider;
    private C3351dc<SupportBlipsProvider> provideSupportBlipsProvider;
    private C3351dc<SupportModule> provideSupportModuleProvider;
    private C3351dc<UploadProvider> provideUploadProvider;
    private C3351dc<ZendeskHelpCenterService> provideZendeskHelpCenterServiceProvider;
    private C3351dc<ZendeskRequestService> provideZendeskRequestServiceProvider;
    private C3351dc<ZendeskUploadService> provideZendeskUploadServiceProvider;
    private C3351dc<HelpCenterService> providesHelpCenterServiceProvider;
    private C3351dc<RequestService> providesRequestServiceProvider;
    private C3351dc<UploadService> providesUploadServiceProvider;
    private C3351dc<ZendeskTracker> providesZendeskTrackerProvider;

    private DaggerSupportSdkProvidersComponent(Builder builder) {
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(builder.coreModule);
        this.provideLocaleProvider = N.m1391(SupportApplicationModule_ProvideLocaleFactory.create(builder.supportApplicationModule));
        this.provideHelpCenterLocaleConverterProvider = N.m1391(ProviderModule_ProvideHelpCenterLocaleConverterFactory.create(builder.providerModule));
        this.provideSdkSettingsProvider = N.m1391(ProviderModule_ProvideSdkSettingsProviderFactory.create(builder.providerModule, this.getSettingsProvider, this.provideLocaleProvider, this.provideHelpCenterLocaleConverterProvider));
        this.getBlipsProvider = CoreModule_GetBlipsProviderFactory.create(builder.coreModule);
        this.provideSupportBlipsProvider = N.m1391(ProviderModule_ProvideSupportBlipsProviderFactory.create(builder.providerModule, this.getBlipsProvider, this.provideLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(builder.coreModule);
        this.provideHelpCenterCachingInterceptorProvider = R.m1413(ServiceModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideCustomNetworkConfigProvider = R.m1413(ServiceModule_ProvideCustomNetworkConfigFactory.create(this.provideHelpCenterCachingInterceptorProvider));
        this.providesHelpCenterServiceProvider = N.m1391(ServiceModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, this.provideCustomNetworkConfigProvider));
        this.provideZendeskHelpCenterServiceProvider = N.m1391(ServiceModule_ProvideZendeskHelpCenterServiceFactory.create(this.providesHelpCenterServiceProvider, this.provideHelpCenterLocaleConverterProvider));
        this.provideHelpCenterSessionCacheProvider = N.m1391(StorageModule_ProvideHelpCenterSessionCacheFactory.create(builder.storageModule));
        this.providesZendeskTrackerProvider = N.m1391(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(builder.supportApplicationModule));
        this.provideHelpCenterProvider = N.m1391(ProviderModule_ProvideHelpCenterProviderFactory.create(builder.providerModule, this.provideSdkSettingsProvider, this.provideSupportBlipsProvider, this.provideZendeskHelpCenterServiceProvider, this.provideHelpCenterSessionCacheProvider, this.providesZendeskTrackerProvider));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(builder.coreModule);
        this.providesRequestServiceProvider = N.m1391(ServiceModule_ProvidesRequestServiceFactory.create(this.getRestServiceProvider));
        this.provideZendeskRequestServiceProvider = N.m1391(ServiceModule_ProvideZendeskRequestServiceFactory.create(this.providesRequestServiceProvider));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(builder.coreModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(builder.coreModule);
        this.provideRequestMigratorProvider = N.m1391(StorageModule_ProvideRequestMigratorFactory.create(builder.storageModule, this.getApplicationContextProvider));
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(builder.coreModule);
        this.provideRequestStorageProvider = N.m1391(StorageModule_ProvideRequestStorageFactory.create(builder.storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, this.getMemoryCacheProvider));
        this.provideRequestSessionCacheProvider = N.m1391(StorageModule_ProvideRequestSessionCacheFactory.create(builder.storageModule));
        this.provideMetadataProvider = N.m1391(SupportApplicationModule_ProvideMetadataFactory.create(builder.supportApplicationModule, this.getApplicationContextProvider));
        this.provideRequestProvider = N.m1391(ProviderModule_ProvideRequestProviderFactory.create(builder.providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, this.provideSupportBlipsProvider));
        this.providesUploadServiceProvider = N.m1391(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.provideZendeskUploadServiceProvider = N.m1391(ServiceModule_ProvideZendeskUploadServiceFactory.create(this.providesUploadServiceProvider));
        this.provideUploadProvider = N.m1391(ProviderModule_ProvideUploadProviderFactory.create(builder.providerModule, this.provideZendeskUploadServiceProvider));
        this.provideProviderStoreProvider = N.m1391(ProviderModule_ProvideProviderStoreFactory.create(builder.providerModule, this.provideHelpCenterProvider, this.provideRequestProvider, this.provideUploadProvider));
        this.provideArticleVoteStorageProvider = N.m1391(StorageModule_ProvideArticleVoteStorageFactory.create(builder.storageModule, this.getSessionStorageProvider));
        this.provideSupportModuleProvider = N.m1391(ProviderModule_ProvideSupportModuleFactory.create(builder.providerModule, this.provideRequestProvider, this.provideUploadProvider, this.provideHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, this.provideArticleVoteStorageProvider));
        this.coreModule = builder.coreModule;
    }

    public final Support inject(Support support) {
        return injectSupport(support);
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, this.provideSupportBlipsProvider.get());
        ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(this.coreModule);
        if (proxyActionHandlerRegistry != null) {
            Support_MembersInjector.injectActionHandlerRegistry(support, proxyActionHandlerRegistry);
            Support_MembersInjector.injectRequestProvider(support, this.provideRequestProvider.get());
            AuthenticationProvider proxyGetAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.proxyGetAuthenticationProvider(this.coreModule);
            if (proxyGetAuthenticationProvider != null) {
                Support_MembersInjector.injectAuthenticationProvider(support, proxyGetAuthenticationProvider);
                return support;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public CoreModule coreModule;
        /* access modifiers changed from: private */
        public ProviderModule providerModule;
        /* access modifiers changed from: private */
        public StorageModule storageModule;
        /* access modifiers changed from: private */
        public SupportApplicationModule supportApplicationModule;

        private Builder() {
        }

        public final SupportSdkProvidersComponent build() {
            if (this.coreModule == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(CoreModule.class.getCanonicalName());
                sb.append(" must be set");
                throw new IllegalStateException(sb.toString());
            } else if (this.supportApplicationModule != null) {
                if (this.providerModule == null) {
                    this.providerModule = new ProviderModule();
                }
                if (this.storageModule == null) {
                    this.storageModule = new StorageModule();
                }
                return new DaggerSupportSdkProvidersComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(SupportApplicationModule.class.getCanonicalName());
                sb2.append(" must be set");
                throw new IllegalStateException(sb2.toString());
            }
        }

        public final Builder supportApplicationModule(SupportApplicationModule supportApplicationModule2) {
            if (supportApplicationModule2 != null) {
                this.supportApplicationModule = supportApplicationModule2;
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder coreModule(CoreModule coreModule2) {
            if (coreModule2 != null) {
                this.coreModule = coreModule2;
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder providerModule(ProviderModule providerModule2) {
            if (providerModule2 != null) {
                this.providerModule = providerModule2;
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder storageModule(StorageModule storageModule2) {
            if (storageModule2 != null) {
                this.storageModule = storageModule2;
                return this;
            }
            throw new NullPointerException();
        }
    }
}
