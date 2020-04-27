package zendesk.core;

import java.io.File;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements M<BaseStorage> {
    private final C3351dc<File> fileProvider;
    private final C3351dc<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(C3351dc<File> dcVar, C3351dc<Serializer> dcVar2) {
        this.fileProvider = dcVar;
        this.serializerProvider = dcVar2;
    }

    public final BaseStorage get() {
        BaseStorage providesDiskLruStorage = ZendeskStorageModule.providesDiskLruStorage(this.fileProvider.get(), this.serializerProvider.get());
        if (providesDiskLruStorage != null) {
            return providesDiskLruStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BaseStorage> create(C3351dc<File> dcVar, C3351dc<Serializer> dcVar2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(dcVar, dcVar2);
    }
}
