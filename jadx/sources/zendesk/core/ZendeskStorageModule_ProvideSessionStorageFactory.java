package zendesk.core;

import java.io.File;
import o.C3351dc;
import o.M;
import okhttp3.Cache;

public final class ZendeskStorageModule_ProvideSessionStorageFactory implements M<SessionStorage> {
    private final C3351dc<BaseStorage> additionalSdkStorageProvider;
    private final C3351dc<File> belvedereDirProvider;
    private final C3351dc<File> cacheDirProvider;
    private final C3351dc<Cache> cacheProvider;
    private final C3351dc<File> dataDirProvider;
    private final C3351dc<IdentityStorage> identityStorageProvider;
    private final C3351dc<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(C3351dc<IdentityStorage> dcVar, C3351dc<BaseStorage> dcVar2, C3351dc<BaseStorage> dcVar3, C3351dc<Cache> dcVar4, C3351dc<File> dcVar5, C3351dc<File> dcVar6, C3351dc<File> dcVar7) {
        this.identityStorageProvider = dcVar;
        this.additionalSdkStorageProvider = dcVar2;
        this.mediaCacheProvider = dcVar3;
        this.cacheProvider = dcVar4;
        this.cacheDirProvider = dcVar5;
        this.dataDirProvider = dcVar6;
        this.belvedereDirProvider = dcVar7;
    }

    public final SessionStorage get() {
        SessionStorage provideSessionStorage = ZendeskStorageModule.provideSessionStorage(this.identityStorageProvider.get(), this.additionalSdkStorageProvider.get(), this.mediaCacheProvider.get(), this.cacheProvider.get(), this.cacheDirProvider.get(), this.dataDirProvider.get(), this.belvedereDirProvider.get());
        if (provideSessionStorage != null) {
            return provideSessionStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SessionStorage> create(C3351dc<IdentityStorage> dcVar, C3351dc<BaseStorage> dcVar2, C3351dc<BaseStorage> dcVar3, C3351dc<Cache> dcVar4, C3351dc<File> dcVar5, C3351dc<File> dcVar6, C3351dc<File> dcVar7) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7);
    }
}
