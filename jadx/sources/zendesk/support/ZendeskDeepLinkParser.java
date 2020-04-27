package zendesk.support;

import java.util.List;
import o.O;
import o.P;
import okhttp3.HttpUrl;
import zendesk.support.ViewArticleDeepLinkParser;

class ZendeskDeepLinkParser {
    private final List<Module> modules;
    private final String zendeskHost;

    public interface Module {
        ViewArticleDeepLinkParser.ActionPayload parse(HttpUrl httpUrl);
    }

    ZendeskDeepLinkParser(String str, List<Module> list) {
        HttpUrl parse = HttpUrl.parse(str);
        this.zendeskHost = parse != null ? parse.host() : null;
        this.modules = O.m1403(list);
    }

    public ViewArticleDeepLinkParser.ActionPayload parse(String str) {
        if (!P.m1411(this.zendeskHost, str)) {
            return ViewArticleDeepLinkParser.ActionPayload.invalid();
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null || !parse.host().equals(this.zendeskHost)) {
            return ViewArticleDeepLinkParser.ActionPayload.invalid();
        }
        for (Module parse2 : this.modules) {
            ViewArticleDeepLinkParser.ActionPayload parse3 = parse2.parse(parse);
            if (parse3.isValid()) {
                return parse3;
            }
        }
        return ViewArticleDeepLinkParser.ActionPayload.invalid();
    }
}
