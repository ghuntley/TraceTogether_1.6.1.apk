package o;

import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

final class kA {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final char[] f2541 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ı  reason: contains not printable characters */
    FormBody.Builder f2542;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final HttpUrl f2543;

    /* renamed from: ɩ  reason: contains not printable characters */
    MultipartBody.Builder f2544;

    /* renamed from: ɹ  reason: contains not printable characters */
    private MediaType f2545;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final boolean f2546;

    /* renamed from: Ι  reason: contains not printable characters */
    RequestBody f2547;

    /* renamed from: ι  reason: contains not printable characters */
    String f2548;

    /* renamed from: І  reason: contains not printable characters */
    private final String f2549;

    /* renamed from: і  reason: contains not printable characters */
    private HttpUrl.Builder f2550;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Request.Builder f2551 = new Request.Builder();

    kA(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f2549 = str;
        this.f2543 = httpUrl;
        this.f2548 = str2;
        this.f2545 = mediaType;
        this.f2546 = z;
        if (headers != null) {
            this.f2551.headers(headers);
        }
        if (z2) {
            this.f2542 = new FormBody.Builder();
        } else if (z3) {
            this.f2544 = new MultipartBody.Builder();
            this.f2544.setType(MultipartBody.FORM);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3198(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.f2545 = parse;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
        }
        this.f2551.addHeader(str, str2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static String m3197(String str, boolean z) {
        String str2 = str;
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str2.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                jH jHVar = new jH();
                jHVar.m2880(str2, 0, i);
                jH jHVar2 = null;
                while (i < length) {
                    int codePointAt2 = str2.codePointAt(i);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (jHVar2 == null) {
                                jHVar2 = new jH();
                            }
                            jHVar2.m2838(codePointAt2);
                            while (true) {
                                if (jHVar2.f2411 == 0) {
                                    break;
                                }
                                byte r13 = jHVar2.m2868() & 255;
                                jHVar.m2899(37);
                                jHVar.m2899((int) f2541[(r13 >> 4) & 15]);
                                jHVar.m2899((int) f2541[r13 & 15]);
                            }
                        } else {
                            jHVar.m2838(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return jHVar.m2873();
            }
            i += Character.charCount(codePointAt);
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3199(String str, String str2, boolean z) {
        String str3 = this.f2548;
        if (str3 != null) {
            this.f2550 = this.f2543.newBuilder(str3);
            if (this.f2550 != null) {
                this.f2548 = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f2543);
                sb.append(", Relative: ");
                sb.append(this.f2548);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.f2550.addEncodedQueryParameter(str, str2);
        } else {
            this.f2550.addQueryParameter(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Request m3200() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f2550;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f2543.resolve(this.f2548);
            if (httpUrl == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f2543);
                sb.append(", Relative: ");
                sb.append(this.f2548);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C0193 r1 = this.f2547;
        if (r1 == null) {
            FormBody.Builder builder2 = this.f2542;
            if (builder2 != null) {
                r1 = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f2544;
                if (builder3 != null) {
                    r1 = builder3.build();
                } else if (this.f2546) {
                    r1 = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f2545;
        if (mediaType != null) {
            if (r1 != null) {
                r1 = new C0193(r1, mediaType);
            } else {
                this.f2551.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.f2551.url(httpUrl).method(this.f2549, r1).build();
    }

    /* renamed from: o.kA$ı  reason: contains not printable characters */
    static class C0193 extends RequestBody {

        /* renamed from: ı  reason: contains not printable characters */
        private final RequestBody f2552;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final MediaType f2553;

        C0193(RequestBody requestBody, MediaType mediaType) {
            this.f2552 = requestBody;
            this.f2553 = mediaType;
        }

        public final MediaType contentType() {
            return this.f2553;
        }

        public final long contentLength() {
            return this.f2552.contentLength();
        }

        public final void writeTo(jK jKVar) {
            this.f2552.writeTo(jKVar);
        }
    }
}
