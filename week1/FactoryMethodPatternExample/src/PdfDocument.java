public class PdfDocument implements Document {
    private String name;
    public PdfDocument(String name){
        this.name=name;
    }
    @Override
    public void open(){
        System.out.println("Open pdf document"+name);
    }
}
