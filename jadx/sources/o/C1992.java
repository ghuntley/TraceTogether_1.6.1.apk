package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: o.ιɩ  reason: contains not printable characters */
public final class C1992 {

    /* renamed from: ı  reason: contains not printable characters */
    TypedValue f9933;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final TypedArray f9934;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Context f9935;

    public C1992(Context context, TypedArray typedArray) {
        this.f9935 = context;
        this.f9934 = typedArray;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Drawable m10793(int i) {
        int resourceId;
        if (!this.f9934.hasValue(i) || (resourceId = this.f9934.getResourceId(i, 0)) == 0) {
            return this.f9934.getDrawable(i);
        }
        return C3257Con.m1345(this.f9935, resourceId);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Drawable m10794(int i) {
        int resourceId;
        if (!this.f9934.hasValue(i) || (resourceId = this.f9934.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1641.m9449().m9453(this.f9935, resourceId, true);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final ColorStateList m10792(int i) {
        int resourceId;
        ColorStateList r0;
        if (!this.f9934.hasValue(i) || (resourceId = this.f9934.getResourceId(i, 0)) == 0 || (r0 = C3257Con.m1342(this.f9935, resourceId)) == null) {
            return this.f9934.getColorStateList(i);
        }
        return r0;
    }
}
