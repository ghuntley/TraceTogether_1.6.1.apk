package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import o.C3289b;
import o.C3616p;
import o.C3620t;
import o.R;
import o.nk;

class AdapterAttachmentCarousel extends RecyclerView.C0035<CarouselViewHolder> {
    /* access modifiers changed from: private */
    public final ActionFactory af;
    private final AttachmentHelper attachmentHelper;
    /* access modifiers changed from: private */
    public final nk dispatcher;
    private final C3616p picasso;
    private final CarouselViewHolder.OnRemoveListener removeListener = new CarouselViewHolder.OnRemoveListener() {
        public void onRemove(StateRequestAttachment stateRequestAttachment) {
            AdapterAttachmentCarousel.this.dispatcher.m3992(AdapterAttachmentCarousel.this.af.deselectAttachment(Collections.singletonList(StateRequestAttachment.convert(stateRequestAttachment))));
        }
    };

    AdapterAttachmentCarousel(AttachmentHelper attachmentHelper2, C3616p pVar, ActionFactory actionFactory, nk nkVar) {
        this.attachmentHelper = attachmentHelper2;
        this.picasso = pVar;
        this.af = actionFactory;
        this.dispatcher = nkVar;
        setHasStableIds(true);
    }

    public CarouselViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new FileAttachmentViewHolder(from, viewGroup);
        }
        if (i != 2) {
            return null;
        }
        return new ImageAttachmentViewHolder(from, viewGroup, this.picasso);
    }

    public void onBindViewHolder(CarouselViewHolder carouselViewHolder, int i) {
        carouselViewHolder.bind(this.attachmentHelper.getSelectedAttachments().get(i), this.removeListener);
    }

    public int getItemCount() {
        return this.attachmentHelper.getSelectedAttachments().size();
    }

    public long getItemId(int i) {
        return (long) this.attachmentHelper.getSelectedAttachments().get(i).getLocalUri().hashCode();
    }

    public int getItemViewType(int i) {
        return UtilsAttachment.isImageAttachment(this.attachmentHelper.getSelectedAttachments().get(i)) ? 2 : 1;
    }

    static abstract class CarouselViewHolder extends RecyclerView.con {

        interface OnRemoveListener {
            void onRemove(StateRequestAttachment stateRequestAttachment);
        }

        /* access modifiers changed from: package-private */
        public abstract void bind(StateRequestAttachment stateRequestAttachment, OnRemoveListener onRemoveListener);

        CarouselViewHolder(View view) {
            super(view);
        }
    }

    static class FileAttachmentViewHolder extends CarouselViewHolder {
        private final ImageView appIcon = ((ImageView) this.itemView.findViewById(R.id.f166582131362239));
        private final TextView appName = ((TextView) this.itemView.findViewById(R.id.f166572131362238));
        private final View container = this.itemView.findViewById(R.id.f166622131362243);
        private final TextView name = ((TextView) this.itemView.findViewById(R.id.f166592131362240));
        private final View remove = this.itemView.findViewById(R.id.f166612131362242);

        FileAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.f169762131558555, viewGroup, false));
        }

        /* access modifiers changed from: package-private */
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            Context context = this.itemView.getContext();
            ResolveInfo appInfoForFile = UtilsAttachment.getAppInfoForFile(context, stateRequestAttachment.getName());
            this.appIcon.setImageDrawable(UtilsAttachment.getAppIcon(context, appInfoForFile));
            this.appName.setText(UtilsAttachment.getAppName(context, appInfoForFile));
            this.name.setText(stateRequestAttachment.getName());
            this.remove.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            this.remove.setContentDescription(context.getString(R.string.f171742131886369, new Object[]{stateRequestAttachment.getName()}));
            this.container.setContentDescription(context.getString(R.string.f171732131886368, new Object[]{stateRequestAttachment.getName()}));
        }
    }

    static class ImageAttachmentViewHolder extends CarouselViewHolder {
        private final View container = this.itemView.findViewById(R.id.f166632131362244);
        private final ImageView imageView = ((ImageView) this.itemView.findViewById(R.id.f166602131362241));
        private final C3616p picasso;
        private final View remove = this.itemView.findViewById(R.id.f166612131362242);

        ImageAttachmentViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, C3616p pVar) {
            super(layoutInflater.inflate(R.layout.f169772131558556, viewGroup, false));
            this.picasso = pVar;
        }

        /* access modifiers changed from: package-private */
        public void bind(final StateRequestAttachment stateRequestAttachment, final CarouselViewHolder.OnRemoveListener onRemoveListener) {
            C3620t tVar = new C3620t(this.picasso, stateRequestAttachment.getParsedLocalUri());
            tVar.f3498 = true;
            tVar.f3496.f3487 = true;
            tVar.m4076(this.imageView, (C3289b) null);
            this.remove.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    onRemoveListener.onRemove(stateRequestAttachment);
                }
            });
            Context context = this.itemView.getContext();
            this.remove.setContentDescription(context.getString(R.string.f171742131886369, new Object[]{stateRequestAttachment.getName()}));
            this.container.setContentDescription(context.getString(R.string.f171732131886368, new Object[]{stateRequestAttachment.getName()}));
        }
    }
}
