package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class mC extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    final int f3065;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f3066 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    C0233 f3067;

    /* renamed from: Ι  reason: contains not printable characters */
    public List<WeakReference<Cif>> f3068 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    int f3069 = -1;

    /* renamed from: І  reason: contains not printable characters */
    public EditText f3070;

    /* renamed from: o.mC$if  reason: invalid class name */
    public interface Cif {
        void onKeyboardDismissed();

        void onKeyboardVisible();
    }

    /* renamed from: o.mC$ǃ  reason: contains not printable characters */
    interface C0233 {
        /* renamed from: ı  reason: contains not printable characters */
        void m3736(int i);
    }

    mC(Activity activity) {
        super(activity);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", C3273am.f1518);
        this.f3065 = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f3070 = new EditText(activity);
        this.f3070.setFocusable(true);
        this.f3070.setFocusableInTouchMode(true);
        this.f3070.setVisibility(0);
        this.f3070.setImeOptions(268435456);
        this.f3070.setInputType(16384);
        addView(this.f3070);
        activity.getWindow().getDecorView().findViewById(16908290).getViewTreeObserver().addOnGlobalLayoutListener(new If(this, activity, (byte) 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m3735() {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj == null) {
                return 0;
            }
            Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
            declaredField2.setAccessible(true);
            return ((Rect) declaredField2.get(obj)).bottom;
        } catch (Exception unused) {
            return 0;
        }
    }

    class If implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Activity f3073;

        /* synthetic */ If(mC mCVar, Activity activity, byte b) {
            this(activity);
        }

        private If(Activity activity) {
            this.f3073 = activity;
        }

        public final void onGlobalLayout() {
            mC mCVar = mC.this;
            Activity activity = this.f3073;
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int height = mCVar.getRootView().getHeight() - mCVar.f3065;
            if (mCVar.f3069 == -1) {
                mCVar.f3069 = mCVar.m3735();
            }
            int i = (height - mCVar.f3069) - (rect.bottom - rect.top);
            if (i > 0 && mC.this.f3066 != i) {
                mC mCVar2 = mC.this;
                mCVar2.f3066 = i;
                if (mCVar2.f3067 != null) {
                    mC.this.f3067.m3736(i);
                }
            }
            if (mC.this.f3068 == null || i <= 0) {
                mC.m3734(mC.this);
            } else {
                mC.m3733(mC.this);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m3733(mC mCVar) {
        for (WeakReference next : mCVar.f3068) {
            if (next.get() != null) {
                ((Cif) next.get()).onKeyboardVisible();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m3734(mC mCVar) {
        for (WeakReference next : mCVar.f3068) {
            if (next.get() != null) {
                ((Cif) next.get()).onKeyboardDismissed();
            }
        }
    }
}
