package o;

import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "p0", "p1", "", "p2", "Ι", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {1, 1, 15})
public final class eW {
    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2181(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        fM.m2252((Object) sb2, "");
        return sb2;
    }
}
