package response;

import java.util.List;

public class DirtyWordsGetResponse extends GeneralResponse{
    private List<String> DirtyWordsList;

    public List<String> getDirtyWordsList() {
        return DirtyWordsList;
    }

    public void setDirtyWordsList(List<String> dirtyWordsList) {
        DirtyWordsList = dirtyWordsList;
    }
}
