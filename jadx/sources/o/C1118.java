package o;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C1390;

/* renamed from: o.ɘ  reason: contains not printable characters */
class C1118 implements C1390 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f6625;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, String> f6626 = new HashMap(C1368.f7556);

    /* renamed from: Ι  reason: contains not printable characters */
    private final File[] f6627;

    public C1118(String str, File[] fileArr) {
        this.f6627 = fileArr;
        this.f6625 = str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m7530() {
        return this.f6627[0].getName();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m7534() {
        return this.f6625;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public File m7529() {
        return this.f6627[0];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public File[] m7533() {
        return this.f6627;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, String> m7531() {
        return Collections.unmodifiableMap(this.f6626);
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m7535() {
        for (File file : this.f6627) {
            C3263ac.m1563();
            file.getPath();
            file.delete();
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public C1390.If m7532() {
        return C1390.If.JAVA;
    }
}
