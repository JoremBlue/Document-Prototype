public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPDF();
        pdf.open();
        System.out.println("Type: " + pdf.getType() + ", File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150\n");

        Document text = registry.createText();
        text.open();
        System.out.println("Type: " + text.getType() + ", Path: meeting_notes.txt, Encoding: UTF-8, Words: 250\n");

        Document sheet = registry.createSpreadsheet();
        sheet.open();
        System.out.println("Type: " + sheet.getType() + ", Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20\n");

        PDFDocument newPDF = (PDFDocument) registry.createPDF();
        newPDF.fileName = "summary_report.pdf";
        newPDF.pageCount = 30;
        newPDF.open();
    }
}
