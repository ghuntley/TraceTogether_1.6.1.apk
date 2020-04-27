package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.C1483;

/* renamed from: o.х  reason: contains not printable characters */
final class C2473 extends C2168 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: ŀ  reason: contains not printable characters */
    private ViewTreeObserver f11248;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f11249;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final boolean f11250;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2328 f11251;

    /* renamed from: ȷ  reason: contains not printable characters */
    private View f11252;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f11253;

    /* renamed from: ɨ  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f11254;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f11255;

    /* renamed from: ɪ  reason: contains not printable characters */
    private View f11256;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f11257;

    /* renamed from: ɾ  reason: contains not printable characters */
    private C1483.C1484 f11258;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f11259;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f11260 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f11261 = this;

    /* renamed from: ι  reason: contains not printable characters */
    final C0445 f11262;

    /* renamed from: І  reason: contains not printable characters */
    private final int f11263;

    /* renamed from: г  reason: contains not printable characters */
    private int f11264;

    /* renamed from: і  reason: contains not printable characters */
    private final C1487 f11265;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f11266;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f11267 = this;

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12731() {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12733(Parcelable parcelable) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12734(C2328 r1) {
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m12737() {
        return null;
    }

    public C2473(Context context, C2328 r5, View view, int i, int i2, boolean z) {
        this.f11255 = context;
        this.f11251 = r5;
        this.f11250 = z;
        this.f11265 = new C1487(r5, LayoutInflater.from(context), this.f11250, R.layout.f168782131558419);
        this.f11266 = i;
        this.f11263 = i2;
        Resources resources = context.getResources();
        this.f11257 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f157682131165207));
        this.f11256 = view;
        this.f11262 = new C0445(this.f11255, this.f11266, this.f11263);
        r5.f10807.add(new WeakReference(this));
        m8873(context, r5);
        r5.f10817 = true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12730(boolean z) {
        this.f11265.f7945 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12725(int i) {
        this.f11260 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12738() {
        if (m12735()) {
            this.f11262.m15373();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12735() {
        return !this.f11259 && this.f11262.m15364();
    }

    public final void onDismiss() {
        this.f11259 = true;
        this.f11251.close();
        ViewTreeObserver viewTreeObserver = this.f11248;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f11248 = this.f11252.getViewTreeObserver();
            }
            this.f11248.removeGlobalOnLayoutListener(this.f11261);
            this.f11248 = null;
        }
        this.f11252.removeOnAttachStateChangeListener(this.f11267);
        PopupWindow.OnDismissListener onDismissListener = this.f11254;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12741(boolean z) {
        this.f11249 = false;
        C1487 r1 = this.f11265;
        if (r1 != null) {
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12728(C1483.C1484 r1) {
        this.f11258 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12740(o.C1653 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x008c
            o.ґ r0 = new o.ґ
            android.content.Context r3 = r9.f11255
            android.view.View r5 = r9.f11252
            boolean r6 = r9.f11250
            int r7 = r9.f11266
            int r8 = r9.f11263
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.ɻ$ǃ r2 = r9.f11258
            r0.f12314 = r2
            o.ϲ r3 = r0.f12322
            if (r3 == 0) goto L_0x0025
            o.ϲ r3 = r0.f12322
            r3.m8865((o.C1483.C1484) r2)
        L_0x0025:
            boolean r2 = o.C2168.m11478((o.C2328) r10)
            r0.f12321 = r2
            o.ϲ r3 = r0.f12322
            if (r3 == 0) goto L_0x0034
            o.ϲ r3 = r0.f12322
            r3.m11483((boolean) r2)
        L_0x0034:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f11254
            r0.f12316 = r2
            r2 = 0
            r9.f11254 = r2
            o.Ј r2 = r9.f11251
            r2.m12133(r1)
            o.ıӀ r2 = r9.f11262
            int r2 = r2.m15361()
            o.ıӀ r3 = r9.f11262
            int r3 = r3.m15355()
            int r4 = r9.f11260
            android.view.View r5 = r9.f11256
            int r5 = o.C0293.m4156(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0064
            android.view.View r4 = r9.f11256
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0064:
            o.ϲ r4 = r0.f12322
            r5 = 1
            if (r4 == 0) goto L_0x0073
            o.ϲ r4 = r0.f12322
            boolean r4 = r4.m11819()
            if (r4 == 0) goto L_0x0073
            r4 = 1
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            if (r4 == 0) goto L_0x0078
        L_0x0076:
            r0 = 1
            goto L_0x0082
        L_0x0078:
            android.view.View r4 = r0.f12318
            if (r4 != 0) goto L_0x007e
            r0 = 0
            goto L_0x0082
        L_0x007e:
            r0.m14219(r2, r3, r5, r5)
            goto L_0x0076
        L_0x0082:
            if (r0 == 0) goto L_0x008c
            o.ɻ$ǃ r0 = r9.f11258
            if (r0 == 0) goto L_0x008b
            r0.m8877(r10)
        L_0x008b:
            return r5
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2473.m12740(o.ʕ):boolean");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12729(C2328 r2, boolean z) {
        if (r2 == this.f11251) {
            m12738();
            C1483.C1484 r0 = this.f11258;
            if (r0 != null) {
                r0.m8876(r2, z);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12726(View view) {
        this.f11256 = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m12738();
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12727(PopupWindow.OnDismissListener onDismissListener) {
        this.f11254 = onDismissListener;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final ListView m12742() {
        return this.f11262.m15384();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12732(int i) {
        this.f11262.m15363(i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12736(int i) {
        this.f11262.m15374(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12739(boolean z) {
        this.f11253 = z;
    }

    public final void b_() {
        View view;
        boolean z = true;
        if (!m12735()) {
            if (this.f11259 || (view = this.f11256) == null) {
                z = false;
            } else {
                this.f11252 = view;
                this.f11262.m15376((PopupWindow.OnDismissListener) this);
                this.f11262.m15379((AdapterView.OnItemClickListener) this);
                this.f11262.m15380(true);
                View view2 = this.f11252;
                boolean z2 = this.f11248 == null;
                this.f11248 = view2.getViewTreeObserver();
                if (z2) {
                    this.f11248.addOnGlobalLayoutListener(this.f11261);
                }
                view2.addOnAttachStateChangeListener(this.f11267);
                this.f11262.m15369(view2);
                this.f11262.m15362(this.f11260);
                if (!this.f11249) {
                    this.f11264 = m11479(this.f11265, (ViewGroup) null, this.f11255, this.f11257);
                    this.f11249 = true;
                }
                this.f11262.m15385(this.f11264);
                this.f11262.m15371(2);
                this.f11262.m15375(this.f10332);
                this.f11262.b_();
                ListView r0 = this.f11262.m15384();
                r0.setOnKeyListener(this);
                if (this.f11253 && this.f11251.f10801 != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f11255).inflate(R.layout.f168772131558418, r0, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f11251.f10801);
                    }
                    frameLayout.setEnabled(false);
                    r0.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f11262.m15357((ListAdapter) this.f11265);
                this.f11262.b_();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void onGlobalLayout() {
        if (m12735() && !this.f11262.m15382()) {
            View view = this.f11252;
            if (view == null || !view.isShown()) {
                m12738();
            } else {
                this.f11262.b_();
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f11248;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f11248 = view.getViewTreeObserver();
            }
            this.f11248.removeGlobalOnLayoutListener(this.f11261);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
