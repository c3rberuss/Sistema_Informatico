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
import vistas.Login1;
import vistas.Principal;


/**
 *
 * @author josuee
 */
public class Sistema {

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
    
    public static void main(String[] args) throws IOException{
        
        String os = Configuracion.osName().toLowerCase();
        String osUser = Configuracion.osUser();
                   
        
        
        try {
            
            switch(os){
                case "linux":
                        setRootPath("/home/"+osUser+"/");
                    break;
                case "windows":
                        setRootPath("C:\\Users\\"+osUser+"\\");
                    break;
            }
            
            
            factory = new Factory();

            conf = factory.configuraciones();
            servicios.Utilidades uti = new servicios.Utilidades();
            
            
            if(uti.GenerateConfig()){
                System.out.println("Se creó el archivo de configuracion correctamente");
            }
            
            con = new servicios.Conexion();
            if(uti.isInicialized(con)){
                System.out.println("Se inició correctamente");
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
