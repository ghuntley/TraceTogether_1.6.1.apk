package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.P;
import zendesk.support.Attachment;
import zendesk.support.User;

class StateRequestUser implements Serializable {
    private final String avatar;
    private final long id;
    private final boolean isAgent;
    private final String name;

    static List<StateRequestUser> convert(List<User> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (User next : list) {
            if (next.getId() != null) {
                Attachment photo = next.getPhoto();
                arrayList.add(new StateRequestUser(next.getName(), (photo == null || !P.m1406(photo.getContentUrl())) ? "" : photo.getContentUrl(), next.isAgent(), next.getId().longValue()));
            }
        }
        return arrayList;
    }

    static boolean containsAgent(List<StateRequestUser> list) {
        for (StateRequestUser isAgent2 : list) {
            if (isAgent2.isAgent()) {
                return true;
            }
        }
        return false;
    }

    StateRequestUser(String str, String str2, boolean z, long j) {
        this.name = str;
        this.avatar = str2;
        this.isAgent = z;
        this.id = j;
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public String getAvatar() {
        return this.avatar;
    }

    /* access modifiers changed from: package-private */
    public boolean isAgent() {
        return this.isAgent;
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }
}
