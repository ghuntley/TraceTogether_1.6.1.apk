package o;

import okhttp3.Response;
import okhttp3.ResponseBody;

public final class kB<T> {

    /* renamed from: ı  reason: contains not printable characters */
    public final ResponseBody f2554;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Response f2555;

    /* renamed from: Ι  reason: contains not printable characters */
    public final T f2556;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T> kB<T> m3202(T t, Response response) {
        kC.m3212(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new kB<>(response, t, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> kB<T> m3201(ResponseBody responseBody, Response response) {
        kC.m3212(responseBody, "body == null");
        kC.m3212(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new kB<>(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    private kB(Response response, T t, ResponseBody responseBody) {
        this.f2555 = response;
        this.f2556 = t;
        this.f2554 = responseBody;
    }

    public final String toString() {
        return this.f2555.toString();
    }
}
