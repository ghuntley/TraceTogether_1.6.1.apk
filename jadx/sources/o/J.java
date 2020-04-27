package o;

public class J<T> extends G<T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final G<T> f1269;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f1270 = false;

    private J(G<T> g) {
        this.f1269 = g;
    }

    public void onSuccess(T t) {
        G<T> g;
        if (this.f1270 || (g = this.f1269) == null) {
            F.m1361();
        } else {
            g.onSuccess(t);
        }
    }

    public void onError(C c) {
        G<T> g;
        if (this.f1270 || (g = this.f1269) == null) {
            F.m1357(c);
        } else {
            g.onError(c);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> J<T> m1377(G<T> g) {
        return new J<>(g);
    }
}
