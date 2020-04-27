package o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: o.ǀΙ  reason: contains not printable characters */
class C0864 extends FileOutputStream {

    /* renamed from: ı  reason: contains not printable characters */
    public static final String f5630 = ".cls";

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final FilenameFilter f5631 = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            return str.endsWith(C0864.f5632);
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String f5632 = ".cls_temp";

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f5633;

    /* renamed from: ι  reason: contains not printable characters */
    private File f5634;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f5635;

    /* renamed from: і  reason: contains not printable characters */
    private File f5636;

    public C0864(String str, String str2) {
        this(new File(str), str2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0864(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = ".cls_temp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            r3.<init>(r0)
            r0 = 0
            r3.f5635 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = java.io.File.separator
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.f5633 = r4
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r3.f5633
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            r3.f5634 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0864.<init>(java.io.File, java.lang.String):void");
    }

    public synchronized void close() {
        if (!this.f5635) {
            this.f5635 = true;
            super.flush();
            super.close();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5633);
            sb.append(f5630);
            File file = new File(sb.toString());
            if (this.f5634.renameTo(file)) {
                this.f5634 = null;
                this.f5636 = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f5634.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder sb2 = new StringBuilder("Could not rename temp file: ");
            sb2.append(this.f5634);
            sb2.append(" -> ");
            sb2.append(file);
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m6427() {
        if (!this.f5635) {
            this.f5635 = true;
            super.flush();
            super.close();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public File m6425() {
        return this.f5636;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public File m6426() {
        return this.f5634;
    }
}
