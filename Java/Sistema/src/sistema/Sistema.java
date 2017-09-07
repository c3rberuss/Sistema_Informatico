/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author josuee
 */
public class Sistema {

    public static servicios.Conexion getCon() {
        return con;
    }

    /**
     * @param args the command line arguments
     */
    
    private static servicios.Conexion con;
    
    public static void main(String[] args){
        
        try {
            
            con = new servicios.Conexion();
            
            servicios.Utilidades uti = new servicios.Utilidades();
            
            if(uti.GenerateConfig()){
                System.out.println("Se creó el archivo de configuracion correctamente");
            }
            
            if(uti.isInicialized()){
                System.out.println("Se inició correctamente");
            }
            
            vistas.Principal vent = new vistas.Principal();
            vent.setVisible(true);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
