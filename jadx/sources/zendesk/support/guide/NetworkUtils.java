package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import o.F;

class NetworkUtils {
    static boolean isConnectedOrConnecting(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    static ConnectivityManager getConnectivityManager(Context context) {
        if (context == null) {
            F.m1361();
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            F.m1361();
        }
        return connectivityManager;
    }

    @SuppressLint({"MissingPermission"})
    static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (!(connectivityManager == null || context == null)) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                F.m1363();
                return connectivityManager.getActiveNetworkInfo();
            }
            F.m1361();
        }
        return null;
    }
}
