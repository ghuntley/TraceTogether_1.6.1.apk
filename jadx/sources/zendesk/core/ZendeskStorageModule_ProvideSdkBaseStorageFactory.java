package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideSdkBaseStorageFactory implements M<BaseStorage> {
    private final C3351dc<Context> contextProvider;
    private final C3351dc<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSdkBaseStorageFactory(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        this.contextProvider = dcVar;
        this.serializerProvider = dcVar2;
    }

    public final BaseStorage get() {
        BaseStorage provideSdkBaseStorage = ZendeskStorageModule.provideSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
        if (provideSdkBaseStorage != null) {
            return provideSdkBaseStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<BaseStorage> create(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        return new ZendeskStorageModule_ProvideSdkBaseStorageFactory(dcVar, dcVar2);
    }
}
