package zendesk.support;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C3122;
import o.C3162;
import o.C3351dc;
import o.C3602mo;
import o.C3616p;
import o.N;
import o.R;
import o.nk;
import o.np;
import o.nu;
import okhttp3.OkHttpClient;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationConfigurationFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetNetworkInfoProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.MemoryCache;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.SessionStorage;
import zendesk.support.ZendeskDeepLinkParser;
import zendesk.support.guide.HelpCenterActivity;
import zendesk.support.guide.HelpCenterActivity_MembersInjector;
import zendesk.support.guide.HelpCenterFragment;
import zendesk.support.guide.HelpCenterFragment_MembersInjector;
import zendesk.support.guide.ViewArticleActivity;
import zendesk.support.guide.ViewArticleActivity_MembersInjector;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestActivity_MembersInjector;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.request.RequestModule_ProvidesActionFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesAsyncMiddlewareFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderComponentFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentToDiskServiceFactory;
import zendesk.support.request.RequestModule_ProvidesBelvedereFactory;
import zendesk.support.request.RequestModule_ProvidesConversationsUpdatesComponentFactory;
import zendesk.support.request.RequestModule_ProvidesDiskQueueFactory;
import zendesk.support.request.RequestModule_ProvidesDispatcherFactory;
import zendesk.support.request.RequestModule_ProvidesHeadlessComponentListenerFactory;
import zendesk.support.request.RequestModule_ProvidesMessageFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesPersistenceComponentFactory;
import zendesk.support.request.RequestModule_ProvidesReducerFactory;
import zendesk.support.request.RequestModule_ProvidesStoreFactory;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.request.RequestViewConversationsDisabled_MembersInjector;
import zendesk.support.request.RequestViewConversationsEnabled;
import zendesk.support.request.RequestViewConversationsEnabled_MembersInjector;
import zendesk.support.requestlist.RequestInfoDataSource;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListActivity_MembersInjector;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListModule_ModelFactory;
import zendesk.support.requestlist.RequestListModule_PresenterFactory;
import zendesk.support.requestlist.RequestListModule_RefreshHandlerFactory;
import zendesk.support.requestlist.RequestListModule_RepositoryFactory;
import zendesk.support.requestlist.RequestListModule_ViewFactory;

public final class DaggerSupportSdkComponent implements SupportSdkComponent {
    /* access modifiers changed from: private */
    public C3351dc<ActionHandlerRegistry> actionHandlerRegistryProvider;
    /* access modifiers changed from: private */
    public CoreModule coreModule;
    private C3351dc<ApplicationConfiguration> getApplicationConfigurationProvider;
    /* access modifiers changed from: private */
    public C3351dc<Context> getApplicationContextProvider;
    /* access modifiers changed from: private */
    public C3351dc<AuthenticationProvider> getAuthenticationProvider;
    /* access modifiers changed from: private */
    public C3351dc<ExecutorService> getExecutorServiceProvider;
    /* access modifiers changed from: private */
    public C3351dc<MemoryCache> getMemoryCacheProvider;
    private C3351dc<SessionStorage> getSessionStorageProvider;
    /* access modifiers changed from: private */
    public C3351dc<Executor> mainThreadExecutorProvider;
    private C3351dc<List<ActionHandler>> providesActionHandlersProvider;
    /* access modifiers changed from: private */
    public C3351dc<SupportBlipsProvider> providesBlipsProvider;
    /* access modifiers changed from: private */
    public C3351dc<ZendeskDeepLinkHelper> providesDeepLinkHelperProvider;
    private C3351dc<ZendeskDeepLinkParser> providesDeepLinkParserProvider;
    /* access modifiers changed from: private */
    public C3351dc<OkHttpClient> providesOkHttpClientProvider;
    private C3351dc<List<ZendeskDeepLinkParser.Module>> providesParserModuleProvider;
    /* access modifiers changed from: private */
    public C3351dc<C3616p> providesPicassoProvider;
    private C3351dc<C3122> providesProvider;
    private C3351dc<C3162> providesRequestDiskLruCacheProvider;
    /* access modifiers changed from: private */
    public C3351dc<RequestProvider> providesRequestProvider;
    /* access modifiers changed from: private */
    public C3351dc<SupportSettingsProvider> providesSettingsProvider;
    /* access modifiers changed from: private */
    public C3351dc<UploadProvider> providesUploadProvider;
    private C3351dc<String> providesZendeskUrlProvider;
    /* access modifiers changed from: private */
    public C3351dc<RequestInfoDataSource.LocalDataSource> requestInfoDataSourceProvider;
    private SupportModule supportModule;
    /* access modifiers changed from: private */
    public C3351dc<SupportUiStorage> supportUIStorageProvider;

