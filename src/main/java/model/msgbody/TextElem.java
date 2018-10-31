package model.msgbody;

public class TextElem extends Element {
    public String getText() {
        return Text;
    }

    public TextElem setText(String text) {
        this.Text = text;
        return this;
    }
}
