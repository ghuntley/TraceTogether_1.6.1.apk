package okhttp3;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import o.jH;
import o.jK;
import okhttp3.internal.Util;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final long contentLength() {
        return writeOrCountBytes((jK) null, true);
    }

    public final void writeTo(jK jKVar) {
        writeOrCountBytes(jKVar, false);
    }

    private long writeOrCountBytes(jK jKVar, boolean z) {
        jH jHVar;
        if (z) {
            jHVar = new jH();
        } else {
            jHVar = jKVar.m2941();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                jHVar.m2899(38);
            }
            String str = this.encodedNames.get(i);
            jHVar.m2880(str, 0, str.length());
            jHVar.m2899(61);
            String str2 = this.encodedValues.get(i);
            jHVar.m2880(str2, 0, str2.length());
        }
        if (!z) {
            return 0;
        }
        long j = jHVar.f2411;
        try {
            jHVar.m2896(jHVar.f2411);
            return j;
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this((Charset) null);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }

        public final Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public final Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }
}
