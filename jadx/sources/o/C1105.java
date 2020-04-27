package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.C2328;

/* renamed from: o.ɔ  reason: contains not printable characters */
public final class C1105 extends ListView implements C2328.If, C1429, AdapterView.OnItemClickListener {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int[] f6564 = {16842964, 16843049};

    /* renamed from: ι  reason: contains not printable characters */
    private C2328 f6565;

    public C1105(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public C1105(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(attributeSet, f6564, i, 0));
        if (r1.f9934.hasValue(0)) {
            setBackgroundDrawable(r1.m10793(0));
        }
        if (r1.f9934.hasValue(1)) {
            setDivider(r1.m10793(1));
        }
        r1.f9934.recycle();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7496(C2328 r1) {
        this.f6565 = r1;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m7497(C2459 r4) {
        return this.f6565.m12143(r4, (C1483) null, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f6565.m12143((C2459) getAdapter().getItem(i), (C1483) null, 0);
    }
}
