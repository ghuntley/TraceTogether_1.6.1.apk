package zendesk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.P;

class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() {
        public final int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    ZendeskActionHandlerRegistry() {
    }

    public void add(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.add(actionHandler);
        }
    }

    public void remove(ActionHandler actionHandler) {
        if (actionHandler != null) {
            this.registry.remove(actionHandler);
        }
    }

    public ActionHandler handlerByAction(String str) {
        if (P.m1409(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList<>(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }
}
