package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import o.C1841;
import o.C3616p;

/* renamed from: o.Ӷ  reason: contains not printable characters */
class C2932 implements C3616p.C0270 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m15134() {
    }

    C2932() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15141(C1841.C1842 r1, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        r1.m10192(new C0448(colorStateList, f));
        View r2 = r1.m10189();
        r2.setClipToOutline(true);
        r2.setElevation(f2);
        m15131(r1, f3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m15137(C1841.C1842 r1, float f) {
        m15129(r1).m4751(f);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m15131(C1841.C1842 r4, float f) {
        m15129(r4).m4754(f, r4.m10193(), r4.m10195());
        m15138(r4);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public float m15130(C1841.C1842 r1) {
        return m15129(r1).m4753();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public float m15142(C1841.C1842 r2) {
        return m15133(r2) * 2.0f;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public float m15136(C1841.C1842 r2) {
        return m15133(r2) * 2.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public float m15133(C1841.C1842 r1) {
        return m15129(r1).m4755();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15140(C1841.C1842 r1, float f) {
        r1.m10189().setElevation(f);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public float m15139(C1841.C1842 r1) {
        return r1.m10189().getElevation();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m15138(C1841.C1842 r5) {
        if (!r5.m10193()) {
            r5.m10191(0, 0, 0, 0);
            return;
        }
        float r0 = m15130(r5);
        float r1 = m15133(r5);
        int ceil = (int) Math.ceil((double) C0624.m5334(r0, r1, r5.m10195()));
        int ceil2 = (int) Math.ceil((double) C0624.m5333(r0, r1, r5.m10195()));
        r5.m10191(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m15144(C1841.C1842 r2) {
        m15131(r2, m15130(r2));
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m15143(C1841.C1842 r2) {
        m15131(r2, m15130(r2));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m15135(C1841.C1842 r1, ColorStateList colorStateList) {
        m15129(r1).m4752(colorStateList);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public ColorStateList m15132(C1841.C1842 r1) {
        return m15129(r1).m4750();
    }

    /* renamed from: і  reason: contains not printable characters */
    private C0448 m15129(C1841.C1842 r1) {
        return (C0448) r1.m10194();
    }
}
