package zendesk.support;

import o.C3122;
import o.C3162;
import o.C3351dc;
import o.M;

public final class SupportSdkModule_SupportUIStorageFactory implements M<SupportUiStorage> {
    private final C3351dc<C3162> diskLruCacheProvider;
    private final C3351dc<C3122> gsonProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_SupportUIStorageFactory(SupportSdkModule supportSdkModule, C3351dc<C3162> dcVar, C3351dc<C3122> dcVar2) {
        this.module = supportSdkModule;
        this.diskLruCacheProvider = dcVar;
        this.gsonProvider = dcVar2;
    }

    public final SupportUiStorage get() {
        SupportUiStorage supportUIStorage = this.module.supportUIStorage(this.diskLruCacheProvider.get(), this.gsonProvider.get());
        if (supportUIStorage != null) {
            return supportUIStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportUiStorage> create(SupportSdkModule supportSdkModule, C3351dc<C3162> dcVar, C3351dc<C3122> dcVar2) {
        return new SupportSdkModule_SupportUIStorageFactory(supportSdkModule, dcVar, dcVar2);
    }
}
