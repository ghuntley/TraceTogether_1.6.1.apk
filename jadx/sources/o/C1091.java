package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ɐı  reason: contains not printable characters */
public class C1091 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0910<String, C1121> f6498 = new C0910<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0910<String, PropertyValuesHolder[]> f6499 = new C0910<>();

    /* renamed from: ı  reason: contains not printable characters */
    private static PropertyValuesHolder[] m7457(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m7461() {
        int size = this.f6498.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1121 r4 = (C1121) this.f6498.f5784[(i << 1) + 1];
            j = Math.max(j, r4.f6630 + r4.f6632);
        }
        return j;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1091 m7459(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m7458(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m7458(arrayList);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C1091 m7458(List<Animator> list) {
        C1091 r0 = new C1091();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m7456(r0, list.get(i));
        }
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m7456(C1091 r3, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            r3.f6499.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            r3.f6498.put(objectAnimator.getPropertyName(), C1121.m7541((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1091)) {
            return false;
        }
        return this.f6498.equals(((C1091) obj).f6498);
    }

    public int hashCode() {
        return this.f6498.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f6498);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1121 m7460(String str) {
        if (this.f6498.get(str) != null) {
            return this.f6498.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final PropertyValuesHolder[] m7462(String str) {
        if (this.f6499.get(str) != null) {
            return m7457(this.f6499.get(str));
        }
        throw new IllegalArgumentException();
    }
}
