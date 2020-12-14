package ex_3;

public class CreateDocument implements ICreateDocument{
    public IDocument CreateNew(){
        IDocument document = new IDocument() {
            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public void edit(String name) {

            }
        };
        new TextDocument();
        return document;
    }

    public IDocument CreateOpen(){
        IDocument document = new IDocument() {
            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public void edit(String name) {

            }
        };
        new TextDocument();
        return document;
    }
}
