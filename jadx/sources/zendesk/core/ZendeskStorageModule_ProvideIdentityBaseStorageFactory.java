package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideIdentityBaseStorageFactory implements M<BaseStorage> {
    private final C3351dc<Context> contextProvider;
    private final C3351dc<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideIdentityBaseStorageFactory(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        this.contextProvider = dcVar;
        this.serializerProvider = dcVar2;
    }

    public final BaseStorage get() {
        BaseStorage provideIdentityBaseStorage = ZendeskStorageModule.provideIdentityBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
        if (provideIdentityBaseStorage != null) {
            return provideIdentityBaseStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BaseStorage> create(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        return new ZendeskStorageModule_ProvideIdentityBaseStorageFactory(dcVar, dcVar2);
    }
}
