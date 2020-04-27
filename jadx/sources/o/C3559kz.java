package o;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.kz  reason: case insensitive filesystem */
final class C3559kz<T> implements C3552ku<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private final kF<T, ?> f2711;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Throwable f2712;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Call f2713;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object[] f2714;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile boolean f2715;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f2716;

    C3559kz(kF<T, ?> kFVar, Object[] objArr) {
        this.f2711 = kFVar;
        this.f2714 = objArr;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3360(final C3551kt<T> ktVar) {
        Call call;
        Throwable th;
        kC.m3212(ktVar, "callback == null");
        synchronized (this) {
            if (!this.f2716) {
                this.f2716 = true;
                call = this.f2713;
                th = this.f2712;
                if (call == null && th == null) {
                    try {
                        Call r2 = m3356();
                        this.f2713 = r2;
                        call = r2;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f2712 = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            ktVar.m3313(th);
            return;
        }
        boolean z = this.f2715;
        call.enqueue(new Callback() {
            public final void onResponse(Call call, Response response) {
                try {
                    try {
                        ktVar.m3312(C3559kz.this.m3358(response));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }

            public final void onFailure(Call call, IOException iOException) {
                try {
                    ktVar.m3313(iOException);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final kB<T> m3357() {
        Call call;
        synchronized (this) {
            if (!this.f2716) {
                this.f2716 = true;
                if (this.f2712 == null) {
                    call = this.f2713;
                    if (call == null) {
                        try {
                            call = m3356();
                            this.f2713 = call;
                        } catch (IOException | RuntimeException e) {
                            this.f2712 = e;
                            throw e;
                        }
                    }
                } else if (this.f2712 instanceof IOException) {
                    throw ((IOException) this.f2712);
                } else {
                    throw ((RuntimeException) this.f2712);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        boolean z = this.f2715;
        return m3358(call.execute());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Call m3356() {
        Call newCall = this.f2711.f2586.newCall(this.f2711.m3228(this.f2714));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final kB<T> m3358(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new If(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return kB.m3201(kC.m3205(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return kB.m3202(null, build);
        } else {
            C0214 r1 = new C0214(body);
            try {
                return kB.m3202(this.f2711.f2584.m3309(r1), build);
            } catch (RuntimeException e) {
                if (r1.f2722 != null) {
                    throw r1.f2722;
                }
                throw e;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m3361() {
        boolean z;
        boolean z2 = this.f2715;
        synchronized (this) {
            z = this.f2713 != null && this.f2713.isCanceled();
        }
        return z;
    }

    /* renamed from: o.kz$If */
    static final class If extends ResponseBody {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final MediaType f2719;

        /* renamed from: ι  reason: contains not printable characters */
        private final long f2720;

        If(MediaType mediaType, long j) {
            this.f2719 = mediaType;
            this.f2720 = j;
        }

        public final MediaType contentType() {
            return this.f2719;
        }

        public final long contentLength() {
            return this.f2720;
        }

        public final jI source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* renamed from: o.kz$ɩ  reason: contains not printable characters */
    static final class C0214 extends ResponseBody {

        /* renamed from: ı  reason: contains not printable characters */
        private final ResponseBody f2721;

        /* renamed from: ǃ  reason: contains not printable characters */
        IOException f2722;

        C0214(ResponseBody responseBody) {
            this.f2721 = responseBody;
        }

        public final MediaType contentType() {
            return this.f2721.contentType();
        }

        public final long contentLength() {
            return this.f2721.contentLength();
        }

        public final jI source() {
            return jP.m2972((jY) new jJ(this.f2721.source()) {
                public final long read(jH jHVar, long j) {
                    try {
                        return super.read(jHVar, j);
                    } catch (IOException e) {
                        C0214.this.f2722 = e;
                        throw e;
                    }
                }
            });
        }

        public final void close() {
            this.f2721.close();
        }
    }

    public final /* synthetic */ Object clone() {
        return new C3559kz(this.f2711, this.f2714);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ C3552ku m3359() {
        return new C3559kz(this.f2711, this.f2714);
    }
}
