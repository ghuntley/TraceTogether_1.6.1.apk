package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: o.ɪւ  reason: contains not printable characters */
public class C1411 extends C0956 {
    private BottomSheetBehavior<FrameLayout> behavior;
    private BottomSheetBehavior.C0064 bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;

    public C1411(Context context) {
        this(context, 0);
    }

    public C1411(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.C0064() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m8597(int i) {
                if (i == 5) {
                    C1411.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
    }

    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m914(z);
            }
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f721 == 5) {
            this.behavior.m909(4);
        }
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior2 = getBehavior();
        if (!this.dismissWithAnimation || behavior2.f721 == 5) {
            super.cancel();
        } else {
            behavior2.m909(5);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            this.container = (FrameLayout) View.inflate(getContext(), R.layout.f169022131558445, (ViewGroup) null);
            this.behavior = BottomSheetBehavior.m904((FrameLayout) this.container.findViewById(R.id.f165052131362011));
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            BottomSheetBehavior.C0064 r1 = this.bottomSheetCallback;
            if (!bottomSheetBehavior.f736.contains(r1)) {
                bottomSheetBehavior.f736.add(r1);
            }
            this.behavior.m914(this.cancelable);
        }
        return this.container;
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.f164952131361999);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.container.findViewById(R.id.f165052131362011);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.f167892131362405).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (C1411.this.cancelable && C1411.this.isShowing() && C1411.this.shouldWindowCloseOnTouchOutside()) {
                    C1411.this.cancel();
                }
            }
        });
        C0293.m4151((View) frameLayout, (C2449) new C2449() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m8595(View view, C0520 r2) {
                super.m12579(view, r2);
                if (C1411.this.cancelable) {
                    r2.m5030(1048576);
                    r2.m5042(true);
                    return;
                }
                r2.m5042(false);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m8596(View view, int i, Bundle bundle) {
                if (i != 1048576 || !C1411.this.cancelable) {
                    return super.m12580(view, i, bundle);
                }
                C1411.this.cancel();
                return true;
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.f148962130968673, typedValue, true) ? typedValue.resourceId : R.style.f174272131952040;
    }

    public void removeDefaultCallback() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        bottomSheetBehavior.f736.remove(this.bottomSheetCallback);
    }
}
