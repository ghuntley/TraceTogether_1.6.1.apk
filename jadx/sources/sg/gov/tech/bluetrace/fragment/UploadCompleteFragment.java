package sg.gov.tech.bluetrace.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1277;
import o.C3326cg;
import o.R;
import o.dA;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\u0012J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/UploadCompleteFragment;", "Lo/cg;", "ι", "Lo/cg;", "Landroid/view/LayoutInflater;", "ı", "Landroid/view/LayoutInflater;", "Ι", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "()V", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class UploadCompleteFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private LayoutInflater f14654;

    /* renamed from: ǃ  reason: contains not printable characters */
    private HashMap f14655;

    /* renamed from: ι  reason: contains not printable characters */
    private C3326cg f14656;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16219();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16219() {
        HashMap hashMap = this.f14655;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14654 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169292131558473, viewGroup, false);
        ((Button) inflate.findViewById(R.id.f164402131361916)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: Ι  reason: contains not printable characters */
            final /* synthetic */ UploadCompleteFragment f14657;

            {
                this.f14657 = r1;
            }

            public final void onClick(View view) {
                System.out.println("onclick is pressed");
                C1277 parentFragment = this.f14657.getParentFragment();
                if (parentFragment != null) {
                    ((UploadFragment) parentFragment).m16224();
                    return;
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
            }
        });
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14656;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }
}
