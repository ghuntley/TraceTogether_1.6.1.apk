package o;

import android.util.SparseArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ıȣ  reason: contains not printable characters */
public final class C0311 extends C1590 {

    /* renamed from: o.ıȣ$ɩ  reason: contains not printable characters */
    public enum C0312 {
        OK,
        CANCELLED,
        UNKNOWN,
        INVALID_ARGUMENT,
        DEADLINE_EXCEEDED,
        NOT_FOUND,
        ALREADY_EXISTS,
        PERMISSION_DENIED,
        RESOURCE_EXHAUSTED,
        FAILED_PRECONDITION,
        ABORTED,
        OUT_OF_RANGE,
        UNIMPLEMENTED,
        INTERNAL,
        UNAVAILABLE,
        DATA_LOSS,
        UNAUTHENTICATED;

        static {
            int i;
            SparseArray sparseArray = new SparseArray();
            C0312[] values = values();
            int length = values.length;
            while (i < length) {
                C0312 r4 = values[i];
                C0312 r5 = (C0312) sparseArray.get(r4.ordinal());
                if (r5 == null) {
                    sparseArray.put(r4.ordinal(), r4);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Code value duplication between ");
                    sb.append(r5);
                    sb.append("&");
                    sb.append(r4.name());
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        static C0312 m4382(int i) {
            if (i == 200) {
                return OK;
            }
            if (i == 409) {
                return ABORTED;
            }
            if (i == 429) {
                return RESOURCE_EXHAUSTED;
            }
            if (i == 400) {
                return INVALID_ARGUMENT;
            }
            if (i == 401) {
                return UNAUTHENTICATED;
            }
            if (i == 403) {
                return PERMISSION_DENIED;
            }
            if (i == 404) {
                return NOT_FOUND;
            }
            if (i == 503) {
                return UNAVAILABLE;
            }
            if (i == 504) {
                return DEADLINE_EXCEEDED;
            }
            switch (i) {
                case 499:
                    return CANCELLED;
                case 500:
                    return INTERNAL;
                case 501:
                    return UNIMPLEMENTED;
                default:
                    return UNKNOWN;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C0311 m4381(C0312 r4, String str, C2036 r6) {
        String name = r4.name();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            if (jSONObject.opt("status") instanceof String) {
                r4 = C0312.valueOf(jSONObject.getString("status"));
                name = r4.name();
            }
            if ((jSONObject.opt("message") instanceof String) && !jSONObject.getString("message").isEmpty()) {
                name = jSONObject.getString("message");
            }
            Object opt = jSONObject.opt("details");
            if (opt != null) {
                r6.m10908(opt);
            }
        } catch (IllegalArgumentException unused) {
            r4 = C0312.INTERNAL;
            name = r4.name();
        } catch (JSONException unused2) {
        }
        if (r4 == C0312.OK) {
            return null;
        }
        return new C0311(name);
    }

    C0311(String str) {
        super(str);
    }

    C0311(String str, Throwable th) {
        super(str, th);
    }

    public C0311(String str, String str2) {
        super(str, str2);
    }
}
