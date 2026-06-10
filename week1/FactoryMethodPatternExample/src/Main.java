public class Main {
    public static void main (String[] args){
        Document doc1 = DocumentFactory.createDocument("word", " resume.docx");
        Document doc2 = DocumentFactory.createDocument("pdf", " report.pdf");
        doc1.open();
        doc2.open();
    }
}
