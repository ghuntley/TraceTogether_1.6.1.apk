package zendesk.support;

class LastSearch {
    private final String origin = "mobile_sdk";
    private final String query;
    private final int resultsCount;

    LastSearch(String str, int i) {
        this.query = str;
        this.resultsCount = i;
    }
}
