package okhttp3.internal.ws;

import o.jH;
import o.jM;

public final class WebSocketProtocol {
    static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    static final long CLOSE_MESSAGE_MAX = 123;
    static final int CLOSE_NO_STATUS_CODE = 1005;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final long PAYLOAD_BYTE_MAX = 125;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_SHORT = 126;
    static final long PAYLOAD_SHORT_MAX = 65535;

    static void toggleMask(jH.Cif ifVar, byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = ifVar.f2417;
            int i3 = ifVar.f2418;
            int i4 = ifVar.f2416;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
            if (ifVar.f2415 == ifVar.f2420.f2411) {
                throw new IllegalStateException();
            } else if (ifVar.f2415 == -1) {
                i = ifVar.m2901(0);
            } else {
                i = ifVar.m2901(ifVar.f2415 + ((long) (ifVar.f2416 - ifVar.f2418)));
            }
        } while (i != -1);
    }

    static String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i));
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Code ");
        sb.append(i);
        sb.append(" is reserved and may not be used.");
        return sb.toString();
    }

    static void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }

    public static String acceptHeader(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ACCEPT_MAGIC);
        return jM.m2946(sb.toString()).m2959().m2957();
    }

    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }
}
