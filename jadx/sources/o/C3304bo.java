package o;

import android.content.Context;
import java.io.File;

/* renamed from: o.bo  reason: case insensitive filesystem */
public final class C3304bo implements C3303bn {

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f1774;

    public C3304bo(C3269ai aiVar) {
        if (aiVar.m1589() != null) {
            this.f1774 = aiVar.m1589();
            aiVar.m1593();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final File m1824() {
        File filesDir = this.f1774.getFilesDir();
        if (filesDir == null) {
            C3263ac.m1563();
            return null;
        } else if (filesDir.exists() || filesDir.mkdirs()) {
            return filesDir;
        } else {
            C3263ac.m1563();
            return null;
        }
    }
}
