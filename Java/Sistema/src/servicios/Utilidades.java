/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import factory.Factory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vistas.Busqueda;
import vistas.Config;

/**
 *
 * @author josuee
 */
public final class Utilidades {
    
    private final Factory factory;
    private Config vent_config;
    private Conexion conexion;
    private Statement s;
    private Configuracion configuracion;
    
    public Utilidades(){
        factory = new Factory();
        setConexion(factory.connect());
        setVent_config(factory.ventanaConfiguracion(null, true));
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
    
    public Config getVent_config() {
        return vent_config;
    }

    public void setVent_config(Config vent_config) {
        this.vent_config = vent_config;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }
    
    public boolean isInicialized(){
        
        boolean success = false;
        String sql;
        
        try {

            setConfiguracion(factory.configuraciones());
            
            boolean init = Boolean.valueOf(getConfiguracion().getConfProperty("data.init"));
        
            if(init == false){
                
                 String[] botones = { "Servidor Local", "Servidor Online","Cancelar"};
                 int resp = JOptionPane.showOptionDialog(null,"¿Qué tipo de Servidor usará?", 
                    "Confguracion Inicial", JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                
                if(resp == 0){
                     getConfiguracion().setConfProperty("data.local", "true");
                }else{
                     getConfiguracion().setConfProperty("data.local", "false");
                }
                 
                switch(resp){
                    case 0:
                        
                        setVent_config(factory.ventanaConfiguracion(null, true));
                        getVent_config().setLocationRelativeTo(null);
                        getVent_config().setVisible(true);

                        sql = "CREATE DATABASE Sistema_DB;";
                        setS(getConexion().getConexion().createStatement());
                        getS().executeUpdate(sql);
                        sql = "USE Sistema_DB;";
                        getS().executeUpdate(sql);

                        sql=    "CREATE TABLE `Sistema_DB`.`users` ( "
                                + "`id_usr` INT(10) NOT NULL AUTO_INCREMENT , "
                                + "`nick_usr` VARCHAR(50) NOT NULL , `pwd_usr` "
                                + "VARCHAR(16) NOT NULL , `type_usr` VARCHAR(10) "
                                + "NOT NULL , `first_name_usr` VARCHAR(20) "
                                + "NOT NULL , `second_name_usr` VARCHAR(20) NOT NULL , "
                                + "`first_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "`second_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "PRIMARY KEY (`id_usr`)) ENGINE = InnoDB;";

                        getS().executeUpdate(sql);
                        getConfiguracion().setConfProperty("data.db", "Sistema_DB");
                        getConfiguracion().setConfProperty("data.init", "true");
                        success = true;
                        getConexion().closeConexion();
                        
                        break;
                    case 1:
                        
                        setVent_config(new vistas.Config(null, true));
                        getVent_config().setLocationRelativeTo(null);
                        getVent_config().setVisible(true);
                        
                        String db = getConfiguracion().getConfProperty("data.db");
                        
                        sql = "USE "+db+";";
                        setS(getConexion().getConexion().createStatement());
                        getS().executeUpdate(sql);

                        sql=    "CREATE TABLE `"+db+"`.`users` ( "
                                + "`id_usr` INT(10) NOT NULL AUTO_INCREMENT , "
                                + "`nick_usr` VARCHAR(50) NOT NULL , `pwd_usr` "
                                + "VARCHAR(16) NOT NULL , `type_usr` VARCHAR(10) "
                                + "NOT NULL , `first_name_usr` VARCHAR(20) "
                                + "NOT NULL , `second_name_usr` VARCHAR(20) NOT NULL , "
                                + "`first_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "`second_last_name_usr` VARCHAR(20) NOT NULL , "
                                + "PRIMARY KEY (`id_usr`)) ENGINE = InnoDB;";

                        getS().executeUpdate(sql);
                        getConfiguracion().setConfProperty("data.init", "true");
                        success = true;
                        break;
                        
                    case 2:
                        System.exit(0);
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "El sistema se configuró  correctamente");
                
            }
            
        } catch (SQLException ex) {
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

                File archivo = factory.createFile(ruta);
                BufferedWriter bw;
                if(!archivo.exists()) {

                    bw = factory.bufferWriter(archivo);
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
    
    public DefaultTableModel removeRow(JTable modelo){
        DefaultTableModel model = (DefaultTableModel)modelo.getModel();
        int[] rows = modelo.getSelectedRows();
        
        for(int i = 0; i<rows.length; i++){
            model.removeRow(rows[i]-i);
        }
        
        return model;
    }
    
    public DefaultTableModel mostrar(JTable Resultados, Conexion cn){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        try {
            
            int a =modelo.getRowCount();
            for(int i=0; i<a; i++){
                modelo.removeRow(0);
            }
            
            ResultSet rs = cn.Select("*", "inventario", "1");
            modelo.setColumnIdentifiers(new Object[]{"ID",  "PRODUCTO", "DESCRIPCIÓN"});

            while(rs.next()){
                modelo.addRow(new Object[]{rs.getString("id"), rs.getString("producto"), rs.getString("descripcion")});
            }
            
            Resultados.setModel(modelo);
            Resultados.updateUI();
            
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
        
    }
    
    public String generateId(){
        return String.valueOf((java.util.UUID.randomUUID().getLeastSignificantBits()*-1)/10000).substring(0, 10);
    }
    
    public String getDate(){
       
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        return String.valueOf(dia)+"-"+String.valueOf(mes)+"-"+String.valueOf(año);
    }

}
