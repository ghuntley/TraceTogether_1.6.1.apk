package zendesk.support;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C0656;
import o.mW;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;

class DeepLinkToRequestActionHandler implements ActionHandler {
    public int getPriority() {
        return 0;
    }

    DeepLinkToRequestActionHandler() {
    }

    static Map<String, Object> data(Intent intent, List<Intent> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_ui_config", intent);
        hashMap.put("back_stack_activities", list);
        return hashMap;
    }

    public boolean canHandle(String str) {
        return str.equals("request_view_conversation");
    }

    public void handle(Map<String, Object> map, Context context) {
        C0656 r0 = C0656.m5471(context);
        if (map != null) {
            for (Intent r2 : (List) map.get("back_stack_activities")) {
                r0.m5473(r2);
            }
        }
        r0.m5473(RequestListActivity.builder().intent(context, new mW[0]));
        if (map != null) {
            r0.m5473((Intent) map.get("request_ui_config"));
        }
        r0.m5474();
    }
}
