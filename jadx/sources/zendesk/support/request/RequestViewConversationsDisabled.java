package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C1459;
import o.C3350db;
import o.C3604mq;
import o.C3616p;
import o.R;
import o.ne;
import o.nu;
import o.nx;
import zendesk.belvedere.ImageStream;

public class RequestViewConversationsDisabled extends FrameLayout implements RequestView {
    private C1459 activity;
    @C3350db
    ActionFactory af;
    private AttachmentHelper attachmentHelper;
    private ImageStream imageStream;
    private ComponentInputForm inputFormComponent;
    private List<MenuItemsDelegate> menuItemsDelegates = new ArrayList();
    @C3350db
    C3616p picasso;
    @C3350db
    nu store;
    private nx subscription;

    interface MenuItemsDelegate {
        void onMenuItemsClicked(MenuItem menuItem);

        void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2);
    }

    public RequestViewConversationsDisabled(Context context) {
        super(context);
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }

    private void viewInit(Context context) {
        inflate(context, R.layout.f169972131558576, this);
        this.activity = (C1459) context;
    }

    public void init(RequestComponent requestComponent) {
        requestComponent.inject(this);
        this.imageStream = C3604mq.m3914(this.activity);
        this.attachmentHelper = new AttachmentHelper(new int[0]);
        this.subscription = bindComponents(this.store, this.af);
        this.subscription.m4035();
    }

    public boolean hasUnsavedInput() {
        ComponentInputForm componentInputForm = this.inputFormComponent;
        return componentInputForm != null && componentInputForm.hasUnsavedInput();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nx nxVar = this.subscription;
        if (nxVar != null) {
            nxVar.m4033();
        }
    }

    private nx bindComponents(nu nuVar, ActionFactory actionFactory) {
        return ne.m3982(bindInput(nuVar), bindAttachmentCarousel(nuVar, actionFactory));
    }

    private nx bindInput(nu nuVar) {
        this.inputFormComponent = ComponentInputForm.create(this, nuVar, this.af, this.attachmentHelper);
        this.menuItemsDelegates.add(this.inputFormComponent);
        this.imageStream.f14758.get().f3068.add(new WeakReference(this.inputFormComponent));
        return nuVar.m4031(this.inputFormComponent.getSelector(), this.inputFormComponent);
    }

    private nx bindAttachmentCarousel(nu nuVar, ActionFactory actionFactory) {
        RecyclerView recyclerView = (RecyclerView) this.activity.findViewById(R.id.f166562131362237);
        AdapterAttachmentCarousel adapterAttachmentCarousel = new AdapterAttachmentCarousel(this.attachmentHelper, this.picasso, actionFactory, nuVar);
        ComponentAttachmentCarousel componentAttachmentCarousel = new ComponentAttachmentCarousel(nuVar, actionFactory, this.imageStream, this.activity, this.attachmentHelper, recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(adapterAttachmentCarousel);
        this.menuItemsDelegates.add(componentAttachmentCarousel);
        return nuVar.m4031(componentAttachmentCarousel.getSelector(), componentAttachmentCarousel);
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(R.menu.f170062131623938, menu);
        MenuItem findItem = menu.findItem(R.id.f166652131362246);
        MenuItem findItem2 = menu.findItem(R.id.f166642131362245);
        for (MenuItemsDelegate onMenuItemsInflated : this.menuItemsDelegates) {
            onMenuItemsInflated.onMenuItemsInflated(findItem, findItem2);
        }
        return true;
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        for (MenuItemsDelegate onMenuItemsClicked : this.menuItemsDelegates) {
            onMenuItemsClicked.onMenuItemsClicked(menuItem);
        }
        return true;
    }
}
