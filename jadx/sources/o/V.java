package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/V;", "Landroid/content/Context;", "p0", "", "p1", "", "ɩ", "(Landroid/content/Context;F)I", "ǃ", "(Landroid/content/Context;I)I", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public final class V {

    /* renamed from: ι  reason: contains not printable characters */
    public static final V f1331 = new V();

    private V() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m1424(Context context, int i) {
        fM.m2254(context, "");
        Resources resources = context.getResources();
        fM.m2252((Object) resources, "");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m1425(Context context, float f) {
        fM.m2254(context, "");
        Resources resources = context.getResources();
        fM.m2252((Object) resources, "");
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
