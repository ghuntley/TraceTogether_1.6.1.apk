package zendesk.support.request;

import java.util.List;
import o.M;
import o.np;

public final class RequestModule_ProvidesReducerFactory implements M<List<np>> {
    private static final RequestModule_ProvidesReducerFactory INSTANCE = new RequestModule_ProvidesReducerFactory();

    public final List<np> get() {
        List<np> providesReducer = RequestModule.providesReducer();
        if (providesReducer != null) {
            return providesReducer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<List<np>> create() {
        return INSTANCE;
    }
}
