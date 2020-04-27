package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.C3550ks;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public final class kE extends C3550ks.C0202 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3122 f2581;

    public kE(C3122 r1) {
        this.f2581 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3550ks<ResponseBody, ?> m3224(Type type, Annotation[] annotationArr) {
        return new kG(this.f2581.m15830(C3101.get(type)));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3550ks<?, RequestBody> m3225(Type type) {
        return new kI(this.f2581, this.f2581.m15830(C3101.get(type)));
    }
}
