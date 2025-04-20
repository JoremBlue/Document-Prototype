public class SpreadsheetDocument implements Document {
    String spreadsheetName;
    int rowCount;
    int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    public String getType() {
        return "Spreadsheet";
    }

    public Document clone() {
        SpreadsheetDocument copy = new SpreadsheetDocument();
        copy.spreadsheetName = this.spreadsheetName;
        copy.rowCount = this.rowCount;
        copy.columnCount = this.columnCount;
        return copy;
    }
}
