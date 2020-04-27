package zendesk.core;

public interface ActionHandlerRegistry {
    void add(ActionHandler actionHandler);

    ActionHandler handlerByAction(String str);

    void remove(ActionHandler actionHandler);
}
