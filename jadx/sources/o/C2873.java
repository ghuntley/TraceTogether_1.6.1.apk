package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import o.C2827;
import o.C2911;

/* renamed from: o.ӏł  reason: contains not printable characters */
public final class C2873 extends FrameLayout implements View.OnClickListener {

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f13398;

    /* renamed from: ɩ  reason: contains not printable characters */
    private View f13399;

    /* renamed from: Ι  reason: contains not printable characters */
    private View.OnClickListener f13400;

    /* renamed from: ι  reason: contains not printable characters */
    private int f13401;

    public C2873(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2873(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public C2873(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13400 = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2827.If.f13251, 0, 0);
        try {
            this.f13398 = obtainStyledAttributes.getInt(0, 0);
            this.f13401 = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.f13398, this.f13401);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSize(int i) {
        setStyle(i, this.f13401);
    }

    public final void setColorScheme(int i) {
        setStyle(this.f13398, i);
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        setStyle(this.f13398, this.f13401);
    }

    public final void setStyle(int i, int i2) {
        this.f13398 = i;
        this.f13401 = i2;
        Context context = getContext();
        View view = this.f13399;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13399 = C1444.f7786.m8706(context, this.f13398, this.f13401);
        } catch (C2911.If unused) {
            int i3 = this.f13398;
            int i4 = this.f13401;
            C1448 r1 = new C1448(context);
            Resources resources = context.getResources();
            r1.setTypeface(Typeface.DEFAULT_BOLD);
            r1.setTextSize(14.0f);
            int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            r1.setMinHeight(i5);
            r1.setMinWidth(i5);
            int r2 = C1448.m8711(i4, R.drawable.f160772131230847, R.drawable.f160812131230852, R.drawable.f160812131230852);
            int r3 = C1448.m8711(i4, R.drawable.f160842131230856, R.drawable.f160882131230861, R.drawable.f160882131230861);
            if (i3 == 0 || i3 == 1) {
                r2 = r3;
            } else if (i3 != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown button size: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
            Drawable r22 = C1266.m8158(resources.getDrawable(r2));
            C1266.m8152(r22, resources.getColorStateList(R.color.f156232131099710));
            C1266.m8153(r22, PorterDuff.Mode.SRC_ATOP);
            r1.setBackgroundDrawable(r22);
            ColorStateList colorStateList = resources.getColorStateList(C1448.m8711(i4, R.color.f156132131099700, R.color.f156182131099705, R.color.f156182131099705));
            if (colorStateList != null) {
                r1.setTextColor(colorStateList);
                if (i3 == 0) {
                    r1.setText(resources.getString(R.string.f170772131886167));
                } else if (i3 == 1) {
                    r1.setText(resources.getString(R.string.f170782131886168));
                } else if (i3 == 2) {
                    r1.setText((CharSequence) null);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown button size: ");
                    sb2.append(i3);
                    throw new IllegalStateException(sb2.toString());
                }
                r1.setTransformationMethod((TransformationMethod) null);
                if (C2173.m11531(r1.getContext())) {
                    r1.setGravity(19);
                }
                this.f13399 = r1;
            } else {
                throw new NullPointerException("null reference");
            }
        }
        addView(this.f13399);
        this.f13399.setEnabled(isEnabled());
        this.f13399.setOnClickListener(this);
    }

    @Deprecated
    public final void setStyle(int i, int i2, Scope[] scopeArr) {
        setStyle(i, i2);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13400 = onClickListener;
        View view = this.f13399;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f13399.setEnabled(z);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f13400;
        if (onClickListener != null && view == this.f13399) {
            onClickListener.onClick(this);
        }
    }
}
