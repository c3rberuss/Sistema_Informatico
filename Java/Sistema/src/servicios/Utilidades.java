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
import javax.swing.table.DefaultTableModel;
import sistema.Sistema;
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
    
    public boolean isInicialized(Conexion con) throws IOException, ClassNotFoundException, SQLException{
        
        boolean success = false;
        String sql;
        
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
                    
                    getConfiguracion().dbInit("local_database", con.getConexion());
                    
                    getConfiguracion().setConfProperty("data.db", "Sistema_DB");
                    getConfiguracion().setConfProperty("data.init", "true");
                    success = true;
                    
                    break;
                case 1:
                    
                    setVent_config(new vistas.Config(null, true));
                    getVent_config().setLocationRelativeTo(null);
                    getVent_config().setVisible(true);
                    
                    getConfiguracion().dbInit("remote_database", con.getConexion());
                    
                    getConfiguracion().setConfProperty("data.init", "true");
                    success = true;
                    break;
                    
                case 2:
                    System.exit(0);
                    break;
            }
            
            JOptionPane.showMessageDialog(null, "El sistema se configuró  correctamente");
            
        }
        
        if(Sistema.getCon().getConexion() != null){
            Sistema.getCon().closeConexion();
            Sistema.setCon(Sistema.getFactory().conexion());
        }
        
        return success;
    }
    
    public boolean GenerateConfig(){
        
        boolean success = false;
            try{
                String ruta;
                String osName = System.getProperty("os.name").toLowerCase();

                if(osName.equals("linux")){
                    ruta = Sistema.getRootPath()+"config.properties";
                }else{
                    ruta = Sistema.getRootPath()+"config.properties";
                }

                File archivo = factory.createFile(ruta);
                BufferedWriter bw;
                if(!archivo.exists()) {

                    bw = factory.bufferWriter(archivo);
                    bw.write("data.pass=none\n" +
                            "data.init=false\n" +
                            "data.db=information_schema\n" +
                            "user.type=none\n" +
                            "sesion.user=none\n" +
                            "data.local=true\n" +
                            "sesion.active=false\n" +
                            "data.server=localhost\n" +
                            "data.user=root\n" +
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
    
    public static String generateId(){
        return String.valueOf((java.util.UUID.randomUUID().getLeastSignificantBits()*-1)/10000).substring(0, 10);
    }
    
}
