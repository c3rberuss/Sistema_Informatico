
package servicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

/**
 *
 * @author josuee
 */
public class Impresion {
    
    public static void imprimir(String archivo) throws FileNotFoundException, IOException{
             DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
           
        try (FileInputStream fis = new FileInputStream(archivo)) {
            Doc document = new SimpleDoc(fis,flavor, null);
            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
            aset.add(MediaSizeName.ISO_A4);
            PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
            
            Doc pdfDoc = new SimpleDoc(fis,flavor, null);
            
            if (defaultPrintService != null) {
                DocPrintJob printJob = defaultPrintService.createPrintJob();
                try {
                    printJob.print(document, aset);
                    
                } catch (PrintException e) {
                }
            } else {
                System.err.println("No existen impresoras instaladas");
            }
        }
    }
    
}
