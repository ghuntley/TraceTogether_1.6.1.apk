package o;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0520;
import o.C2449;

/* renamed from: o.ıł  reason: contains not printable characters */
public class C0293 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Field f3543;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static WeakHashMap<View, C0358> f3544 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f3545;

    /* renamed from: ȷ  reason: contains not printable characters */
    private static Cif f3546 = new Cif();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Field f3547;

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final int[] f3548 = {R.id.f163972131361866, R.id.f163982131361867, R.id.f164092131361878, R.id.f164202131361889, R.id.f164232131361892, R.id.f164242131361893, R.id.f164252131361894, R.id.f164262131361895, R.id.f164272131361896, R.id.f164282131361897, R.id.f163992131361868, R.id.f164002131361869, R.id.f164012131361870, R.id.f164022131361871, R.id.f164032131361872, R.id.f164042131361873, R.id.f164052131361874, R.id.f164062131361875, R.id.f164072131361876, R.id.f164082131361877, R.id.f164102131361879, R.id.f164112131361880, R.id.f164122131361881, R.id.f164132131361882, R.id.f164142131361883, R.id.f164152131361884, R.id.f164162131361885, R.id.f164172131361886, R.id.f164182131361887, R.id.f164192131361888, R.id.f164212131361890, R.id.f164222131361891};

    /* renamed from: ɹ  reason: contains not printable characters */
    private static ThreadLocal<Rect> f3549;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f3550;

    /* renamed from: ι  reason: contains not printable characters */
    private static final AtomicInteger f3551 = new AtomicInteger(1);

    /* renamed from: І  reason: contains not printable characters */
    private static WeakHashMap<View, String> f3552;

    /* renamed from: і  reason: contains not printable characters */
    private static Field f3553;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static boolean f3554 = false;

    /* renamed from: o.ıł$ı  reason: contains not printable characters */
    public interface C0294 {
        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m4251(View view, KeyEvent keyEvent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Rect m4201() {
        if (f3549 == null) {
            f3549 = new ThreadLocal<>();
        }
        Rect rect = f3549.get();
        if (rect == null) {
            rect = new Rect();
            f3549.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4206(View view, C0520 r1) {
        view.onInitializeAccessibilityNodeInfo(r1.m5006());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4151(View view, C2449 r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null && (m4212(view) instanceof C2449.Cif)) {
            r2 = new C2449();
        }
        if (r2 == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = r2.m12575();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: ı  reason: contains not printable characters */
    public static int m4145(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4196(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2449 m4162(View view) {
        View.AccessibilityDelegate r1 = m4212(view);
        if (r1 == null) {
            return null;
        }
        if (r1 instanceof C2449.Cif) {
            return ((C2449.Cif) r1).f11110;
        }
        return new C2449(r1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C2449 m4194(View view) {
        C2449 r0 = m4162(view);
        if (r0 == null) {
            r0 = new C2449();
        }
        m4151(view, r0);
        return r0;
    }

    /* renamed from: ϳ  reason: contains not printable characters */
    private static View.AccessibilityDelegate m4212(View view) {
        if (f3554) {
            return null;
        }
        if (f3553 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3553 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3554 = true;
                return null;
            }
        }
        try {
            Object obj = f3553.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3554 = true;
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m4210(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4209(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4176(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4148(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4204(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4166(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m4217(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4203(View view, int i) {
        if (Build.VERSION.SDK_INT < 19) {
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m4152(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4150(View view, C0520.Cif ifVar, CharSequence charSequence, C0607 r3) {
        m4167(view, ifVar.m5075(charSequence, r3));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m4167(View view, C0520.Cif ifVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4194(view);
            m4195(ifVar.m5074(), view);
            m4183(view).add(ifVar);
            m4157(view, 0);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4147(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4195(i, view);
            m4157(view, 0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m4195(int i, View view) {
        List<C0520.Cif> r3 = m4183(view);
        for (int i2 = 0; i2 < r3.size(); i2++) {
            if (r3.get(i2).m5074() == i) {
                r3.remove(i2);
                return;
            }
        }
    }

    /* renamed from: ɭ  reason: contains not printable characters */
    private static List<C0520.Cif> m4183(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.f167572131362365);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.f167572131362365, arrayList2);
        return arrayList2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4165(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m4156(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static ViewParent m4220(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m4213(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4177(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m4184(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static int m4173(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4178(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static int m4222(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3550) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3543 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3550 = true;
        }
        Field field = f3543;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static int m4182(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3545) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3547 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3545 = true;
        }
        Field field = f3547;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public static C0358 m4169(View view) {
        if (f3544 == null) {
            f3544 = new WeakHashMap<>();
        }
        C0358 r0 = f3544.get(view);
        if (r0 != null) {
            return r0;
        }
        C0358 r02 = new C0358(view);
        f3544.put(view, r02);
        return r02;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4163(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public static float m4188(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4205(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3552 == null) {
            f3552 = new WeakHashMap<>();
        }
        f3552.put(view, str);
    }

    /* renamed from: г  reason: contains not printable characters */
    public static String m4215(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3552;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public static int m4189(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: ł  reason: contains not printable characters */
    public static void m4154(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public static boolean m4153(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4200(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4207(View view, final C2850 r3) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (r3 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C0501.m4888(r3.m14828(view, C0501.m4889(windowInsets)));
                }
            });
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0501 m4202(View view, C0501 r3) {
        if (Build.VERSION.SDK_INT < 21) {
            return r3;
        }
        WindowInsets windowInsets = (WindowInsets) C0501.m4888(r3);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0501.m4889(windowInsets);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0501 m4175(View view, C0501 r3) {
        if (Build.VERSION.SDK_INT < 21) {
            return r3;
        }
        WindowInsets windowInsets = (WindowInsets) C0501.m4888(r3);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0501.m4889(windowInsets);
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public static boolean m4191(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public static boolean m4159(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4199(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public static ColorStateList m4158(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0291) {
            return ((C0291) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4198(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0291) {
            ((C0291) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public static PorterDuff.Mode m4190(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0291) {
            return ((C0291) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4179(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0291) {
            ((C0291) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public static boolean m4170(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C2607) {
            return ((C2607) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public static void m4155(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C2607) {
            ((C2607) view).stopNestedScroll();
        }
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    public static boolean m4186(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    public static float m4160(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4164(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect r0 = m4201();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                r0.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !r0.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4185(view, i);
            if (z && r0.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(r0);
            }
        } else {
            m4185(view, i);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private static void m4185(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m4219(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4219((View) parent);
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static void m4221(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect r0 = m4201();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                r0.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !r0.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4218(view, i);
            if (z && r0.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(r0);
            }
        } else {
            m4218(view, i);
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private static void m4218(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m4219(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4219((View) parent);
            }
        }
    }

    /* renamed from: ґ  reason: contains not printable characters */
    private static void m4219(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4149(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public static Rect m4171(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    public static boolean m4187(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    public static boolean m4172(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4197(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4208(View view, C3014 r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (r3 != null ? r3.m15448() : null));
        }
    }

    /* renamed from: Ј  reason: contains not printable characters */
    public static Display m4214(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m4187(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m4193() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f3551.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f3551.compareAndSet(i, i2));
        return i;
    }

    protected C0293() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m4181(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0295.m4253(view).m4257(keyEvent);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m4168(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0295.m4253(view).m4258(view, keyEvent);
    }

    /* renamed from: ͻ  reason: contains not printable characters */
    public static boolean m4192(View view) {
        Boolean r1 = m4146().m4243(view);
        if (r1 == null) {
            return false;
        }
        return r1.booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static If<Boolean> m4146() {
        return new If<Boolean>(R.id.f167612131362369, Boolean.class, 28) {
            /* access modifiers changed from: package-private */
            /* renamed from: Ι  reason: contains not printable characters */
            public final Boolean m4225(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m4227(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m4228(Boolean bool, Boolean bool2) {
                return !m4247(bool, bool2);
            }
        };
    }

    /* renamed from: с  reason: contains not printable characters */
    public static CharSequence m4216(View view) {
        return m4174().m4243(view);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static If<CharSequence> m4174() {
        return new If<CharSequence>(R.id.f167602131362368, CharSequence.class, 8, 28) {
            /* access modifiers changed from: package-private */
            /* renamed from: ı  reason: contains not printable characters */
            public final CharSequence m4230(View view) {
                return view.getAccessibilityPaneTitle();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ι  reason: contains not printable characters */
            public final void m4232(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m4234(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    /* renamed from: ϲ  reason: contains not printable characters */
    public static boolean m4211(View view) {
        Boolean r1 = m4161().m4243(view);
        if (r1 == null) {
            return false;
        }
        return r1.booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4180(View view, boolean z) {
        m4161().m4245(view, Boolean.valueOf(z));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static If<Boolean> m4161() {
        return new If<Boolean>(R.id.f167592131362367, Boolean.class, 28) {
            /* access modifiers changed from: package-private */
            /* renamed from: Ι  reason: contains not printable characters */
            public final Boolean m4236(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ι  reason: contains not printable characters */
            public final void m4238(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m4240(Boolean bool, Boolean bool2) {
                return !m4247(bool, bool2);
            }
        };
    }

    /* renamed from: o.ıł$If */
    static abstract class If<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f3556;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f3557;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Class<T> f3558;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f3559;

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract T m4244(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public abstract void m4246(View view, T t);

        If(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        If(int i, Class<T> cls, int i2, int i3) {
            this.f3557 = i;
            this.f3558 = cls;
            this.f3559 = i2;
            this.f3556 = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m4245(View view, T t) {
            if (m4242()) {
                m4246(view, t);
            } else if (m4241() && m4248(m4243(view), t)) {
                C0293.m4194(view);
                view.setTag(this.f3557, t);
                C0293.m4157(view, 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public T m4243(View view) {
            if (m4242()) {
                return m4244(view);
            }
            if (!m4241()) {
                return null;
            }
            T tag = view.getTag(this.f3557);
            if (this.f3558.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        private boolean m4242() {
            return Build.VERSION.SDK_INT >= this.f3556;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private boolean m4241() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m4248(T t, T t2) {
            return !t2.equals(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m4247(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    static void m4157(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m4216(view) != null;
            if (m4213(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent();
                }
            }
        }
    }

    /* renamed from: o.ıł$if  reason: invalid class name */
    static class Cif implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: ι  reason: contains not printable characters */
        private WeakHashMap<View, Boolean> f3560 = new WeakHashMap<>();

        public void onViewDetachedFromWindow(View view) {
        }

        Cif() {
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f3560.entrySet()) {
                m4250((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m4249(view);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m4250(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C0293.m4157(view, 16);
                }
                this.f3560.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m4249(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: o.ıł$ǃ  reason: contains not printable characters */
    static class C0295 {

        /* renamed from: ı  reason: contains not printable characters */
        private static final ArrayList<WeakReference<View>> f3561 = new ArrayList<>();

        /* renamed from: ɩ  reason: contains not printable characters */
        private SparseArray<WeakReference<View>> f3562 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        private WeakHashMap<View, Boolean> f3563 = null;

        /* renamed from: ι  reason: contains not printable characters */
        private WeakReference<KeyEvent> f3564 = null;

        C0295() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private SparseArray<WeakReference<View>> m4255() {
            if (this.f3562 == null) {
                this.f3562 = new SparseArray<>();
            }
            return this.f3562;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        static C0295 m4253(View view) {
            C0295 r1 = (C0295) view.getTag(R.id.f167632131362371);
            if (r1 != null) {
                return r1;
            }
            C0295 r12 = new C0295();
            view.setTag(R.id.f167632131362371, r12);
            return r12;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m4258(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4254();
            }
            View r3 = m4252(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (r3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4255().put(keyCode, new WeakReference(r3));
                }
            }
            return r3 != null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private View m4252(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3563;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View r3 = m4252(viewGroup.getChildAt(childCount), keyEvent);
                        if (r3 != null) {
                            return r3;
                        }
                    }
                }
                if (m4256(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m4257(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3564;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3564 = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> r2 = m4255();
            if (keyEvent.getAction() == 1 && (indexOfKey = r2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = r2.valueAt(indexOfKey);
                r2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = r2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0293.m4187(view)) {
                m4256(view, keyEvent);
            }
            return true;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean m4256(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.f167642131362372);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0294) arrayList.get(size)).m4251(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m4254() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3563;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f3561.isEmpty()) {
                synchronized (f3561) {
                    if (this.f3563 == null) {
                        this.f3563 = new WeakHashMap<>();
                    }
                    for (int size = f3561.size() - 1; size >= 0; size--) {
                        View view = (View) f3561.get(size).get();
                        if (view == null) {
                            f3561.remove(size);
                        } else {
                            this.f3563.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3563.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }
}
