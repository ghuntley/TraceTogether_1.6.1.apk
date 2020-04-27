package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import o.C1429;
import o.C2118;
import o.C2328;
import o.C2745;

/* renamed from: o.Ɨ  reason: contains not printable characters */
public class C0666 extends C1514 implements C1429.C1430, View.OnClickListener, C2118.If {

    /* renamed from: ı  reason: contains not printable characters */
    C0667 f4753;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f4754;

    /* renamed from: ǃ  reason: contains not printable characters */
    private CharSequence f4755;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f4756;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0381 f4757;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f4758;

    /* renamed from: Ι  reason: contains not printable characters */
    C2459 f4759;

    /* renamed from: ι  reason: contains not printable characters */
    C2328.If f4760;

    /* renamed from: І  reason: contains not printable characters */
    private Drawable f4761;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f4762;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f4763;

    /* renamed from: o.Ɨ$ɩ  reason: contains not printable characters */
    public static abstract class C0667 {
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract C2257 m5504();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setShortcut(boolean z, char c) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m5501() {
        return true;
    }

    public C0666(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0666(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0666(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f4763 = m5496();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12845, i, 0);
        this.f4754 = obtainStyledAttributes.getDimensionPixelSize(C2745.aux.f12812, 0);
        obtainStyledAttributes.recycle();
        this.f4758 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4756 = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4763 = m5496();
        m5497();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m5496() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f4756 = i;
        super.setPadding(i, i2, i3, i4);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2459 m5499() {
        return this.f4759;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5498(C2459 r2) {
        CharSequence charSequence;
        this.f4759 = r2;
        setIcon(r2.getIcon());
        if (m8664()) {
            charSequence = r2.getTitleCondensed();
        } else {
            charSequence = r2.getTitle();
        }
        setTitle(charSequence);
        setId(r2.getItemId());
        setVisibility(r2.isVisible() ? 0 : 8);
        setEnabled(r2.isEnabled());
        if (r2.hasSubMenu() && this.f4757 == null) {
            this.f4757 = new Cif();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0381 r0;
        if (!this.f4759.hasSubMenu() || (r0 = this.f4757) == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        C2328.If ifR = this.f4760;
        if (ifR != null) {
            ifR.m12159(this.f4759);
        }
    }

    public void setItemInvoker(C2328.If ifR) {
        this.f4760 = ifR;
    }

    public void setPopupCallback(C0667 r1) {
        this.f4753 = r1;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4762 != z) {
            this.f4762 = z;
            C2459 r2 = this.f4759;
            if (r2 != null) {
                C2328 r22 = r2.f11193;
                r22.f10817 = true;
                r22.m12149(true);
            }
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m5497() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4755);
        if (this.f4761 != null) {
            if (!((this.f4759.f11171 & 4) == 4) || (!this.f4763 && !this.f4762)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f4755 : null);
        CharSequence contentDescription = this.f4759.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f4759.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4759.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f4759.getTitle();
            }
            C2110.m11263(this, charSequence2);
            return;
        }
        C2110.m11263(this, tooltipText);
    }

    public void setIcon(Drawable drawable) {
        this.f4761 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4758;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f4758;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m5497();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4755 = charSequence;
        m5497();
    }

    /* renamed from: o.Ɨ$if  reason: invalid class name */
    class Cif extends C0381 {
        public Cif() {
            super(C0666.this);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2257 m5502() {
            if (C0666.this.f4753 != null) {
                return C0666.this.f4753.m5504();
            }
            return null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m5503() {
            C2257 r0;
            if (C0666.this.f4760 == null || !C0666.this.f4760.m12159(C0666.this.f4759) || (r0 = m4637()) == null || !r0.m11819()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5500() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f4759.getIcon() == null;
    }

    public final boolean a_() {
        return !TextUtils.isEmpty(getText());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.f4756) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f4754) : this.f4754;
        if (mode != 1073741824 && this.f4754 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z && this.f4761 != null) {
            super.setPadding((getMeasuredWidth() - this.f4761.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }
}
