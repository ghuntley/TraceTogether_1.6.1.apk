package zendesk.support;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o.F;
import o.P;

class LegacyRequestMigrator implements RequestMigrator {
    private SharedPreferences legacyRequestStorage;

    LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    public List<RequestData> getLegacyRequests() {
        String string = this.legacyRequestStorage.getString("stored_requests", (String) null);
        if (P.m1409(string)) {
            return Collections.emptyList();
        }
        F.m1359();
        List<String> r0 = P.m1408(string);
        ArrayList arrayList = new ArrayList(r0.size());
        for (String next : r0) {
            int i = this.legacyRequestStorage.getInt(getCommentCountKey(next), -1);
            if (i >= 0) {
                arrayList.add(RequestData.create(next, i, 0));
            } else {
                arrayList.add(RequestData.create(next, 0, 0));
            }
        }
        return arrayList;
    }

    private String getCommentCountKey(String str) {
        return String.format(Locale.US, "%s-%s", new Object[]{"request-id-cc", str});
    }
}
