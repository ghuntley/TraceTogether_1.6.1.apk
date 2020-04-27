package o;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0016\u0018\u00002\u00020\u000eB'\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lo/eX;", "Ljava/io/File;", "ι", "Ljava/io/File;", "ǃ", "ı", "", "ɩ", "Ljava/lang/String;", "p0", "p1", "p2", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "Ljava/io/IOException;"}, k = 1, mv = {1, 1, 15})
public class eX extends IOException {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final File f2116;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f2117;

    /* renamed from: ι  reason: contains not printable characters */
    public final File f2118;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eX(File file, File file2, String str) {
        super(eW.m2181(file, file2, str));
        fM.m2254(file, "");
        this.f2118 = file;
        this.f2116 = file2;
        this.f2117 = str;
    }
}
