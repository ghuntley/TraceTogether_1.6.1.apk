package zendesk.support;

import java.util.Locale;
import o.M;

public final class SupportApplicationModule_ProvideLocaleFactory implements M<Locale> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public final Locale get() {
        Locale provideLocale = this.module.provideLocale();
        if (provideLocale != null) {
            return provideLocale;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<Locale> create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }
}
