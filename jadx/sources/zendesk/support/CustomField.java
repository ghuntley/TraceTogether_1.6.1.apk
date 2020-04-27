package zendesk.support;

public class CustomField {
    private Long id;
    private String value;

    public CustomField(Long l, String str) {
        this.id = l;
        this.value = str;
    }

    public Long getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }
}
