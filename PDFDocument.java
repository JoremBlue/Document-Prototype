public class PDFDocument implements Document {
    String fileName;
    String author;
    int pageCount;
    String name;

    public PDFDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    public String getType() {
        return "PDF";
    }

    public Document clone() {
        PDFDocument copy = new PDFDocument();
        copy.fileName = this.fileName;
        copy.author = this.author;
        copy.pageCount = this.pageCount;
        copy.name = this.name;
        return copy;
    }
}
