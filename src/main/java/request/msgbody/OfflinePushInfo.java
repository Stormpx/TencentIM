package request.msgbody;

public class OfflinePushInfo {
    /* "PushFlag": 0,
        "Title":"这是推送标题",
        "Desc": "这是离线推送内容",
        "Ext": "这是透传的内容",*/
    private Integer pushFlag;
    private String title;
    private String desc;
    private String ext;
    private AndroidInfo androidInfo;
    private ApnsInfo apnsInfo;

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public AndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    public void setAndroidInfo(AndroidInfo androidInfo) {
        this.androidInfo = androidInfo;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public void setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;
    }
}
