package com.sritel.notification.service;

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
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 700);
            contentStream.showText("Monthly Statement for " + month);

            if (statementRecords.isEmpty()) {
                contentStream.endText();
                contentStream.close();
                document.save(byteArrayOutputStream);
                return;
            }

            for (StatementRecord statementRecord : statementRecords) {
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Amount: " + statementRecord.getAmount());
                contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Date: " + statementRecord.getPaymentDate());
            }

            contentStream.endText();
            contentStream.close();

            document.save(byteArrayOutputStream);
        }
    }
}
