package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* renamed from: o.о  reason: contains not printable characters */
class C2454 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: ɨ  reason: contains not printable characters */
    private static C2454 f11117;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static C2454 f11118;

    /* renamed from: ı  reason: contains not printable characters */
    private final CharSequence f11119;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f11120;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Runnable f11121 = new Runnable() {
        public void run() {
            C2454.this.m12595(false);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    private final View f11122;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C2212 f11123;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Runnable f11124 = new Runnable() {
        public void run() {
            C2454.this.m12594();
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private final int f11125;

    /* renamed from: І  reason: contains not printable characters */
    private int f11126;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f11127;

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m12590(View view, CharSequence charSequence) {
        C2454 r0 = f11118;
        if (r0 != null && r0.f11122 == view) {
            m12591((C2454) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C2454 r3 = f11117;
            if (r3 != null && r3.f11122 == view) {
                r3.m12594();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C2454(view, charSequence);
    }

    private C2454(View view, CharSequence charSequence) {
        this.f11122 = view;
        this.f11119 = charSequence;
        this.f11125 = C0297.m4263(ViewConfiguration.get(this.f11122.getContext()));
        m12593();
        this.f11122.setOnLongClickListener(this);
        this.f11122.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.f11126 = view.getWidth() / 2;
        this.f11120 = view.getHeight() / 2;
        m12595(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f11123 != null && this.f11127) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f11122.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m12593();
                m12594();
            }
        } else if (this.f11122.isEnabled() && this.f11123 == null && m12592(motionEvent)) {
            m12591(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        m12594();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12595(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        if (C0293.m4187(this.f11122)) {
            m12591((C2454) null);
            C2454 r1 = f11117;
            if (r1 != null) {
                r1.m12594();
            }
            f11117 = this;
            this.f11127 = z;
            this.f11123 = new C2212(this.f11122.getContext());
            C2212 r12 = this.f11123;
            View view = this.f11122;
            int i4 = this.f11126;
            int i5 = this.f11120;
            boolean z2 = this.f11127;
            CharSequence charSequence = this.f11119;
            if (r12.f10478.getParent() != null) {
                if (r12.f10478.getParent() != null) {
                    ((WindowManager) r12.f10477.getSystemService("window")).removeView(r12.f10478);
                }
            }
            r12.f10476.setText(charSequence);
            WindowManager.LayoutParams layoutParams = r12.f10479;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = r12.f10477.getResources().getDimensionPixelOffset(R.dimen.f159432131165542);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = r12.f10477.getResources().getDimensionPixelOffset(R.dimen.f159422131165541);
                i = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = r12.f10477.getResources().getDimensionPixelOffset(z2 ? R.dimen.f159452131165545 : R.dimen.f159442131165544);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(r12.f10475);
                if (r12.f10475.left < 0 && r12.f10475.top < 0) {
                    Resources resources = r12.f10477.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", C3273am.f1518);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    r12.f10475.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(r12.f10480);
                view.getLocationOnScreen(r12.f10481);
                int[] iArr = r12.f10481;
                iArr[0] = iArr[0] - r12.f10480[0];
                int[] iArr2 = r12.f10481;
                iArr2[1] = iArr2[1] - r12.f10480[1];
                layoutParams.x = (r12.f10481[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                r12.f10478.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = r12.f10478.getMeasuredHeight();
                int i6 = ((r12.f10481[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = r12.f10481[1] + i + dimensionPixelOffset3;
                if (z2) {
                    if (i6 < 0) {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= r12.f10475.height()) {
                    layoutParams.y = i7;
                }
                layoutParams.y = i6;
            }
            ((WindowManager) r12.f10477.getSystemService("window")).addView(r12.f10478, r12.f10479);
            this.f11122.addOnAttachStateChangeListener(this);
            if (this.f11127) {
                j = 2500;
            } else {
                if ((C0293.m4189(this.f11122) & 1) == 1) {
                    j2 = 3000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i3);
            }
            this.f11122.removeCallbacks(this.f11124);
            this.f11122.postDelayed(this.f11124, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m12594() {
        if (f11117 == this) {
            f11117 = null;
            C2212 r0 = this.f11123;
            if (r0 != null) {
                if (r0.f10478.getParent() != null) {
                    ((WindowManager) r0.f10477.getSystemService("window")).removeView(r0.f10478);
                }
                this.f11123 = null;
                m12593();
                this.f11122.removeOnAttachStateChangeListener(this);
            }
        }
        if (f11118 == this) {
            m12591((C2454) null);
        }
        this.f11122.removeCallbacks(this.f11124);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m12591(C2454 r1) {
        C2454 r0 = f11118;
        if (r0 != null) {
            r0.m12588();
        }
        f11118 = r1;
        if (r1 != null) {
            f11118.m12589();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m12589() {
        this.f11122.postDelayed(this.f11121, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m12588() {
        this.f11122.removeCallbacks(this.f11121);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m12592(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f11126) <= this.f11125 && Math.abs(y - this.f11120) <= this.f11125) {
            return false;
        }
        this.f11126 = x;
        this.f11120 = y;
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m12593() {
        this.f11126 = Integer.MAX_VALUE;
        this.f11120 = Integer.MAX_VALUE;
    }
}
