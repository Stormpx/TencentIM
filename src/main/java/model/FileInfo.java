package model;

public class FileInfo {
    private String URL;
    private String ExpireTime;
    private String FileSize;
    private String FileMD5;
    private Integer GzipSize;
    private String GzipMD5;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(String expireTime) {
        ExpireTime = expireTime;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String fileSize) {
        FileSize = fileSize;
    }

    public String getFileMD5() {
        return FileMD5;
    }

    public void setFileMD5(String fileMD5) {
        FileMD5 = fileMD5;
    }

    public Integer getGzipSize() {
        return GzipSize;
    }

    public void setGzipSize(Integer gzipSize) {
        GzipSize = gzipSize;
    }

    public String getGzipMD5() {
        return GzipMD5;
    }

    public void setGzipMD5(String gzipMD5) {
        GzipMD5 = gzipMD5;
    }
}
