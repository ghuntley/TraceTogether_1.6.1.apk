package zendesk.core;

import o.M;

public final class CoreModule_GetNetworkInfoProviderFactory implements M<NetworkInfoProvider> {
    private final CoreModule module;

    public final NetworkInfoProvider get() {
        NetworkInfoProvider networkInfoProvider = this.module.getNetworkInfoProvider();
        if (networkInfoProvider != null) {
            return networkInfoProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static NetworkInfoProvider proxyGetNetworkInfoProvider(CoreModule coreModule) {
        return coreModule.getNetworkInfoProvider();
    }
}
