package sg.gov.tech.bluetrace.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u00002\u00020\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u0002\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u000fJ\r\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u000fJ\r\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u000fJ\r\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\t\u001a\u00020\u000b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0004\u0010\n"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/UploadFragment;", "Landroid/widget/TextView;", "Ι", "Landroid/widget/TextView;", "ι", "Lo/cg;", "ǃ", "Lo/cg;", "Landroid/widget/FrameLayout;", "ı", "Landroid/widget/FrameLayout;", "Landroid/view/LayoutInflater;", "ɩ", "Landroid/view/LayoutInflater;", "", "()V", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "Ӏ", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class UploadFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private FrameLayout f14658;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3326cg f14659;

    /* renamed from: ɩ  reason: contains not printable characters */
    private LayoutInflater f14660;

    /* renamed from: Ι  reason: contains not printable characters */
    private TextView f14661;

    /* renamed from: ι  reason: contains not printable characters */
    private FrameLayout f14662;

    /* renamed from: І  reason: contains not printable characters */
    private HashMap f14663;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16221();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m16221() {
        HashMap hashMap = this.f14663;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14660 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169282131558472, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.f165342131362068);
        fM.m2252((Object) findViewById, "");
        this.f14658 = (FrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.f165772131362130);
        fM.m2252((Object) findViewById2, "");
        this.f14662 = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.f165292131362063);
        fM.m2252((Object) findViewById3, "");
        this.f14661 = (TextView) findViewById3;
        String substring = "B82AB3FC-1595-4F6A-80F0-FE094CC218F9".substring(32);
        fM.m2252((Object) substring, "");
        TextView textView = this.f14661;
        if (textView == null) {
            fM.m2253("buildNoTextView");
        }
        textView.setText("670280e2-" + substring);
        C1550 childFragmentManager = getChildFragmentManager();
        fM.m2252((Object) childFragmentManager, "");
        C1795 r0 = childFragmentManager.m9099();
        fM.m2252((Object) r0, "");
        r0.m9958((int) R.id.f165342131362068, (C1277) new VerifyCallerFragment());
        r0.m9959("VerifyCaller");
        r0.m9966();
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14659;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16225() {
        FrameLayout frameLayout = this.f14662;
        if (frameLayout == null) {
            fM.m2253("progressBarLayout");
        }
        frameLayout.setVisibility(0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16220() {
        FrameLayout frameLayout = this.f14662;
        if (frameLayout == null) {
            fM.m2253("progressBarLayout");
        }
        frameLayout.setVisibility(4);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16222() {
        C1550 childFragmentManager = getChildFragmentManager();
        fM.m2252((Object) childFragmentManager, "");
        C1795 r0 = childFragmentManager.m9099();
        fM.m2252((Object) r0, "");
        r0.m9958((int) R.id.f165342131362068, (C1277) new EnterPinFragment());
        r0.m9959("C");
        r0.m9966();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16224() {
        C1269 activity = getActivity();
        if (activity != null) {
            ((C3573lo) activity).m3639();
            return;
        }
        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16223() {
        C1550 childFragmentManager = getChildFragmentManager();
        fM.m2252((Object) childFragmentManager, "");
        C1795 r0 = childFragmentManager.m9099();
        fM.m2252((Object) r0, "");
        r0.m9958((int) R.id.f165342131362068, (C1277) new UploadCompleteFragment());
        r0.m9959("UploadComplete");
        r0.m9966();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m16226() {
        C1550 childFragmentManager = getChildFragmentManager();
        fM.m2252((Object) childFragmentManager, "");
        childFragmentManager.m9114();
    }
}
