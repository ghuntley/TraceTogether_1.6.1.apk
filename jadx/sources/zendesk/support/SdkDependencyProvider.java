package zendesk.support;

import android.annotation.SuppressLint;
import java.util.List;
import java.util.UUID;
import o.C3350db;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.Zendesk;

public enum SdkDependencyProvider {
    INSTANCE;
    
    @C3350db
    List<ActionHandler> actionHandlers;
    private UUID id;
    @C3350db
    ActionHandlerRegistry registry;
    private SupportSdkComponent supportSdkComponent;

    @SuppressLint({"RestrictedApi"})
    public final SupportSdkComponent provideSupportSdkComponent() {
        SupportModule supportModule = Support.INSTANCE.getSupportModule();
        UUID id2 = supportModule.getId();
        if (this.supportSdkComponent == null || !id2.equals(this.id)) {
            this.supportSdkComponent = DaggerSupportSdkComponent.builder().coreModule(Zendesk.INSTANCE.coreModule()).supportModule(supportModule).supportSdkModule(new SupportSdkModule()).build();
            this.id = supportModule.getId();
            this.supportSdkComponent.inject(this);
            registerActionHandlers();
        }
        return this.supportSdkComponent;
    }

    public final boolean isInitialized() {
        return Zendesk.INSTANCE.isInitialized() && Support.INSTANCE.isInitialized() && Support.INSTANCE.isAuthenticated();
    }

    private void registerActionHandlers() {
        for (ActionHandler add : this.actionHandlers) {
            this.registry.add(add);
        }
    }
}
