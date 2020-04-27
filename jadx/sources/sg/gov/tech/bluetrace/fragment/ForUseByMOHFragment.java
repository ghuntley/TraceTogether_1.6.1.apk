package sg.gov.tech.bluetrace.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1269;
import o.C1277;
import o.C1550;
import o.C1795;
import o.C3326cg;
import o.C3573lo;
import o.R;
import o.dA;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u0002\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u000fJ-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\t\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u0006\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/ForUseByMOHFragment;", "", "ι", "Ljava/lang/String;", "ı", "Lo/cg;", "ɩ", "Lo/cg;", "Landroid/widget/FrameLayout;", "ǃ", "Landroid/widget/FrameLayout;", "Ι", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "", "()V", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class ForUseByMOHFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private LayoutInflater f14611;

    /* renamed from: ǃ  reason: contains not printable characters */
    private FrameLayout f14612;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3326cg f14613;

    /* renamed from: ɹ  reason: contains not printable characters */
    private HashMap f14614;

    /* renamed from: Ι  reason: contains not printable characters */
    private FrameLayout f14615;

    /* renamed from: ι  reason: contains not printable characters */
    private String f14616 = "UploadFragment";

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16188();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16188() {
        HashMap hashMap = this.f14614;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14611 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169182131558461, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.f165342131362068);
        fM.m2252((Object) findViewById, "");
        this.f14612 = (FrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.f165772131362130);
        fM.m2252((Object) findViewById2, "");
        this.f14615 = (FrameLayout) findViewById2;
        C1550 childFragmentManager = getChildFragmentManager();
        fM.m2252((Object) childFragmentManager, "");
        C1795 r0 = childFragmentManager.m9099();
        fM.m2252((Object) r0, "");
        r0.m9958((int) R.id.f165342131362068, (C1277) new ForUseFragment());
        r0.m9959("VerifyCaller");
        r0.m9966();
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14613;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16189() {
        C1269 activity = getActivity();
        if (activity != null) {
            C3573lo loVar = (C3573lo) activity;
            String name = UploadFragment.class.getName();
            fM.m2252((Object) name, "");
            loVar.m3640(loVar.m3641(), new UploadFragment(), name, 0);
            return;
        }
        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
    }
}
