package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.I;
import o.O;

class ZendeskUserProvider implements UserProvider {
    private static final I.Cif<UserFieldResponse, List<Object>> FIELDS_EXTRACTOR = new I.Cif<UserFieldResponse, List<Object>>() {
        public final List<Object> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final I.Cif<UserResponse, Map<String, String>> FIELDS_MAP_EXTRACTOR = new I.Cif<UserResponse, Map<String, String>>() {
        public final Map<String, String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return O.m1396(new HashMap());
            }
            return userResponse.getUser().getUserFields();
        }
    };
    private static final I.Cif<UserResponse, List<String>> TAGS_EXTRACTOR = new I.Cif<UserResponse, List<String>>() {
        public final List<String> extract(UserResponse userResponse) {
            if (userResponse == null || userResponse.getUser() == null) {
                return O.m1393(new ArrayList());
            }
            return userResponse.getUser().getTags();
        }
    };
    private static final I.Cif<UserResponse, User> USER_EXTRACTOR = new I.Cif<UserResponse, User>() {
        public final User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private final UserService userService;

    ZendeskUserProvider(UserService userService2) {
        this.userService = userService2;
    }
}
