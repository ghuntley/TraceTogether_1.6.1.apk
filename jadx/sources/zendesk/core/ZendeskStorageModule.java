package zendesk.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Locale;
import o.C3122;
import o.C3349da;
import o.C3356di;
import okhttp3.Cache;

class ZendeskStorageModule {
    private static final String STORAGE_BELVEDERE_CACHE;

    ZendeskStorageModule() {
    }

    static {
        StringBuilder sb = new StringBuilder("belvedere-data-v2");
        sb.append(File.separator);
        sb.append("user");
        sb.append(File.separator);
        sb.append("zendesk");
        STORAGE_BELVEDERE_CACHE = sb.toString();
    }

    @C3349da(m2095 = "cache_dir")
    @C3356di
    static File providesCacheDir(@C3349da(m2095 = "application_context") Context context) {
        return new File(context.getCacheDir(), "zendesk");
    }

    @C3349da(m2095 = "data_dir")
    @C3356di
    static File providesDataDir(@C3349da(m2095 = "application_context") Context context) {
        return new File(context.getFilesDir(), "zendesk");
    }

    @C3349da(m2095 = "belvedere_dir")
    @C3356di
    static File providesBelvedereDir(@C3349da(m2095 = "application_context") Context context) {
        return new File(context.getCacheDir(), STORAGE_BELVEDERE_CACHE);
    }

    @C3349da(m2095 = "gson_serializer")
    @C3356di
    static Serializer provideSerializer(C3122 r1) {
        return new GsonSerializer(r1);
    }

    @C3356di
    static Cache provideCache(@C3349da(m2095 = "cache_dir") File file) {
        return new Cache(new File(file, storageName("response_cache")), 20971520);
    }

    @C3356di
    static MemoryCache provideMemoryCache() {
        return new ZendeskLruMemoryCache();
    }

    @C3349da(m2095 = "base_storage_identity")
    @C3356di
    static BaseStorage provideIdentityBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("identity")), serializer);
    }

    @C3349da(m2095 = "base_storage_legacy_identity")
    @C3356di
    static SharedPreferencesStorage provideLegacyIdentityBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-token"), serializer);
    }

    @C3349da(m2095 = "base_storage_legacy_push")
    @C3356di
    static SharedPreferencesStorage provideLegacyPushBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-push-token"), serializer);
    }

    @C3349da(m2095 = "base_storage_settings")
    @C3356di
    static BaseStorage provideSettingsBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("settings")), serializer);
    }

    @C3349da(m2095 = "base_storage_additional_sdk")
    @C3356di
    static BaseStorage provideAdditionalSdkBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("additional_sdk")), serializer);
    }

    @C3349da(m2095 = "base_storage_sdk")
    @C3356di
    static BaseStorage provideSdkBaseStorage(@C3349da(m2095 = "application_context") Context context, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("sdk")), serializer);
    }

    @C3349da(m2095 = "base_storage_disk_lru")
    @C3356di
    static BaseStorage providesDiskLruStorage(@C3349da(m2095 = "cache_dir") File file, @C3349da(m2095 = "gson_serializer") Serializer serializer) {
        return new ZendeskDiskLruCache(new File(file, storageName("media_cache")), serializer, 20971520);
    }

    @C3356di
    static SettingsStorage provideSettingsStorage(@C3349da(m2095 = "base_storage_settings") BaseStorage baseStorage) {
        return new ZendeskSettingsStorage(baseStorage);
    }

    @C3356di
    static IdentityStorage provideIdentityStorage(@C3349da(m2095 = "base_storage_identity") BaseStorage baseStorage) {
        return new ZendeskIdentityStorage(baseStorage);
    }

    @C3356di
    static AuthenticationProvider provideAuthProvider(IdentityManager identityManager) {
        return new ZendeskAuthenticationProvider(identityManager);
    }

    @C3356di
    static CoreSettingsStorage provideCoreSettingsStorage(SettingsStorage settingsStorage) {
        return new ZendeskCoreSettingsStorage(settingsStorage);
    }

    @C3356di
    static LegacyIdentityMigrator provideLegacyIdentityStorage(@C3349da(m2095 = "base_storage_legacy_identity") SharedPreferencesStorage sharedPreferencesStorage, @C3349da(m2095 = "base_storage_legacy_push") SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        return new LegacyIdentityMigrator(sharedPreferencesStorage, sharedPreferencesStorage2, identityStorage, identityManager, pushDeviceIdStorage);
    }

    @C3356di
    static IdentityManager provideIdentityManager(IdentityStorage identityStorage) {
        return new ZendeskIdentityManager(identityStorage);
    }

    @C3356di
    static SessionStorage provideSessionStorage(IdentityStorage identityStorage, @C3349da(m2095 = "base_storage_additional_sdk") BaseStorage baseStorage, @C3349da(m2095 = "base_storage_disk_lru") BaseStorage baseStorage2, Cache cache, @C3349da(m2095 = "cache_dir") File file, @C3349da(m2095 = "data_dir") File file2, @C3349da(m2095 = "belvedere_dir") File file3) {
        return new ZendeskSessionStorage(identityStorage, baseStorage, cache, baseStorage2, file, file2, file3);
    }

    @C3356di
    static PushDeviceIdStorage providePushDeviceIdStorage(@C3349da(m2095 = "base_storage_additional_sdk") BaseStorage baseStorage) {
        return new ZendeskPushDeviceIdStorage(baseStorage);
    }

    @C3356di
    static Storage provideSdkStorage(SettingsStorage settingsStorage, SessionStorage sessionStorage, @C3349da(m2095 = "base_storage_sdk") BaseStorage baseStorage, MemoryCache memoryCache) {
        return new ZendeskStorage(sessionStorage, settingsStorage, baseStorage, memoryCache);
    }

    private static String storageName(String str) {
        return String.format(Locale.US, "zendesk_%s", new Object[]{str});
    }

    private static SharedPreferences getSharedPrefs(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }
}