    private DaggerSupportSdkComponent(Builder builder) {
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.supportModule = builder.supportModule;
        this.coreModule = builder.coreModule;
        this.actionHandlerRegistryProvider = CoreModule_ActionHandlerRegistryFactory.create(builder.coreModule);
        this.getApplicationConfigurationProvider = CoreModule_GetApplicationConfigurationFactory.create(builder.coreModule);
        this.providesZendeskUrlProvider = N.m1391(SupportSdkModule_ProvidesZendeskUrlFactory.create(builder.supportSdkModule, this.getApplicationConfigurationProvider));
        this.providesParserModuleProvider = N.m1391(SupportSdkModule_ProvidesParserModuleFactory.create(builder.supportSdkModule));
        this.providesDeepLinkParserProvider = N.m1391(SupportSdkModule_ProvidesDeepLinkParserFactory.create(builder.supportSdkModule, this.providesZendeskUrlProvider, this.providesParserModuleProvider));
        this.providesDeepLinkHelperProvider = N.m1391(SupportSdkModule_ProvidesDeepLinkHelperFactory.create(builder.supportSdkModule, this.actionHandlerRegistryProvider, this.providesDeepLinkParserProvider));
        this.providesActionHandlersProvider = N.m1391(SupportSdkModule_ProvidesActionHandlersFactory.create(builder.supportSdkModule));
        this.providesRequestProvider = SupportModule_ProvidesRequestProviderFactory.create(builder.supportModule);
        this.providesSettingsProvider = SupportModule_ProvidesSettingsProviderFactory.create(builder.supportModule);
        this.providesUploadProvider = SupportModule_ProvidesUploadProviderFactory.create(builder.supportModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(builder.coreModule);
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(builder.coreModule);
        this.providesRequestDiskLruCacheProvider = N.m1391(SupportSdkModule_ProvidesRequestDiskLruCacheFactory.create(builder.supportSdkModule, this.getSessionStorageProvider));
        this.providesProvider = N.m1391(SupportSdkModule_ProvidesFactory.create(builder.supportSdkModule));
        this.supportUIStorageProvider = N.m1391(SupportSdkModule_SupportUIStorageFactory.create(builder.supportSdkModule, this.providesRequestDiskLruCacheProvider, this.providesProvider));
        this.getExecutorServiceProvider = CoreModule_GetExecutorServiceFactory.create(builder.coreModule);
        this.mainThreadExecutorProvider = N.m1391(SupportSdkModule_MainThreadExecutorFactory.create(builder.supportSdkModule));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(builder.coreModule);
        this.providesBlipsProvider = SupportModule_ProvidesBlipsProviderFactory.create(builder.supportModule);
        this.providesOkHttpClientProvider = SupportModule_ProvidesOkHttpClientFactory.create(builder.supportModule);
        this.requestInfoDataSourceProvider = SupportSdkModule_RequestInfoDataSourceFactory.create(builder.supportSdkModule, this.supportUIStorageProvider, this.mainThreadExecutorProvider, this.getExecutorServiceProvider);
        this.providesPicassoProvider = N.m1391(SupportSdkModule_ProvidesPicassoFactory.create(builder.supportSdkModule, this.getApplicationContextProvider, this.providesOkHttpClientProvider, this.getExecutorServiceProvider));
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(builder.coreModule);
    }

    public final void inject(ViewArticleActivity viewArticleActivity) {
        injectViewArticleActivity(viewArticleActivity);
    }

    public final void inject(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterActivity(helpCenterActivity);
    }

    public final void inject(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterFragment(helpCenterFragment);
    }

    public final void inject(SdkDependencyProvider sdkDependencyProvider) {
        injectSdkDependencyProvider(sdkDependencyProvider);
    }

    public final void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectDeepLinkingBroadcastReceiver(deepLinkingBroadcastReceiver);
    }

    public final RequestComponent plus(RequestModule requestModule) {
        return new RequestComponentImpl(requestModule);
    }

    public final RequestListComponent plus(RequestListModule requestListModule) {
        return new RequestListComponentImpl(requestListModule);
    }

