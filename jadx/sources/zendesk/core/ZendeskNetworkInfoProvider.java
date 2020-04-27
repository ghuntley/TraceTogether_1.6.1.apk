package zendesk.core;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o.F;
import o.O;

class ZendeskNetworkInfoProvider implements NetworkInfoProvider, NetworkAware {
    private final BroadcastReceiver broadcastReceiver = new NetworkAvailabilityBroadcastReceiver();
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private CurrentState currentState = null;
    private boolean isBroadcastReceiverRegistered = false;
    private final Map<Integer, WeakReference<NetworkAware>> listeners = new HashMap();
    private ConnectivityManager.NetworkCallback networkCallback;
    private final Map<Integer, WeakReference<RetryAction>> retryActions = new HashMap();

    enum CurrentState {
        CONNECTED,
        DISCONNECTED
    }

    ZendeskNetworkInfoProvider(Context context2, ConnectivityManager connectivityManager2) {
        this.context = context2;
        this.connectivityManager = connectivityManager2;
    }

    public void register() {
        registerForNetworkCallbacks();
    }

    public void unregister() {
        unregisterForNetworkCallbacks();
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void addNetworkAwareListener(Integer num, NetworkAware networkAware) {
        if (num != null && networkAware != null) {
            this.listeners.put(num, new WeakReference(networkAware));
        }
    }

    public void removeNetworkAwareListener(Integer num) {
        this.listeners.remove(num);
    }

    public void addRetryAction(Integer num, RetryAction retryAction) {
        if (num != null && retryAction != null) {
            this.retryActions.put(num, new WeakReference(retryAction));
        }
    }

    public void removeRetryAction(Integer num) {
        this.retryActions.remove(num);
    }

    public void onNetworkAvailable() {
        if (CurrentState.CONNECTED != this.currentState && isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = CurrentState.CONNECTED;
            Map<Key, Value> r0 = O.m1396(this.listeners);
            Map<Key, Value> r1 = O.m1396(this.retryActions);
            for (Value value : r0.values()) {
                if (value.get() != null) {
                    ((NetworkAware) value.get()).onNetworkAvailable();
                }
            }
            for (Value value2 : r1.values()) {
                if (value2.get() != null) {
                    ((RetryAction) value2.get()).onRetry();
                }
            }
            this.retryActions.clear();
        }
    }

    public void onNetworkUnavailable() {
        if (CurrentState.DISCONNECTED != this.currentState && !isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = CurrentState.DISCONNECTED;
            for (Value value : O.m1396(this.listeners).values()) {
                if (value.get() != null) {
                    ((NetworkAware) value.get()).onNetworkUnavailable();
                }
            }
        }
    }

    private void registerForNetworkCallbacks() {
        if (Build.VERSION.SDK_INT < 21) {
            F.m1359();
            if (!this.isBroadcastReceiverRegistered) {
                this.context.registerReceiver(this.broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.isBroadcastReceiverRegistered = true;
                return;
            }
            return;
        }
        F.m1359();
        final Handler handler = new Handler(Looper.getMainLooper());
        this.networkCallback = new ConnectivityManager.NetworkCallback() {
            public void onAvailable(Network network) {
                handler.post(new Runnable() {
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkAvailable();
                    }
                });
            }

            public void onLost(Network network) {
                handler.post(new Runnable() {
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
                    }
                });
            }
        };
        this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this.networkCallback);
    }

    @TargetApi(21)
    private void unregisterForNetworkCallbacks() {
        ConnectivityManager.NetworkCallback networkCallback2;
        if (this.isBroadcastReceiverRegistered) {
            this.context.unregisterReceiver(this.broadcastReceiver);
            this.isBroadcastReceiverRegistered = false;
        }
        if (Build.VERSION.SDK_INT >= 21 && (networkCallback2 = this.networkCallback) != null) {
            this.connectivityManager.unregisterNetworkCallback(networkCallback2);
            this.networkCallback = null;
        }
    }

    private static boolean isConnectedOrConnecting(ConnectivityManager connectivityManager2) {
        NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    class NetworkAvailabilityBroadcastReceiver extends BroadcastReceiver {
        private final String LOG_TAG = "NetAvailabilityReceiver";

        NetworkAvailabilityBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                F.m1361();
            } else if (intent.getBooleanExtra("noConnectivity", false)) {
                ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
            } else {
                ZendeskNetworkInfoProvider.this.onNetworkAvailable();
            }
        }
    }
}
