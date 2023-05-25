package class22;

public class FileTester {
    public static void main(String[] args) {

        File [] file={new JavaFile("Java", 6),
                new WordFile("Word", 2),
                new PdfFile("Pdf", 7)};

        for (File fil:file){
            fil.open();
            fil.edit();
            fil.close();
        }

    }
}
