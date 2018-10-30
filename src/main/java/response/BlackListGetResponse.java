package response;

import model.BlackListItem;

import java.util.List;

public class BlackListGetResponse extends GeneralResponse{
    private List<BlackListItem> BlackListItem;
    private Integer StartIndex;
    private Integer CurruentSequence;

    public List<model.BlackListItem> getBlackListItem() {
        return BlackListItem;
    }

    public void setBlackListItem(List<model.BlackListItem> blackListItem) {
        BlackListItem = blackListItem;
    }

    public Integer getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(Integer startIndex) {
        StartIndex = startIndex;
    }

    public Integer getCurruentSequence() {
        return CurruentSequence;
    }

    public void setCurruentSequence(Integer curruentSequence) {
        CurruentSequence = curruentSequence;
    }


}
