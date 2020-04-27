package zendesk.support.request;

import o.np;

class ReducerError extends np<StateError> {
    ReducerError() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateError reduce(zendesk.support.request.StateError r9, o.nc<?> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zendesk.support.request.ActionFactory.ErrorAction
            if (r0 == 0) goto L_0x0025
            r0 = r10
            zendesk.support.request.ActionFactory$ErrorAction r0 = (zendesk.support.request.ActionFactory.ErrorAction) r0
            o.C r0 = r0.getErrorResponse()
            boolean r1 = r0.m1277()
            if (r1 == 0) goto L_0x0025
            int r1 = r0.m1276()
            r2 = 401(0x191, float:5.62E-43)
            if (r1 != r2) goto L_0x0025
            zendesk.support.request.StateError r9 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r10 = zendesk.support.request.StateError.ErrorType.NoAccess
            java.lang.String r0 = r0.m1280()
            r9.<init>(r10, r0)
            return r9
        L_0x0025:
            java.lang.String r0 = r10.getActionType()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1193398337: goto L_0x0069;
                case -1063298693: goto L_0x005f;
                case -292168757: goto L_0x0055;
                case -16010570: goto L_0x004b;
                case 1532422677: goto L_0x0041;
                case 1921186300: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0072
        L_0x0037:
            java.lang.String r2 = "CREATE_COMMENT"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 5
            goto L_0x0072
        L_0x0041:
            java.lang.String r2 = "CREATE_REQUEST_ERROR"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 4
            goto L_0x0072
        L_0x004b:
            java.lang.String r2 = "LOAD_COMMENTS_INITIAL_SUCCESS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 2
            goto L_0x0072
        L_0x0055:
            java.lang.String r2 = "LOAD_COMMENT_INITIAL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0072
        L_0x005f:
            java.lang.String r2 = "LOAD_COMMENTS_INITIAL_ERROR"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 0
            goto L_0x0072
        L_0x0069:
            java.lang.String r2 = "LOAD_COMMENTS_UPDATE_SUCCESS"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0072
            r1 = 3
        L_0x0072:
            if (r1 == 0) goto L_0x007f
            if (r1 == r7) goto L_0x0095
            if (r1 == r6) goto L_0x0095
            if (r1 == r5) goto L_0x0095
            if (r1 == r4) goto L_0x00a3
            if (r1 == r3) goto L_0x00b9
            goto L_0x00c7
        L_0x007f:
            boolean r0 = r10 instanceof zendesk.support.request.ActionFactory.ErrorAction
            if (r0 == 0) goto L_0x0095
            zendesk.support.request.ActionFactory$ErrorAction r10 = (zendesk.support.request.ActionFactory.ErrorAction) r10
            o.C r9 = r10.getErrorResponse()
            zendesk.support.request.StateError r10 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r0 = zendesk.support.request.StateError.ErrorType.InitialGetComments
            java.lang.String r9 = r9.m1280()
            r10.<init>(r0, r9)
            return r10
        L_0x0095:
            zendesk.support.request.StateError$ErrorType r0 = r9.getState()
            zendesk.support.request.StateError$ErrorType r1 = zendesk.support.request.StateError.ErrorType.InitialGetComments
            if (r0 != r1) goto L_0x00a3
            zendesk.support.request.StateError r9 = new zendesk.support.request.StateError
            r9.<init>()
            return r9
        L_0x00a3:
            boolean r0 = r10 instanceof zendesk.support.request.ActionFactory.ErrorAction
            if (r0 == 0) goto L_0x00b9
            zendesk.support.request.ActionFactory$ErrorAction r10 = (zendesk.support.request.ActionFactory.ErrorAction) r10
            o.C r9 = r10.getErrorResponse()
            zendesk.support.request.StateError r10 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r0 = zendesk.support.request.StateError.ErrorType.InputFormSubmission
            java.lang.String r9 = r9.m1280()
            r10.<init>(r0, r9)
            return r10
        L_0x00b9:
            zendesk.support.request.StateError$ErrorType r9 = r9.getState()
            zendesk.support.request.StateError$ErrorType r10 = zendesk.support.request.StateError.ErrorType.InputFormSubmission
            if (r9 != r10) goto L_0x00c7
            zendesk.support.request.StateError r9 = new zendesk.support.request.StateError
            r9.<init>()
            return r9
        L_0x00c7:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerError.reduce(zendesk.support.request.StateError, o.nc):zendesk.support.request.StateError");
    }

    public StateError getInitialState() {
        return new StateError();
    }
}
