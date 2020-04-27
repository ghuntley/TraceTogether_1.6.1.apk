package zendesk.core;

import o.C2709;

class AccessToken {
    private String accessToken;
    @C2709(m14406 = "user_id")
    private String userId;

    AccessToken() {
    }

    AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }

    /* access modifiers changed from: package-private */
    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AccessToken accessToken2 = (AccessToken) obj;
            String str = this.accessToken;
            if (str == null ? accessToken2.accessToken != null : !str.equals(accessToken2.accessToken)) {
                return false;
            }
            String str2 = this.userId;
            String str3 = accessToken2.userId;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
