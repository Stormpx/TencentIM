package request.msgbody;

public class TextElem extends Element {

    public String getText() {
        return text;
    }

    public TextElem setText(String text) {
        this.text = text;return this;
    }
}
