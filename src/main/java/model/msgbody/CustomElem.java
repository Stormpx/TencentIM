package model.msgbody;

public class CustomElem extends Element {
    @Override
    public String getDesc() {
        return Desc;
    }

    @Override
    public CustomElem setDesc(String desc) {
        this.Desc = desc;
        return this;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public CustomElem setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String getExt() {
        return Ext;
    }

    @Override
    public CustomElem setExt(String ext) {
        this.Ext = ext;
        return this;
    }

    @Override
    public String getSound() {
        return Sound;
    }

    @Override
    public CustomElem setSound(String sound) {
        this.Sound = sound;
        return this;
    }

}
