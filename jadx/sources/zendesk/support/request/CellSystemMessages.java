package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import o.R;
import zendesk.support.RequestStatus;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellSystemMessages {
    CellSystemMessages() {
    }

    static class CellDateMessage extends CellBase {
        CellDateMessage(CellBindHelper cellBindHelper, long j, Date date) {
            super(cellBindHelper, R.layout.f169782131558557, j, -2147483648L, date);
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            this.utils.bindDate((TextView) requestViewHolder.findCachedView(R.id.f166672131362248), getTimeStamp());
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return getTimeStamp().equals(base.getTimeStamp());
        }
    }

    static class CellRequestStatus extends CellBase {
        private final RequestStatus requestStatus;

        CellRequestStatus(CellBindHelper cellBindHelper, RequestStatus requestStatus2) {
            super(cellBindHelper, R.layout.f169812131558560, -9223372036854775807L, -2147483648L, new Date());
            this.requestStatus = requestStatus2;
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            TextView textView = (TextView) requestViewHolder.findCachedView(R.id.f166982131362279);
            if (this.requestStatus == RequestStatus.Closed) {
                textView.setText(R.string.f171342131886300);
            }
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellRequestStatus;
        }
    }

    static class CellSystemMessage extends CellBase {
        private final String message;

        CellSystemMessage(Date date, String str) {
            super((CellBindHelper) null, R.layout.f169812131558560, Long.MIN_VALUE, -2147483648L, date);
            this.message = str;
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            ((TextView) requestViewHolder.findCachedView(R.id.f166982131362279)).setText(this.message);
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellSystemMessage;
        }
    }
}
