package o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: o.ιӷ  reason: contains not printable characters */
public final class C2078 {

    /* renamed from: ı  reason: contains not printable characters */
    public final long f10157;

    public C2078() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2078 m11009(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C2078(Long.parseLong(jsonReader.nextString()));
                } else {
                    C2078 r3 = new C2078(jsonReader.nextLong());
                    jsonReader.close();
                    return r3;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    private C2078(long j) {
        this();
        this.f10157 = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.f10157);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2078) && this.f10157 == ((C2078) obj).f10157;
    }

    public final int hashCode() {
        long j = this.f10157;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }
}
