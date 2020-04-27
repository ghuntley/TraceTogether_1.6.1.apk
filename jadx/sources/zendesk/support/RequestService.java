package zendesk.support;

import o.C3552ku;
import o.C3562lb;
import o.C3565le;
import o.kJ;
import o.kP;
import o.kT;
import o.kV;
import o.kY;

interface RequestService {
    @kV(m3252 = "/api/mobile/requests/{id}.json?include=last_comment")
    C3552ku<RequestResponse> addComment(@C3565le(m3556 = "id") String str, @kJ UpdateRequestWrapper updateRequestWrapper);

    @kY(m3255 = "/api/mobile/requests.json?include=last_comment")
    C3552ku<RequestResponse> createRequest(@kT(m3251 = "Mobile-Sdk-Identity") String str, @kJ CreateRequestWrapper createRequestWrapper);

    @kP(m3248 = "/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    C3552ku<RequestsResponse> getAllRequests(@C3562lb(m3552 = "status") String str, @C3562lb(m3552 = "include") String str2);

    @kP(m3248 = "/api/mobile/requests/{id}/comments.json?sort_order=desc")
    C3552ku<CommentsResponse> getComments(@C3565le(m3556 = "id") String str);

    @kP(m3248 = "/api/mobile/requests/{id}/comments.json?sort_order=desc")
    C3552ku<CommentsResponse> getCommentsSince(@C3565le(m3556 = "id") String str, @C3562lb(m3552 = "since") String str2, @C3562lb(m3552 = "role") String str3);

    @kP(m3248 = "/api/mobile/requests/show_many.json?sort_order=desc")
    C3552ku<RequestsResponse> getManyRequests(@C3562lb(m3552 = "tokens") String str, @C3562lb(m3552 = "status") String str2, @C3562lb(m3552 = "include") String str3);

    @kP(m3248 = "/api/mobile/requests/{id}.json")
    C3552ku<RequestResponse> getRequest(@C3565le(m3556 = "id") String str, @C3562lb(m3552 = "include") String str2);
}
