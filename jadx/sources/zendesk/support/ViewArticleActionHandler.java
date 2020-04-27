package zendesk.support;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.F;
import o.mW;
import o.mZ;
import zendesk.core.ActionHandler;
import zendesk.support.guide.ViewArticleActivity;

class ViewArticleActionHandler implements ActionHandler {
    public int getPriority() {
        return 0;
    }

    ViewArticleActionHandler() {
    }

    public static Map<String, Object> data(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("help_center_article_id", Long.valueOf(j));
        hashMap.put("help_center_article_title", str);
        return hashMap;
    }

    public boolean canHandle(String str) {
        return str.equals("help_center_view_article");
    }

    public void handle(Map<String, Object> map, Context context) {
        List<mW> list;
        if (map == null) {
            F.m1361();
            return;
        }
        long longValue = ((Long) map.get("help_center_article_id")).longValue();
        mW r4 = mZ.m3804(map, mW.class);
        if (r4 != null) {
            list = r4.getUiConfigs();
        } else {
            list = Collections.emptyList();
        }
        ViewArticleActivity.builder(longValue).show(context, list);
    }
}
