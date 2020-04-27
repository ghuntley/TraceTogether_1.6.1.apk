package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import o.C3351dc;
import o.M;

public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements M<NetworkInfoProvider> {
    private final C3351dc<ConnectivityManager> connectivityManagerProvider;
    private final C3351dc<Context> contextProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(C3351dc<Context> dcVar, C3351dc<ConnectivityManager> dcVar2) {
        this.contextProvider = dcVar;
        this.connectivityManagerProvider = dcVar2;
    }

    public final NetworkInfoProvider get() {
        NetworkInfoProvider providerNetworkInfoProvider = ZendeskProvidersModule.providerNetworkInfoProvider(this.contextProvider.get(), this.connectivityManagerProvider.get());
        if (providerNetworkInfoProvider != null) {
            return providerNetworkInfoProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<NetworkInfoProvider> create(C3351dc<Context> dcVar, C3351dc<ConnectivityManager> dcVar2) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(dcVar, dcVar2);
    }
}
