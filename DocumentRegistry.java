public class DocumentRegistry {
    PDFDocument pdfPrototype;
    TextDocument textDocumentPrototype;
    SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PDFDocument();
        pdfPrototype.fileName = "annual_report_2024.pdf";
        pdfPrototype.author = "Acme Corp";
        pdfPrototype.pageCount = 150;

        textDocumentPrototype = new TextDocument();
        textDocumentPrototype.encoding = "UTF-8";
        textDocumentPrototype.wordCount = 250;

        spreadsheetPrototype = new SpreadsheetDocument();
        spreadsheetPrototype.spreadsheetName = "sales_data_q1.xlsx";
        spreadsheetPrototype.rowCount = 1000;
        spreadsheetPrototype.columnCount = 20;
    }

    public Document createPDF() {
        return pdfPrototype.clone();
    }

    public Document createText() {
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheet() {
        return spreadsheetPrototype.clone();
    }
}
