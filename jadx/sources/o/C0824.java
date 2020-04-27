package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: o.ƾΙ  reason: contains not printable characters */
public final class C0824 implements Handler.Callback {

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0824 f5366;

    /* renamed from: ı  reason: contains not printable characters */
    public final Handler f5367 = new Handler(Looper.getMainLooper(), this);

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object f5368 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0825 f5369;

    /* renamed from: ι  reason: contains not printable characters */
    public C0825 f5370;

    /* renamed from: o.ƾΙ$ɩ  reason: contains not printable characters */
    public interface C0826 {
        /* renamed from: Ι  reason: contains not printable characters */
        void m6253(int i);

        /* renamed from: ι  reason: contains not printable characters */
        void m6254();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6252(o.C0824.C0826 r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5368
            monitor-enter(r0)
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x0045 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0017
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0045 }
            if (r1 != r5) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0025
            o.ƾΙ$ı r5 = r4.f5369     // Catch:{ all -> 0x0045 }
            r4.m6247(r5, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0043
        L_0x0025:
            o.ƾΙ$ı r1 = r4.f5370     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x003b
            o.ƾΙ$ı r1 = r4.f5370     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0037
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0045 }
            if (r1 != r5) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0043
            o.ƾΙ$ı r5 = r4.f5370     // Catch:{ all -> 0x0045 }
            r4.m6247(r5, r6)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0824.m6252(o.ƾΙ$ɩ, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6246(o.C0824.C0826 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5368
            monitor-enter(r0)
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x002a }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x002a }
            if (r5 == 0) goto L_0x0017
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002a }
            if (r1 != r5) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0028
            r5 = 0
            r4.f5369 = r5     // Catch:{ all -> 0x002a }
            o.ƾΙ$ı r5 = r4.f5370     // Catch:{ all -> 0x002a }
            if (r5 == 0) goto L_0x0028
            r4.m6250()     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0824.m6246(o.ƾΙ$ɩ):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6251(o.C0824.C0826 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5368
            monitor-enter(r0)
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x0025 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x0025 }
            if (r5 == 0) goto L_0x0017
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0025 }
            if (r1 != r5) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            o.ƾΙ$ı r5 = r4.f5369     // Catch:{ all -> 0x0025 }
            r4.m6244((o.C0824.C0825) r5)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0824.m6251(o.ƾΙ$ɩ):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6249(C0826 r5) {
        synchronized (this.f5368) {
            boolean z = false;
            if (this.f5369 != null) {
                if (r5 != null && this.f5369.f5373.get() == r5) {
                    z = true;
                }
            }
            if (z && !this.f5369.f5372) {
                this.f5369.f5372 = true;
                this.f5367.removeCallbacksAndMessages(this.f5369);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6245(C0826 r5) {
        synchronized (this.f5368) {
            boolean z = true;
            if (this.f5369 != null) {
                if (r5 != null && this.f5369.f5373.get() == r5) {
                    if (z && this.f5369.f5372) {
                        this.f5369.f5372 = false;
                        m6244(this.f5369);
                    }
                }
            }
            z = false;
            this.f5369.f5372 = false;
            m6244(this.f5369);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003a  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m6248(o.C0824.C0826 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5368
            monitor-enter(r0)
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x003d }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            o.ƾΙ$ı r1 = r4.f5369     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x0017
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x003d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 != 0) goto L_0x003b
            o.ƾΙ$ı r1 = r4.f5370     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0036
            o.ƾΙ$ı r1 = r4.f5370     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x0031
            java.lang.ref.WeakReference<o.ƾΙ$ɩ> r1 = r1.f5373     // Catch:{ all -> 0x003d }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r2
        L_0x003d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0824.m6248(o.ƾΙ$ɩ):boolean");
    }

    /* renamed from: o.ƾΙ$ı  reason: contains not printable characters */
    public static class C0825 {

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f5371;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f5372;

        /* renamed from: ι  reason: contains not printable characters */
        public final WeakReference<C0826> f5373;

        public C0825(int i, C0826 r3) {
            this.f5373 = new WeakReference<>(r3);
            this.f5371 = i;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6250() {
        C0825 r0 = this.f5370;
        if (r0 != null) {
            this.f5369 = r0;
            this.f5370 = null;
            C0826 r1 = this.f5369.f5373.get();
            if (r1 != null) {
                r1.m6254();
            } else {
                this.f5369 = null;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6247(C0825 r3, int i) {
        C0826 r0 = r3.f5373.get();
        if (r0 == null) {
            return false;
        }
        this.f5367.removeCallbacksAndMessages(r3);
        r0.m6253(i);
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6244(C0825 r5) {
        if (r5.f5371 != -2) {
            int i = 2750;
            if (r5.f5371 > 0) {
                i = r5.f5371;
            } else if (r5.f5371 == -1) {
                i = 1500;
            }
            this.f5367.removeCallbacksAndMessages(r5);
            Handler handler = this.f5367;
            handler.sendMessageDelayed(Message.obtain(handler, 0, r5), (long) i);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0825 r3 = (C0825) message.obj;
        synchronized (this.f5368) {
            if (this.f5369 == r3 || this.f5370 == r3) {
                m6247(r3, 2);
            }
        }
        return true;
    }
}
