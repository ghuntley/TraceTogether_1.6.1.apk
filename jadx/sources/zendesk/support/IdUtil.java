package zendesk.support;

import java.util.UUID;

public class IdUtil {
    public static long newLongId() {
        return generateUniqueId().getMostSignificantBits() & Long.MAX_VALUE;
    }

    public static String newStringId() {
        return generateUniqueId().toString();
    }

    private static UUID generateUniqueId() {
        return UUID.randomUUID();
    }
}
