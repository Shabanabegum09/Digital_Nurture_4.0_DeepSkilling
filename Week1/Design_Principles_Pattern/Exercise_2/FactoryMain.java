package design_principle;

//Main.java
public class FactoryMain {
 public static void main(String[] args) {
     DocumentFactory wordFactory = new WordDocFactory();
     Doc word = wordFactory.createDocument();
     word.open();

     DocumentFactory pdfFactory = new PdfDocFactory();
     Doc pdf = pdfFactory.createDocument();
     pdf.open();

     DocumentFactory excelFactory = new ExcelDocFactory();
     Doc excel = excelFactory.createDocument();
     excel.open();
 }
}

