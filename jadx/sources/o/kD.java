package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.C3544km;
import o.C3550ks;
import o.C3553kv;
import o.kF;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class kD {

    /* renamed from: ı  reason: contains not printable characters */
    final List<C3550ks.C0202> f2564;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Call.Factory f2565;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Executor f2566;

    /* renamed from: Ι  reason: contains not printable characters */
    final List<C3553kv.C0203> f2567;

    /* renamed from: ι  reason: contains not printable characters */
    final HttpUrl f2568;

    /* renamed from: І  reason: contains not printable characters */
    final boolean f2569;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Map<Method, kF<?, ?>> f2570 = new ConcurrentHashMap();

    kD(Call.Factory factory, HttpUrl httpUrl, List<C3550ks.C0202> list, List<C3553kv.C0203> list2, Executor executor, boolean z) {
        this.f2565 = factory;
        this.f2568 = httpUrl;
        this.f2564 = Collections.unmodifiableList(list);
        this.f2567 = Collections.unmodifiableList(list2);
        this.f2566 = executor;
        this.f2569 = z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <T> T m3219(final Class<T> cls) {
        kC.m3206(cls);
        if (this.f2569) {
            C3554kw r0 = C3554kw.m3322();
            for (Method method : cls.getDeclaredMethods()) {
                if (!r0.m3326(method)) {
                    m3218(method);
                }
            }
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: ɩ  reason: contains not printable characters */
            private final C3554kw f2572 = C3554kw.m3322();

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f2572.m3326(method)) {
                    return this.f2572.m3324(method, cls, obj, objArr);
                }
                kF<?, ?> r3 = kD.this.m3218(method);
                return r3.f2591.m3319(new C3559kz(r3, objArr));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final kF<?, ?> m3218(Method method) {
        kF<?, ?> kFVar;
        kF<?, ?> kFVar2 = this.f2570.get(method);
        if (kFVar2 != null) {
            return kFVar2;
        }
        synchronized (this.f2570) {
            kFVar = this.f2570.get(method);
            if (kFVar == null) {
                kF.Cif ifVar = new kF.Cif(this, method);
                ifVar.f2611 = ifVar.m3234();
                ifVar.f2606 = ifVar.f2611.m3318();
                if (ifVar.f2606 == kB.class || ifVar.f2606 == Response.class) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(kC.m3216(ifVar.f2606).getName());
                    sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                    throw ifVar.m3236((Throwable) null, sb.toString(), new Object[0]);
                }
                ifVar.f2598 = ifVar.m3232();
                for (Annotation annotation : ifVar.f2596) {
                    if (annotation instanceof kK) {
                        ifVar.m3231("DELETE", ((kK) annotation).m3242(), false);
                    } else if (annotation instanceof kP) {
                        ifVar.m3231("GET", ((kP) annotation).m3248(), false);
                    } else if (annotation instanceof kO) {
                        ifVar.m3231("HEAD", ((kO) annotation).m3247(), false);
                        if (!Void.class.equals(ifVar.f2606)) {
                            throw ifVar.m3236((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                        }
                    } else if (annotation instanceof kW) {
                        ifVar.m3231("PATCH", ((kW) annotation).m3253(), true);
                    } else if (annotation instanceof kY) {
                        ifVar.m3231("POST", ((kY) annotation).m3255(), true);
                    } else if (annotation instanceof kV) {
                        ifVar.m3231("PUT", ((kV) annotation).m3252(), true);
                    } else if (annotation instanceof kR) {
                        ifVar.m3231("OPTIONS", ((kR) annotation).m3250(), false);
                    } else if (annotation instanceof kL) {
                        kL kLVar = (kL) annotation;
                        ifVar.m3231(kLVar.m3243(), kLVar.m3245(), kLVar.m3244());
                    } else if (annotation instanceof kQ) {
                        String[] r7 = ((kQ) annotation).m3249();
                        if (r7.length != 0) {
                            ifVar.f2609 = ifVar.m3235(r7);
                        } else {
                            throw ifVar.m3236((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof kU) {
                        if (!ifVar.f2605) {
                            ifVar.f2607 = true;
                        } else {
                            throw ifVar.m3236((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (!(annotation instanceof kN)) {
                        continue;
                    } else if (!ifVar.f2607) {
                        ifVar.f2605 = true;
                    } else {
                        throw ifVar.m3236((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                }
                if (ifVar.f2608 != null) {
                    if (!ifVar.f2603) {
                        if (ifVar.f2607) {
                            throw ifVar.m3236((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (ifVar.f2605) {
                            throw ifVar.m3236((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = ifVar.f2612.length;
                    ifVar.f2610 = new C3556ky[length];
                    int i = 0;
                    while (i < length) {
                        Type type = ifVar.f2613[i];
                        if (!kC.m3207(type)) {
                            Annotation[] annotationArr = ifVar.f2612[i];
                            if (annotationArr != null) {
                                ifVar.f2610[i] = ifVar.m3233(i, type, annotationArr);
                                i++;
                            } else {
                                throw ifVar.m3230(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw ifVar.m3230(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (ifVar.f2618 == null) {
                        if (!ifVar.f2599) {
                            throw ifVar.m3236((Throwable) null, "Missing either @%s URL or @Url parameter.", ifVar.f2608);
                        }
                    }
                    if (!ifVar.f2605 && !ifVar.f2607 && !ifVar.f2603) {
                        if (ifVar.f2617) {
                            throw ifVar.m3236((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    }
                    if (ifVar.f2605) {
                        if (!ifVar.f2614) {
                            throw ifVar.m3236((Throwable) null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                        }
                    }
                    if (ifVar.f2607) {
                        if (!ifVar.f2616) {
                            throw ifVar.m3236((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    }
                    kF<?, ?> kFVar3 = new kF<>(ifVar);
                    this.f2570.put(method, kFVar3);
                    kFVar = kFVar3;
                } else {
                    throw ifVar.m3236((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            }
        }
        return kFVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> C3550ks<T, String> m3220(Type type, Annotation[] annotationArr) {
        kC.m3212(type, "type == null");
        kC.m3212(annotationArr, "annotations == null");
        int size = this.f2564.size();
        for (int i = 0; i < size; i++) {
            this.f2564.get(i);
        }
        return C3544km.C0201.f2668;
    }

    /* renamed from: o.kD$ı  reason: contains not printable characters */
    public static final class C0196 {

        /* renamed from: ı  reason: contains not printable characters */
        public Call.Factory f2574;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final List<C3550ks.C0202> f2575;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3554kw f2576;

        /* renamed from: ɹ  reason: contains not printable characters */
        private Executor f2577;

        /* renamed from: Ι  reason: contains not printable characters */
        private final List<C3553kv.C0203> f2578;

        /* renamed from: ι  reason: contains not printable characters */
        private HttpUrl f2579;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f2580;

        private C0196(C3554kw kwVar) {
            this.f2575 = new ArrayList();
            this.f2578 = new ArrayList();
            this.f2576 = kwVar;
            this.f2575.add(new C3544km());
        }

        public C0196() {
            this(C3554kw.m3322());
        }

        public C0196(kD kDVar) {
            this.f2575 = new ArrayList();
            this.f2578 = new ArrayList();
            this.f2576 = C3554kw.m3322();
            this.f2574 = kDVar.f2565;
            this.f2579 = kDVar.f2568;
            this.f2575.addAll(kDVar.f2564);
            this.f2578.addAll(kDVar.f2567);
            List<C3553kv.C0203> list = this.f2578;
            list.remove(list.size() - 1);
            this.f2577 = kDVar.f2566;
            this.f2580 = kDVar.f2569;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0196 m3222(String str) {
            kC.m3212(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                kC.m3212(parse, "baseUrl == null");
                List<String> pathSegments = parse.pathSegments();
                if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                    this.f2579 = parse;
                    return this;
                }
                throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(parse)));
            }
            throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final kD m3223() {
            if (this.f2579 != null) {
                Call.Factory factory = this.f2574;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f2577;
                if (executor == null) {
                    executor = this.f2576.m3323();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f2578);
                arrayList.add(this.f2576.m3325(executor2));
                return new kD(factory2, this.f2579, new ArrayList(this.f2575), arrayList, executor2, this.f2580);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> C3550ks<T, RequestBody> m3221(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        kC.m3212(type, "type == null");
        kC.m3212(annotationArr, "parameterAnnotations == null");
        kC.m3212(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f2564.indexOf((Object) null) + 1;
        int size = this.f2564.size();
        for (int i = indexOf; i < size; i++) {
            C3550ks<?, RequestBody> r1 = this.f2564.get(i).m3311(type);
            if (r1 != null) {
                return r1;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f2564.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f2564.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
