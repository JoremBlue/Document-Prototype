public class TextDocument implements Document {
    Integer filePath;
    String encoding;
    int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public void open() {
        System.out.println("Opening Text Document: meeting_notes.txt with encoding: " + encoding + " (" + wordCount + " words)");
    }

    public String getType() {
        return "Text";
    }

    public Document clone() {
        TextDocument copy = new TextDocument();
        copy.filePath = this.filePath;
        copy.encoding = this.encoding;
        copy.wordCount = this.wordCount;
        return copy;
    }
}
