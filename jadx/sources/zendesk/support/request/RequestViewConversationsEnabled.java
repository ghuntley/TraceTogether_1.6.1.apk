package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import o.C0293;
import o.C0585;
import o.C0837;
import o.C0970;
import o.C0974;
import o.C1459;
import o.C3350db;
import o.C3604mq;
import o.C3616p;
import o.R;
import o.ne;
import o.nu;
import o.nx;
import zendesk.belvedere.ImageStream;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;
import zendesk.support.request.ViewMessageComposer;

@SuppressLint({"ViewConstructor"})
public class RequestViewConversationsEnabled extends FrameLayout implements RequestView {
    private C1459 activity;
    @C3350db
    ActionFactory af;
    @C3350db
    CellFactory cellFactory;
    private ImagePickerDragAnimation imagePickerDragAnimation;
    private ImageStream imageStream;
    private ComponentMessageComposer messageComposerComponent;
    private ViewMessageComposer messageComposerView;
    @C3350db
    C3616p picasso;
    private RecyclerView recyclerView;
    @C3350db
    nu store;
    private nx subscription;
    private View toolbar;
    private View toolbarContainer;

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewConversationsEnabled(Context context) {
        super(context);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }

    private void viewInit(Context context) {
        inflate(context, R.layout.f169982131558577, this);
        this.activity = (C1459) context;
    }

    /* access modifiers changed from: package-private */
    public void init(RequestComponent requestComponent, boolean z) {
        requestComponent.inject(this);
        bindViews();
        this.subscription = bindComponents(this.store);
        this.subscription.m4035();
        if (z) {
            this.store.m3992(this.af.loadCommentsFromCacheAsync());
            this.store.m3992(this.af.loadRequestAsync());
            this.store.m3992(this.af.initialLoadCommentsAsync());
            this.messageComposerView.requestFocusForInput();
        }
    }

    public boolean hasUnsavedInput() {
        ComponentMessageComposer componentMessageComposer = this.messageComposerComponent;
        return componentMessageComposer != null && componentMessageComposer.hasUnsavedInput();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nx nxVar = this.subscription;
        if (nxVar != null) {
            nxVar.m4033();
        }
    }

    private void bindViews() {
        this.imageStream = C3604mq.m3914(this.activity);
        this.recyclerView = (RecyclerView) findViewById(R.id.f164502131361927);
        this.messageComposerView = (ViewMessageComposer) findViewById(R.id.f164482131361925);
        this.toolbarContainer = this.activity.findViewById(R.id.f164432131361920);
        this.toolbar = this.activity.findViewById(R.id.f164522131361929);
        this.messageComposerView.init(this.imageStream);
        installDragAnimation();
    }

    private nx bindComponents(nu nuVar) {
        return ne.m3982(bindMessageComposer(nuVar), bindRecycler(nuVar), bindDialogComponent(nuVar));
    }

    private nx bindMessageComposer(nu nuVar) {
        this.messageComposerComponent = new ComponentMessageComposer(this.activity, this.imageStream, this.messageComposerView, nuVar, this.af);
        return nuVar.m4031(this.messageComposerComponent.getSelector(), this.messageComposerComponent);
    }

