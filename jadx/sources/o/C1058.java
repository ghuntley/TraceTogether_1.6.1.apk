package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.C1429;
import o.C1483;

/* renamed from: o.ɍ  reason: contains not printable characters */
public abstract class C1058 implements C1483 {

    /* renamed from: ı  reason: contains not printable characters */
    public C1483.C1484 f6330;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private LayoutInflater f6331;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Context f6332;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1429 f6333;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f6334 = R.layout.f168612131558402;

    /* renamed from: Ι  reason: contains not printable characters */
    public Context f6335;

    /* renamed from: ι  reason: contains not printable characters */
    public C2328 f6336;

    /* renamed from: І  reason: contains not printable characters */
    private int f6337 = R.layout.f168622131558403;

    /* renamed from: і  reason: contains not printable characters */
    public int f6338;

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7307() {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7309(C2459 r1) {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m7311(C2459 r1) {
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m7316(C2459 r1, C1429.C1430 r2);

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m7318(C2459 r1) {
        return false;
    }

    public C1058(Context context) {
        this.f6332 = context;
        this.f6331 = LayoutInflater.from(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7315(Context context, C2328 r2) {
        this.f6335 = context;
        LayoutInflater.from(this.f6335);
        this.f6336 = r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1429 m7313(ViewGroup viewGroup) {
        if (this.f6333 == null) {
            this.f6333 = (C1429) this.f6331.inflate(this.f6337, viewGroup, false);
            this.f6333.m8661(this.f6336);
            m7317(true);
        }
        return this.f6333;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7317(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f6333;
        if (viewGroup != null) {
            C2328 r0 = this.f6336;
            int i = 0;
            if (r0 != null) {
                r0.m12144();
                ArrayList<C2459> r02 = this.f6336.m12145();
                int size = r02.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C2459 r5 = r02.get(i3);
                    if (m7311(r5)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C2459 r7 = childAt instanceof C1429.C1430 ? ((C1429.C1430) childAt).m8663() : null;
                        View r8 = m7312(r5, childAt, viewGroup);
                        if (r5 != r7) {
                            r8.setPressed(false);
                            r8.jumpDrawablesToCurrentState();
                        }
                        if (r8 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) r8.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(r8);
                            }
                            ((ViewGroup) this.f6333).addView(r8, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!m7308(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m7308(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7305(C1483.C1484 r1) {
        this.f6330 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public View m7312(C2459 r3, View view, ViewGroup viewGroup) {
        C1429.C1430 r4;
        if (view instanceof C1429.C1430) {
            r4 = (C1429.C1430) view;
        } else {
            r4 = (C1429.C1430) this.f6331.inflate(this.f6334, viewGroup, false);
        }
        m7316(r3, r4);
        return (View) r4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m7306(C2328 r2, boolean z) {
        C1483.C1484 r0 = this.f6330;
        if (r0 != null) {
            r0.m8876(r2, z);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m7314(C1653 r2) {
        C1483.C1484 r0 = this.f6330;
        if (r0 != null) {
            return r0.m8877(r2);
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m7310() {
        return this.f6338;
    }
}
