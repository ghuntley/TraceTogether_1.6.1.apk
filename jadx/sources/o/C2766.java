package o;

import android.os.Bundle;
import java.io.IOException;

/* renamed from: o.ӀƩ  reason: contains not printable characters */
public final class C2766 implements C2979<Bundle, String> {
    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ Object m14630(C0329 r3) {
        Bundle bundle = (Bundle) r3.m4416(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
