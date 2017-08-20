/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;


/**
 *
 * @author josuee
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     
     servicios.Utilidades uti = new servicios.Utilidades();
     
     if(uti.GenerateConfig()){
        System.out.println("Se creó el archivo de configuracion correctamente"); 
     }
     
     if(uti.isInicialized()){
         System.out.println("Se inició correctamente");
     }   
        
     vistas.Principal vent = new vistas.Principal();
     vent.setVisible(true);
        
    }
    
}
