package o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import o.C2319;

/* renamed from: o.ӏӀ  reason: contains not printable characters */
public final class C2918 extends Fragment {

    /* renamed from: ι  reason: contains not printable characters */
    C2919 f13540;

    /* renamed from: o.ӏӀ$ı  reason: contains not printable characters */
    interface C2919 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m15078();

        /* renamed from: Ι  reason: contains not printable characters */
        void m15079();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m15076(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C2920());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C2918(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m15077(Activity activity, C2319.C2320 r2) {
        if (activity instanceof C2795) {
            ((C2795) activity).m14710().m14067(C2656.m14063(r2));
        } else if (activity instanceof C2851) {
            C2319 lifecycle = ((C2851) activity).getLifecycle();
            if (lifecycle instanceof C2656) {
                ((C2656) lifecycle).m14067(C2656.m14063(r2));
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C2319.C2320 r3 = C2319.C2320.ON_CREATE;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r3);
        }
    }

    public final void onStart() {
        super.onStart();
        C2919 r0 = this.f13540;
        if (r0 != null) {
            r0.m15079();
        }
        C2319.C2320 r02 = C2319.C2320.ON_START;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r02);
        }
    }

    public final void onResume() {
        super.onResume();
        C2919 r0 = this.f13540;
        if (r0 != null) {
            r0.m15078();
        }
        C2319.C2320 r02 = C2319.C2320.ON_RESUME;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r02);
        }
    }

    public final void onPause() {
        super.onPause();
        C2319.C2320 r0 = C2319.C2320.ON_PAUSE;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r0);
        }
    }

    public final void onStop() {
        super.onStop();
        C2319.C2320 r0 = C2319.C2320.ON_STOP;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r0);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C2319.C2320 r0 = C2319.C2320.ON_DESTROY;
        if (Build.VERSION.SDK_INT < 29) {
            m15077(getActivity(), r0);
        }
        this.f13540 = null;
    }

    /* renamed from: o.ӏӀ$ǃ  reason: contains not printable characters */
    static class C2920 implements Application.ActivityLifecycleCallbacks {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        C2920() {
        }

        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
            C2918.m15077(activity, C2319.C2320.ON_CREATE);
        }

        public final void onActivityPostStarted(Activity activity) {
            C2918.m15077(activity, C2319.C2320.ON_START);
        }

        public final void onActivityPostResumed(Activity activity) {
            C2918.m15077(activity, C2319.C2320.ON_RESUME);
        }

        public final void onActivityPrePaused(Activity activity) {
            C2918.m15077(activity, C2319.C2320.ON_PAUSE);
        }

        public final void onActivityPreStopped(Activity activity) {
            C2918.m15077(activity, C2319.C2320.ON_STOP);
        }

        public final void onActivityPreDestroyed(Activity activity) {
            C2918.m15077(activity, C2319.C2320.ON_DESTROY);
        }
    }
}
