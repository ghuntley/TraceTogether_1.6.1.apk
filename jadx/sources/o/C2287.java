package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import o.C2724;

/* renamed from: o.Іι  reason: contains not printable characters */
public final class C2287 extends C2107 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C1316 f10671;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f10672;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f10673;

    public C2287(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C2287(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C2287(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public final void setType(int i) {
        this.f10672 = i;
        this.f10673 = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f10672;
            if (i2 == 5) {
                this.f10673 = 0;
            } else if (i2 == 6) {
                this.f10673 = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.f10672;
                if (i3 == 5) {
                    this.f10673 = 1;
                } else if (i3 == 6) {
                    this.f10673 = 0;
                }
            } else {
                int i4 = this.f10672;
                if (i4 == 5) {
                    this.f10673 = 0;
                } else if (i4 == 6) {
                    this.f10673 = 1;
                }
            }
        }
        this.f10671.f7316 = this.f10673;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11953(AttributeSet attributeSet) {
        super.m11259(attributeSet);
        this.f10671 = new C1316();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2724.C2725.f12613);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2724.C2725.f12690) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C2724.C2725.f12605) {
                    this.f10671.f7317 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f10223 = this.f10671;
        m11257();
    }

    public final void setAllowsGoneWidget(boolean z) {
        this.f10671.f7317 = z;
    }
}
