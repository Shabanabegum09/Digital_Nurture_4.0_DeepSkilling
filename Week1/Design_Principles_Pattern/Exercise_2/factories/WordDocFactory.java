package design_principle;

//WordDocumentFactory.java
public class WordDocFactory extends DocumentFactory {
 @Override
 public Doc createDocument() {
     return new WordDocument();
 }
}

