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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0016B\u0007¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0004\u0010\t"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/ForUseFragment;", "", "ǃ", "Ljava/lang/String;", "ɩ", "Lo/cg;", "ı", "Lo/cg;", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "()V", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class ForUseFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private C3326cg f14617;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f14618 = "UploadFragment";

    /* renamed from: ɩ  reason: contains not printable characters */
    private LayoutInflater f14619;

    /* renamed from: Ι  reason: contains not printable characters */
    private HashMap f14620;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16190();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16190() {
        HashMap hashMap = this.f14620;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14619 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169272131558471, viewGroup, false);
        ((Button) inflate.findViewById(R.id.f164402131361916)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ ForUseFragment f14621;

            {
                this.f14621 = r1;
            }

            public final void onClick(View view) {
                System.out.println("onclick is pressed");
                C1277 parentFragment = this.f14621.getParentFragment();
                if (parentFragment != null) {
                    ((ForUseByMOHFragment) parentFragment).m16189();
                    return;
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.ForUseByMOHFragment");
            }
        });
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14617;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }
}
