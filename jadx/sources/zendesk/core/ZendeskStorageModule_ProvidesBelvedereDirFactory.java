package zendesk.core;

import android.content.Context;
import java.io.File;
import o.C3351dc;
import o.M;

public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements M<File> {
    private final C3351dc<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(C3351dc<Context> dcVar) {
        this.contextProvider = dcVar;
    }

    public final File get() {
        File providesBelvedereDir = ZendeskStorageModule.providesBelvedereDir(this.contextProvider.get());
        if (providesBelvedereDir != null) {
            return providesBelvedereDir;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static M<File> create(C3351dc<Context> dcVar) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(dcVar);
    }
}
