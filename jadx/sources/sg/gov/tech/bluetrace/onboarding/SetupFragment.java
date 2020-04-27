package sg.gov.tech.bluetrace.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import o.C3570lk;
import o.R;
import o.fL;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\":\u0002\u0001\tB\u0007¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\b\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010 J\u0017\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010 R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupFragment;", "if", "", "ι", "Ljava/lang/String;", "Lsg/gov/tech/bluetrace/onboarding/SetupFragment$ɩ;", "ǃ", "Lsg/gov/tech/bluetrace/onboarding/SetupFragment$ɩ;", "ı", "ɩ", "Ι", "", "()V", "()Ljava/lang/String;", "", "()I", "Landroid/content/Context;", "p0", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "(Ljava/lang/String;)V", "<init>", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;"}, k = 1, mv = {1, 1, 16})
public final class SetupFragment extends OnboardingFragmentInterface {

    /* renamed from: if  reason: not valid java name */
    public static final Cif f14714if = new Cif((fL) null);

    /* renamed from: ı  reason: contains not printable characters */
    private String f14715;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3229 f14716;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f14717;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f14718 = "SetupFragment";

    /* renamed from: Ӏ  reason: contains not printable characters */
    private HashMap f14719;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupFragment$ɩ;", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.SetupFragment$ɩ  reason: contains not printable characters */
    public interface C3229 {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16285();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16278() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m16280() {
        return "Proceed";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16281(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m16282() {
        return 80;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m16283(int i) {
        if (this.f14719 == null) {
            this.f14719 = new HashMap();
        }
        View view = (View) this.f14719.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14719.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16284(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m16285() {
        HashMap hashMap = this.f14719;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14717 = arguments.getString("param1");
            this.f14715 = arguments.getString("param2");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16279(View view) {
        fM.m2254(view, "");
        lA.f2728.m3368(this.f14718, "OnButtonClick 2");
        C3570lk lkVar = (C3570lk) getContext();
        if (lkVar != null) {
            lkVar.m3593();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        return layoutInflater.inflate(R.layout.f169232131558466, viewGroup, false);
    }

    public final void onAttach(Context context) {
        fM.m2254(context, "");
        super.onAttach(context);
        if (context instanceof C3229) {
            this.f14716 = (C3229) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public final void onDetach() {
        super.onDetach();
        this.f14716 = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupFragment$if;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.SetupFragment$if  reason: invalid class name */
    public static final class Cif {
        private Cif() {
        }

        public /* synthetic */ Cif(fL fLVar) {
            this();
        }
    }
}
