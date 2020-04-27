package zendesk.support;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o.G;
import o.I;

class ZendeskRequestService {
    private final DateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    private final I.Cif<RequestResponse, Request> requestExtractor = new I.Cif<RequestResponse, Request>() {
        public Request extract(RequestResponse requestResponse) {
            return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
        }
    };
    private final RequestService requestService;
    private final I.Cif<RequestsResponse, List<Request>> requestsExtractor = new I.Cif<RequestsResponse, List<Request>>() {
        public List<Request> extract(RequestsResponse requestsResponse) {
            Map access$000 = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
            ArrayList arrayList = new ArrayList();
            for (Request access$100 : requestsResponse.getRequests()) {
                arrayList.add(ZendeskRequestService.updateLastCommentingAgents(access$100, access$000));
            }
            return arrayList;
        }
    };

    ZendeskRequestService(RequestService requestService2) {
        this.requestService = requestService2;
        this.iso8601.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public void createRequest(String str, CreateRequest createRequest, G<Request> g) {
        CreateRequestWrapper createRequestWrapper = new CreateRequestWrapper();
        createRequestWrapper.setRequest(createRequest);
        this.requestService.createRequest(str, createRequestWrapper).m3316(new I(g, new I.Cif<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void getAllRequests(String str, String str2, G<List<Request>> g) {
        this.requestService.getAllRequests(str, str2).m3316(new I(g, this.requestsExtractor));
    }

    /* access modifiers changed from: package-private */
    public void getAllRequests(String str, String str2, String str3, G<List<Request>> g) {
        this.requestService.getManyRequests(str, str2, str3).m3316(new I(g, this.requestsExtractor));
    }

    /* access modifiers changed from: package-private */
    public void getComments(String str, G<CommentsResponse> g) {
        this.requestService.getComments(str).m3316(new I(g));
    }

    /* access modifiers changed from: package-private */
    public void getCommentsSince(String str, Date date, boolean z, G<CommentsResponse> g) {
        this.requestService.getCommentsSince(str, this.iso8601.format(date), z ? "agent" : null).m3316(new I(g));
    }

    /* access modifiers changed from: package-private */
    public void addComment(String str, EndUserComment endUserComment, G<Request> g) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).m3316(new I(g, new I.Cif<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public void getRequest(String str, String str2, G<Request> g) {
        this.requestService.getRequest(str, str2).m3316(new I(g, this.requestExtractor));
    }

    /* access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User next : list) {
            hashMap.put(next.getId(), new User(next.getId(), next.getName(), next.getPhoto(), true, -1L, (List<String>) null, (Map<String, String>) null));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        for (Long l : request.getLastCommentingAgentsIds()) {
            arrayList.add(map.get(l));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }
}
