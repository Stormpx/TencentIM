package request.msgbody;

public class ApnsInfo {
    private String sound;
    private Integer badgeMode;
    private String title;
    private String usbTitle;
    private String image;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Integer getBadgeMode() {
        return badgeMode;
    }

    public void setBadgeMode(Integer badgeMode) {
        this.badgeMode = badgeMode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsbTitle() {
        return usbTitle;
    }

    public void setUsbTitle(String usbTitle) {
        this.usbTitle = usbTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
