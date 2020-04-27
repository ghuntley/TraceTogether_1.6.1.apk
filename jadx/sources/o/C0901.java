package o;

import java.io.File;
import java.io.IOException;

/* renamed from: o.ǃɉ  reason: contains not printable characters */
public class C0901 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f5747;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3303bn f5748;

    public C0901(String str, C3303bn bnVar) {
        this.f5747 = str;
        this.f5748 = bnVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m6680() {
        try {
            return m6678().createNewFile();
        } catch (IOException unused) {
            C3263ac.m1563();
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m6679() {
        return m6678().exists();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m6681() {
        return m6678().delete();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private File m6678() {
        return new File(this.f5748.m1823(), this.f5747);
    }
}
