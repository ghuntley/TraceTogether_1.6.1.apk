package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.C3550ks;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.km  reason: case insensitive filesystem */
final class C3544km extends C3550ks.C0202 {
    C3544km() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3550ks<ResponseBody, ?> m3282(Type type, Annotation[] annotationArr) {
        if (type == ResponseBody.class) {
            if (kC.m3211(annotationArr, (Class<? extends Annotation>) C3564ld.class)) {
                return C0200.f2667;
            }
            return Cif.f2665;
        } else if (type == Void.class) {
            return C0199.f2666;
        } else {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3550ks<?, RequestBody> m3283(Type type) {
        if (RequestBody.class.isAssignableFrom(kC.m3216(type))) {
            return If.f2664;
        }
        return null;
    }

    /* renamed from: o.km$ı  reason: contains not printable characters */
    static final class C0199 implements C3550ks<ResponseBody, Void> {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final C0199 f2666 = new C0199();

        C0199() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ Object m3287(Object obj) {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    /* renamed from: o.km$If */
    static final class If implements C3550ks<RequestBody, RequestBody> {

        /* renamed from: Ι  reason: contains not printable characters */
        static final If f2664 = new If();

        If() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ Object m3284(Object obj) {
            return (RequestBody) obj;
        }
    }

    /* renamed from: o.km$ǃ  reason: contains not printable characters */
    static final class C0200 implements C3550ks<ResponseBody, ResponseBody> {

        /* renamed from: ı  reason: contains not printable characters */
        static final C0200 f2667 = new C0200();

        C0200() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ Object m3288(Object obj) {
            return (ResponseBody) obj;
        }
    }

    /* renamed from: o.km$if  reason: invalid class name */
    static final class Cif implements C3550ks<ResponseBody, ResponseBody> {

        /* renamed from: ı  reason: contains not printable characters */
        static final Cif f2665 = new Cif();

        Cif() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ Object m3286(Object obj) {
            return m3285((ResponseBody) obj);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static ResponseBody m3285(ResponseBody responseBody) {
            try {
                return kC.m3205(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: o.km$ɩ  reason: contains not printable characters */
    static final class C0201 implements C3550ks<Object, String> {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final C0201 f2668 = new C0201();

        C0201() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ Object m3289(Object obj) {
            return obj.toString();
        }
    }
}
