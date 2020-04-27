package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C0858;

/* renamed from: o.ɪͱ  reason: contains not printable characters */
public final class C1372 extends C1514 {
    public C1372(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1372(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C1372(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private C1372(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i);
        boolean z = true;
        if (C0328.m4399(context, (int) R.attr.f154932130969322, true)) {
            Resources.Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C0858.Aux.f5596, i, 0);
            int r5 = m8501(context, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(r5 == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, C0858.Aux.f5596, i, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    m8502(theme, resourceId);
                }
            }
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C0328.m4399(context, (int) R.attr.f154932130969322, true)) {
            m8502(context.getTheme(), i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m8502(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C0858.Aux.f5589);
        int r3 = m8501(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (r3 >= 0) {
            setLineHeight(r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8501(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = C0344.m4475(context, typedArray, iArr[i2]);
        }
        return i;
    }
}
