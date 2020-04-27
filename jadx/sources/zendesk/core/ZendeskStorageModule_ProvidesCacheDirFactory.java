package zendesk.core;

import android.content.Context;
import java.io.File;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvidesCacheDirFactory implements M<File> {
    private final C3351dc<Context> contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final File get() {
        File providesCacheDir = ZendeskStorageModule.providesCacheDir(this.contextProvider.get());
        if (providesCacheDir != null) {
            return providesCacheDir;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<File> create(C3351dc<Context> dcVar) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(dcVar);
    }
}
