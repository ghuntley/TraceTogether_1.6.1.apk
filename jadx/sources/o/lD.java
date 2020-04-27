package o;

import android.os.Environment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0018J!\u0010\b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0019\"\u00020\u0005¢\u0006\u0004\b\b\u0010\u001bJ!\u0010\u000f\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0019\"\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u001bJ\u000f\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\b\u0010\u001cJ!\u0010\f\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0019\"\u00020\u0005¢\u0006\u0004\b\f\u0010\u001bJ'\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0019H\u0002¢\u0006\u0004\b\u0002\u0010\u001eJ!\u0010\u0004\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0019\"\u00020\u0005¢\u0006\u0004\b\u0004\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00108C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e"}, d2 = {"Lo/lD;", "Ljava/lang/StringBuffer;", "ɩ", "Ljava/lang/StringBuffer;", "ı", "", "Ӏ", "Ljava/lang/String;", "ǃ", "Ljava/io/BufferedWriter;", "Ɩ", "Ljava/io/BufferedWriter;", "ι", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "Ι", "", "()Z", "", "J", "І", "", "()[Z", "p0", "(Ljava/lang/String;)Ljava/io/BufferedWriter;", "", "", "([Ljava/lang/String;)V", "()Ljava/io/BufferedWriter;", "p1", "(Ljava/lang/String;[Ljava/lang/String;)V", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class lD {

    /* renamed from: ı  reason: contains not printable characters */
    private static final SimpleDateFormat f2732 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static BufferedWriter f2733;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final SimpleDateFormat f2734 = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static StringBuffer f2735 = new StringBuffer();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final lD f2736 = new lD();

    /* renamed from: ι  reason: contains not printable characters */
    private static long f2737;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static String f2738 = "";

    private lD() {
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m3381() {
        boolean[] r0 = m3382();
        return r0[1] & r0[0];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean[] m3382() {
        boolean z;
        boolean z2;
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState != null) {
            int hashCode = externalStorageState.hashCode();
            if (hashCode != 1242932856) {
                if (hashCode == 1299749220 && externalStorageState.equals("mounted_ro")) {
                    z2 = true;
                    z = false;
                    return new boolean[]{z2, z};
                }
            } else if (externalStorageState.equals("mounted")) {
                z2 = true;
                z = true;
                return new boolean[]{z2, z};
            }
        }
        z2 = false;
        z = false;
        return new boolean[]{z2, z};
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3387(String... strArr) {
        fM.m2254(strArr, "");
        m3380("INFO", strArr);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3384(String... strArr) {
        fM.m2254(strArr, "");
        m3380("WARN", strArr);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3385(String... strArr) {
        fM.m2254(strArr, "");
        m3380("DEBUG", strArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3386(String... strArr) {
        fM.m2254(strArr, "");
        m3380("ERROR", strArr);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final BufferedWriter m3383(String str) {
        StringBuilder sb = new StringBuilder();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        fM.m2252((Object) externalStorageDirectory, "");
        sb.append(externalStorageDirectory.getAbsolutePath());
        sb.append("/");
        sb.append("SDLogging");
        File file = new File(sb.toString());
        file.mkdirs();
        Writer fileWriter = new FileWriter(new File(file, "TraceTogether_" + str + ".txt"), true);
        return fileWriter instanceof BufferedWriter ? (BufferedWriter) fileWriter : new BufferedWriter(fileWriter, 8192);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final BufferedWriter m3379() {
        BufferedWriter bufferedWriter;
        String format = f2734.format(new Date());
        if (fM.m2257(format, f2738)) {
            bufferedWriter = f2733;
            if (bufferedWriter == null) {
                fM.m2253("cachedFileWriter");
            }
        } else {
            BufferedWriter bufferedWriter2 = f2733;
            if (bufferedWriter2 != null) {
                if (bufferedWriter2 == null) {
                    fM.m2253("cachedFileWriter");
                }
                bufferedWriter2.flush();
                BufferedWriter bufferedWriter3 = f2733;
                if (bufferedWriter3 == null) {
                    fM.m2253("cachedFileWriter");
                }
                bufferedWriter3.close();
            }
            fM.m2252((Object) format, "");
            f2733 = m3383(format);
            f2738 = format;
            bufferedWriter = f2733;
            if (bufferedWriter == null) {
                fM.m2253("cachedFileWriter");
            }
        }
        return bufferedWriter;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m3380(String str, String[] strArr) {
        if (m3381() && strArr != null) {
            String format = f2732.format(new Date());
            String r13 = dM.m2071$default(strArr, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3413fo) null, 62, (Object) null);
            StringBuffer stringBuffer = f2735;
            stringBuffer.append(format + ' ' + str + ' ' + r13 + 10);
            try {
                BufferedWriter r132 = m3379();
                r132.write(f2735.toString());
                f2735 = new StringBuffer();
                if (System.currentTimeMillis() - f2737 > ((long) C3273am.f1527)) {
                    r132.flush();
                    f2737 = System.currentTimeMillis();
                }
            } catch (IOException e) {
                StringBuffer stringBuffer2 = f2735;
                stringBuffer2.append(format + " ERROR SDLog ??? IOException while writing to SDLog: " + e.getMessage() + 10);
            }
        }
    }
}
