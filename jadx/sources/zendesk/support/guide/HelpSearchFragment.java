package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import o.C1277;
import o.R;
import o.mZ;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

public class HelpSearchFragment extends C1277 {
    private HelpSearchRecyclerViewAdapter adapter;
    private HelpCenterProvider helpCenterProvider;
    private String query = "";
    private RecyclerView recyclerView;
    private List<SearchArticle> searchArticles = Collections.emptyList();

    @SuppressLint({"RestrictedApi"})
    public static HelpSearchFragment newInstance(HelpCenterUiConfig helpCenterUiConfig, HelpCenterProvider helpCenterProvider2) {
        Bundle bundle = new Bundle();
        mZ.m3798(bundle, helpCenterUiConfig);
        HelpSearchFragment helpSearchFragment = new HelpSearchFragment();
        helpSearchFragment.setArguments(bundle);
        helpSearchFragment.helpCenterProvider = helpCenterProvider2;
        return helpSearchFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f169712131558550, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.f165382131362077);
        setupRecyclerView();
        return inflate;
    }

    public void updateResults(List<SearchArticle> list, String str) {
        RecyclerView recyclerView2;
        this.searchArticles = list;
        this.query = str;
        if (this.adapter != null && (recyclerView2 = this.recyclerView) != null) {
            recyclerView2.setVisibility(0);
            this.adapter.update(list, str);
            this.recyclerView.announceForAccessibility(getString(R.string.f171692131886364));
        }
    }

    public void clearResults() {
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = this.adapter;
        if (helpSearchRecyclerViewAdapter != null) {
            helpSearchRecyclerViewAdapter.clearResults();
        }
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        this.adapter = new HelpSearchRecyclerViewAdapter(this.searchArticles, this.query, (HelpCenterUiConfig) mZ.m3799(getArguments(), HelpCenterUiConfig.class), this.helpCenterProvider);
        this.recyclerView.setAdapter(this.adapter);
    }
}
