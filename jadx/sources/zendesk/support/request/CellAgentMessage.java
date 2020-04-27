package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import o.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellAgentMessage extends CellBase implements CellType.Message, CellType.Agent {
    private final Rect insets;
    private final StateMessage message;
    private boolean showAgentName = false;
    private final CharSequence textMessage;
    private final StateRequestUser user;

    CellAgentMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, CharSequence charSequence, StateRequestUser stateRequestUser) {
        super(cellBindHelper, R.layout.f169742131558553, stateMessage.getId(), stateMessage.getUserId(), stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.user = stateRequestUser;
        this.insets = cellBindHelper.getInsets(0, R.dimen.f159942131165625, 0, R.dimen.f159932131165624);
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(R.id.f166542131362235);
        viewRequestText.setText(this.textMessage);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(R.id.f166552131362236), this.showAgentName, this.user);
        View findCachedView = requestViewHolder.findCachedView(R.id.f166522131362233);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
        viewRequestText.requestLayout();
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171862131886382, new Object[]{this.textMessage}));
        sb.append(" ");
        sb.append(context.getString(R.string.f171852131886381, new Object[]{DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true), this.user.getName()}));
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType.Base base) {
        return this.utils.areMessageContentsTheSame(this, base) && this.utils.areAgentCellContentsTheSame(this, base);
    }

    public CharSequence getMessage() {
        return this.message.getBody();
    }

    public Rect getInsets() {
        return this.insets;
    }

    public void showAgentName(boolean z) {
        this.showAgentName = z;
    }

    public boolean isAgentNameVisible() {
        return this.showAgentName;
    }

    public StateRequestUser getAgent() {
        return this.user;
    }
}
