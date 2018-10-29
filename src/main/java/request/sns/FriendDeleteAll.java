package request.sns;

import annotation.Command;

@Command("friend_delete_all")
public class FriendDeleteAll extends SnsModel {
    public FriendDeleteAll(String serviceName) {
        super(serviceName);
    }

    @Override
    protected String check() {
        return null;
    }
    public FriendDeleteAll setFromAccount(String fromAccount) {
        super.fromAccount = fromAccount;
        return this;
    }
}
