package response;

public class GetNoSpeakingResponse extends GeneralResponse{
    private Long C2CmsgNospeakingTime;
    private Long GroupmsgNospeakingTime;

    public Long getC2CmsgNospeakingTime() {
        return C2CmsgNospeakingTime;
    }

    public void setC2CmsgNospeakingTime(Long c2CmsgNospeakingTime) {
        C2CmsgNospeakingTime = c2CmsgNospeakingTime;
    }

    public Long getGroupmsgNospeakingTime() {
        return GroupmsgNospeakingTime;
    }

    public void setGroupmsgNospeakingTime(Long groupmsgNospeakingTime) {
        GroupmsgNospeakingTime = groupmsgNospeakingTime;
    }
}
