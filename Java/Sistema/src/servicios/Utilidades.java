/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josuee
 */
public class Utilidades {
    
    
    
    public boolean isInicialized(){
        
        boolean success = false;
        vistas.Config vent_config;
        Conexion conexion;
        Statement s;
        String sql;
        
        try {

            Configuracion config = new Configuracion();
            
            boolean init = Boolean.valueOf(config.getConfProperty("data.init"));
        
            if(init == false){
                
                 String[] botones = { "Servidor Local", "Servidor Online","Cancelar"};
                 int resp = JOptionPane.showOptionDialog(null,"¿Qué tipo de Servidor usará?", 
                    "Confguracion Inicial", JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                
                if(resp == 0){
                     config.setConfProperty("data.local", "true");
                }else{
                      config.setConfProperty("data.local", "false");
                }
                 
                switch(resp){
                    case 0:
                        
                        vent_config = new vistas.Config(null, true);
                        vent_config.setLocationRelativeTo(null);
                        vent_config.setVisible(true);

                        conexion = new Conexion();
                        sql = "CREATE DATABASE Sistema_DB;";
                        s = conexion.getConexion().createStatement();
                        s.executeUpdate(sql);
                        sql = "USE Sistema_DB;";
                        s.executeUpdate(sql);

                        sql=    "CREATE TABLE `Sistema_DB`.`users` ( "
                                + "`id_usr` INT(10) NOT NULL AUTO_INCREMENT , "
                                + "`nick_usr` VARCHAR(50) NOT NULL , `pwd_usr` "
                                + "VARCHAR(16) NOT NULL , `type_usr` VARCHAR(10) "
                                + "NOT NULL , `first_name_usr` VARCHAR(20) "
                                + "NOT NULL , `second_name_usr` VARCHAR(20) NOT NULL , "
                                + "`first_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "`second_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "PRIMARY KEY (`id_usr`)) ENGINE = InnoDB;";

                        s.executeUpdate(sql);
                        config.setConfProperty("data.db", "Sistema_DB");
                        config.setConfProperty("data.init", "true");
                        success = true;
                        conexion.closeConexion();
                        
                        break;
                    case 1:
                        
                        vent_config = new vistas.Config(null, true);
                        vent_config.setLocationRelativeTo(null);
                        vent_config.setVisible(true);
                        
                        String db = config.getConfProperty("data.db");
                        
                        conexion = new Conexion();
                        sql = "USE "+db+";";
                        s = conexion.getConexion().createStatement();
                        s.executeUpdate(sql);

                        sql=    "CREATE TABLE `"+db+"`.`users` ( "
                                + "`id_usr` INT(10) NOT NULL AUTO_INCREMENT , "
                                + "`nick_usr` VARCHAR(50) NOT NULL , `pwd_usr` "
                                + "VARCHAR(16) NOT NULL , `type_usr` VARCHAR(10) "
                                + "NOT NULL , `first_name_usr` VARCHAR(20) "
                                + "NOT NULL , `second_name_usr` VARCHAR(20) NOT NULL , "
                                + "`first_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "`second_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "PRIMARY KEY (`id_usr`)) ENGINE = InnoDB;";

                        s.executeUpdate(sql);
                        config.setConfProperty("data.init", "true");
                        success = true;
                        conexion.closeConexion();
                        break;
                        
                    case 2:
                        System.exit(1);
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "El sistema se configuró  correctamente");
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return success;
    }
    
    public boolean GenerateConfig(){
        
        boolean success = false;
            try{
                String ruta;
                String osName = System.getProperty("os.name").toLowerCase();

                if(osName.equals("linux")){
                    ruta = "/home/"+System.getProperty("user.name")+"/config.properties";
                }else{
                    ruta = "C:\\Users\\"+System.getProperty("user.name").toLowerCase()+"\\config.properties";
                }

                File archivo = new File(ruta);
                BufferedWriter bw;
                if(!archivo.exists()) {

                    bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write("sesion.pass=none\n" +
                            "data.pass=none\n" +
                            "data.init=false\n" +
                            "data.db=information_schema\n" +
                            "user.type=none\n" +
                            "sesion.user=none\n" +
                            "data.local=true\n" +
                            "sesion.active=false\n" +
                            "data.server=localhost\n" +
                            "data.user=root\n" +
                            "user.name=none\n" +
                            "config.path="+ruta);
                    bw.close();
                    success = true;

            } 
            }catch (IOException ex) {
                Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }

            return success;
    }
    
}
