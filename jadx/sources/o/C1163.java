package o;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: o.ɟі  reason: contains not printable characters */
class C1163 {

    /* renamed from: ı  reason: contains not printable characters */
    static final int f6715 = 65536;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f6716 = "com.crashlytics.CollectCustomLogs";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f6717 = "crashlytics-userlog-";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1164 f6718 = new C1164();

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f6719 = ".temp";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1165 f6720;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1075 f6721;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Context f6722;

    /* renamed from: o.ɟі$ɩ  reason: contains not printable characters */
    public interface C1165 {
        /* renamed from: ι  reason: contains not printable characters */
        File m7661();
    }

    C1163(Context context, C1165 r3) {
        this(context, r3, (String) null);
    }

    C1163(Context context, C1165 r2, String str) {
        this.f6722 = context;
        this.f6720 = r2;
        this.f6721 = f6718;
        m7655(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7655(String str) {
        this.f6721.m7424();
        this.f6721 = f6718;
        if (str != null) {
            if (!C3285aw.m1692(this.f6722, f6716, true)) {
                C3263ac.m1563();
            } else {
                m7654(m7648(str), f6715);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7651(long j, String str) {
        this.f6721.m7425(j, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public C0754 m7649() {
        return this.f6721.m7421();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public byte[] m7652() {
        return this.f6721.m7422();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7653() {
        this.f6721.m7423();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m7650(Set<String> set) {
        File[] listFiles = this.f6720.m7661().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m7647(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m7654(File file, int i) {
        this.f6721 = new C1354(file, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private File m7648(String str) {
        StringBuilder sb = new StringBuilder(f6717);
        sb.append(str);
        sb.append(f6719);
        return new File(this.f6720.m7661(), sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private String m7647(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(f6719);
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    /* renamed from: o.ɟі$ı  reason: contains not printable characters */
    static final class C1164 implements C1075 {
        /* renamed from: ı  reason: contains not printable characters */
        public final C0754 m7656() {
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final byte[] m7657() {
            return null;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m7658() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7659() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m7660(long j, String str) {
        }

        private C1164() {
        }
    }
}
