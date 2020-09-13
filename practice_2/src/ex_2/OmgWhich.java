package ex_2;

import java.text.MessageFormat;

public class OmgWhich {
    String type;
    public String Description (String c) {
        switch (c) {
            case "orange":
                type = "basketball";
                break;
            case "black":
                type = "football";
                break;
            case "white":
                type = "football";
                break;
            case "green":
                type = "tennis";
                break;
            default:
                type = "standard";
                break;
        }
        return type;
    }

    public String toString() {
        return MessageFormat.format("Maybe it is a {0} ball", type);
    }
}
