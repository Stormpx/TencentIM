package request.msgbody;

import com.alibaba.fastjson.annotation.JSONField;
import response.GeneralResponse;

public  class Element {
    @JSONField(name = "Text")
    protected String Text;
    @JSONField(name = "Desc")
    protected String Desc;
    @JSONField(name = "Latitude")
    protected Double Latitude;
    @JSONField(name = "Longitude")
    protected Double Longitude;
    @JSONField(name = "Index")
    protected Integer Index;
    @JSONField(name = "Data")
    protected String data;
    @JSONField(name = "Ext")
    protected String Ext;
    @JSONField(name = "Sound")
    protected String Sound;

    public static void main(String[] args) {
        /**
         * 当set方法为object时，fastjson反序列会找不到方法*/
        GeneralResponse.test("{\n" +
                "                        \"Text\": \"报上来\"\n" +
                "                    }",Element.class);
    }
    public String getText() {
        return Text;
    }
    public Element setText(String text) {
        this.Text = text;
        return this;
    }


    public String getDesc() {
        return Desc;
    }

    public  Element setDesc(String desc) {
        this.Desc = desc;return this;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public Element setLatitude(Double latitude) {
        this.Latitude = latitude;return this;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public Element setLongitude(Double longitude) {
        this.Longitude = longitude;return this;
    }

    public Integer getIndex() {
        return Index;
    }

    public Element setIndex(Integer index) {
        this.Index = index;return this;
    }

    public String getData() {
        return data;
    }

    public  Element setData(String data) {
        this.data = data;return this;
    }

    public String getExt() {
        return Ext;
    }

    public Element setExt(String ext) {
        this.Ext = ext;return this;
    }

    public String getSound() {
        return Sound;
    }

    public Element setSound(String sound) {
        this.Sound = sound;return this;
    }
}
