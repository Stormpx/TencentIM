package response;

import com.alibaba.fastjson.JSONObject;
import model.InfoItem;

import java.util.List;

public class FriendGetAllResponse extends GeneralResponse{
    private String NeedUpdateAll;
    private Integer TimeStampNow;
    private Integer StartIndex;
    private List<InfoItem> infoItem;
    private Integer CurrentStandardSequence;
    private Integer FriendNum;

    public String getNeedUpdateAll() {
        return NeedUpdateAll;
    }

    public void setNeedUpdateAll(String needUpdateAll) {
        NeedUpdateAll = needUpdateAll;
    }

    public Integer getTimeStampNow() {
        return TimeStampNow;
    }

    public void setTimeStampNow(Integer timeStampNow) {
        TimeStampNow = timeStampNow;
    }

    public Integer getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(Integer startIndex) {
        StartIndex = startIndex;
    }

    public List<InfoItem> getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(List<InfoItem> infoItem) {
        this.infoItem = infoItem;
    }

    public Integer getCurrentStandardSequence() {
        return CurrentStandardSequence;
    }

    public void setCurrentStandardSequence(Integer currentStandardSequence) {
        CurrentStandardSequence = currentStandardSequence;
    }

    public Integer getFriendNum() {
        return FriendNum;
    }

    public void setFriendNum(Integer friendNum) {
        FriendNum = friendNum;
    }

}
