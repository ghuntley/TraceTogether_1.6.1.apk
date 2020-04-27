package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.C0288;
import o.C0351;
import o.C0359;
import o.C0362;
import o.C0459;
import o.C0469;
import o.C0985;
import o.C1144;
import o.C2745;
import o.C3282auX;

@KeepName
public abstract class BasePendingResult<R extends C0459> extends C0351<R> {

    /* renamed from: ǃ  reason: contains not printable characters */
    static final ThreadLocal<Boolean> f539 = new C1144();
    @KeepName
    private C0052 mResultGuardian;

    /* renamed from: ı  reason: contains not printable characters */
    private final If<R> f540 = new If<>(Looper.getMainLooper());

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Status f541;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f542;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C3282auX.Cif f543;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final CountDownLatch f544 = new CountDownLatch(1);

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f545 = false;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public R f546;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f547;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object f548 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private final WeakReference<C0288> f549 = new WeakReference<>((Object) null);

    /* renamed from: І  reason: contains not printable characters */
    private final AtomicReference<C0985> f550 = new AtomicReference<>();

    /* renamed from: і  reason: contains not printable characters */
    private final ArrayList<C0351.Cif> f551 = new ArrayList<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C0362<? super R> f552;

    /* renamed from: ӏ  reason: contains not printable characters */
    private volatile boolean f553;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$ı  reason: contains not printable characters */
    final class C0052 {
        private C0052() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m756(BasePendingResult.this.f546);
            super.finalize();
        }

        /* synthetic */ C0052(BasePendingResult basePendingResult, C1144 r2) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public static <R extends C0459> C0362<R> m759(C0362<R> r0) {
        return r0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract R m760(Status status);

    public static class If<R extends C0459> extends C0469 {
        public If() {
            this(Looper.getMainLooper());
        }

        public If(Looper looper) {
            super(looper);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m764(C0362<? super R> r2, R r) {
            sendMessage(obtainMessage(1, new Pair(BasePendingResult.m759(r2), r)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).m761(Status.f534);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m762() {
        return this.f544.getCount() == 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m763(R r) {
        synchronized (this.f548) {
            if (this.f542 || this.f547) {
                m756(r);
                return;
            }
            m762();
            boolean z = true;
            C2745.C2746.m14558(!m762(), "Results have already been set");
            if (this.f553) {
                z = false;
            }
            C2745.C2746.m14558(z, "Result has already been consumed");
            m758(r);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m761(Status status) {
        synchronized (this.f548) {
            if (!m762()) {
                m763(m760(status));
                this.f542 = true;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final R m755() {
        R r;
        synchronized (this.f548) {
            C2745.C2746.m14558(!this.f553, "Result has already been consumed.");
            C2745.C2746.m14558(m762(), "Result is not ready.");
            r = this.f546;
            this.f546 = null;
            this.f552 = null;
            this.f553 = true;
        }
        C0985 andSet = this.f550.getAndSet((Object) null);
        if (andSet != null) {
            andSet.m6968(this);
        }
        return r;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m758(R r) {
        this.f546 = r;
        this.f543 = null;
        this.f544.countDown();
        this.f541 = this.f546.m4786();
        if (this.f547) {
            this.f552 = null;
        } else if (this.f552 != null) {
            this.f540.removeMessages(2);
            this.f540.m764(this.f552, m755());
        } else if (this.f546 instanceof C0359) {
            this.mResultGuardian = new C0052(this, (C1144) null);
        }
        ArrayList arrayList = this.f551;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0351.Cif) obj).m4504(this.f541);
        }
        this.f551.clear();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m756(C0459 r3) {
        if (r3 instanceof C0359) {
            try {
                ((C0359) r3).m4540();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(r3);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
