package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: o.ƶӀ  reason: contains not printable characters */
public class C0809 extends BaseTransientBottomBar<C0809> {

    /* renamed from: ɾ  reason: contains not printable characters */
    private static final int[] f5288 = {R.attr.f154252130969242, R.attr.f154272130969244};

    /* renamed from: ȷ  reason: contains not printable characters */
    private final AccessibilityManager f5289;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f5290;

    static {
        new int[1][0] = R.attr.f154252130969242;
    }

    private C0809(ViewGroup viewGroup, View view, C0806 r3) {
        super(viewGroup, view, r3);
        this.f5289 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6206() {
        super.m1025();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6204() {
        super.m1023();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0809 m6202(View view, int i) {
        return m6203(view, view.getResources().getText(i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m6208() {
        int r0 = super.m1027();
        if (r0 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f5289.getRecommendedTimeoutMillis(r0, (this.f5290 ? 4 : 0) | 1 | 2);
        } else if (!this.f5290 || !this.f5289.isTouchExplorationEnabled()) {
            return r0;
        } else {
            return -2;
        }
    }

    /* renamed from: o.ƶӀ$ǃ  reason: contains not printable characters */
    public static final class C0810 extends BaseTransientBottomBar.C0075 {
        public final /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public final /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public final /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public final /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public final /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public C0810(Context context) {
            super(context);
        }

        public C0810(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0809 m6203(View view, CharSequence charSequence) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(f5288);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            boolean z = true;
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                z = false;
            }
            C0827 r0 = (C0827) from.inflate(z ? R.layout.f169482131558498 : R.layout.f169042131558447, viewGroup, false);
            C0809 r1 = new C0809(viewGroup, r0, r0);
            ((C0827) r1.f875.getChildAt(0)).f5374.setText(charSequence);
            r1.m1026();
            return r1;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0809 m6205(int i) {
        ((C0827) this.f875.getChildAt(0)).f5374.setText(this.f873.getText(i));
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0809 m6207(int i, final View.OnClickListener onClickListener) {
        CharSequence text = this.f873.getText(i);
        Button button = ((C0827) this.f875.getChildAt(0)).f5377;
        if (TextUtils.isEmpty(text) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener((View.OnClickListener) null);
            this.f5290 = false;
        } else {
            this.f5290 = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    C0809 r3 = C0809.this;
                    if (C0824.f5366 == null) {
                        C0824.f5366 = new C0824();
                    }
                    C0824.f5366.m6252(r3.f882, 1);
                }
            });
        }
        return this;
    }
}
