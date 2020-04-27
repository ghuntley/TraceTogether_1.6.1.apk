package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C2178;

/* renamed from: o.Ϲ  reason: contains not printable characters */
public abstract class C2201 {
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C2196 m11608();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract long m11610();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract Integer m11612();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m11614();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract long m11615();

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public abstract Map<String, String> m11617();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Map<String, String> m11618() {
        return Collections.unmodifiableMap(m11617());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m11611(String str) {
        String str2 = m11617().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m11613(String str) {
        String str2 = m11617().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11616(String str) {
        String str2 = m11617().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2202 m11609() {
        C2178.If ifR = new C2178.If();
        String r1 = m11614();
        if (r1 != null) {
            ifR.f10377 = r1;
            return ifR.m11623(m11612()).m11624(m11608()).m11619(m11610()).m11622(m11615()).m11629(new HashMap(m11617()));
        }
        throw new NullPointerException("Null transportName");
    }

    /* renamed from: o.Ϲ$ı  reason: contains not printable characters */
    public static abstract class C2202 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract C2202 m11619(long j);

        /* renamed from: ı  reason: contains not printable characters */
        public abstract C2201 m11621();

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract C2202 m11622(long j);

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract C2202 m11623(Integer num);

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract C2202 m11624(C2196 r1);

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public abstract Map<String, String> m11625();

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract C2202 m11626(String str);

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract C2202 m11629(Map<String, String> map);

        /* renamed from: ı  reason: contains not printable characters */
        public final C2202 m11620(String str, String str2) {
            m11625().put(str, str2);
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2202 m11627(String str, long j) {
            m11625().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2202 m11628(String str, int i) {
            m11625().put(str, String.valueOf(i));
            return this;
        }
    }
}
