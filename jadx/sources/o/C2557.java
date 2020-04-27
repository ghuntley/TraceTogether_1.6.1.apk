package o;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity$2;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.OnBackPressedDispatcher;
import o.C2319;
import o.C3169;

/* renamed from: o.і  reason: contains not printable characters */
public class C2557 extends C2957 implements C0350, C2416, C1568, C3251Aux {
    private int mContentLayoutId;
    private C3169.C3172 mDefaultFactory;
    private final C2656 mLifecycleRegistry = new C2656(this);
    private final OnBackPressedDispatcher mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
        public final void run() {
            C2557.super.onBackPressed();
        }
    });
    private final C1554 mSavedStateRegistryController = C1554.m9161((C1568) this);
    private C0307 mViewModelStore;

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* renamed from: o.і$ı  reason: contains not printable characters */
    static final class C2558 {

        /* renamed from: ı  reason: contains not printable characters */
        C0307 f11663;

        /* renamed from: Ι  reason: contains not printable characters */
        Object f11664;

        C2558() {
        }
    }

    public C2557() {
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().m12098(new ComponentActivity$2(this));
            }
            getLifecycle().m12098(new ComponentActivity$3(this));
            if (19 <= Build.VERSION.SDK_INT && Build.VERSION.SDK_INT <= 23) {
                getLifecycle().m12098(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.m9164(bundle);
        C2918.m15076(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C2319 lifecycle = getLifecycle();
        if (lifecycle instanceof C2656) {
            ((C2656) lifecycle).m14068(C2319.Cif.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m9162(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        C2558 r2;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0307 r1 = this.mViewModelStore;
        if (r1 == null && (r2 = (C2558) getLastNonConfigurationInstance()) != null) {
            r1 = r2.f11663;
        }
        if (r1 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C2558 r22 = new C2558();
        r22.f11664 = onRetainCustomNonConfigurationInstance;
        r22.f11663 = r1;
        return r22;
    }

    public C2319 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public C0307 getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C2558 r0 = (C2558) getLastNonConfigurationInstance();
                if (r0 != null) {
                    this.mViewModelStore = r0.f11663;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0307();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public C3169.C3172 getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C0333(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m96();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C1555 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m9163();
    }
}
