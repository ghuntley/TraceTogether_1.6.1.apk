package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import o.C2512;
import o.C2724;

/* renamed from: o.ν  reason: contains not printable characters */
public abstract class C2107 extends View {

    /* renamed from: ı  reason: contains not printable characters */
    protected int f10219;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f10220;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected int[] f10221 = new int[32];

    /* renamed from: Ι  reason: contains not printable characters */
    private Context f10222;

    /* renamed from: ι  reason: contains not printable characters */
    protected C1932 f10223;

    public void onDraw(Canvas canvas) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m11258() {
    }

    public C2107(Context context) {
        super(context);
        this.f10222 = context;
        m11259((AttributeSet) null);
    }

    public C2107(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10222 = context;
        m11259(attributeSet);
    }

    public C2107(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10222 = context;
        m11259(attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m11259(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2724.C2725.f12613);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2724.C2725.f12705) {
                    this.f10220 = obtainStyledAttributes.getString(index);
                    m11254(this.f10220);
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int[] m11260() {
        return Arrays.copyOf(this.f10221, this.f10219);
    }

    public void setReferencedIds(int[] iArr) {
        this.f10219 = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f10219 + 1;
        int[] iArr = this.f10221;
        if (i2 > iArr.length) {
            this.f10221 = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.f10221;
        int i3 = this.f10219;
        iArr2[i3] = i;
        this.f10219 = i3 + 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11257() {
        if (this.f10223 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C2512.C2513) {
                ((C2512.C2513) layoutParams).f11409 = this.f10223;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m11255(String str) {
        Object r5;
        if (str != null && this.f10222 != null) {
            String trim = str.trim();
            int i = 0;
            try {
                i = C2724.If.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
            }
            if (i == 0) {
                i = this.f10222.getResources().getIdentifier(trim, "id", this.f10222.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof C2512) && (r5 = ((C2512) getParent()).m13345((Object) trim)) != null && (r5 instanceof Integer)) {
                i = ((Integer) r5).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m11254(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m11255(str.substring(i));
                    return;
                } else {
                    m11255(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m11256(C2512 r4) {
        C1696 r1;
        if (isInEditMode()) {
            m11254(this.f10220);
        }
        C1932 r0 = this.f10223;
        if (r0 != null) {
            r0.m10555();
            for (int i = 0; i < this.f10219; i++) {
                View view = r4.f11352.get(this.f10221[i]);
                if (view != null) {
                    C1932 r2 = this.f10223;
                    if (view == r4) {
                        r1 = r4.f11359;
                    } else {
                        r1 = ((C2512.C2513) view.getLayoutParams()).f11409;
                    }
                    r2.m10556(r1);
                }
            }
        }
    }
}
