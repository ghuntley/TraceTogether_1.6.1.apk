package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.File;
import java.util.concurrent.ExecutorService;
import o.C3122;
import o.C3351dc;
import o.N;
import o.R;
import o.kD;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private C3351dc<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private C3351dc<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
    private C3351dc<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
    private C3351dc<AccessProvider> provideAccessProvider;
    private C3351dc<AccessService> provideAccessServiceProvider;
    private C3351dc<BaseStorage> provideAdditionalSdkBaseStorageProvider;
    private C3351dc<ApplicationConfiguration> provideApplicationConfigurationProvider;
    private C3351dc<Context> provideApplicationContextProvider;
    private C3351dc<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
    private C3351dc<AuthenticationProvider> provideAuthProvider;
    private C3351dc<Serializer> provideBase64SerializerProvider;
    private C3351dc<OkHttpClient> provideBaseOkHttpClientProvider;
    private C3351dc<BlipsService> provideBlipsServiceProvider;
    private C3351dc<Cache> provideCacheProvider;
    private C3351dc<CachingInterceptor> provideCachingInterceptorProvider;
    private C3351dc<OkHttpClient> provideCoreOkHttpClientProvider;
    private C3351dc<kD> provideCoreRetrofitProvider;
    private C3351dc<CoreModule> provideCoreSdkModuleProvider;
    private C3351dc<CoreSettingsStorage> provideCoreSettingsStorageProvider;
    private C3351dc<DeviceInfo> provideDeviceInfoProvider;
    private C3351dc<ExecutorService> provideExecutorProvider;
    private C3351dc<C3122> provideGsonProvider;
    private C3351dc<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
    private C3351dc<BaseStorage> provideIdentityBaseStorageProvider;
    private C3351dc<IdentityManager> provideIdentityManagerProvider;
    private C3351dc<IdentityStorage> provideIdentityStorageProvider;
    private C3351dc<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
    private C3351dc<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
    private C3351dc<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
    private C3351dc<OkHttpClient> provideMediaOkHttpClientProvider;
    private C3351dc<MemoryCache> provideMemoryCacheProvider;
    private C3351dc<OkHttpClient> provideOkHttpClientProvider;
    private C3351dc<ProviderStore> provideProviderStoreProvider;
    private C3351dc<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
    private C3351dc<PushRegistrationProvider> providePushRegistrationProvider;
    private C3351dc<PushRegistrationService> providePushRegistrationServiceProvider;
    private C3351dc<RestServiceProvider> provideRestServiceProvider;
    private C3351dc<kD> provideRetrofitProvider;
    private C3351dc<BaseStorage> provideSdkBaseStorageProvider;
    private C3351dc<SettingsProvider> provideSdkSettingsProvider;
    private C3351dc<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
    private C3351dc<SdkSettingsService> provideSdkSettingsServiceProvider;
    private C3351dc<Storage> provideSdkStorageProvider;
    private C3351dc<Serializer> provideSerializerProvider;
    private C3351dc<SessionStorage> provideSessionStorageProvider;
    private C3351dc<BaseStorage> provideSettingsBaseStorageProvider;
    private C3351dc<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
    private C3351dc<SettingsStorage> provideSettingsStorageProvider;
    private C3351dc<UserProvider> provideUserProvider;
    private C3351dc<UserService> provideUserServiceProvider;
    private C3351dc<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
    private C3351dc<ZendeskShadow> provideZendeskProvider;
    private C3351dc<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
    private C3351dc<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
    private C3351dc<BlipsCoreProvider> providerBlipsCoreProvider;
    private C3351dc<BlipsProvider> providerBlipsProvider;
    private C3351dc<ConnectivityManager> providerConnectivityManagerProvider;
    private C3351dc<NetworkInfoProvider> providerNetworkInfoProvider;
    private C3351dc<ZendeskBlipsProvider> providerZendeskBlipsProvider;
    private C3351dc<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
    private C3351dc<File> providesBelvedereDirProvider;
    private C3351dc<File> providesCacheDirProvider;
    private C3351dc<File> providesDataDirProvider;
    private C3351dc<BaseStorage> providesDiskLruStorageProvider;
    private C3351dc<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;

    private DaggerZendeskApplicationComponent(Builder builder) {
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.provideApplicationContextProvider = N.m1391(ZendeskApplicationModule_ProvideApplicationContextFactory.create(builder.zendeskApplicationModule));
        this.provideGsonProvider = R.m1413(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideSerializerProvider = N.m1391(ZendeskStorageModule_ProvideSerializerFactory.create(this.provideGsonProvider));
        this.provideSettingsBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideSettingsStorageProvider = N.m1391(ZendeskStorageModule_ProvideSettingsStorageFactory.create(this.provideSettingsBaseStorageProvider));
        this.provideIdentityBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityStorageProvider = N.m1391(ZendeskStorageModule_ProvideIdentityStorageFactory.create(this.provideIdentityBaseStorageProvider));
        this.provideAdditionalSdkBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.providesCacheDirProvider = N.m1391(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesDiskLruStorageProvider = N.m1391(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(this.providesCacheDirProvider, this.provideSerializerProvider));
        this.provideCacheProvider = N.m1391(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = N.m1391(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = N.m1391(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.provideSessionStorageProvider = N.m1391(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, this.providesBelvedereDirProvider));
        this.provideSdkBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideMemoryCacheProvider = N.m1391(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideSdkStorageProvider = N.m1391(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, this.provideMemoryCacheProvider));
        this.provideLegacyIdentityBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = N.m1391(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = N.m1391(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        this.providePushDeviceIdStorageProvider = N.m1391(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.provideLegacyIdentityStorageProvider = N.m1391(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, this.providePushDeviceIdStorageProvider));
        this.provideApplicationConfigurationProvider = N.m1391(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(builder.zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = R.m1413(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory.create(builder.zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(builder.zendeskNetworkModule));
        this.provideExecutorProvider = N.m1391(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideBaseOkHttpClientProvider = N.m1391(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(builder.zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, this.provideExecutorProvider));
        this.provideAcceptLanguageHeaderInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory.create(this.provideApplicationContextProvider));
        this.providesAcceptHeaderInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.provideCoreOkHttpClientProvider = N.m1391(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, this.providesAcceptHeaderInterceptorProvider));
        this.provideCoreRetrofitProvider = N.m1391(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider));
        this.provideBlipsServiceProvider = N.m1391(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideDeviceInfoProvider = N.m1391(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = R.m1413(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(builder.zendeskApplicationModule, this.provideSerializerProvider));
        this.provideCoreSettingsStorageProvider = N.m1391(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.providerZendeskBlipsProvider = N.m1391(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, this.provideCoreSettingsStorageProvider, this.provideExecutorProvider));
        this.providerBlipsCoreProvider = N.m1391(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(this.providerZendeskBlipsProvider));
        this.provideAccessServiceProvider = R.m1413(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessProvider = N.m1391(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, this.provideAccessServiceProvider));
        this.provideAccessInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, this.provideAccessProvider, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory.create(this.provideSessionStorageProvider));
        this.provideAuthHeaderInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideSdkSettingsServiceProvider = R.m1413(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideZendeskSdkSettingsProvider = N.m1391(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.provideSerializerProvider, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideSdkSettingsProviderInternalProvider = N.m1391(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSettingsInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(this.provideSdkSettingsProviderInternalProvider, this.provideSettingsStorageProvider));
        this.provideOkHttpClientProvider = N.m1391(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, this.provideCacheProvider));
        this.provideRetrofitProvider = N.m1391(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideOkHttpClientProvider));
        this.providePushRegistrationServiceProvider = R.m1413(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(this.provideRetrofitProvider));
        this.provideSdkSettingsProvider = N.m1391(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(this.provideZendeskSdkSettingsProvider));
        this.providePushRegistrationProvider = N.m1391(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, this.provideSdkSettingsProvider, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        this.provideCachingInterceptorProvider = R.m1413(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideMediaOkHttpClientProvider = N.m1391(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.provideCachingInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideRestServiceProvider = N.m1391(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(this.provideRetrofitProvider, this.provideMediaOkHttpClientProvider, this.provideOkHttpClientProvider));
        this.providerBlipsProvider = N.m1391(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        this.providerConnectivityManagerProvider = N.m1391(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerNetworkInfoProvider = N.m1391(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(this.provideApplicationContextProvider, this.providerConnectivityManagerProvider));
        this.actionHandlerRegistryProvider = N.m1391(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        this.provideAuthProvider = N.m1391(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        this.provideCoreSdkModuleProvider = R.m1413(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider));
        this.provideUserServiceProvider = R.m1413(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserProvider = N.m1391(ZendeskProvidersModule_ProvideUserProviderFactory.create(this.provideUserServiceProvider));
        this.provideProviderStoreProvider = N.m1391(ZendeskProvidersModule_ProvideProviderStoreFactory.create(this.provideUserProvider, this.providePushRegistrationProvider));
        this.provideZendeskProvider = N.m1391(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, this.provideProviderStoreProvider));
    }

    public final ZendeskShadow zendeskShadow() {
        return this.provideZendeskProvider.get();
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public ZendeskApplicationModule zendeskApplicationModule;
        /* access modifiers changed from: private */
        public ZendeskNetworkModule zendeskNetworkModule;

        private Builder() {
        }

        public final ZendeskApplicationComponent build() {
            if (this.zendeskApplicationModule != null) {
                if (this.zendeskNetworkModule == null) {
                    this.zendeskNetworkModule = new ZendeskNetworkModule();
                }
                return new DaggerZendeskApplicationComponent(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ZendeskApplicationModule.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public final Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule2) {
            if (zendeskApplicationModule2 != null) {
                this.zendeskApplicationModule = zendeskApplicationModule2;
                return this;
            }
            throw new NullPointerException();
        }
    }
}
