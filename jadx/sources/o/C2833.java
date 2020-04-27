package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import o.C2895;

/* renamed from: o.Ӏг  reason: contains not printable characters */
public final class C2833 extends RecyclerView.C3243aUx {

    /* renamed from: ı  reason: contains not printable characters */
    If f13263 = new If();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final LinearLayoutManager f13264 = ((LinearLayoutManager) this.f13271.getLayoutManager());

    /* renamed from: ǃ  reason: contains not printable characters */
    C2895.C2898 f13265;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f13266;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f13267;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f13268;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f13269;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2895 f13270;

    /* renamed from: І  reason: contains not printable characters */
    private final RecyclerView f13271 = this.f13270.f13479;

    /* renamed from: і  reason: contains not printable characters */
    private int f13272;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f13273;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f13274;

    C2833(C2895 r1) {
        this.f13270 = r1;
        m14778();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14778() {
        this.f13272 = 0;
        this.f13266 = 0;
        If ifR = this.f13263;
        ifR.f13277 = -1;
        ifR.f13276 = 0.0f;
        ifR.f13275 = 0;
        this.f13273 = -1;
        this.f13267 = -1;
        this.f13274 = false;
        this.f13268 = false;
        this.f13269 = false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14780(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f13272 == 1 && this.f13266 == 1) && i == 1) {
            this.f13272 = 1;
            int i2 = this.f13267;
            if (i2 != -1) {
                this.f13273 = i2;
                this.f13267 = -1;
            } else if (this.f13273 == -1) {
                this.f13273 = this.f13264.m297();
            }
            m14779(1);
            return;
        }
        int i3 = this.f13272;
        if (!(i3 == 1 || i3 == 4) || i != 2) {
            int i4 = this.f13272;
            if ((i4 == 1 || i4 == 4) && i == 0) {
                m14781();
                if (!this.f13268) {
                    if (this.f13263.f13277 != -1) {
                        int i5 = this.f13263.f13277;
                        C2895.C2898 r2 = this.f13265;
                        if (r2 != null) {
                            r2.m15020(i5, 0.0f, 0);
                        }
                    }
                } else if (this.f13263.f13275 != 0) {
                    z = false;
                } else if (this.f13273 != this.f13263.f13277) {
                    int i6 = this.f13263.f13277;
                    C2895.C2898 r22 = this.f13265;
                    if (r22 != null) {
                        r22.m15021(i6);
                    }
                }
                if (z) {
                    m14779(0);
                    m14778();
                }
            }
            if (this.f13272 == 2 && i == 0 && this.f13269) {
                m14781();
                if (this.f13263.f13275 == 0) {
                    if (this.f13267 != this.f13263.f13277) {
                        int i7 = this.f13263.f13277 == -1 ? 0 : this.f13263.f13277;
                        C2895.C2898 r8 = this.f13265;
                        if (r8 != null) {
                            r8.m15021(i7);
                        }
                    }
                    m14779(0);
                    m14778();
                }
            }
        } else if (this.f13268) {
            m14779(2);
            this.f13274 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r6 < 0) == (o.C0293.m4156(r4.f13270.f13470.f349) == 1)) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14783(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f13268 = r5
            r4.m14781()
            boolean r0 = r4.f13274
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x004e
            r4.f13274 = r2
            if (r7 > 0) goto L_0x002b
            if (r7 != 0) goto L_0x0029
            if (r6 >= 0) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            o.ӏɹ r7 = r4.f13270
            androidx.recyclerview.widget.LinearLayoutManager r7 = r7.f13470
            androidx.recyclerview.widget.RecyclerView r7 = r7.f349
            int r7 = o.C0293.m4156(r7)
            if (r7 != r5) goto L_0x0025
            r7 = 1
            goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            if (r6 != r7) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = 0
            goto L_0x002c
        L_0x002b:
            r6 = 1
        L_0x002c:
            if (r6 == 0) goto L_0x003a
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13275
            if (r6 == 0) goto L_0x003a
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
            int r6 = r6 + r5
            goto L_0x003e
        L_0x003a:
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
        L_0x003e:
            r4.f13267 = r6
            int r6 = r4.f13273
            int r7 = r4.f13267
            if (r6 == r7) goto L_0x0060
            o.ӏɹ$ɩ r6 = r4.f13265
            if (r6 == 0) goto L_0x0060
            r6.m15021(r7)
            goto L_0x0060
        L_0x004e:
            int r6 = r4.f13272
            if (r6 != 0) goto L_0x0060
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
            if (r6 != r1) goto L_0x0059
            r6 = 0
        L_0x0059:
            o.ӏɹ$ɩ r7 = r4.f13265
            if (r7 == 0) goto L_0x0060
            r7.m15021(r6)
        L_0x0060:
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
            if (r6 != r1) goto L_0x0068
            r6 = 0
            goto L_0x006c
        L_0x0068:
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
        L_0x006c:
            o.Ӏг$If r7 = r4.f13263
            float r7 = r7.f13276
            o.Ӏг$If r0 = r4.f13263
            int r0 = r0.f13275
            o.ӏɹ$ɩ r3 = r4.f13265
            if (r3 == 0) goto L_0x007b
            r3.m15020(r6, r7, r0)
        L_0x007b:
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13277
            int r7 = r4.f13267
            if (r6 == r7) goto L_0x0085
            if (r7 != r1) goto L_0x0095
        L_0x0085:
            o.Ӏг$If r6 = r4.f13263
            int r6 = r6.f13275
            if (r6 != 0) goto L_0x0095
            int r6 = r4.f13266
            if (r6 == r5) goto L_0x0095
            r4.m14779(r2)
            r4.m14778()
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2833.m14783(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14781() {
        int i;
        If ifR = this.f13263;
        ifR.f13277 = this.f13264.m297();
        float f = 0.0f;
        if (ifR.f13277 == -1) {
            ifR.f13277 = -1;
            ifR.f13276 = 0.0f;
            ifR.f13275 = 0;
            return;
        }
        View r1 = this.f13264.m411(ifR.f13277);
        if (r1 == null) {
            ifR.f13277 = -1;
            ifR.f13276 = 0.0f;
            ifR.f13275 = 0;
            return;
        }
        int r3 = LinearLayoutManager.m384(r1);
        int r5 = LinearLayoutManager.m382(r1);
        int r6 = LinearLayoutManager.m383(r1);
        int r7 = LinearLayoutManager.m393(r1);
        ViewGroup.LayoutParams layoutParams = r1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            r3 += marginLayoutParams.leftMargin;
            r5 += marginLayoutParams.rightMargin;
            r6 += marginLayoutParams.topMargin;
            r7 += marginLayoutParams.bottomMargin;
        }
        int height = r1.getHeight() + r6 + r7;
        int width = r5 + r1.getWidth() + r3;
        if (this.f13264.f290 == 0) {
            i = (r1.getLeft() - r3) - this.f13271.getPaddingLeft();
            if (C0293.m4156(this.f13270.f13470.f349) == 1) {
                i = -i;
            }
        } else {
            i = (r1.getTop() - r6) - this.f13271.getPaddingTop();
            width = height;
        }
        ifR.f13275 = -i;
        if (ifR.f13275 >= 0) {
            if (width != 0) {
                f = ((float) ifR.f13275) / ((float) width);
            }
            ifR.f13276 = f;
        } else if (new C2791(this.f13264).m14706()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(ifR.f13275)}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m14782(int i, boolean z) {
        C2895.C2898 r3;
        this.f13272 = z ? 2 : 3;
        boolean z2 = this.f13267 != i;
        this.f13267 = i;
        m14779(2);
        if (z2 && (r3 = this.f13265) != null) {
            r3.m15021(i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m14779(int i) {
        if ((this.f13272 != 3 || this.f13266 != 0) && this.f13266 != i) {
            this.f13266 = i;
            C2895.C2898 r0 = this.f13265;
            if (r0 != null) {
                r0.m15022(i);
            }
        }
    }

    /* renamed from: o.Ӏг$If */
    static final class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f13275;

        /* renamed from: Ι  reason: contains not printable characters */
        float f13276;

        /* renamed from: ι  reason: contains not printable characters */
        int f13277;

        If() {
        }
    }
}
