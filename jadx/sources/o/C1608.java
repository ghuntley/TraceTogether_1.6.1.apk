package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.ʅ  reason: contains not printable characters */
public class C1608 {

    /* renamed from: ı  reason: contains not printable characters */
    private Interpolator f8504;

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f8505 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    final ArrayList<C0358> f8506 = new ArrayList<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f8507;

    /* renamed from: ι  reason: contains not printable characters */
    C0300 f8508;

    /* renamed from: І  reason: contains not printable characters */
    private final C0321 f8509 = new C0321() {

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean f8510 = false;

        /* renamed from: ι  reason: contains not printable characters */
        private int f8512 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        public void m9341(View view) {
            if (!this.f8510) {
                this.f8510 = true;
                if (C1608.this.f8508 != null) {
                    C1608.this.f8508.m4278((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public void m9340() {
            this.f8512 = 0;
            this.f8510 = false;
            C1608.this.m9334();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m9339(View view) {
            int i = this.f8512 + 1;
            this.f8512 = i;
            if (i == C1608.this.f8506.size()) {
                if (C1608.this.f8508 != null) {
                    C1608.this.f8508.m4277((View) null);
                }
                m9340();
            }
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public C1608 m9331(C0358 r2) {
        if (!this.f8507) {
            this.f8506.add(r2);
        }
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1608 m9333(C0358 r3, C0358 r4) {
        this.f8506.add(r3);
        r4.m4528(r3.m4530());
        this.f8506.add(r4);
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m9332() {
        if (!this.f8507) {
            Iterator<C0358> it = this.f8506.iterator();
            while (it.hasNext()) {
                C0358 next = it.next();
                long j = this.f8505;
                if (j >= 0) {
                    next.m4531(j);
                }
                Interpolator interpolator = this.f8504;
                if (interpolator != null) {
                    next.m4535(interpolator);
                }
                if (this.f8508 != null) {
                    next.m4533((C0300) this.f8509);
                }
                next.m4536();
            }
            this.f8507 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m9334() {
        this.f8507 = false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m9338() {
        if (this.f8507) {
            Iterator<C0358> it = this.f8506.iterator();
            while (it.hasNext()) {
                it.next().m4529();
            }
            this.f8507 = false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1608 m9335(long j) {
        if (!this.f8507) {
            this.f8505 = j;
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1608 m9336(Interpolator interpolator) {
        if (!this.f8507) {
            this.f8504 = interpolator;
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1608 m9337(C0300 r2) {
        if (!this.f8507) {
            this.f8508 = r2;
        }
        return this;
    }
}
