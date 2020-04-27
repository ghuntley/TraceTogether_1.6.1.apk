package zendesk.core;

class AuthenticationRequestWrapper {
    private Identity user;

    AuthenticationRequestWrapper() {
    }

    /* access modifiers changed from: package-private */
    public void setUser(Identity identity) {
        this.user = identity;
    }
}
