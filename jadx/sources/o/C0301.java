package o;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: o.ıƚ  reason: contains not printable characters */
public final class C0301 {
    @Deprecated
    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m4280(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m4286(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C2844) {
            return ((C2844) viewParent).m14819(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        } else if (viewParent instanceof C2890) {
            return ((C2890) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4283(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C2844) {
            ((C2844) viewParent).m14817(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                }
            } else if (viewParent instanceof C2890) {
                ((C2890) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4282(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C2844) {
            ((C2844) viewParent).m14815(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                }
            } else if (viewParent instanceof C2890) {
                ((C2890) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4281(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C2910) {
            ((C2910) viewParent2).m15067(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C2844) {
            ((C2844) viewParent2).m14818(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                }
            } else if (viewParent2 instanceof C2890) {
                ((C2890) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4285(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C2844) {
            ((C2844) viewParent).m14816(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                }
            } else if (viewParent instanceof C2890) {
                ((C2890) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m4279(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                return false;
            }
        } else if (viewParent instanceof C2890) {
            return ((C2890) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m4284(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                return false;
            }
        } else if (viewParent instanceof C2890) {
            return ((C2890) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }
}
