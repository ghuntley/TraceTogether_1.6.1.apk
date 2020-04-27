package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o.łǃ  reason: contains not printable characters */
public final class C0533 extends ClickableSpan {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f4362;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f4363;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0520 f4364;

    public C0533(int i, C0520 r2, int i2) {
        this.f4362 = i;
        this.f4364 = r2;
        this.f4363 = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4362);
        this.f4364.m5061(this.f4363, bundle);
    }
}
