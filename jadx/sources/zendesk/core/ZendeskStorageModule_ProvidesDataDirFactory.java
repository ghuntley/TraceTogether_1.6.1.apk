package zendesk.core;

import android.content.Context;
import java.io.File;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvidesDataDirFactory implements M<File> {
    private final C3351dc<Context> contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final File get() {
        File providesDataDir = ZendeskStorageModule.providesDataDir(this.contextProvider.get());
        if (providesDataDir != null) {
            return providesDataDir;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<File> create(C3351dc<Context> dcVar) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(dcVar);
    }
}
