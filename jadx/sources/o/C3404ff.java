package o;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/io/Writer;", "p0", "", "p1", "", "Ljava/io/Reader;", "ı", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "", "ǃ", "(Ljava/io/Reader;)Ljava/lang/String;"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.ff  reason: case insensitive filesystem */
public final class C3404ff {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String m2294(Reader reader) {
        fM.m2254(reader, "");
        StringWriter stringWriter = new StringWriter();
        m2293$default(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        fM.m2252((Object) stringWriter2, "");
        return stringWriter2;
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ long m2293$default(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m2292(reader, writer, i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final long m2292(Reader reader, Writer writer, int i) {
        fM.m2254(reader, "");
        fM.m2254(writer, "");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }
}
