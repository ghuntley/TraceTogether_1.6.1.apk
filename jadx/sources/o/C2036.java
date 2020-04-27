package o;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ιϧ  reason: contains not printable characters */
public final class C2036 {

    /* renamed from: ι  reason: contains not printable characters */
    private final DateFormat f10066 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new o.C1169((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new o.C1701((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return o.C0875.f5659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new o.C1701((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new o.C1701((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: ււ (r2v4 'e' o.ււ A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C1367 m10907(o.C0995 r2) {
        /*
            r2.m7095()     // Catch:{ EOFException -> 0x0024, ււ -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            o.Ա<o.ɪʙ> r1 = o.C2700.f12467     // Catch:{ EOFException -> 0x000d, ււ -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.m15434(r2)     // Catch:{ EOFException -> 0x000d, ււ -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            o.ɪʙ r2 = (o.C1367) r2     // Catch:{ EOFException -> 0x000d, ււ -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            o.ʬǃ r0 = new o.ʬǃ
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            o.ɟլ r0 = new o.ɟլ
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            o.ʬǃ r0 = new o.ʬǃ
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            o.ǀլ r2 = o.C0875.f5659
            return r2
        L_0x002b:
            o.ʬǃ r0 = new o.ʬǃ
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2036.m10907(o.ȿȷ):o.ɪʙ");
    }

    /* renamed from: o.ιϧ$ɩ  reason: contains not printable characters */
    public static final class C2037 extends Writer {

        /* renamed from: ı  reason: contains not printable characters */
        private final Appendable f10067;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final If f10068 = new If();

        public final void close() {
        }

        public final void flush() {
        }

        public C2037(Appendable appendable) {
            this.f10067 = appendable;
        }

        public final void write(char[] cArr, int i, int i2) {
            If ifR = this.f10068;
            ifR.f10069 = cArr;
            this.f10067.append(ifR, i, i2 + i);
        }

        public final void write(int i) {
            this.f10067.append((char) i);
        }

        /* renamed from: o.ιϧ$ɩ$If */
        static class If implements CharSequence {

            /* renamed from: ǃ  reason: contains not printable characters */
            char[] f10069;

            If() {
            }

            public final int length() {
                return this.f10069.length;
            }

            public final char charAt(int i) {
                return this.f10069[i];
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f10069, i, i2 - i);
            }
        }
    }

    public C2036() {
        this.f10066.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m10909(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null || obj == JSONObject.NULL) {
            return JSONObject.NULL;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", obj.toString());
                return jSONObject;
            } catch (JSONException e) {
                throw new RuntimeException("Error encoding Long.", e);
            }
        } else if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z = obj instanceof JSONObject)) || ((z2 = obj instanceof JSONArray))) {
            return obj;
        } else {
            if (obj instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                Map map = (Map) obj;
                for (Object next : map.keySet()) {
                    if (next instanceof String) {
                        try {
                            jSONObject2.put((String) next, m10909(map.get(next)));
                        } catch (JSONException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys must be strings.");
                    }
                }
                return jSONObject2;
            } else if (obj instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object r1 : (List) obj) {
                    jSONArray.put(m10909(r1));
                }
                return jSONArray;
            } else if (z) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = (JSONObject) obj;
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    if (next2 != null) {
                        try {
                            jSONObject3.put(next2, m10909(jSONObject4.opt(next2)));
                        } catch (JSONException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys cannot be null.");
                    }
                }
                return jSONObject3;
            } else if (z2) {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = (JSONArray) obj;
                for (int i = 0; i < jSONArray3.length(); i++) {
                    jSONArray2.put(m10909(jSONArray3.opt(i)));
                }
                return jSONArray2;
            } else {
                throw new IllegalArgumentException("Object cannot be encoded in JSON: ".concat(String.valueOf(obj)));
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10908(Object obj) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("@type")) {
                String optString = jSONObject.optString("@type");
                String optString2 = jSONObject.optString("value");
                if (optString.equals("type.googleapis.com/google.protobuf.Int64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Invalid Long format:".concat(String.valueOf(optString2)));
                    }
                } else if (optString.equals("type.googleapis.com/google.protobuf.UInt64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused2) {
                        throw new IllegalArgumentException("Invalid Long format:".concat(String.valueOf(optString2)));
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, m10908(jSONObject.opt(next)));
            }
            return hashMap;
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= jSONArray.length()) {
                    return arrayList;
                }
                arrayList.add(m10908(jSONArray.opt(i)));
                i++;
            }
        } else if (obj == JSONObject.NULL) {
            return null;
        } else {
            throw new IllegalArgumentException("Object cannot be decoded from JSON: ".concat(String.valueOf(obj)));
        }
    }
}
