package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.ElectronicDocument;
import org.junit.Test;

public class ConsoleDocumentPrinterTest {
	
	@Test
	public void testCompilePrintDocument() {
		DocumentPrinter<Document> printer = new ConsoleDocumentPrinter<>();
	}
	
	@Test
	public void testCompilePrintElectronicDocument() {
		DocumentPrinter<ElectronicDocument> printer = new ConsoleDocumentPrinter<>();
	}
}
