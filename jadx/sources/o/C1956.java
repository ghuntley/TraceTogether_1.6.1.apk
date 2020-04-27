package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.ιƗ  reason: contains not printable characters */
public class C1956 {

    /* renamed from: ı  reason: contains not printable characters */
    private View f9843;

    /* renamed from: ǃ  reason: contains not printable characters */
    ViewGroup f9844;

    /* renamed from: Ι  reason: contains not printable characters */
    int f9845 = -1;

    public C1956(ViewGroup viewGroup, View view) {
        this.f9844 = viewGroup;
        this.f9843 = view;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10681() {
        if (this.f9845 > 0 || this.f9843 != null) {
            this.f9844.removeAllViews();
            if (this.f9845 > 0) {
                LayoutInflater.from((Context) null).inflate(this.f9845, this.f9844);
            } else {
                this.f9844.addView(this.f9843);
            }
        }
        this.f9844.setTag(R.id.f167902131362406, this);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m10680(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.f167902131362406, (Object) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1956 m10679(ViewGroup viewGroup) {
        return (C1956) viewGroup.getTag(R.id.f167902131362406);
    }
}
