package zendesk.support;

import java.io.Serializable;

public class Section implements Serializable {
    private Long categoryId;
    private Long id;
    private String name;

    public Long getId() {
        return this.id;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getName() {
        return this.name;
    }
}
