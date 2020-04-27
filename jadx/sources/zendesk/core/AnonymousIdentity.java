package zendesk.core;

public final class AnonymousIdentity implements Identity {
    private String email;
    private String name;
    private String sdkGuid;

    public AnonymousIdentity() {
    }

    private AnonymousIdentity(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) obj;
        String str = this.email;
        if (str == null ? anonymousIdentity.email != null : !str.equals(anonymousIdentity.email)) {
            return false;
        }
        String str2 = this.name;
        String str3 = anonymousIdentity.name;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public final int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSdkGuid() {
        return this.sdkGuid;
    }

    /* access modifiers changed from: package-private */
    public final void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public String email;
        /* access modifiers changed from: private */
        public String name;

        public Builder withNameIdentifier(String str) {
            this.name = str;
            return this;
        }

        public Builder withEmailIdentifier(String str) {
            this.email = str;
            return this;
        }

        public Identity build() {
            return new AnonymousIdentity(this);
        }
    }
}
