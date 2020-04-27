package zendesk.core;

import java.util.Date;
import o.C2709;

public class CoreSettings implements Settings {
    private AuthenticationType authentication;
    @C2709(m14406 = "updated_at")
    private Date updatedAt;

    CoreSettings(Date date, AuthenticationType authenticationType) {
        this.updatedAt = date;
        this.authentication = authenticationType;
    }

    public AuthenticationType getAuthentication() {
        return this.authentication;
    }
}
