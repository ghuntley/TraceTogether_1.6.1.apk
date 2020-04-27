package o;

import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/fb;", "p0", "Lo/eV;", "Ljava/io/File;", "ǃ", "(Ljava/io/File;Lo/fb;)Lo/eV;", "ι", "(Ljava/io/File;)Lo/eV;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/fc")
/* renamed from: o.fd  reason: case insensitive filesystem */
class C3402fd extends C3403fe {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final eV m2285(File file, C3400fb fbVar) {
        fM.m2254(file, "");
        fM.m2254(fbVar, "");
        return new eV(file, fbVar);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final eV m2286(File file) {
        fM.m2254(file, "");
        return C3401fc.m2285(file, C3400fb.BOTTOM_UP);
    }
}
