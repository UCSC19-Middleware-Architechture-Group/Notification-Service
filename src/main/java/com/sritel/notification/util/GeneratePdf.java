package com.sritel.notification.util;

import com.sritel.billing.event.StatementRecord;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class GeneratePdf {
    public static void generatePDFStatement(ByteArrayOutputStream byteArrayOutputStream, List<StatementRecord> statementRecords, String month) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Set title font and center the title
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 20);
            contentStream.beginText();
            contentStream.newLineAtOffset(220, 750); // Adjust position for centering the title
            contentStream.showText("Monthly Statement - " + month);
            contentStream.endText();

            // Draw a line under the title
            contentStream.setLineWidth(1);
            contentStream.moveTo(100, 740);
            contentStream.lineTo(500, 740);
            contentStream.stroke();

            // Set header fonts for table
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 720);
            contentStream.showText("Amount");
            contentStream.newLineAtOffset(200, 0); // Spacing for date column
            contentStream.showText("Date");
            contentStream.endText();

            // Draw a line under the headers
            contentStream.setLineWidth(0.5f);
            contentStream.moveTo(100, 715);
            contentStream.lineTo(500, 715);
            contentStream.stroke();

            // Set font for content and start adding records
            contentStream.setFont(PDType1Font.HELVETICA, 10);
            float yPosition = 700; // Y position for the first record
            final float rowHeight = 20f; // Height for each record row

            for (StatementRecord statementRecord : statementRecords) {
                if (yPosition < 50) { // Add new page if content exceeds the page length
                    contentStream.close();
                    page = new PDPage();
                    document.addPage(page);
                    contentStream = new PDPageContentStream(document, page);
                    yPosition = 700;
                }

                contentStream.beginText();
                contentStream.newLineAtOffset(100, yPosition);
                contentStream.showText(String.valueOf(statementRecord.getAmount())); // Show amount
                contentStream.newLineAtOffset(200, 0); // Align date in second column
                contentStream.showText(statementRecord.getPaymentDate().toString()); // Show payment date
                contentStream.endText();

                yPosition -= rowHeight; // Move to the next row
            }

            // Close the content stream and save the document
            contentStream.close();
            document.save(byteArrayOutputStream);
        }
    }

}
