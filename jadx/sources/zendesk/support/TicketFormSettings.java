package zendesk.support;

public class TicketFormSettings {
    private static TicketFormSettings DEFAULT = new TicketFormSettings(false);
    private boolean available;

    static TicketFormSettings defaultSettings() {
        return DEFAULT;
    }

    TicketFormSettings(boolean z) {
        this.available = z;
    }
}
