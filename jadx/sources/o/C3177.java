package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: o.ջ  reason: contains not printable characters */
public final class C3177 {

    /* renamed from: ı  reason: contains not printable characters */
    WeakReference<If> f14431 = new WeakReference<>((Object) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f14432 = true;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0413 f14433 = new C0413() {
        /* renamed from: ı  reason: contains not printable characters */
        public final void m16031(Typeface typeface, boolean z) {
            if (!z) {
                C3177 r1 = C3177.this;
                r1.f14432 = true;
                If ifR = r1.f14431.get();
                if (ifR != null) {
                    ifR.m16033();
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m16032(int i) {
            C3177 r2 = C3177.this;
            r2.f14432 = true;
            If ifR = r2.f14431.get();
            if (ifR != null) {
                ifR.m16033();
            }
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public float f14434;

    /* renamed from: ι  reason: contains not printable characters */
    public final TextPaint f14435 = new TextPaint(1);

    /* renamed from: і  reason: contains not printable characters */
    public C0303 f14436;

    /* renamed from: o.ջ$If */
    public interface If {
        int[] getState();

        boolean onStateChange(int[] iArr);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m16033();
    }

    public C3177(If ifR) {
        this.f14431 = new WeakReference<>(ifR);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16030(C0303 r3, Context context) {
        if (this.f14436 != r3) {
            this.f14436 = r3;
            if (r3 != null) {
                r3.m4293(context, this.f14435, this.f14433);
                If ifR = this.f14431.get();
                if (ifR != null) {
                    this.f14435.drawableState = ifR.getState();
                }
                r3.m4291(context, this.f14435, this.f14433);
                this.f14432 = true;
            }
            If ifR2 = this.f14431.get();
            if (ifR2 != null) {
                ifR2.m16033();
                ifR2.onStateChange(ifR2.getState());
            }
        }
    }
}
