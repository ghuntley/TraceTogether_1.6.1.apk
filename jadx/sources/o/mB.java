package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.C3604mq;
import o.C3608mu;
import o.C3609mv;
import o.C3611mx;
import o.mC;
import zendesk.belvedere.ImageStream;

public final class mB extends PopupWindow implements C3611mx.C0262, mC.C0233 {

    /* renamed from: ı  reason: contains not printable characters */
    BottomSheetBehavior<View> f3042;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private View f3043;

    /* renamed from: ǃ  reason: contains not printable characters */
    final mA f3044;

    /* renamed from: ȷ  reason: contains not printable characters */
    private C3606ms f3045;

    /* renamed from: ɨ  reason: contains not printable characters */
    private RecyclerView f3046;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3609mv f3047 = new C3609mv();

    /* renamed from: ɹ  reason: contains not printable characters */
    private mC f3048;

    /* renamed from: Ι  reason: contains not printable characters */
    private final List<Integer> f3049;

    /* renamed from: ι  reason: contains not printable characters */
    C2026 f3050;

    /* renamed from: І  reason: contains not printable characters */
    private View f3051;

    /* renamed from: і  reason: contains not printable characters */
    private View f3052;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private View f3053;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Activity f3054;

    mB(Activity activity, View view, ImageStream imageStream, C3604mq.C0256 r6) {
        super(view, -1, -1, false);
        setInputMethodMode(2);
        setFocusable(true);
        setTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        this.f3053 = view.findViewById(R.id.f164782131361966);
        this.f3051 = view.findViewById(R.id.f165102131362020);
        this.f3046 = (RecyclerView) view.findViewById(R.id.f165452131362090);
        this.f3050 = (C2026) view.findViewById(R.id.f165472131362092);
        this.f3052 = view.findViewById(R.id.f165482131362093);
        this.f3043 = view.findViewById(R.id.f165462131362091);
        this.f3045 = (C3606ms) view.findViewById(R.id.f165262131362059);
        this.f3054 = activity;
        this.f3048 = imageStream.f14758.get();
        this.f3049 = r6.f3313;
        this.f3044 = new mA(new C3613mz(view.getContext(), r6), this, imageStream);
        this.f3044.m3719();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3729(final boolean z) {
        InputMethodManager inputMethodManager;
        C3609mv mvVar = this.f3047;
        this.f3046.setLayoutManager(new StaggeredGridLayoutManager(this.f3053.getContext().getResources().getInteger(R.integer.f168432131427334)));
        this.f3046.setHasFixedSize(true);
        this.f3046.setDrawingCacheEnabled(true);
        this.f3046.setDrawingCacheQuality(1048576);
        C0837 r1 = new C0837();
        r1.setSupportsChangeAnimations(false);
        this.f3046.setItemAnimator(r1);
        this.f3046.setAdapter(mvVar);
        this.f3050.setNavigationIcon(2131230825);
        this.f3050.setNavigationContentDescription((int) R.string.f170522131886137);
        this.f3050.setBackgroundColor(-1);
        this.f3050.setNavigationOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!z) {
                    mB.this.f3042.m909(4);
                } else {
                    mB.this.dismiss();
                }
            }
        });
        if (Build.VERSION.SDK_INT < 21) {
            this.f3043.setVisibility(0);
        }
        CoordinatorLayout.C0016 r0 = (CoordinatorLayout.C0016) this.f3052.getLayoutParams();
        if (r0 != null) {
            r0.m157(new C0232(this, !z, (byte) 0));
        }
        C0293.m4163((View) this.f3046, (float) this.f3053.getContext().getResources().getDimensionPixelSize(R.dimen.f157882131165264));
        this.f3042 = BottomSheetBehavior.m904(this.f3053);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f3042;
        AnonymousClass1 r12 = new BottomSheetBehavior.C0064() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m3732(int i) {
                if (i == 5) {
                    mB.this.dismiss();
                }
            }
        };
        bottomSheetBehavior.f736.clear();
        bottomSheetBehavior.f736.add(r12);
        mM.m3754(getContentView(), false);
        if (!z) {
            this.f3042.m916(this.f3053.getPaddingTop() + this.f3048.f3066);
            this.f3042.m909(4);
            this.f3048.f3067 = this;
        } else {
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f3042;
            bottomSheetBehavior2.f722 = true;
            bottomSheetBehavior2.m909(3);
            View currentFocus = this.f3054.getCurrentFocus();
            if (!(currentFocus == null || (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) == null)) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        this.f3046.setClickable(true);
        this.f3053.setVisibility(0);
        final Activity activity = this.f3054;
        final List<Integer> list = this.f3049;
        this.f3051.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Iterator it = list.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    View findViewById = activity.findViewById(((Integer) it.next()).intValue());
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        findViewById.getGlobalVisibleRect(rect);
                        boolean z2 = rawX >= rect.left && rawX <= rect.right;
                        boolean z3 = rawY >= rect.top && rawY <= rect.bottom;
                        if (z2 && z3) {
                            activity.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
                            break;
                        }
                    }
                }
                if (z) {
                    mB.this.dismiss();
                }
                return true;
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3724(List<mF> list, List<mF> list2, boolean z, boolean z2, C3609mv.C0259 r9) {
        if (!z) {
            EditText editText = this.f3048.f3070;
            editText.post(new Runnable(editText) {

                /* renamed from: ı  reason: contains not printable characters */
                private /* synthetic */ EditText f3071;

                {
                    this.f3071 = r1;
                }

                public final void run() {
                    InputMethodManager inputMethodManager;
                    if (this.f3071.requestFocus() && (inputMethodManager = (InputMethodManager) this.f3071.getContext().getSystemService("input_method")) != null) {
                        inputMethodManager.showSoftInput(this.f3071, 1);
                    }
                }
            });
        }
        ViewGroup.LayoutParams layoutParams = this.f3053.getLayoutParams();
        layoutParams.height = -1;
        this.f3053.setLayoutParams(layoutParams);
        if (z2) {
            C3609mv mvVar = this.f3047;
            mvVar.m3931(Collections.singletonList(new C3608mu.If(new View.OnClickListener(r9) {

                /* renamed from: ǃ  reason: contains not printable characters */
                private /* synthetic */ C3609mv.C0259 f3333;

                {
                    this.f3333 = r1;
                }

                public final void onClick(View view) {
                    this.f3333.m3933();
                }
            })), mvVar.f3350);
        }
        C3609mv mvVar2 = this.f3047;
        Context context = this.f3053.getContext();
        ArrayList arrayList = new ArrayList(list.size());
        for (mF next : list) {
            if (next.f3089 == null || !next.f3089.startsWith("image")) {
                arrayList.add(new C3608mu.C0257(r9, next, context));
            } else {
                arrayList.add(new C3608mu.C0258(r9, next));
            }
        }
        mvVar2.m3931(mvVar2.f3348, arrayList);
        C3609mv mvVar3 = this.f3047;
        ArrayList<C3608mu.Cif> arrayList2 = new ArrayList<>(mvVar3.f3350);
        HashSet hashSet = new HashSet();
        for (mF mFVar : list2) {
            hashSet.add(mFVar.f3092);
        }
        for (C3608mu.Cif ifVar : arrayList2) {
            ifVar.f3338 = hashSet.contains(ifVar.f3339.f3092);
        }
        mvVar3.m3931(mvVar3.f3348, arrayList2);
        this.f3047.notifyDataSetChanged();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3723(View.OnClickListener onClickListener) {
        C3606ms msVar = this.f3045;
        if (msVar != null) {
            msVar.m3923(2131230827, R.id.f164722131361959, R.string.f170412131886125, onClickListener);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3727(View.OnClickListener onClickListener) {
        C3606ms msVar = this.f3045;
        if (msVar != null) {
            msVar.m3923(2131230826, R.id.f164732131361960, R.string.f170422131886126, onClickListener);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3730() {
        Toast.makeText(this.f3054, R.string.f170432131886127, 0).show();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3726(int i) {
        if (i > 0) {
            String string = this.f3054.getString(R.string.f170442131886128);
            this.f3050.setTitle((CharSequence) String.format(Locale.getDefault(), "%s (%d)", new Object[]{string, Integer.valueOf(i)}));
            return;
        }
        this.f3050.setTitle((int) R.string.f170442131886128);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m3725() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (Build.VERSION.SDK_INT >= 24 && (this.f3054.isInMultiWindowMode() || this.f3054.isInPictureInPictureMode())) {
            return true;
        }
        if (this.f3054.getResources().getConfiguration().keyboard != 1) {
            return true;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3054.getSystemService("accessibility");
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(47)) == null || enabledAccessibilityServiceList.size() <= 0) {
            return false;
        }
        return true;
    }

    public final void dismiss() {
        super.dismiss();
        m3731(0.0f);
        mA mAVar = this.f3044;
        mAVar.f3038.f14760 = null;
        mAVar.f3038.m16353(0, 0, 0.0f);
        for (WeakReference<ImageStream.Cif> weakReference : mAVar.f3038.f14757) {
            ImageStream.Cif ifVar = (ImageStream.Cif) weakReference.get();
            if (ifVar != null) {
                ifVar.onDismissed();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m3731(float f) {
        this.f3050.getResources();
        int r0 = mM.m3752(this.f3050.getContext(), R.attr.f150322130968816);
        boolean z = f == 1.0f;
        final Window window = this.f3054.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            if (!z) {
                window.setStatusBarColor(r0);
            } else if (window.getStatusBarColor() == r0) {
                final ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(r0), -657931});
                ofObject.setDuration(100);
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        window.setStatusBarColor(((Integer) ofObject.getAnimatedValue()).intValue());
                    }
                });
                ofObject.start();
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            if (z) {
                decorView.setSystemUiVisibility(8192);
            } else {
                decorView.setSystemUiVisibility(0);
            }
        }
    }

    /* renamed from: o.mB$ɩ  reason: contains not printable characters */
    class C0232 extends CoordinatorLayout.C3238If<View> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f3063;

        /* synthetic */ C0232(mB mBVar, boolean z, byte b) {
            this(z);
        }

        private C0232(boolean z) {
            this.f3063 = z;
        }

        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2.getId() == R.id.f164782131361966;
        }

        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int height = coordinatorLayout.getHeight();
            BottomSheetBehavior<View> bottomSheetBehavior = mB.this.f3042;
            int i = -1;
            int i2 = height - (bottomSheetBehavior.f730 ? -1 : bottomSheetBehavior.f731);
            float height2 = ((float) coordinatorLayout.getHeight()) - view2.getY();
            BottomSheetBehavior<View> bottomSheetBehavior2 = mB.this.f3042;
            if (!bottomSheetBehavior2.f730) {
                i = bottomSheetBehavior2.f731;
            }
            float f = (float) i2;
            float f2 = (height2 - ((float) i)) / f;
            float f3 = f - (f2 * f);
            float r2 = (float) C0293.m4182(mB.this.f3050);
            if (f3 <= r2) {
                mM.m3754(mB.this.getContentView(), true);
                view.setAlpha(1.0f - (f3 / r2));
                view.setY(f3);
            } else {
                mM.m3754(mB.this.getContentView(), false);
            }
            mB.this.m3731(f2);
            if (this.f3063) {
                mA mAVar = mB.this.f3044;
                int height3 = coordinatorLayout.getHeight();
                if (f2 >= 0.0f) {
                    mAVar.f3038.m16353(height3, i2, f2);
                }
            }
            return true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3728(mE mEVar, ImageStream imageStream) {
        imageStream.startActivityForResult(mEVar.f3076, mEVar.f3075);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3722(int i) {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f3042;
        if (i != (bottomSheetBehavior.f730 ? -1 : bottomSheetBehavior.f731)) {
            this.f3042.m916(this.f3053.getPaddingTop() + this.f3048.f3066);
        }
    }
}
