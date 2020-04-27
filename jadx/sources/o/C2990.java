package o;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import o.C0712;

/* renamed from: o.ԟǃ  reason: contains not printable characters */
public final class C2990<T> extends C3011<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0398<T> f13777;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1665<T> f13778;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3122 f13779;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3011<T> f13780;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3101<T> f13781;

    public C2990(C1665<T> r1, C0398<T> r2, C3122 r3, C3101<T> r4) {
        this.f13778 = r1;
        this.f13777 = r2;
        this.f13779 = r3;
        this.f13781 = r4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m15334(C0995 r4) {
        if (this.f13777 == null) {
            C3011<T> r0 = this.f13780;
            if (r0 == null) {
                r0 = this.f13779.m15832((C2638) null, this.f13781);
                this.f13780 = r0;
            }
            return r0.m15434(r4);
        } else if (C2036.m10907(r4) instanceof C0875) {
            return null;
        } else {
            C0398<T> r42 = this.f13777;
            this.f13781.getType();
            return r42.m4664();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15335(C0815 r4, T t) {
        C1665<T> r0 = this.f13778;
        if (r0 == null) {
            C3011<T> r02 = this.f13780;
            if (r02 == null) {
                r02 = this.f13779.m15832((C2638) null, this.f13781);
                this.f13780 = r02;
            }
            r02.m15435(r4, t);
        } else if (t == null) {
            r4.m6224();
        } else {
            this.f13781.getType();
            C2700.f12467.m15435(r4, r0.m9525());
        }
    }

    /* renamed from: o.ԟǃ$If */
    public final class If implements C0712.C0713, Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final /* synthetic */ FirebaseAuth f13782;

        private If() {
        }

        public If(FirebaseAuth firebaseAuth) {
            this.f13782 = firebaseAuth;
        }

        public final void run() {
            Iterator it = this.f13782.f962.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
