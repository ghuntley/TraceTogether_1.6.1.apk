package sg.gov.tech.bluetrace.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import o.C3570lk;
import o.C3580lw;
import o.R;
import o.dA;
import o.fL;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020&:\u0002\u0001\fB\u0007¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0003\u0010\u0011J\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u000b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0003\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010$J\u0017\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010$R\u0016\u0010\u0001\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/TOUFragment;", "ǃ", "", "ı", "Ljava/lang/String;", "Lsg/gov/tech/bluetrace/onboarding/TOUFragment$ɩ;", "ι", "Lsg/gov/tech/bluetrace/onboarding/TOUFragment$ɩ;", "Landroid/content/Context;", "Ӏ", "Landroid/content/Context;", "Ι", "ɩ", "Landroid/widget/TextView;", "Ɩ", "Landroid/widget/TextView;", "", "()V", "()Ljava/lang/String;", "", "()I", "p0", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "(Ljava/lang/String;)V", "<init>", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;"}, k = 1, mv = {1, 1, 16})
public final class TOUFragment extends OnboardingFragmentInterface {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3230 f14720 = new C3230((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final String f14721 = "TOUFragment";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private TextView f14722;

    /* renamed from: ǃ  reason: contains not printable characters and collision with other field name */
    private String f14723;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f14724;

    /* renamed from: ι  reason: contains not printable characters */
    private C3231 f14725;

    /* renamed from: і  reason: contains not printable characters */
    private HashMap f14726;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Context f14727;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/TOUFragment$ɩ;", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.TOUFragment$ɩ  reason: contains not printable characters */
    public interface C3231 {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16295();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16288() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m16290() {
        return "I agree";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16291(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m16292() {
        return 60;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m16293(int i) {
        if (this.f14726 == null) {
            this.f14726 = new HashMap();
        }
        View view = (View) this.f14726.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14726.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16294(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m16295() {
        HashMap hashMap = this.f14726;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final /* synthetic */ Context m16287(TOUFragment tOUFragment) {
        Context context = tOUFragment.f14727;
        if (context == null) {
            fM.m2253("mainContext");
        }
        return context;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14724 = arguments.getString("param1");
            this.f14723 = arguments.getString("param2");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16289(View view) {
        fM.m2254(view, "");
        lA.f2728.m3368(this.f14721, "OnButtonClick 4");
        Context context = getContext();
        if (context != null) {
            ((C3570lk) context).m3591();
            return;
        }
        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        View inflate = layoutInflater.inflate(R.layout.f169252131558468, viewGroup, false);
        fM.m2252((Object) inflate, "");
        View findViewById = inflate.findViewById(R.id.f166342131362213);
        fM.m2252((Object) findViewById, "");
        this.f14722 = (TextView) findViewById;
        TextView textView = this.f14722;
        if (textView == null) {
            fM.m2253("privacyTextView");
        }
        textView.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ TOUFragment f14728;

            {
                this.f14728 = r1;
            }

            public final void onClick(View view) {
                lA.f2728.m3368(this.f14728.f14721, "clicked the privacy safeguards");
                this.f14728.startActivity(new Intent(TOUFragment.m16287(this.f14728), C3580lw.class));
            }
        });
        return inflate;
    }

    public final void onAttach(Context context) {
        fM.m2254(context, "");
        super.onAttach(context);
        this.f14727 = context;
        if (context instanceof C3231) {
            this.f14725 = (C3231) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public final void onDetach() {
        super.onDetach();
        this.f14725 = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/TOUFragment$ǃ;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.TOUFragment$ǃ  reason: contains not printable characters */
    public static final class C3230 {
        private C3230() {
        }

        public /* synthetic */ C3230(fL fLVar) {
            this();
        }
    }
}
