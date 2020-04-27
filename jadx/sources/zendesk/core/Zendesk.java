package zendesk.core;

import android.content.Context;
import o.F;
import o.P;

public enum Zendesk {
    INSTANCE;
    
    private ActionHandlerRegistry actionHandlerRegistry;
    private ZendeskShadow zendeskShadow;

    public final void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    /* access modifiers changed from: package-private */
    public final void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        boolean z = this.zendeskShadow != null;
        if (z) {
            this.zendeskShadow.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow2 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow2.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow2;
    }

    public final boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null) {
            if (P.m1411(str, str2, str3)) {
                return true;
            }
        }
        Object[] objArr = {context, Boolean.valueOf(P.m1406(str)), Boolean.valueOf(P.m1406(str2)), Boolean.valueOf(P.m1406(str3))};
        F.m1358();
        return false;
    }

    public final ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public final CoreModule coreModule() {
        return this.zendeskShadow.coreModule();
    }

    public final void setIdentity(Identity identity) {
        if (!isInitialized()) {
            F.m1358();
        } else {
            this.zendeskShadow.setIdentity(identity);
        }
    }
}
