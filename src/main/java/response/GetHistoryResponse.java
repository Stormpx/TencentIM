package response;

import model.FileInfo;

import java.util.List;

public class GetHistoryResponse extends GeneralResponse{
    private List<FileInfo> File;


    public List<FileInfo> getFile() {
        return File;
    }

    public void setFile(List<FileInfo> file) {
        File = file;
    }
}
