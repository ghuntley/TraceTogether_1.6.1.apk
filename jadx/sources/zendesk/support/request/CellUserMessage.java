package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import o.R;
import zendesk.support.UiUtils;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellUserMessage extends CellBase implements CellType.Message, CellType.Stateful {
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final boolean showError;
    private final CharSequence textMessage;

    CellUserMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, boolean z, boolean z2, CharSequence charSequence, List<StateMessage> list, boolean z3) {
        super(cellBindHelper, R.layout.f169852131558564, stateMessage.getId(), -2147483647L, stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.markAsDelivered = z;
        this.showError = z2;
        this.insets = cellBindHelper.getInsets(0, 0, 0, R.dimen.f159952131165626);
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z3;
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(R.id.f167102131362291);
        viewRequestText.setText(this.textMessage);
        TextView textView = (TextView) requestViewHolder.findCachedView(R.id.f167092131362290);
        this.utils.bindStatusLabel(textView, this.lastErrorCellOfBlock, this.markAsDelivered);
        View findCachedView = requestViewHolder.findCachedView(R.id.f167072131362288);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        UiUtils.setTint(this.utils.colorForError(isErrorShown()), findCachedView.getBackground(), findCachedView);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        findCachedView.setOnClickListener(errorClickListener);
        viewRequestText.setOnClickListener(errorClickListener);
        textView.setOnClickListener(errorClickListener);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171912131886387, new Object[]{this.textMessage}));
        sb.append(" ");
        if (!this.showError) {
            sb.append(context.getString(R.string.f171902131886386, new Object[]{DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true)}));
        } else {
            sb.append(context.getString(R.string.f171872131886383));
        }
        return sb.toString();
    }

    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    public CellType.Stateful markAsDelivered() {
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, true, this.showError, this.textMessage, this.erroredMessages, this.lastErrorCellOfBlock);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
    }

    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z) {
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, this.markAsDelivered, true, this.textMessage, list, z);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
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
        return this.utils.areMessageContentsTheSame(this, base) && this.utils.areStatefulCellContentsTheSame(this, base);
    }

    public String getMessage() {
        return this.message.getBody();
    }

    public Rect getInsets() {
        return this.insets;
    }
}
