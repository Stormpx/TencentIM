package model.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public class ApnsInfo {
    @JSONField(name = "Sound")
    private String sound;
    @JSONField(name = "BadgeMode")
    private Integer badgeMode;
    @JSONField(name = "Title")
    private String title;
    @JSONField(name = "SubTitle")
    private String usbTitle;
    @JSONField(name = "Image")
    private String image;

    public String getSound() {
        return sound;
    }

    public ApnsInfo setSound(String sound) {
        this.sound = sound;return this;
    }
    public Integer getBadgeMode() {
        return badgeMode;
    }

    public ApnsInfo setBadgeMode(Integer badgeMode) {
        this.badgeMode = badgeMode;return this;
    }

    public String getTitle() {
        return title;
    }

    public ApnsInfo setTitle(String title) {
        this.title = title;return this;
    }

    public String getUsbTitle() {
        return usbTitle;
    }

    public ApnsInfo setUsbTitle(String usbTitle) {
        this.usbTitle = usbTitle;return this;
    }

    public String getImage() {
        return image;
    }

    public ApnsInfo setImage(String image) {
        this.image = image;return this;
    }
}
