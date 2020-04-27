package sg.gov.tech.bluetrace.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C2639;
import o.C3166;
import o.C3570lk;
import o.C3577lt;
import o.R;
import o.dA;
import o.fL;
import o.fM;
import o.fU;
import o.gK;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\u0018\u0000 \u00012\u000205:\u0002\u00013B\u0007¢\u0006\u0004\b4\u0010\u0019J\u000f\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0001\u0010\u0019J\u000f\u0010\u0010\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u001aJ\u000f\u0010\u000f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u000f\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0001\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0001\u0010$J\u0019\u0010&\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J+\u0010,\u001a\u00020\f2\u0006\u0010!\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010/J\u0017\u0010\u0010\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010/J!\u00100\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b0\u00101J\u000f\u0010\u0011\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0011\u0010\u0019J\u0017\u0010\u0001\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0001\u00102R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0001\u001a\u00020\u00068\u0006@\u0006X\"¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\"¢\u0006\u0006\n\u0004\b\u0001\u0010\u0013R\u001c\u0010\u0003\u001a\u00020\u00158\u0007@\u0006X&¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment;", "ı", "", "Ɩ", "Ljava/lang/String;", "ɩ", "Lo/ѥı;", "Lo/ѥı;", "Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$If;", "І", "Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$If;", "ǃ", "Landroid/view/View;", "ɹ", "Landroid/view/View;", "Ι", "ι", "Ӏ", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "і", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "", "()V", "()Ljava/lang/String;", "", "()I", "", "ɪ", "()Z", "Landroid/content/Context;", "p0", "onAttach", "(Landroid/content/Context;)V", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDetach", "(Ljava/lang/String;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "(Ljava/lang/String;)Z", "If", "<init>", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;"}, k = 1, mv = {1, 1, 16})
public final class RegisterNumberFragment extends OnboardingFragmentInterface {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3225 f14692 = new C3225((fL) null);

    /* renamed from: ı  reason: contains not printable characters and collision with other field name */
    public EditText f14693;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final String f14694 = "RegisterNumberFragment";

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2639 f14695;

    /* renamed from: ɹ  reason: contains not printable characters */
    private View f14696;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f14697;

    /* renamed from: ι  reason: contains not printable characters */
    public TextView f14698;

    /* renamed from: І  reason: contains not printable characters */
    private If f14699;

    /* renamed from: і  reason: contains not printable characters */
    private HashMap f14700;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f14701;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$If;", ""}, k = 1, mv = {1, 1, 16})
    public interface If {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16269();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m16264() {
        return "Get OTP";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m16266() {
        return 20;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m16267(int i) {
        if (this.f14700 == null) {
            this.f14700 = new HashMap();
        }
        View view = (View) this.f14700.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14700.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m16269() {
        HashMap hashMap = this.f14700;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final TextView m16263() {
        TextView textView = this.f14698;
        if (textView == null) {
            fM.m2253("phoneNumberError");
        }
        return textView;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14697 = arguments.getString("param1");
            this.f14701 = arguments.getString("param2");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16261() {
        lA.f2728.m3368(this.f14694, "becomes visible");
        m16246();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16262(View view) {
        fM.m2254(view, "");
        lA.f2728.m3368(this.f14694, "OnButtonClick");
        m16258();
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m16258() {
        m16253();
        m16260();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final void m16260() {
        if (this.f14696 != null) {
            TextView textView = this.f14698;
            if (textView == null) {
                fM.m2253("phoneNumberError");
            }
            textView.setVisibility(4);
            EditText editText = this.f14693;
            if (editText == null) {
                fM.m2253("phoneNumberEditText");
            }
            String obj = editText.getText().toString();
            if (obj != null) {
                String obj2 = gK.m2377(obj).toString();
                if (m16256() && obj2.length() != 8) {
                    TextView textView2 = this.f14698;
                    if (textView2 == null) {
                        fM.m2253("phoneNumberError");
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = this.f14698;
                    if (textView3 == null) {
                        fM.m2253("phoneNumberError");
                    }
                    textView3.setText(R.string.f170872131886202);
                    m16246();
                } else if (!m16256() || m16255(obj2)) {
                    StringBuilder sb = new StringBuilder();
                    C2639 r3 = this.f14695;
                    if (r3 == null) {
                        fM.m2253("countryCodePicker");
                    }
                    sb.append(r3.m13996());
                    sb.append(obj2);
                    String sb2 = sb.toString();
                    lA.C0215 r1 = lA.f2728;
                    String str = this.f14694;
                    r1.m3368(str, "The value retrieved: " + sb2);
                    Context context = getContext();
                    if (context != null) {
                        C3570lk lkVar = (C3570lk) context;
                        Object obj3 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                        Context r6 = C3577lt.f2990.m3684();
                        try {
                            Object[] objArr = new Object[2];
                            objArr[1] = sb2;
                            objArr[0] = r6;
                            ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, String.class}).invoke(obj3, objArr);
                            lkVar.m3597(sb2);
                            lkVar.m3594(sb2);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
                    }
                } else {
                    TextView textView4 = this.f14698;
                    if (textView4 == null) {
                        fM.m2253("phoneNumberError");
                    }
                    textView4.setVisibility(0);
                    TextView textView5 = this.f14698;
                    if (textView5 == null) {
                        fM.m2253("phoneNumberError");
                    }
                    textView5.setText(R.string.f170902131886205);
                    m16246();
                }
            } else {
                throw new dA("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean m16255(String str) {
        return Pattern.matches("(^8[0-9]{7}$)|(^9[0-9]{7}$)|(^00254238$)|(^00985768$)", str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        fM.m2254(view, "");
        super.onViewCreated(view, bundle);
        lA.f2728.m3369(this.f14694, "View created");
        this.f14696 = view;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        lA.f2728.m3369(this.f14694, "Making view");
        final fU.C0174 r6 = new fU.C0174();
        r6.f2170 = layoutInflater.inflate(R.layout.f169222131558465, viewGroup, false);
        View findViewById = ((View) r6.f2170).findViewById(R.id.f164972131362001);
        fM.m2252((Object) findViewById, "");
        this.f14695 = (C2639) findViewById;
        View findViewById2 = ((View) r6.f2170).findViewById(R.id.f166302131362208);
        fM.m2252((Object) findViewById2, "");
        this.f14693 = (EditText) findViewById2;
        View findViewById3 = ((View) r6.f2170).findViewById(R.id.f166312131362209);
        fM.m2252((Object) findViewById3, "");
        this.f14698 = (TextView) findViewById3;
        EditText editText = this.f14693;
        if (editText == null) {
            fM.m2253("phoneNumberEditText");
        }
        editText.addTextChangedListener(new C3226(this, r6));
        EditText editText2 = this.f14693;
        if (editText2 == null) {
            fM.m2253("phoneNumberEditText");
        }
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            /* renamed from: ι  reason: contains not printable characters */
            final /* synthetic */ RegisterNumberFragment f14703;

            {
                this.f14703 = r1;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 2) {
                    return false;
                }
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                View view = (View) r6.f2170;
                fM.m2252((Object) view, "");
                Context context = view.getContext();
                fM.m2252((Object) context, "");
                View view2 = (View) r6.f2170;
                fM.m2252((Object) view2, "");
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = view2;
                    objArr[0] = context;
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, View.class}).invoke(obj, objArr);
                    this.f14703.m16258();
                    return true;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        });
        View view = (View) r6.f2170;
        fM.m2252((Object) view, "");
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$ɩ;", "Landroid/text/Editable;", "p0", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "p1", "p2", "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/TextWatcher;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.RegisterNumberFragment$ɩ  reason: contains not printable characters */
    public static final class C3226 implements TextWatcher {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ fU.C0174 f14704;

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ RegisterNumberFragment f14705;

        public final void afterTextChanged(Editable editable) {
            fM.m2254(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
        }

        C3226(RegisterNumberFragment registerNumberFragment, fU.C0174 r2) {
            this.f14705 = registerNumberFragment;
            this.f14704 = r2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
            this.f14705.m16263().setVisibility(8);
            if (this.f14705.m16256() && charSequence.length() == 8) {
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                View view = (View) this.f14704.f2170;
                fM.m2252((Object) view, "");
                Context context = view.getContext();
                fM.m2252((Object) context, "");
                View view2 = (View) this.f14704.f2170;
                fM.m2252((Object) view2, "");
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = view2;
                    objArr[0] = context;
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, View.class}).invoke(obj, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public final boolean m16256() {
        C2639 r0 = this.f14695;
        if (r0 == null) {
            fM.m2253("countryCodePicker");
        }
        return fM.m2257(r0.m13997(), "SG");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16268(String str) {
        fM.m2254(str, "");
        lA.C0215 r0 = lA.f2728;
        String str2 = this.f14694;
        r0.m3368(str2, "onUpdatePhoneNumber " + str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16265(String str) {
        fM.m2254(str, "");
        if (this.f14698 == null) {
            fM.m2253("phoneNumberError");
        }
        TextView textView = this.f14698;
        if (textView == null) {
            fM.m2253("phoneNumberError");
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14698;
        if (textView2 == null) {
            fM.m2253("phoneNumberError");
        }
        textView2.setText(str);
        lA.C0215 r0 = lA.f2728;
        String str2 = this.f14694;
        r0.m3375(str2, "error: " + str.toString());
    }

    public final void onAttach(Context context) {
        fM.m2254(context, "");
        super.onAttach(context);
        if (context instanceof If) {
            this.f14699 = (If) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public final void onDetach() {
        super.onDetach();
        this.f14699 = null;
        this.f14696 = null;
        lA.f2728.m3369(this.f14694, "Detached??");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$ı;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.RegisterNumberFragment$ı  reason: contains not printable characters */
    public static final class C3225 {
        private C3225() {
        }

        public /* synthetic */ C3225(fL fLVar) {
            this();
        }
    }
}
