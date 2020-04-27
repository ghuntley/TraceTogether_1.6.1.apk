package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.ɍг  reason: contains not printable characters */
public final class C1082 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<BasePendingResult<?>, Boolean> f6468 = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<C3203<?>, Boolean> f6469 = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final <TResult> void m7438(C3203<TResult> r2, boolean z) {
        this.f6469.put(r2, Boolean.valueOf(z));
        r2.m16152().m4409(new C0657(this, r2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7440() {
        return !this.f6468.isEmpty() || !this.f6469.isEmpty();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7441() {
        m7437(false, C0506.f4213);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7439() {
        m7437(true, C1021.f6221);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m7437(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6468) {
            hashMap = new HashMap(this.f6468);
        }
        synchronized (this.f6469) {
            hashMap2 = new HashMap(this.f6469);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m761(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3203) entry2.getKey()).m16151((Exception) new C2929(status));
            }
        }
    }
}
