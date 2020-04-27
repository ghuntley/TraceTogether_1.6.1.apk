package zendesk.support;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.P;

public class HelpCenterLocaleConverter {
    private static final Map<String, String> forwardLookupMap;

    static {
        HashMap hashMap = new HashMap();
        forwardLookupMap = hashMap;
        hashMap.put("iw", "he");
        forwardLookupMap.put("nb", "no");
        forwardLookupMap.put("in", "id");
        forwardLookupMap.put("ji", "yi");
    }

    public String toHelpCenterLocaleString(Locale locale) {
        if (!(locale != null && P.m1406(locale.getLanguage()))) {
            locale = Locale.getDefault();
        }
        String str = forwardLookupMap.get(locale.getLanguage());
        if (!P.m1406(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb = new StringBuilder(str);
        if (P.m1406(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        return sb.toString().toLowerCase();
    }
}
