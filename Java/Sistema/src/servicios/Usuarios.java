/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistema.Sistema;

/**
 *
 * @author josuee
 */
public class Usuarios {
    
    private PreparedStatement statement;
    private ResultSet result;
    private String sql;
    private static Configuracion conf;
    
    public Usuarios(){
        conf = Sistema.getFactory().configuraciones();
    }
    
    public boolean login(String user, String pass) throws SQLException{
        
        boolean success = false;
        setSql("CALL login(?, ?);");
        
        setStatement(Sistema.getCon().getConexion().prepareStatement(getSql()));
        getStatement().setString(1, user);
        getStatement().setString(2, pass);
        
        setResult(getStatement().executeQuery());
        
        getResult().first();
        success = getResult().getBoolean(1);
        
        if(success){
            setSql("CALL get_user_type(?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(getSql()));
            getStatement().setString(1, user);
            
            setResult(getStatement().executeQuery());
            getResult().first();
            conf.setConfProperty("user.type", getResult().getString(1));
            if(Sistema.getCon().getConexion() != null){
            Sistema.getCon().closeConexion();
        }
        try {
            Sistema.setCon(Sistema.getFactory().conexion());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        return success;
    }
    
    public DefaultTableModel addTable(JTable tabla, String[] datos){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        
        Object [] fila=new Object[4];
        
        for(int i = 0; i<4; i++){
          fila[i]=datos[i];  
        }
        
        modelo.addRow(fila);

        return modelo;
    }
    
    public void addUsers(String[] datos){
        try {
            setSql( "CALL add_user(?, ?, ?, ?);");
            
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, datos[0]);
            getStatement().setString(2, datos[1]);
            getStatement().setString(3, datos[2]);
            getStatement().setString(4, datos[3]);
            getStatement().executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String[] searchUsers(String id){
        
        String[] datos = new String[4];
        
        try {
            setSql("CALL search_user(?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, id);            
            setResult(getStatement().executeQuery());
            
            if(getResult().first()){
                getResult().beforeFirst();
                while(getResult().next()){
                    datos[0] = getResult().getString(1);
                    datos[1] = getResult().getString(2);
                    datos[2] = getResult().getString(3);
                    datos[3] = getResult().getString(4);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró ninguna coincidencia");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos; 
    }
    
    public void updateUsers(String[] datos){
        try {
            setSql("CALL update_user(?, ?, ?);");
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, datos[0]);
            getStatement().setString(2, datos[1]);
            getStatement().setString(3, datos[2]);
            getStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteUsers(String id){
        try {
            setSql("CALL delete_user(?)");
            setStatement(Sistema.getCon().getConexion().prepareStatement(sql));
            getStatement().setString(1, id);
            getStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String nick(){
        conf = Sistema.getFactory().configuraciones();
        return conf.getConfProperty("sesion.user");
    }
    
    public static String userType(){
        conf = Sistema.getFactory().configuraciones();
        return conf.getConfProperty("user.type");
    }
    
    public String generateId(){
        return String.valueOf((java.util.UUID.randomUUID().getLeastSignificantBits()*-1)/10000).substring(0, 5);
    }
    
    public PreparedStatement getStatement() {
        return statement;
    }

    public void setStatement(PreparedStatement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }


    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
}
