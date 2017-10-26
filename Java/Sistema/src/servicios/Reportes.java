/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import sistema.Sistema;


/**
 *
 * @author josuee
 */
public class Reportes {
    
    public Reportes(){
    }
    
    private File pdf;
    
    public void factura(String nfactura, String cliente, String nit, String direccion) throws IOException{
        
        try {
            
            HashMap parametro = new HashMap();
            parametro.put("n_factura", nfactura);
            parametro.put("nit", nit);
            parametro.put("name_cliente", cliente);
            parametro.put("fecha", getDate());
            parametro.put("direccion", direccion);
            parametro.put("rutaimg", this.getClass().getClassLoader().getResourceAsStream("Recursos/imagenes/icono2.png"));
            
            generarReporte(getClass().getResource("/reportes/Plantillas/factura.jasper"), parametro, 
                    "factura"+Sistema.getnFactura(), false, "factura");
            
            Impresion.imprimir(Sistema.getRootPath()+Sistema.getCarpFact()+"factura"+Sistema.getnFactura()+".pdf");
            
            Sistema.getMostrarMensaje().mensaje("exito", 
                        "Imprimiendo la factura, por favor espere un momento.",
                        "Impresión");
            
        } catch (HeadlessException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("...errores");
        }
        
    }
    
    private void generarReporte(URL plantilla, HashMap parametros, String nombre, boolean mostrar, String tipo){
        try {
            JasperReport reporte = (JasperReport)JRLoader.loadObject(plantilla);
            
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, Sistema.getFactory().connect().getConexion());
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            
            switch(tipo.toLowerCase()){
                case "reporte":
                    exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(Sistema.getRootPath()+
                            Sistema.getCarpRepor()+nombre+".pdf"));
                    break;
                case "factura":
                    exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(Sistema.getRootPath()+
                            Sistema.getCarpFact()+nombre+".pdf"));
                    break;
           }
            
            exporter.exportReport();
            
            if(mostrar){
                try {
                    setPdf(Sistema.getFactory().createFile(Sistema.getRootPath()+Sistema.getCarpRepor()+nombre+".pdf"));
                    Desktop.getDesktop().open(getPdf());
                } catch (IOException ex) {
                    Sistema.getMostrarMensaje().mensaje("error", 
                        "Ha ocurrido un error al tratar de Mostrar el Reporte.",
                        "Reporte");
                }
            }
            
            System.out.println("Reporte Generado");
            
        } catch (JRException e) {
            System.out.println(e.getMessage());
            Sistema.getMostrarMensaje().mensaje("error", 
                        "Ha ocurrido un error al generar el Reporte.",
                        "Reporte");
        }
    }

    
    public void reporteInventario(){
        generarReporte(this.getClass().getClassLoader().getResource("reportes/Plantillas/InventarioDetallado.jasper"),
                null,"reporteInventario", true, "reporte");    
        
    }
    
    public void listaUsuarios(){
        generarReporte(this.getClass().getClassLoader().getResource("reportes/Plantillas/ListadoUsuarios.jasper"),
                null,"ListadoUsuarios", true, "reporte");  
    }
    
    public void reporteVentas(){
        generarReporte(this.getClass().getClassLoader().getResource("reportes/Plantillas/ReporteDeVentas.jasper"),
                null,"ReporteDeVentas", true, "reporte");  
    }
    
    public static String getDate(){
       
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        return String.valueOf(dia)+"-"+String.valueOf(mes+1)+"-"+String.valueOf(anio);
    }

    private File getPdf() {
        return pdf;
    }

    private void setPdf(File pdf) {
        this.pdf = pdf;
    }
    
}
