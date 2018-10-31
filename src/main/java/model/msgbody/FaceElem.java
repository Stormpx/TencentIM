package model.msgbody;

public class FaceElem extends Element {
    public Integer getIndex() {
        return Index;
    }

    public FaceElem setIndex(Integer index) {
        this.Index = index;return this;
    }

    public String getData() {
        return data;
    }

    public FaceElem setData(String data) {
        this.data = data;return this;
    }
}
