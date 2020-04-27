package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import o.C0858;
import o.C2328;
import o.C3198;

/* renamed from: o.ʀǃ  reason: contains not printable characters */
public class C1582 extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1395 f8423;

    /* renamed from: ǃ  reason: contains not printable characters */
    C1585 f8424;

    /* renamed from: ɩ  reason: contains not printable characters */
    C1584 f8425;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2328 f8426;

    /* renamed from: ι  reason: contains not printable characters */
    final C1379 f8427;

    /* renamed from: і  reason: contains not printable characters */
    private ColorStateList f8428;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private MenuInflater f8429;

    /* renamed from: o.ʀǃ$ǃ  reason: contains not printable characters */
    public interface C1584 {
        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m9272(MenuItem menuItem);
    }

    /* renamed from: o.ʀǃ$ɩ  reason: contains not printable characters */
    public interface C1585 {
    }

    public C1582(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1582(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148952130968672);
    }

    public C1582(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f174932131952214), attributeSet, i);
        ColorStateList valueOf;
        this.f8423 = new C1395();
        Context context2 = getContext();
        this.f8426 = new C1391(context2);
        this.f8427 = new C1379(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f8427.setLayoutParams(layoutParams);
        C1395 r1 = this.f8423;
        C1379 r2 = this.f8427;
        r1.f7646 = r2;
        r1.f7647 = 1;
        r2.setPresenter(r1);
        this.f8426.m12156((C1483) this.f8423);
        this.f8423.m8571(getContext(), this.f8426);
        int[] iArr = C0858.Aux.f5604;
        C3160.m15978(context2, attributeSet, i, R.style.f174932131952214);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f174932131952214, 8, 7);
        C1992 r12 = new C1992(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f174932131952214));
        if (r12.f9934.hasValue(5)) {
            this.f8427.setIconTintList(r12.m10792(5));
        } else {
            C1379 r13 = this.f8427;
            r13.setIconTintList(r13.m8521());
        }
        setItemIconSize(r12.f9934.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.f158022131165287)));
        if (r12.f9934.hasValue(8)) {
            setItemTextAppearanceInactive(r12.f9934.getResourceId(8, 0));
        }
        if (r12.f9934.hasValue(7)) {
            setItemTextAppearanceActive(r12.f9934.getResourceId(7, 0));
        }
        if (r12.f9934.hasValue(9)) {
            setItemTextColor(r12.m10792(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0671 r132 = new C0671();
            Drawable background = getBackground();
            if ((background instanceof ColorDrawable) && r132.f4785.f4804 != (valueOf = ColorStateList.valueOf(((ColorDrawable) background).getColor()))) {
                r132.f4785.f4804 = valueOf;
                r132.onStateChange(r132.getState());
            }
            r132.f4785.f4812 = new C2610(context2);
            r132.m5521();
            C0293.m4199((View) this, (Drawable) r132);
        }
        if (r12.f9934.hasValue(1)) {
            C0293.m4163((View) this, (float) r12.f9934.getDimensionPixelSize(1, 0));
        }
        C1266.m8152(getBackground().mutate(), C0344.m4476(context2, r12, 0));
        setLabelVisibilityMode(r12.f9934.getInteger(10, -1));
        setItemHorizontalTranslationEnabled(r12.f9934.getBoolean(3, true));
        int resourceId = r12.f9934.getResourceId(2, 0);
        if (resourceId != 0) {
            this.f8427.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(C0344.m4476(context2, r12, 6));
        }
        if (r12.f9934.hasValue(11)) {
            int resourceId2 = r12.f9934.getResourceId(11, 0);
            this.f8423.f7648 = true;
            if (this.f8429 == null) {
                this.f8429 = new C0491(getContext());
            }
            this.f8429.inflate(resourceId2, this.f8426);
            C1395 r133 = this.f8423;
            r133.f7648 = false;
            r133.m8572(true);
        }
        r12.f9934.recycle();
        addView(this.f8427, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context2);
            view.setBackgroundColor(C0651.m5450(context2, R.color.f156262131099714));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f158062131165291)));
            addView(view);
        }
        this.f8426.m12148((C2328.Cif) new C2328.Cif() {
            /* renamed from: ι  reason: contains not printable characters */
            public final void m9270(C2328 r1) {
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m9269(C2328 r3, MenuItem menuItem) {
                if (C1582.this.f8424 != null && menuItem.getItemId() == C1582.this.f8427.f7584) {
                    return true;
                }
                if (C1582.this.f8425 == null || C1582.this.f8425.m9272(menuItem)) {
                    return false;
                }
                return true;
            }
        });
        C3198.m16134((View) this, (C3198.Cif) new C3198.Cif() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m9271(View view, C0501 r5, C3198.C3199 r6) {
                r6.f14541 += r5.m4890();
                C0293.m4178(view, r6.f14540, r6.f14539, r6.f14542, r6.f14541);
                return r5;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14535((View) this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2745.m14513((View) this, f);
    }

    public void setOnNavigationItemSelectedListener(C1584 r1) {
        this.f8425 = r1;
    }

    public void setOnNavigationItemReselectedListener(C1585 r1) {
        this.f8424 = r1;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f8427.setIconTintList(colorStateList);
    }

    public void setItemIconSize(int i) {
        this.f8427.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8427.setItemTextColor(colorStateList);
    }

    public void setItemBackgroundResource(int i) {
        this.f8427.setItemBackgroundRes(i);
        this.f8428 = null;
    }

    public void setItemBackground(Drawable drawable) {
        this.f8427.setItemBackground(drawable);
        this.f8428 = null;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8428 != colorStateList) {
            this.f8428 = colorStateList;
            if (colorStateList == null) {
                this.f8427.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList r4 = C0410.m4696(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f8427.setItemBackground(new RippleDrawable(r4, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable r0 = C1266.m8158(gradientDrawable);
            C1266.m8152(r0, r4);
            this.f8427.setItemBackground(r0);
        } else if (colorStateList == null) {
            C1379 r42 = this.f8427;
            if (r42.f7596 == null || r42.f7596.length <= 0) {
                drawable = r42.f7600;
            } else {
                drawable = r42.f7596[0].getBackground();
            }
            if (drawable != null) {
                this.f8427.setItemBackground((Drawable) null);
            }
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f8426.findItem(i);
        if (findItem != null && !this.f8426.m12143(findItem, this.f8423, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f8427.f7595 != i) {
            this.f8427.setLabelVisibilityMode(i);
            this.f8423.m8572(false);
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f8427.setItemTextAppearanceInactive(i);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f8427.setItemTextAppearanceActive(i);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f8427.f7588 != z) {
            this.f8427.setItemHorizontalTranslationEnabled(z);
            this.f8423.m8572(false);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1583 r1 = new C1583(super.onSaveInstanceState());
        r1.f8431 = new Bundle();
        this.f8426.m12155(r1.f8431);
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1583)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1583 r2 = (C1583) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        this.f8426.m12137(r2.f8431);
    }

    /* renamed from: o.ʀǃ$ı  reason: contains not printable characters */
    static class C1583 extends C1219 {
        public static final Parcelable.Creator<C1583> CREATOR = new Parcelable.ClassLoaderCreator<C1583>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1583(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1583[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1583(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ɩ  reason: contains not printable characters */
        Bundle f8431;

        public C1583(Parcelable parcelable) {
            super(parcelable);
        }

        public C1583(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8431 = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f8431);
        }
    }
}
