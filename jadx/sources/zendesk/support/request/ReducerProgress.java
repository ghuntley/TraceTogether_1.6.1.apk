package zendesk.support.request;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import o.nc;
import o.np;

class ReducerProgress extends np<StateProgress> {
    private static final Collection<String> DECREMENT_ACTION = new HashSet(Arrays.asList(new String[]{"CREATE_COMMENT_ERROR", "CREATE_COMMENT_SUCCESS", "LOAD_SETTINGS_ERROR", "LOAD_SETTINGS_SUCCESS", "CREATE_REQUEST_ERROR", "CREATE_REQUEST_SUCCESS", "LOAD_COMMENTS_INITIAL_ERROR", "LOAD_COMMENTS_INITIAL_SUCCESS", "LOAD_COMMENTS_FROM_CACHE_SUCCESS", "LOAD_COMMENTS_FROM_CACHE_ERROR", "LOAD_REQUEST_ERROR", "LOAD_REQUEST_SUCCESS", "SKIP_ACTION"}));
    private static final Collection<String> INCREMENT_ACTIONS = new HashSet(Arrays.asList(new String[]{"CREATE_COMMENT", "LOAD_SETTINGS", "LOAD_COMMENTS_FROM_CACHE", "LOAD_COMMENT_INITIAL", "LOAD_REQUEST"}));

    ReducerProgress() {
    }

    public StateProgress reduce(StateProgress stateProgress, nc<?> ncVar) {
        if (INCREMENT_ACTIONS.contains(ncVar.getActionType())) {
            return stateProgress.increment();
        }
        if (DECREMENT_ACTION.contains(ncVar.getActionType())) {
            return stateProgress.decrement();
        }
        return null;
    }

    public StateProgress getInitialState() {
        return new StateProgress();
    }
}
