package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import o.C1483;

/* renamed from: o.ґ  reason: contains not printable characters */
public class C2675 {

    /* renamed from: ı  reason: contains not printable characters */
    public C1483.C1484 f12314;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2328 f12315;

    /* renamed from: ǃ  reason: contains not printable characters */
    PopupWindow.OnDismissListener f12316;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f12317;

    /* renamed from: ɩ  reason: contains not printable characters */
    public View f12318;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final boolean f12319;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final PopupWindow.OnDismissListener f12320;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f12321;

    /* renamed from: ι  reason: contains not printable characters */
    public C2168 f12322;

    /* renamed from: І  reason: contains not printable characters */
    private final int f12323;

    /* renamed from: і  reason: contains not printable characters */
    private final Context f12324;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f12325;

    public C2675(Context context, C2328 r9, View view, boolean z) {
        this(context, r9, view, z, R.attr.f148412130968607, 0);
    }

    public C2675(Context context, C2328 r3, View view, boolean z, int i, int i2) {
        this.f12317 = 8388611;
        this.f12320 = new PopupWindow.OnDismissListener() {
            public final void onDismiss() {
                C2675.this.m14218();
            }
        };
        this.f12324 = context;
        this.f12315 = r3;
        this.f12318 = view;
        this.f12319 = z;
        this.f12323 = i;
        this.f12325 = i2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14217() {
        this.f12317 = 8388613;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [o.ϲ] */
    /* JADX WARNING: type inference failed for: r7v1, types: [o.х] */
    /* JADX WARNING: type inference failed for: r1v13, types: [o.ͻ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2168 m14220() {
        /*
            r14 = this;
            o.ϲ r0 = r14.f12322
            if (r0 != 0) goto L_0x0083
            android.content.Context r0 = r14.f12324
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f12324
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0051
            o.ͻ r0 = new o.ͻ
            android.content.Context r2 = r14.f12324
            android.view.View r3 = r14.f12318
            int r4 = r14.f12323
            int r5 = r14.f12325
            boolean r6 = r14.f12319
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0051:
            o.х r0 = new o.х
            android.content.Context r8 = r14.f12324
            o.Ј r9 = r14.f12315
            android.view.View r10 = r14.f12318
            int r11 = r14.f12323
            int r12 = r14.f12325
            boolean r13 = r14.f12319
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0063:
            o.Ј r1 = r14.f12315
            r0.m11486((o.C2328) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f12320
            r0.m11482((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f12318
            r0.m11481((android.view.View) r1)
            o.ɻ$ǃ r1 = r14.f12314
            r0.m8865((o.C1483.C1484) r1)
            boolean r1 = r14.f12321
            r0.m11483((boolean) r1)
            int r1 = r14.f12317
            r0.m11480((int) r1)
            r14.f12322 = r0
        L_0x0083:
            o.ϲ r0 = r14.f12322
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2675.m14220():o.ϲ");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14219(int i, int i2, boolean z, boolean z2) {
        C2168 r0 = m14220();
        r0.m11489(z2);
        if (z) {
            if ((C2409.m12455(this.f12317, C0293.m4156(this.f12318)) & 7) == 5) {
                i -= this.f12318.getWidth();
            }
            r0.m11485(i);
            r0.m11488(i2);
            int i3 = (int) ((this.f12324.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            r0.f10332 = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        r0.b_();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14218() {
        this.f12322 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f12316;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14215() {
        C2168 r0 = this.f12322;
        if (r0 != null && r0.m11819()) {
            return true;
        }
        if (this.f12318 == null) {
            return false;
        }
        m14219(0, 0, false, false);
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14216() {
        C2168 r0 = this.f12322;
        if (r0 != null && r0.m11819()) {
            this.f12322.m11820();
        }
    }
}
