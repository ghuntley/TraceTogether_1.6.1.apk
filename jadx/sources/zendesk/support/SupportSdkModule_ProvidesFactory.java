package zendesk.support;

import o.C3122;
import o.M;

public final class SupportSdkModule_ProvidesFactory implements M<C3122> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public final C3122 get() {
        C3122 provides = this.module.provides();
        if (provides != null) {
            return provides;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<C3122> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesFactory(supportSdkModule);
    }
}
