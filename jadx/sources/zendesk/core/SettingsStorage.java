package zendesk.core;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1367;

interface SettingsStorage {
    boolean areSettingsUpToDate(long j, TimeUnit timeUnit);

    void clear();

    <E> E getSettings(String str, Class<E> cls);

    boolean hasStoredSettings();

    void storeRawSettings(Map<String, C1367> map);
}
