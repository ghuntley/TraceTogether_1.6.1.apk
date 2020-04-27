package zendesk.support;

import java.util.Date;
import java.util.List;
import o.G;

public interface RequestProvider {
    void addComment(String str, EndUserComment endUserComment, G<Comment> g);

    void createRequest(CreateRequest createRequest, G<Request> g);

    void getAllRequests(G<List<Request>> g);

    void getComments(String str, G<CommentsResponse> g);

    void getCommentsSince(String str, Date date, boolean z, G<CommentsResponse> g);

    void getRequest(String str, G<Request> g);

    void getUpdatesForDevice(G<RequestUpdates> g);

    void markRequestAsRead(String str, int i);
}
