package o;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C1390;

/* renamed from: o.ɺі  reason: contains not printable characters */
class C1480 implements C1390 {

    /* renamed from: ı  reason: contains not printable characters */
    private final File[] f7938;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, String> f7939;

    /* renamed from: Ι  reason: contains not printable characters */
    private final File f7940;

    public C1480(File file) {
        this(file, Collections.emptyMap());
    }

    public C1480(File file, Map<String, String> map) {
        this.f7940 = file;
        this.f7938 = new File[]{file};
        this.f7939 = new HashMap(map);
        if (this.f7940.length() == 0) {
            this.f7939.putAll(C1368.f7556);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public File m8853() {
        return this.f7940;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public File[] m8857() {
        return this.f7938;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m8854() {
        return m8853().getName();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m8858() {
        String r0 = m8854();
        return r0.substring(0, r0.lastIndexOf(46));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, String> m8855() {
        return Collections.unmodifiableMap(this.f7939);
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m8859() {
        C3263ac.m1563();
        this.f7940.getPath();
        this.f7940.delete();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public C1390.If m8856() {
        return C1390.If.JAVA;
    }
}
