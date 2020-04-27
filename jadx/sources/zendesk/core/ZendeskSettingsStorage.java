package zendesk.core;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1367;
import o.P;

class ZendeskSettingsStorage implements SettingsStorage {
    private final BaseStorage settingsStorage;

    ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = this.settingsStorage.get(str, cls);
        }
        return e;
    }

    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    public void storeRawSettings(Map<String, C1367> map) {
        synchronized (this.settingsStorage) {
            this.settingsStorage.put("last_settings_update", (Object) Long.valueOf(System.currentTimeMillis()));
            for (Map.Entry next : map.entrySet()) {
                this.settingsStorage.put((String) next.getKey(), next.getValue());
            }
        }
    }

    public boolean hasStoredSettings() {
        boolean r1;
        synchronized (this.settingsStorage) {
            r1 = P.m1406(this.settingsStorage.get("last_settings_update"));
        }
        return r1;
    }

    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get("last_settings_update", Long.class);
        }
        if (!(l == null || l.longValue() == -1)) {
            if (System.currentTimeMillis() - l.longValue() < TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
                return true;
            }
        }
        return false;
    }
}
