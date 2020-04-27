package zendesk.core;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements M<SharedPreferencesStorage> {
    private final C3351dc<Context> contextProvider;
    private final C3351dc<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        this.contextProvider = dcVar;
        this.serializerProvider = dcVar2;
    }

    public final SharedPreferencesStorage get() {
        SharedPreferencesStorage provideLegacyPushBaseStorage = ZendeskStorageModule.provideLegacyPushBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
        if (provideLegacyPushBaseStorage != null) {
            return provideLegacyPushBaseStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SharedPreferencesStorage> create(C3351dc<Context> dcVar, C3351dc<Serializer> dcVar2) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(dcVar, dcVar2);
    }
}
