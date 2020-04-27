package o;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\n0!:\u0003\b\u0004\u0017B\u001b\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bBm\b\u0002\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0001\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0012\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010 J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0002¢\u0006\u0004\b\f\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013"}, d2 = {"Lo/eV;", "Lo/fb;", "Ι", "Lo/fb;", "ɩ", "", "ɹ", "I", "ı", "Lkotlin/Function1;", "Ljava/io/File;", "", "ι", "Lo/fo;", "Lkotlin/Function2;", "Ljava/io/IOException;", "", "Lo/fy;", "ǃ", "Ljava/io/File;", "І", "", "()Ljava/util/Iterator;", "If", "p0", "p1", "<init>", "(Ljava/io/File;Lo/fb;)V", "p2", "p3", "p4", "p5", "(Ljava/io/File;Lo/fb;Lo/fo;Lo/fo;Lo/fy;I)V", "Lo/gB;"}, k = 1, mv = {1, 1, 15})
public final class eV implements gB<File> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final File f2096;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3413fo<File, dF> f2097;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3423fy<File, IOException, dF> f2098;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final int f2099;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3400fb f2100;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C3413fo<File, Boolean> f2101;

    private eV(File file, C3400fb fbVar, C3413fo<? super File, Boolean> foVar, C3413fo<? super File, dF> foVar2, C3423fy<? super File, ? super IOException, dF> fyVar, int i) {
        this.f2096 = file;
        this.f2100 = fbVar;
        this.f2101 = foVar;
        this.f2097 = foVar2;
        this.f2098 = fyVar;
        this.f2099 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ eV(File file, C3400fb fbVar, C3413fo foVar, C3413fo foVar2, C3423fy fyVar, int i, int i2, fL fLVar) {
        this(file, (i2 & 2) != 0 ? C3400fb.TOP_DOWN : fbVar, foVar, foVar2, fyVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public eV(File file, C3400fb fbVar) {
        this(file, fbVar, (C3413fo) null, (C3413fo) null, (C3423fy) null, 0, 32, (fL) null);
        fM.m2254(file, "");
        fM.m2254(fbVar, "");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterator<File> m2171() {
        return new C0163();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\b\"\u0018\u00002\u00020\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/eV$If;", "Ljava/io/File;", "Ι", "Ljava/io/File;", "ι", "()Ljava/io/File;", "ɩ", "ı", "p0", "<init>", "(Ljava/io/File;)V", ""}, k = 1, mv = {1, 1, 15})
    static abstract class If {

        /* renamed from: Ι  reason: contains not printable characters */
        private final File f2102;

        /* renamed from: ı  reason: contains not printable characters */
        public abstract File m2172();

        public If(File file) {
            fM.m2254(file, "");
            this.f2102 = file;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final File m2173() {
            return this.f2102;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\"\u0018\u00002\u00020\u0005B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/eV$ı;", "Ljava/io/File;", "p0", "<init>", "(Ljava/io/File;)V", "Lo/eV$If;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.eV$ı  reason: contains not printable characters */
    static abstract class C0162 extends If {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0162(File file) {
            super(file);
            fM.m2254(file, "");
            if (dD.f2028) {
                boolean isDirectory = file.isDirectory();
                if (dD.f2028 && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\b0\u0012:\u0003\u0005\u000e\u000fB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u000b\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/eV$ɩ;", "Ljava/util/ArrayDeque;", "Lo/eV$If;", "Ι", "Ljava/util/ArrayDeque;", "ɩ", "", "()V", "Ljava/io/File;", "p0", "Lo/eV$ı;", "ι", "(Ljava/io/File;)Lo/eV$ı;", "()Ljava/io/File;", "ı", "if", "<init>", "(Lo/eV;)V", "Lo/dE;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.eV$ɩ  reason: contains not printable characters */
    final class C0163 extends dE<File> {

        /* renamed from: Ι  reason: contains not printable characters */
        private final ArrayDeque<If> f2104 = new ArrayDeque<>();

        public C0163() {
            if (eV.this.f2096.isDirectory()) {
                this.f2104.push(m2175(eV.this.f2096));
            } else if (eV.this.f2096.isFile()) {
                this.f2104.push(new C0164(this, eV.this.f2096));
            } else {
                m2054();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m2176() {
            File r0 = m2174();
            if (r0 != null) {
                m2056(r0);
            } else {
                m2054();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final C0162 m2175(File file) {
            int i = eZ$WhenMappings.f2119[eV.this.f2100.ordinal()];
            if (i == 1) {
                return new Cif(this, file);
            }
            if (i == 2) {
                return new C0165(this, file);
            }
            throw new C3362dq();
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final File m2174() {
            File r1;
            while (true) {
                If peek = this.f2104.peek();
                if (peek == null) {
                    return null;
                }
                r1 = peek.m2172();
                if (r1 == null) {
                    this.f2104.pop();
                } else if (fM.m2257(r1, peek.m2173()) || !r1.isDirectory() || this.f2104.size() >= eV.this.f2099) {
                    return r1;
                } else {
                    this.f2104.push(m2175(r1));
                }
            }
            return r1;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003"}, d2 = {"Lo/eV$ɩ$ɩ;", "", "ı", "Z", "Ι", "", "ǃ", "I", "", "Ljava/io/File;", "ι", "[Ljava/io/File;", "()Ljava/io/File;", "p0", "<init>", "(Lo/eV$ɩ;Ljava/io/File;)V", "Lo/eV$ı;"}, k = 1, mv = {1, 1, 15})
        /* renamed from: o.eV$ɩ$ɩ  reason: contains not printable characters */
        final class C0165 extends C0162 {

            /* renamed from: ı  reason: contains not printable characters */
            private boolean f2111;

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f2112;

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ C0163 f2113;

            /* renamed from: Ι  reason: contains not printable characters */
            private boolean f2114;

            /* renamed from: ι  reason: contains not printable characters */
            private File[] f2115;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0165(C0163 r2, File file) {
                super(file);
                fM.m2254(file, "");
                this.f2113 = r2;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final File m2179() {
                if (!this.f2111 && this.f2115 == null) {
                    C3413fo r0 = eV.this.f2101;
                    if (r0 != null && !((Boolean) r0.m2298(m2173())).booleanValue()) {
                        return null;
                    }
                    this.f2115 = m2173().listFiles();
                    if (this.f2115 == null) {
                        C3423fy r02 = eV.this.f2098;
                        if (r02 != null) {
                            dF dFVar = (dF) r02.m2299(m2173(), new eT(m2173(), (File) null, "Cannot list files in a directory", 2, (fL) null));
                        }
                        this.f2111 = true;
                    }
                }
                File[] fileArr = this.f2115;
                if (fileArr != null) {
                    int i = this.f2112;
                    if (fileArr == null) {
                        fM.m2256();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f2115;
                        if (fileArr2 == null) {
                            fM.m2256();
                        }
                        int i2 = this.f2112;
                        this.f2112 = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f2114) {
                    this.f2114 = true;
                    return m2173();
                }
                C3413fo r03 = eV.this.f2097;
                if (r03 != null) {
                    dF dFVar2 = (dF) r03.m2298(m2173());
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n"}, d2 = {"Lo/eV$ɩ$if;", "", "Ι", "I", "", "Ljava/io/File;", "ǃ", "[Ljava/io/File;", "ɩ", "", "Z", "ı", "()Ljava/io/File;", "p0", "<init>", "(Lo/eV$ɩ;Ljava/io/File;)V", "Lo/eV$ı;"}, k = 1, mv = {1, 1, 15})
        /* renamed from: o.eV$ɩ$if  reason: invalid class name */
        final class Cif extends C0162 {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ C0163 f2105;

            /* renamed from: ǃ  reason: contains not printable characters */
            private File[] f2106;

            /* renamed from: ɩ  reason: contains not printable characters */
            private boolean f2107;

            /* renamed from: Ι  reason: contains not printable characters */
            private int f2108;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Cif(C0163 r2, File file) {
                super(file);
                fM.m2254(file, "");
                this.f2105 = r2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
                if (r0.length == 0) goto L_0x008d;
             */
            /* renamed from: ı  reason: contains not printable characters */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File m2177() {
                /*
                    r10 = this;
                    boolean r0 = r10.f2107
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    o.eV$ɩ r0 = r10.f2105
                    o.eV r0 = o.eV.this
                    o.fo r0 = r0.f2101
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.m2173()
                    java.lang.Object r0 = r0.m2298(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f2107 = r0
                    java.io.File r0 = r10.m2173()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f2106
                    if (r0 == 0) goto L_0x004c
                    int r2 = r10.f2108
                    if (r0 != 0) goto L_0x0033
                    o.fM.m2256()
                L_0x0033:
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0037
                    goto L_0x004c
                L_0x0037:
                    o.eV$ɩ r0 = r10.f2105
                    o.eV r0 = o.eV.this
                    o.fo r0 = r0.f2097
                    if (r0 == 0) goto L_0x004b
                    java.io.File r2 = r10.m2173()
                    java.lang.Object r0 = r0.m2298(r2)
                    o.dF r0 = (o.dF) r0
                L_0x004b:
                    return r1
                L_0x004c:
                    java.io.File[] r0 = r10.f2106
                    if (r0 != 0) goto L_0x00a2
                    java.io.File r0 = r10.m2173()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f2106 = r0
                    java.io.File[] r0 = r10.f2106
                    if (r0 != 0) goto L_0x0081
                    o.eV$ɩ r0 = r10.f2105
                    o.eV r0 = o.eV.this
                    o.fy r0 = r0.f2098
                    if (r0 == 0) goto L_0x0081
                    java.io.File r2 = r10.m2173()
                    o.eT r9 = new o.eT
                    java.io.File r4 = r10.m2173()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.m2299(r2, r9)
                    o.dF r0 = (o.dF) r0
                L_0x0081:
                    java.io.File[] r0 = r10.f2106
                    if (r0 == 0) goto L_0x008d
                    if (r0 != 0) goto L_0x008a
                    o.fM.m2256()
                L_0x008a:
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x00a2
                L_0x008d:
                    o.eV$ɩ r0 = r10.f2105
                    o.eV r0 = o.eV.this
                    o.fo r0 = r0.f2097
                    if (r0 == 0) goto L_0x00a1
                    java.io.File r2 = r10.m2173()
                    java.lang.Object r0 = r0.m2298(r2)
                    o.dF r0 = (o.dF) r0
                L_0x00a1:
                    return r1
                L_0x00a2:
                    java.io.File[] r0 = r10.f2106
                    if (r0 != 0) goto L_0x00a9
                    o.fM.m2256()
                L_0x00a9:
                    int r1 = r10.f2108
                    int r2 = r1 + 1
                    r10.f2108 = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.eV.C0163.Cif.m2177():java.io.File");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/eV$ɩ$ı;", "", "Ι", "Z", "Ljava/io/File;", "ı", "()Ljava/io/File;", "p0", "<init>", "(Lo/eV$ɩ;Ljava/io/File;)V", "Lo/eV$If;"}, k = 1, mv = {1, 1, 15})
        /* renamed from: o.eV$ɩ$ı  reason: contains not printable characters */
        final class C0164 extends If {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C0163 f2109;

            /* renamed from: Ι  reason: contains not printable characters */
            private boolean f2110;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0164(C0163 r2, File file) {
                super(file);
                fM.m2254(file, "");
                this.f2109 = r2;
                if (dD.f2028) {
                    boolean isFile = file.isFile();
                    if (dD.f2028 && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final File m2178() {
                if (this.f2110) {
                    return null;
                }
                this.f2110 = true;
                return m2173();
            }
        }
    }
}
