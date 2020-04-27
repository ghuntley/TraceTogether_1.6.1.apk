package zendesk.core;

import o.C3351dc;
import o.M;

public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements M<Serializer> {
    private final C3351dc<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, C3351dc<Serializer> dcVar) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = dcVar;
    }

    public final Serializer get() {
        Serializer provideBase64Serializer = this.module.provideBase64Serializer(this.gsonSerializerProvider.get());
        if (provideBase64Serializer != null) {
            return provideBase64Serializer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Serializer> create(ZendeskApplicationModule zendeskApplicationModule, C3351dc<Serializer> dcVar) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, dcVar);
    }
}
