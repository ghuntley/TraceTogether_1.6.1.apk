package zendesk.core;

import o.M;

public final class CoreModule_GetAuthenticationProviderFactory implements M<AuthenticationProvider> {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public final AuthenticationProvider get() {
        AuthenticationProvider authenticationProvider = this.module.getAuthenticationProvider();
        if (authenticationProvider != null) {
            return authenticationProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AuthenticationProvider> create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider proxyGetAuthenticationProvider(CoreModule coreModule) {
        return coreModule.getAuthenticationProvider();
    }
}
