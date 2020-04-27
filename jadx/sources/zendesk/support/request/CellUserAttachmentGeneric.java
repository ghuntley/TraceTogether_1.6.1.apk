package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import java.util.List;
import o.C2963;
import o.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellUserAttachmentGeneric extends CellBase implements CellType.Attachment, CellType.Stateful {
    private final ResolveInfo appInfo;
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final StateRequestAttachment requestAttachment;
    private final boolean showError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CellUserAttachmentGeneric(CellBindHelper cellBindHelper, StateMessage stateMessage, StateRequestAttachment stateRequestAttachment, Date date, boolean z, boolean z2, List<StateMessage> list, boolean z3) {
        super(cellBindHelper, R.layout.f169832131558562, stateRequestAttachment.getId(), -2147483647L, date);
        CellBindHelper cellBindHelper2 = cellBindHelper;
        this.requestAttachment = stateRequestAttachment;
        this.markAsDelivered = z;
        this.message = stateMessage;
        this.showError = z2;
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z3;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.f159952131165626);
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(R.id.f167012131362282)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(R.id.f167032131362284), (ImageView) requestViewHolder.findCachedView(R.id.f167002131362281));
        C2963 r0 = (C2963) requestViewHolder.findCachedView(R.id.f166992131362280);
        this.utils.addOnClickListenerForFileAttachment(r0, this.requestAttachment);
        this.utils.bindStatusLabel((TextView) requestViewHolder.findCachedView(R.id.f167022131362283), this.lastErrorCellOfBlock, this.markAsDelivered);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        r0.setCardBackgroundColor(this.utils.colorForError(this.showError));
        if (errorClickListener != null) {
            r0.setOnClickListener(errorClickListener);
        }
        r0.setContentDescription(buildTalkBackString(r0.getContext()));
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171882131886384, new Object[]{this.requestAttachment.getName()}));
        sb.append(" ");
        if (!this.showError) {
            sb.append(context.getString(R.string.f171902131886386, new Object[]{DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true)}));
        } else {
            sb.append(context.getString(R.string.f171872131886383));
        }
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType.Base base) {
        return this.utils.areAttachmentCellContentsTheSame(this, base) && this.utils.areStatefulCellContentsTheSame(this, base);
    }

    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
    }

    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    public CellType.Stateful markAsDelivered() {
        return new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), true, this.showError, this.erroredMessages, this.lastErrorCellOfBlock);
    }

    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z) {
        return new CellUserAttachmentGeneric(this.utils, this.message, this.requestAttachment, getTimeStamp(), this.markAsDelivered, true, list, z);
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

    public Rect getInsets() {
        return this.insets;
    }
}
