package o;

import java.io.IOException;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.ky  reason: case insensitive filesystem */
abstract class C3556ky<T> {
    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m3340(kA kAVar, T t);

    C3556ky() {
    }

    /* renamed from: o.ky$і  reason: contains not printable characters */
    static final class C0212 extends C3556ky<Object> {
        C0212() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3354(kA kAVar, Object obj) {
            kC.m3212(obj, "@Url parameter is null.");
            kAVar.f2548 = obj.toString();
        }
    }

    /* renamed from: o.ky$ǃ  reason: contains not printable characters */
    static final class C0207<T> extends C3556ky<T> {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final String f2700;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3550ks<T, String> f2701;

        C0207(String str, C3550ks<T, String> ksVar) {
            this.f2700 = (String) kC.m3212(str, "name == null");
            this.f2701 = ksVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3349(kA kAVar, T t) {
            String r3;
            if (t != null && (r3 = this.f2701.m3309(t)) != null) {
                kAVar.m3198(this.f2700, r3);
            }
        }
    }

    /* renamed from: o.ky$IF */
    static final class IF<T> extends C3556ky<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f2687;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final String f2688;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3550ks<T, String> f2689;

        IF(String str, C3550ks<T, String> ksVar, boolean z) {
            this.f2688 = (String) kC.m3212(str, "name == null");
            this.f2689 = ksVar;
            this.f2687 = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3343(kA kAVar, T t) {
            if (t != null) {
                String str = this.f2688;
                String r7 = this.f2689.m3309(t);
                boolean z = this.f2687;
                if (kAVar.f2548 != null) {
                    String str2 = kAVar.f2548;
                    StringBuilder sb = new StringBuilder("{");
                    sb.append(str);
                    sb.append("}");
                    kAVar.f2548 = str2.replace(sb.toString(), kA.m3197(r7, z));
                    return;
                }
                throw new AssertionError();
            }
            StringBuilder sb2 = new StringBuilder("Path parameter \"");
            sb2.append(this.f2688);
            sb2.append("\" value must not be null.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: o.ky$Ι  reason: contains not printable characters */
    static final class C0209<T> extends C3556ky<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f2703;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3550ks<T, String> f2704;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f2705;

        C0209(String str, C3550ks<T, String> ksVar, boolean z) {
            this.f2705 = (String) kC.m3212(str, "name == null");
            this.f2704 = ksVar;
            this.f2703 = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3351(kA kAVar, T t) {
            String r4;
            if (t != null && (r4 = this.f2704.m3309(t)) != null) {
                kAVar.m3199(this.f2705, r4, this.f2703);
            }
        }
    }

    /* renamed from: o.ky$І  reason: contains not printable characters */
    static final class C0211<T> extends C3556ky<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f2708;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3550ks<T, String> f2709;

        C0211(C3550ks<T, String> ksVar, boolean z) {
            this.f2709 = ksVar;
            this.f2708 = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3353(kA kAVar, T t) {
            if (t != null) {
                kAVar.m3199(this.f2709.m3309(t), (String) null, this.f2708);
            }
        }
    }

    /* renamed from: o.ky$ι  reason: contains not printable characters */
    static final class C0210<T> extends C3556ky<Map<String, T>> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3550ks<T, String> f2706;

        /* renamed from: Ι  reason: contains not printable characters */
        private final boolean f2707;

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m3352(kA kAVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String r3 = this.f2706.m3309(value);
                            if (r3 != null) {
                                kAVar.m3199(str, r3, this.f2707);
                            } else {
                                StringBuilder sb = new StringBuilder("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f2706.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }

        C0210(C3550ks<T, String> ksVar, boolean z) {
            this.f2706 = ksVar;
            this.f2707 = z;
        }
    }

    /* renamed from: o.ky$ɩ  reason: contains not printable characters */
    static final class C0208<T> extends C3556ky<Map<String, T>> {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3550ks<T, String> f2702;

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m3350(kA kAVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kAVar.m3198(str, this.f2702.m3309(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }

        C0208(C3550ks<T, String> ksVar) {
            this.f2702 = ksVar;
        }
    }

    /* renamed from: o.ky$if  reason: invalid class name */
    static final class Cif<T> extends C3556ky<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3550ks<T, String> f2696;

        /* renamed from: Ι  reason: contains not printable characters */
        private final boolean f2697;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f2698;

        Cif(String str, C3550ks<T, String> ksVar, boolean z) {
            this.f2698 = (String) kC.m3212(str, "name == null");
            this.f2696 = ksVar;
            this.f2697 = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3347(kA kAVar, T t) {
            String r4;
            if (t != null && (r4 = this.f2696.m3309(t)) != null) {
                String str = this.f2698;
                if (this.f2697) {
                    kAVar.f2542.addEncoded(str, r4);
                } else {
                    kAVar.f2542.add(str, r4);
                }
            }
        }
    }

    /* renamed from: o.ky$If  reason: case insensitive filesystem */
    static final class C3557If<T> extends C3556ky<Map<String, T>> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final boolean f2690;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3550ks<T, String> f2691;

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m3344(kA kAVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String r3 = this.f2691.m3309(value);
                            if (r3 == null) {
                                StringBuilder sb = new StringBuilder("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f2691.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            } else if (this.f2690) {
                                kAVar.f2542.addEncoded(str, r3);
                            } else {
                                kAVar.f2542.add(str, r3);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }

        C3557If(C3550ks<T, String> ksVar, boolean z) {
            this.f2691 = ksVar;
            this.f2690 = z;
        }
    }

    /* renamed from: o.ky$iF  reason: case insensitive filesystem */
    static final class C3558iF<T> extends C3556ky<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3550ks<T, RequestBody> f2694;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Headers f2695;

        C3558iF(Headers headers, C3550ks<T, RequestBody> ksVar) {
            this.f2695 = headers;
            this.f2694 = ksVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3346(kA kAVar, T t) {
            if (t != null) {
                try {
                    RequestBody r0 = this.f2694.m3309(t);
                    kAVar.f2544.addPart(this.f2695, r0);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: o.ky$Ӏ  reason: contains not printable characters */
    static final class C0213 extends C3556ky<MultipartBody.Part> {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final C0213 f2710 = new C0213();

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m3355(kA kAVar, Object obj) {
            MultipartBody.Part part = (MultipartBody.Part) obj;
            if (part != null) {
                kAVar.f2544.addPart(part);
            }
        }

        private C0213() {
        }
    }

    /* renamed from: o.ky$aux */
    static final class aux<T> extends C3556ky<Map<String, T>> {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3550ks<T, RequestBody> f2692;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f2693;

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m3345(kA kAVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            String[] strArr = {"Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f2693};
                            kAVar.f2544.addPart(Headers.of(strArr), this.f2692.m3309(value));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }

        aux(C3550ks<T, RequestBody> ksVar, String str) {
            this.f2692 = ksVar;
            this.f2693 = str;
        }
    }

    /* renamed from: o.ky$ı  reason: contains not printable characters */
    static final class C0206<T> extends C3556ky<T> {

        /* renamed from: ι  reason: contains not printable characters */
        private final C3550ks<T, RequestBody> f2699;

        C0206(C3550ks<T, RequestBody> ksVar) {
            this.f2699 = ksVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m3348(kA kAVar, T t) {
            if (t != null) {
                try {
                    kAVar.f2547 = this.f2699.m3309(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }
}
