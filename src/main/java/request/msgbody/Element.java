package request.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public abstract class Element {
    @JSONField(name = "Text")
    protected String text;
    @JSONField(name = "Desc")
    protected String desc;
    @JSONField(name = "Latitude")
    protected Double latitude;
    @JSONField(name = "Longitude")
    protected Double longitude;
    @JSONField(name = "Index")
    protected Integer index;
    @JSONField(name = "Data")
    protected String data;
    @JSONField(name = "Ext")
    protected String ext;
    @JSONField(name = "Sound")
    protected String sound;


}
