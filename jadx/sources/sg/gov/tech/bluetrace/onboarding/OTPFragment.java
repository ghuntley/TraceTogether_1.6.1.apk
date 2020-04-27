package sg.gov.tech.bluetrace.onboarding;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1269;
import o.C1514;
import o.C1955;
import o.C3166;
import o.C3570lk;
import o.C3575lq;
import o.R;
import o.dA;
import o.fL;
import o.fM;
import o.fU;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00012\u000205:\u0002\u0001\u000fB\u0007¢\u0006\u0004\b4\u0010\u001bJ\u000f\u0010\u000f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\u001cJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u001cJ\u000f\u0010\t\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\t\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u000f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020#H\u0016¢\u0006\u0004\b\u000f\u0010$J\u0019\u0010&\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J-\u0010,\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001aH\u0016¢\u0006\u0004\b.\u0010\u001bJ\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u00100J\u0017\u0010\u0012\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u00100J\r\u0010\u0001\u001a\u00020\u001a¢\u0006\u0004\b\u0001\u0010\u001bJ\u0017\u00102\u001a\u00020\u001a2\u0006\u0010 \u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\r\u0010\u0013\u001a\u00020\u001a¢\u0006\u0004\b\u0013\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\"¢\u0006\u0006\n\u0004\b\u0001\u0010\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OTPFragment;", "ǃ", "", "І", "J", "ɩ", "", "і", "Ljava/lang/String;", "Ι", "Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ı;", "Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ı;", "Landroid/widget/TextView;", "ɾ", "Landroid/widget/TextView;", "ı", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "ι", "Ӏ", "ȷ", "Ɩ", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "ɹ", "ӏ", "", "()V", "()Ljava/lang/String;", "", "()I", "Landroid/content/Context;", "p0", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroy", "onDetach", "(Ljava/lang/String;)V", "", "setUserVisibleHint", "(Z)V", "<init>", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;"}, k = 1, mv = {1, 1, 16})
public final class OTPFragment extends OnboardingFragmentInterface {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3223 f14668 = new C3223((fL) null);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private TextView f14669;

    /* renamed from: ǃ  reason: contains not printable characters and collision with other field name */
    public EditText f14670;

    /* renamed from: ȷ  reason: contains not printable characters */
    private String f14671;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3222 f14672;

    /* renamed from: ɪ  reason: contains not printable characters */
    private HashMap f14673;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public TextView f14674;

    /* renamed from: ɾ  reason: contains not printable characters */
    private TextView f14675;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f14676;

    /* renamed from: ι  reason: contains not printable characters */
    private String f14677;

    /* renamed from: І  reason: contains not printable characters */
    private final long f14678 = 60;
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public final String f14679 = "OTPFragment";

