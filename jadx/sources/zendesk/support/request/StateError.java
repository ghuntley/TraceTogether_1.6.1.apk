package zendesk.support.request;

import java.io.Serializable;
import o.nt;

class StateError implements Serializable {
    private final String message;
    private final ErrorType state;

    enum ErrorType {
        InitialGetComments,
        InputFormSubmission,
        NoAccess,
        NoError
    }

    static StateError fromState(nt ntVar) {
        Class<StateError> cls = StateError.class;
        Object obj = ntVar.f3432.get(cls.getSimpleName());
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        StateError stateError = (StateError) obj;
        if (stateError != null) {
            return stateError;
        }
        return new StateError();
    }

    StateError() {
        this(ErrorType.NoError, "=)");
    }

    StateError(ErrorType errorType, String str) {
        this.state = errorType;
        this.message = str;
    }

    /* access modifiers changed from: package-private */
    public ErrorType getState() {
        return this.state;
    }

    /* access modifiers changed from: package-private */
    public String getMessage() {
        return this.message;
    }
}
