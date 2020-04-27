package zendesk.support;

public enum SortOrder {
    ASCENDING("asc"),
    DESCENDING("desc");
    
    private final String apiValue;

    private SortOrder(String str) {
        this.apiValue = str;
    }

    public final String getApiValue() {
        return this.apiValue;
    }
}
