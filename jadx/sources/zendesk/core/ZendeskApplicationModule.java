package zendesk.core;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.C2700;
import o.C3042;
import o.C3101;
import o.C3118;
import o.C3122;
import o.C3349da;
import o.C3356di;
import o.F;
import o.H;
import o.bW;
import okhttp3.logging.HttpLoggingInterceptor;

class ZendeskApplicationModule {
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    ZendeskApplicationModule(Context context2, ApplicationConfiguration applicationConfiguration2) {
        this.context = context2.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration2;
    }

    /* access modifiers changed from: package-private */
    @C3349da(m2095 = "base_64_serializer")
    public Serializer provideBase64Serializer(@C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    /* access modifiers changed from: package-private */
    @C3349da(m2095 = "application_context")
    @C3356di
    public Context provideApplicationContext() {
        return this.context;
    }

    /* access modifiers changed from: package-private */
    @C3356di
    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    static C3122 provideGson() {
        bW bWVar = new bW();
        bWVar.f1716 = C3118.f14238;
        int[] iArr = {128, 8};
        C3042 r3 = bWVar.f1717.clone();
        r3.f13955 = 0;
        for (int i = 0; i < 2; i++) {
            r3.f13955 = iArr[i] | r3.f13955;
        }
        bWVar.f1717 = r3;
        bWVar.f1718.add(C2700.m14317(C3101.get((Type) Date.class), new H()));
        return bWVar.m1733();
    }

    @C3356di
    static DeviceInfo provideDeviceInfo(@C3349da(m2095 = "application_context") Context context2) {
        return new DeviceInfo(context2);
    }

    static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        F.m1360();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    @C3356di
    static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    @C3356di
    static ExecutorService provideExecutor() {
        return Executors.newCachedThreadPool(new ThreadFactory() {
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", new Object[]{Integer.valueOf(this.atomicInteger.getAndIncrement())}));
                thread.setPriority(10);
                return thread;
            }
        });
    }
}
