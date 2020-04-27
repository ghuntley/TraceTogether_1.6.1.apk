package o;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0002*\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a#\u0010\n\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/nio/charset/Charset;", "p0", "", "Ljava/io/File;", "ι", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "", "(Ljava/io/File;[B)V", "p1", "ɩ", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/fc")
/* renamed from: o.fe  reason: case insensitive filesystem */
public class C3403fe extends C3399fa {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        o.eY.m2182(r0, r2);
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2290(java.io.File r2, byte[] r3) {
        /*
            java.lang.String r0 = ""
            o.fM.m2254(r2, r0)
            o.fM.m2254(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch:{ all -> 0x001e }
            r1.write(r3)     // Catch:{ all -> 0x001e }
            o.dF r3 = o.dF.f2032     // Catch:{ all -> 0x001e }
            o.eY.m2182(r0, r2)
            return
        L_0x001e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r3 = move-exception
            o.eY.m2182(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3403fe.m2290(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        o.eY.m2182(r1, r2);
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m2289(java.io.File r1, java.nio.charset.Charset r2) {
        /*
            java.lang.String r0 = ""
            o.fM.m2254(r1, r0)
            o.fM.m2254(r2, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r0, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0 = r1
            java.io.InputStreamReader r0 = (java.io.InputStreamReader) r0     // Catch:{ all -> 0x0026 }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = o.C3404ff.m2294(r0)     // Catch:{ all -> 0x0026 }
            o.eY.m2182(r1, r2)
            return r0
        L_0x0026:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            o.eY.m2182(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3403fe.m2289(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: ι$default  reason: contains not printable characters */
    public static /* synthetic */ String m2291$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = gL.f2204;
        }
        return C3401fc.m2289(file, charset);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final void m2287(File file, String str, Charset charset) {
        fM.m2254(file, "");
        fM.m2254(str, "");
        fM.m2254(charset, "");
        byte[] bytes = str.getBytes(charset);
        fM.m2252((Object) bytes, "");
        C3401fc.m2290(file, bytes);
    }

    /* renamed from: ɩ$default  reason: contains not printable characters */
    public static /* synthetic */ void m2288$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = gL.f2204;
        }
        C3401fc.m2287(file, str, charset);
    }
}
