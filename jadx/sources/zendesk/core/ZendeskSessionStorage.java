package zendesk.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.F;
import o.O;
import okhttp3.Cache;

class ZendeskSessionStorage implements SessionStorage {
    private final BaseStorage additionalSdkStorage;
    private final IdentityStorage identityStorage;
    private final BaseStorage mediaCache;
    private final List<File> registeredFolders;
    private final Cache responseCache;
    private final File zendeskCacheDir;
    private final File zendeskDataDir;

    ZendeskSessionStorage(IdentityStorage identityStorage2, BaseStorage baseStorage, Cache cache, BaseStorage baseStorage2, File file, File file2, File file3) {
        this.identityStorage = identityStorage2;
        this.additionalSdkStorage = baseStorage;
        this.responseCache = cache;
        this.zendeskCacheDir = file;
        this.zendeskDataDir = file2;
        this.mediaCache = baseStorage2;
        this.registeredFolders = new ArrayList(Arrays.asList(new File[]{this.zendeskCacheDir, this.zendeskDataDir, file3}));
    }

    public BaseStorage getAdditionalSdkStorage() {
        return this.additionalSdkStorage;
    }

    public File getZendeskDataDir() {
        return createDirIfNotExists(this.zendeskDataDir);
    }

    public void clear() {
        this.identityStorage.clear();
        this.additionalSdkStorage.clear();
        this.mediaCache.clear();
        try {
            this.responseCache.evictAll();
        } catch (IOException unused) {
        }
        for (File clearDirectory : this.registeredFolders) {
            clearDirectory(clearDirectory);
        }
    }

    private File createDirIfNotExists(File file) {
        if (file.exists()) {
            Object[] objArr = {file.getAbsolutePath(), Boolean.valueOf(file.mkdirs())};
            F.m1359();
        }
        return file;
    }

    private static void clearDirectory(File file) {
        if (file != null && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && file.isDirectory() && O.m1397((Type[]) listFiles)) {
                for (File clearDirectory : listFiles) {
                    clearDirectory(clearDirectory);
                }
            }
            file.delete();
        }
    }
}
