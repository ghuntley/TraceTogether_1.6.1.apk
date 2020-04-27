package zendesk.core;

public interface NetworkInfoProvider {
    void addNetworkAwareListener(Integer num, NetworkAware networkAware);

    void addRetryAction(Integer num, RetryAction retryAction);

    boolean isNetworkAvailable();

    void register();

    void removeNetworkAwareListener(Integer num);

    void removeRetryAction(Integer num);

    void unregister();
}
