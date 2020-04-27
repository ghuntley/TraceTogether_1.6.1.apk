package zendesk.core;

class BlipsSettings {
    private BlipsPermissions permissions;

    BlipsSettings(BlipsPermissions blipsPermissions) {
        this.permissions = blipsPermissions;
    }

    /* access modifiers changed from: package-private */
    public BlipsPermissions getBlipsPermissions() {
        return this.permissions;
    }
}
