package ex_3;

public class TextDocument implements IDocument {
    private int size;
    private String name, text;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void edit(String text) {
        text+= text;
    }
}
