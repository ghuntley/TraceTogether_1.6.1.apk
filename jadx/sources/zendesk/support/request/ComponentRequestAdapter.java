package zendesk.support.request;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C0585;
import o.C0845;
import o.C0920;
import o.C0970;
import o.O;
import o.nl;
import o.nq;
import o.nt;
import zendesk.support.request.CellType;

class ComponentRequestAdapter implements nl<List<CellType.Base>> {
    private final C0970 listUpdateCallback;
    private final RecyclerView recyclerView;
    private final RequestAdapterSelector requestAdapterSelector;
    /* access modifiers changed from: private */
    public final List<CellType.Base> requestMessageList;
    private Runnable updateRunnable = null;

    ComponentRequestAdapter(C0970 r2, CellFactory cellFactory, RecyclerView recyclerView2) {
        this.listUpdateCallback = r2;
        this.recyclerView = recyclerView2;
        this.requestMessageList = new ArrayList();
        this.requestAdapterSelector = new RequestAdapterSelector(cellFactory);
    }

    /* access modifiers changed from: package-private */
    public CellType.Base getMessageForPos(int i) {
        return this.requestMessageList.get(i);
    }

    /* access modifiers changed from: package-private */
    public int getMessageCount() {
        return this.requestMessageList.size();
    }

    public void update(final List<CellType.Base> list) {
        this.recyclerView.removeCallbacks(this.updateRunnable);
        this.updateRunnable = new Runnable() {
            public void run() {
                ComponentRequestAdapter.this.updateDataSet(O.m1393(ComponentRequestAdapter.this.requestMessageList), O.m1393(list));
            }
        };
        this.recyclerView.postDelayed(this.updateRunnable, 200);
    }

    /* access modifiers changed from: package-private */
    public nq<List<CellType.Base>> getSelector() {
        return this.requestAdapterSelector;
    }

    /* access modifiers changed from: private */
    public void updateDataSet(List<CellType.Base> list, List<CellType.Base> list2) {
        C0845 r1;
        int i;
        List<CellType.Base> list3 = list2;
        C0920.Cif r2 = C0920.m6749(new DiffCalculator(list, list3));
        this.requestMessageList.clear();
        this.requestMessageList.addAll(list3);
        C0970 r12 = this.listUpdateCallback;
        if (r12 instanceof C0845) {
            r1 = (C0845) r12;
        } else {
            r1 = new C0845(r12);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = r2.f5818;
        int i3 = r2.f5817;
        for (int size = r2.f5821.size() - 1; size >= 0; size--) {
            C0920.If ifR = r2.f5821.get(size);
            int i4 = ifR.f5812;
            int i5 = ifR.f5814 + i4;
            int i6 = ifR.f5813 + i4;
            if (i5 < i2) {
                i = i6;
                r2.m6753(arrayList, r1, i5, i2 - i5, i5);
            } else {
                i = i6;
            }
            if (i < i3) {
                r2.m6754(arrayList, r1, i5, i3 - i, i);
            }
            for (int i7 = i4 - 1; i7 >= 0; i7--) {
                if ((r2.f5819[ifR.f5814 + i7] & 31) == 2) {
                    r1.onChanged(ifR.f5814 + i7, 1, r2.f5822.getChangePayload(ifR.f5814 + i7, ifR.f5813 + i7));
                }
            }
            i2 = ifR.f5814;
            i3 = ifR.f5813;
        }
        r1.m6316();
    }

    static class DiffCalculator extends C0920.C0921 {
        private final List<CellType.Base> newList;
        private final List<CellType.Base> oldList;

        private DiffCalculator(List<CellType.Base> list, List<CellType.Base> list2) {
            this.oldList = list;
            this.newList = list2;
        }

        public int getOldListSize() {
            return this.oldList.size();
        }

        public int getNewListSize() {
            return this.newList.size();
        }

        public boolean areItemsTheSame(int i, int i2) {
            return this.oldList.get(i).getUniqueId() == this.newList.get(i2).getUniqueId();
        }

        public boolean areContentsTheSame(int i, int i2) {
            return this.oldList.get(i).areContentsTheSame(this.newList.get(i2));
        }
    }

    static class RequestAdapter extends RecyclerView.C0035<RequestViewHolder> {
        private final ComponentRequestAdapter dataSource;
        private int lastPosition = -1;

        RequestAdapter(ComponentRequestAdapter componentRequestAdapter) {
            setHasStableIds(true);
            this.dataSource = componentRequestAdapter;
        }

        public RequestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RequestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }

        @SuppressLint({"RecyclerView"})
        public void onBindViewHolder(RequestViewHolder requestViewHolder, int i) {
            this.dataSource.getMessageForPos(i).bind(requestViewHolder);
            int i2 = this.lastPosition;
            if (i > i2 && i2 != -1) {
                this.lastPosition = i;
                requestViewHolder.startAnimation();
            }
            if (this.lastPosition == -1) {
                this.lastPosition = i;
            }
        }

        public long getItemId(int i) {
            return this.dataSource.getMessageForPos(i).getUniqueId();
        }

        public int getItemViewType(int i) {
            return this.dataSource.getMessageForPos(i).getLayoutId();
        }

        public int getItemCount() {
            return this.dataSource.getMessageCount();
        }

        public void onViewDetachedFromWindow(RequestViewHolder requestViewHolder) {
            super.onViewDetachedFromWindow(requestViewHolder);
            requestViewHolder.clearAnimation();
        }
    }

    static class RequestAdapterSelector implements nq<List<CellType.Base>> {
        private final CellFactory messageFactory;

        RequestAdapterSelector(CellFactory cellFactory) {
            this.messageFactory = cellFactory;
        }

        public List<CellType.Base> selectData(nt ntVar) {
            StateConversation fromState = StateConversation.fromState(ntVar);
            StateSettings settings = StateConfig.fromState(ntVar).getSettings();
            return this.messageFactory.generateCells(fromState.getMessages(), fromState.getUsers(), fromState.getStatus(), settings.getSystemMessage());
        }
    }

    static class RequestViewHolder extends RecyclerView.con {
        private static final TimeInterpolator TIME_INTERPOLATOR = C0585.m5211(0.2f, 0.0f, 0.4f, 1.0f);
        private ValueAnimator animation;
        @SuppressLint({"UseSparseArrays"})
        private final Map<Integer, View> viewCache = new HashMap();

        RequestViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: package-private */
        public void clearAnimation() {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.itemView.setTranslationY(0.0f);
            }
        }

        /* access modifiers changed from: package-private */
        public void startAnimation() {
            int measuredHeight = this.itemView.getMeasuredHeight();
            if (measuredHeight == 0) {
                this.itemView.measure(0, 0);
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            this.animation = ValueAnimator.ofFloat(new float[]{((float) measuredHeight) * 0.6666667f, 0.0f});
            this.animation.setInterpolator(TIME_INTERPOLATOR);
            this.animation.setDuration(250);
            this.animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RequestViewHolder.this.itemView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.animation.start();
        }

        /* access modifiers changed from: package-private */
        public <E extends View> E findCachedView(int i) {
            E e;
            synchronized (this.viewCache) {
                if (this.viewCache.containsKey(Integer.valueOf(i))) {
                    e = (View) this.viewCache.get(Integer.valueOf(i));
                } else {
                    E findViewById = this.itemView.findViewById(i);
                    this.viewCache.put(Integer.valueOf(i), findViewById);
                    e = findViewById;
                }
            }
            return e;
        }
    }
}
