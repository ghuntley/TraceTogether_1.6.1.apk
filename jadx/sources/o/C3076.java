package o;

import android.os.Handler;
import android.os.Message;

/* renamed from: o.էӀ  reason: contains not printable characters */
public final class C3076 implements Handler.Callback {

    /* renamed from: ι  reason: contains not printable characters */
    private final C1588 f14034;

    /* renamed from: o.էӀ$If */
    public enum If {
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BOOLEAN,
        STRING,
        BYTE_STRING,
        ENUM,
        MESSAGE
    }

    /* renamed from: o.էӀ$ǃ  reason: contains not printable characters */
    public enum C3077 {
        DOUBLE(If.DOUBLE, (byte) 0),
        FLOAT(If.FLOAT, (byte) 0),
        INT64(If.LONG, (byte) 0),
        UINT64(If.LONG, (byte) 0),
        INT32(If.INT, (byte) 0),
        FIXED64(If.LONG, (byte) 0),
        FIXED32(If.INT, (byte) 0),
        BOOL(If.BOOLEAN, (byte) 0),
        STRING {
        },
        GROUP {
        },
        MESSAGE {
        },
        BYTES {
        },
        UINT32(If.INT, (byte) 0),
        ENUM(If.ENUM, (byte) 0),
        SFIXED32(If.INT, (byte) 0),
        SFIXED64(If.LONG, (byte) 0),
        SINT32(If.INT, (byte) 0),
        SINT64(If.LONG, (byte) 0);
        

        /* renamed from: ł  reason: contains not printable characters */
        final If f14064;

        private C3077(If ifR, byte b) {
            this.f14064 = ifR;
        }
    }

    public C3076(C1588 r1) {
        this.f14034 = r1;
    }

    public final boolean handleMessage(Message message) {
        return this.f14034.m9276(message);
    }
}
