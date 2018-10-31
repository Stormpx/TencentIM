package response;

import model.CheckItem;

import java.util.List;

public class FriendCheckResponse extends GeneralResponse{
    private List<CheckItem> InfoItem;
    private List<String> Fail_Account;
    private List<String> Invalid_Account;

    public static void main(String[] args) {
        GeneralResponse.test("{\"InfoItem\":[{\"Relation\":\"CheckResult_Type_BothWay\",\"To_Account\":\"user1\",\"ResultInfo\":\"\",\"ResultCode\":0},{\"Relation\":\"CheckResult_Type_AWithB\",\"To_Account\":\"18028597388\",\"ResultInfo\":\"\",\"ResultCode\":0}],\"ErrorInfo\":\"\",\"ErrorDisplay\":\"\",\"ErrorCode\":0,\"ActionStatus\":\"OK\"}",FriendCheckResponse.class);
    }
    public List<model.CheckItem> getInfoItem() {
        return InfoItem;
    }

    public void setInfoItem(List<model.CheckItem> infoItem) {
        InfoItem = infoItem;
    }

    public List<String> getFail_Account() {
        return Fail_Account;
    }

    public void setFail_Account(List<String> fail_Account) {
        Fail_Account = fail_Account;
    }

    public List<String> getInvalid_Account() {
        return Invalid_Account;
    }

    public void setInvalid_Account(List<String> invalid_Account) {
        Invalid_Account = invalid_Account;
    }
}
