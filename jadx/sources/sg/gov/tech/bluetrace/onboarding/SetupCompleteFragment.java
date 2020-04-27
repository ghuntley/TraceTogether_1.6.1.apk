package sg.gov.tech.bluetrace.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.Metadata;
import o.C3166;
import o.C3570lk;
import o.C3573lo;
import o.R;
import o.fL;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020':\u0002\u0001\u0003B\u0007¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0001\u0010\u0012J\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u000f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0001\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0012J\u0017\u0010\n\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010%J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010%R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0001\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0004"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment;", "ı", "", "ǃ", "Ljava/lang/String;", "ι", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "І", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment$ǃ;", "ɩ", "Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment$ǃ;", "Landroid/content/Context;", "Ɩ", "Landroid/content/Context;", "Ι", "і", "", "()V", "()Ljava/lang/String;", "", "()I", "p0", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "(Ljava/lang/String;)V", "<init>", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;"}, k = 1, mv = {1, 1, 16})
public final class SetupCompleteFragment extends OnboardingFragmentInterface {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3227 f14706 = new C3227((fL) null);

    /* renamed from: ı  reason: contains not printable characters and collision with other field name */
    private String f14707;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Context f14708;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f14709 = "SetupCompleteFragment";

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3228 f14710;

    /* renamed from: ι  reason: contains not printable characters */
    private String f14711;

    /* renamed from: І  reason: contains not printable characters */
    private FirebaseAnalytics f14712;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private HashMap f14713;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment$ǃ;", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.SetupCompleteFragment$ǃ  reason: contains not printable characters */
    public interface C3228 {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16277();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16270() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m16272() {
        return "Continue";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16273(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m16274() {
        return 100;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m16275(int i) {
        if (this.f14713 == null) {
            this.f14713 = new HashMap();
        }
        View view = (View) this.f14713.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14713.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16276(String str) {
        fM.m2254(str, "");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m16277() {
        HashMap hashMap = this.f14713;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14711 = arguments.getString("param1");
            this.f14707 = arguments.getString("param2");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16271(View view) {
        Throwable cause;
        fM.m2254(view, "");
        lA.f2728.m3368(this.f14709, "OnButtonClick 2");
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        Context context = view.getContext();
        fM.m2252((Object) context, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = 0;
            objArr[0] = context;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke(obj, objArr);
            Object obj2 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
            Context context2 = view.getContext();
            fM.m2252((Object) context2, "");
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = true;
                objArr2[0] = context2;
                ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Boolean.TYPE}).invoke(obj2, objArr2);
                Bundle bundle = new Bundle();
                bundle.putString("item_id", "P1234");
                bundle.putString("item_name", "Onboard Completed for Android Device");
                FirebaseAnalytics firebaseAnalytics = this.f14712;
                if (firebaseAnalytics == null) {
                    fM.m2253("firebaseAnalytics");
                }
                firebaseAnalytics.m1082("sign_up", bundle);
                Intent intent = new Intent(getContext(), C3573lo.class);
                intent.setFlags(268468224);
                Context context3 = getContext();
                if (context3 != null) {
                    context3.startActivity(intent);
                }
                C3570lk lkVar = (C3570lk) getContext();
                if (lkVar != null) {
                    lkVar.finish();
                }
            } catch (Throwable th) {
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } finally {
            cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        Context context = this.f14708;
        if (context == null) {
            fM.m2253("mainContext");
        }
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        fM.m2252((Object) instance, "");
        this.f14712 = instance;
        return layoutInflater.inflate(R.layout.f169242131558467, viewGroup, false);
    }

    public final void onAttach(Context context) {
        fM.m2254(context, "");
        super.onAttach(context);
        this.f14708 = context;
        if (context instanceof C3228) {
            this.f14710 = (C3228) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public final void onDetach() {
        super.onDetach();
        this.f14710 = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment$ı;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.SetupCompleteFragment$ı  reason: contains not printable characters */
    public static final class C3227 {
        private C3227() {
        }

        public /* synthetic */ C3227(fL fLVar) {
            this();
        }
    }
}
