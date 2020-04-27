package zendesk.support;

import android.content.Context;
import o.C3351dc;
import o.M;

public final class SupportApplicationModule_ProvideMetadataFactory implements M<SupportSdkMetadata> {
    private final C3351dc<Context> contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, C3351dc<Context> dcVar) {
        this.module = supportApplicationModule;
        this.contextProvider = dcVar;
    }

    public final SupportSdkMetadata get() {
        SupportSdkMetadata provideMetadata = this.module.provideMetadata(this.contextProvider.get());
        if (provideMetadata != null) {
            return provideMetadata;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<SupportSdkMetadata> create(SupportApplicationModule supportApplicationModule, C3351dc<Context> dcVar) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, dcVar);
    }
}
