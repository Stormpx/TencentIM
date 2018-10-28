package request.openim.msg;

import annotation.Command;
import model.Condition;
import request.GeneralModel;
import request.msgbody.TIMMsgElement;

import java.util.List;

@Command("im_push")
public class ImPush extends GeneralModel{
    private Condition condition;
    private Integer msgRandom;
    private List<TIMMsgElement> msgBody;
    private Integer msgLifeTime;
    private String from_Account;
    public ImPush(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        return null;
    }
}
