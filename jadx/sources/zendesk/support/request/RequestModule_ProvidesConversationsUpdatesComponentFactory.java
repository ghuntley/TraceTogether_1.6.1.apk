package zendesk.support.request;

import android.content.Context;
import o.C3351dc;
import o.M;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestModule_ProvidesConversationsUpdatesComponentFactory implements M<ComponentUpdateActionHandlers> {
    private final C3351dc<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final C3351dc<Context> contextProvider;
    private final C3351dc<RequestInfoDataSource.LocalDataSource> requestInfoDataSourceProvider;

    public RequestModule_ProvidesConversationsUpdatesComponentFactory(C3351dc<Context> dcVar, C3351dc<ActionHandlerRegistry> dcVar2, C3351dc<RequestInfoDataSource.LocalDataSource> dcVar3) {
        this.contextProvider = dcVar;
        this.actionHandlerRegistryProvider = dcVar2;
        this.requestInfoDataSourceProvider = dcVar3;
    }

    public final ComponentUpdateActionHandlers get() {
        ComponentUpdateActionHandlers providesConversationsUpdatesComponent = RequestModule.providesConversationsUpdatesComponent(this.contextProvider.get(), this.actionHandlerRegistryProvider.get(), this.requestInfoDataSourceProvider.get());
        if (providesConversationsUpdatesComponent != null) {
            return providesConversationsUpdatesComponent;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<ComponentUpdateActionHandlers> create(C3351dc<Context> dcVar, C3351dc<ActionHandlerRegistry> dcVar2, C3351dc<RequestInfoDataSource.LocalDataSource> dcVar3) {
        return new RequestModule_ProvidesConversationsUpdatesComponentFactory(dcVar, dcVar2, dcVar3);
    }
}
