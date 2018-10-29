package request.msgbody;

import com.alibaba.fastjson.annotation.JSONField;

public class AndroidInfo {
    @JSONField(name = "Sound")
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
