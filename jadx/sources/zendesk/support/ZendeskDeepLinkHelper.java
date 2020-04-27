package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import o.mW;
import o.mZ;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.ViewArticleDeepLinkParser;

public class ZendeskDeepLinkHelper {
    private final ZendeskDeepLinkParser parser;
    private final ActionHandlerRegistry registry;

    ZendeskDeepLinkHelper(ActionHandlerRegistry actionHandlerRegistry, ZendeskDeepLinkParser zendeskDeepLinkParser) {
        this.registry = actionHandlerRegistry;
        this.parser = zendeskDeepLinkParser;
    }

    @SuppressLint({"RestrictedApi"})
    public boolean launch(String str, mW mWVar, Context context) {
        ActionHandler handlerByAction;
        ViewArticleDeepLinkParser.ActionPayload parse = this.parser.parse(str);
        if (!parse.isValid() || (handlerByAction = this.registry.handlerByAction(parse.getAction())) == null) {
            return false;
        }
        Map<String, Object> payload = parse.getPayload();
        mZ.m3802(payload, mWVar);
        handlerByAction.handle(payload, context);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void deepLinkToRequest(Intent intent, Context context, List<Intent> list) {
        ActionHandler handlerByAction = this.registry.handlerByAction("request_view_conversation");
        if (handlerByAction != null) {
            handlerByAction.handle(DeepLinkToRequestActionHandler.data(intent, list), context);
        }
    }
}
