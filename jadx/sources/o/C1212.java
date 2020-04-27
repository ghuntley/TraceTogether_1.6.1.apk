package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C1250;

/* renamed from: o.ɨɩ  reason: contains not printable characters */
public abstract class C1212 extends C2449 {

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final C1250.Cif<C0520> f6872 = new C1250.Cif<C0520>() {
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m7868(Object obj, Rect rect) {
            ((C0520) obj).m5056(rect);
        }
    };

    /* renamed from: ɨ  reason: contains not printable characters */
    private static final C1250.If<C1286<C0520>, C0520> f6873 = new C1250.If<C1286<C0520>, C0520>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ int m7869(Object obj) {
            return ((C1286) obj).m8210();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ Object m7870(Object obj, int i) {
            return (C0520) ((C1286) obj).m8218(i);
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Rect f6874 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: ı  reason: contains not printable characters */
    public int f6875 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final View f6876;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f6877 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f6878 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Cif f6879;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final AccessibilityManager f6880;

    /* renamed from: ι  reason: contains not printable characters */
    private final Rect f6881 = new Rect();

    /* renamed from: І  reason: contains not printable characters */
    private final Rect f6882 = new Rect();

    /* renamed from: і  reason: contains not printable characters */
    private final Rect f6883 = new Rect();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int[] f6884 = new int[2];

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m7852(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7853(C0520 r1) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m7854(int i, C0520 r2);

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7855(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m7864(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m7866(List<Integer> list);

    public C1212(View view) {
        if (view != null) {
            this.f6876 = view;
            this.f6880 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0293.m4217(view) == 0) {
                C0293.m4203(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0577 m7861(View view) {
        if (this.f6879 == null) {
            this.f6879 = new Cif();
        }
        return this.f6879;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m7867(MotionEvent motionEvent) {
        if (this.f6880.isEnabled() && this.f6880.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int r6 = m7852(motionEvent.getX(), motionEvent.getY());
                m7865(r6);
                if (r6 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.f6878 == Integer.MIN_VALUE) {
                return false;
            } else {
                m7865((int) RecyclerView.UNDEFINED_DURATION);
                return true;
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m7857(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            int i2 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        if (keyCode == 19) {
                            i2 = 33;
                        } else if (keyCode == 21) {
                            i2 = 17;
                        } else if (keyCode != 22) {
                            i2 = 130;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m7846(i2, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            int i3 = this.f6877;
            if (i3 != Integer.MIN_VALUE) {
                m7864(i3, 16);
            }
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m7846(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m7846(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7863(boolean z, int i, Rect rect) {
        int i2 = this.f6877;
        if (i2 != Integer.MIN_VALUE && i2 == i2) {
            this.f6877 = RecyclerView.UNDEFINED_DURATION;
            m7855(i2, false);
            m7859(i2, 8);
        }
        if (z) {
            m7846(i, rect);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m7846(int i, Rect rect) {
        C0520 r0;
        C0520 r9;
        C1286<C0520> r6 = m7850();
        int i2 = this.f6877;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        if (i2 == Integer.MIN_VALUE) {
            r0 = null;
        } else {
            r0 = r6.m8216(i2);
        }
        C0520 r3 = r0;
        if (i == 1 || i == 2) {
            r9 = (C0520) C1250.m8063(r6, f6873, f6872, r3, i, C0293.m4156(this.f6876) == 1);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f6877;
            if (i4 != Integer.MIN_VALUE) {
                m7843(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m7848(this.f6876, i, rect2);
            }
            r9 = (C0520) C1250.m8064(r6, f6873, f6872, r3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (r9 != null) {
            i3 = r6.m8208(r6.m8215(r9));
        }
        return m7845(i3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C1286<C0520> m7850() {
        ArrayList arrayList = new ArrayList();
        m7866((List<Integer>) arrayList);
        C1286<C0520> r1 = new C1286<>();
        for (int i = 0; i < arrayList.size(); i++) {
            r1.m8219(i, m7849(i));
        }
        return r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Rect m7848(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7859(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        C0520 r0;
        if (i == Integer.MIN_VALUE || !this.f6880.isEnabled() || (parent = this.f6876.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            if (i == -1) {
                r0 = m7851();
            } else {
                r0 = m7849(i);
            }
            accessibilityEvent.getText().add(r0.m5013());
            accessibilityEvent.setContentDescription(r0.m5019());
            accessibilityEvent.setScrollable(r0.m5045());
            accessibilityEvent.setPassword(r0.m5047());
            accessibilityEvent.setEnabled(r0.m5071());
            accessibilityEvent.setChecked(r0.m5017());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(r0.m5012());
                C0662.m5492(accessibilityEvent, this.f6876, i);
                accessibilityEvent.setPackageName(this.f6876.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            this.f6876.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return C0301.m4280(parent, this.f6876, accessibilityEvent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m7865(int i) {
        int i2 = this.f6878;
        if (i2 != i) {
            this.f6878 = i;
            m7859(i, 128);
            m7859(i2, 256);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7862(View view, AccessibilityEvent accessibilityEvent) {
        super.m12584(view, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0520 m7858(int i) {
        if (i == -1) {
            return m7851();
        }
        return m7849(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C0520 m7851() {
        C0520 r0 = C0520.m4993(this.f6876);
        C0293.m4206(this.f6876, r0);
        ArrayList arrayList = new ArrayList();
        m7866((List<Integer>) arrayList);
        if (r0.m5048() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                r0.m5008(this.f6876, ((Integer) arrayList.get(i)).intValue());
            }
            return r0;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7856(View view, C0520 r2) {
        super.m12579(view, r2);
        m7853(r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C0520 m7849(int i) {
        C0520 r0 = C0520.m4995();
        r0.m5063(true);
        r0.m5010(true);
        r0.m5022((CharSequence) "android.view.View");
        r0.m5050(f6874);
        r0.m5021(f6874);
        r0.m5007(this.f6876);
        m7854(i, r0);
        if (r0.m5013() == null && r0.m5019() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        r0.m5056(this.f6883);
        if (!this.f6883.equals(f6874)) {
            int r2 = r0.m5054();
            if ((r2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((r2 & 128) == 0) {
                r0.m5051((CharSequence) this.f6876.getContext().getPackageName());
                r0.m5033(this.f6876, i);
                if (this.f6875 == i) {
                    r0.m5040(true);
                    r0.m5030(128);
                } else {
                    r0.m5040(false);
                    r0.m5030(64);
                }
                boolean z = this.f6877 == i;
                if (z) {
                    r0.m5030(2);
                } else if (r0.m5064()) {
                    r0.m5030(1);
                }
                r0.m5024(z);
                this.f6876.getLocationOnScreen(this.f6884);
                r0.m5031(this.f6881);
                if (this.f6881.equals(f6874)) {
                    r0.m5056(this.f6881);
                    if (r0.f4304 != -1) {
                        C0520 r8 = C0520.m4995();
                        for (int i2 = r0.f4304; i2 != -1; i2 = r8.f4304) {
                            r8.m5058(this.f6876, -1);
                            r8.m5050(f6874);
                            m7854(i2, r8);
                            r8.m5056(this.f6883);
                            this.f6881.offset(this.f6883.left, this.f6883.top);
                        }
                        r8.m5018();
                    }
                    this.f6881.offset(this.f6884[0] - this.f6876.getScrollX(), this.f6884[1] - this.f6876.getScrollY());
                }
                if (this.f6876.getLocalVisibleRect(this.f6882)) {
                    this.f6882.offset(this.f6884[0] - this.f6876.getScrollX(), this.f6884[1] - this.f6876.getScrollY());
                    if (this.f6881.intersect(this.f6882)) {
                        r0.m5021(this.f6881);
                        if (m7847(this.f6881)) {
                            r0.m5036(true);
                        }
                    }
                }
                return r0;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m7847(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f6876.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f6876.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m7844(int i) {
        if (this.f6875 != i) {
            return false;
        }
        this.f6875 = RecyclerView.UNDEFINED_DURATION;
        this.f6876.invalidate();
        m7859(i, 65536);
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m7845(int i) {
        int i2;
        if ((!this.f6876.isFocused() && !this.f6876.requestFocus()) || (i2 = this.f6877) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE && i2 == i2) {
            this.f6877 = RecyclerView.UNDEFINED_DURATION;
            m7855(i2, false);
            m7859(i2, 8);
        }
        this.f6877 = i;
        m7855(i, true);
        m7859(i, 8);
        return true;
    }

    /* renamed from: o.ɨɩ$if  reason: invalid class name */
    class Cif extends C0577 {
        Cif() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0520 m7872(int i) {
            return C0520.m4999(C1212.this.m7858(i));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m7871(int i, int i2, Bundle bundle) {
            return C1212.this.m7860(i, i2, bundle);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0520 m7873(int i) {
            int i2 = i == 2 ? C1212.this.f6875 : C1212.this.f6877;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return m5196(i2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m7843(int i, Rect rect) {
        C0520 r2;
        if (i == -1) {
            r2 = m7851();
        } else {
            r2 = m7849(i);
        }
        r2.m5056(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7860(int i, int i2, Bundle bundle) {
        int i3;
        if (i == -1) {
            return C0293.m4152(this.f6876, i2, bundle);
        }
        if (i2 == 1) {
            return m7845(i);
        }
        if (i2 != 2) {
            if (i2 != 64) {
                if (i2 != 128) {
                    return m7864(i, i2);
                }
                return m7844(i);
            } else if (!this.f6880.isEnabled() || !this.f6880.isTouchExplorationEnabled() || (i3 = this.f6875) == i) {
                return false;
            } else {
                if (i3 != Integer.MIN_VALUE) {
                    m7844(i3);
                }
                this.f6875 = i;
                this.f6876.invalidate();
                m7859(i, 32768);
                return true;
            }
        } else if (this.f6877 != i) {
            return false;
        } else {
            this.f6877 = RecyclerView.UNDEFINED_DURATION;
            m7855(i, false);
            m7859(i, 8);
            return true;
        }
    }
}
