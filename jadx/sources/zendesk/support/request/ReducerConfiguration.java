package zendesk.support.request;

import o.np;

class ReducerConfiguration extends np<StateConfig> {
    ReducerConfiguration() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateConfig reduce(zendesk.support.request.StateConfig r5, o.nc<?> r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getActionType()
            int r1 = r0.hashCode()
            r2 = -91317760(0xfffffffffa8e9a00, float:-3.7021482E35)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 207206879(0xc59b9df, float:1.6773005E-31)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "START_CONFIG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "LOAD_SETTINGS_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x002f
            r5 = 0
            return r5
        L_0x002f:
            java.lang.Object r6 = r6.getData()
            zendesk.support.request.StateSettings r6 = (zendesk.support.request.StateSettings) r6
            zendesk.support.request.StateConfig$Builder r5 = r5.newBuilder()
            zendesk.support.request.StateConfig$Builder r5 = r5.setSettings(r6)
            zendesk.support.request.StateConfig r5 = r5.build()
            return r5
        L_0x0042:
            java.lang.Object r6 = r6.getData()
            zendesk.support.request.RequestUiConfig r6 = (zendesk.support.request.RequestUiConfig) r6
            zendesk.support.request.StateConfig$Builder r5 = r5.newBuilder()
            java.util.List r0 = r6.getTags()
            zendesk.support.request.StateConfig$Builder r5 = r5.setTags(r0)
            zendesk.support.request.StateRequestTicketForm r0 = r6.getTicketForm()
            zendesk.support.request.StateConfig$Builder r5 = r5.setTicketForm(r0)
            java.lang.String r6 = r6.getRequestSubject()
            zendesk.support.request.StateConfig$Builder r5 = r5.setSubject(r6)
            zendesk.support.request.StateConfig r5 = r5.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerConfiguration.reduce(zendesk.support.request.StateConfig, o.nc):zendesk.support.request.StateConfig");
    }

    public StateConfig getInitialState() {
        return new StateConfig();
    }
}
