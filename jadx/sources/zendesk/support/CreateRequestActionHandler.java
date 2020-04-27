package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;
import o.F;
import o.mW;
import o.mZ;
import zendesk.core.ActionHandler;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;

public final class CreateRequestActionHandler implements ActionHandler {
    private final Context context;

    public final int getPriority() {
        return 0;
    }

    CreateRequestActionHandler(Context context2) {
        this.context = context2;
    }

    public final boolean canHandle(String str) {
        return isInitialized() && "action_contact_option".equals(str);
    }

    @SuppressLint({"RestrictedApi"})
    public final void handle(Map<String, Object> map, Context context2) {
        if (isInitialized()) {
            List<mW> extractConfigs = extractConfigs(map);
            if (extractConfigs != null) {
                RequestActivity.builder().show(context2, extractConfigs);
            } else {
                RequestActivity.builder().show(context2, new mW[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"RestrictedApi"})
    public final List<mW> extractConfigs(Map<String, Object> map) {
        mW r2 = mZ.m3804(map, mW.class);
        if (r2 != null) {
            return r2.getUiConfigs();
        }
        return null;
    }

    private static boolean isInitialized() {
        if (Support.INSTANCE.isInitialized() && Zendesk.INSTANCE.isInitialized()) {
            return true;
        }
        F.m1361();
        return false;
    }
}
