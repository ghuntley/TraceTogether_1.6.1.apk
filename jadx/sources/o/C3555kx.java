package o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import o.C3553kv;

/* renamed from: o.kx  reason: case insensitive filesystem */
final class C3555kx extends C3553kv.C0203 {

    /* renamed from: ı  reason: contains not printable characters */
    final Executor f2674;

    C3555kx(Executor executor) {
        this.f2674 = executor;
    }

    /* renamed from: o.kx$if  reason: invalid class name */
    static final class Cif<T> implements C3552ku<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        final C3552ku<T> f2677;

        /* renamed from: ɩ  reason: contains not printable characters */
        final Executor f2678;

        Cif(Executor executor, C3552ku<T> kuVar) {
            this.f2678 = executor;
            this.f2677 = kuVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m3336(final C3551kt<T> ktVar) {
            kC.m3212(ktVar, "callback == null");
            this.f2677.m3316(new C3551kt<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final void m3338(final kB<T> kBVar) {
                    Cif.this.f2678.execute(new Runnable() {
                        public final void run() {
                            if (Cif.this.f2677.m3317()) {
                                ktVar.m3313(new IOException("Canceled"));
                            } else {
                                ktVar.m3312(kBVar);
                            }
                        }
                    });
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final void m3339(final Throwable th) {
                    Cif.this.f2678.execute(new Runnable() {
                        public final void run() {
                            ktVar.m3313(th);
                        }
                    });
                }
            });
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final kB<T> m3334() {
            return this.f2677.m3314();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m3337() {
            return this.f2677.m3317();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3552ku<T> m3335() {
            return new Cif(this.f2678, this.f2677.m3315());
        }

        public final /* synthetic */ Object clone() {
            return new Cif(this.f2678, this.f2677.m3315());
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3553kv<?, ?> m3331(Type type) {
        if (kC.m3216(type) != C3552ku.class) {
            return null;
        }
        final Type r3 = kC.m3215(type);
        return new C3553kv<Object, C3552ku<?>>() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final Type m3332() {
                return r3;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final /* synthetic */ Object m3333(C3552ku kuVar) {
                return new Cif(C3555kx.this.f2674, kuVar);
            }
        };
    }
}
