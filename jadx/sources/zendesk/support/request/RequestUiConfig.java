package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.O;
import o.P;
import o.mW;
import o.mZ;
import zendesk.support.CustomField;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;

public class RequestUiConfig implements mW {
    private final List<StateRequestAttachment> files;
    private final boolean hasAgentReplies;
    private final String localRequestId;
    private final String requestId;
    private final RequestStatus requestStatus;
    private final String requestSubject;
    private final List<String> tags;
    private final StateRequestTicketForm ticketForm;
    private final List<mW> uiConfigs;

    RequestUiConfig(String str, List<String> list, String str2, String str3, RequestStatus requestStatus2, StateRequestTicketForm stateRequestTicketForm, List<StateRequestAttachment> list2, boolean z, List<mW> list3) {
        this.requestSubject = str;
        this.tags = O.m1403(list);
        this.requestId = str2;
        this.localRequestId = str3;
        this.requestStatus = requestStatus2;
        this.hasAgentReplies = z;
        this.ticketForm = stateRequestTicketForm;
        this.files = list2;
        this.uiConfigs = list3;
    }

    public String getRequestSubject() {
        return this.requestSubject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public List<StateRequestAttachment> getFiles() {
        return this.files;
    }

    public StateRequestTicketForm getTicketForm() {
        return this.ticketForm;
    }

    /* access modifiers changed from: package-private */
    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }

    @SuppressLint({"RestrictedApi"})
    public List<mW> getUiConfigs() {
        return mZ.m3800(this.uiConfigs, this);
    }

    public static class Builder {
        private List<StateRequestAttachment> files = new ArrayList(0);
        private boolean hasAgentReplies = false;
        private String localRequestId = "";
        private String requestId = "";
        private RequestStatus requestStatus = null;
        private String requestSubject = "";
        private List<String> tags = new ArrayList(0);
        private StateRequestTicketForm ticketForm = null;
        private List<mW> uiConfigs = new ArrayList();

        public Builder withTags(String... strArr) {
            this.tags = O.m1393(Arrays.asList(strArr));
            return this;
        }

        public Builder withCustomFields(List<CustomField> list) {
            this.ticketForm = new StateRequestTicketForm(list);
            return this;
        }

        public Builder withRequestInfo(RequestInfo requestInfo) {
            String localId = requestInfo.getLocalId();
            if (P.m1406(localId)) {
                this.localRequestId = localId;
            }
            String remoteId = requestInfo.getRemoteId();
            if (P.m1406(remoteId)) {
                this.requestId = remoteId;
            }
            this.requestStatus = requestInfo.getRequestStatus();
            this.hasAgentReplies = O.m1394(requestInfo.getAgentInfos());
            return this;
        }

        private void setUiConfigs(List<mW> list) {
            this.uiConfigs = list;
            RequestUiConfig requestUiConfig = (RequestUiConfig) mZ.m3803(list, RequestUiConfig.class);
            if (requestUiConfig != null) {
                this.requestSubject = requestUiConfig.getRequestSubject();
                this.tags = requestUiConfig.getTags();
                this.ticketForm = requestUiConfig.getTicketForm();
                this.files = requestUiConfig.getFiles();
            }
        }

        public void show(Context context, mW... mWVarArr) {
            context.startActivity(intent(context, mWVarArr));
        }

        public void show(Context context, List<mW> list) {
            context.startActivity(intent(context, list));
        }

        public mW config() {
            return new RequestUiConfig(this.requestSubject, this.tags, this.requestId, this.localRequestId, this.requestStatus, this.ticketForm, this.files, this.hasAgentReplies, this.uiConfigs);
        }

        public Intent intent(Context context, mW... mWVarArr) {
            return intent(context, (List<mW>) Arrays.asList(mWVarArr));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<mW> list) {
            setUiConfigs(list);
            mW config = config();
            Intent intent = new Intent(context, RequestActivity.class);
            mZ.m3801(intent, config);
            return intent;
        }
    }
}
