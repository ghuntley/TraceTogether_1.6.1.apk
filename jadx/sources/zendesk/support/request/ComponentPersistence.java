package zendesk.support.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.O;
import o.P;
import o.nl;
import o.nq;
import o.nt;
import zendesk.support.SupportUiStorage;

class ComponentPersistence implements nl<RequestPersistenceModel> {
    private final Executor executor;
    /* access modifiers changed from: private */
    public final AtomicBoolean isMappingComplete = new AtomicBoolean(false);
    private final PersistenceSelector persistenceSelector;
    private final PersistenceQueue queue;
    /* access modifiers changed from: private */
    public final SupportUiStorage supportUiStorage;

    interface Item {
        void persist();
    }

    ComponentPersistence(SupportUiStorage supportUiStorage2, PersistenceQueue persistenceQueue, Executor executor2) {
        this.supportUiStorage = supportUiStorage2;
        this.persistenceSelector = new PersistenceSelector();
        this.queue = persistenceQueue;
        this.executor = executor2;
    }

    public void update(RequestPersistenceModel requestPersistenceModel) {
        persistConversation(requestPersistenceModel);
        persistRequestId(requestPersistenceModel);
    }

    private void persistConversation(RequestPersistenceModel requestPersistenceModel) {
        boolean isActivityStopped = requestPersistenceModel.isActivityStopped();
        boolean r1 = P.m1406(requestPersistenceModel.getLocalRequestId());
        boolean z = requestPersistenceModel.getConversation().getMessages().size() > 0;
        if (isActivityStopped && r1 && z) {
            this.queue.dispatch(new PersistenceItem(this.supportUiStorage, requestPersistenceModel));
        }
    }

