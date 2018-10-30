package response;

public class GroupDeleteResponse extends GeneralResponse{
    private Integer CurrentSequence;

    public Integer getCurrentSequence() {
        return CurrentSequence;
    }

    public void setCurrentSequence(Integer currentSequence) {
        CurrentSequence = currentSequence;
    }
}
