/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sistema.Sistema;

/**
 *
 * @author josuee
 */
public class Reportes {
    
    public void factura(String nfactura, String cliente, String nit, String fecha, String direccion){
        
        
        try {
            JasperReport factura = (JasperReport)JRLoader.loadObject(getClass().getResource("/reportes/Plantillas/factura.jasper"));
            
           Map parametro = new HashMap();
           parametro.put("n_factura", nfactura);
           parametro.put("nit", nit);
           parametro.put("name_cliente", cliente);
           parametro.put("fecha", fecha);
           parametro.put("direccion", direccion);
            JasperPrint print = JasperFillManager.fillReport(factura, parametro, Sistema.getFactory().connect().getConexion());
           
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
            exporter.exportReport();
            System.out.println("Ya está guardado");
            
            JasperViewer viewer = new JasperViewer(print);
            viewer.setTitle("Factura");
            viewer.setVisible(true);
            System.out.println("Ya está listo para ver");
            
        } catch (JRException e) {
            System.out.println(e.getMessage());
            System.out.println("...errores");
        }
        
    }
    
}
