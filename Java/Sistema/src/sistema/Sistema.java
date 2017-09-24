/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import factory.Factory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios.Configuracion;


/**
 *
 * @author josuee
 */
public class Sistema {


    /**
     * @param args the command line arguments
     */
    
    private static servicios.Conexion con = null;
    private static Factory factory;
    private static String rootPath;
    
    public static void main(String[] args){
        
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

            
            servicios.Utilidades uti = new servicios.Utilidades();
            
            if(uti.GenerateConfig()){
                System.out.println("Se creó el archivo de configuracion correctamente");
            }
            
            con = new servicios.Conexion();
            
            if(uti.isInicialized(con)){
                System.out.println("Se inició correctamente");
            }
            
            
            vistas.Principal vent = new vistas.Principal();
            vent.setVisible(true);
            
            
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
