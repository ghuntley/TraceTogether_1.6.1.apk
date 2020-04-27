package zendesk.support.request;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C;
import o.C3602mo;
import o.F;
import o.G;
import o.P;
import o.mF;
import o.nk;
import o.no;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;

class ActionLoadComments implements AsyncMiddleware.AsyncAction {
    /* access modifiers changed from: private */
    public final ActionFactory actionFactory;
    private final C3602mo belvedere;
    private final Handler handler;
    /* access modifiers changed from: private */
    public final boolean initialLoad;
    /* access modifiers changed from: private */
    public final RequestProvider requestProvider;

    ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C3602mo moVar, boolean z) {
        this(actionFactory2, requestProvider2, moVar, new Handler(Looper.getMainLooper()), z);
    }

    ActionLoadComments(ActionFactory actionFactory2, RequestProvider requestProvider2, C3602mo moVar, Handler handler2, boolean z) {
        this.actionFactory = actionFactory2;
        this.requestProvider = requestProvider2;
        this.belvedere = moVar;
        this.handler = handler2;
        this.initialLoad = z;
    }

    public void actionQueued(nk nkVar, no noVar) {
        nkVar.m3992(this.actionFactory.loadComments(this.initialLoad));
    }

    public void execute(nk nkVar, no noVar, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(noVar.m4002());
        if (!P.m1406(fromState.getRemoteId())) {
            F.m1359();
            nkVar.m3992(this.actionFactory.skipAction());
            callback.done();
            return;
        }
        final StateConversation stateConversation = fromState;
        final nk nkVar2 = nkVar;
        final AsyncMiddleware.Callback callback2 = callback;
        AnonymousClass1 r0 = new MinimumTimeCallback<CommentsResponse>(this.handler, 1, TimeUnit.SECONDS) {
            public void onDelayedSuccess(CommentsResponse commentsResponse) {
                HashSet hashSet = new HashSet(stateConversation.getMessageIdMapper().getRemoteIds());
                for (CommentResponse id : commentsResponse.getComments()) {
                    hashSet.add(id.getId());
                }
                ActionLoadComments.this.requestProvider.markRequestAsRead(stateConversation.getRemoteId(), hashSet.size());
                nkVar2.m3992(ActionLoadComments.this.actionFactory.loadCommentsSuccess(ActionLoadComments.this.initialLoad, commentsResponse, ActionLoadComments.this.findAttachments(stateConversation.getLocalId(), commentsResponse)));
                callback2.done();
            }

            public void onDelayedError(C c) {
                new Object[1][0] = c.m1280();
                F.m1361();
                nkVar2.m3992(ActionLoadComments.this.actionFactory.loadCommentsError(ActionLoadComments.this.initialLoad, c));
                callback2.done();
            }
        };
        StateMessage find2ndLastDeliveredMessage = find2ndLastDeliveredMessage(fromState.getMessages());
        if (find2ndLastDeliveredMessage != null) {
            this.requestProvider.getCommentsSince(fromState.getRemoteId(), find2ndLastDeliveredMessage.getDate(), false, r0);
        } else {
            this.requestProvider.getComments(fromState.getRemoteId(), r0);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"UseSparseArrays"})
    public Map<Long, mF> findAttachments(String str, CommentsResponse commentsResponse) {
        List<CommentResponse> comments = commentsResponse.getComments();
        HashMap hashMap = new HashMap();
        for (CommentResponse attachments : comments) {
            for (Attachment next : attachments.getAttachments()) {
                mF localFile = UtilsAttachment.getLocalFile(this.belvedere, str, next.getId().longValue(), next.getFileName());
                if (next.getSize().longValue() == localFile.f3087.length()) {
                    hashMap.put(next.getId(), localFile);
                }
            }
        }
        return hashMap;
    }

    private StateMessage find2ndLastDeliveredMessage(List<StateMessage> list) {
        ListIterator<StateMessage> listIterator = list.listIterator(list.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            StateMessage previous = listIterator.previous();
            if (previous.getState().getStatus() == 2 && (i = i + 1) == 2) {
                return previous;
            }
        }
        return null;
    }

    static abstract class MinimumTimeCallback<E> extends G<E> {
        private final Handler handler;
        private final long minTime;
        private final TimeUnit minTimeUnit;
        private final long start = System.nanoTime();

        public abstract void onDelayedError(C c);

        public abstract void onDelayedSuccess(E e);

        MinimumTimeCallback(Handler handler2, long j, TimeUnit timeUnit) {
            this.handler = handler2;
            this.minTime = j;
            this.minTimeUnit = timeUnit;
        }

        public void onSuccess(final E e) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedSuccess(e);
                }
            }, remainingTime());
        }

        public void onError(final C c) {
            this.handler.postDelayed(new Runnable() {
                public void run() {
                    MinimumTimeCallback.this.onDelayedError(c);
                }
            }, remainingTime());
        }

        private long remainingTime() {
            long nanoTime = System.nanoTime() - this.start;
            long convert = TimeUnit.NANOSECONDS.convert(this.minTime, this.minTimeUnit);
            if (nanoTime < convert) {
                return TimeUnit.MILLISECONDS.convert(convert - nanoTime, TimeUnit.NANOSECONDS);
            }
            return 0;
        }
    }
}
