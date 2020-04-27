package sg.gov.tech.bluetrace.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1277;
import o.R;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/HelpFragment;", "Landroid/view/LayoutInflater;", "ι", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "<init>", "()V", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class HelpFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private HashMap f14622;

    /* renamed from: ι  reason: contains not printable characters */
    private LayoutInflater f14623;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16191();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16191() {
        HashMap hashMap = this.f14622;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14623 = layoutInflater;
        return layoutInflater.inflate(R.layout.f169192131558462, viewGroup, false);
    }
}
