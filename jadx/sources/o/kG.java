package o;

import okhttp3.ResponseBody;

final class kG<T> implements C3550ks<ResponseBody, T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3011<T> f2619;

    kG(C3011<T> r1) {
        this.f2619 = r1;
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public T m3238(ResponseBody responseBody) {
        C0995 r1 = new C0995(responseBody.charStream());
        r1.f6050 = false;
        try {
            return this.f2619.m15434(r1);
        } finally {
            responseBody.close();
        }
    }
}
