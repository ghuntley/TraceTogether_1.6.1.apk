package zendesk.support.request;

import android.content.Context;
import o.C3351dc;
import o.C3602mo;
import o.M;

public final class RequestModule_ProvidesBelvedereFactory implements M<C3602mo> {
    private final C3351dc<Context> contextProvider;

    public RequestModule_ProvidesBelvedereFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final C3602mo get() {
        C3602mo providesBelvedere = RequestModule.providesBelvedere(this.contextProvider.get());
        if (providesBelvedere != null) {
            return providesBelvedere;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<C3602mo> create(C3351dc<Context> dcVar) {
        return new RequestModule_ProvidesBelvedereFactory(dcVar);
    }
}
