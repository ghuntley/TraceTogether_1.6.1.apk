package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.DialogFragmentNavigator$1;
import o.C0712;
import o.C0818;

@C0712.Cif(m5830 = "dialog")
/* renamed from: o.ƶ  reason: contains not printable characters */
public final class C0800 extends C0712<Cif> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1550 f5272;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f5273 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f5274;

    /* renamed from: ι  reason: contains not printable characters */
    private C2456 f5275 = new DialogFragmentNavigator$1(this);

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C0593 m6179(C0593 r3, Bundle bundle, C0665 r5, C0712.C0713 r6) {
        C1469 r0;
        Cif ifVar = (Cif) r3;
        C1550 r52 = this.f5272;
        if (r52.f8272 || r52.f8276) {
            return null;
        }
        if (ifVar.f5276 != null) {
            String str = ifVar.f5276;
            if (str.charAt(0) == '.') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5274.getPackageName());
                sb.append(str);
                str = sb.toString();
            }
            C1550 r02 = this.f5272;
            if (r02.f8259 != null) {
                r0 = r02.f8259.mFragmentManager.m9131();
            } else {
                r0 = r02.f8279;
            }
            C1277 r53 = r0.m8798(this.f5274.getClassLoader(), str);
            if (!DialogFragment.class.isAssignableFrom(r53.getClass())) {
                StringBuilder sb2 = new StringBuilder("Dialog destination ");
                if (ifVar.f5276 == null) {
                    throw new IllegalStateException("DialogFragment class was not set");
                }
                sb2.append(ifVar.f5276);
                sb2.append(" is not an instance of DialogFragment");
                throw new IllegalArgumentException(sb2.toString());
            }
            DialogFragment dialogFragment = (DialogFragment) r53;
            dialogFragment.setArguments(bundle);
            dialogFragment.getLifecycle().m12098(this.f5275);
            C1550 r4 = this.f5272;
            StringBuilder sb3 = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
            int i = this.f5273;
            this.f5273 = i + 1;
            sb3.append(i);
            dialogFragment.m171(r4, sb3.toString());
            return ifVar;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public C0800(Context context, C1550 r3) {
        this.f5274 = context;
        this.f5272 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m6182() {
        if (this.f5273 == 0) {
            return false;
        }
        C1550 r0 = this.f5272;
        if (r0.f8272 || r0.f8276) {
            return false;
        }
        C1550 r02 = this.f5272;
        StringBuilder sb = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
        int i = this.f5273 - 1;
        this.f5273 = i;
        sb.append(i);
        C1277 findFragmentByTag = r02.findFragmentByTag(sb.toString());
        if (findFragmentByTag != null) {
            findFragmentByTag.getLifecycle().m12097(this.f5275);
            ((DialogFragment) findFragmentByTag).m167();
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bundle m6181() {
        if (this.f5273 == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f5273);
        return bundle;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6180(Bundle bundle) {
        if (bundle != null) {
            int i = 0;
            this.f5273 = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            while (i < this.f5273) {
                DialogFragment dialogFragment = (DialogFragment) this.f5272.findFragmentByTag("androidx-nav-fragment:navigator:dialog:".concat(String.valueOf(i)));
                if (dialogFragment != null) {
                    dialogFragment.getLifecycle().m12098(this.f5275);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("DialogFragment ");
                    sb.append(i);
                    sb.append(" doesn't exist in the FragmentManager");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: o.ƶ$if  reason: invalid class name */
    public static class Cif extends C0593 implements C0422 {

        /* renamed from: ι  reason: contains not printable characters */
        String f5276;

        public Cif(C0712<? extends Cif> r1) {
            super((C0712<? extends C0593>) r1);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6183(Context context, AttributeSet attributeSet) {
            super.m5242(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0818.Cif.f5335);
            String string = obtainAttributes.getString(C0818.Cif.f5331);
            if (string != null) {
                this.f5276 = string;
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C0593 m6178() {
        return new Cif(this);
    }
}
