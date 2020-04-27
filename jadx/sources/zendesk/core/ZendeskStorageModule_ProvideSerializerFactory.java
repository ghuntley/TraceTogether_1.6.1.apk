package zendesk.core;

import o.C3122;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvideSerializerFactory implements M<Serializer> {
    private final C3351dc<C3122> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(C3351dc<C3122> dcVar) {
        this.gsonProvider = dcVar;
    }

    public final Serializer get() {
        Serializer provideSerializer = ZendeskStorageModule.provideSerializer(this.gsonProvider.get());
        if (provideSerializer != null) {
            return provideSerializer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Serializer> create(C3351dc<C3122> dcVar) {
        return new ZendeskStorageModule_ProvideSerializerFactory(dcVar);
    }
}
