package model.msgbody;

public class LocationElem extends Element{
    public String getDesc() {
        return Desc;
    }

    public LocationElem setDesc(String desc) {
        this.Desc = desc;return this;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public LocationElem setLatitude(Double latitude) {
        this.Latitude = latitude;return this;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public LocationElem setLongitude(Double longitude) {
        this.Longitude = longitude;return this;
    }
}
