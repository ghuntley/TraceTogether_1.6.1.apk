package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements M<ConnectivityManager> {
    private final C3351dc<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final ConnectivityManager get() {
        ConnectivityManager providerConnectivityManager = ZendeskProvidersModule.providerConnectivityManager(this.contextProvider.get());
        if (providerConnectivityManager != null) {
            return providerConnectivityManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ConnectivityManager> create(C3351dc<Context> dcVar) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(dcVar);
    }
}
