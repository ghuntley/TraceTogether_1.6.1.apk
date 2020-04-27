package zendesk.support.requestlist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.C0651;
import o.C3616p;
import o.P;
import o.R;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;
import zendesk.support.requestlist.RequestListView;

class RequestListViewHolder extends RecyclerView.con {
    private final int avatarRadius = this.context.getResources().getDimensionPixelOffset(R.dimen.f159832131165609);
    private final ZendeskAvatarView avatarView;
    private final TextView commentText;
    private final Context context;
    /* access modifiers changed from: private */
    public final RequestListView.OnItemClick listener;
    private final C3616p picasso;
    private final TextView subjectText;
    private final TextView timeText;
    private final TextView userText;

    static RequestListViewHolder create(Context context2, ViewGroup viewGroup, RequestListView.OnItemClick onItemClick, C3616p pVar) {
        return new RequestListViewHolder(LayoutInflater.from(context2).inflate(R.layout.f169802131558559, viewGroup, false), onItemClick, pVar);
    }

    private RequestListViewHolder(View view, RequestListView.OnItemClick onItemClick, C3616p pVar) {
        super(view);
        this.listener = onItemClick;
        this.picasso = pVar;
        this.context = view.getContext();
        this.avatarView = (ZendeskAvatarView) view.findViewById(R.id.f166782131362259);
        this.timeText = (TextView) view.findViewById(R.id.f166822131362263);
        this.userText = (TextView) view.findViewById(R.id.f166832131362264);
        this.subjectText = (TextView) view.findViewById(R.id.f166812131362262);
        this.commentText = (TextView) view.findViewById(R.id.f166792131362260);
    }

    /* access modifiers changed from: package-private */
    public void bind(final RequestListItem requestListItem) {
        String str;
        this.userText.setText(generateUserText(this.context.getString(R.string.f171212131886286), requestListItem.getLastCommentingAgentNames()));
        TextView textView = this.subjectText;
        if (requestListItem.hasAgentReplied()) {
            str = this.context.getString(R.string.f171222131886287, new Object[]{requestListItem.getFirstMessage()});
        } else {
            str = requestListItem.getFirstMessage();
        }
        textView.setText(str);
        if (requestListItem.isClosed()) {
            this.commentText.setText(R.string.f171232131886288);
        } else if (requestListItem.isFailed()) {
            this.commentText.setText(R.string.f170362131886118);
        } else {
            this.commentText.setText(requestListItem.getLastMessage());
        }
        this.timeText.setText(getDateTimeString(requestListItem.getLastUpdated()));
        bindAvatar(requestListItem.hasAgentReplied(), requestListItem.getLastCommentingAgentNames(), requestListItem.getAvatar());
        style(requestListItem.isUnread(), requestListItem.isFailed(), requestListItem.isClosed());
        this.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListViewHolder.this.listener.onClick(requestListItem);
            }
        });
    }

    private String generateUserText(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return TextUtils.join(", ", arrayList);
    }

    private void bindAvatar(boolean z, List<String> list, String str) {
        if (!z) {
            this.avatarView.showUserWithIdentifier(Integer.valueOf(R.string.f171212131886286));
        } else if (P.m1406(str)) {
            this.avatarView.showUserWithAvatarImage(this.picasso, str, list.get(0), this.avatarRadius);
        } else {
            this.avatarView.showUserWithName(list.get(0));
        }
    }

    private void style(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(1));
            this.userText.setTypeface(Typeface.defaultFromStyle(1));
            this.commentText.setTextColor(C0651.m5450(this.context, R.color.f157412131099941));
            this.timeText.setTextColor(UiUtils.themeAttributeToColor(R.attr.f150312130968815, this.context, R.color.f157432131099944));
        } else {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(0));
            this.userText.setTypeface(Typeface.defaultFromStyle(0));
            this.commentText.setTextColor(C0651.m5450(this.context, R.color.f157432131099944));
            this.timeText.setTextColor(C0651.m5450(this.context, R.color.f157432131099944));
        }
        if (z2) {
            this.commentText.setTextColor(C0651.m5450(this.context, R.color.f157392131099938));
        }
        this.itemView.setBackgroundColor(C0651.m5450(this.context, z3 ? R.color.f157422131099942 : R.color.f157452131099946));
    }

    private CharSequence getDateTimeString(Date date) {
        return DateUtils.getRelativeTimeSpanString(this.context, date.getTime(), false);
    }
}
