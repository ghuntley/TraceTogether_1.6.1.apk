package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import o.C0293;
import o.C0328;
import o.C0671;
import o.C1265;
import o.C1965;
import o.C2117;
import o.C2135;
import o.C2294;
import o.C2326;
import o.C2382;
import o.C2386;
import o.C2449;
import o.C2610;
import o.C2861;
import o.C3257Con;
import o.R;

public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: ŀ  reason: contains not printable characters */
    private static Object f795 = "TOGGLE_BUTTON_TAG";

    /* renamed from: ʟ  reason: contains not printable characters */
    private static Object f796 = "CANCEL_BUTTON_TAG";

    /* renamed from: г  reason: contains not printable characters */
    private static Object f797 = "CONFIRM_BUTTON_TAG";

    /* renamed from: ł  reason: contains not printable characters */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f798 = new LinkedHashSet<>();

    /* renamed from: ſ  reason: contains not printable characters */
    private MaterialCalendar<S> f799;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f800 = new LinkedHashSet<>();

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f801;

    /* renamed from: ǀ  reason: contains not printable characters */
    private int f802;

    /* renamed from: ȷ  reason: contains not printable characters */
    C2861 f803;

    /* renamed from: ɍ  reason: contains not printable characters */
    private C2294<S> f804;

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean f805;

    /* renamed from: ɟ  reason: contains not printable characters */
    private TextView f806;

    /* renamed from: ɪ  reason: contains not printable characters */
    final LinkedHashSet<View.OnClickListener> f807 = new LinkedHashSet<>();

    /* renamed from: ɺ  reason: contains not printable characters */
    private CharSequence f808;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f809;

    /* renamed from: ɾ  reason: contains not printable characters */
    C2117<S> f810;

    /* renamed from: ɿ  reason: contains not printable characters */
    Button f811;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C1965 f812;

    /* renamed from: ͻ  reason: contains not printable characters */
    private C0671 f813;

    /* renamed from: ӏ  reason: contains not printable characters */
    final LinkedHashSet<Object<? super S>> f814 = new LinkedHashSet<>();

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f801);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f810);
        C1965.C1967 r0 = new C1965.C1967(this.f812);
        if (this.f799.f765 != null) {
            r0.f9867 = Long.valueOf(this.f799.f765.f10766);
        }
        if (r0.f9867 == null) {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            if (instance == null) {
                instance2.clear();
            } else {
                instance2.setTimeInMillis(instance.getTimeInMillis());
            }
            Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance3.clear();
            instance3.set(instance2.get(1), instance2.get(2), instance2.get(5));
            long j = new C2326(instance3).f10766;
            if (r0.f9868 > j || j > r0.f9869) {
                j = r0.f9868;
            }
            r0.f9867 = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", r0.f9870);
        long j2 = r0.f9868;
        Calendar instance4 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance4.clear();
        instance4.setTimeInMillis(j2);
        C2326 r6 = new C2326(instance4);
        long j3 = r0.f9869;
        Calendar instance5 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance5.clear();
        instance5.setTimeInMillis(j3);
        C2326 r7 = new C2326(instance5);
        long longValue = r0.f9867.longValue();
        Calendar instance6 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance6.clear();
        instance6.setTimeInMillis(longValue);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C1965(r6, r7, new C2326(instance6), (C1965.C1966) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (byte) 0));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f809);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f808);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f801 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f810 = (C2117) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f812 = (C1965) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f809 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f808 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f802 = bundle.getInt("INPUT_MODE_KEY");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Dialog m947(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.f801;
        if (i == 0) {
            i = this.f810.m11278();
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.f805 = m944(context);
        int r1 = C0328.m4398(context, (int) R.attr.f150352130968822, MaterialDatePicker.class.getCanonicalName());
        this.f813 = new C0671(context, (AttributeSet) null, R.attr.f153352130969143, R.style.f175152131952270);
        C0671 r2 = this.f813;
        r2.f4785.f4812 = new C2610(context);
        r2.m5521();
        C0671 r0 = this.f813;
        ColorStateList valueOf = ColorStateList.valueOf(r1);
        if (r0.f4785.f4804 != valueOf) {
            r0.f4785.f4804 = valueOf;
            r0.onStateChange(r0.getState());
        }
        C0671 r02 = this.f813;
        float r12 = C0293.m4188(dialog.getWindow().getDecorView());
        if (r02.f4785.f4803 != r12) {
            r02.f4785.f4803 = r12;
            r02.m5521();
        }
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f805 ? R.layout.f169512131558501 : R.layout.f169502131558500, viewGroup);
        Context context = inflate.getContext();
        if (this.f805) {
            inflate.findViewById(R.id.f165982131362156).setLayoutParams(new LinearLayout.LayoutParams(m943(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.f165992131362157);
            View findViewById2 = inflate.findViewById(R.id.f165982131362156);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m943(context), -1));
            Resources resources = requireContext().getResources();
            findViewById2.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.f158852131165421) + resources.getDimensionPixelOffset(R.dimen.f158862131165422) + resources.getDimensionPixelOffset(R.dimen.f158842131165420) + resources.getDimensionPixelSize(R.dimen.f158742131165405) + (C2135.f10281 * resources.getDimensionPixelSize(R.dimen.f158692131165400)) + ((C2135.f10281 - 1) * resources.getDimensionPixelOffset(R.dimen.f158832131165419)) + resources.getDimensionPixelOffset(R.dimen.f158662131165397));
        }
        this.f806 = (TextView) inflate.findViewById(R.id.f166082131362167);
        C0293.m4177((View) this.f806, 1);
        this.f803 = (C2861) inflate.findViewById(R.id.f166102131362169);
        TextView textView = (TextView) inflate.findViewById(R.id.f166112131362173);
        CharSequence charSequence = this.f808;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(this.f809);
        }
        this.f803.setTag(f795);
        C2861 r10 = this.f803;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C3257Con.m1345(context, R.drawable.f163432131231134));
        stateListDrawable.addState(new int[0], C3257Con.m1345(context, R.drawable.f163472131231140));
        r10.setImageDrawable(stateListDrawable);
        this.f803.setChecked(this.f802 != 0);
        C0293.m4151((View) this.f803, (C2449) null);
        m945(this.f803);
        this.f803.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MaterialDatePicker.this.f803.toggle();
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.m945(materialDatePicker.f803);
                MaterialDatePicker.this.m948();
            }
        });
        this.f811 = (Button) inflate.findViewById(R.id.f164902131361994);
        if (this.f810.m11275()) {
            this.f811.setEnabled(true);
        } else {
            this.f811.setEnabled(false);
        }
        this.f811.setTag(f797);
        this.f811.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                Iterator<Object<? super S>> it = MaterialDatePicker.this.f814.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MaterialDatePicker.this.m167();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.f164842131361974);
        button.setTag(f796);
        button.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                Iterator<View.OnClickListener> it = MaterialDatePicker.this.f807.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                MaterialDatePicker.this.m167();
            }
        });
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Window window = m176().getWindow();
        if (this.f805) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f813);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f158752131165406);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f813, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C2386(m176(), rect));
        }
        m948();
    }

    public final void onStop() {
        this.f804.m11967();
        super.onStop();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f798.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f800.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public final void m948() {
        C2117<S> r0 = this.f810;
        requireContext();
        int i = this.f801;
        if (i == 0) {
            i = this.f810.m11278();
        }
        this.f799 = MaterialCalendar.m933(r0, i, this.f812);
        this.f804 = this.f803.isChecked() ? MaterialTextInputPicker.m950(this.f810, this.f812) : this.f799;
        m946();
        C1265 r1 = new C1265(getChildFragmentManager());
        r1.m9968(R.id.f165982131362156, this.f804, (String) null, 2);
        r1.m9970();
        this.f804.m11966(new C2382<S>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m949(S s) {
                MaterialDatePicker.this.m946();
                if (MaterialDatePicker.this.f810.m11275()) {
                    MaterialDatePicker.this.f811.setEnabled(true);
                } else {
                    MaterialDatePicker.this.f811.setEnabled(false);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m945(C2861 r2) {
        String str;
        if (this.f803.isChecked()) {
            r2.getContext();
            str = "Switch to calendar input mode";
        } else {
            r2.getContext();
            str = "Switch to text input mode";
        }
        this.f803.setContentDescription(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m944(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0328.m4398(context, (int) R.attr.f153352130969143, MaterialCalendar.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m943(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f158672131165398);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (instance == null) {
            instance2.clear();
        } else {
            instance2.setTimeInMillis(instance.getTimeInMillis());
        }
        Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance3.clear();
        instance3.set(instance2.get(1), instance2.get(2), instance2.get(5));
        int i = new C2326(instance3).f10762;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.f158732131165404) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.f158822131165418));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m946() {
        C2117<S> r0 = this.f810;
        getContext();
        String r02 = r0.m11277();
        this.f806.setContentDescription(String.format(getString(R.string.f170942131886216), new Object[]{r02}));
        this.f806.setText(r02);
    }
}
