package zendesk.support.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import o.R;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

class HelpSearchRecyclerViewAdapter extends RecyclerView.C0035 {
    /* access modifiers changed from: private */
    public final HelpCenterProvider helpCenterProvider;
    /* access modifiers changed from: private */
    public final HelpCenterUiConfig helpCenterUiConfig;
    /* access modifiers changed from: private */
    public String query;
    private boolean resultsCleared = false;
    private List<SearchArticle> searchArticles;

    HelpSearchRecyclerViewAdapter(List<SearchArticle> list, String str, HelpCenterUiConfig helpCenterUiConfig2, HelpCenterProvider helpCenterProvider2) {
        this.searchArticles = list;
        this.query = str;
        this.helpCenterUiConfig = helpCenterUiConfig2;
        this.helpCenterProvider = helpCenterProvider2;
    }

    /* access modifiers changed from: package-private */
    public void update(List<SearchArticle> list, String str) {
        this.resultsCleared = false;
        this.searchArticles = list;
        this.query = str;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public void clearResults() {
        this.resultsCleared = true;
        this.searchArticles = Collections.emptyList();
        this.query = "";
        notifyDataSetChanged();
    }

    public RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 423) {
            return new PaddingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f169922131558571, viewGroup, false));
        }
        if (i == 441) {
            return new NoResultsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f169912131558570, viewGroup, false));
        }
        if (i != 531) {
            return null;
        }
        return new HelpSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f169932131558572, viewGroup, false), viewGroup.getContext());
    }

    public void onBindViewHolder(RecyclerView.con con, int i) {
        if (531 == getItemViewType(i)) {
            ((HelpSearchViewHolder) con).bindTo(this.searchArticles.get(i));
        }
    }

    public int getItemCount() {
        if (this.resultsCleared) {
            return 0;
        }
        return Math.max(this.searchArticles.size() + getPaddingExtraItem(), 1);
    }

    private int getPaddingExtraItem() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    public int getItemViewType(int i) {
        if (i == 0 && this.searchArticles.size() == 0) {
            return 441;
        }
        return (i <= 0 || i != this.searchArticles.size()) ? 531 : 423;
    }

    class HelpSearchViewHolder extends RecyclerView.con {
        private Context context;
        private TextView subtitleTextView;
        private TextView titleTextView;

        HelpSearchViewHolder(View view, Context context2) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(R.id.f167842131362399);
            this.subtitleTextView = (TextView) view.findViewById(R.id.f167522131362359);
            this.context = context2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.String} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void bindTo(final zendesk.support.SearchArticle r8) {
            /*
                r7 = this;
                if (r8 == 0) goto L_0x0098
                zendesk.support.Article r0 = r8.getArticle()
                if (r0 != 0) goto L_0x000a
                goto L_0x0098
            L_0x000a:
                zendesk.support.Article r0 = r8.getArticle()
                java.lang.String r0 = r0.getTitle()
                if (r0 == 0) goto L_0x001d
                zendesk.support.Article r0 = r8.getArticle()
                java.lang.String r0 = r0.getTitle()
                goto L_0x001f
            L_0x001d:
                java.lang.String r0 = ""
            L_0x001f:
                zendesk.support.guide.HelpSearchRecyclerViewAdapter r1 = zendesk.support.guide.HelpSearchRecyclerViewAdapter.this
                java.lang.String r1 = r1.query
                r2 = -1
                if (r1 != 0) goto L_0x002a
                r1 = -1
                goto L_0x0044
            L_0x002a:
                java.util.Locale r1 = java.util.Locale.getDefault()
                java.lang.String r1 = r0.toLowerCase(r1)
                zendesk.support.guide.HelpSearchRecyclerViewAdapter r3 = zendesk.support.guide.HelpSearchRecyclerViewAdapter.this
                java.lang.String r3 = r3.query
                java.util.Locale r4 = java.util.Locale.getDefault()
                java.lang.String r3 = r3.toLowerCase(r4)
                int r1 = r1.indexOf(r3)
            L_0x0044:
                r3 = 1
                if (r1 == r2) goto L_0x0062
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r0)
                android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
                r0.<init>(r3)
                zendesk.support.guide.HelpSearchRecyclerViewAdapter r4 = zendesk.support.guide.HelpSearchRecyclerViewAdapter.this
                java.lang.String r4 = r4.query
                int r4 = r4.length()
                int r4 = r4 + r1
                r5 = 18
                r2.setSpan(r0, r1, r4, r5)
                r0 = r2
            L_0x0062:
                android.widget.TextView r1 = r7.titleTextView
                r1.setText(r0)
                android.widget.TextView r0 = r7.subtitleTextView
                android.content.Context r1 = r7.context
                r2 = 2131886194(0x7f120072, float:1.940696E38)
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                zendesk.support.Category r6 = r8.getCategory()
                java.lang.String r6 = r6.getName()
                r4[r5] = r6
                zendesk.support.Section r5 = r8.getSection()
                java.lang.String r5 = r5.getName()
                r4[r3] = r5
                java.lang.String r1 = r1.getString(r2, r4)
                r0.setText(r1)
                android.view.View r0 = r7.itemView
                zendesk.support.guide.HelpSearchRecyclerViewAdapter$HelpSearchViewHolder$1 r1 = new zendesk.support.guide.HelpSearchRecyclerViewAdapter$HelpSearchViewHolder$1
                r1.<init>(r8)
                r0.setOnClickListener(r1)
                return
            L_0x0098:
                o.F.m1358()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.guide.HelpSearchRecyclerViewAdapter.HelpSearchViewHolder.bindTo(zendesk.support.SearchArticle):void");
        }
    }

    class NoResultsViewHolder extends RecyclerView.con {
        NoResultsViewHolder(View view) {
            super(view);
        }
    }

    class PaddingViewHolder extends RecyclerView.con {
        PaddingViewHolder(View view) {
            super(view);
        }
    }
}
