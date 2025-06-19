package design_principle;

//ExcelDocumentFactory.java
public class ExcelDocFactory extends DocumentFactory {
 @Override
 public Doc createDocument() {
     return new ExcelDocument();
 }
}
