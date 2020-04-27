package zendesk.support;

import java.util.List;
import o.O;

public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return O.m1393(this.comments);
    }

    public List<User> getUsers() {
        return O.m1393(this.users);
    }
}