    /* renamed from: Ӏ  reason: contains not printable characters */
    private CountDownTimer f14680;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ı;", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.OTPFragment$ı  reason: contains not printable characters */
    public interface C3222 {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16240();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16231() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m16234() {
        return "Verify";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m16236() {
        return 40;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m16237(int i) {
        if (this.f14673 == null) {
            this.f14673 = new HashMap();
        }
        View view = (View) this.f14673.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14673.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m16240() {
        HashMap hashMap = this.f14673;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final /* synthetic */ String m16229(OTPFragment oTPFragment) {
        String str = oTPFragment.f14671;
        if (str == null) {
            fM.m2253("phoneNumber");
        }
        return str;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14677 = arguments.getString("param1");
            this.f14676 = arguments.getString("param2");
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m16241();
        } else {
            m16233();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16233() {
        CountDownTimer countDownTimer = this.f14680;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16232(View view) {
        fM.m2254(view, "");
        lA.f2728.m3368(this.f14679, "OnButtonClick 3B");
        String r3 = m16238();
        Context context = getContext();
        if (context != null) {
            ((C3570lk) context).m3592(r3);
            return;
        }
        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m16238() {
        EditText editText = this.f14670;
        if (editText == null) {
            fM.m2253("otpTextField");
        }
        return editText.getText().toString();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        final fU.C0174 r0 = new fU.C0174();
        r0.f2170 = layoutInflater.inflate(R.layout.f169212131558464, viewGroup, false);
        View findViewById = ((View) r0.f2170).findViewById(R.id.f167382131362329);
        fM.m2252((Object) findViewById, "");
        this.f14669 = (TextView) findViewById;
        TextView textView = this.f14669;
        if (textView == null) {
            fM.m2253("phoneNumberTextField");
        }
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("<b>");
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        Context context = getContext();
        if (context == null) {
            fM.m2256();
        }
        fM.m2252((Object) context, "");
        try {
            sb.append((String) ((Class) C3166.m16013(4, 8, 0)).getMethod("ι", new Class[]{Context.class}).invoke(obj, new Object[]{context}));
            sb.append("</b>");
            objArr[0] = sb.toString();
            textView.setText(C1955.m10678(getString(R.string.f171012131886254, objArr), 0));
            View findViewById2 = ((View) r0.f2170).findViewById(R.id.f168012131362421);
            fM.m2252((Object) findViewById2, "");
            this.f14675 = (TextView) findViewById2;
            ((TextView) ((View) r0.f2170).findViewById(R.id.f168282131362459)).setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: ɩ  reason: contains not printable characters */
                final /* synthetic */ OTPFragment f14681;

                {
                    this.f14681 = r1;
                }

                public final void onClick(View view) {
                    fM.m2254(view, "");
                    lA.f2728.m3368(this.f14681.f14679, "Wrong number pressed");
                    C1269 activity = this.f14681.getActivity();
                    if (activity != null) {
                        ((C3570lk) activity).m3600();
                        return;
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
                }
            });
            this.f14674 = (TextView) ((View) r0.f2170).findViewById(R.id.f167822131362397);
            View findViewById3 = ((View) r0.f2170).findViewById(R.id.f167422131362336);
            fM.m2252((Object) findViewById3, "");
            this.f14670 = (EditText) findViewById3;
            ((TextView) ((View) r0.f2170).findViewById(R.id.f167122131362293)).setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: ǃ  reason: contains not printable characters */
                final /* synthetic */ OTPFragment f14684;

                {
                    this.f14684 = r1;
                }

                public final void onClick(View view) {
                    fM.m2254(view, "");
                    lA.f2728.m3368(this.f14684.f14679, "resend pressed");
                    C1269 activity = this.f14684.getActivity();
                    if (activity != null) {
                        ((C3570lk) activity).m3599(OTPFragment.m16229(this.f14684));
                        this.f14684.m16233();
                        this.f14684.m16241();
                        return;
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
                }
            });
            EditText editText = this.f14670;
            if (editText == null) {
                fM.m2253("otpTextField");
            }
            editText.addTextChangedListener(new C3224(this, r0));
            EditText editText2 = this.f14670;
            if (editText2 == null) {
                fM.m2253("otpTextField");
            }
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                /* renamed from: ı  reason: contains not printable characters */
                final /* synthetic */ OTPFragment f14683;

                {
                    this.f14683 = r1;
                }

                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 2) {
                        return false;
                    }
                    Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                    View view = (View) r0.f2170;
                    fM.m2252((Object) view, "");
                    Context context = view.getContext();
                    fM.m2252((Object) context, "");
                    View view2 = (View) r0.f2170;
                    fM.m2252((Object) view2, "");
                    try {
                        Object[] objArr = new Object[2];
                        objArr[1] = view2;
                        objArr[0] = context;
                        ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, View.class}).invoke(obj, objArr);
                        String r9 = this.f14683.m16238();
                        Context context2 = this.f14683.getContext();
                        if (context2 != null) {
                            ((C3570lk) context2).m3592(r9);
                            return true;
                        }
                        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.OnboardingActivity");
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            });
            return (View) r0.f2170;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ɩ;", "Landroid/text/Editable;", "p0", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "p1", "p2", "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/TextWatcher;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.OTPFragment$ɩ  reason: contains not printable characters */
    public static final class C3224 implements TextWatcher {

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ fU.C0174 f14686;

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ OTPFragment f14687;

        public final void afterTextChanged(Editable editable) {
            fM.m2254(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
        }

        C3224(OTPFragment oTPFragment, fU.C0174 r2) {
            this.f14687 = oTPFragment;
            this.f14686 = r2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
            this.f14687.m16235("");
            if (charSequence.length() == 6) {
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                View view = (View) this.f14686.f2170;
                fM.m2252((Object) view, "");
                Context context = view.getContext();
                fM.m2252((Object) context, "");
                View view2 = (View) this.f14686.f2170;
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

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16239(String str) {
        fM.m2254(str, "");
        lA.C0215 r0 = lA.f2728;
        String str2 = this.f14679;
        r0.m3368(str2, "onUpdatePhoneNumber " + str);
        TextView textView = this.f14669;
        if (textView == null) {
            fM.m2253("phoneNumberTextField");
        }
        textView.setText(C1955.m10678(getString(R.string.f171012131886254, "<b>" + str + "</b>"), 0));
        this.f14671 = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\bJ\u000f\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OTPFragment$if;", "", "onFinish", "()V", "", "p0", "onTick", "(J)V", "Landroid/os/CountDownTimer;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.OTPFragment$if  reason: invalid class name */
    public static final class Cif extends CountDownTimer {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ OTPFragment f14685;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cif(OTPFragment oTPFragment, long j, long j2) {
            super(j, j2);
            this.f14685 = oTPFragment;
        }

        public final void onTick(long j) {
            String str;
            double d = (double) j;
            int floor = (int) Math.floor((1.0d * d) / ((double) 60000));
            int floor2 = (int) Math.floor((d / 1000.0d) % ((double) 60));
            if (floor2 < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append('0');
                sb.append(floor2);
                str = sb.toString();
            } else {
                str = String.valueOf(floor2);
            }
            TextView r6 = this.f14685.f14674;
            if (r6 != null) {
                r6.setText(floor + ':' + str);
            }
        }

        public final void onFinish() {
            TextView r0 = this.f14685.f14674;
            if (r0 != null) {
                r0.setText("0:00");
            }
            C1514 r02 = (C1514) this.f14685.m16237(C3575lq.C0226.f2962);
            fM.m2252((Object) r02, "");
            r02.setEnabled(true);
            ((C1514) this.f14685.m16237(C3575lq.C0226.f2962)).setTextColor(Color.parseColor("#003DB5"));
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m16241() {
        this.f14680 = new Cif(this, ((long) 1000) * this.f14678, 1000);
        CountDownTimer countDownTimer = this.f14680;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        C1514 r0 = (C1514) m16237(C3575lq.C0226.f2962);
        fM.m2252((Object) r0, "");
        r0.setEnabled(false);
        ((C1514) m16237(C3575lq.C0226.f2962)).setTextColor(Color.parseColor("#DDDDDD"));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16235(String str) {
        fM.m2254(str, "");
        TextView textView = this.f14675;
        if (textView == null) {
            fM.m2253("mTvErrorMsg");
        }
        textView.setText(str);
    }

    public final void onAttach(Context context) {
        fM.m2254(context, "");
        super.onAttach(context);
        if (context instanceof C3222) {
            this.f14672 = (C3222) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public final void onDetach() {
        super.onDetach();
        this.f14672 = null;
    }

    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f14680;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ǃ;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.onboarding.OTPFragment$ǃ  reason: contains not printable characters */
    public static final class C3223 {
        private C3223() {
        }

        public /* synthetic */ C3223(fL fLVar) {
            this();
        }
    }
}