    private nx bindRecycler(nu nuVar) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this.activity);
        RecyclerListener recyclerListener = new RecyclerListener(this.recyclerView, linearLayoutManager);
        ComponentRequestAdapter componentRequestAdapter = new ComponentRequestAdapter(recyclerListener, this.cellFactory, this.recyclerView);
        CellMarginDecorator cellMarginDecorator = new CellMarginDecorator(componentRequestAdapter, this.activity);
        RequestItemAnimator requestItemAnimator = new RequestItemAnimator(componentRequestAdapter);
        ComponentRequestAdapter.RequestAdapter requestAdapter = new ComponentRequestAdapter.RequestAdapter(componentRequestAdapter);
        this.recyclerView.setItemAnimator(requestItemAnimator);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.addItemDecoration(cellMarginDecorator);
        this.recyclerView.setAdapter(requestAdapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.messageComposerView.setOnHeightChangeListener(recyclerListener);
        this.messageComposerView.addOnFocusChangeListener(recyclerListener);
        this.recyclerView.addOnLayoutChangeListener(recyclerListener);
        return nuVar.m4031(componentRequestAdapter.getSelector(), componentRequestAdapter);
    }

    private nx bindDialogComponent(nu nuVar) {
        return nuVar.m4029(StateUi.class, new ComponentDialog(this.activity, this.af, nuVar));
    }

    private void installDragAnimation() {
        this.imagePickerDragAnimation = new ImagePickerDragAnimation(this.toolbarContainer, this.messageComposerView, this.recyclerView, this.toolbar);
        this.imageStream.f14761.add(new WeakReference(this.imagePickerDragAnimation));
    }

    static class ImagePickerDragAnimation implements ImageStream.C3236 {
        private final Interpolator cubicBezierInterpolator = C0585.m5211(0.19f, 0.0f, 0.2f, 1.0f);
        private final View messageComposer;
        private final View recycler;
        private final View toolbar;
        private final View toolbarContainer;

        ImagePickerDragAnimation(View view, View view2, View view3, View view4) {
            this.toolbarContainer = view;
            this.messageComposer = view2;
            this.recycler = view3;
            this.toolbar = view4;
        }

        public void onScroll(int i, int i2, float f) {
            animateToolbar(i2, f);
            animateBackground(i2, f);
        }

        private void animateToolbar(int i, float f) {
            float f2 = (float) i;
            float f3 = f * f2;
            int r1 = C0293.m4182(this.toolbar);
            if (i > 0) {
                float f4 = f2 - f3;
                float f5 = (float) r1;
                if (f4 < f5) {
                    this.toolbarContainer.setTranslationY(f4 - f5);
                    return;
                }
            }
            this.toolbarContainer.setTranslationY(0.0f);
        }

        private void animateBackground(int i, float f) {
            float interpolation = (float) ((int) (this.cubicBezierInterpolator.getInterpolation(f * 0.3f) * -1.0f * ((float) i)));
            this.messageComposer.setTranslationY(interpolation);
            this.recycler.setTranslationY(interpolation);
        }
    }

    static class RequestItemAnimator extends C0837 {
        private final ComponentRequestAdapter component;

        RequestItemAnimator(ComponentRequestAdapter componentRequestAdapter) {
            this.component = componentRequestAdapter;
            setSupportsChangeAnimations(false);
        }

        public boolean canReuseUpdatedViewHolder(RecyclerView.con con) {
            if (this.component.getMessageForPos(con.getAdapterPosition()) instanceof CellType.Attachment) {
                return true;
            }
            return super.canReuseUpdatedViewHolder(con);
        }
    }

    static class RecyclerListener implements ViewMessageComposer.OnHeightChangeListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, C0970 {
        private final LinearLayoutManager linearLayoutManager;
        /* access modifiers changed from: private */
        public final int recyclerDefaultBottomPadding;
        /* access modifiers changed from: private */
        public final RecyclerView recyclerView;

        RecyclerListener(RecyclerView recyclerView2, LinearLayoutManager linearLayoutManager2) {
            this.recyclerView = recyclerView2;
            this.linearLayoutManager = linearLayoutManager2;
            this.recyclerDefaultBottomPadding = recyclerView2.getResources().getDimensionPixelOffset(R.dimen.f159982131165629);
        }

        public void onHeightChange(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    int paddingLeft = RecyclerListener.this.recyclerView.getPaddingLeft();
                    int paddingRight = RecyclerListener.this.recyclerView.getPaddingRight();
                    int paddingTop = RecyclerListener.this.recyclerView.getPaddingTop();
                    int access$100 = RecyclerListener.this.recyclerDefaultBottomPadding;
                    int i = i;
                    if (i > 0) {
                        access$100 += i;
                    }
                    if (access$100 != RecyclerListener.this.recyclerView.getPaddingBottom()) {
                        RecyclerListener.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, access$100);
                        RecyclerListener.this.scrollToBottom(1);
                    }
                }
            });
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                postScrollToBottom(2);
            }
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 < i8) {
                postScrollToBottom(1);
            }
        }

        public void onInserted(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2);
            postScrollToBottom(3);
        }

        public void onRemoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeRemoved(i, i2);
        }

        public void onMoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemMoved(i, i2);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2, obj);
        }

        /* access modifiers changed from: private */
        public void scrollToBottom(int i) {
            int itemCount = this.recyclerView.getAdapter().getItemCount() - 1;
            if (itemCount < 0) {
                return;
            }
            if (i == 1) {
                RecyclerView.con findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(itemCount);
                int i2 = -(this.recyclerView.getPaddingBottom() + ((findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView == null) ? 0 : findViewHolderForAdapterPosition.itemView.getHeight()));
                LinearLayoutManager linearLayoutManager2 = this.linearLayoutManager;
                linearLayoutManager2.f285 = itemCount;
                linearLayoutManager2.f280 = i2;
                if (linearLayoutManager2.f292 != null) {
                    linearLayoutManager2.f292.f311 = -1;
                }
                if (linearLayoutManager2.f349 != null) {
                    linearLayoutManager2.f349.requestLayout();
                }
            } else if (i == 3) {
                AnonymousClass2 r3 = new C0974(this.recyclerView.getContext()) {
                    public int calculateTimeForScrolling(int i) {
                        return 50;
                    }
                };
                r3.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().m403((RecyclerView.C3240AuX) r3);
            } else if (i == 2) {
                C0974 r32 = new C0974(this.recyclerView.getContext());
                r32.setTargetPosition(itemCount);
                this.recyclerView.getLayoutManager().m403((RecyclerView.C3240AuX) r32);
            }
        }

        private void postScrollToBottom(final int i) {
            this.recyclerView.post(new Runnable() {
                public void run() {
                    RecyclerListener.this.scrollToBottom(i);
                }
            });
        }
    }
}