    private ViewArticleActivity injectViewArticleActivity(ViewArticleActivity viewArticleActivity) {
        OkHttpClient providesOkHttpClient = this.supportModule.providesOkHttpClient();
        if (providesOkHttpClient != null) {
            ViewArticleActivity_MembersInjector.injectOkHttpClient(viewArticleActivity, providesOkHttpClient);
            ApplicationConfiguration proxyGetApplicationConfiguration = CoreModule_GetApplicationConfigurationFactory.proxyGetApplicationConfiguration(this.coreModule);
            if (proxyGetApplicationConfiguration != null) {
                ViewArticleActivity_MembersInjector.injectApplicationConfiguration(viewArticleActivity, proxyGetApplicationConfiguration);
                HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
                if (providesHelpCenterProvider != null) {
                    ViewArticleActivity_MembersInjector.injectHelpCenterProvider(viewArticleActivity, providesHelpCenterProvider);
                    ArticleVoteStorage providesArticleVoteStorage = this.supportModule.providesArticleVoteStorage();
                    if (providesArticleVoteStorage != null) {
                        ViewArticleActivity_MembersInjector.injectArticleVoteStorage(viewArticleActivity, providesArticleVoteStorage);
                        ViewArticleActivity_MembersInjector.injectDeepLinkHelper(viewArticleActivity, this.providesDeepLinkHelperProvider.get());
                        NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
                        if (proxyGetNetworkInfoProvider != null) {
                            ViewArticleActivity_MembersInjector.injectNetworkInfoProvider(viewArticleActivity, proxyGetNetworkInfoProvider);
                            SupportSettingsProvider providesSettingsProvider2 = this.supportModule.providesSettingsProvider();
                            if (providesSettingsProvider2 != null) {
                                ViewArticleActivity_MembersInjector.injectSupportSettingsProvider(viewArticleActivity, providesSettingsProvider2);
                                return viewArticleActivity;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    private HelpCenterActivity injectHelpCenterActivity(HelpCenterActivity helpCenterActivity) {
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        if (providesHelpCenterProvider != null) {
            HelpCenterActivity_MembersInjector.injectHelpCenterProvider(helpCenterActivity, providesHelpCenterProvider);
            SupportSettingsProvider providesSettingsProvider2 = this.supportModule.providesSettingsProvider();
            if (providesSettingsProvider2 != null) {
                HelpCenterActivity_MembersInjector.injectSettingsProvider(helpCenterActivity, providesSettingsProvider2);
                NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
                if (proxyGetNetworkInfoProvider != null) {
                    HelpCenterActivity_MembersInjector.injectNetworkInfoProvider(helpCenterActivity, proxyGetNetworkInfoProvider);
                    return helpCenterActivity;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    private HelpCenterFragment injectHelpCenterFragment(HelpCenterFragment helpCenterFragment) {
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        if (providesHelpCenterProvider != null) {
            HelpCenterFragment_MembersInjector.injectHelpCenterProvider(helpCenterFragment, providesHelpCenterProvider);
            NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
            if (proxyGetNetworkInfoProvider != null) {
                HelpCenterFragment_MembersInjector.injectNetworkInfoProvider(helpCenterFragment, proxyGetNetworkInfoProvider);
                return helpCenterFragment;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    private SdkDependencyProvider injectSdkDependencyProvider(SdkDependencyProvider sdkDependencyProvider) {
        ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(this.coreModule);
        if (proxyActionHandlerRegistry != null) {
            SdkDependencyProvider_MembersInjector.injectRegistry(sdkDependencyProvider, proxyActionHandlerRegistry);
            SdkDependencyProvider_MembersInjector.injectActionHandlers(sdkDependencyProvider, this.providesActionHandlersProvider.get());
            return sdkDependencyProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    private DeepLinkingBroadcastReceiver injectDeepLinkingBroadcastReceiver(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        DeepLinkingBroadcastReceiver_MembersInjector.injectDeepLinkHelper(deepLinkingBroadcastReceiver, this.providesDeepLinkHelperProvider.get());
        return deepLinkingBroadcastReceiver;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public CoreModule coreModule;
        /* access modifiers changed from: private */
        public SupportModule supportModule;
        /* access modifiers changed from: private */
        public SupportSdkModule supportSdkModule;

        private Builder() {
        }

        public final SupportSdkComponent build() {
            if (this.supportModule == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(SupportModule.class.getCanonicalName());
                sb.append(" must be set");
                throw new IllegalStateException(sb.toString());
            } else if (this.coreModule != null) {
                if (this.supportSdkModule == null) {
                    this.supportSdkModule = new SupportSdkModule();
                }
                return new DaggerSupportSdkComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CoreModule.class.getCanonicalName());
                sb2.append(" must be set");
                throw new IllegalStateException(sb2.toString());
            }
        }

        public final Builder coreModule(CoreModule coreModule2) {
            if (coreModule2 != null) {
                this.coreModule = coreModule2;
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder supportModule(SupportModule supportModule2) {
            if (supportModule2 != null) {
                this.supportModule = supportModule2;
                return this;
            }
            throw new NullPointerException();
        }

        public final Builder supportSdkModule(SupportSdkModule supportSdkModule2) {
            if (supportSdkModule2 != null) {
                this.supportSdkModule = supportSdkModule2;
                return this;
            }
            throw new NullPointerException();
        }
    }

    final class RequestComponentImpl implements RequestComponent {
        private C3351dc providesActionFactoryProvider;
        private C3351dc providesAsyncMiddlewareProvider;
        private C3351dc providesAttachmentDownloaderComponentProvider;
        private C3351dc providesAttachmentDownloaderProvider;
        private C3351dc providesAttachmentToDiskServiceProvider;
        private C3351dc<C3602mo> providesBelvedereProvider;
        private C3351dc providesConversationsUpdatesComponentProvider;
        private C3351dc providesDiskQueueProvider;
        private C3351dc<nk> providesDispatcherProvider;
        private C3351dc providesHeadlessComponentListenerProvider;
        private C3351dc providesMessageFactoryProvider;
        private C3351dc providesPersistenceComponentProvider;
        private C3351dc<List<np>> providesReducerProvider;
        private C3351dc<nu> providesStoreProvider;
        private final RequestModule requestModule;

        private RequestComponentImpl(RequestModule requestModule2) {
            if (requestModule2 != null) {
                this.requestModule = requestModule2;
                initialize();
                return;
            }
            throw new NullPointerException();
        }

        private void initialize() {
            this.providesReducerProvider = N.m1391(RequestModule_ProvidesReducerFactory.create());
            this.providesAsyncMiddlewareProvider = N.m1391(RequestModule_ProvidesAsyncMiddlewareFactory.create());
            this.providesStoreProvider = N.m1391(RequestModule_ProvidesStoreFactory.create(this.providesReducerProvider, this.providesAsyncMiddlewareProvider));
            this.providesBelvedereProvider = N.m1391(RequestModule_ProvidesBelvedereFactory.create(DaggerSupportSdkComponent.this.getApplicationContextProvider));
            this.providesActionFactoryProvider = N.m1391(RequestModule_ProvidesActionFactoryFactory.create(DaggerSupportSdkComponent.this.providesRequestProvider, DaggerSupportSdkComponent.this.providesSettingsProvider, DaggerSupportSdkComponent.this.providesUploadProvider, this.providesBelvedereProvider, DaggerSupportSdkComponent.this.supportUIStorageProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider, DaggerSupportSdkComponent.this.mainThreadExecutorProvider, DaggerSupportSdkComponent.this.getAuthenticationProvider, DaggerSupportSdkComponent.this.providesBlipsProvider));
            this.providesDiskQueueProvider = N.m1391(RequestModule_ProvidesDiskQueueFactory.create(DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesPersistenceComponentProvider = N.m1391(RequestModule_ProvidesPersistenceComponentFactory.create(DaggerSupportSdkComponent.this.supportUIStorageProvider, this.providesDiskQueueProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesDispatcherProvider = N.m1391(RequestModule_ProvidesDispatcherFactory.create(this.providesStoreProvider));
            this.providesAttachmentToDiskServiceProvider = N.m1391(RequestModule_ProvidesAttachmentToDiskServiceFactory.create(DaggerSupportSdkComponent.this.providesOkHttpClientProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesAttachmentDownloaderProvider = N.m1391(RequestModule_ProvidesAttachmentDownloaderFactory.create(this.providesBelvedereProvider, this.providesAttachmentToDiskServiceProvider));
            this.providesAttachmentDownloaderComponentProvider = N.m1391(RequestModule_ProvidesAttachmentDownloaderComponentFactory.create(this.providesDispatcherProvider, this.providesActionFactoryProvider, this.providesAttachmentDownloaderProvider));
            this.providesConversationsUpdatesComponentProvider = R.m1413(RequestModule_ProvidesConversationsUpdatesComponentFactory.create(DaggerSupportSdkComponent.this.getApplicationContextProvider, DaggerSupportSdkComponent.this.actionHandlerRegistryProvider, DaggerSupportSdkComponent.this.requestInfoDataSourceProvider));
            this.providesHeadlessComponentListenerProvider = N.m1391(RequestModule_ProvidesHeadlessComponentListenerFactory.create(this.providesPersistenceComponentProvider, this.providesAttachmentDownloaderComponentProvider, this.providesConversationsUpdatesComponentProvider));
            this.providesMessageFactoryProvider = N.m1391(RequestModule_ProvidesMessageFactoryFactory.create(this.requestModule, DaggerSupportSdkComponent.this.getApplicationContextProvider, DaggerSupportSdkComponent.this.providesPicassoProvider, this.providesActionFactoryProvider, this.providesDispatcherProvider, DaggerSupportSdkComponent.this.providesDeepLinkHelperProvider));
        }

        public final void inject(RequestActivity requestActivity) {
            injectRequestActivity(requestActivity);
        }

        public final void inject(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            injectRequestViewConversationsEnabled(requestViewConversationsEnabled);
        }

        public final void inject(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            injectRequestViewConversationsDisabled(requestViewConversationsDisabled);
        }

        private RequestActivity injectRequestActivity(RequestActivity requestActivity) {
            RequestActivity_MembersInjector.injectStore(requestActivity, this.providesStoreProvider.get());
            RequestActivity_MembersInjector.injectAf(requestActivity, this.providesActionFactoryProvider.get());
            RequestActivity_MembersInjector.injectHeadlessComponentListener(requestActivity, this.providesHeadlessComponentListenerProvider.get());
            RequestActivity_MembersInjector.injectPicasso(requestActivity, (C3616p) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(DaggerSupportSdkComponent.this.coreModule);
            if (proxyActionHandlerRegistry != null) {
                RequestActivity_MembersInjector.injectActionHandlerRegistry(requestActivity, proxyActionHandlerRegistry);
                return requestActivity;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        private RequestViewConversationsEnabled injectRequestViewConversationsEnabled(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            RequestViewConversationsEnabled_MembersInjector.injectStore(requestViewConversationsEnabled, this.providesStoreProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectAf(requestViewConversationsEnabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectCellFactory(requestViewConversationsEnabled, this.providesMessageFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectPicasso(requestViewConversationsEnabled, (C3616p) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            return requestViewConversationsEnabled;
        }

        private RequestViewConversationsDisabled injectRequestViewConversationsDisabled(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            RequestViewConversationsDisabled_MembersInjector.injectStore(requestViewConversationsDisabled, this.providesStoreProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectAf(requestViewConversationsDisabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectPicasso(requestViewConversationsDisabled, (C3616p) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            return requestViewConversationsDisabled;
        }
    }

    final class RequestListComponentImpl implements RequestListComponent {
        private C3351dc modelProvider;
        private C3351dc presenterProvider;
        private C3351dc refreshHandlerProvider;
        private C3351dc<RequestInfoDataSource.Repository> repositoryProvider;
        private final RequestListModule requestListModule;
        private C3351dc viewProvider;

        private RequestListComponentImpl(RequestListModule requestListModule2) {
            if (requestListModule2 != null) {
                this.requestListModule = requestListModule2;
                initialize();
                return;
            }
            throw new NullPointerException();
        }

        private void initialize() {
            this.viewProvider = N.m1391(RequestListModule_ViewFactory.create(this.requestListModule, DaggerSupportSdkComponent.this.providesPicassoProvider));
            this.repositoryProvider = N.m1391(RequestListModule_RepositoryFactory.create(DaggerSupportSdkComponent.this.requestInfoDataSourceProvider, DaggerSupportSdkComponent.this.supportUIStorageProvider, DaggerSupportSdkComponent.this.providesRequestProvider, DaggerSupportSdkComponent.this.mainThreadExecutorProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.modelProvider = N.m1391(RequestListModule_ModelFactory.create(this.repositoryProvider, DaggerSupportSdkComponent.this.getMemoryCacheProvider, DaggerSupportSdkComponent.this.providesBlipsProvider, DaggerSupportSdkComponent.this.providesSettingsProvider));
            this.presenterProvider = N.m1391(RequestListModule_PresenterFactory.create(this.viewProvider, this.modelProvider));
            this.refreshHandlerProvider = N.m1391(RequestListModule_RefreshHandlerFactory.create(this.presenterProvider));
        }

        public final void inject(RequestListActivity requestListActivity) {
            injectRequestListActivity(requestListActivity);
        }

        private RequestListActivity injectRequestListActivity(RequestListActivity requestListActivity) {
            RequestListActivity_MembersInjector.injectPresenter(requestListActivity, this.presenterProvider.get());
            RequestListActivity_MembersInjector.injectView(requestListActivity, this.viewProvider.get());
            RequestListActivity_MembersInjector.injectModel(requestListActivity, this.modelProvider.get());
            ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(DaggerSupportSdkComponent.this.coreModule);
            if (proxyActionHandlerRegistry != null) {
                RequestListActivity_MembersInjector.injectActionHandlerRegistry(requestListActivity, proxyActionHandlerRegistry);
                RequestListActivity_MembersInjector.injectSyncHandler(requestListActivity, this.refreshHandlerProvider.get());
                return requestListActivity;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
