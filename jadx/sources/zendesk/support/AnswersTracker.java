package zendesk.support;

import o.C0606;
import o.C0644;
import o.F;
import o.P;

class AnswersTracker implements ZendeskTracker {
    AnswersTracker() {
    }

    public void helpCenterLoaded() {
        F.m1359();
        C0606.m5315().m5418(new C0644("help-center-fetched"));
    }

    public void helpCenterSearched(String str) {
        F.m1359();
        C0644 r0 = new C0644("help-center-search");
        if (P.m1409(str)) {
            str = "";
        }
        r0.m5428("search-term", str);
        C0606.m5315().m5418(r0);
    }

    public void helpCenterArticleViewed() {
        F.m1359();
        C0606.m5315().m5418(new C0644("help-center-article-viewed"));
    }

    public void requestCreated() {
        F.m1359();
        C0606.m5315().m5418(new C0644("request-created"));
    }

    public void requestUpdated() {
        F.m1359();
        C0606.m5315().m5418(new C0644("request-updated"));
    }
}
