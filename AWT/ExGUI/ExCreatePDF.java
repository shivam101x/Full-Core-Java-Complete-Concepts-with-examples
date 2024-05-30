package ExGUI;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class ExCreatePDF {
	
	public ExCreatePDF(int orid,String text,double totalpayable) throws IOException {
		
		PDDocument document=new PDDocument();
		PDPage page=new PDPage(PDRectangle.LEGAL);
		document.addPage(page);
		PDPageContentStream conStream=new PDPageContentStream(document, page);
		
		conStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD), 12);
		
		conStream.beginText();
		conStream.newLineAtOffset(50, 950);
		String txt="Hello, your Order Id is: "+Integer.toString(orid)+"Name: "+text+"AMOUNT PAYABLE IS: "+Double.toString(totalpayable);
		conStream.showText(txt);
		conStream.endText();
		conStream.close();
		
		document.save(new File("D:\\Nitin Sir\\JavaFile\\PDF\\"+text+"Id"+orid+".pdf"));
		document.close();
		System.out.println("PDF Created Successfully..!");
		

	}
	
}
