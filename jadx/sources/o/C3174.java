package o;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: o.չ  reason: contains not printable characters */
public final class C3174 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m16027(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R.id.f167622131362370);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0293.m4215(viewGroup) == null) ? false : true;
    }
}
