package zendesk.support;

import java.util.Locale;
import o.C3350db;
import o.F;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.support.ApplicationScope;

public enum Support {
    INSTANCE;
    
    @C3350db
    ActionHandlerRegistry actionHandlerRegistry;
    private ApplicationScope applicationScope;
    @C3350db
    AuthenticationProvider authenticationProvider;
    @C3350db
    SupportBlipsProvider blipsProvider;
    private Locale helpCenterLocaleOverride;
    private boolean initialised;
    @C3350db
    ProviderStore providerStore;
    @C3350db
    RequestMigrator requestMigrator;
    @C3350db
    RequestProvider requestProvider;
    @C3350db
    SupportModule supportModule;

    public final void init(Zendesk zendesk2) {
        if (zendesk2.isInitialized()) {
            initApplicationScope(zendesk2.coreModule(), new ApplicationScope.Builder().zendeskTracker(new AnswersTracker()).build());
            this.initialised = true;
            return;
        }
        F.m1358();
    }

    public final boolean isInitialized() {
        return this.initialised;
    }

    private void initApplicationScope(CoreModule coreModule, ApplicationScope applicationScope2) {
        this.applicationScope = applicationScope2;
        DaggerSupportSdkProvidersComponent.builder().coreModule(coreModule).providerModule(new ProviderModule()).storageModule(new StorageModule()).supportApplicationModule(new SupportApplicationModule(applicationScope2)).build().inject(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean isAuthenticated() {
        AuthenticationProvider authenticationProvider2 = this.authenticationProvider;
        return (authenticationProvider2 == null || authenticationProvider2.getIdentity() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final SupportModule getSupportModule() {
        return this.supportModule;
    }

    public final Locale getHelpCenterLocaleOverride() {
        return this.helpCenterLocaleOverride;
    }
}
