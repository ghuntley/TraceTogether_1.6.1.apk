package sg.gov.tech.bluetrace.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import java.util.HashMap;
import kotlin.Metadata;
import o.C1277;
import o.R;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b&\u0018\u00002\u00020\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\nH&¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0006\u0010\u0012J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0002\u0010\u0013J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0004\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;", "Landroid/widget/Button;", "ι", "Landroid/widget/Button;", "Ι", "", "ı", "()V", "І", "Ɩ", "", "ɹ", "()I", "", "ɩ", "()Ljava/lang/String;", "Landroid/view/View;", "p0", "(Landroid/view/View;)V", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "p1", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "ǃ", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public abstract class OnboardingFragmentInterface extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private HashMap f14688;

    /* renamed from: ι  reason: contains not printable characters */
    private Button f14689;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16254();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m16244();

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m16245(View view);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract String m16247();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m16248(String str);

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final int m16249() {
        return R.id.f164832131361972;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m16250();

    /* renamed from: ι  reason: contains not printable characters */
    public View m16251(int i) {
        if (this.f14688 == null) {
            this.f14688 = new HashMap();
        }
        View view = (View) this.f14688.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14688.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m16252(String str);

    /* renamed from: і  reason: contains not printable characters */
    public void m16254() {
        HashMap hashMap = this.f14688;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m16242(View view) {
        final Button button = (Button) view.findViewById(m16249());
        if (button != null) {
            this.f14689 = button;
            button.setText(m16247());
            button.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ OnboardingFragmentInterface f14691;

                {
                    this.f14691 = r1;
                }

                public final void onClick(View view) {
                    OnboardingFragmentInterface onboardingFragmentInterface = this.f14691;
                    fM.m2252((Object) view, "");
                    onboardingFragmentInterface.m16245(view);
                }
            });
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m16246() {
        Button button = this.f14689;
        if (button != null) {
            button.setEnabled(true);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m16253() {
        Button button = this.f14689;
        if (button != null) {
            button.setEnabled(false);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m16243(View view) {
        View findViewById = view.findViewById(R.id.f166272131362203);
        fM.m2252((Object) findViewById, "");
        ((ProgressBar) findViewById).setProgress(m16250());
    }

    public void onViewCreated(View view, Bundle bundle) {
        fM.m2254(view, "");
        super.onViewCreated(view, bundle);
        m16242(view);
        m16243(view);
    }
}
