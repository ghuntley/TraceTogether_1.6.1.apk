package zendesk.support.request;

import android.content.Context;
import o.C3351dc;
import o.C3616p;
import o.M;
import o.nk;
import zendesk.support.ZendeskDeepLinkHelper;

public final class RequestModule_ProvidesMessageFactoryFactory implements M<CellFactory> {
    private final C3351dc<ActionFactory> actionFactoryProvider;
    private final C3351dc<Context> contextProvider;
    private final C3351dc<ZendeskDeepLinkHelper> deepLinkHelperProvider;
    private final C3351dc<nk> dispatcherProvider;
    private final RequestModule module;
    private final C3351dc<C3616p> picassoProvider;

    public RequestModule_ProvidesMessageFactoryFactory(RequestModule requestModule, C3351dc<Context> dcVar, C3351dc<C3616p> dcVar2, C3351dc<ActionFactory> dcVar3, C3351dc<nk> dcVar4, C3351dc<ZendeskDeepLinkHelper> dcVar5) {
        this.module = requestModule;
        this.contextProvider = dcVar;
        this.picassoProvider = dcVar2;
        this.actionFactoryProvider = dcVar3;
        this.dispatcherProvider = dcVar4;
        this.deepLinkHelperProvider = dcVar5;
    }

    public final CellFactory get() {
        CellFactory providesMessageFactory = this.module.providesMessageFactory(this.contextProvider.get(), this.picassoProvider.get(), this.actionFactoryProvider.get(), this.dispatcherProvider.get(), this.deepLinkHelperProvider.get());
        if (providesMessageFactory != null) {
            return providesMessageFactory;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<CellFactory> create(RequestModule requestModule, C3351dc<Context> dcVar, C3351dc<C3616p> dcVar2, C3351dc<ActionFactory> dcVar3, C3351dc<nk> dcVar4, C3351dc<ZendeskDeepLinkHelper> dcVar5) {
        return new RequestModule_ProvidesMessageFactoryFactory(requestModule, dcVar, dcVar2, dcVar3, dcVar4, dcVar5);
    }
}
