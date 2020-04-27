package o;

import android.view.View;
import android.view.WindowId;
import o.C0712;

/* renamed from: o.ъ  reason: contains not printable characters */
class C2508 implements C0712.C0713 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final WindowId f11324;

    C2508(View view) {
        this.f11324 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2508) && ((C2508) obj).f11324.equals(this.f11324);
    }

    public int hashCode() {
        return this.f11324.hashCode();
    }
}
