package zendesk.support;

import java.util.List;
import java.util.Map;
import o.O;
import o.P;
import okhttp3.HttpUrl;
import zendesk.support.ZendeskDeepLinkParser;

class ViewArticleDeepLinkParser implements ZendeskDeepLinkParser.Module {
    ViewArticleDeepLinkParser() {
    }

    public ActionPayload parse(HttpUrl httpUrl) {
        String str;
        List<String> pathSegments = httpUrl.pathSegments();
        if (pathSegments.size() < 4 && pathSegments.size() > 5) {
            return ActionPayload.invalid("help_center_view_article");
        }
        int indexOf = pathSegments.indexOf("articles");
        if ("hc".equals(pathSegments.get(0))) {
            if (indexOf == 1 || indexOf == 2) {
                if (indexOf + 2 != pathSegments.size()) {
                    return ActionPayload.invalid("help_center_view_article");
                }
                String str2 = pathSegments.get(indexOf + 1);
                String[] split = str2.split("-");
                if (O.m1400((Type[]) split)) {
                    return ActionPayload.invalid("help_center_view_article");
                }
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(split[0]));
                    StringBuilder sb = new StringBuilder(str2.length());
                    if (split.length > 1) {
                        int length = split.length;
                        for (int i = 1; i < length; i++) {
                            sb.append(split[i]);
                            sb.append(' ');
                        }
                        str = sb.toString().trim();
                    } else {
                        str = "";
                    }
                    return ActionPayload.valid("help_center_view_article", ViewArticleActionHandler.data(valueOf.longValue(), str));
                } catch (NumberFormatException unused) {
                    return ActionPayload.invalid("help_center_view_article");
                }
            }
        }
        return ActionPayload.invalid("help_center_view_article");
    }

    static class ActionPayload {
        private final String action;
        private final Map<String, Object> payload;

        static ActionPayload invalid() {
            return new ActionPayload((String) null, (Map<String, Object>) null);
        }

        static ActionPayload invalid(String str) {
            return new ActionPayload(str, (Map<String, Object>) null);
        }

        static ActionPayload valid(String str, Map<String, Object> map) {
            return new ActionPayload(str, map);
        }

        private ActionPayload(String str, Map<String, Object> map) {
            this.action = str;
            this.payload = map;
        }

        public String getAction() {
            return this.action;
        }

        public Map<String, Object> getPayload() {
            return this.payload;
        }

        public boolean isValid() {
            return P.m1406(this.action) && this.payload != null;
        }
    }
}
