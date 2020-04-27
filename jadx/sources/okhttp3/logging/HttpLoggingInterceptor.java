package okhttp3.logging;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import o.jH;
import o.jI;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() {
            public final void log(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        };

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        this.level = Level.NONE;
        this.logger = logger2;
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        if (level2 != null) {
            this.level = level2;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public final Level getLevel() {
        return this.level;
    }

    public final Response intercept(Interceptor.Chain chain) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        Interceptor.Chain chain2 = chain;
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain2.proceed(request);
        }
        boolean z3 = true;
        boolean z4 = level2 == Level.BODY;
        boolean z5 = z4 || level2 == Level.HEADERS;
        RequestBody body = request.body();
        if (body == null) {
            z3 = false;
        }
        Connection connection = chain.connection();
        Protocol protocol = connection != null ? connection.protocol() : Protocol.HTTP_1_1;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(' ');
        sb.append(protocol);
        String obj = sb.toString();
        if (!z5 && z3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" (");
            sb2.append(body.contentLength());
            sb2.append("-byte body)");
            obj = sb2.toString();
        }
        this.logger.log(obj);
        if (z5) {
            if (z3) {
                if (body.contentType() != null) {
                    Logger logger2 = this.logger;
                    StringBuilder sb3 = new StringBuilder("Content-Type: ");
                    sb3.append(body.contentType());
                    logger2.log(sb3.toString());
                }
                if (body.contentLength() != -1) {
                    Logger logger3 = this.logger;
                    StringBuilder sb4 = new StringBuilder("Content-Length: ");
                    sb4.append(body.contentLength());
                    logger3.log(sb4.toString());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                String name = headers.name(i);
                int i2 = size;
                if ("Content-Type".equalsIgnoreCase(name) || "Content-Length".equalsIgnoreCase(name)) {
                    z2 = z5;
                } else {
                    Logger logger4 = this.logger;
                    z2 = z5;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(name);
                    sb5.append(": ");
                    sb5.append(headers.value(i));
                    logger4.log(sb5.toString());
                }
                i++;
                size = i2;
                z5 = z2;
            }
            z = z5;
            if (!z4 || !z3) {
                Logger logger5 = this.logger;
                StringBuilder sb6 = new StringBuilder("--> END ");
                sb6.append(request.method());
                logger5.log(sb6.toString());
            } else if (bodyEncoded(request.headers())) {
                Logger logger6 = this.logger;
                StringBuilder sb7 = new StringBuilder("--> END ");
                sb7.append(request.method());
                sb7.append(" (encoded body omitted)");
                logger6.log(sb7.toString());
            } else {
                jH jHVar = new jH();
                body.writeTo(jHVar);
                Charset charset = UTF8;
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    charset = contentType.charset(UTF8);
                }
                this.logger.log("");
                if (isPlaintext(jHVar)) {
                    this.logger.log(jHVar.m2861(charset));
                    Logger logger7 = this.logger;
                    StringBuilder sb8 = new StringBuilder("--> END ");
                    sb8.append(request.method());
                    sb8.append(" (");
                    sb8.append(body.contentLength());
                    sb8.append("-byte body)");
                    logger7.log(sb8.toString());
                } else {
                    Logger logger8 = this.logger;
                    StringBuilder sb9 = new StringBuilder("--> END ");
                    sb9.append(request.method());
                    sb9.append(" (binary ");
                    sb9.append(body.contentLength());
                    sb9.append("-byte body omitted)");
                    logger8.log(sb9.toString());
                }
            }
        } else {
            z = z5;
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(contentLength);
                sb10.append("-byte");
                str = sb10.toString();
            } else {
                str = "unknown-length";
            }
            Logger logger9 = this.logger;
            String str3 = "-byte body)";
            StringBuilder sb11 = new StringBuilder("<-- ");
            sb11.append(proceed.code());
            sb11.append(' ');
            long j = contentLength;
            sb11.append(proceed.message());
            sb11.append(' ');
            sb11.append(proceed.request().url());
            sb11.append(" (");
            sb11.append(millis);
            sb11.append("ms");
            if (!z) {
                StringBuilder sb12 = new StringBuilder(", ");
                sb12.append(str);
                sb12.append(" body");
                str2 = sb12.toString();
            } else {
                str2 = "";
            }
            sb11.append(str2);
            sb11.append(')');
            logger9.log(sb11.toString());
            if (z) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Logger logger10 = this.logger;
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(headers2.name(i3));
                    sb13.append(": ");
                    sb13.append(headers2.value(i3));
                    logger10.log(sb13.toString());
                }
                if (!z4 || !HttpHeaders.hasBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyEncoded(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    jI source = body2.source();
                    source.m2920(Long.MAX_VALUE);
                    jH r2 = source.m2919();
                    Charset charset2 = UTF8;
                    MediaType contentType2 = body2.contentType();
                    if (contentType2 != null) {
                        charset2 = contentType2.charset(UTF8);
                    }
                    if (!isPlaintext(r2)) {
                        this.logger.log("");
                        Logger logger11 = this.logger;
                        StringBuilder sb14 = new StringBuilder("<-- END HTTP (binary ");
                        sb14.append(r2.f2411);
                        sb14.append("-byte body omitted)");
                        logger11.log(sb14.toString());
                        return proceed;
                    }
                    if (j != 0) {
                        this.logger.log("");
                        this.logger.log(r2.clone().m2861(charset2));
                    }
                    Logger logger12 = this.logger;
                    StringBuilder sb15 = new StringBuilder("<-- END HTTP (");
                    sb15.append(r2.f2411);
                    sb15.append(str3);
                    logger12.log(sb15.toString());
                }
            }
            return proceed;
        } catch (Exception e) {
            Exception exc = e;
            this.logger.log("<-- HTTP FAILED: ".concat(String.valueOf(exc)));
            throw exc;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e0 A[Catch:{ EOFException -> 0x00eb }, LOOP:0: B:7:0x001b->B:54:0x00e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean isPlaintext(o.jH r14) {
        /*
            r0 = 0
            o.jH r7 = new o.jH     // Catch:{ EOFException -> 0x00eb }
            r7.<init>()     // Catch:{ EOFException -> 0x00eb }
            long r1 = r14.f2411     // Catch:{ EOFException -> 0x00eb }
            r3 = 64
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0012
            long r1 = r14.f2411     // Catch:{ EOFException -> 0x00eb }
            r5 = r1
            goto L_0x0013
        L_0x0012:
            r5 = r3
        L_0x0013:
            r3 = 0
            r1 = r14
            r2 = r7
            r1.m2864((o.jH) r2, (long) r3, (long) r5)     // Catch:{ EOFException -> 0x00eb }
            r14 = 0
        L_0x001b:
            r1 = 16
            r2 = 1
            if (r14 >= r1) goto L_0x00ea
            long r3 = r7.f2411     // Catch:{ EOFException -> 0x00eb }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x00ea
            long r3 = r7.f2411     // Catch:{ EOFException -> 0x00eb }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            byte r1 = r7.m2847((long) r5)     // Catch:{ EOFException -> 0x00eb }
            r3 = r1 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != 0) goto L_0x0045
            r3 = r1 & 127(0x7f, float:1.78E-43)
            r6 = 1
            r8 = 0
            goto L_0x0068
        L_0x0045:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r3 != r6) goto L_0x0051
            r3 = r1 & 31
            r6 = 2
            r8 = 128(0x80, float:1.794E-43)
            goto L_0x0068
        L_0x0051:
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r3 != r6) goto L_0x005d
            r3 = r1 & 15
            r6 = 3
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0068
        L_0x005d:
            r3 = r1 & 248(0xf8, float:3.48E-43)
            r6 = 240(0xf0, float:3.36E-43)
            if (r3 != r6) goto L_0x00ce
            r3 = r1 & 7
            r6 = 4
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x0068:
            long r9 = r7.f2411     // Catch:{ EOFException -> 0x00eb }
            long r11 = (long) r6     // Catch:{ EOFException -> 0x00eb }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x009f
        L_0x006f:
            if (r2 >= r6) goto L_0x0086
            long r9 = (long) r2     // Catch:{ EOFException -> 0x00eb }
            byte r1 = r7.m2847((long) r9)     // Catch:{ EOFException -> 0x00eb }
            r13 = r1 & 192(0xc0, float:2.69E-43)
            if (r13 != r4) goto L_0x0082
            int r3 = r3 << 6
            r1 = r1 & 63
            r3 = r3 | r1
            int r2 = r2 + 1
            goto L_0x006f
        L_0x0082:
            r7.m2896((long) r9)     // Catch:{ EOFException -> 0x00eb }
            goto L_0x00d3
        L_0x0086:
            r7.m2896((long) r11)     // Catch:{ EOFException -> 0x00eb }
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r1) goto L_0x008f
            goto L_0x00d3
        L_0x008f:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x009a
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r1) goto L_0x009a
            goto L_0x00d3
        L_0x009a:
            if (r3 >= r8) goto L_0x009d
            goto L_0x00d3
        L_0x009d:
            r5 = r3
            goto L_0x00d3
        L_0x009f:
            java.io.EOFException r14 = new java.io.EOFException     // Catch:{ EOFException -> 0x00eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r3 = "size < "
            r2.<init>(r3)     // Catch:{ EOFException -> 0x00eb }
            r2.append(r6)     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch:{ EOFException -> 0x00eb }
            long r3 = r7.f2411     // Catch:{ EOFException -> 0x00eb }
            r2.append(r3)     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r3 = " (to read code point prefixed 0x"
            r2.append(r3)     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ EOFException -> 0x00eb }
            r2.append(r1)     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ EOFException -> 0x00eb }
            java.lang.String r1 = r2.toString()     // Catch:{ EOFException -> 0x00eb }
            r14.<init>(r1)     // Catch:{ EOFException -> 0x00eb }
            throw r14     // Catch:{ EOFException -> 0x00eb }
        L_0x00ce:
            r1 = 1
            r7.m2896((long) r1)     // Catch:{ EOFException -> 0x00eb }
        L_0x00d3:
            boolean r1 = java.lang.Character.isISOControl(r5)     // Catch:{ EOFException -> 0x00eb }
            if (r1 == 0) goto L_0x00e0
            boolean r1 = java.lang.Character.isWhitespace(r5)     // Catch:{ EOFException -> 0x00eb }
            if (r1 != 0) goto L_0x00e0
            return r0
        L_0x00e0:
            int r14 = r14 + 1
            goto L_0x001b
        L_0x00e4:
            java.io.EOFException r14 = new java.io.EOFException     // Catch:{ EOFException -> 0x00eb }
            r14.<init>()     // Catch:{ EOFException -> 0x00eb }
            throw r14     // Catch:{ EOFException -> 0x00eb }
        L_0x00ea:
            return r2
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.isPlaintext(o.jH):boolean");
    }

    private boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !str.equalsIgnoreCase("identity");
    }
}
