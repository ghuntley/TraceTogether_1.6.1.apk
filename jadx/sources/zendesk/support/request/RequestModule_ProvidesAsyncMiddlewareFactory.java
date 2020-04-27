package zendesk.support.request;

import o.M;

public final class RequestModule_ProvidesAsyncMiddlewareFactory implements M<AsyncMiddleware> {
    private static final RequestModule_ProvidesAsyncMiddlewareFactory INSTANCE = new RequestModule_ProvidesAsyncMiddlewareFactory();

    public final AsyncMiddleware get() {
        AsyncMiddleware providesAsyncMiddleware = RequestModule.providesAsyncMiddleware();
        if (providesAsyncMiddleware != null) {
            return providesAsyncMiddleware;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<AsyncMiddleware> create() {
        return INSTANCE;
    }
}
