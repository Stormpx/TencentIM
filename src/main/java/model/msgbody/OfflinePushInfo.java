package model.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public class OfflinePushInfo {
    /* "PushFlag": 0,
        "Title":"这是推送标题",
        "Desc": "这是离线推送内容",
        "Ext": "这是透传的内容",*/
    @JSONField(name = "PushFlag")
    private Integer pushFlag;
    @JSONField(name = "Title")
    private String title;
    @JSONField(name = "Desc")
    private String desc;
    @JSONField(name = "Ext")
    private String ext;
    @JSONField(name = "AndroidInfo")
    private AndroidInfo androidInfo;
    @JSONField(name = "ApnsInfo")
    private ApnsInfo apnsInfo;

    public Integer getPushFlag() {
        return pushFlag;
    }

    public OfflinePushInfo setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;return this;
    }

    public String getTitle() {
        return title;
    }

    public OfflinePushInfo setTitle(String title) {
        this.title = title;return this;
    }

    public String getDesc() {
        return desc;
    }

    public OfflinePushInfo setDesc(String desc) {
        this.desc = desc;return this;
    }

    public String getExt() {
        return ext;
    }

    public OfflinePushInfo setExt(String ext) {
        this.ext = ext;return this;
    }

    public AndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    public OfflinePushInfo setAndroidInfo(AndroidInfo androidInfo) {
        this.androidInfo = androidInfo;return this;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public OfflinePushInfo setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;return this;
    }
}
