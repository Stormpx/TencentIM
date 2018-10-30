package request.sns;

import annotation.Command;
import response.GeneralResponse;

@Command("friend_delete_all")
public class FriendDeleteAllRequest extends SnsRequest<GeneralResponse> {
    public FriendDeleteAllRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        return null;
    }
    public FriendDeleteAllRequest setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
