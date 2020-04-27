package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import o.C0432;

/* renamed from: o.ıІ  reason: contains not printable characters */
public class C0404 extends LinearLayout implements C0432 {

    /* renamed from: ι  reason: contains not printable characters */
    private C0432.Cif f3962;

    public C0404(Context context) {
        super(context);
    }

    public C0404(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0432.Cif ifVar) {
        this.f3962 = ifVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0432.Cif ifVar = this.f3962;
        if (ifVar != null) {
            ifVar.m4732(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
