package o;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bd  reason: case insensitive filesystem */
public class C3293bd implements C3290ba {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f1742;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final File f1743;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f1744;

    /* renamed from: Ι  reason: contains not printable characters */
    private aE f1745 = new aE(this.f1746);

    /* renamed from: ι  reason: contains not printable characters */
    private final File f1746;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private File f1747 = new File(this.f1743, this.f1744);

    public C3293bd(Context context, File file, String str, String str2) {
        this.f1742 = context;
        this.f1743 = file;
        this.f1744 = str2;
        this.f1746 = new File(this.f1743, str);
        if (!this.f1747.exists()) {
            this.f1747.mkdirs();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1768(byte[] bArr) {
        this.f1745.m1477(bArr, bArr.length);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m1772() {
        return this.f1745.m1475();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1773(String str) {
        FileInputStream fileInputStream;
        this.f1745.close();
        File file = this.f1746;
        File file2 = new File(this.f1747, str);
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = m1770(file2);
                C3285aw.m1685(fileInputStream, outputStream, new byte[1024]);
                C3285aw.m1667((Closeable) fileInputStream);
                C3285aw.m1667((Closeable) outputStream);
                file.delete();
                this.f1745 = new aE(this.f1746);
            } catch (Throwable th) {
                th = th;
                C3285aw.m1667((Closeable) fileInputStream);
                C3285aw.m1667((Closeable) outputStream);
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C3285aw.m1667((Closeable) fileInputStream);
            C3285aw.m1667((Closeable) outputStream);
            file.delete();
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public OutputStream m1770(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<File> m1771() {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f1747.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1774(List<File> list) {
        for (File next : list) {
            Context context = this.f1742;
            new Object[1][0] = next.getName();
            C3285aw.m1690(context);
            next.delete();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<File> m1767() {
        return Arrays.asList(this.f1747.listFiles());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1766() {
        try {
            this.f1745.close();
        } catch (IOException unused) {
        }
        this.f1746.delete();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m1769() {
        return this.f1745.m1479();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m1775(int i, int i2) {
        return (this.f1745.m1475() + 4) + i <= i2;
    }
}
