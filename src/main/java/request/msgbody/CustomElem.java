package request.msgbody;

public class CustomElem extends Element {
    public String getDesc() {
        return desc;
    }

    public CustomElem setDesc(String desc) {
        this.desc = desc;return this;
    }

    public String getData() {
        return data;
    }

    public CustomElem setData(String data) {
        this.data = data;return this;
    }

    public String getExt() {
        return ext;
    }

    public CustomElem setExt(String ext) {
        this.ext = ext;return this;
    }

    public String getSound() {
        return sound;
    }

    public CustomElem setSound(String sound) {
        this.sound = sound;return this;
    }
}
