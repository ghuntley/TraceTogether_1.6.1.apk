package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import o.C0299;
import o.C0485;
import o.C0527;
import o.C1168;
import o.C1269;
import o.C1277;

public final class zzc extends C1277 implements C0485 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static WeakHashMap<C1269, WeakReference<zzc>> f556 = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public Bundle f557;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f558 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    private Map<String, LifecycleCallback> f559 = new C0299();

    /* renamed from: ι  reason: contains not printable characters */
    public static zzc m778(C1269 r3) {
        zzc zzc;
        WeakReference weakReference = f556.get(r3);
        if (weakReference != null && (zzc = (zzc) weakReference.get()) != null) {
            return zzc;
        }
        try {
            zzc zzc2 = (zzc) r3.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.isRemoving()) {
                zzc2 = new zzc();
                r3.getSupportFragmentManager().m9099().m9960((C1277) zzc2, "SupportLifecycleFragmentImpl").m9957();
            }
            f556.put(r3, new WeakReference(zzc2));
            return zzc2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T extends LifecycleCallback> T m780(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f559.get(str));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m779(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f559.containsKey(str)) {
            this.f559.put(str, lifecycleCallback);
            if (this.f558 > 0) {
                new C0527(Looper.getMainLooper()).post(new C1168(this, lifecycleCallback, str));
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

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f558 = 1;
        this.f557 = bundle;
        for (Map.Entry next : this.f559.entrySet()) {
            ((LifecycleCallback) next.getValue()).m773(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f558 = 2;
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m772();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f558 = 3;
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m767();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m770(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f559.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).m771(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f558 = 4;
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m769();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f558 = 5;
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m775();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback r1 : this.f559.values()) {
            r1.m774(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ Activity m781() {
        return getActivity();
    }
}
