package zendesk.support;

import java.io.Serializable;

public class Category implements Serializable {
    private Long id;
    private String name;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
