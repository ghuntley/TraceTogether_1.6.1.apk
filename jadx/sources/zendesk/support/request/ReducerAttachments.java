package zendesk.support.request;

import o.np;

class ReducerAttachments extends np<StateAttachments> {
    ReducerAttachments() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateAttachments reduce(zendesk.support.request.StateAttachments r12, o.nc<?> r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.getActionType()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1326172566: goto L_0x0039;
                case -635275733: goto L_0x002f;
                case -91317760: goto L_0x0025;
                case 207206879: goto L_0x001b;
                case 979542142: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0043
        L_0x0011:
            java.lang.String r1 = "CLEAR_ATTACHMENTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 4
            goto L_0x0044
        L_0x001b:
            java.lang.String r1 = "START_CONFIG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "LOAD_SETTINGS_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 3
            goto L_0x0044
        L_0x002f:
            java.lang.String r1 = "ATTACHMENTS_DESELECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 2
            goto L_0x0044
        L_0x0039:
            java.lang.String r1 = "ATTACHMENTS_SELECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            if (r0 == 0) goto L_0x012d
            if (r0 == r6) goto L_0x0112
            if (r0 == r5) goto L_0x00bd
            if (r0 == r4) goto L_0x0056
            if (r0 == r2) goto L_0x0050
            r12 = 0
            return r12
        L_0x0050:
            zendesk.support.request.StateAttachments r12 = new zendesk.support.request.StateAttachments
            r12.<init>()
            return r12
        L_0x0056:
            java.lang.Object r13 = r13.getData()
            zendesk.support.request.StateSettings r13 = (zendesk.support.request.StateSettings) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r13.isAttachmentsEnabled()
            if (r1 == 0) goto L_0x00b4
            long r1 = r13.getMaxAttachmentSize()
            java.util.List r13 = r12.getSelectedAttachments()
            java.util.Iterator r13 = r13.iterator()
        L_0x0073:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00a7
            java.lang.Object r7 = r13.next()
            zendesk.support.request.StateRequestAttachment r7 = (zendesk.support.request.StateRequestAttachment) r7
            long r8 = r7.getSize()
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a3
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = r7.getName()
            r8[r3] = r9
            long r9 = r7.getSize()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8[r6] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r8[r5] = r7
            o.F.m1359()
            goto L_0x0073
        L_0x00a3:
            r0.add(r7)
            goto L_0x0073
        L_0x00a7:
            zendesk.support.request.StateAttachments$Builder r12 = r12.newBuilder()
            zendesk.support.request.StateAttachments$Builder r12 = r12.setSelectedAttachments(r0)
            zendesk.support.request.StateAttachments r12 = r12.build()
            return r12
        L_0x00b4:
            o.F.m1361()
            zendesk.support.request.StateAttachments r12 = new zendesk.support.request.StateAttachments
            r12.<init>()
            return r12
        L_0x00bd:
            java.lang.Object r13 = r13.getData()
            java.util.List r13 = (java.util.List) r13
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00cc:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r13.next()
            o.mF r1 = (o.mF) r1
            android.net.Uri r1 = r1.f3092
            r0.add(r1)
            goto L_0x00cc
        L_0x00de:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r1 = r12.getSelectedAttachments()
            java.util.Iterator r1 = r1.iterator()
        L_0x00eb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0105
            java.lang.Object r2 = r1.next()
            zendesk.support.request.StateRequestAttachment r2 = (zendesk.support.request.StateRequestAttachment) r2
            android.net.Uri r3 = r2.getParsedLocalUri()
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00eb
            r13.add(r2)
            goto L_0x00eb
        L_0x0105:
            zendesk.support.request.StateAttachments$Builder r12 = r12.newBuilder()
            zendesk.support.request.StateAttachments$Builder r12 = r12.setSelectedAttachments(r13)
            zendesk.support.request.StateAttachments r12 = r12.build()
            return r12
        L_0x0112:
            java.lang.Object r13 = r13.getData()
            zendesk.support.request.RequestUiConfig r13 = (zendesk.support.request.RequestUiConfig) r13
            java.util.List r13 = r13.getFiles()
            zendesk.support.request.StateAttachments$Builder r12 = r12.newBuilder()
            zendesk.support.request.StateAttachments$Builder r12 = r12.addAllSelectedAttachments(r13)
            zendesk.support.request.StateAttachments$Builder r12 = r12.setSelectedAttachments(r13)
            zendesk.support.request.StateAttachments r12 = r12.build()
            return r12
        L_0x012d:
            java.lang.Object r13 = r13.getData()
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x013c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0150
            java.lang.Object r1 = r13.next()
            o.mF r1 = (o.mF) r1
            zendesk.support.request.StateRequestAttachment r1 = zendesk.support.request.StateRequestAttachment.convert((o.mF) r1)
            r0.add(r1)
            goto L_0x013c
        L_0x0150:
            java.util.List[] r13 = new java.util.List[r5]
            r13[r3] = r0
            java.util.List r1 = r12.getSelectedAttachments()
            r13[r6] = r1
            java.util.List r13 = o.O.m1398((java.util.List<Type>[]) r13)
            zendesk.support.request.StateAttachments$Builder r12 = r12.newBuilder()
            zendesk.support.request.StateAttachments$Builder r12 = r12.addAllSelectedAttachments(r0)
            zendesk.support.request.StateAttachments$Builder r12 = r12.setSelectedAttachments(r13)
            zendesk.support.request.StateAttachments r12 = r12.build()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerAttachments.reduce(zendesk.support.request.StateAttachments, o.nc):zendesk.support.request.StateAttachments");
    }

    public StateAttachments getInitialState() {
        return new StateAttachments();
    }
}
