/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import factory.Factory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios.Configuracion;
import static servicios.Configuracion.setConfigFilePath;
import vistas.Login1;
import vistas.MensajePlantilla;
import vistas.Principal;


/**
 *
 * @author josuee
 */
public class Sistema {

    /**
     * @return the mostrarMensaje
     */
    public static MensajePlantilla getMostrarMensaje() {
        return mostrarMensaje;
    }

    /**
     * @param aMostrarMensaje the mostrarMensaje to set
     */
    public static void setMostrarMensaje(MensajePlantilla aMostrarMensaje) {
        mostrarMensaje = aMostrarMensaje;
    }

    private static Configuracion getConf() {
        return conf;
    }

    private  static void setConf(Configuracion conf) {
        Sistema.conf = conf;
    }


    /**
     * @param args the command line arguments
     */
    
    private static servicios.Conexion con = null;
    private static Factory factory;
    private static String rootPath;
    private static Configuracion conf;
    private static MensajePlantilla mostrarMensaje;
    
    public static void main(String[] args) throws IOException{
        
        try {
            
       
            
            setRootPath(System.getProperty("user.home")+System.getProperty("file.separator"));  
           
             String osName = System.getProperty("os.name").toLowerCase();


            if(osName.equals("linux")){
                setConfigFilePath(Sistema.getRootPath()+"config.properties");
            }else if(osName.equals("windows")){
                String ruta = Sistema.getRootPath()+"config.properties";
                String separador = System.getProperty("file.separator")+ System.getProperty("file.separator");
                ruta = ruta.replaceAll(System.getProperty("file.separator"), separador);
                Sistema.setRootPath(ruta);
            }
            
            
            factory = new Factory();
            setMostrarMensaje(factory.mostrarMensaje(null, true));
            conf = factory.configuraciones();
            servicios.Utilidades uti = factory.herramientas();
            
            
            if(uti.GenerateConfig()){
                getMostrarMensaje().mensaje("exito", 
                        "Se creó el archivo de configuracion Exitosamente", 
                        "configuracion inicial");
            }
            
            try{
                con = new servicios.Conexion();  
            }catch(Exception ex){
                getMostrarMensaje().mensaje("error", 
                        "Ha ocurrido un error al intentar conectarse al servidor. "
                                + "Por favor, revise los datos de Conexion.", 
                        "configuracion inicial");
            }
            
            if(uti.isInicialized(con)){
               Sistema.getMostrarMensaje().mensaje("exito", 
                        "El sistema se ha configurado exitosamente :)", 
                        "Configuracion finalizada");
            }
            
            boolean sesionActive = Boolean.valueOf(conf.getConfProperty("sesion.active"));

            if(sesionActive == false){
                Login1 log = new Login1();
                log.setLocationRelativeTo(null);
                log.setVisible(true);
            }else{
                Principal prin = factory.ventanaPrincipal(null, false);
                prin.setVisible(true);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        /**
     * @return the rootPath
     */
    public static String getRootPath() {
        return rootPath;
    }

    /**
     * @param aRootPath the rootPath to set
     */
    public static void setRootPath(String aRootPath) {
        rootPath = aRootPath;
    }

    /**
     * @return the factory
     */
    public static Factory getFactory() {
        return factory;
    }

    public static servicios.Conexion getCon() {
        return con;
    }
    
    public static void setCon(servicios.Conexion conn) {
        con = conn;
    }

    
}
