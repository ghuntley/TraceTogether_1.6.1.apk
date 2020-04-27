package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import o.C1429;
import o.C2958;

/* renamed from: o.ӏʝ  reason: contains not printable characters */
public class C2907 extends C2950 implements C1429.C1430 {

    /* renamed from: і  reason: contains not printable characters */
    private static final int[] f13523 = {16842912};

    /* renamed from: ı  reason: contains not printable characters */
    FrameLayout f13524;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Drawable f13525;

    /* renamed from: ǃ  reason: contains not printable characters */
    final CheckedTextView f13526;

    /* renamed from: ɩ  reason: contains not printable characters */
    C2459 f13527;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C2449 f13528;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f13529;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f13530;

    /* renamed from: ι  reason: contains not printable characters */
    ColorStateList f13531;

    /* renamed from: І  reason: contains not printable characters */
    boolean f13532;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f13533;

    public void setShortcut(boolean z, char c) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m15064() {
        return false;
    }

    public C2907(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2907(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2907(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13528 = new C2449() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m15065(View view, C0520 r2) {
                super.m12579(view, r2);
                r2.m5060(C2907.this.f13530);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.f169132131558456, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.f158172131165305));
        this.f13526 = (CheckedTextView) findViewById(R.id.f165082131362014);
        this.f13526.setDuplicateParentStateEnabled(true);
        C0293.m4151((View) this.f13526, this.f13528);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15062(C2459 r8) {
        StateListDrawable stateListDrawable;
        this.f13527 = r8;
        setVisibility(r8.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.f150252130968805, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f13523, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0293.m4199((View) this, (Drawable) stateListDrawable);
        }
        setCheckable(r8.isCheckable());
        setChecked(r8.isChecked());
        setEnabled(r8.isEnabled());
        setTitle(r8.getTitle());
        setIcon(r8.getIcon());
        View actionView = r8.getActionView();
        if (actionView != null) {
            if (this.f13524 == null) {
                this.f13524 = (FrameLayout) ((ViewStub) findViewById(R.id.f165072131362013)).inflate();
            }
            this.f13524.removeAllViews();
            this.f13524.addView(actionView);
        }
        setContentDescription(r8.getContentDescription());
        C2110.m11263(this, r8.getTooltipText());
        if (!(this.f13527.getTitle() == null && this.f13527.getIcon() == null && this.f13527.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f13526.setVisibility(8);
            FrameLayout frameLayout = this.f13524;
            if (frameLayout != null) {
                C2958.C2959 r82 = (C2958.C2959) frameLayout.getLayoutParams();
                r82.width = -1;
                this.f13524.setLayoutParams(r82);
                return;
            }
            return;
        }
        this.f13526.setVisibility(0);
        FrameLayout frameLayout2 = this.f13524;
        if (frameLayout2 != null) {
            C2958.C2959 r83 = (C2958.C2959) frameLayout2.getLayoutParams();
            r83.width = -2;
            this.f13524.setLayoutParams(r83);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2459 m15063() {
        return this.f13527;
    }

    public void setTitle(CharSequence charSequence) {
        this.f13526.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f13530 != z) {
            this.f13530 = z;
            this.f13528.m12577((View) this.f13526, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f13526.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f13532) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1266.m8158(drawable).mutate();
                C1266.m8152(drawable, this.f13531);
            }
            int i = this.f13533;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f13529) {
            if (this.f13525 == null) {
                this.f13525 = C0913.m6730(getResources(), R.drawable.f163702131231187, getContext().getTheme());
                Drawable drawable2 = this.f13525;
                if (drawable2 != null) {
                    int i2 = this.f13533;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f13525;
        }
        C0893.m6621(this.f13526, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconSize(int i) {
        this.f13533 = i;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C2459 r0 = this.f13527;
        if (r0 != null && r0.isCheckable() && this.f13527.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f13523);
        }
        return onCreateDrawableState;
    }

    public void setTextAppearance(int i) {
        C0893.m6632((TextView) this.f13526, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f13526.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f13529 = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f13526.setCompoundDrawablePadding(i);
    }

    public void setMaxLines(int i) {
        this.f13526.setMaxLines(i);
    }
}
