package zendesk.core;

import o.G;

public interface SettingsProvider {
    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, G<SettingsPack<E>> g);
}
