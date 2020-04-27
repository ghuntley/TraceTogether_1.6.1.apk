package zendesk.core;

import o.F;
import o.P;

public final class JwtIdentity implements Identity {
    private final String token;

    public JwtIdentity(String str) {
        if (P.m1409(str)) {
            F.m1358();
        }
        this.token = str;
    }

    public final String getJwtUserIdentifier() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.token;
        String str2 = ((JwtIdentity) obj).token;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
