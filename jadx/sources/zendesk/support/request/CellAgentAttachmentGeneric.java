package zendesk.support.request;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import o.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellAgentAttachmentGeneric extends CellBase implements CellType.Attachment, CellType.Agent {
    private final ResolveInfo appInfo;
    private final Rect insets;
    private boolean isAgentNameVisible = false;
    private final StateRequestAttachment requestAttachment;
    private final StateRequestUser user;

    CellAgentAttachmentGeneric(CellBindHelper cellBindHelper, StateRequestAttachment stateRequestAttachment, StateRequestUser stateRequestUser, Date date) {
        super(cellBindHelper, R.layout.f169722131558551, stateRequestAttachment.getId(), stateRequestUser.getId(), date);
        this.requestAttachment = stateRequestAttachment;
        this.user = stateRequestUser;
        this.appInfo = cellBindHelper.getAppInfo(stateRequestAttachment.getName());
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.f159922131165623);
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ((TextView) requestViewHolder.findCachedView(R.id.f166482131362229)).setText(this.requestAttachment.getName());
        this.utils.bindAppInfo(this.appInfo, (TextView) requestViewHolder.findCachedView(R.id.f166492131362230), (ImageView) requestViewHolder.findCachedView(R.id.f166472131362228));
        View findCachedView = requestViewHolder.findCachedView(R.id.f166462131362227);
        this.utils.addOnClickListenerForFileAttachment(findCachedView, this.requestAttachment);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.f166452131362226), this.isAgentNameVisible, this.user);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171832131886379, new Object[]{this.requestAttachment.getName()}));
        sb.append(" ");
        sb.append(context.getString(R.string.f171852131886381, new Object[]{DateUtils.getRelativeTimeSpanString(context, getTimeStamp().getTime(), true), this.user.getName()}));
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType.Base base) {
        return this.utils.areAttachmentCellContentsTheSame(this, base) && this.utils.areAgentCellContentsTheSame(this, base);
    }

    public StateRequestAttachment getAttachment() {
        return this.requestAttachment;
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
