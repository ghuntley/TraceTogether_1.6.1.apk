package okhttp3.internal.http2;

import o.jM;
import okhttp3.Headers;
import okhttp3.internal.Util;

public final class Header {
    public static final jM PSEUDO_PREFIX = jM.m2946(":");
    public static final jM RESPONSE_STATUS = jM.m2946(RESPONSE_STATUS_UTF8);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final jM TARGET_AUTHORITY = jM.m2946(TARGET_AUTHORITY_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final jM TARGET_METHOD = jM.m2946(TARGET_METHOD_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final jM TARGET_PATH = jM.m2946(TARGET_PATH_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final jM TARGET_SCHEME = jM.m2946(TARGET_SCHEME_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    final int hpackSize;
    public final jM name;
    public final jM value;

    interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(String str, String str2) {
        this(jM.m2946(str), jM.m2946(str2));
    }

    public Header(jM jMVar, String str) {
        this(jMVar, jM.m2946(str));
    }

    public Header(jM jMVar, jM jMVar2) {
        this.name = jMVar;
        this.value = jMVar2;
        this.hpackSize = jMVar.m2967() + 32 + jMVar2.m2967();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public final String toString() {
        return Util.format("%s: %s", this.name.m2961(), this.value.m2961());
    }
}
