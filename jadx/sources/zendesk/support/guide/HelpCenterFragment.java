package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.C0651;
import o.C1277;
import o.C3350db;
import o.R;
import o.mZ;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.guide.HelpCenterMvp;

public class HelpCenterFragment extends C1277 {
    private HelpRecyclerViewAdapter adapter;
    @C3350db
    HelpCenterProvider helpCenterProvider;
    @C3350db
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp.Presenter presenter;
    private RecyclerView recyclerView;

    public void setPresenter(HelpCenterMvp.Presenter presenter2) {
        this.presenter = presenter2;
        HelpRecyclerViewAdapter helpRecyclerViewAdapter = this.adapter;
        if (helpRecyclerViewAdapter != null) {
            helpRecyclerViewAdapter.setContentUpdateListener(presenter2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (SdkDependencyProvider.INSTANCE.isInitialized()) {
            SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().inject(this);
            this.adapter = new HelpRecyclerViewAdapter((HelpCenterUiConfig) mZ.m3799(getArguments(), HelpCenterUiConfig.class), this.helpCenterProvider, this.networkInfoProvider);
            HelpCenterMvp.Presenter presenter2 = this.presenter;
            if (presenter2 != null) {
                this.adapter.setContentUpdateListener(presenter2);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f169712131558550, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.f165382131362077);
        setupRecyclerView();
        return inflate;
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        this.recyclerView.addItemDecoration(new SeparatorDecoration(C0651.m5458(getContext(), R.drawable.f163802131231218)));
        this.recyclerView.setAdapter(this.adapter);
    }

    @SuppressLint({"RestrictedApi"})
    public static HelpCenterFragment newInstance(HelpCenterUiConfig helpCenterUiConfig) {
        Bundle bundle = new Bundle();
        mZ.m3798(bundle, helpCenterUiConfig);
        HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
        helpCenterFragment.setArguments(bundle);
        return helpCenterFragment;
    }
}
