package request.msgbody;

public class LocationElem extends Element{
    public String getDesc() {
        return desc;
    }

    public LocationElem setDesc(String desc) {
        this.desc = desc;return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public LocationElem setLatitude(Double latitude) {
        this.latitude = latitude;return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public LocationElem setLongitude(Double longitude) {
        this.longitude = longitude;return this;
    }
}
