package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import o.C2745;

/* renamed from: o.ıǃ  reason: contains not printable characters */
public class C0308 extends C1645 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private int f3603;

    /* renamed from: ł  reason: contains not printable characters */
    private int f3604;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private View f3605;

    /* renamed from: ȷ  reason: contains not printable characters */
    private TextView f3606;

    /* renamed from: ɨ  reason: contains not printable characters */
    private TextView f3607;

    /* renamed from: ɪ  reason: contains not printable characters */
    private LinearLayout f3608;

    /* renamed from: ɹ  reason: contains not printable characters */
    public CharSequence f3609;

    /* renamed from: ɾ  reason: contains not printable characters */
    private View f3610;

    /* renamed from: і  reason: contains not printable characters */
    public boolean f3611;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public CharSequence f3612;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f3613;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0358 m4369(int i, long j) {
        return super.m9470(i, j);
    }

    public C0308(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0308(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148382130968604);
    }

    public C0308(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12811, i, 0));
        C0293.m4199((View) this, r1.m10793(C2745.aux.f12804));
        int i2 = C2745.aux.f12849;
        this.f3613 = r1.f9934.getResourceId(5, 0);
        int i3 = C2745.aux.f12846;
        this.f3604 = r1.f9934.getResourceId(4, 0);
        int i4 = C2745.aux.f12878;
        this.f8613 = r1.f9934.getLayoutDimension(3, 0);
        int i5 = C2745.aux.f12817;
        this.f3603 = r1.f9934.getResourceId(2, R.layout.f168642131558405);
        r1.f9934.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8616 != null) {
            this.f8616.m12291();
            C2348 r0 = this.f8616;
            if (r0.f10867 != null) {
                r0.f10867.m14216();
            }
        }
    }

    public void setContentHeight(int i) {
        this.f8613 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3610;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3610 = view;
        if (!(view == null || (linearLayout = this.f3608) == null)) {
            removeView(linearLayout);
            this.f3608 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3609 = charSequence;
        m4366();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3612 = charSequence;
        m4366();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m4366() {
        if (this.f3608 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f168602131558400, this);
            this.f3608 = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3607 = (TextView) this.f3608.findViewById(R.id.f164342131361905);
            this.f3606 = (TextView) this.f3608.findViewById(R.id.f164332131361904);
            if (this.f3613 != 0) {
                this.f3607.setTextAppearance(getContext(), this.f3613);
            }
            if (this.f3604 != 0) {
                this.f3606.setTextAppearance(getContext(), this.f3604);
            }
        }
        this.f3607.setText(this.f3609);
        this.f3606.setText(this.f3612);
        boolean z = !TextUtils.isEmpty(this.f3609);
        boolean z2 = !TextUtils.isEmpty(this.f3612);
        int i = 0;
        this.f3606.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f3608;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f3608.getParent() == null) {
            addView(this.f3608);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4370(final C2407 r7) {
        View view = this.f3605;
        if (view == null) {
            this.f3605 = LayoutInflater.from(getContext()).inflate(this.f3603, this, false);
            addView(this.f3605);
        } else if (view.getParent() == null) {
            addView(this.f3605);
        }
        this.f3605.findViewById(R.id.f164392131361914).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                r7.m12437();
            }
        });
        C2328 r72 = (C2328) r7.m12440();
        if (this.f8616 != null) {
            C2348 r0 = this.f8616;
            r0.m12291();
            if (r0.f10867 != null) {
                r0.f10867.m14216();
            }
        }
        this.f8616 = new C2348(getContext());
        C2348 r02 = this.f8616;
        r02.f10873 = true;
        r02.f10866 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        C2348 r2 = this.f8616;
        Context context = this.f8611;
        r72.f10807.add(new WeakReference(r2));
        r2.m8873(context, r72);
        r72.f10817 = true;
        this.f8615 = (C2118) this.f8616.m7313((ViewGroup) this);
        C0293.m4199((View) this.f8615, (Drawable) null);
        addView(this.f8615, layoutParams);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4367() {
        if (this.f3605 == null) {
            removeAllViews();
            this.f3610 = null;
            this.f8615 = null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4368() {
        removeAllViews();
        this.f3610 = null;
        this.f8615 = null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m4371() {
        if (this.f8616 != null) {
            return this.f8616.m12296();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            if (this.f8613 > 0) {
                i3 = this.f8613;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION);
            View view = this.f3605;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3605.getLayoutParams();
                paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f8615 != null && this.f8615.getParent() == this) {
                C2118 r6 = this.f8615;
                r6.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - r6.getMeasuredWidth());
            }
            LinearLayout linearLayout = this.f3608;
            if (linearLayout != null && this.f3610 == null) {
                if (this.f3611) {
                    this.f3608.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f3608.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f3608.setVisibility(z ? 0 : 8);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view2 = this.f3610;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = RecyclerView.UNDEFINED_DURATION;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.f3610.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i4));
            }
            if (this.f8613 <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean r5 = C2373.m12363(this);
        int paddingRight = r5 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3605;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3605.getLayoutParams();
            int i5 = r5 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = r5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = r5 ? paddingRight - i5 : paddingRight + i5;
            int r0 = i7 + m9468(this.f3605, i7, paddingTop, paddingTop2, r5);
            paddingRight = r5 ? r0 - i6 : r0 + i6;
        }
        LinearLayout linearLayout = this.f3608;
        if (!(linearLayout == null || this.f3610 != null || linearLayout.getVisibility() == 8)) {
            paddingRight += m9468(this.f3608, paddingRight, paddingTop, paddingTop2, r5);
        }
        View view2 = this.f3610;
        if (view2 != null) {
            m9468(view2, paddingRight, paddingTop, paddingTop2, r5);
        }
        int paddingLeft = r5 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f8615 != null) {
            m9468(this.f8615, paddingLeft, paddingTop, paddingTop2, !r5);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f3609);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f3611) {
            requestLayout();
        }
        this.f3611 = z;
    }
}
