package class22;

public abstract class File {

    private String name;
    private int size;

    public File(String name, int size){
        this.name=name;
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("Edit");
    };
    void close(){
       System.out.println("Close");
    };
}

class JavaFile extends  File{

    public JavaFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open(){
        System.out.println("to open java file we need Intellij");
    }
    @Override
    void edit(){
        System.out.println("Java file is edit ");
    }
    @Override
    void close(){
        System.out.println("classes implement this interface they need to be close after use");
    }
}

class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open(){
        System.out.println("to open .doc file we need Microsoft word to be installed ");
    }
    @Override
    void edit(){
        System.out.println("WordFile is edit");
    }
    @Override
    void close(){
        System.out.println("Click the File tab, and then click Close. Press Ctrl+W.");
    }
}

class PdfFile extends File{
    PdfFile(String name, int size) {
        super(name, size);
    }
    @Override
    void open(){
        System.out.println("to open .pdf file we need Select Adobe Acrobat to be installed ");
    }
    @Override
    void edit(){
        System.out.println("PdfFile is edit ");
    }
    @Override
    void close(){
        System.out.println("To quickly close a PDF, simply press Ctrl+W ");
    }

}