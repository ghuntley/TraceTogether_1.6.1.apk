package o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.ɍʟ  reason: contains not printable characters */
public final class C1078 extends Fragment implements C0485 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static WeakHashMap<Activity, WeakReference<C1078>> f6459 = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public Bundle f6460;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Map<String, LifecycleCallback> f6461 = new C0299();
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public int f6462 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1078 m7429(Activity activity) {
        C1078 r1;
        WeakReference weakReference = f6459.get(activity);
        if (weakReference != null && (r1 = (C1078) weakReference.get()) != null) {
            return r1;
        }
        try {
            C1078 r12 = (C1078) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (r12 == null || r12.isRemoving()) {
                r12 = new C1078();
                activity.getFragmentManager().beginTransaction().add(r12, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f6459.put(activity, new WeakReference(r12));
            return r12;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T extends LifecycleCallback> T m7432(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f6461.get(str));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7431(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f6461.containsKey(str)) {
            this.f6461.put(str, lifecycleCallback);
            if (this.f6462 > 0) {
                new C0527(Looper.getMainLooper()).post(new C1088(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Activity m7433() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6462 = 1;
        this.f6460 = bundle;
        for (Map.Entry next : this.f6461.entrySet()) {
            ((LifecycleCallback) next.getValue()).m773(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f6462 = 2;
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m772();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f6462 = 3;
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m767();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m770(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f6461.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).m771(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f6462 = 4;
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m769();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f6462 = 5;
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m775();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback r1 : this.f6461.values()) {
            r1.m774(str, fileDescriptor, printWriter, strArr);
        }
    }
}
