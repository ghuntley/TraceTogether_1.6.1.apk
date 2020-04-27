package zendesk.support.request;

import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import o.C1459;
import o.R;
import o.mF;
import o.nk;
import o.nl;
import o.nq;
import o.nt;
import zendesk.belvedere.ImageStream;
import zendesk.support.request.RequestViewConversationsDisabled;

class ComponentAttachmentCarousel implements ImageStream.Cif, nl<AttachmentCarouselModel>, RequestViewConversationsDisabled.MenuItemsDelegate {
    private final ActionFactory actionFactory;
    private final C1459 activity;
    private MenuItem attachmentButton;
    private final AttachmentHelper attachmentHelper;
    private boolean attachmentSupportEnabled = false;
    private final nk dispatcher;
    private final ImageStream imageStream;
    private final RecyclerView recyclerView;
    /* access modifiers changed from: private */
    public final ScrollView scrollView;
    private final nq<AttachmentCarouselModel> selector;

    public void onMenuItemsClicked(MenuItem menuItem) {
    }

    ComponentAttachmentCarousel(nk nkVar, ActionFactory actionFactory2, ImageStream imageStream2, C1459 r5, AttachmentHelper attachmentHelper2, RecyclerView recyclerView2) {
        this.dispatcher = nkVar;
        this.actionFactory = actionFactory2;
        this.imageStream = imageStream2;
        this.activity = r5;
        this.attachmentHelper = attachmentHelper2;
        this.recyclerView = recyclerView2;
        this.scrollView = (ScrollView) r5.findViewById(R.id.f166662131362247);
        this.selector = new AttachmentCarouselSelector();
        initImagePicker();
    }

    private void initImagePicker() {
        this.imageStream.f14757.add(new WeakReference(this));
        if (this.imageStream.f14758.get().f3070.hasFocus()) {
            this.scrollView.requestFocus();
        }
        if (this.imageStream.f14759) {
            this.scrollView.post(new Runnable() {
                public void run() {
                    ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
                }
            });
        }
    }

    public void update(AttachmentCarouselModel attachmentCarouselModel) {
        this.attachmentSupportEnabled = attachmentCarouselModel.isAttachmentSupportEnabled();
        attachmentButtonVisibility(this.attachmentSupportEnabled, !attachmentCarouselModel.isLoading());
        if (!attachmentCarouselModel.isLoading()) {
            this.attachmentHelper.updateAttachments(attachmentCarouselModel.getSelectedAttachments(), attachmentCarouselModel.getAdditionalAttachments());
            this.attachmentHelper.updateMaxFileSize(attachmentCarouselModel.getMaxAttachmentSize());
            attachmentCount(this.attachmentHelper.getSelectedAttachments().size());
            if (this.attachmentHelper.getSelectedAttachments().size() > 0) {
                scroll(130);
            } else {
                scroll(33);
            }
            this.recyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    public void onDismissed() {
        this.scrollView.requestFocus();
        scroll(33);
    }

    public void onVisible() {
        scroll(130);
    }

    public void onMediaSelected(List<mF> list) {
        this.dispatcher.m3992(this.actionFactory.selectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    public void onMediaDeselected(List<mF> list) {
        this.dispatcher.m3992(this.actionFactory.deselectAttachment(list));
        onAddAttachmentsRequested(false);
    }

    /* access modifiers changed from: private */
    public void onAddAttachmentsRequested(boolean z) {
        boolean z2 = true;
        if (!(this.imageStream.f14760 != null)) {
            this.attachmentHelper.showImagePicker(this.activity);
        } else if (z) {
            ImageStream imageStream2 = this.imageStream;
            if (imageStream2.f14760 == null) {
                z2 = false;
            }
            if (z2) {
                imageStream2.f14760.dismiss();
            }
        }
    }

    private void scroll(final int i) {
        this.scrollView.post(new Runnable() {
            public void run() {
                ComponentAttachmentCarousel.this.scrollView.fullScroll(i);
            }
        });
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.attachmentButton = menuItem2;
        menuItem2.getActionView().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ComponentAttachmentCarousel.this.onAddAttachmentsRequested(true);
            }
        });
        attachmentButtonVisibility(this.attachmentSupportEnabled, true);
    }

    /* access modifiers changed from: package-private */
    public nq<AttachmentCarouselModel> getSelector() {
        return this.selector;
    }

    private void attachmentButtonVisibility(boolean z, boolean z2) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            menuItem.setVisible(z);
            this.attachmentButton.getActionView().setEnabled(z2);
        }
    }

    private void attachmentCount(int i) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            ((ViewCellAttachmentMenuItem) menuItem.getActionView()).setBadgeCount(i);
        }
    }

    static class AttachmentCarouselModel {
        private final Collection<StateRequestAttachment> additionalAttachments;
        private final boolean isAttachmentSupportEnabled;
        private final boolean isLoading;
        private final long maxAttachmentSize;
        private final Collection<StateRequestAttachment> selectedAttachments;

        AttachmentCarouselModel(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2, boolean z, boolean z2, long j) {
            this.selectedAttachments = collection;
            this.additionalAttachments = collection2;
            this.isLoading = z;
            this.isAttachmentSupportEnabled = z2;
            this.maxAttachmentSize = j;
        }

        /* access modifiers changed from: package-private */
        public Collection<StateRequestAttachment> getSelectedAttachments() {
            return this.selectedAttachments;
        }

        /* access modifiers changed from: package-private */
        public Collection<StateRequestAttachment> getAdditionalAttachments() {
            return this.additionalAttachments;
        }

        /* access modifiers changed from: package-private */
        public boolean isLoading() {
            return this.isLoading;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachmentSupportEnabled() {
            return this.isAttachmentSupportEnabled;
        }

        /* access modifiers changed from: package-private */
        public long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }
    }

    static class AttachmentCarouselSelector implements nq<AttachmentCarouselModel> {
        AttachmentCarouselSelector() {
        }

        public AttachmentCarouselModel selectData(nt ntVar) {
            StateAttachments fromState = StateAttachments.fromState(ntVar);
            StateConfig fromState2 = StateConfig.fromState(ntVar);
            return new AttachmentCarouselModel(fromState.getSelectedAttachments(), fromState.getAllSelectedAttachments(), StateProgress.fomState(ntVar).getRunningRequests() > 0, fromState2.getSettings().isAttachmentsEnabled(), fromState2.getSettings().getMaxAttachmentSize());
        }
    }
}
