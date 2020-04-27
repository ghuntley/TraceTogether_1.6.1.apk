package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.ExecutorService;
import o.C3349da;
import o.C3356di;
import o.kD;

class ZendeskProvidersModule {
    @C3356di
    static SettingsProvider provideSdkSettingsProvider(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    @C3356di
    static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    @C3356di
    static BlipsCoreProvider providerBlipsCoreProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    @C3356di
    static BlipsProvider providerBlipsProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    ZendeskProvidersModule() {
    }

    static UserService provideUserService(@C3349da(m2095 = "Retrofit") kD kDVar) {
        return (UserService) kDVar.m3219(UserService.class);
    }

    static SdkSettingsService provideSdkSettingsService(@C3349da(m2095 = "CoreRetrofit") kD kDVar) {
        return (SdkSettingsService) kDVar.m3219(SdkSettingsService.class);
    }

    static AccessService provideAccessService(@C3349da(m2095 = "CoreRetrofit") kD kDVar) {
        return (AccessService) kDVar.m3219(AccessService.class);
    }

    static PushRegistrationService providePushRegistrationService(@C3349da(m2095 = "Retrofit") kD kDVar) {
        return (PushRegistrationService) kDVar.m3219(PushRegistrationService.class);
    }

    @C3356di
    static UserProvider provideUserProvider(UserService userService) {
        return new ZendeskUserProvider(userService);
    }

    @C3356di
    static BlipsService provideBlipsService(@C3349da(m2095 = "CoreRetrofit") kD kDVar) {
        return (BlipsService) kDVar.m3219(BlipsService.class);
    }

    @C3356di
    static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, @C3349da(m2095 = "gson_serializer") Serializer serializer, ApplicationConfiguration applicationConfiguration, @C3349da(m2095 = "application_context") Context context) {
        return new ZendeskSettingsProvider(sdkSettingsService, settingsStorage, coreSettingsStorage, serializer, applicationConfiguration.getApplicationId(), context);
    }

    @C3356di
    static AccessProvider provideAccessProvider(IdentityManager identityManager, AccessService accessService) {
        return new ZendeskAccessProvider(identityManager, accessService);
    }

    @C3356di
    static PushRegistrationProvider providePushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, @C3349da(m2095 = "application_context") Context context) {
        return new ZendeskPushRegistrationProvider(pushRegistrationService, identityManager, settingsProvider, blipsCoreProvider, pushDeviceIdStorage, DeviceInfo.getCurrentLocale(context));
    }

    @C3356di
    static NetworkInfoProvider providerNetworkInfoProvider(@C3349da(m2095 = "application_context") Context context, ConnectivityManager connectivityManager) {
        return new ZendeskNetworkInfoProvider(context, connectivityManager);
    }

    @C3356di
    static ConnectivityManager providerConnectivityManager(@C3349da(m2095 = "application_context") Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    @C3356di
    static ZendeskBlipsProvider providerZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, @C3349da(m2095 = "base_64_serializer") Serializer serializer, IdentityManager identityManager, ApplicationConfiguration applicationConfiguration, CoreSettingsStorage coreSettingsStorage, ExecutorService executorService) {
        return new ZendeskBlipsProvider(blipsService, deviceInfo, serializer, identityManager, applicationConfiguration.getApplicationId(), coreSettingsStorage, executorService);
    }

    @C3356di
    static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return new ZendeskProviderStore(userProvider, pushRegistrationProvider);
    }

    @C3356di
    static ActionHandlerRegistry actionHandlerRegistry() {
        return Zendesk.INSTANCE.actionHandlerRegistry();
    }

    static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ExecutorService executorService, @C3349da(m2095 = "application_context") Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider) {
        return new CoreModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, context, actionHandlerRegistry, memoryCache, executorService, authenticationProvider, applicationConfiguration, pushRegistrationProvider);
    }
}
