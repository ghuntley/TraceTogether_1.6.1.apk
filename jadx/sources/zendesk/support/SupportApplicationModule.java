package zendesk.support;

import android.content.Context;
import java.util.Locale;
import o.C3356di;

class SupportApplicationModule {
    private ApplicationScope applicationScope;

    SupportApplicationModule(ApplicationScope applicationScope2) {
        this.applicationScope = applicationScope2;
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public Locale provideLocale() {
        return this.applicationScope.getLocale();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ZendeskTracker providesZendeskTracker() {
        return this.applicationScope.getZendeskTracker();
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public SupportSdkMetadata provideMetadata(Context context) {
        return new SupportSdkMetadata(context);
    }
}
