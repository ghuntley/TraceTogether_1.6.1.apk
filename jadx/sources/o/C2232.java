package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import o.C2745;

/* renamed from: o.Іǃ  reason: contains not printable characters */
public final class C2232 extends View {

    /* renamed from: ı  reason: contains not printable characters */
    private WeakReference<View> f10513;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f10514;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2233 f10515;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f10516;

    /* renamed from: ι  reason: contains not printable characters */
    private LayoutInflater f10517;

    /* renamed from: o.Іǃ$ǃ  reason: contains not printable characters */
    public interface C2233 {
        /* renamed from: ı  reason: contains not printable characters */
        void m11683(C2232 r1, View view);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public C2232(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2232(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10516 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f13008, i, 0);
        this.f10514 = obtainStyledAttributes.getResourceId(C2745.aux.f12781, -1);
        this.f10516 = obtainStyledAttributes.getResourceId(C2745.aux.f13024, 0);
        setId(obtainStyledAttributes.getResourceId(C2745.aux.f13021, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void setInflatedId(int i) {
        this.f10514 = i;
    }

    public final void setLayoutResource(int i) {
        this.f10516 = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f10517 = layoutInflater;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.f10513;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m11682();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final View m11682() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f10516 != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f10517;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f10516, viewGroup, false);
            int i = this.f10514;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f10513 = new WeakReference<>(inflate);
            C2233 r0 = this.f10515;
            if (r0 != null) {
                r0.m11683(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setOnInflateListener(C2233 r1) {
        this.f10515 = r1;
    }
}
