package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import o.C2512;
import o.C2724;

/* renamed from: o.з  reason: contains not printable characters */
public final class C2425 extends ViewGroup {

    /* renamed from: ι  reason: contains not printable characters */
    C2597 f11041;

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C2425(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C2425(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C2425(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: o.з$ǃ  reason: contains not printable characters */
    public static class C2426 extends C2512.C2513 {

        /* renamed from: ıɩ  reason: contains not printable characters */
        public boolean f11042;

        /* renamed from: ıι  reason: contains not printable characters */
        public float f11043;

        /* renamed from: ĸ  reason: contains not printable characters */
        public float f11044;

        /* renamed from: Ŀ  reason: contains not printable characters */
        public float f11045;

        /* renamed from: ǃɩ  reason: contains not printable characters */
        public float f11046;

        /* renamed from: ǃι  reason: contains not printable characters */
        public float f11047;

        /* renamed from: Ƚ  reason: contains not printable characters */
        public float f11048;

        /* renamed from: ɩı  reason: contains not printable characters */
        public float f11049;

        /* renamed from: ɩǃ  reason: contains not printable characters */
        public float f11050;

        /* renamed from: ɽ  reason: contains not printable characters */
        public float f11051;

        /* renamed from: Ξ  reason: contains not printable characters */
        public float f11052;

        /* renamed from: ч  reason: contains not printable characters */
        public float f11053;

        public C2426() {
            this.f11052 = 1.0f;
            this.f11042 = false;
            this.f11053 = 0.0f;
            this.f11045 = 0.0f;
            this.f11044 = 0.0f;
            this.f11047 = 0.0f;
            this.f11046 = 1.0f;
            this.f11043 = 1.0f;
            this.f11049 = 0.0f;
            this.f11050 = 0.0f;
            this.f11048 = 0.0f;
            this.f11051 = 0.0f;
        }

        public C2426(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11052 = 1.0f;
            this.f11042 = false;
            this.f11053 = 0.0f;
            this.f11045 = 0.0f;
            this.f11044 = 0.0f;
            this.f11047 = 0.0f;
            this.f11046 = 1.0f;
            this.f11043 = 1.0f;
            this.f11049 = 0.0f;
            this.f11050 = 0.0f;
            this.f11048 = 0.0f;
            this.f11051 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2724.C2725.f12702);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2724.C2725.f12626) {
                    this.f11052 = obtainStyledAttributes.getFloat(index, this.f11052);
                } else if (index == C2724.C2725.f12593) {
                    this.f11053 = obtainStyledAttributes.getFloat(index, this.f11053);
                    this.f11042 = true;
                } else if (index == C2724.C2725.f12709) {
                    this.f11044 = obtainStyledAttributes.getFloat(index, this.f11044);
                } else if (index == C2724.C2725.f12710) {
                    this.f11047 = obtainStyledAttributes.getFloat(index, this.f11047);
                } else if (index == C2724.C2725.f12687) {
                    this.f11045 = obtainStyledAttributes.getFloat(index, this.f11045);
                } else if (index == C2724.C2725.f12660) {
                    this.f11046 = obtainStyledAttributes.getFloat(index, this.f11046);
                } else if (index == C2724.C2725.f12679) {
                    this.f11043 = obtainStyledAttributes.getFloat(index, this.f11043);
                } else if (index == C2724.C2725.f12640) {
                    this.f11049 = obtainStyledAttributes.getFloat(index, this.f11049);
                } else if (index == C2724.C2725.f12676) {
                    this.f11050 = obtainStyledAttributes.getFloat(index, this.f11050);
                } else if (index == C2724.C2725.f12678) {
                    this.f11048 = obtainStyledAttributes.getFloat(index, this.f11048);
                } else if (index == C2724.C2725.f12659) {
                    this.f11051 = obtainStyledAttributes.getFloat(index, this.f11051);
                } else if (index == C2724.C2725.f12723) {
                    this.f11048 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2512.C2513(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2426();
    }

    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2426(getContext(), attributeSet);
    }
}