    private void persistRequestId(final RequestPersistenceModel requestPersistenceModel) {
        if (!this.isMappingComplete.get()) {
            final String remoteId = requestPersistenceModel.getConversation().getRemoteId();
            final String localId = requestPersistenceModel.getConversation().getLocalId();
            final boolean z = false;
            boolean z2 = requestPersistenceModel.getConversation().getMessages().size() > 0;
            if (P.m1406(remoteId) && P.m1406(localId)) {
                z = true;
            }
            if (z || z2) {
                if (z) {
                    this.isMappingComplete.set(true);
                }
                this.executor.execute(new Runnable() {
                    public void run() {
                        RequestIdMapper requestIdMapper = (RequestIdMapper) ComponentPersistence.this.supportUiStorage.read("request_id_mapper", RequestIdMapper.class);
                        if (requestIdMapper == null) {
                            requestIdMapper = new RequestIdMapper();
                        }
                        if (z) {
                            if (!requestIdMapper.hasLocalId(remoteId) || !requestIdMapper.hasRemoteId(localId)) {
                                ComponentPersistence.this.supportUiStorage.write("request_id_mapper", requestIdMapper.addIdMapping(remoteId, localId));
                            }
                        } else if (!requestIdMapper.hasRemoteId(localId)) {
                            ComponentPersistence.this.supportUiStorage.write("request_id_mapper", requestIdMapper.addLocalId(localId));
                        }
                    }
                });
            }
        } else if (O.m1399(requestPersistenceModel.getConversation().getMessages())) {
            this.executor.execute(new Runnable() {
                public void run() {
                    RequestIdMapper requestIdMapper = (RequestIdMapper) ComponentPersistence.this.supportUiStorage.read("request_id_mapper", RequestIdMapper.class);
                    String localRequestId = requestPersistenceModel.getLocalRequestId();
                    if (requestIdMapper != null) {
                        ComponentPersistence.this.supportUiStorage.write("request_id_mapper", requestIdMapper.removeLocalIdMapping(localRequestId));
                        ComponentPersistence.this.isMappingComplete.set(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public nq<RequestPersistenceModel> getSelector() {
        return this.persistenceSelector;
    }

    static class PersistenceItem implements Item {
        private final RequestPersistenceModel model;
        private final SupportUiStorage supportUiStorage;

        PersistenceItem(SupportUiStorage supportUiStorage2, RequestPersistenceModel requestPersistenceModel) {
            this.supportUiStorage = supportUiStorage2;
            this.model = requestPersistenceModel;
        }

        public void persist() {
            this.supportUiStorage.write(this.model.getLocalRequestId(), this.model);
        }
    }

    static class PersistenceQueue {
        /* access modifiers changed from: private */
        public final List<Item> actions = new ArrayList(2);
        private final Executor executor;
        /* access modifiers changed from: private */
        public final AtomicBoolean workerRunning = new AtomicBoolean(false);

        public PersistenceQueue(Executor executor2) {
            this.executor = executor2;
        }

        /* access modifiers changed from: package-private */
        public void dispatch(Item item) {
            if (item != null) {
                synchronized (this.actions) {
                    if (this.actions.size() >= 2) {
                        this.actions.set(1, item);
                    } else {
                        this.actions.add(item);
                    }
                    startWorker();
                }
            }
        }

        private void startWorker() {
            if (this.workerRunning.compareAndSet(false, true)) {
                this.executor.execute(new Worker());
            }
        }

        class Worker implements Runnable {
            private Worker() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
                zendesk.support.request.ComponentPersistence.PersistenceQueue.access$300(r3.this$0).remove(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
                if (r1 == null) goto L_0x0000;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
                r1.persist();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r3 = this;
                L_0x0000:
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r0 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this
                    java.util.List r0 = r0.actions
                    monitor-enter(r0)
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r1 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this     // Catch:{ all -> 0x0046 }
                    java.util.List r1 = r1.actions     // Catch:{ all -> 0x0046 }
                    int r1 = r1.size()     // Catch:{ all -> 0x0046 }
                    r2 = 0
                    if (r1 <= 0) goto L_0x003b
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r1 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this     // Catch:{ all -> 0x0046 }
                    java.util.List r1 = r1.actions     // Catch:{ all -> 0x0046 }
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0046 }
                    zendesk.support.request.ComponentPersistence$Item r1 = (zendesk.support.request.ComponentPersistence.Item) r1     // Catch:{ all -> 0x0046 }
                    monitor-exit(r0)
                    if (r1 == 0) goto L_0x0000
                    r1.persist()     // Catch:{ Exception -> 0x0026, all -> 0x0030 }
                L_0x0026:
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r0 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this
                    java.util.List r0 = r0.actions
                    r0.remove(r1)
                    goto L_0x0000
                L_0x0030:
                    r0 = move-exception
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r2 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this
                    java.util.List r2 = r2.actions
                    r2.remove(r1)
                    throw r0
                L_0x003b:
                    zendesk.support.request.ComponentPersistence$PersistenceQueue r1 = zendesk.support.request.ComponentPersistence.PersistenceQueue.this     // Catch:{ all -> 0x0046 }
                    java.util.concurrent.atomic.AtomicBoolean r1 = r1.workerRunning     // Catch:{ all -> 0x0046 }
                    r1.set(r2)     // Catch:{ all -> 0x0046 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                    return
                L_0x0046:
                    r1 = move-exception
                    monitor-exit(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ComponentPersistence.PersistenceQueue.Worker.run():void");
            }
        }
    }

    static class PersistenceSelector implements nq<RequestPersistenceModel> {
        PersistenceSelector() {
        }

        public RequestPersistenceModel selectData(nt ntVar) {
            StateConversation fromState = StateConversation.fromState(ntVar);
            return new RequestPersistenceModel(fromState.getLocalId(), new Date(), "2.2.1", fromState, StateAndroidLifecycle.fromState(ntVar).getState() == 2);
        }
    }

    static class RequestPersistenceModel {
        private final transient boolean activityStopped;
        private final StateConversation conversation;
        private final Date date;
        private final transient String requestId;
        private final String version;

        RequestPersistenceModel(String str, Date date2, String str2, StateConversation stateConversation, boolean z) {
            this.requestId = str;
            this.date = date2;
            this.version = str2;
            this.conversation = stateConversation;
            this.activityStopped = z;
        }

        /* access modifiers changed from: package-private */
        public StateConversation getConversation() {
            return this.conversation;
        }

        /* access modifiers changed from: package-private */
        public String getLocalRequestId() {
            return this.requestId;
        }

        /* access modifiers changed from: package-private */
        public String getVersion() {
            return this.version;
        }

        /* access modifiers changed from: package-private */
        public boolean isActivityStopped() {
            return this.activityStopped;
        }
    }

    static class RequestIdMapper {
        private final Map<String, String> localToRemote = new HashMap();
        private final Map<String, String> remoteToLocal = new HashMap();

        /* access modifiers changed from: package-private */
        public boolean hasLocalId(String str) {
            return this.remoteToLocal.containsKey(str) && P.m1406(this.remoteToLocal.get(str));
        }

        /* access modifiers changed from: package-private */
        public boolean hasRemoteId(String str) {
            return this.localToRemote.containsKey(str) && P.m1406(this.localToRemote.get(str));
        }

        /* access modifiers changed from: package-private */
        public String getRemoteId(String str) {
            return this.localToRemote.get(str);
        }

        /* access modifiers changed from: package-private */
        public String getLocalId(String str) {
            return this.remoteToLocal.get(str);
        }

        /* access modifiers changed from: package-private */
        public RequestIdMapper addIdMapping(String str, String str2) {
            this.localToRemote.put(str2, str);
            this.remoteToLocal.put(str, str2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public RequestIdMapper removeLocalIdMapping(String str) {
            this.localToRemote.remove(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        public RequestIdMapper addLocalId(String str) {
            this.localToRemote.put(str, "");
            return this;
        }
    }
}
