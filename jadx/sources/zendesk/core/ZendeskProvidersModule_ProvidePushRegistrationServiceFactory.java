package zendesk.core;

import o.C3351dc;
import o.M;
import o.kD;

public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements M<PushRegistrationService> {
    private final C3351dc<kD> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(C3351dc<kD> dcVar) {
        this.retrofitProvider = dcVar;
    }

    public final PushRegistrationService get() {
        PushRegistrationService providePushRegistrationService = ZendeskProvidersModule.providePushRegistrationService(this.retrofitProvider.get());
        if (providePushRegistrationService != null) {
            return providePushRegistrationService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<PushRegistrationService> create(C3351dc<kD> dcVar) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(dcVar);
    }
}
