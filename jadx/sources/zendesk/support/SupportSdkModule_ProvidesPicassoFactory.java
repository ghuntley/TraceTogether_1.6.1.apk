package zendesk.support;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import o.C3351dc;
import o.C3616p;
import o.M;
import okhttp3.OkHttpClient;

public final class SupportSdkModule_ProvidesPicassoFactory implements M<C3616p> {
    private final C3351dc<Context> contextProvider;
    private final C3351dc<ExecutorService> executorServiceProvider;
    private final SupportSdkModule module;
    private final C3351dc<OkHttpClient> okHttpClientProvider;

    public SupportSdkModule_ProvidesPicassoFactory(SupportSdkModule supportSdkModule, C3351dc<Context> dcVar, C3351dc<OkHttpClient> dcVar2, C3351dc<ExecutorService> dcVar3) {
        this.module = supportSdkModule;
        this.contextProvider = dcVar;
        this.okHttpClientProvider = dcVar2;
        this.executorServiceProvider = dcVar3;
    }

    public final C3616p get() {
        C3616p providesPicasso = this.module.providesPicasso(this.contextProvider.get(), this.okHttpClientProvider.get(), this.executorServiceProvider.get());
        if (providesPicasso != null) {
            return providesPicasso;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<C3616p> create(SupportSdkModule supportSdkModule, C3351dc<Context> dcVar, C3351dc<OkHttpClient> dcVar2, C3351dc<ExecutorService> dcVar3) {
        return new SupportSdkModule_ProvidesPicassoFactory(supportSdkModule, dcVar, dcVar2, dcVar3);
    }
}
