package o;

import java.io.File;
import java.util.Map;
import o.C1390;

/* renamed from: o.ɨɪ  reason: contains not printable characters */
class C1213 implements C1390 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final File f6886;

    /* renamed from: ı  reason: contains not printable characters */
    public File m7874() {
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m7875() {
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, String> m7876() {
        return null;
    }

    public C1213(File file) {
        this.f6886 = file;
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m7880() {
        for (File file : m7878()) {
            C3263ac.m1563();
            file.getPath();
            file.delete();
        }
        C3263ac.m1563();
        this.f6886.delete();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m7879() {
        return this.f6886.getName();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public File[] m7878() {
        return this.f6886.listFiles();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public C1390.If m7877() {
        return C1390.If.NATIVE;
    }
}
