public class DocumentFactory {

    // Factory method - creates document based on type parameter
    public static Document createDocument(String type, String name) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument(name);
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument(name);
        }
        else {
            return null;
        }
    }
}