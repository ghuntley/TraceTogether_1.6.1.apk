package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C3556ky;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.ResponseBody;

final class kF<R, T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final Pattern f2582 = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: Ι  reason: contains not printable characters */
    static final Pattern f2583 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: ı  reason: contains not printable characters */
    final C3550ks<ResponseBody, R> f2584;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final MediaType f2585;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Call.Factory f2586;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final boolean f2587;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C3556ky<?>[] f2588;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Headers f2589;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final boolean f2590;

    /* renamed from: ι  reason: contains not printable characters */
    final C3553kv<R, T> f2591;

    /* renamed from: І  reason: contains not printable characters */
    private final HttpUrl f2592;

    /* renamed from: і  reason: contains not printable characters */
    private final String f2593;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f2594;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final boolean f2595;

    kF(Cif<R, T> ifVar) {
        this.f2586 = ifVar.f2602.f2565;
        this.f2591 = ifVar.f2611;
        this.f2592 = ifVar.f2602.f2568;
        this.f2584 = ifVar.f2598;
        this.f2593 = ifVar.f2608;
        this.f2594 = ifVar.f2618;
        this.f2589 = ifVar.f2609;
        this.f2585 = ifVar.f2597;
        this.f2587 = ifVar.f2603;
        this.f2590 = ifVar.f2605;
        this.f2595 = ifVar.f2607;
        this.f2588 = ifVar.f2610;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Request m3228(Object... objArr) {
        kA kAVar = new kA(this.f2593, this.f2592, this.f2594, this.f2589, this.f2585, this.f2587, this.f2590, this.f2595);
        C3556ky<?>[] kyVarArr = this.f2588;
        int length = objArr != null ? objArr.length : 0;
        if (length == kyVarArr.length) {
            for (int i = 0; i < length; i++) {
                kyVarArr[i].m3340(kAVar, objArr[i]);
            }
            return kAVar.m3200();
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(kyVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o.kF$if  reason: invalid class name */
    static final class Cif<T, R> {

        /* renamed from: ı  reason: contains not printable characters */
        final Annotation[] f2596;

        /* renamed from: ŀ  reason: contains not printable characters */
        MediaType f2597;

        /* renamed from: ł  reason: contains not printable characters */
        C3550ks<ResponseBody, T> f2598;

        /* renamed from: Ɩ  reason: contains not printable characters */
        boolean f2599;

        /* renamed from: Ɨ  reason: contains not printable characters */
        private boolean f2600;

        /* renamed from: ƚ  reason: contains not printable characters */
        private boolean f2601;

        /* renamed from: ǃ  reason: contains not printable characters */
        final kD f2602;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f2603;

        /* renamed from: ɍ  reason: contains not printable characters */
        private Set<String> f2604;

        /* renamed from: ɨ  reason: contains not printable characters */
        boolean f2605;

        /* renamed from: ɩ  reason: contains not printable characters */
        Type f2606;

        /* renamed from: ɪ  reason: contains not printable characters */
        boolean f2607;

        /* renamed from: ɹ  reason: contains not printable characters */
        String f2608;

        /* renamed from: ɾ  reason: contains not printable characters */
        Headers f2609;

        /* renamed from: ɿ  reason: contains not printable characters */
        C3556ky<?>[] f2610;

        /* renamed from: ʟ  reason: contains not printable characters */
        C3553kv<T, R> f2611;

        /* renamed from: Ι  reason: contains not printable characters */
        final Annotation[][] f2612;

        /* renamed from: ι  reason: contains not printable characters */
        final Type[] f2613;

        /* renamed from: І  reason: contains not printable characters */
        boolean f2614;

        /* renamed from: г  reason: contains not printable characters */
        private Method f2615;

        /* renamed from: і  reason: contains not printable characters */
        boolean f2616;

        /* renamed from: Ӏ  reason: contains not printable characters */
        boolean f2617;

        /* renamed from: ӏ  reason: contains not printable characters */
        String f2618;

        Cif(kD kDVar, Method method) {
            this.f2602 = kDVar;
            this.f2615 = method;
            this.f2596 = method.getAnnotations();
            this.f2613 = method.getGenericParameterTypes();
            this.f2612 = method.getParameterAnnotations();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final C3553kv<T, R> m3234() {
            Type genericReturnType = this.f2615.getGenericReturnType();
            if (kC.m3207(genericReturnType)) {
                throw m3236((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Annotation[] annotations = this.f2615.getAnnotations();
                try {
                    kD kDVar = this.f2602;
                    kC.m3212(genericReturnType, "returnType == null");
                    kC.m3212(annotations, "annotations == null");
                    int indexOf = kDVar.f2567.indexOf((Object) null) + 1;
                    int size = kDVar.f2567.size();
                    for (int i = indexOf; i < size; i++) {
                        C3553kv<?, ?> r7 = kDVar.f2567.get(i).m3320(genericReturnType);
                        if (r7 != null) {
                            return r7;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
                    sb.append(genericReturnType);
                    sb.append(".\n");
                    sb.append("  Tried:");
                    int size2 = kDVar.f2567.size();
                    while (indexOf < size2) {
                        sb.append("\n   * ");
                        sb.append(kDVar.f2567.get(indexOf).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(sb.toString());
                } catch (RuntimeException e) {
                    throw m3236(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m3236((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3231(String str, String str2, boolean z) {
            String str3 = this.f2608;
            if (str3 == null) {
                this.f2608 = str;
                this.f2603 = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (kF.f2582.matcher(substring).find()) {
                            throw m3236((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f2618 = str2;
                    this.f2604 = kF.m3226(str2);
                    return;
                }
                return;
            }
            throw m3236((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final Headers m3235(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m3236((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse != null) {
                        this.f2597 = parse;
                    } else {
                        throw m3236((Throwable) null, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3556ky<?> m3233(int i, Type type, Annotation[] annotationArr) {
            C3556ky<?> kyVar = null;
            for (Annotation r4 : annotationArr) {
                C3556ky<?> r42 = m3229(i, type, annotationArr, r4);
                if (r42 != null) {
                    if (kyVar == null) {
                        kyVar = r42;
                    } else {
                        throw m3230(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (kyVar != null) {
                return kyVar;
            }
            throw m3230(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3556ky<?> m3229(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C3566lg) {
                if (this.f2599) {
                    throw m3230(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f2601) {
                    throw m3230(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f2600) {
                    throw m3230(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f2618 == null) {
                    this.f2599 = true;
                    if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C3556ky.C0212();
                    }
                    throw m3230(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m3230(i, "@Url cannot be used with @%s URL", this.f2608);
                }
            } else if (annotation instanceof C3565le) {
                if (this.f2600) {
                    throw m3230(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f2599) {
                    throw m3230(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f2618 != null) {
                    this.f2601 = true;
                    C3565le leVar = (C3565le) annotation;
                    String r0 = leVar.m3556();
                    if (!kF.f2583.matcher(r0).matches()) {
                        throw m3230(i, "@Path parameter name must match %s. Found: %s", kF.f2582.pattern(), r0);
                    } else if (this.f2604.contains(r0)) {
                        return new C3556ky.IF(r0, this.f2602.m3220(type, annotationArr), leVar.m3555());
                    } else {
                        throw m3230(i, "URL \"%s\" does not contain \"{%s}\".", this.f2618, r0);
                    }
                } else {
                    throw m3230(i, "@Path can only be used with relative url on @%s", this.f2608);
                }
            } else if (annotation instanceof C3562lb) {
                C3562lb lbVar = (C3562lb) annotation;
                String r02 = lbVar.m3552();
                boolean r14 = lbVar.m3553();
                Class<?> r4 = kC.m3216(type);
                this.f2600 = true;
                if (Iterable.class.isAssignableFrom(r4)) {
                    if (type instanceof ParameterizedType) {
                        return new C3556ky<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            /* renamed from: ı  reason: contains not printable characters */
                            public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object r0 : iterable) {
                                        C3556ky.this.m3340(kAVar, r0);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(r4.getSimpleName());
                    sb.append("<String>)");
                    throw m3230(i, sb.toString(), new Object[0]);
                } else if (!r4.isArray()) {
                    return new C3556ky.C0209(r02, this.f2602.m3220(type, annotationArr), r14);
                } else {
                    return new C3556ky<Object>() {
                        /* access modifiers changed from: package-private */
                        /* renamed from: ı  reason: contains not printable characters */
                        public final void m3341(kA kAVar, Object obj) {
                            if (obj != null) {
                                int length = Array.getLength(obj);
                                for (int i = 0; i < length; i++) {
                                    C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof C3563lc) {
                boolean r142 = ((C3563lc) annotation).m3554();
                Class<?> r03 = kC.m3216(type);
                this.f2600 = true;
                if (Iterable.class.isAssignableFrom(r03)) {
                    if (type instanceof ParameterizedType) {
                        return new C3556ky<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            /* renamed from: ı  reason: contains not printable characters */
                            public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object r0 : iterable) {
                                        C3556ky.this.m3340(kAVar, r0);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(r03.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(r03.getSimpleName());
                    sb2.append("<String>)");
                    throw m3230(i, sb2.toString(), new Object[0]);
                } else if (!r03.isArray()) {
                    return new C3556ky.C0211(this.f2602.m3220(type, annotationArr), r142);
                } else {
                    return new C3556ky<Object>() {
                        /* access modifiers changed from: package-private */
                        /* renamed from: ı  reason: contains not printable characters */
                        public final void m3341(kA kAVar, Object obj) {
                            if (obj != null) {
                                int length = Array.getLength(obj);
                                for (int i = 0; i < length; i++) {
                                    C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof C3561la) {
                Class<?> r04 = kC.m3216(type);
                if (Map.class.isAssignableFrom(r04)) {
                    Type r12 = kC.m3204(type, r04, Map.class);
                    if (r12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) r12;
                        Type r05 = kC.m3214(0, parameterizedType);
                        if (String.class == r05) {
                            return new C3556ky.C0210(this.f2602.m3220(kC.m3214(1, parameterizedType), annotationArr), ((C3561la) annotation).m3551());
                        }
                        throw m3230(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(r05)), new Object[0]);
                    }
                    throw m3230(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m3230(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof kT) {
                String r143 = ((kT) annotation).m3251();
                Class<?> r06 = kC.m3216(type);
                if (Iterable.class.isAssignableFrom(r06)) {
                    if (type instanceof ParameterizedType) {
                        return new C3556ky<Iterable<T>>() {
                            /* access modifiers changed from: package-private */
                            /* renamed from: ı  reason: contains not printable characters */
                            public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                Iterable<Object> iterable = (Iterable) obj;
                                if (iterable != null) {
                                    for (Object r0 : iterable) {
                                        C3556ky.this.m3340(kAVar, r0);
                                    }
                                }
                            }
                        };
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(r06.getSimpleName());
                    sb3.append(" must include generic type (e.g., ");
                    sb3.append(r06.getSimpleName());
                    sb3.append("<String>)");
                    throw m3230(i, sb3.toString(), new Object[0]);
                } else if (!r06.isArray()) {
                    return new C3556ky.C0207(r143, this.f2602.m3220(type, annotationArr));
                } else {
                    return new C3556ky<Object>() {
                        /* access modifiers changed from: package-private */
                        /* renamed from: ı  reason: contains not printable characters */
                        public final void m3341(kA kAVar, Object obj) {
                            if (obj != null) {
                                int length = Array.getLength(obj);
                                for (int i = 0; i < length; i++) {
                                    C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                }
                            }
                        }
                    };
                }
            } else if (annotation instanceof kS) {
                Class<?> r144 = kC.m3216(type);
                if (Map.class.isAssignableFrom(r144)) {
                    Type r122 = kC.m3204(type, r144, Map.class);
                    if (r122 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) r122;
                        Type r145 = kC.m3214(0, parameterizedType2);
                        if (String.class == r145) {
                            return new C3556ky.C0208(this.f2602.m3220(kC.m3214(1, parameterizedType2), annotationArr));
                        }
                        throw m3230(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(r145)), new Object[0]);
                    }
                    throw m3230(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m3230(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof kH) {
                if (this.f2605) {
                    kH kHVar = (kH) annotation;
                    String r07 = kHVar.m3239();
                    boolean r146 = kHVar.m3240();
                    this.f2614 = true;
                    Class<?> r2 = kC.m3216(type);
                    if (Iterable.class.isAssignableFrom(r2)) {
                        if (type instanceof ParameterizedType) {
                            return new C3556ky<Iterable<T>>() {
                                /* access modifiers changed from: package-private */
                                /* renamed from: ı  reason: contains not printable characters */
                                public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                    Iterable<Object> iterable = (Iterable) obj;
                                    if (iterable != null) {
                                        for (Object r0 : iterable) {
                                            C3556ky.this.m3340(kAVar, r0);
                                        }
                                    }
                                }
                            };
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(r2.getSimpleName());
                        sb4.append(" must include generic type (e.g., ");
                        sb4.append(r2.getSimpleName());
                        sb4.append("<String>)");
                        throw m3230(i, sb4.toString(), new Object[0]);
                    } else if (!r2.isArray()) {
                        return new C3556ky.Cif(r07, this.f2602.m3220(type, annotationArr), r146);
                    } else {
                        return new C3556ky<Object>() {
                            /* access modifiers changed from: package-private */
                            /* renamed from: ı  reason: contains not printable characters */
                            public final void m3341(kA kAVar, Object obj) {
                                if (obj != null) {
                                    int length = Array.getLength(obj);
                                    for (int i = 0; i < length; i++) {
                                        C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                    }
                                }
                            }
                        };
                    }
                } else {
                    throw m3230(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof kM) {
                if (this.f2605) {
                    Class<?> r08 = kC.m3216(type);
                    if (Map.class.isAssignableFrom(r08)) {
                        Type r123 = kC.m3204(type, r08, Map.class);
                        if (r123 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) r123;
                            Type r09 = kC.m3214(0, parameterizedType3);
                            if (String.class == r09) {
                                C3550ks r11 = this.f2602.m3220(kC.m3214(1, parameterizedType3), annotationArr);
                                this.f2614 = true;
                                return new C3556ky.C3557If(r11, ((kM) annotation).m3246());
                            }
                            throw m3230(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(r09)), new Object[0]);
                        }
                        throw m3230(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m3230(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m3230(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof kZ) {
                if (this.f2607) {
                    kZ kZVar = (kZ) annotation;
                    this.f2616 = true;
                    String r010 = kZVar.m3256();
                    Class<?> r6 = kC.m3216(type);
                    if (!r010.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder("form-data; name=\"");
                        sb5.append(r010);
                        sb5.append("\"");
                        Headers of = Headers.of("Content-Disposition", sb5.toString(), "Content-Transfer-Encoding", kZVar.m3257());
                        if (Iterable.class.isAssignableFrom(r6)) {
                            if (type instanceof ParameterizedType) {
                                Type r124 = kC.m3214(0, (ParameterizedType) type);
                                if (!MultipartBody.Part.class.isAssignableFrom(kC.m3216(r124))) {
                                    return new C3556ky<Iterable<T>>() {
                                        /* access modifiers changed from: package-private */
                                        /* renamed from: ı  reason: contains not printable characters */
                                        public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                            Iterable<Object> iterable = (Iterable) obj;
                                            if (iterable != null) {
                                                for (Object r0 : iterable) {
                                                    C3556ky.this.m3340(kAVar, r0);
                                                }
                                            }
                                        }
                                    };
                                }
                                throw m3230(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(r6.getSimpleName());
                            sb6.append(" must include generic type (e.g., ");
                            sb6.append(r6.getSimpleName());
                            sb6.append("<String>)");
                            throw m3230(i, sb6.toString(), new Object[0]);
                        } else if (r6.isArray()) {
                            Class<?> r125 = kF.m3227(r6.getComponentType());
                            if (!MultipartBody.Part.class.isAssignableFrom(r125)) {
                                return new C3556ky<Object>() {
                                    /* access modifiers changed from: package-private */
                                    /* renamed from: ı  reason: contains not printable characters */
                                    public final void m3341(kA kAVar, Object obj) {
                                        if (obj != null) {
                                            int length = Array.getLength(obj);
                                            for (int i = 0; i < length; i++) {
                                                C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                            }
                                        }
                                    }
                                };
                            }
                            throw m3230(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!MultipartBody.Part.class.isAssignableFrom(r6)) {
                            return new C3556ky.C3558iF(of, this.f2602.m3221(type, annotationArr, this.f2596));
                        } else {
                            throw m3230(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(r6)) {
                        if (!(type instanceof ParameterizedType)) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(r6.getSimpleName());
                            sb7.append(" must include generic type (e.g., ");
                            sb7.append(r6.getSimpleName());
                            sb7.append("<String>)");
                            throw m3230(i, sb7.toString(), new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(kC.m3216(kC.m3214(0, (ParameterizedType) type)))) {
                            return new C3556ky<Iterable<T>>() {
                                /* access modifiers changed from: package-private */
                                /* renamed from: ı  reason: contains not printable characters */
                                public final /* synthetic */ void m3342(kA kAVar, Object obj) {
                                    Iterable<Object> iterable = (Iterable) obj;
                                    if (iterable != null) {
                                        for (Object r0 : iterable) {
                                            C3556ky.this.m3340(kAVar, r0);
                                        }
                                    }
                                }
                            };
                        } else {
                            throw m3230(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (r6.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(r6.getComponentType())) {
                            return new C3556ky<Object>() {
                                /* access modifiers changed from: package-private */
                                /* renamed from: ı  reason: contains not printable characters */
                                public final void m3341(kA kAVar, Object obj) {
                                    if (obj != null) {
                                        int length = Array.getLength(obj);
                                        for (int i = 0; i < length; i++) {
                                            C3556ky.this.m3340(kAVar, Array.get(obj, i));
                                        }
                                    }
                                }
                            };
                        }
                        throw m3230(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (MultipartBody.Part.class.isAssignableFrom(r6)) {
                        return C3556ky.C0213.f2710;
                    } else {
                        throw m3230(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw m3230(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof kX) {
                if (this.f2607) {
                    this.f2616 = true;
                    Class<?> r011 = kC.m3216(type);
                    if (Map.class.isAssignableFrom(r011)) {
                        Type r126 = kC.m3204(type, r011, Map.class);
                        if (r126 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) r126;
                            Type r012 = kC.m3214(0, parameterizedType4);
                            if (String.class == r012) {
                                Type r127 = kC.m3214(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(kC.m3216(r127))) {
                                    return new C3556ky.aux(this.f2602.m3221(r127, annotationArr, this.f2596), ((kX) annotation).m3254());
                                }
                                throw m3230(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw m3230(i, "@PartMap keys must be of type String: ".concat(String.valueOf(r012)), new Object[0]);
                        }
                        throw m3230(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m3230(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m3230(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof kJ)) {
                return null;
            } else {
                if (this.f2605 || this.f2607) {
                    throw m3230(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f2617) {
                    try {
                        C3550ks r112 = this.f2602.m3221(type, annotationArr, this.f2596);
                        this.f2617 = true;
                        return new C3556ky.C0206(r112);
                    } catch (RuntimeException e) {
                        Object[] objArr = {type};
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Unable to create @Body converter for %s");
                        sb8.append(" (parameter #");
                        sb8.append(i + 1);
                        sb8.append(")");
                        throw m3236(e, sb8.toString(), objArr);
                    }
                } else {
                    throw m3230(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3550ks<ResponseBody, T> m3232() {
            Annotation[] annotations = this.f2615.getAnnotations();
            try {
                kD kDVar = this.f2602;
                Type type = this.f2606;
                kC.m3212(type, "type == null");
                kC.m3212(annotations, "annotations == null");
                int indexOf = kDVar.f2564.indexOf((Object) null) + 1;
                int size = kDVar.f2564.size();
                for (int i = indexOf; i < size; i++) {
                    C3550ks<ResponseBody, ?> r7 = kDVar.f2564.get(i).m3310(type, annotations);
                    if (r7 != null) {
                        return r7;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
                sb.append(type);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = kDVar.f2564.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(kDVar.f2564.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw m3236(e, "Unable to create converter for %s", this.f2606);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final RuntimeException m3236(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append("\n    for method ");
            sb.append(this.f2615.getDeclaringClass().getSimpleName());
            sb.append(".");
            sb.append(this.f2615.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final RuntimeException m3230(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m3236((Throwable) null, sb.toString(), objArr);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static Set<String> m3226(String str) {
        Matcher matcher = f2582.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static Class<?> m3227(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }
}
