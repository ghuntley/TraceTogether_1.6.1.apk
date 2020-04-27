package zendesk.core;

import android.content.SharedPreferences;
import o.P;

class SharedPreferencesStorage implements BaseStorage {
    private final Serializer serializer;
    private final SharedPreferences sharedPreferences;

    SharedPreferencesStorage(SharedPreferences sharedPreferences2, Serializer serializer2) {
        this.sharedPreferences = sharedPreferences2;
        this.serializer = serializer2;
    }

    public void put(String str, String str2) {
        if (P.m1406(str)) {
            this.sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public void put(String str, Object obj) {
        if (P.m1406(str)) {
            String str2 = null;
            if (obj != null) {
                str2 = this.serializer.serialize(obj);
            }
            put(str, str2);
        }
    }

    public String get(String str) {
        return this.sharedPreferences.getString(str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public long getLong(String str) {
        return this.sharedPreferences.getLong(str, 0);
    }

    public <E> E get(String str, Class<E> cls) {
        return this.serializer.deserialize(get(str), cls);
    }

    public void remove(String str) {
        if (P.m1406(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }
}
