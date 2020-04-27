package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.mW;
import o.mZ;

public class RequestListUiConfig implements mW {
    private final List<mW> uiConfigs;

    private RequestListUiConfig(Builder builder) {
        this.uiConfigs = builder.uiConfigs;
    }

    @SuppressLint({"RestrictedApi"})
    public List<mW> getUiConfigs() {
        return mZ.m3800(this.uiConfigs, this);
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public List<mW> uiConfigs = new ArrayList();

        private void setUiConfigs(List<mW> list) {
            this.uiConfigs = list;
        }

        public void show(Context context, mW... mWVarArr) {
            context.startActivity(intent(context, mWVarArr));
        }

        public void show(Context context, List<mW> list) {
            context.startActivity(intent(context, list));
        }

        public Intent intent(Context context, mW... mWVarArr) {
            return intent(context, (List<mW>) Arrays.asList(mWVarArr));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<mW> list) {
            setUiConfigs(list);
            mW config = config();
            Intent intent = new Intent(context, RequestListActivity.class);
            mZ.m3801(intent, config);
            return intent;
        }

        public mW config() {
            return new RequestListUiConfig(this);
        }
    }
}
