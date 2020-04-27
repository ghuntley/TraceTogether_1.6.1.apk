package zendesk.support.requestlist;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C3616p;
import zendesk.support.requestlist.RequestListView;

class RequestListAdapter extends RecyclerView.C0035<RequestListViewHolder> {
    private final RequestListView.OnItemClick itemClickListener;
    private final C3616p picasso;
    private final List<RequestListItem> requestListItems = new ArrayList(0);

    RequestListAdapter(RequestListView.OnItemClick onItemClick, C3616p pVar) {
        this.itemClickListener = onItemClick;
        this.picasso = pVar;
        setHasStableIds(true);
    }

    public RequestListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RequestListViewHolder.create(viewGroup.getContext(), viewGroup, this.itemClickListener, this.picasso);
    }

    public void onBindViewHolder(RequestListViewHolder requestListViewHolder, int i) {
        requestListViewHolder.bind(this.requestListItems.get(i));
    }

    public int getItemCount() {
        return this.requestListItems.size();
    }

    public long getItemId(int i) {
        return this.requestListItems.get(i).getItemId();
    }

    /* access modifiers changed from: package-private */
    public void swapRequests(List<RequestListItem> list) {
        this.requestListItems.clear();
        this.requestListItems.addAll(list);
        notifyDataSetChanged();
    }
}
