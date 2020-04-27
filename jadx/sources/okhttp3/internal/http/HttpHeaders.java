package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import o.jH;
import o.jM;
import o.jX;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;

public final class HttpHeaders {
    private static final jM QUOTED_STRING_DELIMITERS = jM.m2946("\"\\");
    private static final jM TOKEN_DELIMITERS = jM.m2946("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String next : varyFields(response)) {
            if (!Util.equal(headers.values(next), request.headers(next))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        Set<String> set = emptySet;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (set.isEmpty()) {
                    set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : value.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                parseChallengeHeader(arrayList, new jH().m2863(headers.value(i)));
            }
        }
        return arrayList;
    }

    private static void parseChallengeHeader(List<Challenge> list, jH jHVar) {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipWhitespaceAndCommas(jHVar);
                    str2 = readToken(jHVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipWhitespaceAndCommas = skipWhitespaceAndCommas(jHVar);
                readToken = readToken(jHVar);
                boolean z = false;
                if (readToken == null) {
                    if (jHVar.f2411 == 0) {
                        z = true;
                    }
                    if (z) {
                        list.add(new Challenge(str2, (Map<String, String>) Collections.emptyMap()));
                        return;
                    }
                    return;
                }
                skipAll = skipAll(jHVar, (byte) 61);
                boolean skipWhitespaceAndCommas2 = skipWhitespaceAndCommas(jHVar);
                if (!skipWhitespaceAndCommas) {
                    if (!skipWhitespaceAndCommas2) {
                        if (jHVar.f2411 == 0) {
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int skipAll2 = skipAll + skipAll(jHVar, (byte) 61);
                while (true) {
                    if (readToken == null) {
                        readToken = readToken(jHVar);
                        if (skipWhitespaceAndCommas(jHVar)) {
                            continue;
                            break;
                        }
                        skipAll2 = skipAll(jHVar, (byte) 61);
                    }
                    if (skipAll2 == 0) {
                        continue;
                        break;
                    } else if (skipAll2 <= 1 && !skipWhitespaceAndCommas(jHVar)) {
                        if ((jHVar.f2411 == 0) || jHVar.m2847(0) != 34) {
                            str = readToken(jHVar);
                        } else {
                            str = readQuotedString(jHVar);
                        }
                        if (str != null && ((String) linkedHashMap.put(readToken, str)) == null) {
                            if (!skipWhitespaceAndCommas(jHVar)) {
                                if (!(jHVar.f2411 == 0)) {
                                    return;
                                }
                            }
                            readToken = null;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                str2 = readToken;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(readToken);
            sb.append(repeat('=', skipAll));
            list.add(new Challenge(str2, (Map<String, String>) Collections.singletonMap((Object) null, sb.toString())));
        }
    }

    private static String readQuotedString(jH jHVar) {
        if (jHVar.m2868() == 34) {
            jH jHVar2 = new jH();
            while (true) {
                long r2 = jHVar.m2836(QUOTED_STRING_DELIMITERS);
                if (r2 == -1) {
                    return null;
                }
                if (jHVar.m2847(r2) == 34) {
                    jHVar2.write(jHVar, r2);
                    jHVar.m2868();
                    return jHVar2.m2873();
                } else if (jHVar.f2411 == r2 + 1) {
                    return null;
                } else {
                    jHVar2.write(jHVar, r2);
                    jHVar.m2868();
                    jHVar2.write(jHVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String readToken(jH jHVar) {
        try {
            long r3 = jHVar.m2859(TOKEN_DELIMITERS, 0);
            if (r3 == -1) {
                r3 = jHVar.f2411;
            }
            if (r3 != 0) {
                return jHVar.m2884(r3, jX.f2464);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static boolean skipWhitespaceAndCommas(jH jHVar) {
        boolean z = false;
        while (true) {
            if (!(jHVar.f2411 == 0)) {
                byte r3 = jHVar.m2847(0);
                if (r3 != 44) {
                    if (r3 != 32 && r3 != 9) {
                        break;
                    }
                    jHVar.m2868();
                } else {
                    jHVar.m2868();
                    z = true;
                }
            } else {
                break;
            }
        }
        return z;
    }

    private static int skipAll(jH jHVar, byte b) {
        int i = 0;
        while (true) {
            if ((jHVar.f2411 == 0) || jHVar.m2847(0) != b) {
                return i;
            }
            i++;
            jHVar.m2868();
        }
        return i;
    }
}
