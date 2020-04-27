package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.C0432;

/* renamed from: o.ҁ  reason: contains not printable characters */
public class C2660 extends FrameLayout implements C0432 {

    /* renamed from: Ι  reason: contains not printable characters */
    private C0432.Cif f12245;

    public C2660(Context context) {
        super(context);
    }

    public C2660(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0432.Cif ifVar) {
        this.f12245 = ifVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0432.Cif ifVar = this.f12245;
        if (ifVar != null) {
            ifVar.m4732(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
