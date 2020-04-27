package o;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* renamed from: o.ŀƖ  reason: contains not printable characters */
final class C0496 {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f4161 = "installedAt";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f4162 = "activity";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f4163 = "sessionId";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f4164 = "exceptionName";

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long f4165;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0519 f4166;

    /* renamed from: ȷ  reason: contains not printable characters */
    public final Map<String, Object> f4167;

    /* renamed from: ɪ  reason: contains not printable characters */
    private String f4168;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C0497 f4169;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final String f4170;

    /* renamed from: І  reason: contains not printable characters */
    public final String f4171;

    /* renamed from: і  reason: contains not printable characters */
    public final Map<String, Object> f4172;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Map<String, String> f4173;

    /* renamed from: o.ŀƖ$ɩ  reason: contains not printable characters */
    enum C0497 {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static If m4876(C0497 r1, Activity activity) {
        return new If(r1).m4878((Map<String, String>) Collections.singletonMap(f4162, activity.getClass().getName()));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static If m4875(long j) {
        return new If(C0497.INSTALL).m4878((Map<String, String>) Collections.singletonMap(f4161, String.valueOf(j)));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static If m4873(String str) {
        return new If(C0497.CRASH).m4878((Map<String, String>) Collections.singletonMap(f4163, str));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static If m4871(String str, String str2) {
        return m4873(str).m4881((Map<String, Object>) Collections.singletonMap(f4164, str2));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static If m4872(C2863 r2) {
        return new If(C0497.CUSTOM).m4880(r2.m14859()).m4881(r2.m14451());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static If m4874(C0320<?> r2) {
        return new If(C0497.PREDEFINED).m4877(r2.m4388()).m4882(r2.m4387()).m4881(r2.m14451());
    }

    private C0496(C0519 r1, long j, C0497 r4, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f4166 = r1;
        this.f4165 = j;
        this.f4169 = r4;
        this.f4173 = map;
        this.f4171 = str;
        this.f4172 = map2;
        this.f4170 = str2;
        this.f4167 = map3;
    }

    /* renamed from: o.ŀƖ$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        Map<String, String> f4174 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        final long f4175 = System.currentTimeMillis();

        /* renamed from: ɩ  reason: contains not printable characters */
        String f4176 = null;

        /* renamed from: ɹ  reason: contains not printable characters */
        String f4177 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        final C0497 f4178;

        /* renamed from: ι  reason: contains not printable characters */
        Map<String, Object> f4179 = null;

        /* renamed from: Ӏ  reason: contains not printable characters */
        Map<String, Object> f4180 = null;

        public If(C0497 r3) {
            this.f4178 = r3;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public If m4878(Map<String, String> map) {
            this.f4174 = map;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public If m4880(String str) {
            this.f4176 = str;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public If m4881(Map<String, Object> map) {
            this.f4179 = map;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public If m4877(String str) {
            this.f4177 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public If m4882(Map<String, Object> map) {
            this.f4180 = map;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public C0496 m4879(C0519 r13) {
            return new C0496(r13, this.f4175, this.f4178, this.f4174, this.f4176, this.f4179, this.f4177, this.f4180);
        }
    }

    public final String toString() {
        if (this.f4168 == null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(getClass().getSimpleName());
            sb.append(": timestamp=");
            sb.append(this.f4165);
            sb.append(", type=");
            sb.append(this.f4169);
            sb.append(", details=");
            sb.append(this.f4173);
            sb.append(", customType=");
            sb.append(this.f4171);
            sb.append(", customAttributes=");
            sb.append(this.f4172);
            sb.append(", predefinedType=");
            sb.append(this.f4170);
            sb.append(", predefinedAttributes=");
            sb.append(this.f4167);
            sb.append(", metadata=[");
            sb.append(this.f4166);
            sb.append("]]");
            this.f4168 = sb.toString();
        }
        return this.f4168;
    }
}
