package zendesk.support.request;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import o.F;
import o.P;
import o.nk;
import o.no;
import zendesk.support.IdUtil;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;

class ActionInstallConfiguration implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory af;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    private final Executor executor;
    /* access modifiers changed from: private */
    public final Executor mainThreadExecutor;
    /* access modifiers changed from: private */
    public final RequestUiConfig startConfig;
    /* access modifiers changed from: private */
    public final SupportUiStorage supportUiStorage;

    public void actionQueued(nk nkVar, no noVar) {
    }

    ActionInstallConfiguration(SupportUiStorage supportUiStorage2, RequestUiConfig requestUiConfig, Executor executor2, Executor executor3, ActionFactory actionFactory, SupportBlipsProvider supportBlipsProvider) {
        this.supportUiStorage = supportUiStorage2;
        this.startConfig = requestUiConfig;
        this.executor = executor2;
        this.mainThreadExecutor = executor3;
        this.af = actionFactory;
        this.blipsProvider = supportBlipsProvider;
    }

    public void execute(final nk nkVar, no noVar, final AsyncMiddleware.Callback callback) {
        this.executor.execute(new Runnable() {
            public void run() {
                boolean r0 = P.m1406(ActionInstallConfiguration.this.startConfig.getRequestId());
                boolean r1 = P.m1406(ActionInstallConfiguration.this.startConfig.getLocalRequestId());
                String requestId = ActionInstallConfiguration.this.startConfig.getRequestId();
                String localRequestId = ActionInstallConfiguration.this.startConfig.getLocalRequestId();
                if (!r0 || !r1) {
                    ComponentPersistence.RequestIdMapper requestIdMapper = (ComponentPersistence.RequestIdMapper) ActionInstallConfiguration.this.supportUiStorage.read("request_id_mapper", ComponentPersistence.RequestIdMapper.class);
                    if (requestIdMapper != null) {
                        if (r1) {
                            requestId = requestIdMapper.getRemoteId(localRequestId);
                        } else if (r0) {
                            localRequestId = requestIdMapper.getLocalId(requestId);
                        }
                    }
                    if (!P.m1406(localRequestId)) {
                        localRequestId = IdUtil.newStringId();
                    }
                }
                String str = requestId;
                String str2 = localRequestId;
                if (P.m1406(str)) {
                    ActionInstallConfiguration.this.blipsProvider.requestViewed(str);
                }
                Object[] objArr = {str, str2};
                F.m1359();
                final RequestUiConfig requestUiConfig = new RequestUiConfig(ActionInstallConfiguration.this.startConfig.getRequestSubject(), ActionInstallConfiguration.this.startConfig.getTags(), str, str2, ActionInstallConfiguration.this.startConfig.getRequestStatus(), ActionInstallConfiguration.this.startConfig.getTicketForm(), P.m1409(str) ? ActionInstallConfiguration.this.startConfig.getFiles() : new ArrayList(), ActionInstallConfiguration.this.startConfig.hasAgentReplies(), ActionInstallConfiguration.this.startConfig.getUiConfigs());
                ActionInstallConfiguration.this.mainThreadExecutor.execute(new Runnable() {
                    public void run() {
                        nkVar.m3992(ActionInstallConfiguration.this.af.startConfig(requestUiConfig));
                        callback.done();
                    }
                });
            }
        });
    }
}
