package request.openconfigsvr;

import annotation.Command;
import com.alibaba.fastjson.annotation.JSONField;
import request.GeneralRequest;
import response.GeneralResponse;
import util.VariableUtil;

@Command("setnospeaking")
public class SetNoSpeakingRequest extends GeneralRequest<GeneralResponse> {
    @JSONField(name = "Set_Account")
    private String setAccount;
    @JSONField(name = "C2CmsgNospeakingTime")
    private Long c2cMsgNospeakingTime;
    @JSONField(name = "GroupmsgNospeakingTime")
    private Long groupmsgNospeakingTime;

    public SetNoSpeakingRequest(String serviceName) {
        super(serviceName);
    }

    @Override
    public String checkParam() {
        if (VariableUtil.isEmpty(setAccount)){
            return "Set_Account";
        }
        return null;
    }

    public String getSetAccount() {
        return setAccount;
    }

    public SetNoSpeakingRequest setSetAccount(String setAccount) {
        this.setAccount = setAccount;return this;
    }

    public Long getC2cMsgNospeakingTime() {
        return c2cMsgNospeakingTime;
    }

    public SetNoSpeakingRequest setC2cMsgNospeakingTime(Long c2cMsgNospeakingTime) {
        this.c2cMsgNospeakingTime = c2cMsgNospeakingTime;return this;
    }

    public Long getGroupmsgNospeakingTime() {
        return groupmsgNospeakingTime;
    }

    public SetNoSpeakingRequest setGroupmsgNospeakingTime(Long groupmsgNospeakingTime) {
        this.groupmsgNospeakingTime = groupmsgNospeakingTime;return this;
    }
}
