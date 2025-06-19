package design_principle;

public class PdfDocFactory extends DocumentFactory {
	    @Override
	    public Doc createDocument() {
	        return new PdfDocument();
	    }
	}


