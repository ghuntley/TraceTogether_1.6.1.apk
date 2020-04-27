package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements M<PushDeviceIdStorage> {
    private final C3351dc<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(C3351dc<BaseStorage> dcVar) {
        this.additionalSdkStorageProvider = dcVar;
    }

    public final PushDeviceIdStorage get() {
        PushDeviceIdStorage providePushDeviceIdStorage = ZendeskStorageModule.providePushDeviceIdStorage(this.additionalSdkStorageProvider.get());
        if (providePushDeviceIdStorage != null) {
            return providePushDeviceIdStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<PushDeviceIdStorage> create(C3351dc<BaseStorage> dcVar) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(dcVar);
    }
}
