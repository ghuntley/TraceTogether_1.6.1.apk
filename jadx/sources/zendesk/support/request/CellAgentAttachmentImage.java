package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import o.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellAgentAttachmentImage extends CellBase implements CellType.Attachment, CellType.Agent {
    private final StateRequestAttachment attachment;
    private final Rect insets;
    private boolean isAgentNameVisible = false;
    private final StateRequestUser user;

    CellAgentAttachmentImage(CellBindHelper cellBindHelper, StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        super(cellBindHelper, R.layout.f169732131558552, stateRequestAttachment.getId(), stateRequestUser.getId(), date);
        this.user = stateRequestUser;
        this.attachment = stateRequestAttachment;
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.f159922131165623);
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ImageView imageView = (ImageView) requestViewHolder.findCachedView(R.id.f166512131362232);
        this.utils.bindImage(imageView, this.attachment);
        this.utils.addOnClickListenerForImageAttachment(imageView, this.attachment);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.f166502131362231), this.isAgentNameVisible, this.user);
        View findCachedView = requestViewHolder.findCachedView(R.id.f166442131362225);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171842131886380, new Object[]{this.attachment.getName()}));
        sb.append(" ");
        sb.append(context.getString(R.string.f171852131886381, new Object[]{DateUtils.getRelativeTimeSpanString(context, getTimeStamp().getTime(), true), this.user.getName()}));
        return sb.toString();
    }

    public StateRequestAttachment getAttachment() {
        return this.attachment;
    }

    public boolean areContentsTheSame(CellType.Base base) {
        return this.utils.areAttachmentCellContentsTheSame(this, base) && this.utils.areAgentCellContentsTheSame(this, base);
    }

    public Rect getInsets() {
        return this.insets;
    }

    public void showAgentName(boolean z) {
        this.isAgentNameVisible = z;
    }

    public boolean isAgentNameVisible() {
        return this.isAgentNameVisible;
    }

    public StateRequestUser getAgent() {
        return this.user;
    }
}
