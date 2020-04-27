package o;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: o.Օ  reason: contains not printable characters */
public final class C3059 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final byte f13991 = Byte.parseByte("00001111", 2);

    /* renamed from: ι  reason: contains not printable characters */
    private static final byte f13992 = Byte.parseByte("01110000", 2);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m15611() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f13991 & array[0]) | f13992);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
