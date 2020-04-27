package o;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: o.bf  reason: case insensitive filesystem */
public final class C3295bf extends C3293bd {
    public C3295bf(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final OutputStream m1778(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
