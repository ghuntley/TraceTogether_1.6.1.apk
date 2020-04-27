package o;

import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/io/File;", "ı", "(Ljava/io/File;)Z"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/fc")
/* renamed from: o.fi  reason: case insensitive filesystem */
public class C3407fi extends C3402fd {
    /* renamed from: ı  reason: contains not printable characters */
    public static final boolean m2295(File file) {
        fM.m2254(file, "");
        Iterator r4 = C3401fc.m2286(file).m2305();
        while (true) {
            boolean z = true;
            while (true) {
                if (!r4.hasNext()) {
                    return z;
                }
                File file2 = (File) r4.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }
}
