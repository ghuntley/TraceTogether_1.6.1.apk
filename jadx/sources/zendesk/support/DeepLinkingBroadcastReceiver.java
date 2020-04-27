package zendesk.support;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import o.C3350db;
import o.F;

public class DeepLinkingBroadcastReceiver extends BroadcastReceiver {
    @C3350db
    ZendeskDeepLinkHelper deepLinkHelper;

    public void onReceive(Context context, Intent intent) {
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            F.m1358();
            return;
        }
        SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_follow_up_activities");
        this.deepLinkHelper.deepLinkToRequest((Intent) intent.getParcelableExtra("extra_request_intent"), context, parcelableArrayListExtra);
    }
}
