package sg.gov.tech.bluetrace.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1277;
import o.C3166;
import o.C3326cg;
import o.R;
import o.dA;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\u0013J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/VerifyCallerFragment;", "Lo/cg;", "ι", "Lo/cg;", "Ι", "Landroid/view/LayoutInflater;", "ɩ", "Landroid/view/LayoutInflater;", "ǃ", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "()V", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class VerifyCallerFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private HashMap f14664;

    /* renamed from: ɩ  reason: contains not printable characters */
    private LayoutInflater f14665;

    /* renamed from: ι  reason: contains not printable characters */
    private C3326cg f14666;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16227();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16227() {
        HashMap hashMap = this.f14664;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14665 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169302131558474, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.f164402131361916);
        TextView textView = (TextView) inflate.findViewById(R.id.f168102131362436);
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        if (viewGroup == null) {
            fM.m2256();
        }
        Context context = viewGroup.getContext();
        fM.m2252((Object) context, "");
        try {
            Object invoke = ((Class) C3166.m16013(4, 8, 0)).getMethod("ǃ", new Class[]{Context.class}).invoke(obj, new Object[]{context});
            fM.m2252((Object) textView, "");
            textView.setText((CharSequence) invoke);
            button.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: ı  reason: contains not printable characters */
                final /* synthetic */ VerifyCallerFragment f14667;

                {
                    this.f14667 = r1;
                }

                public final void onClick(View view) {
                    System.out.println("onclick is pressed");
                    C1277 parentFragment = this.f14667.getParentFragment();
                    if (parentFragment != null) {
                        ((UploadFragment) parentFragment).m16222();
                        return;
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
                }
            });
            return inflate;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14666;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }
}
