package o;

import java.util.Locale;

/* renamed from: o.ɀȷ  reason: contains not printable characters */
public final class C0998 extends Exception {
    C0998(String str) {
        super(str);
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (lowerCase.equals("service_not_available")) {
                    }
                    return;
                case -1290953729:
                    lowerCase.equals("toomanymessages");
                    return;
                case -920906446:
                    if (!lowerCase.equals("invalid_parameters")) {
                        return;
                    }
                    return;
                case -617027085:
                    if (!lowerCase.equals("messagetoobig")) {
                        return;
                    }
                    return;
                case -95047692:
                    if (!lowerCase.equals("missing_to")) {
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
