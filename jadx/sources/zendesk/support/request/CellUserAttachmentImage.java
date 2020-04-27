package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.List;
import o.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellUserAttachmentImage extends CellBase implements CellType.Attachment, CellType.Stateful {
    private final StateRequestAttachment attachment;
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final boolean showError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CellUserAttachmentImage(CellBindHelper cellBindHelper, StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date, boolean z, boolean z2, List<StateMessage> list, boolean z3) {
        super(cellBindHelper, R.layout.f169842131558563, stateRequestAttachment.getId(), -2147483647L, date);
        this.message = stateMessage;
        this.attachment = stateRequestAttachment;
        this.markAsDelivered = z;
        this.showError = z2;
        this.erroredMessages = list;
        CellBindHelper cellBindHelper2 = cellBindHelper;
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.f159952131165626);
        this.lastErrorCellOfBlock = z3;
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ImageView imageView = (ImageView) requestViewHolder.findCachedView(R.id.f167062131362287);
        this.utils.bindImage(imageView, this.attachment);
        this.utils.addOnClickListenerForImageAttachment(imageView, this.attachment);
        this.utils.bindStatusLabel((TextView) requestViewHolder.findCachedView(R.id.f167042131362285), this.lastErrorCellOfBlock, this.markAsDelivered);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        imageView.setColorFilter(this.utils.colorForErrorImage(this.showError));
        if (errorClickListener != null) {
            imageView.setOnClickListener(errorClickListener);
        }
        View findCachedView = requestViewHolder.findCachedView(R.id.f167052131362286);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171892131886385, new Object[]{this.attachment.getName()}));
        sb.append(" ");
        if (!this.showError) {
            sb.append(context.getString(R.string.f171902131886386, new Object[]{DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true)}));
        } else {
            sb.append(context.getString(R.string.f171872131886383));
        }
        return sb.toString();
    }

    public StateRequestAttachment getAttachment() {
        return this.attachment;
    }

    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    public CellType.Stateful markAsDelivered() {
        return new CellUserAttachmentImage(this.utils, this.message, this.attachment, getTimeStamp(), true, this.showError, this.erroredMessages, this.lastErrorCellOfBlock);
    }

    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z) {
        return new CellUserAttachmentImage(this.utils, this.message, this.attachment, getTimeStamp(), this.markAsDelivered, true, list, z);
    }

    public StateMessage getStateMessage() {
        return this.message;
    }

    public List<StateMessage> getErrorGroupMessages() {
        return this.erroredMessages;
    }

    public boolean isErrorShown() {
        return this.showError;
    }

    public boolean isLastErrorCellOfBlock() {
        return this.lastErrorCellOfBlock;
    }

    public boolean areContentsTheSame(CellType.Base base) {
        return this.utils.areAttachmentCellContentsTheSame(this, base) && this.utils.areStatefulCellContentsTheSame(this, base);
    }

    public Rect getInsets() {
        return this.insets;
    }
}
