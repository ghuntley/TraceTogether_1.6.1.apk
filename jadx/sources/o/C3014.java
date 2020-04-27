package o;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: o.Դ  reason: contains not printable characters */
public final class C3014 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private Object f13904;

    private C3014(Object obj) {
        this.f13904 = obj;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m15448() {
        return this.f13904;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3014 m15447(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C3014(PointerIcon.getSystemIcon(context, i));
        }
        return new C3014((Object) null);
    }
}
