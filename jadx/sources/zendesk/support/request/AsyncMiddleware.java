package zendesk.support.request;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.nc;
import o.nh;
import o.nk;
import o.nn;
import o.no;

class AsyncMiddleware implements nn {
    private final Queue queue;

    interface AsyncAction {
        void actionQueued(nk nkVar, no noVar);

        void execute(nk nkVar, no noVar, Callback callback);
    }

    interface Callback {
        void done();
    }

    interface Item {
        void execute(Callback callback);
    }

    static nc createAction(AsyncAction asyncAction) {
        return new nc("async_action", asyncAction);
    }

    AsyncMiddleware(Queue queue2) {
        this.queue = queue2;
    }

    public void onAction(nc<?> ncVar, no noVar, nk nkVar, nh nhVar) {
        AsyncAction asyncAction = (AsyncAction) ncVar.getData(AsyncAction.class);
        if (asyncAction != null) {
            asyncAction.actionQueued(nkVar, noVar);
            this.queue.dispatch(new QueueItem(asyncAction, noVar, nkVar));
            return;
        }
        nhVar.m3989(ncVar);
    }

    static class QueueItem implements Item {
        private final AsyncAction asyncAction;
        private final nk dispatcher;
        private final no getState;

        private QueueItem(AsyncAction asyncAction2, no noVar, nk nkVar) {
            this.asyncAction = asyncAction2;
            this.getState = noVar;
            this.dispatcher = nkVar;
        }

        public void execute(Callback callback) {
            this.asyncAction.execute(this.dispatcher, this.getState, callback);
        }
    }

    static class Queue {
        private final Callback dispatchCallback = new QueueCallback();
        private final AtomicBoolean isRunning = new AtomicBoolean(false);
        /* access modifiers changed from: private */
        public final java.util.Queue<Item> items = new LinkedList();

        Queue() {
        }

        /* access modifiers changed from: package-private */
        public void dispatch(Item item) {
            if (item != null) {
                synchronized (this.items) {
                    this.items.add(item);
                }
                if (this.isRunning.compareAndSet(false, true)) {
                    dispatchInternal();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isRunning() {
            return this.isRunning.get();
        }

        /* access modifiers changed from: private */
        public void dispatchInternal() {
            Item item;
            synchronized (this.items) {
                if (!this.items.isEmpty()) {
                    item = this.items.peek();
                } else {
                    this.isRunning.set(false);
                    item = null;
                }
            }
            if (item != null) {
                item.execute(this.dispatchCallback);
            }
        }

        class QueueCallback implements Callback {
            private QueueCallback() {
            }

            public void done() {
                synchronized (Queue.this.items) {
                    Queue.this.items.poll();
                }
                Queue.this.dispatchInternal();
            }
        }
    }
}
